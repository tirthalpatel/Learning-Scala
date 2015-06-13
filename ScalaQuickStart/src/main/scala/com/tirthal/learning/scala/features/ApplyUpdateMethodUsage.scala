package com.tirthal.learning.scala.features

/*
 * What is the use of "apply" method in Scala?
 *    - The apply method provides a short-hand way of calling a method on a class instance i.e. a way for faking function calls.
 *    - Syntax: instance(a) ---> internally calls ---> instance.apply(a)
 *    - Can use it for making APIs more expressive and factory style creation method
 *    
 * What is the use of "update" method in Scala?
 *    - The update method provides a short-hand way of class instance assignment operator 
 *    - Syntax: instance(a) = b ---> internally calls ---> instance.update(a, b)
 *    - Can use it to make class API to feel more like language syntax
 */
 
object ApplyUpdateMethodUsage {
  def main(args: Array[String]) {
    
    // ---> Scala Array has expressive syntax to access value using apply() and assign it using update()
    val quaters = Array("Q1", "Q2", "Q3", "Q4")
    
    // Syntax to call apply method of a class?
    println("First quater code: " + quaters.apply(0)) // access array value using Array's inbuilt apply()
    println("Second quater code: " + quaters(1))  // This is shorthand for quaters.apply(1) 
    
    // Syntax to call update method of a class?
    quaters.update(0, "q1")  // update array value using Array's inbuilt update()
    quaters(1) = "q2" // This is shorthand for quaters.update(1, "q2") 
    
    // ---> Example of how to make APIs more expressive using apply
    val multiply = new Multiplier()
    multiply(2, 3) // This is instance variable, still syntax looks like a function call - shorthand for multiply.apply(2, 3) syntax
    
    // ---> Example for offering factory style creation method using apply
    val b1 = Book(1, "The Well-Grounded Java Developer", "Benjamin J. Evans & Martijn Verburg")  // calls Book.apply(id: Int, name: String, author: String)
    println(b1)
    val b2 = Book(2, "Microsoft Application Architecture Guide - Patterns and Practices") // calls Book.apply(id: Int, name: String) 
    println(b2)
    
    // ---> Example for expressive API using apply and update in custom class
    val ptypes = new PaymentTypes()
    println(ptypes)
    println("Description on paypal:" + ptypes("paypal")) // calls PaymentTypes.apply(name: String)
    ptypes("paypal") = "Paypal Payment Gateway"          // calls PaymentTypes.update(name: String, description: String)
    println(ptypes)
  }
}

// ---> Custom class example of how to make APIs more expressive using apply
class Multiplier {
  def apply(n1: Int, n2: Int): Unit = {println(n1 * n2)}
}

// ---> Custom class example for offering factory style creation method using apply
class Book(id: Int, name: String, author: String) {  
  override def toString: String = { id + ":" + name + ":" + author} 
}

object Book { // Book's companion having multiple "apply" methods usage  
  def apply(id: Int, name: String, author: String) = new Book(id, name, author)
  def apply(id: Int, name: String) = new Book(id, name, "Author is unknown")  
}

// ---> Custom class example having apply and update methods 
class PaymentTypes {
  private val payTypes = scala.collection.mutable.Map(
    "cc"        -> "Credit Card",
    "paypal"    -> "Paypal",
    "cash"      -> "Cash")
  
  def apply(name: String) = {
    payTypes.get(name)
  }
    
  def update(name: String, description: String) {
    payTypes.update(name, description)  
  }
  
  override def toString = payTypes.toString()
}