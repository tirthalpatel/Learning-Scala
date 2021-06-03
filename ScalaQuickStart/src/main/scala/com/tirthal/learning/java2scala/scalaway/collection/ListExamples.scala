package com.tirthal.learning.java2scala.scalaway.collection

import scala.collection.mutable.ListBuffer

// Important Point - Scala has both immutable and mutable versions of its collections, but immutable version are the default (always available to every Scala source file without import)

// Syntax of List in Scala
object ListExamples {

  def main(args: Array[String]) {

    var list = List(1, 2, 3) // a var - mutable reference of a list
    println(list.toString)
    list = list :+ 4 // :+ returns a new immutable List instance, with additional element appended
    println(list.toString)

    // A ListBuffer is like an array buffer except that it uses a linked list internally instead of an array
    // If you plan to convert the buffer to a list once it is built up, use a list buffer instead of an array buffer
    val listBuffer = ListBuffer(1, 2, 3) // a val - immutable reference of a listBuffer
    println(listBuffer.toString)
    listBuffer.addOne(4)  // content can be changed by adding element to existing list instance
    println(listBuffer.toString)
    listBuffer += 5;      // content can be changed by adding element to existing list instance
    println(listBuffer.toString)
    println(listBuffer.toList) // convert the buffer to a list
  }
}