package com.scala.training.session3

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.language.postfixOps
import scala.util.{Failure, Random, Success}

object S24_Future {

  val future = Future(1234)

  val longComputedFuture = Future {
    Thread.sleep(10000)
    1234
  }

  //----------------------------------------------------------------------------

  Await.result(longComputedFuture, 10 seconds)

  //----------------------------------------------------------------------------

  longComputedFuture.onComplete {
    case Success(result)    => println(result)
    case Failure(exception) => println(exception)
  }

  //----------------------------------------------------------------------------

  longComputedFuture.map(_ + " PLN")

  //----------------------------------------------------------------------------

  def waitRandom: Future[Int] = Future {
    val milis = Random.nextInt(10000)
    Thread.sleep(milis)
    println(s"Finished $milis")
    milis
  }

  Future.sequence( List(waitRandom, waitRandom, waitRandom, waitRandom, waitRandom, waitRandom, waitRandom) )


}
