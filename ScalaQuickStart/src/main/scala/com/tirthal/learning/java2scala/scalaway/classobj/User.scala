package com.tirthal.learning.java2scala.scalaway.classobj

// Scala way - How to override getter/setter methods of field, if require to add custom logic?

// Java developers to be aware that ---> read next comments...

/*
 * In Java we could have custom logic in getter/setter methods, as anyway we are enforced to implement those.
 *
 * Scala compiler generates getter/setter methods for fields declared using val/var.
 * Well, there is no language supported simple way to do similar in Scala.
 * Trick is - (i) Rename field (ii) Mark as private (iii) Recreate setter and getter
 */

class User {

  // (i) Rename field - Let's say originally field name was "id" and now renamed it as "_id" with private declaration
  // (ii) Mark as private - This will generate private getter (with "_id" name) and setter (with "_id_" name)
  private var _id = ""

  // (iii) Recreate setter and getter - Now recreate setter and getter for "id" field
  def id = _id // custom getter returns value of "_id" field

  def id_=(value: String) { // custom setter method
    // Added custom logic...
    if(_id.isEmpty())
      _id = value	// this sets value to "_id" field
  }
}

object User {
  def main(agrs: Array[String]) {
	val u1 = new User()

	u1.id = "001" // calling setter of "id" field
	println("before - " + u1.id) // printing using getter of "id" field

	u1.id = "002"
	println("after - " + u1.id)
  }
}

