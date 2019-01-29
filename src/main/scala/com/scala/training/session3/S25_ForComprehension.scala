package com.scala.training.session3

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Try


object S25_ForComprehension {


  def dbQuery = Future {
    Thread.sleep(5000)
    "DB result"
  }

  def restService(param: String) = Future {
    Thread.sleep(5000)
    "REST result"
  }

  for {
    dbResult <- dbQuery
    result <- restService(dbResult)
  } yield result


  //----------------------------------------------------------------------------


  case class User()
  case class Order()

  def getUserById(userId: String): Option[User] = Option(User())
  def getOrdersByUser(user: User): Option[List[Order]] = Option(List(Order(), Order(), Order()))
  def updateOrders(orders: List[Order]): Boolean = true

  for {
    userId <- Option("userId")
    user   <- getUserById(userId)
    orders <- getOrdersByUser(user)
    result <- updateOrders(orders)
  } yield result


  //----------------------------------------------------------------------------


  for {
    isValid  <- Try { /* validate data */ true }
    _        <- Try { /* save data in DB */ } if isValid
    _        <- Try { /* notify user */ }
  } yield ()

}
