name := "DSLHomeworkThree"

version := "0.1"

scalaVersion := "3.0.2"

val logbackVersion = "1.3.0-alpha10"
val sfl4sVersion = "2.0.0-alpha5"
val scalacticVersion = "3.2.9"



libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalacticVersion % Test,
  "org.scalatest" %% "scalatest-featurespec" % scalacticVersion % Test,
)