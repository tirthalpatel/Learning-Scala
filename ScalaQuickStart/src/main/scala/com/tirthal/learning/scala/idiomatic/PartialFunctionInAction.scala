package com.tirthal.learning.scala.idiomatic

// See it in action -> What's partial function in Scala?
object PartialFunctionInAction extends App {

  /*
   * When a function is not able to produce a return for every single variable input data given to it,
   * then that function is termed as Partial function
   *
   * It can determine an output for a subset of some practicable inputs only, and can only be applied partially to the stated inputs
   *
   * It is a Trait, which needs two methods namely isDefinedAt and apply to be implemented
   */

  // ------- Getting started with creating plain-vanilla Partial Function

  val divide100By = new PartialFunction[Int, Int] {

    override def isDefinedAt(x: Int): Boolean = x != 0

    override def apply(v1: Int): Int = 100 / v1
  }

  // General usage patter of Partial Function
  val divide100ByIfNotZero = (x: Int) => if (divide100By.isDefinedAt(x)) divide100By(x)

  println(s"100/5 = ${divide100ByIfNotZero(5)}")
  println(s"100/0 doesn't throw ArithmeticException, rather = ${divide100ByIfNotZero(0)}") // Thanks to isDefinedAt method

  // ------- Partial Function using Case Statement

  val divide100ByUsingCase: PartialFunction[Int, Int] = {
    case x if x != 0 => 100 / x // Awesome, no need to override isDefinedAt and apply, when case statement is used
  }

  val divide100ByUsingCaseIfNotZero = (x: Int) => if (divide100ByUsingCase.isDefinedAt(x)) divide100ByUsingCase(x)

  println(s"100/5 = ${divide100ByUsingCaseIfNotZero(5)}")
  println(s"100/0 doesn't throw ArithmeticException, rather = ${divide100ByUsingCaseIfNotZero(0)}")

  // ------- Partial Function using orElse

  val winner: PartialFunction[Int, String] = {
    case x if x >= 0 => "You won!"
  }

  val loser: PartialFunction[Int, String] = {
    case x if x < 0 => "You lost!"
  }

  val gameResult = winner orElse loser

  println(gameResult(20))
  println(gameResult(0))
  println(gameResult(-20))
}
