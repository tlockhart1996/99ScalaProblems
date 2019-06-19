/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/18/2019

Find the number of items in a list
*/

object solution {
  def numItemsInList[A](list: List[A]) : Int = list match {
    case _ :: rest => 1 + numItemsInList(rest)
    case _ => 0
  }

  def main(args: Array[String]) : Unit = {
    println(numItemsInList(List(1,2,3,4)))
    println(numItemsInList(List(1,2,3,4,5)))
    println(numItemsInList(List(1,2,3,4,5,6)))
    println(numItemsInList(List(1,2,3,4,5,6,7)))
  }
}