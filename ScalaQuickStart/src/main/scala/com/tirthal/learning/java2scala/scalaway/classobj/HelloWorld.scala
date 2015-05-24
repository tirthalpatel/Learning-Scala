package com.tirthal.learning.java2scala.scalaway.classobj

// Scala way - say hello world and print date

// Java developers to be aware that ---> read next comments...

/*
 * Scala makes it very easy to interact with Java code.
 * All classes from the java.lang package are imported by default, while others need to be imported explicitly.
 */
import java.util.{Date, Locale} // Multiple classes can be imported from the same package by enclosing them in curly braces.
import java.text.DateFormat
import java.text.DateFormat._ // when importing all the names of a package or class, one uses the underscore character (_) instead of the asterisk (*).

/*
 * object keyword in Scala = commonly known as a singleton object, that is a class with a single instance.
 * The object declaration above declares both a class called HelloWorld and an instance of that class, also called HelloWorld. This instance is created on demand, the first time it is used.
 */
object HelloWorld {

  /*
   * Why the main method is not declared as static here?
   * This is because static members (methods or fields) do not exist in Scala. Rather than defining static members, the Scala programmer declares these members in singleton objects.
   */
  def main(args: Array[String])
  {
    val now = new Date
    val df = getDateInstance(LONG, Locale.ENGLISH) // Import with (_) makes the static method getDateInstance and the static field LONG directly visible.

    println("Hello, world @ " + df.format(now)) // Java way of accessing format method
    println("Hello, world @ " + {df format now}) // Less verbose scala way - methods taking one argument can be used with an infix syntax

    // In Scala syntax - dot(.) is optional to call function, i.e. "aBC".replace("a","A") = "aBC" replace("a","A")
    if("aBC".replace("a","A").equals("aBC" replace("a","A")))
      println("---\"aBC\".replace(\"a\",\"A\")--- is same as ---\"aBC\" replace(\"a\",\"A\")---")
  }
}