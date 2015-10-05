//Name Shadowing

"""
  |Во внутреннем scope можно скрывать имя определенное во внешнем scope при условии,
  |что приоритет этого имени не ниже чем у имени объявленного снаружи.
  |
  |Это ошибка объявить переменные с одним именем внутри одного и того же scope.
  |
  |Существует два вида имен: expressions, types.
""".stripMargin
object A {
  val x = 1
}

object B {
  def foo(): Unit = {
    val x = 2
    if (true) {
      import A.x

      x
    }
  }
}