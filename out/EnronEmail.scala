// This file is machine-generated.

package null.scala {

import _root_.scala.collection.JavaConverters._

class TUPLE0(
    val messageId : Option[String],
    val date : Option[String],
    val from : Option[null.scala.TUPLE1],
    val subject : Option[String],
    val body : Option[String],
    val tos : Option[Seq[Option[null.scala.TUPLE2]]],
    val ccs : Option[Seq[Option[null.scala.TUPLE3]]],
    val bccs : Option[Seq[Option[null.scala.TUPLE4]]]
) extends org.apache.avro.scala.ImmutableRecordBase {

  def copy(messageId : Option[String] = this.messageId, date : Option[String] = this.date, from : Option[null.scala.TUPLE1] = this.from, subject : Option[String] = this.subject, body : Option[String] = this.body, tos : Option[Seq[Option[null.scala.TUPLE2]]] = this.tos, ccs : Option[Seq[Option[null.scala.TUPLE3]]] = this.ccs, bccs : Option[Seq[Option[null.scala.TUPLE4]]] = this.bccs): TUPLE0 =
    new TUPLE0(
      messageId = messageId,
      date = date,
      from = from,
      subject = subject,
      body = body,
      tos = tos,
      ccs = ccs,
      bccs = bccs
    )

  override def getSchema(): org.apache.avro.Schema = {
    return TUPLE0.schema
  }

  override def get(index: Int): AnyRef = {
    index match {
      case 0 => org.apache.avro.scala.Conversions.scalaToJava(messageId.getOrElse(null)).asInstanceOf[AnyRef]
      case 1 => org.apache.avro.scala.Conversions.scalaToJava(date.getOrElse(null)).asInstanceOf[AnyRef]
      case 2 => org.apache.avro.scala.Conversions.scalaToJava(from.getOrElse(null)).asInstanceOf[AnyRef]
      case 3 => org.apache.avro.scala.Conversions.scalaToJava(subject.getOrElse(null)).asInstanceOf[AnyRef]
      case 4 => org.apache.avro.scala.Conversions.scalaToJava(body.getOrElse(null)).asInstanceOf[AnyRef]
      case 5 => org.apache.avro.scala.Conversions.scalaToJava(tos.getOrElse(null)).asInstanceOf[AnyRef]
      case 6 => org.apache.avro.scala.Conversions.scalaToJava(ccs.getOrElse(null)).asInstanceOf[AnyRef]
      case 7 => org.apache.avro.scala.Conversions.scalaToJava(bccs.getOrElse(null)).asInstanceOf[AnyRef]
      case _ => throw new org.apache.avro.AvroRuntimeException("Bad index: " + index)
    }
  }

  override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
    this.messageId match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.date match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.from match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        optionalValue.encode(encoder)
      }
    }
    this.subject match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.body match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.tos match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeArrayStart()
    encoder.setItemCount(optionalValue.size)
    for (arrayItem <- optionalValue) {
      encoder.startItem()
      arrayItem match {
        case None => {
          encoder.writeIndex(0)
          encoder.writeNull()
        }
        case Some(optionalValue) => {
          encoder.writeIndex(1)
          optionalValue.encode(encoder)
        }
      }
    }
    encoder.writeArrayEnd()
      }
    }
    this.ccs match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeArrayStart()
    encoder.setItemCount(optionalValue.size)
    for (arrayItem <- optionalValue) {
      encoder.startItem()
      arrayItem match {
        case None => {
          encoder.writeIndex(0)
          encoder.writeNull()
        }
        case Some(optionalValue) => {
          encoder.writeIndex(1)
          optionalValue.encode(encoder)
        }
      }
    }
    encoder.writeArrayEnd()
      }
    }
    this.bccs match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeArrayStart()
    encoder.setItemCount(optionalValue.size)
    for (arrayItem <- optionalValue) {
      encoder.startItem()
      arrayItem match {
        case None => {
          encoder.writeIndex(0)
          encoder.writeNull()
        }
        case Some(optionalValue) => {
          encoder.writeIndex(1)
          optionalValue.encode(encoder)
        }
      }
    }
    encoder.writeArrayEnd()
      }
    }
  }

  def toMutable: MutableTUPLE0 =
    new MutableTUPLE0(
      this.messageId,
      this.date,
      this.from.map(_.toMutable),
      this.subject,
      this.body,
      this.tos,
      this.ccs,
      this.bccs
    )

  def canEqual(other: Any): Boolean =
    other.isInstanceOf[TUPLE0] ||
    other.isInstanceOf[MutableTUPLE0]
}

