abstract class Shape {
  def area():Double
}

class demo1(val radius:Double) extends Shape{
  override def area(): Double = Math.PI*radius*radius
}

object Value extends App{
  val obj = new demo1(2.3)
  obj.area()
}