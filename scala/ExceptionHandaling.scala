class ExceptionHandaling {
  def divide(x: Int, y: Int): Int = {
    try {
      x / y
    } catch {
      case e: ArithmeticException =>
        println("Cannot divide by zero")
        0
    } finally {
      println("Division completed")
    }
  }
}
object Handaling extends App {
  val obj = new ExceptionHandaling()

  println(obj.divide(10, 2))
  println(obj.divide(10, 0))
}
