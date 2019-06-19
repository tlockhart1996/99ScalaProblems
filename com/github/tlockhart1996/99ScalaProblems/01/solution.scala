/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/18/2019

Find the last element of a list
*/

import java.util.NoSuchElementException

object solution {
  def last[A](list: List[A]) : A = list match {
    case item :: Nil  => item
    case _ :: rest    => last(rest)
    case _            => throw new NoSuchElementException
  }

  def main(args: Array[String]) : Unit = {
    println(last(List(1,2,3,4,100)))
    println(last(List("a","this is the answer")))
    try {
      println(last(List()))
    } catch {
      case e: NoSuchElementException => println("Correct catch")
      case _: Throwable => println("Incorrect catch")
    } 
  }
}