
class Animal {
  def sound(): Unit = {
    println("Animal makes a sound")
  }
}

class Dog extends Animal {
  override def sound(): Unit = {
    println("Dog barks")
  }
}

class Puppy extends Dog {
  override def sound(): Unit = {
    println("Puppy yelps")
  }
}


object MultilevelInheritance extends App {
  val animal = new Animal()
  animal.sound()

  val dog = new Dog()
  dog.sound()

  val puppy = new Puppy()
  puppy.sound()
}

