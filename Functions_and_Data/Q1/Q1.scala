//Index No 19000032
object Q1 extends App
{
    val r1 = new Rational(2,5);
    val neg_r1 = r1.neg;

    println(neg_r1.numerator + "/" + neg_r1.denominator);
}

class Rational (x: Int, y:Int){
    def numerator = x;
    def denominator = y;

    def neg = new Rational(-1 * this.numerator, this.denominator);

}