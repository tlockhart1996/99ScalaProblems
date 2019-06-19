/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/18/2019

Find the second to last element of a list
*/

object solution {
  def penultimate[A](list: List[A]) : A = list match {
    case a :: b :: Nil  => a
    case a :: b :: rest => penultimate(b :: rest)
    case _              => throw new NoSuchElementException
  }

  def main(args: Array[String]) : Unit = {
    println(penultimate(List(1,2,3,4,100)))
    println(penultimate(List("This is the answer","a")))
  }
}