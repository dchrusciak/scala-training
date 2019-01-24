package com.scala.training.session2

import scala.util.{Failure, Success, Try}


object S22_PatternMatching {


  val option = Option(5)
  option match {
    case Some(value) => println(value)
    case None => println("No value")
  }



  //--------------------------------------------------------------------------------------------------------------------



  val trySomeCode = Try { throw new Exception }
  trySomeCode match {
    case Success(value) => println(value)
    case Failure(exception) => println("Got exception: " + exception)
  }



  //--------------------------------------------------------------------------------------------------------------------



  val list = List("Scala", "Java", "Python", "JavaScript", "Ruby", "PHP", "Haskell")

  list match {
    case head :: tail => println(s"Head: $head, Tail: $tail")
    case x :: xs      => println(s"Head: $x, Tail: $xs")
    case x :: Nil     => println(s"Only one element $x")
    case x :: y :: z :: others => println(s"$x, $y, $z and $others")
    case "Scala" :: _ :: "Python" :: _ => println(s"ok")
    case _ =>
  }



  //--------------------------------------------------------------------------------------------------------------------



  case class User(firstName: String, lastName: String, age: Int)


  val user = User("Jim", "Beam", 40)


  user match {
    case User("Jimmy", "Boy", 20)        => println("Hello Jimmy Boy")
    case User("Jim", _, age) if age > 30 => println(s"Hello Jim. Your age is $age")
    case User(firstName, lastName, age)  => println(s"Hello $firstName $lastName. Your age is $age")
    case _                               => println(s"Hello unknown Random")
  }


}
