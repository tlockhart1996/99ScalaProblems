/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on 6/18/2019

Reverse a list
*/
// package com.github.tlockhart1996.99ScalaProblems

object solution {
  def reverseAList[A](list: List[A]) : List[A] = list match {
    case Nil => Nil
    case a :: Nil => a :: Nil
    case a :: rest => reverseAList(rest) ::: List(a)
  }

  def main(args: Array[String]) = {
    println(reverseAList(List(1,2,3,4,5)))
  }
}