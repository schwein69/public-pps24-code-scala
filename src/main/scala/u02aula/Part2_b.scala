package u02aula

object Part2_b extends App:
  def negFunction(pred: (String => Boolean)): String => Boolean = s => !pred(s)

  def genericNeg[A](pred: (A => Boolean)): A => Boolean = s => !pred(s)

  val neg: (String => Boolean) => (String => Boolean) = pred => (s => !pred(s))
  
  

  val empty: String => Boolean = _ == ""
  val notEmpty = neg(empty) // which type of notEmpty?
  println(notEmpty)
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  notEmpty("foo") && !notEmpty("")

  println(negFunction(empty)("foo"))

  println(genericNeg(empty)("foo"))