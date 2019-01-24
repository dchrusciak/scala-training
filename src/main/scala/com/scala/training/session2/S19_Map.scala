package com.scala.training.session2

object S19_Map {

  val map = Map(
    "a" -> 1,
    "b" -> 2,
    "c" -> 3,
    "d" -> 4,
  )

  val listOfTuples = Map(
    ("a", 1),
    ("b", 2),
    ("c", 3),
    ("d", 4),
  )

  map("a")

  map.get("a")

  map.mapValues(_ * 2)

}
