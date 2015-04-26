Scala learning made easy
=========================
Syntax comparison between Java and Scala + Sample code snippet for getting started with Scala.

This can be useful to java developers for getting started with Scala syntax.

Software Requirements
---------------------

* Java 1.6 or later
* Scala 2.11.6 (http://scala-lang.org/download/)
* Sbt 0.13.7 - a build tool for Scala (http://www.scala-sbt.org/download.html)
* Scala IDE for Eclipse (http://scala-ide.org/)

Setup instructions for this "ScalaQuickStart" project
------------------------------------------------------

(1) Download / Clone this project to your local machine

(2) If you have installed Scala version other than 2.11.6, then configure it in [build.sbt] (https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/build.sbt) file

(3) If you have installed Sbt version other than 0.13.7, then configure it in [/project/build.properties] (https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/project/build.properties) file
	- Ensure correct [sbteclipse] (https://github.com/typesafehub/sbteclipse/) version is configured in [/project/plugins.sbt] (https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/project/plugins.sbt) file
	- Ensure correct [scalatest] (http://www.scalatest.org/download) and [junit-interface] (https://github.com/sbt/junit-interface) version is configured in libraryDependencies of [build.sbt] (https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/build.sbt) file

(4) Go to root directory of "ScalaQuickStart" project on command prompt and type below commands
	- sbt eclipse (this command will create default project scaffolding)
	- sbt (this will load sbt for dependency libraries)
	- eclipse (run eclipse task)

(5) Import the project in to Eclipse IDE (having Scala plugin installed)


A Scala Syntax for Java Programmers
------------------------------------

* Hello World + Interacting with Java in Scala code - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/syntax/comparison/javaway/classobj/HelloWorld.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/syntax/comparison/scalaway/classobj/HelloWorld.scala)
* ABC of syntax differences - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/syntax/comparison/javaway/classobj/Abc.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/syntax/comparison/scalaway/classobj/Abc.scala)
* How to create Class and Objects + Defining fields within Class definition? - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/syntax/comparison/javaway/classobj/Customer.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/syntax/comparison/scalaway/classobj/Customer.scala)
* Override getter/setter methods - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/syntax/comparison/scalaway/classobj/User.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/syntax/comparison/scalaway/classobj/User.scala)

MY LEARNING IN PROGRESS... SO I SHALL BE ADDING MORE CODE IN FEW WEEKS...


References:
-----------
* http://www.tutorialspoint.com/scala/index.htm
* http://www.scala-lang.org/
* http://www.scala-lang.org/old/node/960
* https://twitter.github.io/scala_school/


Disclaimer
----------
The code snippet are mainly targeted for learning purpose, and not focused for producing production code quality.
