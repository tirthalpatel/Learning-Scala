package com.tirthal.learning.java2scala.scalaway.classobj

// Scala way - say hello world and print date

// Java developers to be aware that ---> read next comments...

/*
 * Scala makes it very easy to interact with Java code.
 * Scala also provides default imports; in particular, scala._ is always imported into every .scala file.
 * All classes from the java.lang package are imported by default, while others need to be imported explicitly.
 * 
 * Unlike in Java, imports in Scala can appear anywhere in the code (not just at the top of the file).
 */
import java.util.{Date, Locale} // Multiple classes can be imported from the same package by enclosing them in curly braces.
import java.text.DateFormat
import java.text.DateFormat._ // when importing all the names of a package or class, one uses the underscore character (_) instead of the asterisk (*).

/*
 * Classes are public by default, so there’s no need for a public keyword.
 *  
 * object keyword in Scala = commonly known as a singleton object, that is a class with a single instance.
 * The object declaration above declares both a class called HelloWorld and an instance of that class, also called HelloWorld. This instance is created on demand, the first time it is used.
 */
object HelloWorld {

  /*
   * Why the main method is not declared as static here?
   * This is because static members (methods or fields) do not exist in Scala. Rather than defining static members, the Scala programmer declares these members in singleton objects.
   * 
   * Also no need to declare the return type of main() — it’s automatically Unit (Scala’s equivalent of void).
   * 
   * Unlike Java and Groovy, the type of the variable comes after the variable name, i.e. args: Array[String].
   * Square brackets are used by Scala to indicate a generic type, so the type of args is specified as Array[String] instead of String[].
   */
  def main(args: Array[String])
  {
    // No need to declare the type of hello as String, because the compiler just works it out.
    val hello = "Hello World!"
    // The call to println() doesn’t need to be qualified, because scala imports java.lang package by default
    println(hello)

    // Using Java APIs in Scala
    val now = new Date
    val df = getDateInstance(LONG, Locale.ENGLISH) // Import with (_) makes the static method getDateInstance and the static field LONG directly visible.

    println("Hello, world @ " + df.format(now)) // Java way of accessing format method
    println("Hello, world @ " + {df format now}) // Less verbose scala way - methods taking one argument can be used with an infix syntax

    // Calling custom foo method  
    println(foo)
    
    // In Scala syntax - dot(.) is optional to call function, i.e. "aBC".replace("a","A") = "aBC" replace("a","A")
    if("aBC".replace("a","A").equals("aBC" replace("a","A")))
      println("---\"aBC\".replace(\"a\",\"A\")--- is same as ---\"aBC\" replace(\"a\",\"A\")---")   
    
  }
  
  // Syntax for custom foo method
  // Return types of methods are type-inferred, but it needs the equals sign in the def clause that defines them to tell the compiler to type-infer.
  // If a method body is just a single statement (or expression), it doesn’t need braces around it.
  def foo() = "Foo"
}