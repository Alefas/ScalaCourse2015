import scala.collection.mutable

//Tuple, Map, Set

1.+(2)
(2, 3, 4)

def foo: (Int, Int) = (1, 2)

val (x, y) = foo
val m = Map(1 → "I", 2 → "II", 3 → "III")

m(1)

m + (54 → "LIV")

m.get(1)

Set("asdf", "asdf", "ASDf")

val s: mutable.HashSet[String] = mutable.HashSet.empty

s += "asdfasd"

