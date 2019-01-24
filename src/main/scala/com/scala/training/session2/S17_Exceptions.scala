package com.scala.training.session2

import scala.util.Try

object S17_Exceptions {

  @throws(classOf[IllegalArgumentException])
  def divide(a: Float, b: Float): Float = {
    if (b == 0)
      throw new IllegalArgumentException()
    else
      a / b
  }


  //----------------------------------------------------------------------------


  def tryDivide(a: Float, b: Float): Try[Float] = Try {
    if (b == 0)
      throw new IllegalArgumentException()
    else
      a / b
  }

}
