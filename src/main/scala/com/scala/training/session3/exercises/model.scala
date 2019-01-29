package com.scala.training.session3.exercises

import java.time.LocalDate


case class Product(
  name: String,
  price: Int
)

case class User(
  firstName: String,
  lastName: String,
  email: String,
  registerDate: LocalDate
)

case class Order(
  orderDate: LocalDate,
  user: User,
  products: Map[Product, Integer]
)

case class InvoiceItem(
  product: Product,
  quantity: Int
)

case class Invoice(
  number: String,
  dataOfIssue: LocalDate,
  user: User,
  items: List[InvoiceItem]
)
