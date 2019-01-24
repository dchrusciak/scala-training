package com.scala.training.session1

import scala.math.log
import scala.concurrent.duration._
import scala.collection.immutable.{List, Set}
import scala.collection.mutable
import scala.language.postfixOps

object S12_Packages {

  def logE: Double = {
    import scala.math.E
    log(E)
  }

  val TwoMinutes: Duration = 2 minutes

  val mutableMap = mutable.Map[String, Int]

  val list = List(1, 2, 3)
  val set = Set(1, 2, 3)

  //--------------------------------------------------------------------------------------------------------------------

  private[session1] class PrivateClass {
    private[this] val privateField = 5
    protected[this] val protectedField = 5
  }
}
