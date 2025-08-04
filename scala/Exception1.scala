def findUser(id:Int): Option[String] = {
  if(id == 1) Some("Alice") else None
  if(id == 2) Some("Lakhan") else None
}


object Exception1 extends App{
  val user = findUser(1).getOrElse("user not found")
  println(user)
}
