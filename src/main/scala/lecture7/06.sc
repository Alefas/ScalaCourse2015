"Error handling"

import scala.reflect.macros.blackbox
val c: blackbox.Context = null

c.error(c.enclosingPosition, "It's bad idea...")