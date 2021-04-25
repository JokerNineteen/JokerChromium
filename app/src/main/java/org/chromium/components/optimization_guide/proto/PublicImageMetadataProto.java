// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: public_image_metadata.proto

package org.chromium.components.optimization_guide.proto;

public final class PublicImageMetadataProto {
  private PublicImageMetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface PublicImageMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:optimization_guide.proto.PublicImageMetadata)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>repeated string url = 1;</code>
     * @return A list containing the url.
     */
    java.util.List<java.lang.String>
        getUrlList();
    /**
     * <code>repeated string url = 1;</code>
     * @return The count of url.
     */
    int getUrlCount();
    /**
     * <code>repeated string url = 1;</code>
     * @param index The index of the element to return.
     * @return The url at the given index.
     */
    java.lang.String getUrl(int index);
    /**
     * <code>repeated string url = 1;</code>
     * @param index The index of the element to return.
     * @return The url at the given index.
     */
    com.google.protobuf.ByteString
        getUrlBytes(int index);
  }
  /**
   * <pre>
   * Optimization metadata for compressing public images.
   * This is populated for optimization type COMPRESS_PUBLIC_IMAGES.
   * </pre>
   *
   * Protobuf type {@code optimization_guide.proto.PublicImageMetadata}
   */
  public  static final class PublicImageMetadata extends
      com.google.protobuf.GeneratedMessageLite<
          PublicImageMetadata, PublicImageMetadata.Builder> implements
      // @@protoc_insertion_point(message_implements:optimization_guide.proto.PublicImageMetadata)
      PublicImageMetadataOrBuilder {
    private PublicImageMetadata() {
      url_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    public static final int URL_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> url_;
    /**
     * <code>repeated string url = 1;</code>
     * @return A list containing the url.
     */
    @java.lang.Override
    public java.util.List<java.lang.String> getUrlList() {
      return url_;
    }
    /**
     * <code>repeated string url = 1;</code>
     * @return The count of url.
     */
    @java.lang.Override
    public int getUrlCount() {
      return url_.size();
    }
    /**
     * <code>repeated string url = 1;</code>
     * @param index The index of the element to return.
     * @return The url at the given index.
     */
    @java.lang.Override
    public java.lang.String getUrl(int index) {
      return url_.get(index);
    }
    /**
     * <code>repeated string url = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the url at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUrlBytes(int index) {
      return com.google.protobuf.ByteString.copyFromUtf8(
          url_.get(index));
    }
    private void ensureUrlIsMutable() {
      com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
          url_;  if (!tmp.isModifiable()) {
        url_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
       }
    }
    /**
     * <code>repeated string url = 1;</code>
     * @param index The index to set the value at.
     * @param value The url to set.
     */
    private void setUrl(
        int index, java.lang.String value) {
      value.getClass();
  ensureUrlIsMutable();
      url_.set(index, value);
    }
    /**
     * <code>repeated string url = 1;</code>
     * @param value The url to add.
     */
    private void addUrl(
        java.lang.String value) {
      value.getClass();
  ensureUrlIsMutable();
      url_.add(value);
    }
    /**
     * <code>repeated string url = 1;</code>
     * @param values The url to add.
     */
    private void addAllUrl(
        java.lang.Iterable<java.lang.String> values) {
      ensureUrlIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, url_);
    }
    /**
     * <code>repeated string url = 1;</code>
     */
    private void clearUrl() {
      url_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    /**
     * <code>repeated string url = 1;</code>
     * @param value The bytes of the url to add.
     */
    private void addUrlBytes(
        com.google.protobuf.ByteString value) {
      ensureUrlIsMutable();
      url_.add(value.toStringUtf8());
    }

    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Optimization metadata for compressing public images.
     * This is populated for optimization type COMPRESS_PUBLIC_IMAGES.
     * </pre>
     *
     * Protobuf type {@code optimization_guide.proto.PublicImageMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata, Builder> implements
        // @@protoc_insertion_point(builder_implements:optimization_guide.proto.PublicImageMetadata)
        org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadataOrBuilder {
      // Construct using org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>repeated string url = 1;</code>
       * @return A list containing the url.
       */
      @java.lang.Override
      public java.util.List<java.lang.String>
          getUrlList() {
        return java.util.Collections.unmodifiableList(
            instance.getUrlList());
      }
      /**
       * <code>repeated string url = 1;</code>
       * @return The count of url.
       */
      @java.lang.Override
      public int getUrlCount() {
        return instance.getUrlCount();
      }
      /**
       * <code>repeated string url = 1;</code>
       * @param index The index of the element to return.
       * @return The url at the given index.
       */
      @java.lang.Override
      public java.lang.String getUrl(int index) {
        return instance.getUrl(index);
      }
      /**
       * <code>repeated string url = 1;</code>
       * @param index The index of the value to return.
       * @return The bytes of the url at the given index.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getUrlBytes(int index) {
        return instance.getUrlBytes(index);
      }
      /**
       * <code>repeated string url = 1;</code>
       * @param index The index to set the value at.
       * @param value The url to set.
       * @return This builder for chaining.
       */
      public Builder setUrl(
          int index, java.lang.String value) {
        copyOnWrite();
        instance.setUrl(index, value);
        return this;
      }
      /**
       * <code>repeated string url = 1;</code>
       * @param value The url to add.
       * @return This builder for chaining.
       */
      public Builder addUrl(
          java.lang.String value) {
        copyOnWrite();
        instance.addUrl(value);
        return this;
      }
      /**
       * <code>repeated string url = 1;</code>
       * @param values The url to add.
       * @return This builder for chaining.
       */
      public Builder addAllUrl(
          java.lang.Iterable<java.lang.String> values) {
        copyOnWrite();
        instance.addAllUrl(values);
        return this;
      }
      /**
       * <code>repeated string url = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUrl() {
        copyOnWrite();
        instance.clearUrl();
        return this;
      }
      /**
       * <code>repeated string url = 1;</code>
       * @param value The bytes of the url to add.
       * @return This builder for chaining.
       */
      public Builder addUrlBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.addUrlBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:optimization_guide.proto.PublicImageMetadata)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "url_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata>(
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


    // @@protoc_insertion_point(class_scope:optimization_guide.proto.PublicImageMetadata)
    private static final org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata DEFAULT_INSTANCE;
    static {
      PublicImageMetadata defaultInstance = new PublicImageMetadata();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        PublicImageMetadata.class, defaultInstance);
    }

    public static org.chromium.components.optimization_guide.proto.PublicImageMetadataProto.PublicImageMetadata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<PublicImageMetadata> PARSER;

    public static com.google.protobuf.Parser<PublicImageMetadata> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}