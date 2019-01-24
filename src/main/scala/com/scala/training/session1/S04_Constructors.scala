package com.scala.training.session1


class Person(val firstName: String, val lastName: String, val iq: Int, val usingBdf: Boolean = false) {

  def this(firstName: String, lastName: String) {
    this(firstName, lastName, 50)
  }

}

new Person(
 lastName = ""
 firstName = ""
)
