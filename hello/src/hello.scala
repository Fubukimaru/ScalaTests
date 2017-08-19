object hello {
  import hi.HelloClass
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]) {
    val h = new HelloClass
    h.sayHello()

  }
}