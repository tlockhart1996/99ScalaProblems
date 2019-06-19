/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Split a list into two parts.
*/

object solution {
  def splitListN[A](n: Int, ls: List[A], currList: List[A] = List()) : (List[A], List[A]) = (n, ls) match {
    case (_, Nil)           => (Nil,Nil)
    case (0, _)             => (currList, ls)
    case (m, head :: tail)  => splitListN(m - 1, tail, currList ::: (head :: Nil) )
  }

  def main(args: Array[String]) : Unit = {
    println(splitListN(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }
}
