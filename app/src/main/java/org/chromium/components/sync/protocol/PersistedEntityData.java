// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/persisted_entity_data.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Sync proto to store entity data similar to what the legacy Directory used
 * to store, used to persist data locally and never sent through the wire.
 * Because it's conceptually similar to SyncEntity (actual protocol) and it's
 * unclear how big this'll grow, we've kept compatibility with SyncEntity by
 * using the same field numbers.
 * </pre>
 *
 * Protobuf type {@code sync_pb.PersistedEntityData}
 */
public  final class PersistedEntityData extends
    com.google.protobuf.GeneratedMessageLite<
        PersistedEntityData, PersistedEntityData.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.PersistedEntityData)
    PersistedEntityDataOrBuilder {
  private PersistedEntityData() {
    name_ = "";
  }
  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 8;
  private java.lang.String name_;
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    name_ = value;
  }
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   */
  private void clearName() {
    bitField0_ = (bitField0_ & ~0x00000001);
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * See corresponding fields in SyncEntity for details.
   * </pre>
   *
   * <code>optional string name = 8;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    name_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int SPECIFICS_FIELD_NUMBER = 21;
  private org.chromium.components.sync.protocol.EntitySpecifics specifics_;
  /**
   * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
   */
  @java.lang.Override
  public boolean hasSpecifics() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.EntitySpecifics getSpecifics() {
    return specifics_ == null ? org.chromium.components.sync.protocol.EntitySpecifics.getDefaultInstance() : specifics_;
  }
  /**
   * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
   */
  private void setSpecifics(org.chromium.components.sync.protocol.EntitySpecifics value) {
    value.getClass();
  specifics_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSpecifics(org.chromium.components.sync.protocol.EntitySpecifics value) {
    value.getClass();
  if (specifics_ != null &&
        specifics_ != org.chromium.components.sync.protocol.EntitySpecifics.getDefaultInstance()) {
      specifics_ =
        org.chromium.components.sync.protocol.EntitySpecifics.newBuilder(specifics_).mergeFrom(value).buildPartial();
    } else {
      specifics_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
   */
  private void clearSpecifics() {  specifics_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PersistedEntityData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.PersistedEntityData prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Sync proto to store entity data similar to what the legacy Directory used
   * to store, used to persist data locally and never sent through the wire.
   * Because it's conceptually similar to SyncEntity (actual protocol) and it's
   * unclear how big this'll grow, we've kept compatibility with SyncEntity by
   * using the same field numbers.
   * </pre>
   *
   * Protobuf type {@code sync_pb.PersistedEntityData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.PersistedEntityData, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.PersistedEntityData)
      org.chromium.components.sync.protocol.PersistedEntityDataOrBuilder {
    // Construct using org.chromium.components.sync.protocol.PersistedEntityData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * See corresponding fields in SyncEntity for details.
     * </pre>
     *
     * <code>optional string name = 8;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return instance.hasName();
    }
    /**
     * <pre>
     * See corresponding fields in SyncEntity for details.
     * </pre>
     *
     * <code>optional string name = 8;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * See corresponding fields in SyncEntity for details.
     * </pre>
     *
     * <code>optional string name = 8;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * See corresponding fields in SyncEntity for details.
     * </pre>
     *
     * <code>optional string name = 8;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * See corresponding fields in SyncEntity for details.
     * </pre>
     *
     * <code>optional string name = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * See corresponding fields in SyncEntity for details.
     * </pre>
     *
     * <code>optional string name = 8;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
     */
    @java.lang.Override
    public boolean hasSpecifics() {
      return instance.hasSpecifics();
    }
    /**
     * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.EntitySpecifics getSpecifics() {
      return instance.getSpecifics();
    }
    /**
     * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
     */
    public Builder setSpecifics(org.chromium.components.sync.protocol.EntitySpecifics value) {
      copyOnWrite();
      instance.setSpecifics(value);
      return this;
      }
    /**
     * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
     */
    public Builder setSpecifics(
        org.chromium.components.sync.protocol.EntitySpecifics.Builder builderForValue) {
      copyOnWrite();
      instance.setSpecifics(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
     */
    public Builder mergeSpecifics(org.chromium.components.sync.protocol.EntitySpecifics value) {
      copyOnWrite();
      instance.mergeSpecifics(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.EntitySpecifics specifics = 21;</code>
     */
    public Builder clearSpecifics() {  copyOnWrite();
      instance.clearSpecifics();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.PersistedEntityData)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.PersistedEntityData();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "name_",
            "specifics_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\b\u0015\u0002\u0000\u0000\u0000\b\u1008\u0000\u0015\u1009" +
              "\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.PersistedEntityData> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.PersistedEntityData.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.PersistedEntityData>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.PersistedEntityData)
  private static final org.chromium.components.sync.protocol.PersistedEntityData DEFAULT_INSTANCE;
  static {
    PersistedEntityData defaultInstance = new PersistedEntityData();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PersistedEntityData.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.PersistedEntityData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PersistedEntityData> PARSER;

  public static com.google.protobuf.Parser<PersistedEntityData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

