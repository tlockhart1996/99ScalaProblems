/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Decode a run-length encoded list.
*/

object solution {

  def unpackList[A](tup: (Int, A)) : List[A] = tup match {
    case (0, _) => Nil
    case (1, a) => a :: Nil
    case (b, c) => c :: unpackList((b - 1, c))
  }

  def decode[A](ls: List[(Int, A)]) : List[A] = ls.flatMap(e => unpackList(e))

  def main(args: Array[String]) : Unit = {
    println(unpackList((4, 'a')))
    println(decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))))
  }
}
