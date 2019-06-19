/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Extract a slice from a list.
*/

object solution {
  def slice[A](start: Int, end: Int, ls: List[A]) : List[A] = ls.drop(start).take((end - start) max 0)

  def main(args: Array[String]) : Unit = {
    println(slice(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }
}
