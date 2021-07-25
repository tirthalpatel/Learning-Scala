package com.tirthal.learning.scala.samples.ex1

import scala.util.{Failure, Success, Try}

class UserService {

  private lazy val allUsers = populateUserRecordsFromCsvFile()

  def populateUserRecordsFromCsvFile(): Vector[UserRecord] = {

    // Change file name to any invalid file name to see usage of Try-Success-Failure
    Try(io.Source.fromFile("src/main/resources/users.csv")) match {

      case Success(source) =>
        for {
          line <- source.getLines().drop(1).toVector // get each line from the file excluding first headers line
          cols = line.split(",").map(_.trim)
        } yield UserRecord(cols(0).toInt, cols(1), cols(2), cols(3).toInt, cols(4))

      case Failure(exception) =>
        println(exception)
        Vector.empty
    }
  }

  def printAllUsers(): Unit = {
    printUsers(allUsers)
  }

  def printUsers(users: Vector[UserRecord]): Unit = {
    println("--------------------------------------------------------------------------")
    println("ID  | NAME       | EMAIL                   | AGE   | COUNTRY")

    printUsers()
    println("--------------------------------------------------------------------------")

    // Nested method / local method
    def printUsers(): Unit = {

      for (user <- users) {
        println(s"${user.id}  | ${user.name}       | ${user.email}                   | ${user.age}   | ${user.country}")
      }
    }
  }
}
