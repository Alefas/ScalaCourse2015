"Anonymous functions"

//Fun' ctional type/
val inc: Int ⇒ Int = i ⇒ i + 1

//With explicit parameter
val inc2 = (i: Int) ⇒ i + 1

//Placeholder syntax
val inc3 = (_: Int) + 1

//artially applied function syntax
List(1, 2, 3).map{
  case 1 ⇒ 2
  case 2 ⇒ 1
  case x ⇒ x + 1
}
