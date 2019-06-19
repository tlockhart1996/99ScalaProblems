/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/19/2019

Eliminate consecutive duplicates of list elements.
*/

object solution {

  def compress[A](ls: List[A]) : List[A] = ls match {
    case Nil              => Nil
    case a :: Nil         => a :: Nil
    case a :: b :: Nil    => if (a == b) a :: Nil else a :: b :: Nil
    case a :: b :: tail   => if (a == b) compress(b::tail) else a :: compress(b::tail)
  }

  def main(args: Array[String]) : Unit = {
    // println(compress(List('a', 'b')))
    println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }
}
