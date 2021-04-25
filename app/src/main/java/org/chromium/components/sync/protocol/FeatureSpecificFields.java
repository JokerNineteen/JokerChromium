// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/device_info_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Feature specific information about the device that is running a sync-enabled
 * Chrome browser. Adding to this proto is discouraged and should only be added
 * when the information can not be derived more generally.
 * </pre>
 *
 * Protobuf type {@code sync_pb.FeatureSpecificFields}
 */
public  final class FeatureSpecificFields extends
    com.google.protobuf.GeneratedMessageLite<
        FeatureSpecificFields, FeatureSpecificFields.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.FeatureSpecificFields)
    FeatureSpecificFieldsOrBuilder {
  private FeatureSpecificFields() {
  }
  private int bitField0_;
  public static final int SEND_TAB_TO_SELF_RECEIVING_ENABLED_FIELD_NUMBER = 1;
  private boolean sendTabToSelfReceivingEnabled_;
  /**
   * <pre>
   * Tracks whether the SendTabToSelf feature is enabled on the device. For this
   * to be true, two things must be true: (1) The receiving side of the feature
   * must be enabled on the device (2) The user has enabled sync for this
   * feature
   * </pre>
   *
   * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
   * @return Whether the sendTabToSelfReceivingEnabled field is set.
   */
  @java.lang.Override
  public boolean hasSendTabToSelfReceivingEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Tracks whether the SendTabToSelf feature is enabled on the device. For this
   * to be true, two things must be true: (1) The receiving side of the feature
   * must be enabled on the device (2) The user has enabled sync for this
   * feature
   * </pre>
   *
   * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
   * @return The sendTabToSelfReceivingEnabled.
   */
  @java.lang.Override
  public boolean getSendTabToSelfReceivingEnabled() {
    return sendTabToSelfReceivingEnabled_;
  }
  /**
   * <pre>
   * Tracks whether the SendTabToSelf feature is enabled on the device. For this
   * to be true, two things must be true: (1) The receiving side of the feature
   * must be enabled on the device (2) The user has enabled sync for this
   * feature
   * </pre>
   *
   * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
   * @param value The sendTabToSelfReceivingEnabled to set.
   */
  private void setSendTabToSelfReceivingEnabled(boolean value) {
    bitField0_ |= 0x00000001;
    sendTabToSelfReceivingEnabled_ = value;
  }
  /**
   * <pre>
   * Tracks whether the SendTabToSelf feature is enabled on the device. For this
   * to be true, two things must be true: (1) The receiving side of the feature
   * must be enabled on the device (2) The user has enabled sync for this
   * feature
   * </pre>
   *
   * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
   */
  private void clearSendTabToSelfReceivingEnabled() {
    bitField0_ = (bitField0_ & ~0x00000001);
    sendTabToSelfReceivingEnabled_ = false;
  }

  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FeatureSpecificFields parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.FeatureSpecificFields prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Feature specific information about the device that is running a sync-enabled
   * Chrome browser. Adding to this proto is discouraged and should only be added
   * when the information can not be derived more generally.
   * </pre>
   *
   * Protobuf type {@code sync_pb.FeatureSpecificFields}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.FeatureSpecificFields, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.FeatureSpecificFields)
      org.chromium.components.sync.protocol.FeatureSpecificFieldsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.FeatureSpecificFields.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Tracks whether the SendTabToSelf feature is enabled on the device. For this
     * to be true, two things must be true: (1) The receiving side of the feature
     * must be enabled on the device (2) The user has enabled sync for this
     * feature
     * </pre>
     *
     * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
     * @return Whether the sendTabToSelfReceivingEnabled field is set.
     */
    @java.lang.Override
    public boolean hasSendTabToSelfReceivingEnabled() {
      return instance.hasSendTabToSelfReceivingEnabled();
    }
    /**
     * <pre>
     * Tracks whether the SendTabToSelf feature is enabled on the device. For this
     * to be true, two things must be true: (1) The receiving side of the feature
     * must be enabled on the device (2) The user has enabled sync for this
     * feature
     * </pre>
     *
     * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
     * @return The sendTabToSelfReceivingEnabled.
     */
    @java.lang.Override
    public boolean getSendTabToSelfReceivingEnabled() {
      return instance.getSendTabToSelfReceivingEnabled();
    }
    /**
     * <pre>
     * Tracks whether the SendTabToSelf feature is enabled on the device. For this
     * to be true, two things must be true: (1) The receiving side of the feature
     * must be enabled on the device (2) The user has enabled sync for this
     * feature
     * </pre>
     *
     * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
     * @param value The sendTabToSelfReceivingEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setSendTabToSelfReceivingEnabled(boolean value) {
      copyOnWrite();
      instance.setSendTabToSelfReceivingEnabled(value);
      return this;
    }
    /**
     * <pre>
     * Tracks whether the SendTabToSelf feature is enabled on the device. For this
     * to be true, two things must be true: (1) The receiving side of the feature
     * must be enabled on the device (2) The user has enabled sync for this
     * feature
     * </pre>
     *
     * <code>optional bool send_tab_to_self_receiving_enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendTabToSelfReceivingEnabled() {
      copyOnWrite();
      instance.clearSendTabToSelfReceivingEnabled();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.FeatureSpecificFields)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.FeatureSpecificFields();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "sendTabToSelfReceivingEnabled_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.FeatureSpecificFields> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.FeatureSpecificFields.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.FeatureSpecificFields>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.FeatureSpecificFields)
  private static final org.chromium.components.sync.protocol.FeatureSpecificFields DEFAULT_INSTANCE;
  static {
    FeatureSpecificFields defaultInstance = new FeatureSpecificFields();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      FeatureSpecificFields.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.FeatureSpecificFields getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FeatureSpecificFields> PARSER;

  public static com.google.protobuf.Parser<FeatureSpecificFields> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
