package controllers

import javax.inject._
import model.Objective
import play.api.http.Status._
import play.api.mvc.Results.Status
import play.api.mvc._

@Singleton
class ObjectiveController @Inject()(components: ControllerComponents) extends AbstractController(components) {

  def index() = Action { implicit request: Request[AnyContent] =>
    ObjectiveController.objectiveList()
  }
}

object ObjectiveController {

  def objectiveList(): Result = {
    val model = Seq(Objective(1, "o1"), Objective(2, "o2"), Objective(3, "o3"))
    val view  = views.html.objectiveView(model)
    Status(OK)(view)
  }
}
