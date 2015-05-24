package com.tirthal.learning.java2scala.scalaway.inheritance

// Test class instance for demo of default methods on Trait in Scala
object TraitDefaultMethodSample {

  def main(args: Array[String]) {
    var users = new Users();
    users.add(new User("Tids", 34))
    users.add(new User("Adam", 40))
    users.add(new User("Ian", 4))
    println("Users sorted by name: " + users.sort)
    
    users = new UsersSortableByAge();
    users.add(new User("Tids", 34))
    users.add(new User("Adam", 40))
    users.add(new User("Ian", 4))
    println("Users sorted by age: " + users.sort)
  }
}

// Trait providing default ability of sorting for generic type A to be a sub-type of Comparable in collection
trait Sortable[A <: Ordered[A]] extends Iterable[A] {
  // Ordered is like comparable in java
  // <: indicates upper bound to constraint generic type to be a sub-type of Ordered
    
  // default sorting implementation, which may be overridden by class extending trait 
  def sort: Seq[A] = {
    this.toList.sorted // By default in-built sorting method of Ordered uses natural comparison method - User#compare()
  }
}

// Users class gets default sorting behavior from the default sort() implementation in Sortable interface
class Users extends Sortable[User] { // Here, User class must be sub-type of Ordered
  private val users = scala.collection.mutable.Set[User]()
  
  def add(user: User) = users.add(user)
  
  def iterator: Iterator[User] = users.iterator
}

class User(val fname: String, val age: Int) extends Ordered[User] {
  
  def compare(that: User): Int = fname.compare(that.fname)
  
  override def toString: String = fname + "'s age is " + age
}

// Another UsersSortableByAge class overrides default sorting behavior of Sortable interface
class UsersSortableByAge extends Users {
  
  override def sort: List[User] = {
    this.toList.sorted(new Ordering[User] {
      def compare(first: User, second: User) = second.age.compare(first.age)
    })
  }
}
