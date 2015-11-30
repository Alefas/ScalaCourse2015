package a

import scala.language.experimental.macros
import scala.reflect.macros.blackbox

object Macros {
  def debug(x: => Any): Unit = macro debugImpl

  def debugImpl(c: blackbox.Context)(x: c.Expr[Any]): c.Expr[Unit] = {
    import c.universe._


    x.tree match {
      case q"${Literal(_)}" =>
        c.Expr(q"print($x)")
      case _ =>
        val text = show(x) + " = "
        c.Expr(q"print($text + $x)")
    }
  }
}