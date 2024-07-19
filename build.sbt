name := "spark_sql_query_builder"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "org.apache.spark" % "2.13" % "spark-core" % "3.4.0",
  "org.apache.spark" % "2.13" % "spark-sql" % "3.4.0"
)

// Optional: To avoid transitive dependencies conflicts
dependencyOverrides += "org.scala-lang" % "scala-library" % scalaVersion.value
