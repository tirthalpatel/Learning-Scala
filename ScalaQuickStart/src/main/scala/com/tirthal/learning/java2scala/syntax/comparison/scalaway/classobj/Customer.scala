package com.tirthal.learning.java2scala.syntax.comparison.scalaway.classobj

// Scala way - Create Class and Objects + Defining fields within Class definition

// Java developers to be aware that ---> read next comments...

// Define class Customer + Defining fields using Primary Constructor
class Customer(val name: String, val address: String) {
  /*
   * val keyword = instructs scala compiler to create fields and public getter access methods (not creating setter methods).
   * Question - What if I need to make getter methods private? = Well, just declare val as private, e.g., "private val name: String".
   */

  // Defining field within class definition
  private var id = ""
  /*
   * var keyword = instructs scala compiler to create field and both getter/setter methods.
   * By default getter/setter are public, but here private declaration generates private methods.
   * Creates getter (with name "id") and setter (with name "id_") - scala generated methods naming convention.
   */

  /* --- In summary - what is important to know for defining fields?
   * (1) val = creates public getter only
   * (2) var = creates public getter and setter
   * (3) none = if don't declare using val/var, then does not create getter/setter
   * (4) private = makes any generated methods private
   */

}

// object keyword = creates singleton object of a class
object Customer {
  def main(args: Array[String]) {
    val c1 = new Customer("Tirthal", "Ahmedabad 380054")
    c1.id_=("01") // call setter method
    c1.id = "01" // Another syntax to set value

    // Uncomment below line to see compile error - because "name" field is declared with "val", so compiler doesn't generate setter method
    // c1.name = "cannot change"

    println(c1.id + "-" + c1.name + "-" + c1.address) // printing values by calling getter methods
  }
}