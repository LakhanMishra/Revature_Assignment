trait Greeter {
  def greet(): Unit = println("Hello")
}

class FriendlyGreeter extends Greeter {
  override def greet(): Unit = println("Hey Friend")
}

object Over extends App {
  val s = new FriendlyGreeter()
  s.greet()
}
