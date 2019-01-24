package com.scala.training.session2

object S18_List {

  val emptyList = List()
  val list = List.range(1, 6)


  val anotherEmptyList = Nil
  val anotherList = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

  list.head

  list.tail

  list.take(5)

  list.takeWhile(_ < 3)

  list.map(_ * 2)

  list.filter(_ % 2 == 0)

  list.groupBy(_ % 3)
}
