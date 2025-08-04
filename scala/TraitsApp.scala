
trait Logger{
  def log(message:String): Unit={
    println("LOG":+message)
  }
}

class Service extends Logger{
  def serve(): Unit={
    println("Service is running")
  }
}

object Main2 extends App{
  val str = new Service()
  str.serve()
}

