// Можно накладывать условия на case clause:
val x, y: Int = 1
(x, y) match {
  case (a, b) if a == b =>

  case _ =>
}