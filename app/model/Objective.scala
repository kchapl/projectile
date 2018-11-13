package model

case class Objective(id: Long, outcome: String)

object Objective {
  def all(): Seq[Objective] = Seq(
    Objective(1, "o1"),
    Objective(2, "o2"),
    Objective(3, "o3")
  )
}
