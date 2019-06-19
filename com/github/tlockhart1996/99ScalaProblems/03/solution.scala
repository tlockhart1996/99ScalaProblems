/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/18/2019

Find the kth to last element of a list
*/

import java.util.NoSuchElementException

object solution {
  def findKthElement[A](num: Int, list: List[A]) : A = {
    def recursiveKthElement[A](numToMatch: Int, currentNum: Int, innerList: List[A]) : A = {
      if(innerList.isEmpty){
        throw new NoSuchElementException
      }
      if (numToMatch == currentNum) {
        return innerList.head
      }
      return recursiveKthElement(numToMatch, currentNum + 1, innerList.tail)
    }
    return recursiveKthElement(num, 0, list)
  }

  def main(args: Array[String]) : Unit = {
    println(findKthElement(1, List(1,2,3,4,100)))
    println(findKthElement(0, List("This is the answer","a")))
    println(findKthElement(0,List()))
  }
}