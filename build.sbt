name := "projectile"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.7"

addCompilerPlugin(scalafixSemanticdb)

scalacOptions ++= List(
  "-Yrangepos",
  "-Ywarn-unused-import"
)

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)

wartremoverErrors ++= Warts.unsafe
wartremoverExcluded ++= routes.in(Compile).value

TwirlKeys.templateImports := Seq()
