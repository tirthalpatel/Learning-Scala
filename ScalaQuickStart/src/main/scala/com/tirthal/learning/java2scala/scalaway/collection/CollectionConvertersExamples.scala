package com.tirthal.learning.java2scala.scalaway.collection

import java.util
import scala.collection.mutable
import scala.jdk.CollectionConverters._

// Usage of CollectionConverters for converting collections between Java and Scala
// Need to import scala.jdk.CollectionConverters._
object CollectionConvertersExamples {

  def main(args: Array[String]): Unit = {

    // Converting collection from Java to Scala
    val javaList = new util.ArrayList[String]()
    val scalaWrapperForJavaList = javaList.asScala
    println(javaList.getClass + " ---> "+ scalaWrapperForJavaList.getClass)

    scalaWrapperForJavaList.foreach(println(_))

    // Converting collection from Scala to Java
    val anotherJavaList = scalaWrapperForJavaList.asJava
    println(scalaWrapperForJavaList.getClass + " ---> "+ anotherJavaList.getClass)

    anotherJavaList.forEach(println(_))

    // Generator based For Loop can be used with Scala Collection, but can't be used with Java type
    for(element <- scalaWrapperForJavaList)
      println(element)
  }
}
