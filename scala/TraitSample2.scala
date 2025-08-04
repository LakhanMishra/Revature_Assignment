trait printable {
  def print(): Unit = println("Printing")
}

trait Scannable {
  def scan(): Unit = println("Scanning")
}

class MultiFunctionPrinter extends  printable with Scannable

object Main extends App{
  val mfp = new MultiFunctionPrinter()
  mfp.print()
  mfp.scan()
}
