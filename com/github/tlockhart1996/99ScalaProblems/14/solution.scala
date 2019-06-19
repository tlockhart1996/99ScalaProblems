/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Duplicate the elements of a list.
*/

object solution {
  def duplicate[A](ls: List[A]) : List[A] = ls match {
    case Nil => Nil
    case head :: tail => head :: head :: duplicate(tail)
  }

  def main(args: Array[String]) : Unit = {
    println(duplicate(List('a','b','c')))
  }
}
