package com.tirthal.learning.java2scala.scalaway.controlstruct

import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.io.IOException

// Syntax of exception handling control structures in Scala
object ExceptionSyntax {
  def main(args: Array[String]) {
    
    // All Exceptions in Scala are RuntimeException, because Scala converts checked Exception into RuntimeException
    // So compiler time not forcing to handle exceptions thrown by class
    val url = new URL("http://tirthalpatel.blogspot.com")
    
    // try-catch-finally block - can be used for exception handling
    try {
      val u = new URL("http://tirthalpatel.blogspot.com");
      val r = new BufferedReader(new InputStreamReader(u.openStream()))
      try {
        var l = r.readLine
        while(l != null) {
          l = r.readLine
          println(l)       
        }
      } finally {
         r.close() 
      } 
    } catch {  // compiler does not force to catch these exceptions
        case _: MalformedURLException => println("Bad URL")
        case e: IOException => println("Problem in reading data: " + e.getMessage)
    }
  }
}