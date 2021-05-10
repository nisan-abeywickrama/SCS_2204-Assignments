object Volume extends App{

  def VolumeSphere(r: Double): Double = (4/3)*(22/7)*r*r*r

  println("The volume of sphere of radius 5 is " + VolumeSphere(5))
}
