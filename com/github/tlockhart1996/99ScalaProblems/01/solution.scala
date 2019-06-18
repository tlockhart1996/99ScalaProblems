object solution {
  def Last(list: List[Any]) : Any = {
    if (list.isEmpty) 
      return null
    if (list.tail.isEmpty)
      return list.head
    return Last(list.tail)
  }

  def main(args: Array[String]) : Unit = {
    println(Last(List(1,2,3,4,100)))
    println(Last(List("a","this is the answer")))
    println(Last(List()))
  }
}