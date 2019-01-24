package com.scala.training.session1

import scala.annotation.tailrec

object S14_TailRecursion {

  def factorial(n: Long): Long = {
    @tailrec
    def factorialAcc(n: Long, acc: Long): Long = {
      if (n <= 1)
        acc
      else
        factorialAcc(n - 1, acc * n)
    }
    factorialAcc(n, 1)
  }

}
