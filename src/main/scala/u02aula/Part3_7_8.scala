package u02aula

object Part3_7_8 extends App:

  def power(base: Double, exponent: Int): Double = exponent match
    case a if a > 0 => base * power(base, exponent - 1)
    case 0 => 1
    case c if c < 0 => throw new IllegalStateException()

  def powerTail(base: Double, exponent: Int): Double =
    @annotation.tailrec
    def _power(startExponent: Int, sum: Double): Double = startExponent match
      case a if a > 0 => _power(startExponent - 1, base * sum)
      case 0 => sum
      case c if c < 0 => throw new IllegalStateException()

    _power(exponent, 1)


  def reverseCustom(x: String => Int, y: Int => String): Int => Int = (input: Int) => x(y(input).reverse)

  def reverseCustomShorted(x: Int): Int = x.toString.reverse.toInt

  def reverseCustomShortedNegative(x: Int) = x match
    case a if a < 0 => -(x.toString.tail.reverse).toInt
    case _ => reverseCustomShorted(x)

  val y: Int => String = (n: Int) => n.toString // Convert Int to String
  val x: String => Int = (s: String) => s.toInt // Convert String to Int

  def reverseNumberTail(n: Int): Int =
    @annotation.tailrec
    def _reverse(remaining: Int, acc: Int): Int = remaining match
      case 0 => acc
      case _ => _reverse(remaining / 10, acc * 10 + remaining % 10)

    _reverse(n, 0)

  println(power(2, 5))
  println(powerTail(2, 5))
  val num = 12345
  println(s"num: $num, reversed: ${reverseCustom(x, y)(num)}")
  println(reverseCustomShorted(num))
  println(reverseCustomShortedNegative(-123))
  println(reverseNumberTail(num))
