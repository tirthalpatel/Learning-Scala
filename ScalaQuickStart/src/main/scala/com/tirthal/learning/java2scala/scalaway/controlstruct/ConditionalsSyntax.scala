package com.tirthal.learning.java2scala.scalaway.controlstruct

// Syntax of conditional control structures in Scala
object ConditionalsSyntax { 
  
  def main(args: Array[String]) {
    
    // (1) ---> if:then - it's an expression in Scala, which means it returns a value
    println(if(args.length==0) "Arguments are null" else "Arguments are not null")
    
    // (2) ---> Scala has no ternary (?:), because Scala ifs expression is equivalent to ternary
    // In face anything in Scala is an expression, even { ... } can return something
   
    // (3) ---> Scala has no Switch statement, instead it uses Match Expressions / Pattern Matching - It can match anything including even objects
    val day = "Monday"
    println(day + " is " + 
      (day match {
        case "Monday" | "Tuesday" | "Wednesday" | "Thurday" | "Friday" => "working day"
        case "Saturday" | "Sunday" => "holiday"
        case _ => "unknown"
      })
    )

  }
  
}