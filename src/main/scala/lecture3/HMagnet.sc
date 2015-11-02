sealed trait SumMagnet {
  type Result
  implicit val n: Numeric[Result]
  def apply(): List[Result]
}

object SumMagnet {
  implicit def filterMagnet[T : Numeric](
      filterTuple: (List[T], T => Boolean)
    ): SumMagnet { type Result = T } =
    new SumMagnet {
      override type Result = T

      override def apply(): List[Result] = {
        val (list, filter) = filterTuple
        list.filter(filter)
      }

      override val n: Numeric[Result] = implicitly
    }

  implicit def mapMagnet(
      mapTuple: (List[Int], Int => Int)
    ): SumMagnet { type Result = Int } =
    new SumMagnet {
      override type Result = Int

      override def apply(): List[Result] = {
        val (list, map) = mapTuple
        list.map(map)
      }

      override val n: Numeric[Int] = implicitly
    }
}

def sum(magnet: SumMagnet): magnet.Result = {
  val apply = magnet.apply()
  import magnet._
  apply.sum
}

sum(List(1, 2, 3), (x: Int) => false)