
val test = project.in(file("."))
  .enablePlugins(GatlingPlugin)
  .settings(resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
  .settings(libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.0.0-SNAPSHOT" % "it,test")
  .settings(libraryDependencies += "io.gatling" % "gatling-bundle" % "2.0.0-SNAPSHOT" % "test" artifacts Artifact("gatling-bundle", "zip", "zip", "bundle"))
  .settings(libraryDependencies += "io.gatling" % "test-framework" % "1.0-SNAPSHOT" % "it,test")
