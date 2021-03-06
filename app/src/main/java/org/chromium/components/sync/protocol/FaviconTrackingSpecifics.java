// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/favicon_tracking_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Tracking info for of favicon images. These control expiration of images
 * from sync based on recency, bookmark state, etc.
 * </pre>
 *
 * Protobuf type {@code sync_pb.FaviconTrackingSpecifics}
 */
public  final class FaviconTrackingSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        FaviconTrackingSpecifics, FaviconTrackingSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.FaviconTrackingSpecifics)
    FaviconTrackingSpecificsOrBuilder {
  private FaviconTrackingSpecifics() {
    faviconUrl_ = "";
  }
  private int bitField0_;
  public static final int FAVICON_URL_FIELD_NUMBER = 1;
  private java.lang.String faviconUrl_;
  /**
   * <pre>
   * The url of the favicon image.
   * </pre>
   *
   * <code>optional string favicon_url = 1;</code>
   * @return Whether the faviconUrl field is set.
   */
  @java.lang.Override
  public boolean hasFaviconUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The url of the favicon image.
   * </pre>
   *
   * <code>optional string favicon_url = 1;</code>
   * @return The faviconUrl.
   */
  @java.lang.Override
  public java.lang.String getFaviconUrl() {
    return faviconUrl_;
  }
  /**
   * <pre>
   * The url of the favicon image.
   * </pre>
   *
   * <code>optional string favicon_url = 1;</code>
   * @return The bytes for faviconUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFaviconUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(faviconUrl_);
  }
  /**
   * <pre>
   * The url of the favicon image.
   * </pre>
   *
   * <code>optional string favicon_url = 1;</code>
   * @param value The faviconUrl to set.
   */
  private void setFaviconUrl(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    faviconUrl_ = value;
  }
  /**
   * <pre>
   * The url of the favicon image.
   * </pre>
   *
   * <code>optional string favicon_url = 1;</code>
   */
  private void clearFaviconUrl() {
    bitField0_ = (bitField0_ & ~0x00000001);
    faviconUrl_ = getDefaultInstance().getFaviconUrl();
  }
  /**
   * <pre>
   * The url of the favicon image.
   * </pre>
   *
   * <code>optional string favicon_url = 1;</code>
   * @param value The bytes for faviconUrl to set.
   */
  private void setFaviconUrlBytes(
      com.google.protobuf.ByteString value) {
    faviconUrl_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int LAST_VISIT_TIME_MS_FIELD_NUMBER = 3;
  private long lastVisitTimeMs_;
  /**
   * <pre>
   * The last time a page using this favicon was visited (in milliseconds
   * since linux epoch).
   * </pre>
   *
   * <code>optional int64 last_visit_time_ms = 3;</code>
   * @return Whether the lastVisitTimeMs field is set.
   */
  @java.lang.Override
  public boolean hasLastVisitTimeMs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The last time a page using this favicon was visited (in milliseconds
   * since linux epoch).
   * </pre>
   *
   * <code>optional int64 last_visit_time_ms = 3;</code>
   * @return The lastVisitTimeMs.
   */
  @java.lang.Override
  public long getLastVisitTimeMs() {
    return lastVisitTimeMs_;
  }
  /**
   * <pre>
   * The last time a page using this favicon was visited (in milliseconds
   * since linux epoch).
   * </pre>
   *
   * <code>optional int64 last_visit_time_ms = 3;</code>
   * @param value The lastVisitTimeMs to set.
   */
  private void setLastVisitTimeMs(long value) {
    bitField0_ |= 0x00000002;
    lastVisitTimeMs_ = value;
  }
  /**
   * <pre>
   * The last time a page using this favicon was visited (in milliseconds
   * since linux epoch).
   * </pre>
   *
   * <code>optional int64 last_visit_time_ms = 3;</code>
   */
  private void clearLastVisitTimeMs() {
    bitField0_ = (bitField0_ & ~0x00000002);
    lastVisitTimeMs_ = 0L;
  }

  public static final int IS_BOOKMARKED_FIELD_NUMBER = 4;
  private boolean isBookmarked_;
  /**
   * <pre>
   * Whether this favicon is currently bookmarked or not.
   * </pre>
   *
   * <code>optional bool is_bookmarked = 4;</code>
   * @return Whether the isBookmarked field is set.
   */
  @java.lang.Override
  public boolean hasIsBookmarked() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Whether this favicon is currently bookmarked or not.
   * </pre>
   *
   * <code>optional bool is_bookmarked = 4;</code>
   * @return The isBookmarked.
   */
  @java.lang.Override
  public boolean getIsBookmarked() {
    return isBookmarked_;
  }
  /**
   * <pre>
   * Whether this favicon is currently bookmarked or not.
   * </pre>
   *
   * <code>optional bool is_bookmarked = 4;</code>
   * @param value The isBookmarked to set.
   */
  private void setIsBookmarked(boolean value) {
    bitField0_ |= 0x00000004;
    isBookmarked_ = value;
  }
  /**
   * <pre>
   * Whether this favicon is currently bookmarked or not.
   * </pre>
   *
   * <code>optional bool is_bookmarked = 4;</code>
   */
  private void clearIsBookmarked() {
    bitField0_ = (bitField0_ & ~0x00000004);
    isBookmarked_ = false;
  }

  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.FaviconTrackingSpecifics prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Tracking info for of favicon images. These control expiration of images
   * from sync based on recency, bookmark state, etc.
   * </pre>
   *
   * Protobuf type {@code sync_pb.FaviconTrackingSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.FaviconTrackingSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.FaviconTrackingSpecifics)
      org.chromium.components.sync.protocol.FaviconTrackingSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.FaviconTrackingSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The url of the favicon image.
     * </pre>
     *
     * <code>optional string favicon_url = 1;</code>
     * @return Whether the faviconUrl field is set.
     */
    @java.lang.Override
    public boolean hasFaviconUrl() {
      return instance.hasFaviconUrl();
    }
    /**
     * <pre>
     * The url of the favicon image.
     * </pre>
     *
     * <code>optional string favicon_url = 1;</code>
     * @return The faviconUrl.
     */
    @java.lang.Override
    public java.lang.String getFaviconUrl() {
      return instance.getFaviconUrl();
    }
    /**
     * <pre>
     * The url of the favicon image.
     * </pre>
     *
     * <code>optional string favicon_url = 1;</code>
     * @return The bytes for faviconUrl.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFaviconUrlBytes() {
      return instance.getFaviconUrlBytes();
    }
    /**
     * <pre>
     * The url of the favicon image.
     * </pre>
     *
     * <code>optional string favicon_url = 1;</code>
     * @param value The faviconUrl to set.
     * @return This builder for chaining.
     */
    public Builder setFaviconUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setFaviconUrl(value);
      return this;
    }
    /**
     * <pre>
     * The url of the favicon image.
     * </pre>
     *
     * <code>optional string favicon_url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFaviconUrl() {
      copyOnWrite();
      instance.clearFaviconUrl();
      return this;
    }
    /**
     * <pre>
     * The url of the favicon image.
     * </pre>
     *
     * <code>optional string favicon_url = 1;</code>
     * @param value The bytes for faviconUrl to set.
     * @return This builder for chaining.
     */
    public Builder setFaviconUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFaviconUrlBytes(value);
      return this;
    }

    /**
     * <pre>
     * The last time a page using this favicon was visited (in milliseconds
     * since linux epoch).
     * </pre>
     *
     * <code>optional int64 last_visit_time_ms = 3;</code>
     * @return Whether the lastVisitTimeMs field is set.
     */
    @java.lang.Override
    public boolean hasLastVisitTimeMs() {
      return instance.hasLastVisitTimeMs();
    }
    /**
     * <pre>
     * The last time a page using this favicon was visited (in milliseconds
     * since linux epoch).
     * </pre>
     *
     * <code>optional int64 last_visit_time_ms = 3;</code>
     * @return The lastVisitTimeMs.
     */
    @java.lang.Override
    public long getLastVisitTimeMs() {
      return instance.getLastVisitTimeMs();
    }
    /**
     * <pre>
     * The last time a page using this favicon was visited (in milliseconds
     * since linux epoch).
     * </pre>
     *
     * <code>optional int64 last_visit_time_ms = 3;</code>
     * @param value The lastVisitTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setLastVisitTimeMs(long value) {
      copyOnWrite();
      instance.setLastVisitTimeMs(value);
      return this;
    }
    /**
     * <pre>
     * The last time a page using this favicon was visited (in milliseconds
     * since linux epoch).
     * </pre>
     *
     * <code>optional int64 last_visit_time_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastVisitTimeMs() {
      copyOnWrite();
      instance.clearLastVisitTimeMs();
      return this;
    }

    /**
     * <pre>
     * Whether this favicon is currently bookmarked or not.
     * </pre>
     *
     * <code>optional bool is_bookmarked = 4;</code>
     * @return Whether the isBookmarked field is set.
     */
    @java.lang.Override
    public boolean hasIsBookmarked() {
      return instance.hasIsBookmarked();
    }
    /**
     * <pre>
     * Whether this favicon is currently bookmarked or not.
     * </pre>
     *
     * <code>optional bool is_bookmarked = 4;</code>
     * @return The isBookmarked.
     */
    @java.lang.Override
    public boolean getIsBookmarked() {
      return instance.getIsBookmarked();
    }
    /**
     * <pre>
     * Whether this favicon is currently bookmarked or not.
     * </pre>
     *
     * <code>optional bool is_bookmarked = 4;</code>
     * @param value The isBookmarked to set.
     * @return This builder for chaining.
     */
    public Builder setIsBookmarked(boolean value) {
      copyOnWrite();
      instance.setIsBookmarked(value);
      return this;
    }
    /**
     * <pre>
     * Whether this favicon is currently bookmarked or not.
     * </pre>
     *
     * <code>optional bool is_bookmarked = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsBookmarked() {
      copyOnWrite();
      instance.clearIsBookmarked();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.FaviconTrackingSpecifics)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.FaviconTrackingSpecifics();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "faviconUrl_",
            "lastVisitTimeMs_",
            "isBookmarked_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0003" +
              "\u1002\u0001\u0004\u1007\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.FaviconTrackingSpecifics> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.FaviconTrackingSpecifics.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.FaviconTrackingSpecifics>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.FaviconTrackingSpecifics)
  private static final org.chromium.components.sync.protocol.FaviconTrackingSpecifics DEFAULT_INSTANCE;
  static {
    FaviconTrackingSpecifics defaultInstance = new FaviconTrackingSpecifics();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      FaviconTrackingSpecifics.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.FaviconTrackingSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FaviconTrackingSpecifics> PARSER;

  public static com.google.protobuf.Parser<FaviconTrackingSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

