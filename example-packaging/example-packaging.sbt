// SBT build definition for using sbt-javafx to create native installers with "drop-in" resources.
// See the following for details on JavaFX native deployment: 
//    * https://blogs.oracle.com/talkingjavadeployment/entry/native_packaging_cookbook_using_drop
//    * http://docs.oracle.com/javafx/2/deployment/packaging.htm


name := "example-packaging"

version := "1.0"

scalaVersion := "2.10.3"

jfxSettings

JFX.mainClass := Some("no.vedaadata.sbtjavafx.examples.Example")

JFX.title := "JavaFX + SBT + Drop-in Package Resources"

// `all` attempts to create all the package types build-able on the current platform.
JFX.nativeBundles := "all"

// For this example, the drop-in resources are rooted in the `./project` directory.
JFX.pkgResourcesDir <<= baseDirectory(d => Some(d + "/project"))

// Setting this to `true` sets the `verbose` attribute in the generated `crossTarget.value + "/build.xml"` file.
// By default, no effect is apparent when running sbt, but helpful packaging debug information
// is written to the console when ant is run directly.
JFX.verbose := true
