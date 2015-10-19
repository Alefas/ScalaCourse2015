class A; class B
def toInt(x: B): Int = 123
def goo(x: A) = toInt(new A)
implicit def a2b(x: A): B = new B


implicit class StringExt(s: String) extends AnyVal {
  def twice: String = s + s
}


StringExt("text").twice