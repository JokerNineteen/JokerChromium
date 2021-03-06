// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/experiments_specifics.proto

package org.chromium.components.sync.protocol;

public interface ExperimentsSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ExperimentsSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .sync_pb.KeystoreEncryptionFlags keystore_encryption = 1;</code>
   * @return Whether the keystoreEncryption field is set.
   */
  boolean hasKeystoreEncryption();
  /**
   * <code>optional .sync_pb.KeystoreEncryptionFlags keystore_encryption = 1;</code>
   * @return The keystoreEncryption.
   */
  org.chromium.components.sync.protocol.KeystoreEncryptionFlags getKeystoreEncryption();

  /**
   * <code>optional .sync_pb.HistoryDeleteDirectives history_delete_directives = 2;</code>
   * @return Whether the historyDeleteDirectives field is set.
   */
  boolean hasHistoryDeleteDirectives();
  /**
   * <code>optional .sync_pb.HistoryDeleteDirectives history_delete_directives = 2;</code>
   * @return The historyDeleteDirectives.
   */
  org.chromium.components.sync.protocol.HistoryDeleteDirectives getHistoryDeleteDirectives();

  /**
   * <code>optional .sync_pb.AutofillCullingFlags autofill_culling = 3;</code>
   * @return Whether the autofillCulling field is set.
   */
  boolean hasAutofillCulling();
  /**
   * <code>optional .sync_pb.AutofillCullingFlags autofill_culling = 3;</code>
   * @return The autofillCulling.
   */
  org.chromium.components.sync.protocol.AutofillCullingFlags getAutofillCulling();

  /**
   * <code>optional .sync_pb.FaviconSyncFlags favicon_sync = 4;</code>
   * @return Whether the faviconSync field is set.
   */
  boolean hasFaviconSync();
  /**
   * <code>optional .sync_pb.FaviconSyncFlags favicon_sync = 4;</code>
   * @return The faviconSync.
   */
  org.chromium.components.sync.protocol.FaviconSyncFlags getFaviconSync();

  /**
   * <code>optional .sync_pb.PreCommitUpdateAvoidanceFlags pre_commit_update_avoidance = 5;</code>
   * @return Whether the preCommitUpdateAvoidance field is set.
   */
  boolean hasPreCommitUpdateAvoidance();
  /**
   * <code>optional .sync_pb.PreCommitUpdateAvoidanceFlags pre_commit_update_avoidance = 5;</code>
   * @return The preCommitUpdateAvoidance.
   */
  org.chromium.components.sync.protocol.PreCommitUpdateAvoidanceFlags getPreCommitUpdateAvoidance();

  /**
   * <code>optional .sync_pb.GcmChannelFlags gcm_channel = 6;</code>
   * @return Whether the gcmChannel field is set.
   */
  boolean hasGcmChannel();
  /**
   * <code>optional .sync_pb.GcmChannelFlags gcm_channel = 6;</code>
   * @return The gcmChannel.
   */
  org.chromium.components.sync.protocol.GcmChannelFlags getGcmChannel();

  /**
   * <pre>
   * No longer used as of M43.
   * </pre>
   *
   * <code>optional .sync_pb.EnhancedBookmarksFlags obsolete_enhanced_bookmarks = 7;</code>
   * @return Whether the obsoleteEnhancedBookmarks field is set.
   */
  boolean hasObsoleteEnhancedBookmarks();
  /**
   * <pre>
   * No longer used as of M43.
   * </pre>
   *
   * <code>optional .sync_pb.EnhancedBookmarksFlags obsolete_enhanced_bookmarks = 7;</code>
   * @return The obsoleteEnhancedBookmarks.
   */
  org.chromium.components.sync.protocol.EnhancedBookmarksFlags getObsoleteEnhancedBookmarks();

  /**
   * <pre>
   * No longer used as of M72.
   * </pre>
   *
   * <code>optional .sync_pb.GcmInvalidationsFlags gcm_invalidations = 8;</code>
   * @return Whether the gcmInvalidations field is set.
   */
  boolean hasGcmInvalidations();
  /**
   * <pre>
   * No longer used as of M72.
   * </pre>
   *
   * <code>optional .sync_pb.GcmInvalidationsFlags gcm_invalidations = 8;</code>
   * @return The gcmInvalidations.
   */
  org.chromium.components.sync.protocol.GcmInvalidationsFlags getGcmInvalidations();

  /**
   * <pre>
   * No longer used as of M51.
   * </pre>
   *
   * <code>optional .sync_pb.WalletSyncFlags obsolete_wallet_sync = 9;</code>
   * @return Whether the obsoleteWalletSync field is set.
   */
  boolean hasObsoleteWalletSync();
  /**
   * <pre>
   * No longer used as of M51.
   * </pre>
   *
   * <code>optional .sync_pb.WalletSyncFlags obsolete_wallet_sync = 9;</code>
   * @return The obsoleteWalletSync.
   */
  org.chromium.components.sync.protocol.WalletSyncFlags getObsoleteWalletSync();
}
