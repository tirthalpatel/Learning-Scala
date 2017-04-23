package com.tirthal.learning.scala.features

// Syntax of Pattern Matching in Scala

object PatternMatching extends App {

   // (1) ---> Switch like behavior
   // Scala has no Switch statement, instead it uses Match Expressions / Pattern Matching 
   // Flexible match conditions - it can match anything including even objects
   // It has no break and a case match is an expression (can assign value)
   val day = "ABC"
   val dayType = day match {
        case "Monday" | "Tuesday" | "Wednesday" | "Thurday" | "Friday" => "working day"
        case "Saturday" | "Sunday" => "holiday"
        case _ => "unknown"  // optional default catch every value at the end using wildcard(_)
   }
   println(day + " is " + dayType)
   
   // (2) ---> What is pattern?
   //
   //   In below syntax, pattern can be wildcard (_), variable name, literal equality, constructor match, deconstructor match, type query patterns, a pattern with alternatives
   //
   //   value match {
   //      case pattern guard => expression   
   //      case ...
   //      case _ => expression
   //   }
   
   // --- Example - Pattern can be any variable name i.e. x
   val str = "tirthal"   
   str match {
     case x => println("Hello " + x) 
   }

   // --- Example - Literal Matches (value must exactly matched with the Literal case i.e. match using ==)
   val language = "Gujarati"
   language match {
     case "Engish" => println("How are you?")
     case "gujarati" => println("Kem cho?")
     case "Gujarati" => println("Kem cho? Majama?")
     case _ => println("Hi")
   }
   
   // --- Example - Constructor Patterns (allow you to match on the arguments used to construct an object) works on "case" class only
   val color = new Color(1, "Red", "RC")
   color match {
     case Color(_, "Red", _) => println("This is red color")  // Match if name is "Red" in 2nd argument of Color constructor
     case Color(_, _, _) => println("???")    // "_" indicates that you don't care what the values are
   } 
   
   // --- Example - Type Queries (used for convenient type checks and type casts)
   def generalSize(x: Any): Int = x match {
     case s: String => s.length  // 's' can only be a 'String'
     case m: Map[_, _] => m.size // 'm' can only be a 'Map'
     case _ => -1                // for any other type, return -1
   }                                               
    
   println { generalSize("Tirthal") }                           //> Int = 7
   println { generalSize(Map(1 -> "one", 2 -> "two")) }         //> Int = 2
   println { generalSize(math.Pi) }                             //> Int = -1
   println { generalSize(List("A1", "A2", "A3")) }              //> Int = -1
   
   // (3) ---> What is guard?
   // A pattern guard comes after a pattern and starts with an if & the pattern matches only if the guard evaluates to true
   // Example syntax - 
   //     match only positive integers --- case n: Int if 0 < n => n + " is positive"
   //     match only strings starting with the letter 'a' --- case s: String if s(0) == 'a' => s + " starts with letter 'a'"
}

// Case classes are regular classes which export their constructor parameters and which provide a recursive decomposition mechanism via pattern matching
case class Color(id: Int, name: String, code: String)
