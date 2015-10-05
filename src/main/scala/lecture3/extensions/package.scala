package object extensions {
  implicit class StringExtension(val s: String) extends AnyVal {
    def twice: String = s + s
  }
}