class MutableTUPLE0(
    var messageId : Option[String] = null,
    var date : Option[String] = null,
    var from : Option[null.scala.MutableTUPLE1] = null,
    var subject : Option[String] = null,
    var body : Option[String] = null,
    var tos : Option[scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE2]]] = null,
    var ccs : Option[scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE3]]] = null,
    var bccs : Option[scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE4]]] = null
) extends org.apache.avro.scala.MutableRecordBase[TUPLE0] {

  def this() = this(null, null, null, null, null, null, null, null)

  override def getSchema(): org.apache.avro.Schema = {
    return TUPLE0.schema
  }

  override def get(index: Int): AnyRef = {
    index match {
      case 0 => org.apache.avro.scala.Conversions.scalaToJava(messageId.getOrElse(null)).asInstanceOf[AnyRef]
      case 1 => org.apache.avro.scala.Conversions.scalaToJava(date.getOrElse(null)).asInstanceOf[AnyRef]
      case 2 => org.apache.avro.scala.Conversions.scalaToJava(from.getOrElse(null)).asInstanceOf[AnyRef]
      case 3 => org.apache.avro.scala.Conversions.scalaToJava(subject.getOrElse(null)).asInstanceOf[AnyRef]
      case 4 => org.apache.avro.scala.Conversions.scalaToJava(body.getOrElse(null)).asInstanceOf[AnyRef]
      case 5 => org.apache.avro.scala.Conversions.scalaToJava(tos.getOrElse(null)).asInstanceOf[AnyRef]
      case 6 => org.apache.avro.scala.Conversions.scalaToJava(ccs.getOrElse(null)).asInstanceOf[AnyRef]
      case 7 => org.apache.avro.scala.Conversions.scalaToJava(bccs.getOrElse(null)).asInstanceOf[AnyRef]
      case _ => throw new org.apache.avro.AvroRuntimeException("Bad index: " + index)
    }
  }

  override def put(index: Int, javaValue: AnyRef): Unit = {
    val value = org.apache.avro.scala.Conversions.javaToScala(javaValue)
    index match {
      case 0 => this.messageId = Option(value).map(value => value.toString)
      case 1 => this.date = Option(value).map(value => value.toString)
      case 2 => this.from = Option(value).map(value => value.asInstanceOf[null.scala.MutableTUPLE1])
      case 3 => this.subject = Option(value).map(value => value.toString)
      case 4 => this.body = Option(value).map(value => value.toString)
      case 5 => this.tos = Option(value).map(value => value.asInstanceOf[scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE2]]])
      case 6 => this.ccs = Option(value).map(value => value.asInstanceOf[scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE3]]])
      case 7 => this.bccs = Option(value).map(value => value.asInstanceOf[scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE4]]])
      case _ => throw new org.apache.avro.AvroRuntimeException("Bad index: " + index)
    }
  }

  def build(): TUPLE0 = {
    return new TUPLE0(
      messageId = this.messageId,
      date = this.date,
      from = this.from.map(_.build),
      subject = this.subject,
      body = this.body,
      tos = this.tos,
      ccs = this.ccs,
      bccs = this.bccs
    )
  }

  override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
    this.messageId match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.date match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.from match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        optionalValue.encode(encoder)
      }
    }
    this.subject match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.body match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeString(optionalValue)
      }
    }
    this.tos match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeArrayStart()
    encoder.setItemCount(optionalValue.size)
    for (arrayItem <- optionalValue) {
      encoder.startItem()
      arrayItem match {
        case None => {
          encoder.writeIndex(0)
          encoder.writeNull()
        }
        case Some(optionalValue) => {
          encoder.writeIndex(1)
          optionalValue.encode(encoder)
        }
      }
    }
    encoder.writeArrayEnd()
      }
    }
    this.ccs match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeArrayStart()
    encoder.setItemCount(optionalValue.size)
    for (arrayItem <- optionalValue) {
      encoder.startItem()
      arrayItem match {
        case None => {
          encoder.writeIndex(0)
          encoder.writeNull()
        }
        case Some(optionalValue) => {
          encoder.writeIndex(1)
          optionalValue.encode(encoder)
        }
      }
    }
    encoder.writeArrayEnd()
      }
    }
    this.bccs match {
      case None => {
        encoder.writeIndex(0)
        encoder.writeNull()
      }
      case Some(optionalValue) => {
        encoder.writeIndex(1)
        encoder.writeArrayStart()
    encoder.setItemCount(optionalValue.size)
    for (arrayItem <- optionalValue) {
      encoder.startItem()
      arrayItem match {
        case None => {
          encoder.writeIndex(0)
          encoder.writeNull()
        }
        case Some(optionalValue) => {
          encoder.writeIndex(1)
          optionalValue.encode(encoder)
        }
      }
    }
    encoder.writeArrayEnd()
      }
    }
  }

  def decode(decoder: org.apache.avro.io.Decoder): Unit = {
    this.messageId = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some(decoder.readString())
    }
    this.date = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some(decoder.readString())
    }
    this.from = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some({ val record = new null.scala.MutableTUPLE1(); record.decode(decoder); record })
    }
    this.subject = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some(decoder.readString())
    }
    this.body = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some(decoder.readString())
    }
    this.tos = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some({
      val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE2]]()
      var blockSize: Long = decoder.readArrayStart()
      while(blockSize != 0L) {
        for (_ <- 0L until blockSize) {
          val arrayItem = (
              decoder.readIndex() match {
                case 0 => { decoder.readNull(); None }
                case 1 => Some({ val record = new null.scala.MutableTUPLE2(); record.decode(decoder); record })
              })
          array.append(arrayItem)
        }
        blockSize = decoder.arrayNext()
      }
      array
    })
    }
    this.ccs = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some({
      val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE3]]()
      var blockSize: Long = decoder.readArrayStart()
      while(blockSize != 0L) {
        for (_ <- 0L until blockSize) {
          val arrayItem = (
              decoder.readIndex() match {
                case 0 => { decoder.readNull(); None }
                case 1 => Some({ val record = new null.scala.MutableTUPLE3(); record.decode(decoder); record })
              })
          array.append(arrayItem)
        }
        blockSize = decoder.arrayNext()
      }
      array
    })
    }
    this.bccs = decoder.readIndex() match {
      case 0 => { decoder.readNull(); None }
      case 1 => Some({
      val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE4]]()
      var blockSize: Long = decoder.readArrayStart()
      while(blockSize != 0L) {
        for (_ <- 0L until blockSize) {
          val arrayItem = (
              decoder.readIndex() match {
                case 0 => { decoder.readNull(); None }
                case 1 => Some({ val record = new null.scala.MutableTUPLE4(); record.decode(decoder); record })
              })
          array.append(arrayItem)
        }
        blockSize = decoder.arrayNext()
      }
      array
    })
    }
  }

  def canEqual(other: Any): Boolean =
    other.isInstanceOf[TUPLE0] ||
    other.isInstanceOf[MutableTUPLE0]

}

