package com.scala.training.session2

object S23_Exercises {

  //----------------------------------------------------------------------------

  def penultimate(list: List[Int]) = ???

  penultimate(List(1, 1, 2, 3, 5, 8)) == 5

  //----------------------------------------------------------------------------

  def slice(i: Int, i1: Int, list: List[Symbol]) = ???

  slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g)

  //----------------------------------------------------------------------------


  def dropEveryNthElement(i: Int, list: List[Symbol]) = ???

  dropEveryNthElement(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

  //----------------------------------------------------------------------------

  def reverse(list: List[Int]) = ???

  reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1)

  //----------------------------------------------------------------------------

  def duplicateN(i: Int, symbols: List[Symbol]) = ???

  duplicateN(3, List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  //----------------------------------------------------------------------------

  def isPalindrome(list: List[Int]) = ???

  isPalindrome(List(1, 2, 3, 2, 1)) == List(1, 2, 3, 2, 1)

  //----------------------------------------------------------------------------

  def insertAt(item: Symbol, pos: Int, list: List[Symbol]) = ???

  insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd)

  //----------------------------------------------------------------------------

  def encodeDirect(symbols: List[Symbol]) = ???

  encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  //----------------------------------------------------------------------------

  def flatten(list: List[Any]) = ???

  flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8)

  //----------------------------------------------------------------------------

}
