// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/get_updates_caller_info.proto

package org.chromium.components.sync.protocol;

public interface GetUpdatesCallerInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.GetUpdatesCallerInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .sync_pb.GetUpdatesCallerInfo.GetUpdatesSource source = 1 [deprecated = true];</code>
   * @return Whether the source field is set.
   */
  @java.lang.Deprecated boolean hasSource();
  /**
   * <code>required .sync_pb.GetUpdatesCallerInfo.GetUpdatesSource source = 1 [deprecated = true];</code>
   * @return The source.
   */
  @java.lang.Deprecated org.chromium.components.sync.protocol.GetUpdatesCallerInfo.GetUpdatesSource getSource();

  /**
   * <pre>
   * True only if notifications were enabled for this GetUpdateMessage.
   * TODO(crbug.com/510165): Move this bool out of GetUpdatesCallerInfo so that
   * GetUpdatesCallerInfo can eventually be removed.
   * </pre>
   *
   * <code>optional bool notifications_enabled = 2;</code>
   * @return Whether the notificationsEnabled field is set.
   */
  boolean hasNotificationsEnabled();
  /**
   * <pre>
   * True only if notifications were enabled for this GetUpdateMessage.
   * TODO(crbug.com/510165): Move this bool out of GetUpdatesCallerInfo so that
   * GetUpdatesCallerInfo can eventually be removed.
   * </pre>
   *
   * <code>optional bool notifications_enabled = 2;</code>
   * @return The notificationsEnabled.
   */
  boolean getNotificationsEnabled();
}
