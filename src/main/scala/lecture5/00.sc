//Rest of implicits
//scalapuzzlers

def foo[T](t: T, y: T => String) {}

foo("text", (s: String) => s + " ")

List(1, 2, 3).sum