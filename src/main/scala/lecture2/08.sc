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

  def foo(b: B) = 1
}
//A#B
//val a: A
//a.B
//a.foo(new a.B)

//Singleton types
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
