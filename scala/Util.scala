object Util {
   def hello(): Unit = {
     println("hello")
   }
}

object printer extends App{
  Util.hello()
}
