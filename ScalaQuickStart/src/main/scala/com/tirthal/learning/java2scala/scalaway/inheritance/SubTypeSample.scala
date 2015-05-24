package com.tirthal.learning.java2scala.scalaway.inheritance

//  Test class instance for sub-type inheritance demo - Dog class is inheriting behavior of Animal class and can have its own too.
object SubTypeSample {
  def main(args: Array[String]) {
	val d1 = new Dog(123)
	d1.sound()
  }
}

// Super class
class Animal(val id: Int) {
  // val keyword in primary constructor of Animal class = instructs scala compiler to create fields and public getter access methods (not creating setter methods).

  // generic method of super class
  def sound() = println("By default it is mute")
}

// Sub class
class Dog(id: Int) extends Animal(id) {

  // Own behavior
  private def bark() = println("Dog '" + id + "' is barking")

  // Overriding super class behavior
  // In Java - @Override is optional
  // In Scala - It is mandatory to declare method as "override", when you override concrete (non-abstract) method
  override def sound() = bark()
}