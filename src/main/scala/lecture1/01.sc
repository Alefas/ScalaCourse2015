//create Array
val a: Array[String] = new Array[String](3)

//fill a, apply

a(1) = "sadfas"
a(2) = "asdfa"
a(0) = "asdf"

a.update(0, "asdf")

//print a, update
def printArray(): Unit = {
  a.apply(0)
  println(s"${a(0)} ${a(1)} ${a(2)}")
}

printArray()
