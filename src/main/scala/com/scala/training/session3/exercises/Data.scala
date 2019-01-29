package com.scala.training.session3.exercises

import java.time.LocalDate
 

object Data {

  // Users
  val userJaroslawPsikuta = User("Jarosław", "Psikuta", "jaro.psikuta@o2.pl",  LocalDate.of(2018,  3,  7))
  val userZygfrydWiadro   = User("Zygfryd",  "Wiadro",  "zigi@gmail.com",      LocalDate.of(2018,  4, 24))
  val userLeopoldKozibak  = User("Leopold",  "Kozibąk", "kozibak@gmail.com",   LocalDate.of(2018,  5, 16))
  val userWaldemarKilof   = User("Waldemar", "Kilof",   "waldek.kilof@wp.pl",  LocalDate.of(2017, 11, 17))
  val userRomualdDzik     = User("Romuald",  "Dzik",    "dziku@onet.eu",       LocalDate.of(2018,  4, 30))
  val userAntoniSzpadel   = User("Antoni",   "Szpadel", "a.szpadel@gmail.com", LocalDate.of(2017, 12,  4))

  val users = List(userJaroslawPsikuta, userZygfrydWiadro, userLeopoldKozibak, userWaldemarKilof, userRomualdDzik, userAntoniSzpadel)

  // Products
  val prodKeyboard   = Product("Keyboard",     60)
  val prodMouse      = Product("Mouse",        35)
  val prodNotebook   = Product("Notebook",   2780)
  val prodMonitor    = Product("Monitor",    1240)
  val prodPrinter    = Product("Printer",     450)
  val prodTV         = Product("TV",         3200)
  val prodSmartphone = Product("Smartphone", 1520)
  val prodTablet     = Product("Tablet",     2470)
  val prodDrone      = Product("Drone",      8400)

  val products = List(prodKeyboard, prodMouse, prodNotebook, prodMonitor, prodPrinter, prodTV, prodSmartphone, prodTablet, prodDrone)

  // Orders
  val orders = List(
    Order(LocalDate.of(2018, 5, 11), userJaroslawPsikuta, Map(prodNotebook -> 1, prodSmartphone -> 2)),
    Order(LocalDate.of(2018, 5, 23), userWaldemarKilof,   Map(prodTV -> 3)),
    Order(LocalDate.of(2018, 5, 30), userAntoniSzpadel,   Map(prodNotebook -> 1, prodMouse -> 1)),
    Order(LocalDate.of(2018, 6,  2), userLeopoldKozibak,  Map(prodNotebook -> 1)),
    Order(LocalDate.of(2018, 6,  7), userRomualdDzik,     Map(prodKeyboard -> 1, prodMouse -> 1, prodTablet -> 1, prodSmartphone -> 1)),
    Order(LocalDate.of(2018, 6, 19), userJaroslawPsikuta, Map(prodDrone -> 3)),
    Order(LocalDate.of(2018, 6, 22), userZygfrydWiadro,   Map(prodTV -> 1, prodMonitor ->  1)),
    Order(LocalDate.of(2018, 6, 26), userRomualdDzik,     Map(prodNotebook -> 3)),
    Order(LocalDate.of(2018, 7,  1), userJaroslawPsikuta, Map(prodDrone -> 3, prodTablet -> 5)),
    Order(LocalDate.of(2018, 7, 12), userAntoniSzpadel,   Map(prodPrinter ->  1, prodKeyboard -> 1)),
    Order(LocalDate.of(2018, 7, 14), userJaroslawPsikuta, Map(prodPrinter -> 10))
  )

  // Invoices
  val invoices = List(
    Invoice("FV 11/05/2018", LocalDate.of(2018, 5, 11), userJaroslawPsikuta, List(
      InvoiceItem(prodSmartphone, 2),
      InvoiceItem(prodNotebook,   1)
    )),
    Invoice("FV 23/05/2018", LocalDate.of(2018, 5, 23), userWaldemarKilof, List(
      InvoiceItem(prodTV, 3)
    )),
    Invoice("FV 30/05/2018", LocalDate.of(2018, 5, 30), userAntoniSzpadel, List(
      InvoiceItem(prodNotebook, 1),
      InvoiceItem(prodMouse,    1)
    )),
    Invoice("FV 02/06/2018", LocalDate.of(2018, 6,  2), userLeopoldKozibak, List(
      InvoiceItem(prodNotebook, 1)
    )),
    Invoice("FV 07/06/2018", LocalDate.of(2018, 6,  7), userRomualdDzik, List(
      InvoiceItem(prodKeyboard,   1),
      InvoiceItem(prodMouse,      1),
      InvoiceItem(prodTablet,     1),
      InvoiceItem(prodSmartphone, 1)
    )),
    Invoice("FV 19/06/2018", LocalDate.of(2018, 6, 19), userJaroslawPsikuta, List(
      InvoiceItem(prodDrone, 3)
    )),
    Invoice("FV 22/06/2018", LocalDate.of(2018, 6, 22), userZygfrydWiadro, List(
      InvoiceItem(prodTV, 1),
      InvoiceItem(prodMonitor, 1)
    )),
    Invoice("FV 26/06/2018", LocalDate.of(2018, 6, 26), userRomualdDzik, List(
      InvoiceItem(prodNotebook, 3)
    )),
    Invoice("FV 01/07/2018", LocalDate.of(2018, 7, 1), userJaroslawPsikuta, List(
      InvoiceItem(prodDrone,  3),
      InvoiceItem(prodTablet, 5)
    )),
    Invoice("FV 12/07/2018", LocalDate.of(2018, 7, 12), userAntoniSzpadel, List(
      InvoiceItem(prodPrinter,  1),
      InvoiceItem(prodKeyboard, 1)
    )),
    Invoice("FV 14/07/2018", LocalDate.of(2018, 7, 14), userJaroslawPsikuta, List(
      InvoiceItem(prodPrinter, 10)
    ))
  )
}