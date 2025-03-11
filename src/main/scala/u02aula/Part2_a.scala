package u02aula

object Part2_a extends App :
  val v = 5
  val positive = v match
    case n if n >= 0 => "positive"
    case _ => "negative"

  def positiveMethod(x: Int) : String = x match
    case p if p >= 0 => "positive"
    case _ => "negative"

  println(positiveMethod(5))
  println(positive)
