package com.tirthal.learning.scala.idiomatic

// See it in action -> Methods vs. Functions
// --------------------------------------------------------------------------------
// Methods = are not objects i.e. reusable code which is defined as part of a class (anonymous method is not allowed)
// A method has a name, signature and annotations, and bytecode
// --------------------------------------------------------------------------------
// Functions = are objects i.e. reusable code which is a complete standalone object (can be anonymous)
// A function is an instance of a class which implements traits and contains its own methods
// --------------------------------------------------------------------------------
object MethodsAndFunctionsInAction extends App {

  val colors = Array("Red", "Blue", "Black", "White", "Green")

  // ======> Method vs. Function - See the syntax difference of both

  // A method is defined using 'def' keyword
  def getColorsStaringWithBlAsMethod(): Array[String] = colors.filter(s => s.startsWith("Bl"))

  print("Invoking a method:")
  getColorsStaringWithBlAsMethod.foreach(s => print(" " + s)) // () is optional for a method with empty input

  // A function is assigned to a 'val' or 'var' type which is then used to invoke function
  val getColorsStaringWithBlAsFunction = () => colors.filter(s => s.startsWith("Bl"))
  val getColorsStaringWithBlAsFunctionUsingPlaceholder = () => colors.filter(_.startsWith("Bl")) // Here, see usage of "_" placeholder

  print("\nInvoking a function:")
  getColorsStaringWithBlAsFunction().foreach(s => print(" " + s)) // () is required for a function even with empty input
  getColorsStaringWithBlAsFunction.apply()

  // ======> Method vs. Function - See what is it under the hood?

  print("\nMethod=" + getColorsStaringWithBlAsMethod.getClass) // not object in itself, rather referencing a method invokes it and gives its return type
  print("\nFunction=" + getColorsStaringWithBlAsFunction.getClass) // is an reference of an object for anonymous function
  print("\nFunction's apply method actually invokes it and gives its return type=" + getColorsStaringWithBlAsFunction.apply().getClass)

  // ======> Method vs. Function - with input arguments syntax

  def existsColorMethod(color: String): Boolean = colors.contains(color)
  print("\nCalling existsColorMethod=" + existsColorMethod("Black"))

  val existsColorFunction = (color: String) => colors.contains(color)
  print("\nCalling existsColorFunction=" + existsColorMethod("Black"))

  // Can create a function object from a method using partially applied functions, but can't convert a function into a method
  val existsColorFunctionFromMethod = existsColorMethod _
  print("\nCalling existsColorFunctionFromMethod=" + existsColorFunctionFromMethod("Black"))

  // ======> Varargs in Scala methods

  println("\n")
  def toUpperCase(name1: String, name2: String, name3: String): String = {
    name1.toUpperCase + ", " + name2.toUpperCase + ", " + name3.toUpperCase
  }
  println(toUpperCase("Tirthal", "Ian", "Ishan"))

  def toUpperCaseUsingVarargs(names: String*): String = { // * = accepts variable arguments
    println(names.getClass)
    names.map(_.toUpperCase()).toVector.mkString(", ")
  }
  println(toUpperCaseUsingVarargs("Tirthal", "Ian", "Ishan"))
}
