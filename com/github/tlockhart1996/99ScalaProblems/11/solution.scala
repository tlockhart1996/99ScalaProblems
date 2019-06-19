/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Modified run-length encoding.
*/

object solution {
  
  def numItemsInList[A](list: List[A]) : Int = list match {
    case _ :: rest => 1 + numItemsInList(rest)
    case _ => 0
  }

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

  // def modifiedEncodeHelper[A](ls: List[List[A]]) : List[Any] = ls match {
  //   case Nil => Nil
  //   case list :: rest => (numItemsInList(list), list.head) :: modifiedEncodeHelper(rest)
  // }

  //Done with map, inefficient to redo num items twice
  //TODO: Don't need to do this counting twice, could save a traversal
  def modifiedEncode[A](ls: List[A]) : List[Any] = pack(ls) map (e => if (numItemsInList(e) == 1) e.head else (numItemsInList(e), e.head))

  def main(args: Array[String]) : Unit = {
    println(modifiedEncode((List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))))
  }
}
