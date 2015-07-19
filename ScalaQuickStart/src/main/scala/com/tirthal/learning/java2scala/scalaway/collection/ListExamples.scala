package com.tirthal.learning.java2scala.scalaway.collection

import scala.collection.mutable.LinkedList 
import scala.collection.JavaConversions._
import java.util.ArrayList

// Important Point - Scala has both immutable and mutable versions of its collections, but immutable version are the default (always available to every Scala source file without import)

// Syntax of List in Scala
object ListExamples {

  def main(args: Array[String]) {

    var list = List(1, 2, 3) // a var - mutable reference of a list
    list = list :+ 4 // :+ returns a new immutable List instance, with additional element appended
    println(list)

    val linklist = LinkedList(1, 2, 3) // a val - immutable reference of a linkedlist
    linklist.append(LinkedList(4)) // content can be changed by calling append()
    println(linklist)
    
  }
}