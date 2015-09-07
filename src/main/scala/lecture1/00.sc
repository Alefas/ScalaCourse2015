//todo: What is Scala?

val x = 1

//define method isPrime
def isPrime(n: Int) = n > 1 && (2 until n).forall(n % _ != 0)

//print all primes from 1 to 100
for {
  i <- 1 to 100
  if isPrime(i)
}
  print(i + " ")
