package com.tirthal.learning.scala.functional

// Introduction of Functional Programming in Scala

object IntroToFunctional extends App {

  /* 
   * Crux of Functional Programming:
   * 
   * (1) Functions operate on values, as in procedural languages, but instead of altering their inputs, functions are seen as acting like mathematical functions and return new values.
   *     In short, functions are seen as little processing machines that take in values and output new values.
   *     
   * (2) First-class functions - the key concept of functional programming that functions should be values that can be put into variables.   
   *     This means that functions can be put into variables, passed to methods, and manipulated in the same ways as any other value.
   */

  /*
   * Scala supports functions as first-class values. This means that the language allows you to write functions in a way that can be put into
   * vars or vals and treated as any other value. These are called function literals (or anonymous functions).
   * 
   * The key piece of syntax is the arrow, =>, which Scala uses to express taking in the list of parameters and passing them to a block of code:
   * 
   * (<list of function parameters>) => { ... function body as a block ... }
   * 
   * For example,
   */
  
   // Function takes in value and return new value
   val doubler = (x : Int) => { 2 * x }  
   
   println("Double of 2 is: " + doubler(2))
   println("Double of 4 is: " + doubler(4))
   
   // Define a function literal - a function making function 
   val adder = (n : Int) => { (x : Int) => n + x } // a function literal that takes in a value and returns a new function as a value
   
   val plus2 = adder(2)
   println("2 + 5 = " + plus2(5))
   println("2 + 8 = " + plus2(8))
   
   val plus3 = adder(3)
   println("3 + 5 = " + plus3(5))
   println("3 + 8 = " + plus3(8))
   
   val plus5 = adder(5)
   println("5 + 5 = " + plus5(5))
   println("5 + 8 = " + plus5(8))
}