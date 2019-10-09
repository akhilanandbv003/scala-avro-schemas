/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.examples.schemas.university

import scala.annotation.switch

/**
 * @param professorName Name of the student
 * @param subjectsTaught Subjects taught
 */
final case class Professor(var professorName: String, var subjectsTaught: Seq[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", Seq.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        professorName
      }.asInstanceOf[AnyRef]
      case 1 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          subjectsTaught map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.professorName = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.subjectsTaught = {
        value match {
          case (array: java.util.List[_]) => {
            Seq((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x.toString
            }: _*))
          }
        }
      }.asInstanceOf[Seq[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Professor.SCHEMA$
}

object Professor {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Professor\",\"namespace\":\"com.examples.schemas.university\",\"fields\":[{\"name\":\"professorName\",\"type\":\"string\",\"doc\":\"Name of the student\"},{\"name\":\"subjectsTaught\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Subjects taught\"}]}")
}