"Implicit macros"

import a.Showable

def foo[T](x: T)(implicit t: Showable[T]) = t.print()

foo(List(1, 2, 3))(a.Showable.materialize[List[Int]])
"P.S. Macros annotations?"