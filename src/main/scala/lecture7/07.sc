"Implicit macros"

import a.Showable

def foo[T](x: T)(implicit t: Showable[T]) = t.print()

foo(1)
"P.S. Macros annotations?"