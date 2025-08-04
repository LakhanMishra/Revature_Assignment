class Person(val name: String, var age: Int) {
  def greet(): Unit = println(s"Hi I am $name and age my is $age")
}

object Details extends App{
  val p = new Person("Lakhan", 22)
  p.greet()
}
