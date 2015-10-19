import java.io.File

//Local functions

//More about functions:

//todo: repeated parameters

def foo(x: Int, y: Int*) =2

foo(1, Set(1, 2, 3).toSeq: _*)
//todo: named parameters

foo(y = 1, x = 4)
//def gpp(i: Int = 1, j:Int = 3 )
1
//todo: default arguments

def h(x: Int = 1, y: Int = 2, z: Int = 3) = 1

h(z = 2)

//todo: by-name parameters

def foo1(x: Int, y: () => Int) = x + y()

foo1(1, () => 1 + 1)

def twice(body: => Unit) = {
  body
  body
}


twice {
  val a = 1
  println(a)
}

//todo: currying

def withResource(f: File)(body: => Unit) = {
  try {
    body
  } finally {
    //
  }
}

val x = ""
x.synchronized {

}

withResource(???) {

}

List(1, 2, 3).foldLeft(1) { (b, c) =>
  b + c

}


def inc(x: Int, y: Int) = x + y

val y: Int => Int = inc(1, _)

//inc(1)

val z = inc _

z(1, 2)
















