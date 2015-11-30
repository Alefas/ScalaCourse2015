package a

import scala.language.experimental.macros
import scala.reflect.macros.blackbox

object Macros {
  def debug(x: => Any): Unit = macro debugImpl

  def debugImpl(c: blackbox.Context)(x: c.Expr[Any]): c.Expr[Unit] = {
    import c.universe._


    //todo:
    null
  }
}