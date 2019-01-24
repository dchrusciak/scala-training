package com.scala.training.session1


object S10_Immutability {

  //--------------------------------------------------------------------------------------------------------------------

  def mutableSum(list: List[Int]): Int = {
    var sum = 0
    for (number <- list) {
      sum += number
    }
    sum
  }

  //--------------------------------------------------------------------------------------------------------------------

  def immutableSumRecursive(list: List[Int]): Int =
    if (list.isEmpty)
      0
    else
      list.head + immutableSumRecursive(list.tail)

  //--------------------------------------------------------------------------------------------------------------------

  def immutableSumFold(list: List[Int]): Int =
    list.foldLeft(0) { (acc, item) =>  acc + item}

  //--------------------------------------------------------------------------------------------------------------------

}
