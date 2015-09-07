import scala.annotation.tailrec

"Tail recursion"
@tailrec
def fact(n: Int, acc: BigInt = 1): BigInt = {
  if (n <= 1) acc
  else fact(n - 1, acc * n)
}

fact(100000) //todo: What's wrong?