object TUPLE0 extends org.apache.avro.scala.RecordType[TUPLE0, MutableTUPLE0] {
  final val schema: org.apache.avro.Schema =
      new org.apache.avro.Schema.Parser().parse("""
          |{
          |  "type" : "record",
          |  "name" : "TUPLE_0",
          |  "fields" : [ {
          |    "name" : "message_id",
          |    "type" : [ "null", "string" ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  }, {
          |    "name" : "date",
          |    "type" : [ "null", "string" ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  }, {
          |    "name" : "from",
          |    "type" : [ "null", {
          |      "type" : "record",
          |      "name" : "TUPLE_1",
          |      "fields" : [ {
          |        "name" : "address",
          |        "type" : [ "null", "string" ],
          |        "doc" : "autogenerated from Pig Field Schema"
          |      }, {
          |        "name" : "name",
          |        "type" : [ "null", "string" ],
          |        "doc" : "autogenerated from Pig Field Schema"
          |      } ]
          |    } ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  }, {
          |    "name" : "subject",
          |    "type" : [ "null", "string" ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  }, {
          |    "name" : "body",
          |    "type" : [ "null", "string" ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  }, {
          |    "name" : "tos",
          |    "type" : [ "null", {
          |      "type" : "array",
          |      "items" : [ "null", {
          |        "type" : "record",
          |        "name" : "TUPLE_2",
          |        "fields" : [ {
          |          "name" : "address",
          |          "type" : [ "null", "string" ],
          |          "doc" : "autogenerated from Pig Field Schema"
          |        }, {
          |          "name" : "name",
          |          "type" : [ "null", "string" ],
          |          "doc" : "autogenerated from Pig Field Schema"
          |        } ]
          |      } ]
          |    } ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  }, {
          |    "name" : "ccs",
          |    "type" : [ "null", {
          |      "type" : "array",
          |      "items" : [ "null", {
          |        "type" : "record",
          |        "name" : "TUPLE_3",
          |        "fields" : [ {
          |          "name" : "address",
          |          "type" : [ "null", "string" ],
          |          "doc" : "autogenerated from Pig Field Schema"
          |        }, {
          |          "name" : "name",
          |          "type" : [ "null", "string" ],
          |          "doc" : "autogenerated from Pig Field Schema"
          |        } ]
          |      } ]
          |    } ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  }, {
          |    "name" : "bccs",
          |    "type" : [ "null", {
          |      "type" : "array",
          |      "items" : [ "null", {
          |        "type" : "record",
          |        "name" : "TUPLE_4",
          |        "fields" : [ {
          |          "name" : "address",
          |          "type" : [ "null", "string" ],
          |          "doc" : "autogenerated from Pig Field Schema"
          |        }, {
          |          "name" : "name",
          |          "type" : [ "null", "string" ],
          |          "doc" : "autogenerated from Pig Field Schema"
          |        } ]
          |      } ]
          |    } ],
          |    "doc" : "autogenerated from Pig Field Schema"
          |  } ]
          |}
      """
      .stripMargin)
  abstract class MessageIdUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableMessageIdUnionType extends MessageIdUnionType {
    def toMutable: MutableMessageIdUnionType
  }
  
