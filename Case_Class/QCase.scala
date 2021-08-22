import scala.math._;
object QCase extends App {

    var p1 = Point(5,3)
    var p2 = Point(1,0)
    println("P1 => " + p1)
    println("P2 => " + p2)

    var p3 = p1 + p2
    println("\n1. add p1 and p2 = " + p3)
    
    p1.move(1,2)
    println("\n2. move p1 by (1,2) = " + (p1.x, p1.y))

    var dist = p1.distance(p2)
    println("\n3. distance between p1 and p2 = " + dist)
 
    p1.invert()
    println("\n4. switch the x and y coordinates of p1 (x,y) = " + (p1.x, p1.y) )
 

}

case class Point(a: Int, b: Int){
    var x: Int = a
    var y: Int = b

    def +(p2: Point): Point = Point(x + p2.x, y + p2.y)
    

    def move(dx: Int, dy: Int): Unit = {
        this.x = this.x + dx
        this.y = this.y + dy
    }

    def distance(p2: Point): Double = sqrt(pow(p2.x-x,2) + pow(p2.y-y,2))
    
    def invert(): Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }
}