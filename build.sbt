sbtPlugin := true

name := "sbt-quickfix"

organization := "com.dscleaver.sbt"

scalaVersion := "2.10.5"

enablePlugins(GitVersioning)
git.baseVersion := "0.4.2"

scalacOptions += "-unchecked"

publishMavenStyle := false

libraryDependencies ++= Seq()

