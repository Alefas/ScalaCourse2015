class Base; object Base {
  implicit def clazz2str(c: Clazz): String = ""
}
class Clazz extends Base; object Clazz {
  implicit def base2str(b: Base): String = ""
}
val c: String = new Clazz