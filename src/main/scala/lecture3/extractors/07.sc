//Строки
//Многострочные литералы:
val s =
  """
    |Some text.
    |<- This is margin.
    |It will be stripped below.
  """.stripMargin

//Интерполированые строки
//Можно использовать разные интерполяторы. Дефолтные - это s и f:
val name = "Alexander"
val city = "Saint-Petersburg"

s"My name is $name. I live in $city."
val height = 1.8311d
f"$name%s’s height is $height%2.2f"