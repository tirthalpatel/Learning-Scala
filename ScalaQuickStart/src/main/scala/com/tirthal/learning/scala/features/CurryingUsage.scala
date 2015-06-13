package com.tirthal.learning.scala.features

// What is currying in Scala? (source: http://www.codecommit.com/blog/scala/function-currying-in-scala)
// Currying = The process of turning a function of two or more arguments into a series of functions, each taking a single argument
// Regular function --- f(a, b) = a + b --- can be called as f(1, 2)
// Curried function --- f(a) -> f'(b) -> a + b  --- can be called as f(1)(2)

object CurryingUsage extends App {
 
    // Syntax - regular vs. curried function
  
    // Regular function syntax
    def add(x: Int, y: Int): Int = x + y
    println { add(1, 2) }
    // Curried version of function
    def addCurried(x: Int)(y: Int): Int = x + y // another syntax of curried function ---> def addCurried(x:Int) = (y:Int) => x + y
    println { addCurried(1)(2) } // This is syntax to call curried version of function
    
    // --- Example of high-order curried version of function for defining general and specialized functions
    
    // This is high-order function, because it takes other function as arguments i.e. filter function as first parameter that takes generic A type as an argument and returns boolean as a result
    def process[A](filter: A => Boolean)(list: List[A]): List[A] = {
      lazy val recurse = process(filter) _
     
      // :: is a method of List which adds an element at the beginning of this list
      // head is a method which selects the first element of this iterable collection
      // tail is a method which selects all elements except the first
      list match {  
        case head::tail => if (filter(head)) {
          head::recurse(tail)
        } else {
          recurse(tail)
        }
     
        case Nil => Nil
      }
    }
    
    // Some immutable variables
    val numbersAsc = 1::2::3::4::5::Nil
    val numbersDesc = 5::4::3::2::1::Nil
    
    val even = (a:Int) => a % 2 == 0 
    val odd = (a:Int) => a % 2 != 0       
        
    // Using curried function, we can apply curly brace rule when calling process        
    val evenNumbersAsc = process(even) { numbersAsc }   // using {} instead of () syntax looks better than - process(even)(numbersAsc)    
    println(evenNumbersAsc) // [2, 4]   
    val evenNumbersDesc = process(even) { numbersDesc }  
    println(evenNumbersDesc) // [4, 2]
    
    // In above problem is - the repeated invocation of process(even)
    
    // Improve it further using partially applied curried functions    
    val processOdds = process(odd) _   // Here _ indicates that curried function is partially applied - just tells the compiler to treat the suffixed value as a functional, rather than a method to be evaluated
    
    val oddNumbersAsc = processOdds { numbersAsc }   
    println(oddNumbersAsc) // [1, 3, 5]
    val oddNumbersDesc = processOdds { numbersDesc }  
    println(oddNumbersDesc) // [5, 3, 1]
}