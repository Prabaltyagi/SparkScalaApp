name := "SparkScalaTest"

version := "0.1"

scalaVersion := "2.12.0"


libraryDependencies ++= Seq(
  "log4j" % "log4j" % "1.2.17",
  "org.apache.spark" %% "spark-core" % "2.4.4"
)

