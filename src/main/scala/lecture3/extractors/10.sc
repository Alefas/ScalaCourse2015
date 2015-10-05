//infix patterns
object ** {
  def unapply(t: (Int, Int)): Some[(Int, Int)] = Some(t)
}
val x, y: Int = 1
(x, y) match {
  case (1, 2) | (2, 1) =>
  case 1 ** 1 =>
}

1 :: 2 :: Nil match {
  case 1 :: 2 :: xs =>
}