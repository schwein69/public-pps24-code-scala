package u02aula

object Part2_5_6 extends App:

  def composeFunction(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  println(composeFunction(_ - 1, _ * 2)(5))

  def genericComposeFunction[A](f: A => A, g: A => A): A => A = x => f(g(x))

  println(genericComposeFunction[Int](_ - 1, _ * 2)(5))

  def composeThree[A, B, C, D](f: C => D, g: B => C, h: A => B): A => D = x => f(g(h(x)))

  println(composeThree[Int, Int, String, String](_ + "!", _.toString, _ * 2)(3))


