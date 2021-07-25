package com.tirthal.learning.scala.functional

import scala.io.Source
import scala.util.{Failure, Success, Try}

// See it in action -> Try-Catch-Finally is imperative style of exception handling, and Try-Success-Failure is functional style
// Try[T] is an Algebraic Data Type, whose instances are Success[T] and Failure[T]
object ErrorHandlingUsingTrySuccessFailure extends App {

  // 'Try' type represents the computation that may succeed or fail
  // Wraps successful computation in 'Success' type and failed computation in a 'Failure' type
  private def getLinesFromTextFile(filename: String): Try[List[String]] = {
    //noinspection SourceNotClosed
    Try(Source.fromFile(filename).getLines.toList)
  }

  private val printLinesFromCsvFile = (filename: String) => {
    getLinesFromTextFile(filename) match {
      // How to act for Success vs. Failure? Expressive code...
      case Success(lines) => lines.foreach(println)
      case Failure(exception) => println(exception)
    }
  }

  private val validFileName = "src/main/resources/users.csv"
  private val invalidFileName = "src/main/resources/oops.csv"

  println("--------------------------------------------")
  println (s"Try return type for successful computation = ${getLinesFromTextFile(validFileName).getClass}")
  printLinesFromCsvFile(validFileName)
  println("--------------------------------------------")
  println (s"Try return type for failed computation = ${getLinesFromTextFile(invalidFileName).getClass}")
  printLinesFromCsvFile(invalidFileName)
  println("--------------------------------------------")
}
