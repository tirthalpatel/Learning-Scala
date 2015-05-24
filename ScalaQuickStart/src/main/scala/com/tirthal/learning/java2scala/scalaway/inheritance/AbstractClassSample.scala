package com.tirthal.learning.java2scala.scalaway.inheritance

// Test class for Abstract class demo in Scala
object AbstractClassSample {
  def main(args: Array[String]) {
    val cp = new ColorPrinter()
    cp.status
    cp.print
  }
}

// Abstract class
abstract class Printer { // abstract = cannot be instantiated
  // method without implementation indicates abstract method in Scala - sub-type class is forced to implement this
  def print: Unit
  // non-abstract method
  def status: Unit = println("Printer is running")
}

// Sub-type class
class ColorPrinter extends Printer {
  // override keyword is not required when implementing abstract method
  def print: Unit = println("Print in color") 
}