package com.scala.training.session1

import scala.annotation.tailrec


object S15_Exercises {

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)


  def fib(index: Int): Int = {
    @tailrec
    def fibAcc(index: Int, prev: Int, current: Int): Int = {
      if (index <= 0)
        current
      else
        fibAcc(index - 1, prev = prev + current, current = prev)
    }
    fibAcc(index, prev = 1, current = 0)
  }
}
