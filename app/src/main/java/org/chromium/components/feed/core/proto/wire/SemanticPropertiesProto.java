// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/semantic_properties.proto

package org.chromium.components.feed.core.proto.wire;

public final class SemanticPropertiesProto {
  private SemanticPropertiesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface SemanticPropertiesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:feedwire1.SemanticProperties)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * This is kept opaque to Feed - we want to keep it and send it alongside
     * content ids in requests
     * </pre>
     *
     * <code>optional bytes semantic_properties_data = 1;</code>
     * @return Whether the semanticPropertiesData field is set.
     */
    boolean hasSemanticPropertiesData();
    /**
     * <pre>
     * This is kept opaque to Feed - we want to keep it and send it alongside
     * content ids in requests
     * </pre>
     *
     * <code>optional bytes semantic_properties_data = 1;</code>
     * @return The semanticPropertiesData.
     */
    com.google.protobuf.ByteString getSemanticPropertiesData();
  }
  /**
   * <pre>
   * SemanticProperties hold semantic information that we want to attach to
   * features for subsequent comparisons. For example, a feature might be
   * associated with a specific "mid".
   * </pre>
   *
   * Protobuf type {@code feedwire1.SemanticProperties}
   */
  public  static final class SemanticProperties extends
      com.google.protobuf.GeneratedMessageLite<
          SemanticProperties, SemanticProperties.Builder> implements
      // @@protoc_insertion_point(message_implements:feedwire1.SemanticProperties)
      SemanticPropertiesOrBuilder {
    private SemanticProperties() {
      semanticPropertiesData_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int SEMANTIC_PROPERTIES_DATA_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString semanticPropertiesData_;
    /**
     * <pre>
     * This is kept opaque to Feed - we want to keep it and send it alongside
     * content ids in requests
     * </pre>
     *
     * <code>optional bytes semantic_properties_data = 1;</code>
     * @return Whether the semanticPropertiesData field is set.
     */
    @java.lang.Override
    public boolean hasSemanticPropertiesData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * This is kept opaque to Feed - we want to keep it and send it alongside
     * content ids in requests
     * </pre>
     *
     * <code>optional bytes semantic_properties_data = 1;</code>
     * @return The semanticPropertiesData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSemanticPropertiesData() {
      return semanticPropertiesData_;
    }
    /**
     * <pre>
     * This is kept opaque to Feed - we want to keep it and send it alongside
     * content ids in requests
     * </pre>
     *
     * <code>optional bytes semantic_properties_data = 1;</code>
     * @param value The semanticPropertiesData to set.
     */
    private void setSemanticPropertiesData(com.google.protobuf.ByteString value) {
      value.getClass();
  bitField0_ |= 0x00000001;
      semanticPropertiesData_ = value;
    }
    /**
     * <pre>
     * This is kept opaque to Feed - we want to keep it and send it alongside
     * content ids in requests
     * </pre>
     *
     * <code>optional bytes semantic_properties_data = 1;</code>
     */
    private void clearSemanticPropertiesData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      semanticPropertiesData_ = getDefaultInstance().getSemanticPropertiesData();
    }

    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * SemanticProperties hold semantic information that we want to attach to
     * features for subsequent comparisons. For example, a feature might be
     * associated with a specific "mid".
     * </pre>
     *
     * Protobuf type {@code feedwire1.SemanticProperties}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties, Builder> implements
        // @@protoc_insertion_point(builder_implements:feedwire1.SemanticProperties)
        org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticPropertiesOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * This is kept opaque to Feed - we want to keep it and send it alongside
       * content ids in requests
       * </pre>
       *
       * <code>optional bytes semantic_properties_data = 1;</code>
       * @return Whether the semanticPropertiesData field is set.
       */
      @java.lang.Override
      public boolean hasSemanticPropertiesData() {
        return instance.hasSemanticPropertiesData();
      }
      /**
       * <pre>
       * This is kept opaque to Feed - we want to keep it and send it alongside
       * content ids in requests
       * </pre>
       *
       * <code>optional bytes semantic_properties_data = 1;</code>
       * @return The semanticPropertiesData.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getSemanticPropertiesData() {
        return instance.getSemanticPropertiesData();
      }
      /**
       * <pre>
       * This is kept opaque to Feed - we want to keep it and send it alongside
       * content ids in requests
       * </pre>
       *
       * <code>optional bytes semantic_properties_data = 1;</code>
       * @param value The semanticPropertiesData to set.
       * @return This builder for chaining.
       */
      public Builder setSemanticPropertiesData(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSemanticPropertiesData(value);
        return this;
      }
      /**
       * <pre>
       * This is kept opaque to Feed - we want to keep it and send it alongside
       * content ids in requests
       * </pre>
       *
       * <code>optional bytes semantic_properties_data = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSemanticPropertiesData() {
        copyOnWrite();
        instance.clearSemanticPropertiesData();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:feedwire1.SemanticProperties)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "semanticPropertiesData_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties>(
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


    // @@protoc_insertion_point(class_scope:feedwire1.SemanticProperties)
    private static final org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties DEFAULT_INSTANCE;
    static {
      SemanticProperties defaultInstance = new SemanticProperties();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        SemanticProperties.class, defaultInstance);
    }

    public static org.chromium.components.feed.core.proto.wire.SemanticPropertiesProto.SemanticProperties getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<SemanticProperties> PARSER;

    public static com.google.protobuf.Parser<SemanticProperties> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}