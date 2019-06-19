/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Pack consecutive duplicates of list elements into sublists.
*/

object solution {

  //Try a solution that passes the current item in and the current list
  def pack[A](ls: List[A]) : List[List[A]] = {
    def func[A](currList: List[A], runningList: List[A]) : List[List[A]] = (currList, runningList) match {
      case (currHead :: currTail, runningHead :: runningTail) => 
        if (currHead == runningHead) func(currTail, currHead :: runningHead :: runningTail)
        else runningList :: func(currList, List())
      case (currHead :: currTail, Nil) => func(currTail, currHead :: Nil)
      case (Nil, runningHead :: runningTail) => (runningHead :: runningTail) :: Nil
      case (Nil, Nil) => Nil
    }
    func(ls, List())
  }

  def main(args: Array[String]) : Unit = {
    println("Hello world")
    println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }
}
