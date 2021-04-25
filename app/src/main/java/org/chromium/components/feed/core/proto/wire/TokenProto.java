// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/token.proto

package org.chromium.components.feed.core.proto.wire;

public final class TokenProto {
  private TokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.chromium.components.feed.core.proto.wire.TokenProto.Token.tokenExtension);
  }
  public interface TokenOrBuilder extends
      // @@protoc_insertion_point(interface_extends:feedwire1.Token)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     * @return Whether the nextPageToken field is set.
     */
    boolean hasNextPageToken();
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    com.google.protobuf.ByteString getNextPageToken();
  }
  /**
   * <pre>
   * A continuation token (paging token).
   * </pre>
   *
   * Protobuf type {@code feedwire1.Token}
   */
  public  static final class Token extends
      com.google.protobuf.GeneratedMessageLite<
          Token, Token.Builder> implements
      // @@protoc_insertion_point(message_implements:feedwire1.Token)
      TokenOrBuilder {
    private Token() {
      nextPageToken_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString nextPageToken_;
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     * @return Whether the nextPageToken field is set.
     */
    @java.lang.Override
    public boolean hasNextPageToken() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNextPageToken() {
      return nextPageToken_;
    }
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     */
    private void setNextPageToken(com.google.protobuf.ByteString value) {
      value.getClass();
  bitField0_ |= 0x00000001;
      nextPageToken_ = value;
    }
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     */
    private void clearNextPageToken() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.TokenProto.Token prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A continuation token (paging token).
     * </pre>
     *
     * Protobuf type {@code feedwire1.Token}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.wire.TokenProto.Token, Builder> implements
        // @@protoc_insertion_point(builder_implements:feedwire1.Token)
        org.chromium.components.feed.core.proto.wire.TokenProto.TokenOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.TokenProto.Token.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       * @return Whether the nextPageToken field is set.
       */
      @java.lang.Override
      public boolean hasNextPageToken() {
        return instance.hasNextPageToken();
      }
      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       * @return The nextPageToken.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getNextPageToken() {
        return instance.getNextPageToken();
      }
      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       * @param value The nextPageToken to set.
       * @return This builder for chaining.
       */
      public Builder setNextPageToken(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNextPageToken(value);
        return this;
      }
      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextPageToken() {
        copyOnWrite();
        instance.clearNextPageToken();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:feedwire1.Token)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.TokenProto.Token();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "nextPageToken_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100a\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.feed.core.proto.wire.TokenProto.Token> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.feed.core.proto.wire.TokenProto.Token.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.feed.core.proto.wire.TokenProto.Token>(
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


    // @@protoc_insertion_point(class_scope:feedwire1.Token)
    private static final org.chromium.components.feed.core.proto.wire.TokenProto.Token DEFAULT_INSTANCE;
    static {
      Token defaultInstance = new Token();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Token.class, defaultInstance);
    }

    public static org.chromium.components.feed.core.proto.wire.TokenProto.Token getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Token> PARSER;

    public static com.google.protobuf.Parser<Token> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
    public static final int TOKEN_EXTENSION_FIELD_NUMBER = 194964015;
    /**
     * <code>extend .feedwire1.Feature { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
        org.chromium.components.feed.core.proto.wire.FeatureProto.Feature,
        org.chromium.components.feed.core.proto.wire.TokenProto.Token> tokenExtension = com.google.protobuf.GeneratedMessageLite
            .newSingularGeneratedExtension(
          org.chromium.components.feed.core.proto.wire.FeatureProto.Feature.getDefaultInstance(),
          org.chromium.components.feed.core.proto.wire.TokenProto.Token.getDefaultInstance(),
          org.chromium.components.feed.core.proto.wire.TokenProto.Token.getDefaultInstance(),
          null,
          194964015,
          com.google.protobuf.WireFormat.FieldType.MESSAGE,
          org.chromium.components.feed.core.proto.wire.TokenProto.Token.class);
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}