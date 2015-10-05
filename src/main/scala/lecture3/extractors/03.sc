val R = 123
val text = "text"

val `text/html` = 1

// Паттерны в виде идентификатора со строчной буквы задают переменную:
List("text") match {
  case R =>
  case `text` =>
  case text =>
  case text: List[String] =>
  case text@(1, 2) =>
}