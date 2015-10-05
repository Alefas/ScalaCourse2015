class A[T]
class B[T, S]
def foo[T, S](implicit a: A[T],
                       b: B[T, S]): S = ???
implicit val a: A[Int] = new A
implicit def b[T]: B[T, T] = new B

foo(a, b)