/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on ”06/19/2019”

Run-length encoding of a list.
*/

// TODO: Check if I can import pack from 09 and size 
//A better way to do this is to map them from list to (size, head)
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

  def encodeHelper[A](ls: List[List[A]]) : List[(Int, A)] = ls match {
    case Nil => Nil
    case list :: rest => (numItemsInList(list), list.head) :: encodeHelper(rest)
  }

  def encode[A](ls: List[A]) : List[(Int, A)] = encodeHelper(pack(ls))

  def main(args: Array[String]) : Unit = {
    println(encode((List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))))
  }
}
