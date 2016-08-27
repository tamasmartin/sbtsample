name := "scala"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test->*" excludeAll (
  ExclusionRule(organization = "org.junit", name = "junit")
  )

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/html-reports")
