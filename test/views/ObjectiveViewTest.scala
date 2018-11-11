package views

import model.Objective
import org.scalatest.{FlatSpec, Matchers}

class ObjectiveViewTest extends FlatSpec with Matchers {

  "objectiveView" should "contain description of each objective" in {
    val model = Seq(Objective(1, "o1"))
    val view  = views.html.objectiveView(model)
    view.toString should include("o1")
  }
}
