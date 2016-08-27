package hu.tmartin.calc

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by Tamás on 2016-08-27.
  */
class TomCalcTest extends FunSuite with Matchers {

  test("Testing the add function") {
    val c = new TomCalc
    c.add(3, 4) shouldBe (7)
  }

  test("Testing the minus function") {
    val c = new TomCalc
    c.minus(3, 4) shouldBe (-1)
  }

  test("Testing the multiply function") {
    val c = new TomCalc
    c.multiply(3, 4) shouldBe (12)
  }

  test("Testing divide") {
    val c = new TomCalc
    c.divide(10,10) shouldBe(1)
  }

  test("Testing avg") {
    val c = new TomCalc
    c.avg(10.0,10.0) shouldBe(11.0)
  }
}
