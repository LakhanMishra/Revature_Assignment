class Overloading {
  def add(a: Int, b: Int): Int = {
    a + b
  }

  def add(a: Double, b: Double): Double = {
    a + b
  }
}

object ADD extends App{
  val obj = new Overloading()
  obj.add(2,3)
  obj.add(2.3,3.4)
}
