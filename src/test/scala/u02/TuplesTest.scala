package u02

import org.junit.*
import org.junit.Assert.*

class TuplesTest:

  val tuple = ("a", 10)

  @Test def testMatches() =
    assertTrue(tuple match {case (x, 10) => true; case _ => false})
    assertTrue: // significant indentation style
      tuple match 
        case ("a", 10) => true
        case _ => false
    
  @Test def testEquality() =
    assertEquals(tuple, Tuple2("a", 10))
    assertNotEquals(tuple, ("a", 11))

  @Test def testSwap() =
    def swap[A, B](t: (A, B)): (B, A) = t match
      case (a, b) => (b, a)  
    assertEquals(("a", 10), swap((10, "a")))
    