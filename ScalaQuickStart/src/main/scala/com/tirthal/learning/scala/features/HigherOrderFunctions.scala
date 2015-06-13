package com.tirthal.learning.scala.features

// How scala allows you to write expressive code by faking language constructs using Curly Brace Rule and Higher-order Functions

object HigherOrderFunctions extends App {  

    // ---> (1) Curly Brace Rule in Scala for using {} instead of regular () 
    // In any method call, in which you pass in exactly one argument, you can use curly braces to surround that argument instead of parentheses
    val quarters = List("Q1", "Q2", "Q3", "Q4")
    
    quarters.foreach(println(_))  // Here foreach is a method having one argument
    // Above you can write as below using curly brace rule
    quarters.foreach {  // now this looks like language's inbuilt for loop construct, even if it is a method 
      println(_) 
    }
    
    // ---> (2) First-order function vs. Higher-order functions
    
    // --- Define First-order functions vs. Higher-order functions
   
    // First-order functions = functions take some types as parameters and return some type as a result.
    // Example of a first order function that takes two integer values and returns the value.  
    def sumOfSquares(a: Int, b: Int): Int = {
     a * a + b * b
    }
    
    def sumOfCubes(a: Int, b: Int): Int = {
     a * a * a + b * b * b
    }
    
    // Higher-order functions = functions that take other functions as parameters, or whose result is a function.
    // Now refactor above to use a higher-order function taking three parameters - a function that takes an Int and returns an Int, an Int named a, an Int named b 
    def sumOfTwoOperations(function: Int => Int, a: Int, b: Int): Int = {
     function(a) + function(b) // shorthand for this syntax - function.apply(a) + function.apply(b)
    }
    
    // --- Calling First-order functions vs. Higher-order functions
    
    // Calling "sumOfSquares" and "sumOfCubes" first-order functions
    println { sumOfSquares(2,3) }
    println { sumOfCubes(2,3) }
    
    // Calling "sumOfTwoOperations" higher-order function by passing a "squared" function as the first parameter
    def squared(x: Int): Int = x * x
    println { sumOfTwoOperations(squared, 2, 3) }
    
    // Calling "sumOfTwoOperations" higher-order function by passing a "squared" function as the first parameter
    def cubed(x: Int): Int = x * x * x
    println { sumOfTwoOperations(cubed, 2, 3) }
}