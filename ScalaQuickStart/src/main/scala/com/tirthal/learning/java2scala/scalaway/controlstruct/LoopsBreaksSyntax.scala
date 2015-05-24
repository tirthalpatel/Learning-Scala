package com.tirthal.learning.java2scala.scalaway.controlstruct

// Syntax of loops and breaks control structures in Scala
object LoopsBreaksSyntax {

  def main(args: Array[String]) {
    
    // (1) ---> while loop
    var i: Int = 0
    while (i < 3) {
      println(i)
      i += 1 // there is no i++ operator in scala
    } 
    
    // (2) ---> Scala has for comprehension (instead of for loop)
    for(i <- 0 to i) { // "<-" indicates a generator to feed value into the iterator
      println(i)
    }
    
    // for each
    (0 to 3).foreach(i => println(i)) // Alternate syntax of using Scala's shorthand = (0 to 3).foreach(println(_))
    
    // (3) ---> Scala has break() API instead of break statement
    // Scala has no break/continue statements, because it generally discourages to breaking of loops
    import scala.util.control.Breaks._ // Scala allows to import within method block also
    breakable {
      for(k <- 0 to 10) {
        println(k)
        if(i ==5)
          break()
      }
    }
  }
}