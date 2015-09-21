//Linearization
trait A
trait B extends A
trait C
trait D extends A
trait E extends D with C
trait F extends B
class G extends E with F

new G //todo: trait list?