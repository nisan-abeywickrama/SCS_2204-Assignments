// Index No 19000032
object Q2 extends App
{
    def gcd(a: Int, b: Int): Int =  b match {
        case 0 => a
        case x if x > a => gcd(x, a)
        case x => gcd (x, a%x);
    
    }

    def prime(p:Int, n:Int=2):Boolean = n match{
        case x if (x==p) => true
        case x if gcd(p, x)> 1 => false
        case x => prime(p, x+1)
    }
    
    def primeSequence(n:Int, m:Int = 2): Any = {
        if(m < n){
            if(prime(m) == true)
                print(s"$m ");
            primeSequence(n,m+1);
        }
    }

 primeSequence(10);
}