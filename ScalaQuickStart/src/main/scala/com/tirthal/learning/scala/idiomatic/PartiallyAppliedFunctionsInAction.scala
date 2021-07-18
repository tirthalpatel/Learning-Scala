package com.tirthal.learning.scala.idiomatic

// See it in action -> What's partially applied function in Scala?
object PartiallyAppliedFunctionsInAction extends App {

  private val countries = List("India", "USA", "Austria", "Germany", "Australia", "UK", "Afghanistan")

  // ------ Getting started with partially applied function syntax

  def isNameStartsWithA(name: String): Boolean = name.startsWith("A")

  var countryNamesStartingWithA = countries.filter(cn => isNameStartsWithA(cn))
  println(countryNamesStartingWithA)

  // See syntax difference within the filter i.e. "cn => isNameStartsWithA(cn)" vs."isNameStartsWithA _"

  /*
   * The Partially applied functions are the functions which are not applied on all the arguments defined by the stated function
   * i.e, while invoking a function, we can supply some of the arguments and the left arguments are supplied when required
   *
   * We use hyphen( _ ) as placeholder for the arguments which are not passed to function
   *
   * Ultimately, helpful in minimizing a function which accepts many arguments to a function that accepts only some arguments
   */

  countryNamesStartingWithA = countries.filter(isNameStartsWithA _)
  println(countryNamesStartingWithA)

  // ------ Partially applied function for the method with more than one parameters

  def isNameStarsAndEndsWith(name: String, s: String, e: String): Boolean = {
    name.startsWith(s) && name.endsWith(e)
  }

  // Partially applied function to supply all 3 input arguments later on
  val isNameStarsAndEndsWithFunction = isNameStarsAndEndsWith _

  var countryNamesWithLowerAndUpperStrMatch = countries.filter(isNameStarsAndEndsWithFunction(_, "A", "a"))
  println(countryNamesWithLowerAndUpperStrMatch)

  // Partially applied function to supply first input argument later on
  val isNameApplicableFunction = isNameStarsAndEndsWith(_: String, "A": String, "a": String)

  countryNamesWithLowerAndUpperStrMatch = countries.filter(isNameApplicableFunction)
  println(countryNamesWithLowerAndUpperStrMatch)
}
