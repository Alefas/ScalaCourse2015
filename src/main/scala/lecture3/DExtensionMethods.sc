class Type
class TypeExt {
  def foo(x: Int) = 123
}
implicit def extType(a: Type): TypeExt =
  new TypeExt
(new Type).foo(1)