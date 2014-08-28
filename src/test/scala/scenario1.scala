package scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Sim1 extends Simulation {

  val scn = scenario("test")
    .exec(http("Acc").get("http://github.com/").check(status.is(200))).pause(0)
  
  setUp(scn.inject(atOnceUsers(10)))
}

