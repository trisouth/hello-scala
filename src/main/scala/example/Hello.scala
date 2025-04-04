package example

/*
object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
*/

object Main {
  def main(args: Array[String]): Unit = {

    println(greetWithHello("utku"))
  }

  def greetWithHello(input: String): String = {
    "hello " + input
  }
}

