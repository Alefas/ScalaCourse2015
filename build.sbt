val scalaV = "2.11.7"

lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := scalaV)

lazy val macros = project.in(file("macros")).settings(commonSettings: _*).
  settings(
    name := "macros",
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaV,
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaV,
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)
  )

lazy val root = project.in(file("")).dependsOn(macros).settings(commonSettings: _*).
  settings(name := "scala-course",
    libraryDependencies += "org.scala-lang.modules" % "scala-async_2.11" % "0.9.5",
    libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.14"
  )