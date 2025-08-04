def devide(x:Int, y:Int):Either[String,Int] = {
  if(y==0) Left("cannot devide by zero")
  else Right(x/y)
}



object Exception2 extends App{
  devide(10,0) match{
    case Right(result) => println(s"Result:$result")
    case Left(error) => println(s"Error:$error")
  }
}
