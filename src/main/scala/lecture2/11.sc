"Automated tupling"

object A {
  def foo(x: (Int, Int)) = {
    val (first, second) = x
    first + second
  }
}
A.foo((1, 2))
A.foo(1, 2)
A foo (1, 2)

println(1, 2, 3)