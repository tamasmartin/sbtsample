name := "scala"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies in ThisBuild ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.pegdown" % "pegdown" % "1.4.2" % "test",
  "org.scala-lang" % "scala-library" % "2.11.8"
)

testOptions in ThisBuild += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/html-reports")

publishTo := {
  val nexus = "https://localhost:8081/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

credentials += Credentials("Nexus Repository Manager", "localhost", "admin", "admin123")

