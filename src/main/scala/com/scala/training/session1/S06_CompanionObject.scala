package com.scala.training.session1


class Product(val name: String, val price: Int, val category: String) {
  override def toString = s"Product $name for $$$price from category $category"
}

object Product {
  val MinPrice = 10
  val MaxPrice = 100

  def apply(name: String, price: Int = 0, category: String = "Undefined") = new Product(name, price, category)
  def apply(other: Product) = new Product(other.name, other.price, other.category)
}
