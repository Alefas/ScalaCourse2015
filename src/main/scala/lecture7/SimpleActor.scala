package lecture7

import akka.actor._

import scala.concurrent.duration._

/**
  * @author Alefas
  * @since  30/11/15
  */
object SimpleActor {
  case class Greeting(name: String)

  case object Tick
}

class SimpleActor extends Actor {
  import SimpleActor._

  context.system.scheduler.schedule(1 second, 1 second, self, Tick)

  override def receive: Receive = {
    case Tick =>

    case Greeting(name) =>
      val text = s"Hi, $name!"
      sender ! text
      println(text)
    case "Bye!" =>
      println("Bye!")
  }
}

object Main extends App {
  val system = ActorSystem.create("simple")

  val actor = system.actorOf(Props[SimpleActor], "simple")

  actor ! SimpleActor.Greeting("Alex")

  system.shutdown()
}
