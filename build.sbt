import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.github.todokr",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "emojipolation",
    libraryDependencies ++= Seq(
      "com.vdurmont" % "emoji-java" % "3.1.3",
      scalaTest % Test
    )
  )
