"Через trait реализуется множественное наследование"
trait A {
  def foo: Int
}
trait B extends A {
  override def foo: Int = 1
}
trait C extends A {
  override def foo: Int = 2
}

class D extends B with C

val d = new D

d.foo