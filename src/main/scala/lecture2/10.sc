"Generics in Scala"

"Scala generics" compareTo "Java generics"
/** 1. В синтаксисе используем [] вместо <>.
  * 2. Нету raw types.
  * 3. Можно использовать примитивы.
  * 4. Можно накладывать ограничения сверху и снизу.
  * 5. Есть понятие вариантности.
  */
//todo: examples?
class C
class A extends C

class D[T]

class B[T >: A <: C : D]