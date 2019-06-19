/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Duplicate the elements of a list a given number of times.
*/

import java.lang.IllegalArgumentException

object solution {
  def duplicateN[A](n: Int, ls: List[A]) : List[A] = {
    def duplicateHelper(currNum: Int, currList: List[A], v: A) : List[A] = currNum match {
      case 0 => currList
      case m => if (m < 0) throw new IllegalArgumentException else duplicateHelper(m - 1, v :: currList, v)
    }
    ls.flatMap(e => duplicateHelper(n, List(), e))
  }

  def main(args: Array[String]) : Unit = {
    println(duplicateN(3, List('a', 'b', 'c', 'c', 'd')))
  }
}
