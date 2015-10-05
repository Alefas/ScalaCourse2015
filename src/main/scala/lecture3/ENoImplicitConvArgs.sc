class Type {
  def foo(x: Int) = 123
}
class TypeExt {
  def foo(x: TypeExt) = 124
}
implicit def conv(a: Type): TypeExt = new TypeExt
val t = new Type
t.foo(t)
