"В отличие от Java, в классах нету статики"
class G(x: Int)
class A(x: Int) extends G(x) {
  def this(s: String) {
    this(s.toInt)
  }

  def this() {
    this("text")
  }

  private def foo() = 1
}

"Статика отправляется в синглтон объекты"
object A {
  private[this] def z() = 1
}


"Аналог интерфейсов - trait"
trait C {
  def foo() = 1
}