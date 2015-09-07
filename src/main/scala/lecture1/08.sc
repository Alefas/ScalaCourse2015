"try/catch"
def fact(n: Int): BigInt = {
  if (n <= 1) 1
  else fact(n - 1) * n
}

//todo: catch
fact(100000)