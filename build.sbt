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
  "com.google.apis" % "google-api-services-sheets" % "v4-rev551-1.25.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

wartremoverErrors ++= Warts.unsafe
wartremoverExcluded ++= routes.in(Compile).value

TwirlKeys.templateImports := Seq()
