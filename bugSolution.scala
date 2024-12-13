```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (value.equals(x)) {
      return x
    } else {
      throw new IllegalArgumentException("Values are not equal")
    }
  }
}

object Main extends App {
  val myInstance = new MyClass[Int](5)
  println(myInstance.myMethod(5)) // Works correctly
  println(myInstance.myMethod(6)) //Throws exception
  val myInstanceString = new MyClass[String]("hello")
  println(myInstanceString.myMethod("hello")) //Works correctly
  println(myInstanceString.myMethod("world")) //Throws exception
}
```