// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/nigori_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.NigoriKeyBag}
 */
public  final class NigoriKeyBag extends
    com.google.protobuf.GeneratedMessageLite<
        NigoriKeyBag, NigoriKeyBag.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.NigoriKeyBag)
    NigoriKeyBagOrBuilder {
  private NigoriKeyBag() {
    key_ = emptyProtobufList();
  }
  public static final int KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.NigoriKey> key_;
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.components.sync.protocol.NigoriKey> getKeyList() {
    return key_;
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  public java.util.List<? extends org.chromium.components.sync.protocol.NigoriKeyOrBuilder> 
      getKeyOrBuilderList() {
    return key_;
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  @java.lang.Override
  public int getKeyCount() {
    return key_.size();
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.NigoriKey getKey(int index) {
    return key_.get(index);
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  public org.chromium.components.sync.protocol.NigoriKeyOrBuilder getKeyOrBuilder(
      int index) {
    return key_.get(index);
  }
  private void ensureKeyIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.NigoriKey> tmp = key_;
    if (!tmp.isModifiable()) {
      key_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  private void setKey(
      int index, org.chromium.components.sync.protocol.NigoriKey value) {
    value.getClass();
  ensureKeyIsMutable();
    key_.set(index, value);
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  private void addKey(org.chromium.components.sync.protocol.NigoriKey value) {
    value.getClass();
  ensureKeyIsMutable();
    key_.add(value);
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  private void addKey(
      int index, org.chromium.components.sync.protocol.NigoriKey value) {
    value.getClass();
  ensureKeyIsMutable();
    key_.add(index, value);
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  private void addAllKey(
      java.lang.Iterable<? extends org.chromium.components.sync.protocol.NigoriKey> values) {
    ensureKeyIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, key_);
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  private void clearKey() {
    key_ = emptyProtobufList();
  }
  /**
   * <code>repeated .sync_pb.NigoriKey key = 2;</code>
   */
  private void removeKey(int index) {
    ensureKeyIsMutable();
    key_.remove(index);
  }

  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriKeyBag parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.NigoriKeyBag prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.NigoriKeyBag}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.NigoriKeyBag, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.NigoriKeyBag)
      org.chromium.components.sync.protocol.NigoriKeyBagOrBuilder {
    // Construct using org.chromium.components.sync.protocol.NigoriKeyBag.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.components.sync.protocol.NigoriKey> getKeyList() {
      return java.util.Collections.unmodifiableList(
          instance.getKeyList());
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    @java.lang.Override
    public int getKeyCount() {
      return instance.getKeyCount();
    }/**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.NigoriKey getKey(int index) {
      return instance.getKey(index);
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder setKey(
        int index, org.chromium.components.sync.protocol.NigoriKey value) {
      copyOnWrite();
      instance.setKey(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder setKey(
        int index, org.chromium.components.sync.protocol.NigoriKey.Builder builderForValue) {
      copyOnWrite();
      instance.setKey(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder addKey(org.chromium.components.sync.protocol.NigoriKey value) {
      copyOnWrite();
      instance.addKey(value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder addKey(
        int index, org.chromium.components.sync.protocol.NigoriKey value) {
      copyOnWrite();
      instance.addKey(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder addKey(
        org.chromium.components.sync.protocol.NigoriKey.Builder builderForValue) {
      copyOnWrite();
      instance.addKey(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder addKey(
        int index, org.chromium.components.sync.protocol.NigoriKey.Builder builderForValue) {
      copyOnWrite();
      instance.addKey(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder addAllKey(
        java.lang.Iterable<? extends org.chromium.components.sync.protocol.NigoriKey> values) {
      copyOnWrite();
      instance.addAllKey(values);
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder clearKey() {
      copyOnWrite();
      instance.clearKey();
      return this;
    }
    /**
     * <code>repeated .sync_pb.NigoriKey key = 2;</code>
     */
    public Builder removeKey(int index) {
      copyOnWrite();
      instance.removeKey(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.NigoriKeyBag)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.NigoriKeyBag();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "key_",
            org.chromium.components.sync.protocol.NigoriKey.class,
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.NigoriKeyBag> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.NigoriKeyBag.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.NigoriKeyBag>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.NigoriKeyBag)
  private static final org.chromium.components.sync.protocol.NigoriKeyBag DEFAULT_INSTANCE;
  static {
    NigoriKeyBag defaultInstance = new NigoriKeyBag();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      NigoriKeyBag.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.NigoriKeyBag getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<NigoriKeyBag> PARSER;

  public static com.google.protobuf.Parser<NigoriKeyBag> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

