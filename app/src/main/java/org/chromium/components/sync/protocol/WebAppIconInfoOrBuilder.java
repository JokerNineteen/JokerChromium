// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/web_app_specifics.proto

package org.chromium.components.sync.protocol;

public interface WebAppIconInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.WebAppIconInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The size of the square app icon, in raw pixels.
   * </pre>
   *
   * <code>optional int32 size_in_px = 1;</code>
   * @return Whether the sizeInPx field is set.
   */
  boolean hasSizeInPx();
  /**
   * <pre>
   * The size of the square app icon, in raw pixels.
   * </pre>
   *
   * <code>optional int32 size_in_px = 1;</code>
   * @return The sizeInPx.
   */
  int getSizeInPx();

  /**
   * <pre>
   * The URL of the app icon.
   * </pre>
   *
   * <code>optional string url = 2;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * The URL of the app icon.
   * </pre>
   *
   * <code>optional string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The URL of the app icon.
   * </pre>
   *
   * <code>optional string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The purpose or context in which the icon should be used.
   * </pre>
   *
   * <code>optional .sync_pb.WebAppIconInfo.Purpose purpose = 3;</code>
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();
  /**
   * <pre>
   * The purpose or context in which the icon should be used.
   * </pre>
   *
   * <code>optional .sync_pb.WebAppIconInfo.Purpose purpose = 3;</code>
   * @return The purpose.
   */
  org.chromium.components.sync.protocol.WebAppIconInfo.Purpose getPurpose();
}
