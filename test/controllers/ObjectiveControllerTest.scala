package controllers

import org.scalatest.{FlatSpec, Matchers}

class ObjectiveControllerTest extends FlatSpec with Matchers {

  "objectiveList" should "list objectives" in {
    ObjectiveController.objectiveList().header.status shouldBe 200
  }
}
