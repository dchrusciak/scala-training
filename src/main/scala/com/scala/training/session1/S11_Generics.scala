package com.scala.training.session1

object S11_Generics {

  val integers: List[Int] = List(1, 2, 3)

  val tuple2 = Tuple2(Int, String)

  trait Stack[T] {
    def push(item: T)
    def pop: T
  }

  trait CovariantStack[+T] {
    def push[S >: T](item: S)
    def pop: T
  }

}
