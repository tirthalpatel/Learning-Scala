package com.tirthal.learning.java2scala.scalaway.classobj

// Scala way - basic syntax

// Java developers to be aware that ---> read next comments...

object Abc {

  def main(args: Array[String])
  {
    // In Scala, semicolons are pretty much optional.
    
    /*
     * Scala is a pure object-oriented language in the sense that everything is an object, including numbers or functions.
     * It differs from Java in that respect, since Java distinguishes primitive types (such as boolean and int) from reference types,
     * and does not enable one to manipulate functions as values (at least prior to Java 8).
     */

    // --- Scala has no primitive (e.g. int, boolean, etc.), rather everything is object
    // --- Type inference in Scala - automatically infers the type of variable based on value, and no need to explicitly tell the compiler
    val age = 34 // just declare any variable using "val" keyword
    val maxHeartRate = 210 - age * 0.5
    assert(maxHeartRate == 193.0)

    // Scala - Less code compare to java for adding two objects
    val total = BigDecimal(10) + BigDecimal(20)
    assert(total == 10+20)

    // --- Equality check in Scala (== vs. eq)
    val eq1 = new String("A") == new String("A")		// == - value comparison   (result = true)
    val eq2 = new String("A").eq(new String("A"))		// eq() - reference comparison (result = false)
	  assert(eq1 != eq2)
    
    // --- Scala's type-inferred local function
    /*
     * Define a method with the "def" keyword
     * 
     * Scala permits concept of the local function that isn't present in Java. This is a function that is defined (and is only in scope) within another function.
     * This can be a simple way to have a helper function that the developer doesn't want to expose to the outside world.
     * In Java there would be no recourse but to use a private method and have the function visible to other methods within the same class.
     * 
     * There is no explicit return type specified. The compiler can figure out that it returns Int by examining the return code of java.lang.String#length, which is int.
     */   
    def len(obj : AnyRef) = {
        obj.toString.length
    }
    
    assert(len("Tirthal") == 7)
  }
}