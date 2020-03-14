/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package net.hackbee.springcloudkafkastream;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6015117877119535467L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"net.hackbee.springcloudkafkastream\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"item\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Order to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Order from a ByteBuffer. */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence item;
  @Deprecated public double value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param item The new value for item
   * @param value The new value for value
   */
  public Order(java.lang.CharSequence id, java.lang.CharSequence item, java.lang.Double value) {
    this.id = id;
    this.item = item;
    this.value = value;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return item;
    case 2: return value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: item = (java.lang.CharSequence)value$; break;
    case 2: value = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'item' field.
   * @return The value of the 'item' field.
   */
  public java.lang.CharSequence getItem() {
    return item;
  }

  /**
   * Sets the value of the 'item' field.
   * @param value the value to set.
   */
  public void setItem(java.lang.CharSequence value) {
    this.item = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Double value) {
    this.value = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static net.hackbee.springcloudkafkastream.Order.Builder newBuilder() {
    return new net.hackbee.springcloudkafkastream.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static net.hackbee.springcloudkafkastream.Order.Builder newBuilder(net.hackbee.springcloudkafkastream.Order.Builder other) {
    return new net.hackbee.springcloudkafkastream.Order.Builder(other);
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static net.hackbee.springcloudkafkastream.Order.Builder newBuilder(net.hackbee.springcloudkafkastream.Order other) {
    return new net.hackbee.springcloudkafkastream.Order.Builder(other);
  }

  /**
   * RecordBuilder for Order instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence item;
    private double value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(net.hackbee.springcloudkafkastream.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.item)) {
        this.item = data().deepCopy(fields()[1].schema(), other.item);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(net.hackbee.springcloudkafkastream.Order other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.item)) {
        this.item = data().deepCopy(fields()[1].schema(), other.item);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public net.hackbee.springcloudkafkastream.Order.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public net.hackbee.springcloudkafkastream.Order.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'item' field.
      * @return The value.
      */
    public java.lang.CharSequence getItem() {
      return item;
    }

    /**
      * Sets the value of the 'item' field.
      * @param value The value of 'item'.
      * @return This builder.
      */
    public net.hackbee.springcloudkafkastream.Order.Builder setItem(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.item = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'item' field has been set.
      * @return True if the 'item' field has been set, false otherwise.
      */
    public boolean hasItem() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'item' field.
      * @return This builder.
      */
    public net.hackbee.springcloudkafkastream.Order.Builder clearItem() {
      item = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Double getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public net.hackbee.springcloudkafkastream.Order.Builder setValue(double value) {
      validate(fields()[2], value);
      this.value = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public net.hackbee.springcloudkafkastream.Order.Builder clearValue() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.item = fieldSetFlags()[1] ? this.item : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.value = fieldSetFlags()[2] ? this.value : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}