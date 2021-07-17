// Index No 19000032
object Q5 extends App
{

    def sumofeven(n:Int): Int = n match {
        case 2 => 2
        case x if (x%2 == 0) => x + sumofeven(x-1)
        case _ => sumofeven(n-1)
    }

    println("sum of even numbers less than 10 is " + sumofeven(10))

}
