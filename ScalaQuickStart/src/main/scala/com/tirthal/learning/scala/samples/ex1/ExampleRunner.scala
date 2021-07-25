package com.tirthal.learning.scala.samples.ex1

object ExampleRunner extends App {

  private val userService = new UserService
  userService.printAllUsers()

  private val users = userService.populateUserRecordsFromCsvFile()
  users.foreach(println)
  println("------")

  if (users.nonEmpty) {
    // Print user name and age whose age greater than 30
    users.filter(_.age > 30).foreach(u => println(s"User name:${u.name}, age: ${u.age}"))
    println("------")

    // What's avg age of all users?
    val avgAgeOfUsers = () => users.map(_.age).sum / users.size
    println(s"Avg age of the users= ${avgAgeOfUsers()}")
    println("------")
  }
}
