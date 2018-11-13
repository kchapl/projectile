package model

import org.scalatest.{FlatSpec, Matchers}

class ObjectiveTest extends FlatSpec with Matchers {

  "all" should "fetch all objectives" in {
    Objective.all() shouldBe Seq(
      Objective(1, "o1"),
      Objective(2, "o2"),
      Objective(3, "o3")
    )
  }
}
