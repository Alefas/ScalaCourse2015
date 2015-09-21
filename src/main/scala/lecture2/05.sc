object EarlyDefinitions {
  class A {
    val x1 = "text"
    val x2 = x1.length
  }
  class B extends {
    override val x1 = "text1"
  } with A
  def main(args: Array[String]) {
    new B
  }
}

object LazyVals {
  class A {
    lazy val x1 = "text"
    val x2 = x1.length
  }
  class B extends A {
    override lazy val x1 = "text1"
  }
  def main(args: Array[String]) {
    new B
  }
}

EarlyDefinitions.main(Array.empty)

LazyVals.main(Array.empty)