package u02aula

object CurryingExperiment extends App:
  def multi(x: Double, y: Double): Double = x * y

  def curriedMulti(x: Double)(y: Double) = x * y

  def curriedMultiDifference(a: Int)(b: Int)(c: Int): Int = a - b - c

  def multWithTuple(tuple: (Int, Int)): Int = tuple._1 * tuple._2


  def divide(x: Double, y: Double): Double = x / y

  def divideCurried(x: Double)(y: Double): Double = x / y

  def divideCurriedWithTuple(tuple1: (Double, Double))(tuple2: (Double, Double)) = (tuple1._1 / tuple2._1, tuple1._2 / tuple2._2)

  val multiplyBy3: Double => Double = curriedMulti(3)

  println(multi(3, 4))
  println(curriedMulti(3)(4))
  println(curriedMultiDifference(5)(4)(3))
  println(multiplyBy3(3))
  println(divide(5, 2))
  println(divideCurried(5)(2))
  println(multWithTuple((9, 5)))
  println(divideCurriedWithTuple((9, 5))(3, 2))

