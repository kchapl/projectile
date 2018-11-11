package conf

import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.play.guice._
import play.api.test.Helpers._
import play.api.test._

class RoutingTest extends FlatSpec with GuiceOneAppPerTest with Matchers {

  "/" should "render index" in {
    val request = FakeRequest(GET, "/")
    val index   = route(app, request).get
    status(index) shouldBe OK
  }
}
