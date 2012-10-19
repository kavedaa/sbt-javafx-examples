name := "example-scala"

version := "1.0"

scalaVersion := "2.9.2"

enableJFX

JFX.mainClass := "no.vedaadata.sbtjavafx.examples.ExampleScala"

JFX.artifactBaseNameValue <<= name