//heterougenous list with append

sealed trait HList

case class HCons[+H, +T <: HList](head: H, tail: T) extends HList

case object HNil extends HList
type HNil = HNil.type


trait Appendable[L <: HList, R <: HList, Result <: HList] {
  def apply(l: L, r: R): Result
}

object Appendable {
  implicit def nilAppendable[R <: HList]: Appendable[HNil, R, R] = {
    new Appendable[HNil, R, R] {
      override def apply(l: HNil, r: R): R = r
    }
  }

  // L ||| R = Result
  // (H :: L) ||| R = (H :: Result)

  implicit def appendable[L <: HList, R <: HList, H, Result <: HList]
    (implicit a: Appendable[L, R, Result]):
    Appendable[HCons[H, L], R, HCons[H, Result]] = {
    new Appendable[HCons[H, L], R, HCons[H, Result]] {
      override def apply(l: HCons[H, L], r: R): HCons[H, Result] = {
        HCons(l.head, a(l.tail, r))
      }
    }
  }
}

def append[L <: HList, R <: HList, Result <: HList](l: L, r: R)(
  implicit appendable: Appendable[L, R, Result]
): Result = appendable(l, r)



append(HCons("", HCons(1, HCons(false, HNil))), HCons("", HNil)).tail.head

append(HNil, HNil)