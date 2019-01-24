package com.scala.training.session1


object S02_Declarations {

  val language = "Scala"

  var number = 123
  number = 666

  def printHello(): Unit = {
    println("Hello")
  }

  lazy val calculatePi: Double = {
    println("calculating PI")
    3.14
  }

  type Integer = Int

  type StringOperation = String => String

}
