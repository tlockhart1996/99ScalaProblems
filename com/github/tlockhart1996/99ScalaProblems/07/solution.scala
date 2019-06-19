/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/18/2019

Flatten a nested list structure.
Flatten should take a list and for each element, 
check if its a list or an element. 
  If its an element, add it to a running list
  If its another list, recursively 
*/

//REDO THIS OR UNDERSTAND IT BETTER?

object solution {

  def myFlatten[A](list: List[List[A]]) : List[A] = list match {
    case head :: tail => head ::: myFlatten(tail)
    case Nil => Nil
  }

  def myMap[A, B](f: (A) => B, list: List[A]) : List[B] = list match {
    case head :: tail => f(head) :: myMap(f, tail)
    case Nil => Nil
  }

  // def makeFlat(list: List[Any]) : List[Any] = {

  // }

  def main(args: Array[String]) = {
    println(myFlatten(List(List(1,2,3), List(4,5,6), List(7,8))))
    def double(i: Int) : Int = {
      return i * 2
    }
    println(myMap(double, List(1)))
  }
}
