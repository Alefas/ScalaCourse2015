class B
object B {
  implicit def b: B = new B
}

class A
object A {
  implicit def a(implicit b: B): A = new A
}

def foo(implicit a: A) = a

foo