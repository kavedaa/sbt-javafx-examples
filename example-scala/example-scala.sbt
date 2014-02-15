name := "example-scala"

version := "1.0"

scalaVersion := "2.10.2"

jfxSettings

JFX.artifactBaseNameValue <<= name

JFX.mainClass := Some("no.vedaadata.sbtjavafx.examples.ExampleScala")
