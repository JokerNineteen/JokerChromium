// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/loopback_server.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Serialization of the LoopbackServerEntity and its ancestors.
 * </pre>
 *
 * Protobuf type {@code sync_pb.LoopbackServerEntity}
 */
public  final class LoopbackServerEntity extends
    com.google.protobuf.GeneratedMessageLite<
        LoopbackServerEntity, LoopbackServerEntity.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.LoopbackServerEntity)
    LoopbackServerEntityOrBuilder {
  private LoopbackServerEntity() {
  }
  /**
   * <pre>
   * Entity type mapping to one of the subclasses of LoopbackServerEntity.
   * </pre>
   *
   * Protobuf enum {@code sync_pb.LoopbackServerEntity.Type}
   */
  public enum Type
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>BOOKMARK = 1;</code>
     */
    BOOKMARK(1),
    /**
     * <code>PERMANENT = 2;</code>
     */
    PERMANENT(2),
    /**
     * <code>TOMBSTONE = 3;</code>
     */
    TOMBSTONE(3),
    /**
     * <code>UNIQUE = 4;</code>
     */
    UNIQUE(4),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>BOOKMARK = 1;</code>
     */
    public static final int BOOKMARK_VALUE = 1;
    /**
     * <code>PERMANENT = 2;</code>
     */
    public static final int PERMANENT_VALUE = 2;
    /**
     * <code>TOMBSTONE = 3;</code>
     */
    public static final int TOMBSTONE_VALUE = 3;
    /**
     * <code>UNIQUE = 4;</code>
     */
    public static final int UNIQUE_VALUE = 4;


    @java.lang.Override
    public final int getNumber() {
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return BOOKMARK;
        case 2: return PERMANENT;
        case 3: return TOMBSTONE;
        case 4: return UNIQUE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            @java.lang.Override
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return TypeVerifier.INSTANCE;
    }

    private static final class TypeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new TypeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return Type.forNumber(number) != null;
            }
          };

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sync_pb.LoopbackServerEntity.Type)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.LoopbackServerEntity.Type getType() {
    org.chromium.components.sync.protocol.LoopbackServerEntity.Type result = org.chromium.components.sync.protocol.LoopbackServerEntity.Type.forNumber(type_);
    return result == null ? org.chromium.components.sync.protocol.LoopbackServerEntity.Type.UNKNOWN : result;
  }
  /**
   * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
   * @param value The type to set.
   */
  private void setType(org.chromium.components.sync.protocol.LoopbackServerEntity.Type value) {
    type_ = value.getNumber();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
   */
  private void clearType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    type_ = 0;
  }

  public static final int ENTITY_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.SyncEntity entity_;
  /**
   * <code>optional .sync_pb.SyncEntity entity = 2;</code>
   */
  @java.lang.Override
  public boolean hasEntity() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .sync_pb.SyncEntity entity = 2;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.SyncEntity getEntity() {
    return entity_ == null ? org.chromium.components.sync.protocol.SyncEntity.getDefaultInstance() : entity_;
  }
  /**
   * <code>optional .sync_pb.SyncEntity entity = 2;</code>
   */
  private void setEntity(org.chromium.components.sync.protocol.SyncEntity value) {
    value.getClass();
  entity_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .sync_pb.SyncEntity entity = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeEntity(org.chromium.components.sync.protocol.SyncEntity value) {
    value.getClass();
  if (entity_ != null &&
        entity_ != org.chromium.components.sync.protocol.SyncEntity.getDefaultInstance()) {
      entity_ =
        org.chromium.components.sync.protocol.SyncEntity.newBuilder(entity_).mergeFrom(value).buildPartial();
    } else {
      entity_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .sync_pb.SyncEntity entity = 2;</code>
   */
  private void clearEntity() {  entity_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int MODEL_TYPE_FIELD_NUMBER = 3;
  private long modelType_;
  /**
   * <code>optional int64 model_type = 3;</code>
   * @return Whether the modelType field is set.
   */
  @java.lang.Override
  public boolean hasModelType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int64 model_type = 3;</code>
   * @return The modelType.
   */
  @java.lang.Override
  public long getModelType() {
    return modelType_;
  }
  /**
   * <code>optional int64 model_type = 3;</code>
   * @param value The modelType to set.
   */
  private void setModelType(long value) {
    bitField0_ |= 0x00000004;
    modelType_ = value;
  }
  /**
   * <code>optional int64 model_type = 3;</code>
   */
  private void clearModelType() {
    bitField0_ = (bitField0_ & ~0x00000004);
    modelType_ = 0L;
  }

  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerEntity parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.LoopbackServerEntity prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Serialization of the LoopbackServerEntity and its ancestors.
   * </pre>
   *
   * Protobuf type {@code sync_pb.LoopbackServerEntity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.LoopbackServerEntity, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.LoopbackServerEntity)
      org.chromium.components.sync.protocol.LoopbackServerEntityOrBuilder {
    // Construct using org.chromium.components.sync.protocol.LoopbackServerEntity.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return instance.hasType();
    }
    /**
     * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.LoopbackServerEntity.Type getType() {
      return instance.getType();
    }
    /**
     * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.chromium.components.sync.protocol.LoopbackServerEntity.Type value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.LoopbackServerEntity.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <code>optional .sync_pb.SyncEntity entity = 2;</code>
     */
    @java.lang.Override
    public boolean hasEntity() {
      return instance.hasEntity();
    }
    /**
     * <code>optional .sync_pb.SyncEntity entity = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.SyncEntity getEntity() {
      return instance.getEntity();
    }
    /**
     * <code>optional .sync_pb.SyncEntity entity = 2;</code>
     */
    public Builder setEntity(org.chromium.components.sync.protocol.SyncEntity value) {
      copyOnWrite();
      instance.setEntity(value);
      return this;
      }
    /**
     * <code>optional .sync_pb.SyncEntity entity = 2;</code>
     */
    public Builder setEntity(
        org.chromium.components.sync.protocol.SyncEntity.Builder builderForValue) {
      copyOnWrite();
      instance.setEntity(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .sync_pb.SyncEntity entity = 2;</code>
     */
    public Builder mergeEntity(org.chromium.components.sync.protocol.SyncEntity value) {
      copyOnWrite();
      instance.mergeEntity(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.SyncEntity entity = 2;</code>
     */
    public Builder clearEntity() {  copyOnWrite();
      instance.clearEntity();
      return this;
    }

    /**
     * <code>optional int64 model_type = 3;</code>
     * @return Whether the modelType field is set.
     */
    @java.lang.Override
    public boolean hasModelType() {
      return instance.hasModelType();
    }
    /**
     * <code>optional int64 model_type = 3;</code>
     * @return The modelType.
     */
    @java.lang.Override
    public long getModelType() {
      return instance.getModelType();
    }
    /**
     * <code>optional int64 model_type = 3;</code>
     * @param value The modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelType(long value) {
      copyOnWrite();
      instance.setModelType(value);
      return this;
    }
    /**
     * <code>optional int64 model_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelType() {
      copyOnWrite();
      instance.clearModelType();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.LoopbackServerEntity)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.LoopbackServerEntity();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "type_",
            org.chromium.components.sync.protocol.LoopbackServerEntity.Type.internalGetVerifier(),
            "entity_",
            "modelType_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002" +
              "\u1009\u0001\u0003\u1002\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.LoopbackServerEntity> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.LoopbackServerEntity.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.LoopbackServerEntity>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sync_pb.LoopbackServerEntity)
  private static final org.chromium.components.sync.protocol.LoopbackServerEntity DEFAULT_INSTANCE;
  static {
    LoopbackServerEntity defaultInstance = new LoopbackServerEntity();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LoopbackServerEntity.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.LoopbackServerEntity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LoopbackServerEntity> PARSER;

  public static com.google.protobuf.Parser<LoopbackServerEntity> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

