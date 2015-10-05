//Синтаксис:
//def unapply(m: MatchedType): Boolean
//def unapply(m: MatchedType): Option[A]
//def unapply(m: MatchedType): Option[(A1, A2, …, An)]


object Even {
  def unapply(i: Int): Option[Int] = {
    if (i % 2 == 0) Some(i / 2)
    else None
  }

  def unapply(i: String): Option[String] = {
    Some(i)
  }
}

4 match {
  case Even(Even(x)) => "I'm even"
  case _ => "I'm odd"
}