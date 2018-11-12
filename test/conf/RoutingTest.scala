package conf

import org.scalatest.{FlatSpec, Matchers, OptionValues}
import org.scalatestplus.play.guice._
import play.api.test.Helpers._
import play.api.test._

class RoutingTest
    extends FlatSpec
    with GuiceOneAppPerTest
    with Matchers
    with OptionValues {

  "/" should "render index" in {
    val request = FakeRequest(GET, "/")
    val index   = route(app, request).value
    status(index) shouldBe OK
  }
}
