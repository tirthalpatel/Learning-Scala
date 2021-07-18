package com.tirthal.learning.scala.idiomatic

import scala.util.Random

// See it in action -> val - lazy val - var - def
object ValLazyValVarDefInAction extends App {

  // ----------------------------------------------------------------------------------------------
  // The 'val' type modifier = immutable, and its value cannot be reassigned once it has been initialized
  // ----------------------------------------------------------------------------------------------
  val immutableData = {println("*** The immutableData # Array is initialized instantly"); Array(10, 20, 30)}
  // See that how above line printed before below line, which confirms that array initialized instantly.

  print("Before accessing immutableData first time -> ")
  immutableData.foreach(n => print(" " + n))
  println

  print("Before accessing immutableData second time -> ")
  immutableData.foreach(n => print(" " + n))
  println

  // Uncommenting below line (i.e. reassignment of value) is not permitted for immutable by compiler
  // immutableData = Array(10, 20, 30)

  // However, possible to modify values within the assigned array or collection data structure like set, map, etc.
  immutableData(0) = 30
  immutableData(2) = 10
  print("Before accessing modified values of the originally initialized array -> ")
  immutableData.foreach(n => print(" " + n))
  println

  // ----------------------------------------------------------------------------------------------
  // The 'lazy val' type modifier = immutable, but evaluated lazily i.e. it's evaluated the first time when it is referenced in the code
  // ----------------------------------------------------------------------------------------------
  println("===================================")

  lazy val immutableLazyData = {println("*** The immutableLazyData # Array is initialized lazily when it is actually accessed first time"); Array(10, 20, 30)}
  // See that how above line printed after below line, which confirms that array is initialized lazily when got accessed first time.

  println("Before accessing immutableLazyData first time -> ")
  immutableLazyData.foreach(n => print(" " + n))
  println

  print("Before accessing immutableLazyData second time -> ")
  immutableLazyData.foreach(n => print(" " + n))
  println

  // Uncommenting below line (i.e. reassignment of value) is not permitted for immutable by compiler
  // immutableLazyData = Array(10, 20, 30)

  // However, possible to modify values within the assigned array or collection data structure like set, map, etc.
  immutableLazyData(0) = 30
  immutableLazyData(2) = 10
  print("Before accessing modified values of the originally initialized array -> ")
  immutableLazyData.foreach(n => print(" " + n))
  println

  // ----------------------------------------------------------------------------------------------
  // The 'var' type modifier = mutable, so it's value can be reassigned after initialization
  // ----------------------------------------------------------------------------------------------
  println("===================================")

  var mutableData = {println("The mutableData # Array is initialized instantly"); Array(10, 20, 30)}
  // Change it from 'var' to 'val' and see how compiler complains when attempting to reassign it

  print("Before accessing mutableData first time -> ")
  mutableData.foreach(n => print(" " + n))
  println

  print("Before accessing mutableData second time -> ")
  mutableData.foreach(n => print(" " + n))
  println

  print("*** Before reassigning array with new values for mutableData and accessing it -> ")
  mutableData = Array(30, 20, 10) // This reassignment is permitted for 'var', but not for 'val'
  mutableData.foreach(n => print(" " + n))
  println

  // ----------------------------------------------------------------------------------------------
  // The 'def' keyword = used to define methods which are evaluated each time they are invoked
  // ----------------------------------------------------------------------------------------------
  println("===================================")

  def randomArraySupplier = {
    println("The randomArraySupplier method # Array is initialized lazily with random values each time the method is invoked")
    val r = Random
    Array(r.nextInt(50), r.nextInt(50), r.nextInt(50))
  }
  // See that how above line printed every time before it's invoked in below code.

  println("Before invoking randomArraySupplier first time -> ")
  randomArraySupplier.foreach(n => print(" " + n))
  println

  println("Before invoking randomArraySupplier second time -> ")
  randomArraySupplier.foreach(n => print(" " + n))
  println

  println("Before invoking randomArraySupplier third time -> ")
  randomArraySupplier.foreach(n => print(" " + n))
  println
}