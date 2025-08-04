import scala.util.{Try, Success, Failure}

def parseInt(str:String):Try[Int] = Try(str.toInt)

object Exception3 extends App{
  parseInt("123") match{
    case Success(value) =>
      println(s"parsed : $value")
    case Failure(ex) =>
      println(s"Failed : ${ex.getMessage}")
  }
}
