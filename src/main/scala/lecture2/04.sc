//initialization problems

class A {
  val x1 = "text"
  val x2 = x1.length
}

class B extends A {
  override val x1 = "text1"
}

new B