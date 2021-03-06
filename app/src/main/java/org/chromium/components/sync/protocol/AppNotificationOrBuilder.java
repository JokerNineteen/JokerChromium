// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/app_notification_specifics.proto

package org.chromium.components.sync.protocol;

public interface AppNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.AppNotification)
    com.google.protobuf.MessageLiteOrBuilder {

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
  boolean hasGuid();
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
  java.lang.String getGuid();
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
  com.google.protobuf.ByteString
      getGuidBytes();

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
  boolean hasAppId();
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
  java.lang.String getAppId();
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
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * Timestamp when the message was created in milliseconds.
   * This is seperate from ctime as this is only set by the application.
   * </pre>
   *
   * <code>optional int64 creation_timestamp_ms = 3;</code>
   * @return Whether the creationTimestampMs field is set.
   */
  boolean hasCreationTimestampMs();
  /**
   * <pre>
   * Timestamp when the message was created in milliseconds.
   * This is seperate from ctime as this is only set by the application.
   * </pre>
   *
   * <code>optional int64 creation_timestamp_ms = 3;</code>
   * @return The creationTimestampMs.
   */
  long getCreationTimestampMs();

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
  boolean hasTitle();
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
  java.lang.String getTitle();
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
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string body_text = 5;</code>
   * @return Whether the bodyText field is set.
   */
  boolean hasBodyText();
  /**
   * <code>optional string body_text = 5;</code>
   * @return The bodyText.
   */
  java.lang.String getBodyText();
  /**
   * <code>optional string body_text = 5;</code>
   * @return The bytes for bodyText.
   */
  com.google.protobuf.ByteString
      getBodyTextBytes();

  /**
   * <code>optional string link_url = 6;</code>
   * @return Whether the linkUrl field is set.
   */
  boolean hasLinkUrl();
  /**
   * <code>optional string link_url = 6;</code>
   * @return The linkUrl.
   */
  java.lang.String getLinkUrl();
  /**
   * <code>optional string link_url = 6;</code>
   * @return The bytes for linkUrl.
   */
  com.google.protobuf.ByteString
      getLinkUrlBytes();

  /**
   * <code>optional string link_text = 7;</code>
   * @return Whether the linkText field is set.
   */
  boolean hasLinkText();
  /**
   * <code>optional string link_text = 7;</code>
   * @return The linkText.
   */
  java.lang.String getLinkText();
  /**
   * <code>optional string link_text = 7;</code>
   * @return The bytes for linkText.
   */
  com.google.protobuf.ByteString
      getLinkTextBytes();
}
