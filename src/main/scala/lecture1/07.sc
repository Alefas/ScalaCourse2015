"Pattern matching" match {
  case "Extended switch for literals" =>
    2 match {
      case 2 ⇒
        print(1)
      case 4 ⇒
    }
  case "Optional type matching" =>
    val num = 1
    Map(1 → "I").get(1) match {
      case Some(num) =>
      case None =>
      case _ ⇒
    }
  case "List matching" =>
    List(1 , 2) match {
      case head :: tail ⇒
    }
  case _ =>
}

val x :: xs = List(1 ,2 , 3)

val l = List(List(1, 2), List(3, 4))

for (x :: xs ← l) yield x













//todo: match everywhere

//todo: name shadowing
