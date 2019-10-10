name := "scala-avro-schemas"

version := "0.1"

scalaVersion := "2.12.7"
val confluent = "3.3.1"

libraryDependencies ++= {
  Seq(

    "org.apache.avro" % "avro" % "1.9.0"
  ).map(_.exclude("org.slf4j", "*"))
}


//This will generate case classes for the Avro schema present in src/main/avro
sbtavrohugger.SbtAvrohugger.specificAvroSettings

avroSpecificScalaSource in Compile := baseDirectory.value / "src/main/scala/"

sourceGenerators in Compile += (avroScalaGenerateSpecific in Compile).taskValue
