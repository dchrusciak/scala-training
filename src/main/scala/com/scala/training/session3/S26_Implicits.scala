package com.scala.training.session3

import scala.language.implicitConversions


object S26_Implicits {


  implicit val x = 5

  def doSomething(implicit number: Int) = s"Number is $number"


  //----------------------------------------------------------------------------


  case class Complex(real: Double, imag: Double) {
    def +(that: Complex) = Complex(this.real + that.real, this.imag + that.imag)
  }

  implicit def doubleToComplex(double: Double) = Complex(double, 0)

  val c = Complex(5, 7)
  val d = 3.14
  c + d


  //----------------------------------------------------------------------------


  implicit class Quantity(val value: Int)

  def buy(quantity: Quantity) = println(s"Buying ${quantity.value}")

}
