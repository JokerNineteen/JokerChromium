// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/app_notification_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * An App Notification, to be delivered from Chrome Apps to the
 * Chrome browser through the Notification API.
 * </pre>
 *
 * Protobuf type {@code sync_pb.AppNotification}
 */
public  final class AppNotification extends
    com.google.protobuf.GeneratedMessageLite<
        AppNotification, AppNotification.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.AppNotification)
    AppNotificationOrBuilder {
  private AppNotification() {
    guid_ = "";
    appId_ = "";
    title_ = "";
    bodyText_ = "";
    linkUrl_ = "";
    linkText_ = "";
  }
  private int bitField0_;
  public static final int GUID_FIELD_NUMBER = 1;
  private java.lang.String guid_;
  /**
   * <pre>
   * Globally unique id. This is more robust for uniquely identifying each
   * notification and hence gives us flexibility in the future. In absence
   * of this, unique id would be (app_id, creation_timestamp_ms). But that
   * relies on creation_timestamp_ms being high resolution and is not
   * globally unique - only unique for a given user.
   * </pre>
   *
   * <code>optional string guid = 1;</code>
   * @return Whether the guid field is set.
   */
  @java.lang.Override
  public boolean hasGuid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Globally unique id. This is more robust for uniquely identifying each
   * notification and hence gives us flexibility in the future. In absence
   * of this, unique id would be (app_id, creation_timestamp_ms). But that
   * relies on creation_timestamp_ms being high resolution and is not
   * globally unique - only unique for a given user.
   * </pre>
   *
   * <code>optional string guid = 1;</code>
   * @return The guid.
   */
  @java.lang.Override
  public java.lang.String getGuid() {
    return guid_;
  }
  /**
   * <pre>
   * Globally unique id. This is more robust for uniquely identifying each
   * notification and hence gives us flexibility in the future. In absence
   * of this, unique id would be (app_id, creation_timestamp_ms). But that
   * relies on creation_timestamp_ms being high resolution and is not
   * globally unique - only unique for a given user.
   * </pre>
   *
   * <code>optional string guid = 1;</code>
   * @return The bytes for guid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGuidBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(guid_);
  }
  /**
   * <pre>
   * Globally unique id. This is more robust for uniquely identifying each
   * notification and hence gives us flexibility in the future. In absence
   * of this, unique id would be (app_id, creation_timestamp_ms). But that
   * relies on creation_timestamp_ms being high resolution and is not
   * globally unique - only unique for a given user.
   * </pre>
   *
   * <code>optional string guid = 1;</code>
   * @param value The guid to set.
   */
  private void setGuid(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    guid_ = value;
  }
  /**
   * <pre>
   * Globally unique id. This is more robust for uniquely identifying each
   * notification and hence gives us flexibility in the future. In absence
   * of this, unique id would be (app_id, creation_timestamp_ms). But that
   * relies on creation_timestamp_ms being high resolution and is not
   * globally unique - only unique for a given user.
   * </pre>
   *
   * <code>optional string guid = 1;</code>
   */
  private void clearGuid() {
    bitField0_ = (bitField0_ & ~0x00000001);
    guid_ = getDefaultInstance().getGuid();
  }
  /**
   * <pre>
   * Globally unique id. This is more robust for uniquely identifying each
   * notification and hence gives us flexibility in the future. In absence
   * of this, unique id would be (app_id, creation_timestamp_ms). But that
   * relies on creation_timestamp_ms being high resolution and is not
   * globally unique - only unique for a given user.
   * </pre>
   *
   * <code>optional string guid = 1;</code>
   * @param value The bytes for guid to set.
   */
  private void setGuidBytes(
      com.google.protobuf.ByteString value) {
    guid_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int APP_ID_FIELD_NUMBER = 2;
  private java.lang.String appId_;
  /**
   * <pre>
   * Metadata, not shown directly to the user.
   * The unique App Id, as created by the webstore and used to
   * delegate messages to the applications. This is defined as 32 characters
   * </pre>
   *
   * <code>optional string app_id = 2;</code>
   * @return Whether the appId field is set.
   */
  @java.lang.Override
  public boolean hasAppId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Metadata, not shown directly to the user.
   * The unique App Id, as created by the webstore and used to
   * delegate messages to the applications. This is defined as 32 characters
   * </pre>
   *
   * <code>optional string app_id = 2;</code>
   * @return The appId.
   */
  @java.lang.Override
  public java.lang.String getAppId() {
    return appId_;
  }
  /**
   * <pre>
   * Metadata, not shown directly to the user.
   * The unique App Id, as created by the webstore and used to
   * delegate messages to the applications. This is defined as 32 characters
   * </pre>
   *
   * <code>optional string app_id = 2;</code>
   * @return The bytes for appId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAppIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(appId_);
  }
  /**
   * <pre>
   * Metadata, not shown directly to the user.
   * The unique App Id, as created by the webstore and used to
   * delegate messages to the applications. This is defined as 32 characters
   * </pre>
   *
   * <code>optional string app_id = 2;</code>
   * @param value The appId to set.
   */
  private void setAppId(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    appId_ = value;
  }
  /**
   * <pre>
   * Metadata, not shown directly to the user.
   * The unique App Id, as created by the webstore and used to
   * delegate messages to the applications. This is defined as 32 characters
   * </pre>
   *
   * <code>optional string app_id = 2;</code>
   */
  private void clearAppId() {
    bitField0_ = (bitField0_ & ~0x00000002);
    appId_ = getDefaultInstance().getAppId();
  }
  /**
   * <pre>
   * Metadata, not shown directly to the user.
   * The unique App Id, as created by the webstore and used to
   * delegate messages to the applications. This is defined as 32 characters
   * </pre>
   *
   * <code>optional string app_id = 2;</code>
   * @param value The bytes for appId to set.
   */
  private void setAppIdBytes(
      com.google.protobuf.ByteString value) {
    appId_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static final int CREATION_TIMESTAMP_MS_FIELD_NUMBER = 3;
  private long creationTimestampMs_;
  /**
   * <pre>
   * Timestamp when the message was created in milliseconds.
   * This is seperate from ctime as this is only set by the application.
   * </pre>
   *
   * <code>optional int64 creation_timestamp_ms = 3;</code>
   * @return Whether the creationTimestampMs field is set.
   */
  @java.lang.Override
  public boolean hasCreationTimestampMs() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Timestamp when the message was created in milliseconds.
   * This is seperate from ctime as this is only set by the application.
   * </pre>
   *
   * <code>optional int64 creation_timestamp_ms = 3;</code>
   * @return The creationTimestampMs.
   */
  @java.lang.Override
  public long getCreationTimestampMs() {
    return creationTimestampMs_;
  }
  /**
   * <pre>
   * Timestamp when the message was created in milliseconds.
   * This is seperate from ctime as this is only set by the application.
   * </pre>
   *
   * <code>optional int64 creation_timestamp_ms = 3;</code>
   * @param value The creationTimestampMs to set.
   */
  private void setCreationTimestampMs(long value) {
    bitField0_ |= 0x00000004;
    creationTimestampMs_ = value;
  }
  /**
   * <pre>
   * Timestamp when the message was created in milliseconds.
   * This is seperate from ctime as this is only set by the application.
   * </pre>
   *
   * <code>optional int64 creation_timestamp_ms = 3;</code>
   */
  private void clearCreationTimestampMs() {
    bitField0_ = (bitField0_ & ~0x00000004);
    creationTimestampMs_ = 0L;
  }

  public static final int TITLE_FIELD_NUMBER = 4;
  private java.lang.String title_;
  /**
   * <pre>
   * Payload - these fields are visible to the user content is defined by the
   * app. The fields are described in:
   * chrome/browser/extensions/app_notification.h
   * </pre>
   *
   * <code>optional string title = 4;</code>
   * @return Whether the title field is set.
   */
  @java.lang.Override
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Payload - these fields are visible to the user content is defined by the
   * app. The fields are described in:
   * chrome/browser/extensions/app_notification.h
   * </pre>
   *
   * <code>optional string title = 4;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    return title_;
  }
  /**
   * <pre>
   * Payload - these fields are visible to the user content is defined by the
   * app. The fields are described in:
   * chrome/browser/extensions/app_notification.h
   * </pre>
   *
   * <code>optional string title = 4;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(title_);
  }
  /**
   * <pre>
   * Payload - these fields are visible to the user content is defined by the
   * app. The fields are described in:
   * chrome/browser/extensions/app_notification.h
   * </pre>
   *
   * <code>optional string title = 4;</code>
   * @param value The title to set.
   */
  private void setTitle(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000008;
    title_ = value;
  }
  /**
   * <pre>
   * Payload - these fields are visible to the user content is defined by the
   * app. The fields are described in:
   * chrome/browser/extensions/app_notification.h
   * </pre>
   *
   * <code>optional string title = 4;</code>
   */
  private void clearTitle() {
    bitField0_ = (bitField0_ & ~0x00000008);
    title_ = getDefaultInstance().getTitle();
  }
  /**
   * <pre>
   * Payload - these fields are visible to the user content is defined by the
   * app. The fields are described in:
   * chrome/browser/extensions/app_notification.h
   * </pre>
   *
   * <code>optional string title = 4;</code>
   * @param value The bytes for title to set.
   */
  private void setTitleBytes(
      com.google.protobuf.ByteString value) {
    title_ = value.toStringUtf8();
    bitField0_ |= 0x00000008;
  }

  public static final int BODY_TEXT_FIELD_NUMBER = 5;
  private java.lang.String bodyText_;
  /**
   * <code>optional string body_text = 5;</code>
   * @return Whether the bodyText field is set.
   */
  @java.lang.Override
  public boolean hasBodyText() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional string body_text = 5;</code>
   * @return The bodyText.
   */
  @java.lang.Override
  public java.lang.String getBodyText() {
    return bodyText_;
  }
  /**
   * <code>optional string body_text = 5;</code>
   * @return The bytes for bodyText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBodyTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(bodyText_);
  }
  /**
   * <code>optional string body_text = 5;</code>
   * @param value The bodyText to set.
   */
  private void setBodyText(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000010;
    bodyText_ = value;
  }
  /**
   * <code>optional string body_text = 5;</code>
   */
  private void clearBodyText() {
    bitField0_ = (bitField0_ & ~0x00000010);
    bodyText_ = getDefaultInstance().getBodyText();
  }
  /**
   * <code>optional string body_text = 5;</code>
   * @param value The bytes for bodyText to set.
   */
  private void setBodyTextBytes(
      com.google.protobuf.ByteString value) {
    bodyText_ = value.toStringUtf8();
    bitField0_ |= 0x00000010;
  }

  public static final int LINK_URL_FIELD_NUMBER = 6;
  private java.lang.String linkUrl_;
  /**
   * <code>optional string link_url = 6;</code>
   * @return Whether the linkUrl field is set.
   */
  @java.lang.Override
  public boolean hasLinkUrl() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional string link_url = 6;</code>
   * @return The linkUrl.
   */
  @java.lang.Override
  public java.lang.String getLinkUrl() {
    return linkUrl_;
  }
  /**
   * <code>optional string link_url = 6;</code>
   * @return The bytes for linkUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLinkUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(linkUrl_);
  }
  /**
   * <code>optional string link_url = 6;</code>
   * @param value The linkUrl to set.
   */
  private void setLinkUrl(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000020;
    linkUrl_ = value;
  }
  /**
   * <code>optional string link_url = 6;</code>
   */
  private void clearLinkUrl() {
    bitField0_ = (bitField0_ & ~0x00000020);
    linkUrl_ = getDefaultInstance().getLinkUrl();
  }
  /**
   * <code>optional string link_url = 6;</code>
   * @param value The bytes for linkUrl to set.
   */
  private void setLinkUrlBytes(
      com.google.protobuf.ByteString value) {
    linkUrl_ = value.toStringUtf8();
    bitField0_ |= 0x00000020;
  }

  public static final int LINK_TEXT_FIELD_NUMBER = 7;
  private java.lang.String linkText_;
  /**
   * <code>optional string link_text = 7;</code>
   * @return Whether the linkText field is set.
   */
  @java.lang.Override
  public boolean hasLinkText() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <code>optional string link_text = 7;</code>
   * @return The linkText.
   */
  @java.lang.Override
  public java.lang.String getLinkText() {
    return linkText_;
  }
  /**
   * <code>optional string link_text = 7;</code>
   * @return The bytes for linkText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLinkTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(linkText_);
  }
  /**
   * <code>optional string link_text = 7;</code>
   * @param value The linkText to set.
   */
  private void setLinkText(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000040;
    linkText_ = value;
  }
  /**
   * <code>optional string link_text = 7;</code>
   */
  private void clearLinkText() {
    bitField0_ = (bitField0_ & ~0x00000040);
    linkText_ = getDefaultInstance().getLinkText();
  }
  /**
   * <code>optional string link_text = 7;</code>
   * @param value The bytes for linkText to set.
   */
  private void setLinkTextBytes(
      com.google.protobuf.ByteString value) {
    linkText_ = value.toStringUtf8();
    bitField0_ |= 0x00000040;
  }

  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AppNotification parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.AppNotification prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * An App Notification, to be delivered from Chrome Apps to the
   * Chrome browser through the Notification API.
   * </pre>
   *
   * Protobuf type {@code sync_pb.AppNotification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.AppNotification, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.AppNotification)
      org.chromium.components.sync.protocol.AppNotificationOrBuilder {
    // Construct using org.chromium.components.sync.protocol.AppNotification.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Globally unique id. This is more robust for uniquely identifying each
     * notification and hence gives us flexibility in the future. In absence
     * of this, unique id would be (app_id, creation_timestamp_ms). But that
     * relies on creation_timestamp_ms being high resolution and is not
     * globally unique - only unique for a given user.
     * </pre>
     *
     * <code>optional string guid = 1;</code>
     * @return Whether the guid field is set.
     */
    @java.lang.Override
    public boolean hasGuid() {
      return instance.hasGuid();
    }
    /**
     * <pre>
     * Globally unique id. This is more robust for uniquely identifying each
     * notification and hence gives us flexibility in the future. In absence
     * of this, unique id would be (app_id, creation_timestamp_ms). But that
     * relies on creation_timestamp_ms being high resolution and is not
     * globally unique - only unique for a given user.
     * </pre>
     *
     * <code>optional string guid = 1;</code>
     * @return The guid.
     */
    @java.lang.Override
    public java.lang.String getGuid() {
      return instance.getGuid();
    }
    /**
     * <pre>
     * Globally unique id. This is more robust for uniquely identifying each
     * notification and hence gives us flexibility in the future. In absence
     * of this, unique id would be (app_id, creation_timestamp_ms). But that
     * relies on creation_timestamp_ms being high resolution and is not
     * globally unique - only unique for a given user.
     * </pre>
     *
     * <code>optional string guid = 1;</code>
     * @return The bytes for guid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGuidBytes() {
      return instance.getGuidBytes();
    }
    /**
     * <pre>
     * Globally unique id. This is more robust for uniquely identifying each
     * notification and hence gives us flexibility in the future. In absence
     * of this, unique id would be (app_id, creation_timestamp_ms). But that
     * relies on creation_timestamp_ms being high resolution and is not
     * globally unique - only unique for a given user.
     * </pre>
     *
     * <code>optional string guid = 1;</code>
     * @param value The guid to set.
     * @return This builder for chaining.
     */
    public Builder setGuid(
        java.lang.String value) {
      copyOnWrite();
      instance.setGuid(value);
      return this;
    }
    /**
     * <pre>
     * Globally unique id. This is more robust for uniquely identifying each
     * notification and hence gives us flexibility in the future. In absence
     * of this, unique id would be (app_id, creation_timestamp_ms). But that
     * relies on creation_timestamp_ms being high resolution and is not
     * globally unique - only unique for a given user.
     * </pre>
     *
     * <code>optional string guid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuid() {
      copyOnWrite();
      instance.clearGuid();
      return this;
    }
    /**
     * <pre>
     * Globally unique id. This is more robust for uniquely identifying each
     * notification and hence gives us flexibility in the future. In absence
     * of this, unique id would be (app_id, creation_timestamp_ms). But that
     * relies on creation_timestamp_ms being high resolution and is not
     * globally unique - only unique for a given user.
     * </pre>
     *
     * <code>optional string guid = 1;</code>
     * @param value The bytes for guid to set.
     * @return This builder for chaining.
     */
    public Builder setGuidBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGuidBytes(value);
      return this;
    }

    /**
     * <pre>
     * Metadata, not shown directly to the user.
     * The unique App Id, as created by the webstore and used to
     * delegate messages to the applications. This is defined as 32 characters
     * </pre>
     *
     * <code>optional string app_id = 2;</code>
     * @return Whether the appId field is set.
     */
    @java.lang.Override
    public boolean hasAppId() {
      return instance.hasAppId();
    }
    /**
     * <pre>
     * Metadata, not shown directly to the user.
     * The unique App Id, as created by the webstore and used to
     * delegate messages to the applications. This is defined as 32 characters
     * </pre>
     *
     * <code>optional string app_id = 2;</code>
     * @return The appId.
     */
    @java.lang.Override
    public java.lang.String getAppId() {
      return instance.getAppId();
    }
    /**
     * <pre>
     * Metadata, not shown directly to the user.
     * The unique App Id, as created by the webstore and used to
     * delegate messages to the applications. This is defined as 32 characters
     * </pre>
     *
     * <code>optional string app_id = 2;</code>
     * @return The bytes for appId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      return instance.getAppIdBytes();
    }
    /**
     * <pre>
     * Metadata, not shown directly to the user.
     * The unique App Id, as created by the webstore and used to
     * delegate messages to the applications. This is defined as 32 characters
     * </pre>
     *
     * <code>optional string app_id = 2;</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(
        java.lang.String value) {
      copyOnWrite();
      instance.setAppId(value);
      return this;
    }
    /**
     * <pre>
     * Metadata, not shown directly to the user.
     * The unique App Id, as created by the webstore and used to
     * delegate messages to the applications. This is defined as 32 characters
     * </pre>
     *
     * <code>optional string app_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      copyOnWrite();
      instance.clearAppId();
      return this;
    }
    /**
     * <pre>
     * Metadata, not shown directly to the user.
     * The unique App Id, as created by the webstore and used to
     * delegate messages to the applications. This is defined as 32 characters
     * </pre>
     *
     * <code>optional string app_id = 2;</code>
     * @param value The bytes for appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAppIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Timestamp when the message was created in milliseconds.
     * This is seperate from ctime as this is only set by the application.
     * </pre>
     *
     * <code>optional int64 creation_timestamp_ms = 3;</code>
     * @return Whether the creationTimestampMs field is set.
     */
    @java.lang.Override
    public boolean hasCreationTimestampMs() {
      return instance.hasCreationTimestampMs();
    }
    /**
     * <pre>
     * Timestamp when the message was created in milliseconds.
     * This is seperate from ctime as this is only set by the application.
     * </pre>
     *
     * <code>optional int64 creation_timestamp_ms = 3;</code>
     * @return The creationTimestampMs.
     */
    @java.lang.Override
    public long getCreationTimestampMs() {
      return instance.getCreationTimestampMs();
    }
    /**
     * <pre>
     * Timestamp when the message was created in milliseconds.
     * This is seperate from ctime as this is only set by the application.
     * </pre>
     *
     * <code>optional int64 creation_timestamp_ms = 3;</code>
     * @param value The creationTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setCreationTimestampMs(long value) {
      copyOnWrite();
      instance.setCreationTimestampMs(value);
      return this;
    }
    /**
     * <pre>
     * Timestamp when the message was created in milliseconds.
     * This is seperate from ctime as this is only set by the application.
     * </pre>
     *
     * <code>optional int64 creation_timestamp_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreationTimestampMs() {
      copyOnWrite();
      instance.clearCreationTimestampMs();
      return this;
    }

    /**
     * <pre>
     * Payload - these fields are visible to the user content is defined by the
     * app. The fields are described in:
     * chrome/browser/extensions/app_notification.h
     * </pre>
     *
     * <code>optional string title = 4;</code>
     * @return Whether the title field is set.
     */
    @java.lang.Override
    public boolean hasTitle() {
      return instance.hasTitle();
    }
    /**
     * <pre>
     * Payload - these fields are visible to the user content is defined by the
     * app. The fields are described in:
     * chrome/browser/extensions/app_notification.h
     * </pre>
     *
     * <code>optional string title = 4;</code>
     * @return The title.
     */
    @java.lang.Override
    public java.lang.String getTitle() {
      return instance.getTitle();
    }
    /**
     * <pre>
     * Payload - these fields are visible to the user content is defined by the
     * app. The fields are described in:
     * chrome/browser/extensions/app_notification.h
     * </pre>
     *
     * <code>optional string title = 4;</code>
     * @return The bytes for title.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return instance.getTitleBytes();
    }
    /**
     * <pre>
     * Payload - these fields are visible to the user content is defined by the
     * app. The fields are described in:
     * chrome/browser/extensions/app_notification.h
     * </pre>
     *
     * <code>optional string title = 4;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      copyOnWrite();
      instance.setTitle(value);
      return this;
    }
    /**
     * <pre>
     * Payload - these fields are visible to the user content is defined by the
     * app. The fields are described in:
     * chrome/browser/extensions/app_notification.h
     * </pre>
     *
     * <code>optional string title = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      copyOnWrite();
      instance.clearTitle();
      return this;
    }
    /**
     * <pre>
     * Payload - these fields are visible to the user content is defined by the
     * app. The fields are described in:
     * chrome/browser/extensions/app_notification.h
     * </pre>
     *
     * <code>optional string title = 4;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTitleBytes(value);
      return this;
    }

    /**
     * <code>optional string body_text = 5;</code>
     * @return Whether the bodyText field is set.
     */
    @java.lang.Override
    public boolean hasBodyText() {
      return instance.hasBodyText();
    }
    /**
     * <code>optional string body_text = 5;</code>
     * @return The bodyText.
     */
    @java.lang.Override
    public java.lang.String getBodyText() {
      return instance.getBodyText();
    }
    /**
     * <code>optional string body_text = 5;</code>
     * @return The bytes for bodyText.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBodyTextBytes() {
      return instance.getBodyTextBytes();
    }
    /**
     * <code>optional string body_text = 5;</code>
     * @param value The bodyText to set.
     * @return This builder for chaining.
     */
    public Builder setBodyText(
        java.lang.String value) {
      copyOnWrite();
      instance.setBodyText(value);
      return this;
    }
    /**
     * <code>optional string body_text = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBodyText() {
      copyOnWrite();
      instance.clearBodyText();
      return this;
    }
    /**
     * <code>optional string body_text = 5;</code>
     * @param value The bytes for bodyText to set.
     * @return This builder for chaining.
     */
    public Builder setBodyTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBodyTextBytes(value);
      return this;
    }

    /**
     * <code>optional string link_url = 6;</code>
     * @return Whether the linkUrl field is set.
     */
    @java.lang.Override
    public boolean hasLinkUrl() {
      return instance.hasLinkUrl();
    }
    /**
     * <code>optional string link_url = 6;</code>
     * @return The linkUrl.
     */
    @java.lang.Override
    public java.lang.String getLinkUrl() {
      return instance.getLinkUrl();
    }
    /**
     * <code>optional string link_url = 6;</code>
     * @return The bytes for linkUrl.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLinkUrlBytes() {
      return instance.getLinkUrlBytes();
    }
    /**
     * <code>optional string link_url = 6;</code>
     * @param value The linkUrl to set.
     * @return This builder for chaining.
     */
    public Builder setLinkUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setLinkUrl(value);
      return this;
    }
    /**
     * <code>optional string link_url = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLinkUrl() {
      copyOnWrite();
      instance.clearLinkUrl();
      return this;
    }
    /**
     * <code>optional string link_url = 6;</code>
     * @param value The bytes for linkUrl to set.
     * @return This builder for chaining.
     */
    public Builder setLinkUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLinkUrlBytes(value);
      return this;
    }

    /**
     * <code>optional string link_text = 7;</code>
     * @return Whether the linkText field is set.
     */
    @java.lang.Override
    public boolean hasLinkText() {
      return instance.hasLinkText();
    }
    /**
     * <code>optional string link_text = 7;</code>
     * @return The linkText.
     */
    @java.lang.Override
    public java.lang.String getLinkText() {
      return instance.getLinkText();
    }
    /**
     * <code>optional string link_text = 7;</code>
     * @return The bytes for linkText.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLinkTextBytes() {
      return instance.getLinkTextBytes();
    }
    /**
     * <code>optional string link_text = 7;</code>
     * @param value The linkText to set.
     * @return This builder for chaining.
     */
    public Builder setLinkText(
        java.lang.String value) {
      copyOnWrite();
      instance.setLinkText(value);
      return this;
    }
    /**
     * <code>optional string link_text = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearLinkText() {
      copyOnWrite();
      instance.clearLinkText();
      return this;
    }
    /**
     * <code>optional string link_text = 7;</code>
     * @param value The bytes for linkText to set.
     * @return This builder for chaining.
     */
    public Builder setLinkTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLinkTextBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.AppNotification)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.AppNotification();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "guid_",
            "appId_",
            "creationTimestampMs_",
            "title_",
            "bodyText_",
            "linkUrl_",
            "linkText_",
          };
          java.lang.String info =
              "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002" +
              "\u1008\u0001\u0003\u1002\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005" +
              "\u0007\u1008\u0006";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.AppNotification> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.AppNotification.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.AppNotification>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.AppNotification)
  private static final org.chromium.components.sync.protocol.AppNotification DEFAULT_INSTANCE;
  static {
    AppNotification defaultInstance = new AppNotification();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AppNotification.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.AppNotification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AppNotification> PARSER;

  public static com.google.protobuf.Parser<AppNotification> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

