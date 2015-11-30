"Who already use it"

1 //Slick
2 //Async
3 //Akka
4 //SBT
5 //and many others...

import scala.concurrent.ExecutionContext
import ExecutionContext.Implicits.global
import scala.async.Async.{async, await}

def doSomething(): Unit = {
  //something slow?
}

val future = async {
  val f1 = async { doSomething(); true }
  val f2 = async { doSomething(); 42 }
  if (await(f1)) await(f2) else 0
}