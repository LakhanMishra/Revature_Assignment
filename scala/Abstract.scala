abstract class Abstract {
  def sound(): Unit
  def animalSound(): Unit= println("Animal sound")
}

class Child extends Abstract{
  override def sound(): Unit = {
    println("Dog sound.....")
  }
}
object Call extends App{
  val obj = new Child()
  obj.animalSound()
  obj.sound()
}


