// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/sync.proto

package org.chromium.components.sync.protocol;

public interface ChipBagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ChipBag)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Server chips are deliberately oqaque, allowing the server
   * to encapsulate its state machine logic.
   * </pre>
   *
   * <code>optional bytes server_chips = 1;</code>
   * @return Whether the serverChips field is set.
   */
  boolean hasServerChips();
  /**
   * <pre>
   * Server chips are deliberately oqaque, allowing the server
   * to encapsulate its state machine logic.
   * </pre>
   *
   * <code>optional bytes server_chips = 1;</code>
   * @return The serverChips.
   */
  com.google.protobuf.ByteString getServerChips();
}
