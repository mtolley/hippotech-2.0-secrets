// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FraudAnalyticsRequest.proto

package com.hippotech.fraud;

/**
 * Protobuf type {@code com.hippotech.fraud.FraudAnalyticsRequest}
 */
public  final class FraudAnalyticsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.hippotech.fraud.FraudAnalyticsRequest)
    FraudAnalyticsRequestOrBuilder {
  // Use FraudAnalyticsRequest.newBuilder() to construct.
  private FraudAnalyticsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FraudAnalyticsRequest() {
    familyName_ = "";
    cardNumber_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FraudAnalyticsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            familyName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cardNumber_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hippotech.fraud.FraudAnalyticsRequestOuterClass.internal_static_com_hippotech_fraud_FraudAnalyticsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hippotech.fraud.FraudAnalyticsRequestOuterClass.internal_static_com_hippotech_fraud_FraudAnalyticsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hippotech.fraud.FraudAnalyticsRequest.class, com.hippotech.fraud.FraudAnalyticsRequest.Builder.class);
  }

  public static final int FAMILYNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object familyName_;
  /**
   * <code>string familyName = 1;</code>
   */
  public java.lang.String getFamilyName() {
    java.lang.Object ref = familyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      familyName_ = s;
      return s;
    }
  }
  /**
   * <code>string familyName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFamilyNameBytes() {
    java.lang.Object ref = familyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      familyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CARDNUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object cardNumber_;
  /**
   * <code>string cardNumber = 2;</code>
   */
  public java.lang.String getCardNumber() {
    java.lang.Object ref = cardNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string cardNumber = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCardNumberBytes() {
    java.lang.Object ref = cardNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cardNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFamilyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, familyName_);
    }
    if (!getCardNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cardNumber_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFamilyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, familyName_);
    }
    if (!getCardNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cardNumber_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hippotech.fraud.FraudAnalyticsRequest)) {
      return super.equals(obj);
    }
    com.hippotech.fraud.FraudAnalyticsRequest other = (com.hippotech.fraud.FraudAnalyticsRequest) obj;

    boolean result = true;
    result = result && getFamilyName()
        .equals(other.getFamilyName());
    result = result && getCardNumber()
        .equals(other.getCardNumber());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FAMILYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFamilyName().hashCode();
    hash = (37 * hash) + CARDNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getCardNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hippotech.fraud.FraudAnalyticsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hippotech.fraud.FraudAnalyticsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.hippotech.fraud.FraudAnalyticsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hippotech.fraud.FraudAnalyticsRequest)
      com.hippotech.fraud.FraudAnalyticsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hippotech.fraud.FraudAnalyticsRequestOuterClass.internal_static_com_hippotech_fraud_FraudAnalyticsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hippotech.fraud.FraudAnalyticsRequestOuterClass.internal_static_com_hippotech_fraud_FraudAnalyticsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hippotech.fraud.FraudAnalyticsRequest.class, com.hippotech.fraud.FraudAnalyticsRequest.Builder.class);
    }

    // Construct using com.hippotech.fraud.FraudAnalyticsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      familyName_ = "";

      cardNumber_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hippotech.fraud.FraudAnalyticsRequestOuterClass.internal_static_com_hippotech_fraud_FraudAnalyticsRequest_descriptor;
    }

    public com.hippotech.fraud.FraudAnalyticsRequest getDefaultInstanceForType() {
      return com.hippotech.fraud.FraudAnalyticsRequest.getDefaultInstance();
    }

    public com.hippotech.fraud.FraudAnalyticsRequest build() {
      com.hippotech.fraud.FraudAnalyticsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hippotech.fraud.FraudAnalyticsRequest buildPartial() {
      com.hippotech.fraud.FraudAnalyticsRequest result = new com.hippotech.fraud.FraudAnalyticsRequest(this);
      result.familyName_ = familyName_;
      result.cardNumber_ = cardNumber_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hippotech.fraud.FraudAnalyticsRequest) {
        return mergeFrom((com.hippotech.fraud.FraudAnalyticsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hippotech.fraud.FraudAnalyticsRequest other) {
      if (other == com.hippotech.fraud.FraudAnalyticsRequest.getDefaultInstance()) return this;
      if (!other.getFamilyName().isEmpty()) {
        familyName_ = other.familyName_;
        onChanged();
      }
      if (!other.getCardNumber().isEmpty()) {
        cardNumber_ = other.cardNumber_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hippotech.fraud.FraudAnalyticsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hippotech.fraud.FraudAnalyticsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object familyName_ = "";
    /**
     * <code>string familyName = 1;</code>
     */
    public java.lang.String getFamilyName() {
      java.lang.Object ref = familyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        familyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string familyName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFamilyNameBytes() {
      java.lang.Object ref = familyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        familyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string familyName = 1;</code>
     */
    public Builder setFamilyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      familyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string familyName = 1;</code>
     */
    public Builder clearFamilyName() {
      
      familyName_ = getDefaultInstance().getFamilyName();
      onChanged();
      return this;
    }
    /**
     * <code>string familyName = 1;</code>
     */
    public Builder setFamilyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      familyName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cardNumber_ = "";
    /**
     * <code>string cardNumber = 2;</code>
     */
    public java.lang.String getCardNumber() {
      java.lang.Object ref = cardNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cardNumber = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCardNumberBytes() {
      java.lang.Object ref = cardNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cardNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cardNumber = 2;</code>
     */
    public Builder setCardNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cardNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cardNumber = 2;</code>
     */
    public Builder clearCardNumber() {
      
      cardNumber_ = getDefaultInstance().getCardNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string cardNumber = 2;</code>
     */
    public Builder setCardNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cardNumber_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.hippotech.fraud.FraudAnalyticsRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hippotech.fraud.FraudAnalyticsRequest)
  private static final com.hippotech.fraud.FraudAnalyticsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hippotech.fraud.FraudAnalyticsRequest();
  }

  public static com.hippotech.fraud.FraudAnalyticsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FraudAnalyticsRequest>
      PARSER = new com.google.protobuf.AbstractParser<FraudAnalyticsRequest>() {
    public FraudAnalyticsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FraudAnalyticsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FraudAnalyticsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FraudAnalyticsRequest> getParserForType() {
    return PARSER;
  }

  public com.hippotech.fraud.FraudAnalyticsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
