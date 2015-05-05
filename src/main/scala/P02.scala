package org.p99.scala

object P02 {
  def penultimate(input: List[Int]) :Int =  {

      def inner(iHead: Int, tail: List[Int]) :Int = tail match {
        case Nil => throw new IllegalArgumentException
        case head :: Nil => iHead
        case head :: tail => inner(head, tail)
      }

    input match {
      case Nil => throw new IllegalArgumentException
      case head :: Nil => head
      case head :: tail => inner(head, tail)
    }

  }







}
