class demo {
  def greet(): Unit= {
    println("Parent class")
  }
}

class Derived extends demo{
  override def greet(): Unit = {
    println("child class")
  }
}
object Ineritence extends App{
  val obj1 = new demo()
  obj1.greet()

  val obj2 = new Derived()
  obj2.greet()
}
