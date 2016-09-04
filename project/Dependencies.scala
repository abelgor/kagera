import sbt.Keys._
import sbt._

object Dependencies {

  val akkaVersion = "2.4.9"
  val sprayVersion = "1.3.2"
  val scalazVersion = "7.1.3"

  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % akkaVersion
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion

  val akkaAnalyticsCassandra = "com.github.krasserm" %% "akka-analytics-cassandra" % "0.3.1"
  val akkaPersistenceCassandra = "com.typesafe.akka" %% "akka-persistence-cassandra" % "0.17"

  val graph = "com.assembla.scala-incubator" %% "graph-core" % "1.10.1"
  val graphDot = "com.assembla.scala-incubator" %% "graph-dot" % "1.10.1"

  val logback = "ch.qos.logback" % "logback-classic" % "1.1.2"
  val ficus = "net.ceedubs" %% "ficus" % "1.1.2"
  val scalaReflect = "org.scala-lang" % "scala-reflect" % "2.11.8"
  val scalatest = "org.scalatest" %% "scalatest" % "2.2.1"
  val scalazCore = "org.scalaz" %% "scalaz-core" % scalazVersion
  val scalazConcurrent = "org.scalaz" %% "scalaz-concurrent" % scalazVersion
  val shapeless = "com.chuusai" %% "shapeless" % "2.3.0"
}
