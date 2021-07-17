// Index No 19000032
object Q1 extends App
{
    def gcd(a: Int, b: Int): Int =  b match{
        case 0 => a;
        case x if x > a => gcd(x, a)
        case _  => gcd(b, a%b)
    }


    def prime(p:Int, n:Int=2):Boolean = n match {
        
        case x if (x==p) => true
        case x if gcd(p, x)> 1 => false
        case x => prime(p, x+1)
    
    
    }

  println("Is 5 a prime number: " + prime(5))
  println("Is 8 a prime number: " + prime(8))
}
