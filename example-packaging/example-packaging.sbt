// SBT build definition for using sbt-javafx to create native installers with "drop-in" resources.
// See README.md for more information.

name := "example-packaging"

version := "1.0"

scalaVersion := "2.10.3"

jfxSettings

JFX.mainClass := Some("no.vedaadata.sbtjavafx.examples.Example")

JFX.title := "JavaFX + SBT + Drop-in Package Resources"

// `all` attempts to create all the package types build-able on the current platform.
JFX.nativeBundles := "all"

// For this exampole, the drop-in resources are rooted in the `./src/deploy` directory.
// This is also the default value.
JFX.pkgResourcesDir := baseDirectory.value + "/src/deploy"

// Setting this to `true` sets the `verbose` attribute in the generated `crossTarget.value + "/build.xml"` file.
// By default, no effect is apparent when running sbt, but helpful packaging debug information
// is written to the console when ant is run directly (i.e. run `ant` on the generated `build.xml` file) .
JFX.verbose := true
