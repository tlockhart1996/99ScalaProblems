cd com/github/tlockhart1996/99ScalaProblems 
mkdir $1
cd $1
echo "/*
Taylor Lockhart
Question found from : http://aperiodic.net/phil/scala/s-99/
Solution Written on $(date +”%m/%d/%Y”)

$2
*/

object solution {
  def main(args: Array[String]) : Unit = {
    println("Hello world")
  }
}" > solution.scala