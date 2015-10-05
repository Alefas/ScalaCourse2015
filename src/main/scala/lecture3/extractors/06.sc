//Специальный unapply (2.11)
class A {
  def _1: Int = 1
  def _2: String = "text"
}

class B {
  def isEmpty = false
  def get = new A
}

object K {
  def unapply(s: String): B = new B
}

"text" match {
  case K(i, s) =>
    println(i, s)
}