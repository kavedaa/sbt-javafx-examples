# Packaging Example for `sbt-javafx`

SBT build definition for using sbt-javafx to create native installers with "drop-in" resources.

To create packaged installer:

    sbt package-javafx


Generated artifacts will be found here:

    target/scala-*/example-packaging_*/bundles

See the following for more details on JavaFX native deployment: 

* [Native Packaging Cookbook](https://blogs.oracle.com/talkingjavadeployment/entry/native_packaging_cookbook_using_drop)
* [JavaFX Deployment](http://docs.oracle.com/javafx/2/deployment/packaging.htm)
