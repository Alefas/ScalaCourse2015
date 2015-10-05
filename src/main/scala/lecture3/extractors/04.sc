//Можно расширять как угодно:
object Email {
  def unapply(s: String): Option[(String, String)] = {
    val parts = s.split("@")
    if (parts.length == 2) {
      Some(parts(0), parts(1))
    } else None
  }
}


"scala.course@g@mail.com" match {
  case Email(name, domain) =>

    println(name)
  case _ =>
}

