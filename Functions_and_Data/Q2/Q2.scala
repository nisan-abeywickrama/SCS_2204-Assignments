//Index No 19000032
object Q2 extends App{

    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);

    val res = x-y-z;
    println(res.numerator + "/" + res.denominator);
}

class Rational(x:Int, y:Int)
{
    private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a % b)
    def numerator = x / gcd(x,y);
    def denominator = y / gcd(x,y);

    def -(r: Rational) = 
        new Rational(numerator * r.denominator - r.numerator * denominator, denominator*r.denominator);
}