  object MessageIdUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableMessageIdUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableMessageIdUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableMessageIdUnionString(data = decoder.readString())
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class MessageIdUnionNull(data: Null) extends ImmutableMessageIdUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableMessageIdUnionNull =
      MutableMessageIdUnionNull(this.data)
  }
  
  case class MessageIdUnionString(data: String) extends ImmutableMessageIdUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableMessageIdUnionString =
      MutableMessageIdUnionString(this.data)
  }
  
  abstract class MutableMessageIdUnionType
      extends MessageIdUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableMessageIdUnionType
  }
  
  object MutableMessageIdUnionType {
    def apply(data: Any): MutableMessageIdUnionType = data match {
      case null => MutableMessageIdUnionNull(null)
      case data: CharSequence => MutableMessageIdUnionString(data.toString)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableMessageIdUnionNull(var data: Null) extends MutableMessageIdUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: MessageIdUnionNull =
      MessageIdUnionNull(this.data)
  }
  
  case class MutableMessageIdUnionString(var data: String) extends MutableMessageIdUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = decoder.readString()
    }
    def toImmutable: MessageIdUnionString =
      MessageIdUnionString(this.data)
  }
  abstract class DateUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableDateUnionType extends DateUnionType {
    def toMutable: MutableDateUnionType
  }
  
  object DateUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableDateUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableDateUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableDateUnionString(data = decoder.readString())
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class DateUnionNull(data: Null) extends ImmutableDateUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableDateUnionNull =
      MutableDateUnionNull(this.data)
  }
  
  case class DateUnionString(data: String) extends ImmutableDateUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableDateUnionString =
      MutableDateUnionString(this.data)
  }
  
  abstract class MutableDateUnionType
      extends DateUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableDateUnionType
  }
  
  object MutableDateUnionType {
    def apply(data: Any): MutableDateUnionType = data match {
      case null => MutableDateUnionNull(null)
      case data: CharSequence => MutableDateUnionString(data.toString)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableDateUnionNull(var data: Null) extends MutableDateUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: DateUnionNull =
      DateUnionNull(this.data)
  }
  
  case class MutableDateUnionString(var data: String) extends MutableDateUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = decoder.readString()
    }
    def toImmutable: DateUnionString =
      DateUnionString(this.data)
  }
  abstract class FromUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableFromUnionType extends FromUnionType {
    def toMutable: MutableFromUnionType
  }
  
  object FromUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableFromUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableFromUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableFromUnionTUPLE_1(data = { val record = new null.scala.MutableTUPLE1(); record.decode(decoder); record })
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class FromUnionNull(data: Null) extends ImmutableFromUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableFromUnionNull =
      MutableFromUnionNull(this.data)
  }
  
  case class FromUnionTUPLE_1(data: null.scala.TUPLE1) extends ImmutableFromUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      data.encode(encoder)
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableFromUnionTUPLE_1 =
      MutableFromUnionTUPLE_1(this.data.toMutable)
  }
  
  abstract class MutableFromUnionType
      extends FromUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableFromUnionType
  }
  
  object MutableFromUnionType {
    def apply(data: Any): MutableFromUnionType = data match {
      case null => MutableFromUnionNull(null)
      case data: null.scala.MutableTUPLE1 => MutableFromUnionTUPLE_1(data)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableFromUnionNull(var data: Null) extends MutableFromUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: FromUnionNull =
      FromUnionNull(this.data)
  }
  
  case class MutableFromUnionTUPLE_1(var data: null.scala.MutableTUPLE1) extends MutableFromUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      data.encode(encoder)
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = { val record = new null.scala.MutableTUPLE1(); record.decode(decoder); record }
    }
    def toImmutable: FromUnionTUPLE_1 =
      FromUnionTUPLE_1(this.data.build)
  }
  abstract class SubjectUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableSubjectUnionType extends SubjectUnionType {
    def toMutable: MutableSubjectUnionType
  }
  
  object SubjectUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableSubjectUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableSubjectUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableSubjectUnionString(data = decoder.readString())
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class SubjectUnionNull(data: Null) extends ImmutableSubjectUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableSubjectUnionNull =
      MutableSubjectUnionNull(this.data)
  }
  
  case class SubjectUnionString(data: String) extends ImmutableSubjectUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableSubjectUnionString =
      MutableSubjectUnionString(this.data)
  }
  
  abstract class MutableSubjectUnionType
      extends SubjectUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableSubjectUnionType
  }
  
  object MutableSubjectUnionType {
    def apply(data: Any): MutableSubjectUnionType = data match {
      case null => MutableSubjectUnionNull(null)
      case data: CharSequence => MutableSubjectUnionString(data.toString)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableSubjectUnionNull(var data: Null) extends MutableSubjectUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: SubjectUnionNull =
      SubjectUnionNull(this.data)
  }
  
  case class MutableSubjectUnionString(var data: String) extends MutableSubjectUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = decoder.readString()
    }
    def toImmutable: SubjectUnionString =
      SubjectUnionString(this.data)
  }
  abstract class BodyUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableBodyUnionType extends BodyUnionType {
    def toMutable: MutableBodyUnionType
  }
  
  object BodyUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableBodyUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableBodyUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableBodyUnionString(data = decoder.readString())
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class BodyUnionNull(data: Null) extends ImmutableBodyUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableBodyUnionNull =
      MutableBodyUnionNull(this.data)
  }
  
  case class BodyUnionString(data: String) extends ImmutableBodyUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableBodyUnionString =
      MutableBodyUnionString(this.data)
  }
  
  abstract class MutableBodyUnionType
      extends BodyUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableBodyUnionType
  }
  
  object MutableBodyUnionType {
    def apply(data: Any): MutableBodyUnionType = data match {
      case null => MutableBodyUnionNull(null)
      case data: CharSequence => MutableBodyUnionString(data.toString)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableBodyUnionNull(var data: Null) extends MutableBodyUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: BodyUnionNull =
      BodyUnionNull(this.data)
  }
  
  case class MutableBodyUnionString(var data: String) extends MutableBodyUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeString(data)
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = decoder.readString()
    }
    def toImmutable: BodyUnionString =
      BodyUnionString(this.data)
  }
  abstract class TosUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableTosUnionType extends TosUnionType {
    def toMutable: MutableTosUnionType
  }
  
  object TosUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableTosUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableTosUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableTosUnionArrayunion(data = {
          val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE2]]()
          var blockSize: Long = decoder.readArrayStart()
          while(blockSize != 0L) {
            for (_ <- 0L until blockSize) {
              val arrayItem = (
                  decoder.readIndex() match {
                    case 0 => { decoder.readNull(); None }
                    case 1 => Some({ val record = new null.scala.MutableTUPLE2(); record.decode(decoder); record })
                  })
              array.append(arrayItem)
            }
            blockSize = decoder.arrayNext()
          }
          array
        })
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class TosUnionNull(data: Null) extends ImmutableTosUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableTosUnionNull =
      MutableTosUnionNull(this.data)
  }
  
  case class TosUnionArrayunion(data: Seq[Option[null.scala.TUPLE2]]) extends ImmutableTosUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeArrayStart()
      encoder.setItemCount(data.size)
      for (arrayItem <- data) {
        encoder.startItem()
        arrayItem match {
          case None => {
            encoder.writeIndex(0)
            encoder.writeNull()
          }
          case Some(optionalValue) => {
            encoder.writeIndex(1)
            optionalValue.encode(encoder)
          }
        }
      }
      encoder.writeArrayEnd()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableTosUnionArrayunion =
      MutableTosUnionArrayunion(scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE2]]((this.data): _*))
  }
  
  abstract class MutableTosUnionType
      extends TosUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableTosUnionType
  }
  
  object MutableTosUnionType {
    def apply(data: Any): MutableTosUnionType = data match {
      case null => MutableTosUnionNull(null)
      case data: scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE2]] => MutableTosUnionArrayunion(data)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableTosUnionNull(var data: Null) extends MutableTosUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: TosUnionNull =
      TosUnionNull(this.data)
  }
  
  case class MutableTosUnionArrayunion(var data: scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE2]]) extends MutableTosUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeArrayStart()
      encoder.setItemCount(data.size)
      for (arrayItem <- data) {
        encoder.startItem()
        arrayItem match {
          case None => {
            encoder.writeIndex(0)
            encoder.writeNull()
          }
          case Some(optionalValue) => {
            encoder.writeIndex(1)
            optionalValue.encode(encoder)
          }
        }
      }
      encoder.writeArrayEnd()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {
        val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE2]]()
        var blockSize: Long = decoder.readArrayStart()
        while(blockSize != 0L) {
          for (_ <- 0L until blockSize) {
            val arrayItem = (
                decoder.readIndex() match {
                  case 0 => { decoder.readNull(); None }
                  case 1 => Some({ val record = new null.scala.MutableTUPLE2(); record.decode(decoder); record })
                })
            array.append(arrayItem)
          }
          blockSize = decoder.arrayNext()
        }
        array
      }
    }
    def toImmutable: TosUnionArrayunion =
      TosUnionArrayunion(this.data.toList)
  }
  abstract class CcsUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableCcsUnionType extends CcsUnionType {
    def toMutable: MutableCcsUnionType
  }
  
  object CcsUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableCcsUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableCcsUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableCcsUnionArrayunion(data = {
          val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE3]]()
          var blockSize: Long = decoder.readArrayStart()
          while(blockSize != 0L) {
            for (_ <- 0L until blockSize) {
              val arrayItem = (
                  decoder.readIndex() match {
                    case 0 => { decoder.readNull(); None }
                    case 1 => Some({ val record = new null.scala.MutableTUPLE3(); record.decode(decoder); record })
                  })
              array.append(arrayItem)
            }
            blockSize = decoder.arrayNext()
          }
          array
        })
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class CcsUnionNull(data: Null) extends ImmutableCcsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableCcsUnionNull =
      MutableCcsUnionNull(this.data)
  }
  
  case class CcsUnionArrayunion(data: Seq[Option[null.scala.TUPLE3]]) extends ImmutableCcsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeArrayStart()
      encoder.setItemCount(data.size)
      for (arrayItem <- data) {
        encoder.startItem()
        arrayItem match {
          case None => {
            encoder.writeIndex(0)
            encoder.writeNull()
          }
          case Some(optionalValue) => {
            encoder.writeIndex(1)
            optionalValue.encode(encoder)
          }
        }
      }
      encoder.writeArrayEnd()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableCcsUnionArrayunion =
      MutableCcsUnionArrayunion(scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE3]]((this.data): _*))
  }
  
  abstract class MutableCcsUnionType
      extends CcsUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableCcsUnionType
  }
  
  object MutableCcsUnionType {
    def apply(data: Any): MutableCcsUnionType = data match {
      case null => MutableCcsUnionNull(null)
      case data: scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE3]] => MutableCcsUnionArrayunion(data)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableCcsUnionNull(var data: Null) extends MutableCcsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: CcsUnionNull =
      CcsUnionNull(this.data)
  }
  
  case class MutableCcsUnionArrayunion(var data: scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE3]]) extends MutableCcsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeArrayStart()
      encoder.setItemCount(data.size)
      for (arrayItem <- data) {
        encoder.startItem()
        arrayItem match {
          case None => {
            encoder.writeIndex(0)
            encoder.writeNull()
          }
          case Some(optionalValue) => {
            encoder.writeIndex(1)
            optionalValue.encode(encoder)
          }
        }
      }
      encoder.writeArrayEnd()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {
        val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE3]]()
        var blockSize: Long = decoder.readArrayStart()
        while(blockSize != 0L) {
          for (_ <- 0L until blockSize) {
            val arrayItem = (
                decoder.readIndex() match {
                  case 0 => { decoder.readNull(); None }
                  case 1 => Some({ val record = new null.scala.MutableTUPLE3(); record.decode(decoder); record })
                })
            array.append(arrayItem)
          }
          blockSize = decoder.arrayNext()
        }
        array
      }
    }
    def toImmutable: CcsUnionArrayunion =
      CcsUnionArrayunion(this.data.toList)
  }
  abstract class BccsUnionType
      extends org.apache.avro.scala.UnionData
      with org.apache.avro.scala.Encodable
  
  abstract class ImmutableBccsUnionType extends BccsUnionType {
    def toMutable: MutableBccsUnionType
  }
  
  object BccsUnionType {
    def decode(decoder: org.apache.avro.io.Decoder): MutableBccsUnionType = {
      decoder.readIndex() match {
        case 0 => return MutableBccsUnionNull(data = {decoder.readNull(); null})
        case 1 => return MutableBccsUnionArrayunion(data = {
          val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE4]]()
          var blockSize: Long = decoder.readArrayStart()
          while(blockSize != 0L) {
            for (_ <- 0L until blockSize) {
              val arrayItem = (
                  decoder.readIndex() match {
                    case 0 => { decoder.readNull(); None }
                    case 1 => Some({ val record = new null.scala.MutableTUPLE4(); record.decode(decoder); record })
                  })
              array.append(arrayItem)
            }
            blockSize = decoder.arrayNext()
          }
          array
        })
        case badIndex => throw new java.io.IOException("Bad union index: " + badIndex)
      }
    }
  }
  
  case class BccsUnionNull(data: Null) extends ImmutableBccsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableBccsUnionNull =
      MutableBccsUnionNull(this.data)
  }
  
  case class BccsUnionArrayunion(data: Seq[Option[null.scala.TUPLE4]]) extends ImmutableBccsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeArrayStart()
      encoder.setItemCount(data.size)
      for (arrayItem <- data) {
        encoder.startItem()
        arrayItem match {
          case None => {
            encoder.writeIndex(0)
            encoder.writeNull()
          }
          case Some(optionalValue) => {
            encoder.writeIndex(1)
            optionalValue.encode(encoder)
          }
        }
      }
      encoder.writeArrayEnd()
    }
    override def hashCode(): Int = { return data.hashCode() }
    def toMutable: MutableBccsUnionArrayunion =
      MutableBccsUnionArrayunion(scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE4]]((this.data): _*))
  }
  
  abstract class MutableBccsUnionType
      extends BccsUnionType
      with org.apache.avro.scala.Decodable {
    def toImmutable: ImmutableBccsUnionType
  }
  
  object MutableBccsUnionType {
    def apply(data: Any): MutableBccsUnionType = data match {
      case null => MutableBccsUnionNull(null)
      case data: scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE4]] => MutableBccsUnionArrayunion(data)
      case _ => throw new java.io.IOException("Bad union data: " + data)
    }
  }
  
  case class MutableBccsUnionNull(var data: Null) extends MutableBccsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(0)
      encoder.writeNull()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {decoder.readNull(); null}
    }
    def toImmutable: BccsUnionNull =
      BccsUnionNull(this.data)
  }
  
  case class MutableBccsUnionArrayunion(var data: scala.collection.mutable.Buffer[Option[null.scala.MutableTUPLE4]]) extends MutableBccsUnionType {
    override def getData(): Any = { return data }
    override def encode(encoder: org.apache.avro.io.Encoder): Unit = {
      encoder.writeIndex(1)
      encoder.writeArrayStart()
      encoder.setItemCount(data.size)
      for (arrayItem <- data) {
        encoder.startItem()
        arrayItem match {
          case None => {
            encoder.writeIndex(0)
            encoder.writeNull()
          }
          case Some(optionalValue) => {
            encoder.writeIndex(1)
            optionalValue.encode(encoder)
          }
        }
      }
      encoder.writeArrayEnd()
    }
    override def decode(decoder: org.apache.avro.io.Decoder): Unit = {
      this.data = {
        val array = scala.collection.mutable.ArrayBuffer[Option[null.scala.MutableTUPLE4]]()
        var blockSize: Long = decoder.readArrayStart()
        while(blockSize != 0L) {
          for (_ <- 0L until blockSize) {
            val arrayItem = (
                decoder.readIndex() match {
                  case 0 => { decoder.readNull(); None }
                  case 1 => Some({ val record = new null.scala.MutableTUPLE4(); record.decode(decoder); record })
                })
            array.append(arrayItem)
          }
          blockSize = decoder.arrayNext()
        }
        array
      }
    }
    def toImmutable: BccsUnionArrayunion =
      BccsUnionArrayunion(this.data.toList)
  }
}

}  // package null.scala
