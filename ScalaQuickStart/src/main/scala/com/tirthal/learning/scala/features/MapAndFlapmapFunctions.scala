package com.tirthal.learning.scala.features

import java.util.Calendar

// map and flatMap function usage and syntax in Scala

object MapAndFlapmapFunctions extends App {

  // function calculates an age for the provided birth year
  def age(birthYear: Int) = {
    Calendar.getInstance.get(Calendar.YEAR) - birthYear
  }
  
  // Let's say, we want to age for List of years
  val birthdays = List(1995, 1981, 1986, 2011)
  
  // map() - builds a new collection by applying a function to all elements of this list
  // below all three ways do the same thing
  println {
    birthdays.map(age) + " = " +  
    birthdays.map(year => Calendar.getInstance.get(Calendar.YEAR) - year) + " = " + 
    birthdays.map(Calendar.getInstance.get(Calendar.YEAR) - _)
  }
}