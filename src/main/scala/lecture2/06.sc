// Algebraic data types in Scala
"Две операции:"
"A & B - объединение типов, или умножение"

"A | B - Выбор из типов, или сложение"

sealed trait User
case class AnonymousUser(id: Int) extends User
case class LoggedUser(name: String, id: Int) extends User

val user: User = ???

user match {
  case AnonymousUser(id) =>
  case LoggedUser(name, id) =>
}

"List[A] = Nil | Cons(A, List[A])"

sealed trait List[+T] {
  def ::[B >: T](a: B): List[B] = new ::[B](a, this)
}
case object Nil extends List[Nothing]
case class ::[T](hd: T, tl: List[T]) extends List[T] {

}

1 :: Nil

//A[-T]

//A[T] <: A[S] <=> T :> S

//Function1[S, T] T => S













