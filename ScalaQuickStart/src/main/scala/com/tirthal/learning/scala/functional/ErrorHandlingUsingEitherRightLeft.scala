package com.tirthal.learning.scala.functional

// See it in action -> Either-Right-Left for Functional error handling
// Exactly like Option-Some-None except that you can pass information about why a computation failed
object ErrorHandlingUsingEitherRightLeft extends App {

  // Use the 'Either' type to return either 'Right' (i.e. Int, if successful conversion) or 'Left' (i.e. String, if error) result type
  def convertToInt(numberStr: String): Either[String, Int] = {
    try {
      Right(Integer.parseInt(numberStr.trim))
    } catch {
      case _: NumberFormatException => Left("Encountered an error while parsing integer: " + numberStr)
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
