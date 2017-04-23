package com.tirthal.learning.java2scala.scalaway.classobj

/*
 * Just adding the single keyword "case" causes the Scala compiler to create these additional
 * methods like hashcode, equals, toString. It also creates a lot of additional scaffolding methods. 
 * Most of the time, these other methods aren't directly used by the developer.
 * Instead, they exist to provide runtime support for certain Scala features to enable the case class
 * to be used in a match expressions.
 */
case class TemperatureAlarm(temp: Double)

// How to use case class in Scala?
object TemperatureAlarmTest {
  def main(args: Array[String]) {

    // Case classes can be created without needing the new keyword
    val alarm = TemperatureAlarm(99.9)
    println(alarm.toString()) // compiler provided method
    println(alarm.hashCode()) // compiler provided method

    // Scala's constructor pattern matching works on "case" class only
    val msg = alarm match {        
      case TemperatureAlarm(temp) => "Tripped at temp " + temp
      case _ => "No match"
    }
    println(msg)
  }
}