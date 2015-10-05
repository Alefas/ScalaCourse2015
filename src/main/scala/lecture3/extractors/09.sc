//unapplySeq

object ListLike {
  def unapplySeq[T](l: List[T]): Option[Seq[T]] =
    Some(l)
}
List(1, 2, 3) match{
  case ListLike(1, xs@_*) =>
    println(xs)
  case _ =>
}