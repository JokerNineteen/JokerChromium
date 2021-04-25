// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Event that is triggered when |user_action_identifier| is called.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.OnUserActionCalled}
 */
public  final class OnUserActionCalled extends
    com.google.protobuf.GeneratedMessageLite<
        OnUserActionCalled, OnUserActionCalled.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.OnUserActionCalled)
    OnUserActionCalledOrBuilder {
  private OnUserActionCalled() {
    userActionIdentifier_ = "";
  }
  private int bitField0_;
  public static final int USER_ACTION_IDENTIFIER_FIELD_NUMBER = 1;
  private java.lang.String userActionIdentifier_;
  /**
   * <pre>
   * The identifier of the user action to observe.
   * </pre>
   *
   * <code>optional string user_action_identifier = 1;</code>
   * @return Whether the userActionIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasUserActionIdentifier() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The identifier of the user action to observe.
   * </pre>
   *
   * <code>optional string user_action_identifier = 1;</code>
   * @return The userActionIdentifier.
   */
  @java.lang.Override
  public java.lang.String getUserActionIdentifier() {
    return userActionIdentifier_;
  }
  /**
   * <pre>
   * The identifier of the user action to observe.
   * </pre>
   *
   * <code>optional string user_action_identifier = 1;</code>
   * @return The bytes for userActionIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserActionIdentifierBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userActionIdentifier_);
  }
  /**
   * <pre>
   * The identifier of the user action to observe.
   * </pre>
   *
   * <code>optional string user_action_identifier = 1;</code>
   * @param value The userActionIdentifier to set.
   */
  private void setUserActionIdentifier(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    userActionIdentifier_ = value;
  }
  /**
   * <pre>
   * The identifier of the user action to observe.
   * </pre>
   *
   * <code>optional string user_action_identifier = 1;</code>
   */
  private void clearUserActionIdentifier() {
    bitField0_ = (bitField0_ & ~0x00000001);
    userActionIdentifier_ = getDefaultInstance().getUserActionIdentifier();
  }
  /**
   * <pre>
   * The identifier of the user action to observe.
   * </pre>
   *
   * <code>optional string user_action_identifier = 1;</code>
   * @param value The bytes for userActionIdentifier to set.
   */
  private void setUserActionIdentifierBytes(
      com.google.protobuf.ByteString value) {
    userActionIdentifier_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Event that is triggered when |user_action_identifier| is called.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.OnUserActionCalled}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.OnUserActionCalled)
      org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalledOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The identifier of the user action to observe.
     * </pre>
     *
     * <code>optional string user_action_identifier = 1;</code>
     * @return Whether the userActionIdentifier field is set.
     */
    @java.lang.Override
    public boolean hasUserActionIdentifier() {
      return instance.hasUserActionIdentifier();
    }
    /**
     * <pre>
     * The identifier of the user action to observe.
     * </pre>
     *
     * <code>optional string user_action_identifier = 1;</code>
     * @return The userActionIdentifier.
     */
    @java.lang.Override
    public java.lang.String getUserActionIdentifier() {
      return instance.getUserActionIdentifier();
    }
    /**
     * <pre>
     * The identifier of the user action to observe.
     * </pre>
     *
     * <code>optional string user_action_identifier = 1;</code>
     * @return The bytes for userActionIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserActionIdentifierBytes() {
      return instance.getUserActionIdentifierBytes();
    }
    /**
     * <pre>
     * The identifier of the user action to observe.
     * </pre>
     *
     * <code>optional string user_action_identifier = 1;</code>
     * @param value The userActionIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setUserActionIdentifier(
        java.lang.String value) {
      copyOnWrite();
      instance.setUserActionIdentifier(value);
      return this;
    }
    /**
     * <pre>
     * The identifier of the user action to observe.
     * </pre>
     *
     * <code>optional string user_action_identifier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserActionIdentifier() {
      copyOnWrite();
      instance.clearUserActionIdentifier();
      return this;
    }
    /**
     * <pre>
     * The identifier of the user action to observe.
     * </pre>
     *
     * <code>optional string user_action_identifier = 1;</code>
     * @param value The bytes for userActionIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setUserActionIdentifierBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserActionIdentifierBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.OnUserActionCalled)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "userActionIdentifier_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.OnUserActionCalled)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled DEFAULT_INSTANCE;
  static {
    OnUserActionCalled defaultInstance = new OnUserActionCalled();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      OnUserActionCalled.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.OnUserActionCalled getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<OnUserActionCalled> PARSER;

  public static com.google.protobuf.Parser<OnUserActionCalled> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
