class Type

class T extends Container
class D[T]

class Container
object Container {
  implicit def conv(c: Child): Type = new Type
}
class Child extends D[T]

val x: Type = new Child