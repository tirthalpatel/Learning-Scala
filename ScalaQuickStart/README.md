Scala learning made easy
========================

Syntax comparison between Java and Scala + Sample code snippet for getting started with Scala features.

This project contains my notes and code snippet when I was learning Scala from various resources (as mentioned further in "See Also" section).
Mainly this is for my future reference. However, this may be useful to other java developers for getting started with Scala syntax.

Related post is [here](http://tirthalpatel.blogspot.com/2016/05/scala-quick-start-for-java-developers.html)

Software Requirements
---------------------

You may run code with available latest version of below at given point of time.

* Java 11
* Scala 2.13.6 (http://scala-lang.org/download/)
* Sbt 1.5.2 - a build tool for Scala (http://www.scala-sbt.org/download.html)
* Intellij IDEA for Scala (https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html) or your choice of IDE

Setup instructions for this "ScalaQuickStart" project
------------------------------------------------------

(1) Download / Clone this project to your local machine

(2) If you have installed Scala version other than 2.13.6 as per [JDK supported version compatibility](https://docs.scala-lang.org/overviews/jdk-compatibility/overview.html#version-compatibility-table), then configure it in [build.sbt](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/build.sbt) file

(3) If you have installed Sbt version other than 1.5.2, then configure it in [/project/build.properties](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/project/build.properties) file
	
(4) Ensure correct [scalatest](http://www.scalatest.org/download) and [junit-interface](https://github.com/sbt/junit-interface) version is configured in libraryDependencies of [build.sbt](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/build.sbt) file

(5) For using Eclipse IDE, ensure correct [sbteclipse](https://github.com/typesafehub/sbteclipse/) version is configured in [/project/plugins.sbt](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/project/plugins.sbt) file, and then go to root directory of "ScalaQuickStart" project on command prompt and type these commands: (i) `sbt eclipse` (this command will create default project scaffolding), (ii) `sbt` (this will load sbt for dependency libraries), (iii) `eclipse` (run eclipse task)

(6) Import the project in to IDE, and confirm there are no errors in build path (e.g. java compiler compliance may need to be set as Java 11 version)

A Scala Syntax for Java Programmers
------------------------------------

From Java to Scala Learning - Syntax comparison between Java and Scala

* Hello World + Interacting with Java in Scala code - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/classobj/HelloWorld.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/classobj/HelloWorld.scala)
* ABC of syntax differences - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/classobj/Abc.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/classobj/Abc.scala)
* How to create Class and Objects + Defining fields within Class definition? - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/classobj/Customer.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/classobj/Customer.scala)
* Constructors - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/classobj/CashFlow.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/classobj/CashFlow.scala) 
* Override getter/setter methods - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/classobj/User.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/classobj/User.scala)
* Scala's case class and synthetic methods / Record class in Java 16 - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/classobj/TemperatureAlarm.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/classobj/TemperatureAlarm.scala)

* Control structures
	- Conditionals (If:then, Ternaries, Switch) - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/controlstruct/ConditionalsSyntax.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/controlstruct/ConditionalsSyntax.scala)
	- Loops (while, for) and Breaks - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/controlstruct/LoopsBreaksSyntax.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/controlstruct/LoopsBreaksSyntax.scala)
	- Exceptions - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/controlstruct/ExceptionSyntax.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/controlstruct/ExceptionSyntax.scala)

* Inheritance concepts
	- Sub-type inheritance - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/inheritance/SubTypeSample.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/inheritance/SubTypeSample.scala)
	- Traits in Scala (nearly alike Interfaces in Java) - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/inheritance/InterfaceSample.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/inheritance/TraitSample.scala)
	- Methods on Traits in Scala (nearly alike interface default methods in Java 8) - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/inheritance/InterfaceDefaultMethodSample.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/inheritance/TraitDefaultMethodSample.scala)	
	- Abstract class - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/inheritance/AbstractClassSample.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/inheritance/AbstractClassSample.scala)

* Data Structures and Collections in Scala 
	- [List](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/collection/ListExamples.scala)
	- [Map](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/collection/MapExamples.scala)
	- See [Scala Collections Overview](https://docs.scala-lang.org/overviews/collections/overview.html) and [Performance Characteristics](https://docs.scala-lang.org/overviews/collections/performance-characteristics.html)

* Generics (Generic Types & Methods, Bounded Types, Wildcards) - [Java](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/java/com/tirthal/learning/java2scala/javaway/generics/GenericsSyntax.java) vs. [Scala](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/generics/GenericsSyntax.scala)

Diving into Scala features
--------------------------

Sample code snippet for getting started with Scala features (which can be new to java developers)

* Write scala scripts on [Windows](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/helloarg.bat) and [Unix](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/helloarg)

* Everything is an object in Scala - [Scala's Unified Types / Class Hierarchy](http://docs.scala-lang.org/tutorials/tour/unified-types.html)

* Features for making more concise, expressive and readable code in Scala
	- Faking function calls using [apply() and update()](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/scala/features/ApplyUpdateMethodUsage.scala)
	- Faking language constructs using [curly brace rule](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/scala/features/HigherOrderFunctions.scala), [higher-order functions](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/scala/features/HigherOrderFunctions.scala), [curried functions](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/scala/features/CurryingUsage.scala)
	- [Pattern matching](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/scala/features/PatternMatching.scala)
	- The Option class
	- Implicit Conversions

* Functional programming in Scala
	- [Introduction of functional programming](https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/scala/functional/IntroToFunctional.scala)
	- Functional combinators (map, flatMap, foreach, filter...)
	- Monads, Chaining Monad calls
	- For-comprehensions

See Also:
---------

* [Java developer's Scala cheatsheet](http://mbonaci.github.io/scala/)
* [Programming in Scala, First Edition](http://www.artima.com/pins1ed/)
* [Scala Documentation](http://docs.scala-lang.org/tutorials/tour/tour-of-scala.html)
* [Twitter Scala School](https://twitter.github.io/scala_school/)
* [Book: Programming Scala: Tackle Multi-Core Complexity on the Java Virtual Machine](https://pragprog.com/book/vsscala/programming-scala)
* [Online training: Scala for Java Developers](http://www.pluralsight.com/courses/scala-for-java-developers)

Disclaimer
----------

The code snippet are mainly targeted for learning purpose, and not focused for producing production code quality.
