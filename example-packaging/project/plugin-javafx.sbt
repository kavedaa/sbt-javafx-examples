// addSbtPlugin("no.vedaadata" % "sbt-javafx" % "0.4.1-SNAPSHOT")


// Needs HEAD version until 0.6 is released.
lazy val root = project.in( file(".") ).dependsOn(sbtJavaFX)

lazy val sbtJavaFX = uri("https://github.com/kavedaa/sbt-javafx.git")
