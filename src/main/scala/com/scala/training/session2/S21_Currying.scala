package com.scala.training.session2


object S21_Currying {

  val list = List.range(1, 11)
  list.foldLeft(0)(_*_)


  def multiple(x: Double)(y: Double): Double = x * y


  val scalaIsAwesome: (Int, Int) => String = "Scala is awesome".substring

}
