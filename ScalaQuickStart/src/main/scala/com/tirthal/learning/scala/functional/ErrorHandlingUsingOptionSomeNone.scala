package com.tirthal.learning.scala.functional

// See it in action -> Option-Some-None for Functional error handling
// 'Some' and 'None' both are the children of 'Option' type
object ErrorHandlingUsingOptionSomeNone extends App {

  // Use the 'Option' type to return a value from a function that can be null
  // Wraps valid result types in using the 'Some' type and nulls using the 'None' type
  def convertToInt(numberStr: String): Option[Int] = {
    try {
      Some(Integer.parseInt(numberStr.trim))
    } catch {
      case _: NumberFormatException => None
    }
  }

  // Run it

  println(convertToInt("1"))
  println(convertToInt("Oops"))

  println(convertToInt("100").getOrElse(0))
  println(convertToInt("Oops").getOrElse(0))

  val bag = List("10", "20", "Ping", "30", "Pong")
  val numbers = bag.map(convertToInt)
  println(numbers)
  println(numbers.map(_.getOrElse(0)))
}
