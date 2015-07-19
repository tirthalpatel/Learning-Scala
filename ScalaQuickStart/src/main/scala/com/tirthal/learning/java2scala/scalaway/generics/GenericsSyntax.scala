package com.tirthal.learning.java2scala.scalaway.generics

import com.tirthal.learning.java2scala.scalaway.classobj.Customer

// Syntax of Generics in Scala
object GenericsSyntax {
  
  def main(args: Array[String]) {
    
    // Generics = Parametric Polymorphism
    // Generics are mandatory for collection types (you can’t have the equivalent of a Java raw type)
    val stack = new ListStack[String]     // Square brackets are used by Scala to indicate a generic type. 
    stack.push("A3")
    stack.push("A2")
    stack.push("A1")
    val element: String = stack.pop
    println(element)
  }
  
  // Generic method
  def add[A](a: A) {
    // ...
  }
}

// Generic Stack Example in Scala

trait Stack[T] {      // Generic interface
  def push(t: T)
  def pop: T
}

class ListStack[T]() extends Stack[T] {  // Generic class
  private var elements: List[T] = List()  
  
  override def push(t: T): Unit = {      
    elements = t +: elements             // +: creates a copy of the list with an element prepended, because scala list is immutable
  }
  
  override def pop: T = {
    if(elements.isEmpty)
      throw new IndexOutOfBoundsException
    val head = elements.head    // head selects the first element of this list
    elements = elements.tail    // tail selects all elements except the first
    head
  }
}

// Bound Types Syntax

class BoundTypesSyntax { 
  
  //****** wildcards (using _) 
  
  //****** <: = Upper Bounds
  // [? <: T] - It will allow either T or subclasses of T, and T represents upper bound
  def ex1(list: List[_ <: Number]): Unit = {
    // Number is upper bound, so either "Number" or subclass of "Number" (e.g. Integer, Float) is acceptable
  }
  
  //****** :> = Lower Bounds 
  // [? :> T] - It will allow T and super classes of T, and T represents lower bound
  def ex2(list: List[_ >: Integer]) {
    // Integer is lower bound, so either "Integer" or super class of "Integer" (e.g. Number) is acceptable
  }
  
  //****** Unbounded wildcard = unknown generic type 
  // For example - list: List[_]
  
  //****** Scala cannot set multiple upper bounds rather can constrain by multiple traits
  // For example - def sort[A <: Lion with Comparable[Animal]](list: List[A]) = { ... }
  
  //****** Scala can set lower and upper bounds
  // For example - def foo(A >: Lion <: Animal](a: A) = { ... } = A must be a super type of Lion and sub type of Animal
}

