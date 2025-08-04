class CustomException(message: String) extends Exception(message)

def validateAge(age: Int): Unit = {
  if (age >= 18)
    println("Valid age")
  else
    throw new CustomException("Age must be 18 or more")
}

object CustomExceptionDemo extends App {
  try {
    validateAge(17)
  } catch {
    case e: CustomException => println(s"Custom Exception: ${e.getMessage}")
  }
}
