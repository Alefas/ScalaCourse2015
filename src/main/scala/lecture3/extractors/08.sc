import scala.util.matching.Regex

//Регулярные выражения

val Decimal: Regex = """(-)?(\d+)(\.\d*)?""".r
"1.0" match {
  case Decimal(sign, i, d) =>
  case _ =>
}
val Decimal(sign, i, d) = "1.0"
val iterator = Decimal findAllIn "1.0 and 2.0, 33"
for (Decimal(sign, i, d) <- iterator) {
  println(i)
  println(d)
}