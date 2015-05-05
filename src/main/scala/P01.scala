package org.p99.scala

object P01 {

  def last(ints: List[Int]) = ints.lastOption.getOrElse(throw new IllegalArgumentException)

}
