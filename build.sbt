sbtPlugin := true

name := "sbt-docker-compose"

organization := "com.tapad"

scalaVersion := "2.12.17"

libraryDependencies += {
  "net.liftweb" %% "lift-json" % "3.0.1"
}

libraryDependencies ++= Seq(
  "org.yaml" % "snakeyaml" % "1.15",
  "org.scalatest" %% "scalatest" % "3.2.13" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test")

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs@_*) => xs match {
    case _ => MergeStrategy.discard
  }
  case PathList("scala", xs@_*) => {
    MergeStrategy.discard
  }
  case path => {
    println(path)
    MergeStrategy.first
  }
}
