// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/priority_preference_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Properties of a synced priority preference.
 * </pre>
 *
 * Protobuf type {@code sync_pb.PriorityPreferenceSpecifics}
 */
public  final class PriorityPreferenceSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        PriorityPreferenceSpecifics, PriorityPreferenceSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.PriorityPreferenceSpecifics)
    PriorityPreferenceSpecificsOrBuilder {
  private PriorityPreferenceSpecifics() {
  }
  private int bitField0_;
  public static final int PREFERENCE_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.PreferenceSpecifics preference_;
  /**
   * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
   */
  @java.lang.Override
  public boolean hasPreference() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.PreferenceSpecifics getPreference() {
    return preference_ == null ? org.chromium.components.sync.protocol.PreferenceSpecifics.getDefaultInstance() : preference_;
  }
  /**
   * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
   */
  private void setPreference(org.chromium.components.sync.protocol.PreferenceSpecifics value) {
    value.getClass();
  preference_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergePreference(org.chromium.components.sync.protocol.PreferenceSpecifics value) {
    value.getClass();
  if (preference_ != null &&
        preference_ != org.chromium.components.sync.protocol.PreferenceSpecifics.getDefaultInstance()) {
      preference_ =
        org.chromium.components.sync.protocol.PreferenceSpecifics.newBuilder(preference_).mergeFrom(value).buildPartial();
    } else {
      preference_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
   */
  private void clearPreference() {  preference_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.PriorityPreferenceSpecifics prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Properties of a synced priority preference.
   * </pre>
   *
   * Protobuf type {@code sync_pb.PriorityPreferenceSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.PriorityPreferenceSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.PriorityPreferenceSpecifics)
      org.chromium.components.sync.protocol.PriorityPreferenceSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.PriorityPreferenceSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
     */
    @java.lang.Override
    public boolean hasPreference() {
      return instance.hasPreference();
    }
    /**
     * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.PreferenceSpecifics getPreference() {
      return instance.getPreference();
    }
    /**
     * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
     */
    public Builder setPreference(org.chromium.components.sync.protocol.PreferenceSpecifics value) {
      copyOnWrite();
      instance.setPreference(value);
      return this;
      }
    /**
     * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
     */
    public Builder setPreference(
        org.chromium.components.sync.protocol.PreferenceSpecifics.Builder builderForValue) {
      copyOnWrite();
      instance.setPreference(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
     */
    public Builder mergePreference(org.chromium.components.sync.protocol.PreferenceSpecifics value) {
      copyOnWrite();
      instance.mergePreference(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.PreferenceSpecifics preference = 1;</code>
     */
    public Builder clearPreference() {  copyOnWrite();
      instance.clearPreference();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.PriorityPreferenceSpecifics)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.PriorityPreferenceSpecifics();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "preference_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.PriorityPreferenceSpecifics> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.PriorityPreferenceSpecifics.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.PriorityPreferenceSpecifics>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.PriorityPreferenceSpecifics)
  private static final org.chromium.components.sync.protocol.PriorityPreferenceSpecifics DEFAULT_INSTANCE;
  static {
    PriorityPreferenceSpecifics defaultInstance = new PriorityPreferenceSpecifics();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PriorityPreferenceSpecifics.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.PriorityPreferenceSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PriorityPreferenceSpecifics> PARSER;

  public static com.google.protobuf.Parser<PriorityPreferenceSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

