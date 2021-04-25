// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/chrome_fulfillment_info.proto

package org.chromium.components.feed.core.proto.wire;

public final class ChromeFulfillmentInfoProto {
  private ChromeFulfillmentInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ChromeFulfillmentInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:feedwire1.ChromeFulfillmentInfo)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Whether the notice card has already been acknowledged by the user based on
     * their views and clicks on the card. This is different from when the user
     * explicitly dismiss the notice card by touching the button.
     * </pre>
     *
     * <code>optional bool notice_card_acknowledged = 1;</code>
     * @return Whether the noticeCardAcknowledged field is set.
     */
    boolean hasNoticeCardAcknowledged();
    /**
     * <pre>
     * Whether the notice card has already been acknowledged by the user based on
     * their views and clicks on the card. This is different from when the user
     * explicitly dismiss the notice card by touching the button.
     * </pre>
     *
     * <code>optional bool notice_card_acknowledged = 1;</code>
     * @return The noticeCardAcknowledged.
     */
    boolean getNoticeCardAcknowledged();
  }
  /**
   * <pre>
   * Information on how to do content fulfillment for Chrome.
   * </pre>
   *
   * Protobuf type {@code feedwire1.ChromeFulfillmentInfo}
   */
  public  static final class ChromeFulfillmentInfo extends
      com.google.protobuf.GeneratedMessageLite<
          ChromeFulfillmentInfo, ChromeFulfillmentInfo.Builder> implements
      // @@protoc_insertion_point(message_implements:feedwire1.ChromeFulfillmentInfo)
      ChromeFulfillmentInfoOrBuilder {
    private ChromeFulfillmentInfo() {
    }
    private int bitField0_;
    public static final int NOTICE_CARD_ACKNOWLEDGED_FIELD_NUMBER = 1;
    private boolean noticeCardAcknowledged_;
    /**
     * <pre>
     * Whether the notice card has already been acknowledged by the user based on
     * their views and clicks on the card. This is different from when the user
     * explicitly dismiss the notice card by touching the button.
     * </pre>
     *
     * <code>optional bool notice_card_acknowledged = 1;</code>
     * @return Whether the noticeCardAcknowledged field is set.
     */
    @java.lang.Override
    public boolean hasNoticeCardAcknowledged() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Whether the notice card has already been acknowledged by the user based on
     * their views and clicks on the card. This is different from when the user
     * explicitly dismiss the notice card by touching the button.
     * </pre>
     *
     * <code>optional bool notice_card_acknowledged = 1;</code>
     * @return The noticeCardAcknowledged.
     */
    @java.lang.Override
    public boolean getNoticeCardAcknowledged() {
      return noticeCardAcknowledged_;
    }
    /**
     * <pre>
     * Whether the notice card has already been acknowledged by the user based on
     * their views and clicks on the card. This is different from when the user
     * explicitly dismiss the notice card by touching the button.
     * </pre>
     *
     * <code>optional bool notice_card_acknowledged = 1;</code>
     * @param value The noticeCardAcknowledged to set.
     */
    private void setNoticeCardAcknowledged(boolean value) {
      bitField0_ |= 0x00000001;
      noticeCardAcknowledged_ = value;
    }
    /**
     * <pre>
     * Whether the notice card has already been acknowledged by the user based on
     * their views and clicks on the card. This is different from when the user
     * explicitly dismiss the notice card by touching the button.
     * </pre>
     *
     * <code>optional bool notice_card_acknowledged = 1;</code>
     */
    private void clearNoticeCardAcknowledged() {
      bitField0_ = (bitField0_ & ~0x00000001);
      noticeCardAcknowledged_ = false;
    }

    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Information on how to do content fulfillment for Chrome.
     * </pre>
     *
     * Protobuf type {@code feedwire1.ChromeFulfillmentInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo, Builder> implements
        // @@protoc_insertion_point(builder_implements:feedwire1.ChromeFulfillmentInfo)
        org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfoOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Whether the notice card has already been acknowledged by the user based on
       * their views and clicks on the card. This is different from when the user
       * explicitly dismiss the notice card by touching the button.
       * </pre>
       *
       * <code>optional bool notice_card_acknowledged = 1;</code>
       * @return Whether the noticeCardAcknowledged field is set.
       */
      @java.lang.Override
      public boolean hasNoticeCardAcknowledged() {
        return instance.hasNoticeCardAcknowledged();
      }
      /**
       * <pre>
       * Whether the notice card has already been acknowledged by the user based on
       * their views and clicks on the card. This is different from when the user
       * explicitly dismiss the notice card by touching the button.
       * </pre>
       *
       * <code>optional bool notice_card_acknowledged = 1;</code>
       * @return The noticeCardAcknowledged.
       */
      @java.lang.Override
      public boolean getNoticeCardAcknowledged() {
        return instance.getNoticeCardAcknowledged();
      }
      /**
       * <pre>
       * Whether the notice card has already been acknowledged by the user based on
       * their views and clicks on the card. This is different from when the user
       * explicitly dismiss the notice card by touching the button.
       * </pre>
       *
       * <code>optional bool notice_card_acknowledged = 1;</code>
       * @param value The noticeCardAcknowledged to set.
       * @return This builder for chaining.
       */
      public Builder setNoticeCardAcknowledged(boolean value) {
        copyOnWrite();
        instance.setNoticeCardAcknowledged(value);
        return this;
      }
      /**
       * <pre>
       * Whether the notice card has already been acknowledged by the user based on
       * their views and clicks on the card. This is different from when the user
       * explicitly dismiss the notice card by touching the button.
       * </pre>
       *
       * <code>optional bool notice_card_acknowledged = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNoticeCardAcknowledged() {
        copyOnWrite();
        instance.clearNoticeCardAcknowledged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:feedwire1.ChromeFulfillmentInfo)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "noticeCardAcknowledged_",
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
          com.google.protobuf.Parser<org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo>(
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


    // @@protoc_insertion_point(class_scope:feedwire1.ChromeFulfillmentInfo)
    private static final org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo DEFAULT_INSTANCE;
    static {
      ChromeFulfillmentInfo defaultInstance = new ChromeFulfillmentInfo();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ChromeFulfillmentInfo.class, defaultInstance);
    }

    public static org.chromium.components.feed.core.proto.wire.ChromeFulfillmentInfoProto.ChromeFulfillmentInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ChromeFulfillmentInfo> PARSER;

    public static com.google.protobuf.Parser<ChromeFulfillmentInfo> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}