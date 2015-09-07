//List
val list: List[Int] = List.apply(1, 2, 3)
List.fill(2)(3)
val otherList = Nil.::(3).::(2).::(1)

//todo: map
val squares = list.map(i => i * i)
//todo: filter
val evenSquares = squares.filter(_ % 2 == 0)
//todo: foldLeft, fl0a9tMap
evenSquares.sum

list.flatMap(x => List.fill(x)(x))
