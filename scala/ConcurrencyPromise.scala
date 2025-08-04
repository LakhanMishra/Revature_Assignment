import scala.concurrent.{Await, Future, Promise}
import scala.concurrent.duration.*
import scala.concurrent.ExecutionContext.Implicits.global

object ConcurrencyPromise {
  def main(args:Array[String]): Unit={
    val promise = Promise[Int]()
    val future = promise.future

    Future{
      Thread.sleep(1000)
      promise.success(99)
    }

    val result = Await.result(future, 2.seconds)
    println(s"promise delivered : $result")
  }
}
