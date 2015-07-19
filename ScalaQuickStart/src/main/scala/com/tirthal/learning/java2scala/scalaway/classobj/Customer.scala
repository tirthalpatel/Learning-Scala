package com.tirthal.learning.java2scala.scalaway.classobj

// Scala way - Create Class and Objects + Defining fields within Class definition

// Java developers to be aware that ---> read next comments...

// Define class Customer + Defining fields name and address using Primary Constructor
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
   * (1) val = immutable field - creates public getter only (equivalent of a final variable in Java)
   * (2) var = mutable field - creates public getter and setter
   * (3) none = if don't declare using val/var, then does not create getter/setter
   * (4) private = makes any generated methods private
   */

}

// Scala compiles this to two files - Customer.class & Customer$.class - one for above class and another for below singleton object

// object keyword = creates singleton object of a class
// If object name has same name as class, then it is termed as "companion" object and it can access private methods of the class
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