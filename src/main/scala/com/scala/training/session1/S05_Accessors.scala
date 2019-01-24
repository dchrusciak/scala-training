package com.scala.training.session1


class Pet {
  private var _name = ""

  def name = _name

  def name_= (newName: String): Unit =
    if (newName != "")
      _name = newName
    else
      throw new IllegalArgumentException("No name given")


}
