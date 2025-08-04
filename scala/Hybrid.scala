trait Animal1 {
  def eat(): Unit = println("Animal eats")
}

trait Pet {
  def play(): Unit = println("Pet plays")
}

class Dog1 extends Animal1 {
  override def eat(): Unit = println("Dog eats bones")
}

class Puppy1 extends Dog1 with Pet {
  def weep(): Unit = println("Puppy weeps")
}

object HybridInheritance extends App {
  val p = new Puppy1()
  p.eat()
  p.play()
  p.weep()
}
