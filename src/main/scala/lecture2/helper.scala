package lecture2

/**
 * @author Alefas
 * @since 31/03/15.
 */
object helper {
  implicit class StringActivity(s: String) {
    def vs(other: String)(body: => Unit) = new {
      def apply(x: Unit): Unit = {}
    }
  }

  val нет: Any = null
  val !!! : Any =  null
  object В {
    def Scala(o: Any) = new {def полей(x: Any): Unit = {}}
  }
}