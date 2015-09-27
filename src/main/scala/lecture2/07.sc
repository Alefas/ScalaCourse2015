import lecture2.helper._

В Scala нет полей!!!

"Все поля это свойства, для которых комплиятор созадает backing field"

class A {
  val x = 1  //def x: Int = x$
  var y = 2  //def y_=(i: Int) {y$ = i}
}

class B(val x: Int = 1)

case class C(x: Int)

C(1).x

class D(val x: Int) {
  override def hashCode(): Int = x
  override def toString(): String = s"D($x)"
  override def equals(o: Any) = ???
}

object D {
  def apply(x: Int): D = new D(x)

  def unapply = ???
}













