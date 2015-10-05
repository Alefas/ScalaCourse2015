sealed trait SumMagnet {
  type Result
  def apply(): Result
}

object SumMagnet {
  implicit def filterMagnet(
      filterTuple: (List[Int], Int => Boolean)
    ): SumMagnet { type Result = Int } =
    new SumMagnet {
      override type Result = Int

      override def apply(): Result = {
        val (list, filter) = filterTuple
        list.filter(filter).sum
      }
    }

  implicit def mapMagnet(
      mapTuple: (List[Int], Int => Int)
    ): SumMagnet { type Result = Int } =
    new SumMagnet {
      override type Result = Int

      override def apply(): Result = {
        val (list, map) = mapTuple
        list.map(map).sum
      }
    }
}

def sum(magnet: SumMagnet): magnet.Result =
  magnet.apply()

sum(List(1, 2, 3), (x: Int) => false)