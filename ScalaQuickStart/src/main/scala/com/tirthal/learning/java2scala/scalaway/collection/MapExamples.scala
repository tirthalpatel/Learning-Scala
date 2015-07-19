package com.tirthal.learning.java2scala.scalaway.collection

import scala.collection.mutable.HashMap

// Syntax of Map in Scala
object MapExamples {

  def main(args: Array[String]) {

    // Scala provides the immutable Map class as its default and provides HashMap as the standard mutable form
    var x = Map(1 -> "India", 2 -> "USA")
    for ((key, vau) <- x) println(key + ": " + vau)
    x = x + (3 -> "Australia")
    
    val hm = HashMap(1 -> "India", 2 -> "USA")
    hm += (3 -> "Australia")
    println(hm)

  }
}