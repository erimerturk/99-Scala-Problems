package org.p99.scala

class P01Spec extends UnitSpec {

  /**
   *
   *
    Find the last element of a list.
    Example:

    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
   *
   */

  "last" should "return list last element" in {
    assert(P01.last(List(1,2,3)) == 3)
  }

  it should "also return when list is Empty" in {
    intercept[IllegalArgumentException]{
      P01.last(List())
    }
  }

}

