package com.scala.training.session1


object S07_Traits {

  //--------------------------------------------------------------------------------------------------------------------




  trait Swimming {
    def swim() = println("Swimming")
  }

  trait Flying {
    def fly() = println("Flying")
  }

  trait Predator {
    def kill() = println("Killing")
  }


  class Fish extends Swimming

  class Bird extends Flying


  class Dolphin extends Swimming

  class Shark extends Fish with Predator

  class Duck extends Bird with Swimming
  val duck = new Duck with Predator




  //--------------------------------------------------------------------------------------------------------------------




  sealed trait ContextStatus
  object Pending extends ContextStatus
  object Starting extends ContextStatus
  object Running extends ContextStatus
  object Deleted extends ContextStatus
  object Failed extends ContextStatus
  object Lost extends ContextStatus




  //--------------------------------------------------------------------------------------------------------------------




  import scala.collection.mutable.ArrayBuffer

  abstract class IntQueue {
    def put(x: Int)
  }

  class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]
    def put(x: Int) { buf += x }
    override def toString = buf.toString()
  }

  trait Doubling extends IntQueue {
    abstract override def put(x: Int) = super.put(2 * x)
  }

  trait Incrementing extends IntQueue {
    abstract override def put(x: Int) = super.put(x + 1)
  }

  trait Filtering extends IntQueue {
    abstract override def put(x: Int) = if (x >= 0) super.put(x)
  }

  val queue = new BasicIntQueue with Filtering with Incrementing

}
