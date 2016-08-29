package hu.tmartin.calc

/**
  * Created by Tamás on 2016-08-27.
  */
class TomCalc {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def minus(a: Int, b: Int): Int = {
    a - b
  }

  def multiply(a: Int, b: Int): Int = {
    a * b
  }

  
  def divide(a: Double, b: Double): Double = {
    a / b
  }

  def avg(a: Double, b: Double): Double = {
    (a + b) / 2
  }

  def avg(a: Double, b: Double, c: Double): Double = {
    (a + b + c) / 3
  }
}
