package com.scala.training.session3

import com.scala.training.session3.exercises.{Invoice, Order, User, _}


class S27_Exercises {


  def oldestUser(users: List[User]): User = ???

  oldestUser(Data.users) == Data.userWaldemarKilof

  //----------------------------------------------------------------------------

  def mostValuableInvoice(invoices: List[Invoice]): String = ???

  mostValuableInvoice(Data.invoices) == "FV 1/7/2018"

  //----------------------------------------------------------------------------

  def leastOrderedProduct(orders: List[Order]): Product = ???

  leastOrderedProduct(Data.orders) == Data.prodPrinter

  //----------------------------------------------------------------------------

  def sortedNumberOfOrdersPerUser(orders: List[Order]): Seq[(String, Int)] = ???

  sortedNumberOfOrdersPerUser(Data.orders) == Seq(
    ("Jarosław Psikuta", 4),
    ("Romuald Dzik",     2),
    ("Antoni Szpadel",   2),
    ("Zygfryd Wiadro",   1),
    ("Waldemar Kilof",   1),
    ("Leopold Kozibąk",  1)
  )

  //----------------------------------------------------------------------------

  def totalValueOfOrdersByMonths(orders: List[Order]): Map[String, Int] = ???

  totalValueOfOrdersByMonths(Data.orders) == Map(
    "2018.06" -> 44845,
    "2018.05" -> 18235,
    "2018.07" -> 42560
  )

  //----------------------------------------------------------------------------

  def ordersToInvoices(orders: List[Order]): List[Invoice] = ???

  ordersToInvoices(Data.orders) == Data.invoices

  //----------------------------------------------------------------------------

}
