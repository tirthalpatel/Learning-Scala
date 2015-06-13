package com.tirthal.learning.java2scala.scalaway.inheritance

// Test class instance for scala traits demo --- fundamentally scala trait is alike java interface

// Here App is inbuilt trait in Scala, which can be used to quickly turn objects into executable programs i.e. main() is not required
object TraitSample extends App {
  
  //def main(args: Array[String]) {
    
    val fb = new FooBarImpl();
    fb.foo();
    fb.bar();
    
    val counter = new CounterImpl()
    println("Before incrementing: " + counter.count)
    counter.increment
    counter.increment
    println("After incrementing: " + counter.count)
    
  //}
}

// In Scala - declare using trait instead of interface

trait Foo {
  def foo()
}

trait Bar {
  def bar()
}

// In Scala - use "extends" for implementing first trait (or super class) and "with" for implementing additional traits

class FooBarImpl extends Foo with Bar {
  // Here "override" declaration is optional when overriding abstract method, so you may remove it
  override def foo() = println("I am foo")
  override def bar() = println("I am bar")
}

// In Scala - Traits can have fields having state (Similar is not in Java interface)

trait Counter {
  var count = 0 // count field's default value is 0, which can be reused by sub-type class
  protected var incrementBy: Int // this is abstract field - sub-type is forced to provide state and protected ensures visibility to sub-class only
  def increment()
}

class CounterImpl extends Counter {
  var incrementBy: Int = 2
  override def increment(): Unit = count += incrementBy // Unit indicates void return type
}