// Index No 19000032
object Q3 extends App
{
    def addSequence(n:Int): Int = n match {
        case 1 => 1
        case _ => n + addSequence(n-1)
    }

  println("sum of numbers 1 to 5 is " + addSequence(5))

}
