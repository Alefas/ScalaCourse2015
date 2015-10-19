"Scala type system"
//Primitive types
//Type designators
//Parameterized types
//Tuple types
//Function types
//Infix types
//Type projections
class A {
  class B

  def foo(b: this.B) = 1

  def r(b: A#B) = 1
}
//A#B
val a: A = new A
val b: a.B = new a.B
val a1: A = new A
val b1: a1.B = new a1.B
a.r(new a1.B)

//Singleton types

class Az {

  val g = 1

  val b: this.g.type = g
}
val d = 1
val az = new Az
az.b

//Annotated types
val x: B @annotation = new B

"Advanded types:"
//Structural types
new A with B { def foo() = 1; val x = 1}

val z: A with B {def foo(): Int; val x: Int}

//Existential types
class C[T]
val c: C[_ <: Int] = new C[String]

//(Quantificator) forSome {type T <: String}

//Method types (internal type)
//Polymorphic method types (internal type)
//Type constructors (internal type)
