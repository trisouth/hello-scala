package example

class HelloSpec extends munit.FunSuite {
  test("say hello") {
    //assertEquals(Hello.greeting, "hello")
    assertEquals(Main.greetWithHello("utku"), "hello utku")

    val result = Main.greetWithHello("utku")
    assert(result == "hello utku")
    assert(result.equals("hello utku"))
  }

  test("greetWithHello should return 'hello utku' when input is 'utku'") {
    val result = Main.greetWithHello("utku")
    assertEquals(result, "hello utku")
  }
}
