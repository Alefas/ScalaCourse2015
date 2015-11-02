class D
class E extends D

class Type
class TypeExt1 {

}
class TypeExt2 {
  def foo(x: E) = 123
  def foo(x: D) = 124
}

implicit def conv1(a: Type): TypeExt1 = new TypeExt1
implicit def conv2(a: Type): TypeExt2 = new TypeExt2
val a = new Type
a.foo(new E)