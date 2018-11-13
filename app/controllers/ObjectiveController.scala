package controllers

import javax.inject._
import model.Objective
import play.api.mvc._

@Singleton
class ObjectiveController @Inject()(components: ControllerComponents)
    extends AbstractController(components) {

  def index() = Action { _ =>
    Status(OK)(views.html.objectiveView(Objective.all()))
  }
}
