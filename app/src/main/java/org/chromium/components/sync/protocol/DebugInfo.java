// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/client_debug_info.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.DebugInfo}
 */
public  final class DebugInfo extends
    com.google.protobuf.GeneratedMessageLite<
        DebugInfo, DebugInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.DebugInfo)
    DebugInfoOrBuilder {
  private DebugInfo() {
    events_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int EVENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.DebugEventInfo> events_;
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.components.sync.protocol.DebugEventInfo> getEventsList() {
    return events_;
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  public java.util.List<? extends org.chromium.components.sync.protocol.DebugEventInfoOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.DebugEventInfo getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  public org.chromium.components.sync.protocol.DebugEventInfoOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }
  private void ensureEventsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.DebugEventInfo> tmp = events_;
    if (!tmp.isModifiable()) {
      events_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void setEvents(
      int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.set(index, value);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addEvents(org.chromium.components.sync.protocol.DebugEventInfo value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.add(value);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addEvents(
      int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.add(index, value);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void addAllEvents(
      java.lang.Iterable<? extends org.chromium.components.sync.protocol.DebugEventInfo> values) {
    ensureEventsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, events_);
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void clearEvents() {
    events_ = emptyProtobufList();
  }
  /**
   * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
   */
  private void removeEvents(int index) {
    ensureEventsIsMutable();
    events_.remove(index);
  }

  public static final int CRYPTOGRAPHER_READY_FIELD_NUMBER = 2;
  private boolean cryptographerReady_;
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   * @return Whether the cryptographerReady field is set.
   */
  @java.lang.Override
  public boolean hasCryptographerReady() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   * @return The cryptographerReady.
   */
  @java.lang.Override
  public boolean getCryptographerReady() {
    return cryptographerReady_;
  }
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   * @param value The cryptographerReady to set.
   */
  private void setCryptographerReady(boolean value) {
    bitField0_ |= 0x00000001;
    cryptographerReady_ = value;
  }
  /**
   * <pre>
   * Whether cryptographer is ready to encrypt and decrypt data.
   * </pre>
   *
   * <code>optional bool cryptographer_ready = 2;</code>
   */
  private void clearCryptographerReady() {
    bitField0_ = (bitField0_ & ~0x00000001);
    cryptographerReady_ = false;
  }

  public static final int CRYPTOGRAPHER_HAS_PENDING_KEYS_FIELD_NUMBER = 3;
  private boolean cryptographerHasPendingKeys_;
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   * @return Whether the cryptographerHasPendingKeys field is set.
   */
  @java.lang.Override
  public boolean hasCryptographerHasPendingKeys() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   * @return The cryptographerHasPendingKeys.
   */
  @java.lang.Override
  public boolean getCryptographerHasPendingKeys() {
    return cryptographerHasPendingKeys_;
  }
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   * @param value The cryptographerHasPendingKeys to set.
   */
  private void setCryptographerHasPendingKeys(boolean value) {
    bitField0_ |= 0x00000002;
    cryptographerHasPendingKeys_ = value;
  }
  /**
   * <pre>
   * Cryptographer has pending keys which indicates the correct passphrase
   * has not been provided yet.
   * </pre>
   *
   * <code>optional bool cryptographer_has_pending_keys = 3;</code>
   */
  private void clearCryptographerHasPendingKeys() {
    bitField0_ = (bitField0_ & ~0x00000002);
    cryptographerHasPendingKeys_ = false;
  }

  public static final int EVENTS_DROPPED_FIELD_NUMBER = 4;
  private boolean eventsDropped_;
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   * @return Whether the eventsDropped field is set.
   */
  @java.lang.Override
  public boolean hasEventsDropped() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   * @return The eventsDropped.
   */
  @java.lang.Override
  public boolean getEventsDropped() {
    return eventsDropped_;
  }
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   * @param value The eventsDropped to set.
   */
  private void setEventsDropped(boolean value) {
    bitField0_ |= 0x00000004;
    eventsDropped_ = value;
  }
  /**
   * <pre>
   * Indicates client has dropped some events to save bandwidth.
   * </pre>
   *
   * <code>optional bool events_dropped = 4;</code>
   */
  private void clearEventsDropped() {
    bitField0_ = (bitField0_ & ~0x00000004);
    eventsDropped_ = false;
  }

  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.DebugInfo prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.DebugInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.DebugInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.DebugInfo)
      org.chromium.components.sync.protocol.DebugInfoOrBuilder {
    // Construct using org.chromium.components.sync.protocol.DebugInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.components.sync.protocol.DebugEventInfo> getEventsList() {
      return java.util.Collections.unmodifiableList(
          instance.getEventsList());
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    @java.lang.Override
    public int getEventsCount() {
      return instance.getEventsCount();
    }/**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.DebugEventInfo getEvents(int index) {
      return instance.getEvents(index);
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder setEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
      copyOnWrite();
      instance.setEvents(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder setEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setEvents(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(org.chromium.components.sync.protocol.DebugEventInfo value) {
      copyOnWrite();
      instance.addEvents(value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo value) {
      copyOnWrite();
      instance.addEvents(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(
        org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addEvents(
        int index, org.chromium.components.sync.protocol.DebugEventInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends org.chromium.components.sync.protocol.DebugEventInfo> values) {
      copyOnWrite();
      instance.addAllEvents(values);
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder clearEvents() {
      copyOnWrite();
      instance.clearEvents();
      return this;
    }
    /**
     * <code>repeated .sync_pb.DebugEventInfo events = 1;</code>
     */
    public Builder removeEvents(int index) {
      copyOnWrite();
      instance.removeEvents(index);
      return this;
    }

    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     * @return Whether the cryptographerReady field is set.
     */
    @java.lang.Override
    public boolean hasCryptographerReady() {
      return instance.hasCryptographerReady();
    }
    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     * @return The cryptographerReady.
     */
    @java.lang.Override
    public boolean getCryptographerReady() {
      return instance.getCryptographerReady();
    }
    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     * @param value The cryptographerReady to set.
     * @return This builder for chaining.
     */
    public Builder setCryptographerReady(boolean value) {
      copyOnWrite();
      instance.setCryptographerReady(value);
      return this;
    }
    /**
     * <pre>
     * Whether cryptographer is ready to encrypt and decrypt data.
     * </pre>
     *
     * <code>optional bool cryptographer_ready = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCryptographerReady() {
      copyOnWrite();
      instance.clearCryptographerReady();
      return this;
    }

    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     * @return Whether the cryptographerHasPendingKeys field is set.
     */
    @java.lang.Override
    public boolean hasCryptographerHasPendingKeys() {
      return instance.hasCryptographerHasPendingKeys();
    }
    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     * @return The cryptographerHasPendingKeys.
     */
    @java.lang.Override
    public boolean getCryptographerHasPendingKeys() {
      return instance.getCryptographerHasPendingKeys();
    }
    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     * @param value The cryptographerHasPendingKeys to set.
     * @return This builder for chaining.
     */
    public Builder setCryptographerHasPendingKeys(boolean value) {
      copyOnWrite();
      instance.setCryptographerHasPendingKeys(value);
      return this;
    }
    /**
     * <pre>
     * Cryptographer has pending keys which indicates the correct passphrase
     * has not been provided yet.
     * </pre>
     *
     * <code>optional bool cryptographer_has_pending_keys = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCryptographerHasPendingKeys() {
      copyOnWrite();
      instance.clearCryptographerHasPendingKeys();
      return this;
    }

    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     * @return Whether the eventsDropped field is set.
     */
    @java.lang.Override
    public boolean hasEventsDropped() {
      return instance.hasEventsDropped();
    }
    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     * @return The eventsDropped.
     */
    @java.lang.Override
    public boolean getEventsDropped() {
      return instance.getEventsDropped();
    }
    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     * @param value The eventsDropped to set.
     * @return This builder for chaining.
     */
    public Builder setEventsDropped(boolean value) {
      copyOnWrite();
      instance.setEventsDropped(value);
      return this;
    }
    /**
     * <pre>
     * Indicates client has dropped some events to save bandwidth.
     * </pre>
     *
     * <code>optional bool events_dropped = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventsDropped() {
      copyOnWrite();
      instance.clearEventsDropped();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.DebugInfo)
  }
  private byte memoizedIsInitialized = 2;
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.DebugInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "events_",
            org.chromium.components.sync.protocol.DebugEventInfo.class,
            "cryptographerReady_",
            "cryptographerHasPendingKeys_",
            "eventsDropped_",
          };
          java.lang.String info =
              "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u041b\u0002\u1007" +
              "\u0000\u0003\u1007\u0001\u0004\u1007\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.DebugInfo> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.DebugInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.DebugInfo>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return memoizedIsInitialized;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sync_pb.DebugInfo)
  private static final org.chromium.components.sync.protocol.DebugInfo DEFAULT_INSTANCE;
  static {
    DebugInfo defaultInstance = new DebugInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DebugInfo.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.DebugInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DebugInfo> PARSER;

  public static com.google.protobuf.Parser<DebugInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

