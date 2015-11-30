package a

import scala.language.experimental.macros
import scala.reflect.macros.whitebox

trait Showable[T] {
  def print(): String
}

object Showable {
  implicit def materialize[T]: Showable[T] = macro materializeImpl[T]

  def materializeImpl[T : c.WeakTypeTag](c: whitebox.Context): c.Expr[Showable[T]] = {
    import c.universe._

    //todo:
    null
  }
}
