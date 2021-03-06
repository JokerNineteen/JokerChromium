// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/reading_list_specifics.proto

package org.chromium.components.sync.protocol;

public interface ReadingListSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ReadingListSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string entry_id = 1;</code>
   * @return Whether the entryId field is set.
   */
  boolean hasEntryId();
  /**
   * <code>optional string entry_id = 1;</code>
   * @return The entryId.
   */
  java.lang.String getEntryId();
  /**
   * <code>optional string entry_id = 1;</code>
   * @return The bytes for entryId.
   */
  com.google.protobuf.ByteString
      getEntryIdBytes();

  /**
   * <code>optional string title = 2;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string url = 3;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional int64 creation_time_us = 4;</code>
   * @return Whether the creationTimeUs field is set.
   */
  boolean hasCreationTimeUs();
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   * @return The creationTimeUs.
   */
  long getCreationTimeUs();

  /**
   * <code>optional int64 update_time_us = 5;</code>
   * @return Whether the updateTimeUs field is set.
   */
  boolean hasUpdateTimeUs();
  /**
   * <code>optional int64 update_time_us = 5;</code>
   * @return The updateTimeUs.
   */
  long getUpdateTimeUs();

  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   * @return Whether the firstReadTimeUs field is set.
   */
  boolean hasFirstReadTimeUs();
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   * @return The firstReadTimeUs.
   */
  long getFirstReadTimeUs();

  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   * @return Whether the updateTitleTimeUs field is set.
   */
  boolean hasUpdateTitleTimeUs();
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   * @return The updateTitleTimeUs.
   */
  long getUpdateTitleTimeUs();

  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   * @return The status.
   */
  org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus getStatus();
}
