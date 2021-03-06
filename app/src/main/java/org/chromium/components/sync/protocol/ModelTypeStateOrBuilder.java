// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/model_type_state.proto

package org.chromium.components.sync.protocol;

public interface ModelTypeStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ModelTypeState)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The latest progress markers received from the server.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeProgressMarker progress_marker = 1;</code>
   * @return Whether the progressMarker field is set.
   */
  boolean hasProgressMarker();
  /**
   * <pre>
   * The latest progress markers received from the server.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeProgressMarker progress_marker = 1;</code>
   * @return The progressMarker.
   */
  org.chromium.components.sync.protocol.DataTypeProgressMarker getProgressMarker();

  /**
   * <pre>
   * A data type context.  Sent to the server in every commit or update
   * request.  May be updated by either responses from the server or requests
   * made on the model thread.  The interpretation of this value may be
   * data-type specific.  Many data types ignore it.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeContext type_context = 2;</code>
   * @return Whether the typeContext field is set.
   */
  boolean hasTypeContext();
  /**
   * <pre>
   * A data type context.  Sent to the server in every commit or update
   * request.  May be updated by either responses from the server or requests
   * made on the model thread.  The interpretation of this value may be
   * data-type specific.  Many data types ignore it.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeContext type_context = 2;</code>
   * @return The typeContext.
   */
  org.chromium.components.sync.protocol.DataTypeContext getTypeContext();

  /**
   * <pre>
   * This value is set if this type's data should be encrypted on the server.
   * If this key changes, the client will need to re-commit all of its local
   * data to the server using the new encryption key.
   * </pre>
   *
   * <code>optional string encryption_key_name = 3;</code>
   * @return Whether the encryptionKeyName field is set.
   */
  boolean hasEncryptionKeyName();
  /**
   * <pre>
   * This value is set if this type's data should be encrypted on the server.
   * If this key changes, the client will need to re-commit all of its local
   * data to the server using the new encryption key.
   * </pre>
   *
   * <code>optional string encryption_key_name = 3;</code>
   * @return The encryptionKeyName.
   */
  java.lang.String getEncryptionKeyName();
  /**
   * <pre>
   * This value is set if this type's data should be encrypted on the server.
   * If this key changes, the client will need to re-commit all of its local
   * data to the server using the new encryption key.
   * </pre>
   *
   * <code>optional string encryption_key_name = 3;</code>
   * @return The bytes for encryptionKeyName.
   */
  com.google.protobuf.ByteString
      getEncryptionKeyNameBytes();

  /**
   * <pre>
   * This flag is set to true when the first download cycle is complete.  The
   * ModelTypeProcessor should not attempt to commit any items until this
   * flag is set.
   * </pre>
   *
   * <code>optional bool initial_sync_done = 4;</code>
   * @return Whether the initialSyncDone field is set.
   */
  boolean hasInitialSyncDone();
  /**
   * <pre>
   * This flag is set to true when the first download cycle is complete.  The
   * ModelTypeProcessor should not attempt to commit any items until this
   * flag is set.
   * </pre>
   *
   * <code>optional bool initial_sync_done = 4;</code>
   * @return The initialSyncDone.
   */
  boolean getInitialSyncDone();

  /**
   * <pre>
   * A GUID that identifies the committing sync client. It's persisted within
   * the sync metadata and should be used to check the integrity of the
   * metadata. Mismatches with the guid of the running client indicates invalid
   * persisted sync metadata, because cache_guid is reset when sync is disabled,
   * and disabling sync is supposed to clear sync metadata.
   * </pre>
   *
   * <code>optional string cache_guid = 5;</code>
   * @return Whether the cacheGuid field is set.
   */
  boolean hasCacheGuid();
  /**
   * <pre>
   * A GUID that identifies the committing sync client. It's persisted within
   * the sync metadata and should be used to check the integrity of the
   * metadata. Mismatches with the guid of the running client indicates invalid
   * persisted sync metadata, because cache_guid is reset when sync is disabled,
   * and disabling sync is supposed to clear sync metadata.
   * </pre>
   *
   * <code>optional string cache_guid = 5;</code>
   * @return The cacheGuid.
   */
  java.lang.String getCacheGuid();
  /**
   * <pre>
   * A GUID that identifies the committing sync client. It's persisted within
   * the sync metadata and should be used to check the integrity of the
   * metadata. Mismatches with the guid of the running client indicates invalid
   * persisted sync metadata, because cache_guid is reset when sync is disabled,
   * and disabling sync is supposed to clear sync metadata.
   * </pre>
   *
   * <code>optional string cache_guid = 5;</code>
   * @return The bytes for cacheGuid.
   */
  com.google.protobuf.ByteString
      getCacheGuidBytes();

  /**
   * <pre>
   * Syncing account ID, representing the user.
   * </pre>
   *
   * <code>optional string authenticated_account_id = 6;</code>
   * @return Whether the authenticatedAccountId field is set.
   */
  boolean hasAuthenticatedAccountId();
  /**
   * <pre>
   * Syncing account ID, representing the user.
   * </pre>
   *
   * <code>optional string authenticated_account_id = 6;</code>
   * @return The authenticatedAccountId.
   */
  java.lang.String getAuthenticatedAccountId();
  /**
   * <pre>
   * Syncing account ID, representing the user.
   * </pre>
   *
   * <code>optional string authenticated_account_id = 6;</code>
   * @return The bytes for authenticatedAccountId.
   */
  com.google.protobuf.ByteString
      getAuthenticatedAccountIdBytes();
}
