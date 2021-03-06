// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/sync.proto

package org.chromium.components.sync.protocol;

public interface DataTypeContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.DataTypeContext)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The type this context is associated with.
   * </pre>
   *
   * <code>optional int32 data_type_id = 1;</code>
   * @return Whether the dataTypeId field is set.
   */
  boolean hasDataTypeId();
  /**
   * <pre>
   * The type this context is associated with.
   * </pre>
   *
   * <code>optional int32 data_type_id = 1;</code>
   * @return The dataTypeId.
   */
  int getDataTypeId();

  /**
   * <pre>
   * The context for the datatype.
   * </pre>
   *
   * <code>optional bytes context = 2;</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <pre>
   * The context for the datatype.
   * </pre>
   *
   * <code>optional bytes context = 2;</code>
   * @return The context.
   */
  com.google.protobuf.ByteString getContext();

  /**
   * <pre>
   * The version of the context.
   * </pre>
   *
   * <code>optional int64 version = 3;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * The version of the context.
   * </pre>
   *
   * <code>optional int64 version = 3;</code>
   * @return The version.
   */
  long getVersion();
}
