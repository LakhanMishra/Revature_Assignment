import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.util.{Success,Failure}
import scala.concurrent.duration.DurationInt

object concurrencyFuture extends App{
  //asynchronous implementation
  val f = Future{
    Thread.sleep(1000)
    42
  }

  f.onComplete{
    case Success(value) => println(s"Got the result: $value")
    case Failure(e) => println(s"Error occurred: ${e.getMessage}")
  }
  Await.result(f,2.seconds)
}
