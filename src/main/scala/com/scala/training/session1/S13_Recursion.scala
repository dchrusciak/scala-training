package com.scala.training.session1

object S13_Recursion {

  def factorial(n: Long): Long = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

}
