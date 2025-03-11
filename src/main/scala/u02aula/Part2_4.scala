package u02aula

object Part2_4 extends App:

  val p1: (Int, Int, Int) => Boolean = (x, y, z) => x < y && y == z

  val p2: Int => Int => Int => Boolean = x => y => z => x < y && y == z

  /*with currying*/
  def p3(x: Int)(y: Int)(z: Int): Boolean = x < y && y == z

  /*without currying*/
  def p4(x: Int, y: Int, z: Int): Boolean = x < y && y == z

  // Test cases
  val testCases = List(
    (1, 2, 2), // Expected: true
    (2, 3, 3), // Expected: true
    (5, 5, 5), // Expected: false
    (3, 2, 2), // Expected: false
    (0, 1, 2) // Expected: false
  )

  // Running tests
  for ((x, y, z) <- testCases)
    println(s"p1($x, $y, $z) = ${p1(x, y, z)}")
    println(s"p2($x)($y)($z) = ${p2(x)(y)(z)}")
    println(s"p3($x)($y)($z) = ${p3(x)(y)(z)}")
    println(s"p4($x, $y, $z) = ${p4(x, y, z)}")
    println("-" * 30)
