/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Rotate a list N places to the left.
*/

import java.lang.IllegalArgumentException
import java.lang.Math.abs
//TODO: Fix case of negative rotation
// -> A negative rotation can be viewed as a positive rotation that is total length - rotation amount long
// i.e. (1,2,3,4,5) rotated -2 (right 2) (4,5,1,2,3) is the same as 
// rotating by left (5-2) 3
object solution {
  def numItemsInList[A](list: List[A]) : Int = list match {
    case _ :: rest => 1 + numItemsInList(rest)
    case _ => 0
  }

  def rotateN[A](n: Int, ls: List[A]) : List[A] = (n, ls) match {
    case (_, Nil)           => Nil
    case (0, _)             => ls
    case (m, head :: tail)  => 
      if (m < 0) rotateN(abs(numItemsInList(ls) - abs(m)), ls) 
      else rotateN(m - 1, tail ::: (head :: Nil))
  }


  def main(args: Array[String]) : Unit = {
    println(rotateN(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
