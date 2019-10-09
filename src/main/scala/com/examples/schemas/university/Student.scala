/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.examples.schemas.university

import scala.annotation.switch

/**
 * @param studentName Name of the student
 * @param cwid CWID of the student
 * @param level Phd/Graduate/UnderGraduate
 */
final case class Student(var studentName: String, var cwid: String, var level: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        studentName
      }.asInstanceOf[AnyRef]
      case 1 => {
        cwid
      }.asInstanceOf[AnyRef]
      case 2 => {
        level
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.studentName = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.cwid = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.level = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Student.SCHEMA$
}

object Student {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Student\",\"namespace\":\"com.examples.schemas.university\",\"fields\":[{\"name\":\"studentName\",\"type\":\"string\",\"doc\":\"Name of the student\"},{\"name\":\"cwid\",\"type\":\"string\",\"doc\":\"CWID of the student\"},{\"name\":\"level\",\"type\":\"string\",\"doc\":\"Phd/Graduate/UnderGraduate\"}]}")
}