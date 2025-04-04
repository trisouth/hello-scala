import Dependencies._

ThisBuild / scalaVersion     := "2.12.17"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "hello-scala",

    libraryDependencies ++= Seq(
      // Adding Spark dependencies
      "org.apache.spark" %% "spark-core" % "3.4.4",  // Spark Core
      "org.apache.spark" %% "spark-sql"  % "3.4.4",  // Spark SQL (for SparkSession)
      
      // Testing library (e.g., munit)
      munit % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
