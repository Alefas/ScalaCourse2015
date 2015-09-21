"Infix types"

type n[A] = A => Nothing
type ++[T, U] = n[n[T] with n[U]]
type nn[A] = n[n[A]]
type |+|[T, U] = { type λ[X] = nn[X] <:< (T ++ U) }
def size[T : (Int |+| String)#λ] (t: T) = t match {
  case i: Int => i
  case s: String => s.length
}

size(1)
size("text")