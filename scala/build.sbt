import sbt._

organization := "sub.optimal"
name := "log4shell :: Scala demo"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  "org.apache.logging.log4j" %% "log4j-api-scala" % "12.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.14.1"
)
