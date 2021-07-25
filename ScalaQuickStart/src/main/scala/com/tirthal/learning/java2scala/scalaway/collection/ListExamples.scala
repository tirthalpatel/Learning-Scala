package com.tirthal.learning.java2scala.scalaway.collection

import scala.collection.mutable.ListBuffer

// Important Point - Scala has both immutable and mutable versions of its collections, but immutable version are the default (always available to every Scala source file without import)

// Syntax of List in Scala
object ListExamples {

  def main(args: Array[String]) {

    var list = List(1, 2, 3) // a var - mutable reference of a scala.collection.immutable.List
    println(list.getClass)
    println(list.toString)
    list = list :+ 4 // :+ returns a new immutable List instance, with additional element appended
    println(list.toString)

    // A ListBuffer (mutable) is like an array buffer except that it uses a linked list internally instead of an array
    // If you plan to convert the buffer to a list once it is built up, use a list buffer instead of an array buffer
    val listBuffer = ListBuffer(1, 2, 3) // a val - immutable reference of a scala.collection.mutable.ListBuffer
    println(listBuffer.getClass)
    println(listBuffer.toString)
    listBuffer.addOne(4)  // content can be changed by adding element to existing list instance
    println(listBuffer.toString)
    listBuffer += 5;      // content can be changed by adding element to existing list instance
    println(listBuffer.toString)
    println(listBuffer.toList) // convert the buffer to a list

    // Head = First element of list & Tail = All elements of list excluding the First one
    println(listBuffer.head + " --- " + listBuffer.last + " --- " + listBuffer.tail)

    // How to iterate list using "Generator Based For Loop", i.e. For(element <- generator)?
    for(number <- listBuffer)
      print(s"$number ")
  }
}