/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Drop every Nth element from a list.
*/

object solution {
  def dropEveryN[A](n: Int, ls: List[A], currVal: Int = 1) : List[A] = (ls, currVal) match {
    case (Nil, _) => Nil
    case (head :: tail, value) => if (value == n) dropEveryN(n, tail) else head :: dropEveryN(n, tail, value + 1)
  }

  def main(args: Array[String]) : Unit = {
    println(dropEveryN(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }
}
