class A; class B
def toInt(x: B): Int = 123
def goo(x: A) = toInt(new A)
implicit def a2b(x: A) = new B
