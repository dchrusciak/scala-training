package com.scala.training.session2


object S16_Option {

  def divide(a: Float, b: Float): Option[Float] = {
    if (b == 0)
      None
    else
      Some(a / b)
  }


  //----------------------------------------------------------------------------


  val someVariable: Int = null
  val good = Option(someVariable)
  val evil = Some(someVariable)


  //----------------------------------------------------------------------------


  val result = divide(5, 0)

  val stupid = result.get

  if (result.isDefined) println(result.get) else println("No result")

  result.fold(0f)(x => x * 2)

  result.map(x => x * 2).getOrElse(0)

}
