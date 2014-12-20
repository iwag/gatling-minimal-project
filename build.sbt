
val test = project.in(file("."))
  .enablePlugins(GatlingPlugin)
  .settings(libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.1" % "it,test")
  .settings(libraryDependencies += "io.gatling" % "gatling-test-framework" % "2.1.1" % "it,test")
