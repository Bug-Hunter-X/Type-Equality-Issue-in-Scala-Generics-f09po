```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == value) {
      return x 
    } else {
      throw new IllegalArgumentException("Values are not equal")
    }
  }
}

object Main extends App {
  val myInstance = new MyClass[Int](5)
  println(myInstance.myMethod(5)) // This works fine
  println(myInstance.myMethod(6)) // This throws exception
}
```