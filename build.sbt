name := "projectile"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.19"

addCompilerPlugin(scalafixSemanticdb)

scalacOptions ++= List(
  "-Yrangepos",
  "-Ywarn-unused-import"
)

libraryDependencies ++= Seq(
  guice,
  "com.google.apis" % "google-api-services-sheets" % "v4-rev20230815-2.0.0",
  "org.scalatest" %% "scalatest" % "3.0.9" % Test
)

wartremoverErrors ++= Warts.unsafe
wartremoverExcluded ++= routes.in(Compile).value

TwirlKeys.templateImports := Seq()
