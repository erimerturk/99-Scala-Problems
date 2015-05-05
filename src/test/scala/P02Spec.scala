package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {

  // TODO

  /**

  Find the last but one element of a list.

  Example:

    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5

   */

  "penultimate" should "return (size - 1) element" in {

    assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    assert(P02.penultimate(List(1, 1, 2, 3, 8)) == 3)

    intercept[IllegalArgumentException] {
      P02.penultimate(List())
    }


  }

}

