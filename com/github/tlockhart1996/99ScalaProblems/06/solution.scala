/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/18/2019

Find out whether a list is a palindrome
*/

object solution {

  def reverseAList[A](list: List[A]) : List[A] = list match {
    case Nil => Nil
    case a :: Nil => a :: Nil
    case a :: rest => reverseAList(rest) ::: List(a)
  }

  def isPalindrome[A](list: List[A]) : Boolean = {
    def equalLists(list1: List[A], list2: List[A]) : Boolean = (list1, list2) match {
      case (a :: tail1, b :: tail2) => if (a != b) false else equalLists(tail1, tail2)
      case (Nil, Nil) => true
      case (Nil, _) => false
      case (_, Nil) => false
    }
    return equalLists(list, reverseAList(list))
  }

  def main(args: Array[String]) = {
    println(isPalindrome(List(1,2,3,2,1,0)))
  }
}
