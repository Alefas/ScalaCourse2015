class A
class B {
  def foo = 1
}
class C {
  def foo = 2
}
class LowPriorityImplicits {
  implicit def a2b(a: A): B = new B
}

object Implicits extends LowPriorityImplicits {
  implicit def a2c(a: A): C = new C
}

import Implicits._

val a = new A

a.foo















































