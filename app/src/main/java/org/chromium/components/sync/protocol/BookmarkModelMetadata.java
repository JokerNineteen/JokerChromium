// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/bookmark_model_metadata.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Sync proto to carry the sync metadata for the bookmarks model. It is used for
 * persisting and loading sync metadata from disk.
 * </pre>
 *
 * Protobuf type {@code sync_pb.BookmarkModelMetadata}
 */
public  final class BookmarkModelMetadata extends
    com.google.protobuf.GeneratedMessageLite<
        BookmarkModelMetadata, BookmarkModelMetadata.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.BookmarkModelMetadata)
    BookmarkModelMetadataOrBuilder {
  private BookmarkModelMetadata() {
    bookmarksMetadata_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int MODEL_TYPE_STATE_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.ModelTypeState modelTypeState_;
  /**
   * <pre>
   * Bookmark global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  @java.lang.Override
  public boolean hasModelTypeState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Bookmark global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.ModelTypeState getModelTypeState() {
    return modelTypeState_ == null ? org.chromium.components.sync.protocol.ModelTypeState.getDefaultInstance() : modelTypeState_;
  }
  /**
   * <pre>
   * Bookmark global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  private void setModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
    value.getClass();
  modelTypeState_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Bookmark global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
    value.getClass();
  if (modelTypeState_ != null &&
        modelTypeState_ != org.chromium.components.sync.protocol.ModelTypeState.getDefaultInstance()) {
      modelTypeState_ =
        org.chromium.components.sync.protocol.ModelTypeState.newBuilder(modelTypeState_).mergeFrom(value).buildPartial();
    } else {
      modelTypeState_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Bookmark global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  private void clearModelTypeState() {  modelTypeState_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int BOOKMARKS_METADATA_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.BookmarkMetadata> bookmarksMetadata_;
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.components.sync.protocol.BookmarkMetadata> getBookmarksMetadataList() {
    return bookmarksMetadata_;
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  public java.util.List<? extends org.chromium.components.sync.protocol.BookmarkMetadataOrBuilder> 
      getBookmarksMetadataOrBuilderList() {
    return bookmarksMetadata_;
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  @java.lang.Override
  public int getBookmarksMetadataCount() {
    return bookmarksMetadata_.size();
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.BookmarkMetadata getBookmarksMetadata(int index) {
    return bookmarksMetadata_.get(index);
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  public org.chromium.components.sync.protocol.BookmarkMetadataOrBuilder getBookmarksMetadataOrBuilder(
      int index) {
    return bookmarksMetadata_.get(index);
  }
  private void ensureBookmarksMetadataIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.BookmarkMetadata> tmp = bookmarksMetadata_;
    if (!tmp.isModifiable()) {
      bookmarksMetadata_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  private void setBookmarksMetadata(
      int index, org.chromium.components.sync.protocol.BookmarkMetadata value) {
    value.getClass();
  ensureBookmarksMetadataIsMutable();
    bookmarksMetadata_.set(index, value);
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  private void addBookmarksMetadata(org.chromium.components.sync.protocol.BookmarkMetadata value) {
    value.getClass();
  ensureBookmarksMetadataIsMutable();
    bookmarksMetadata_.add(value);
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  private void addBookmarksMetadata(
      int index, org.chromium.components.sync.protocol.BookmarkMetadata value) {
    value.getClass();
  ensureBookmarksMetadataIsMutable();
    bookmarksMetadata_.add(index, value);
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  private void addAllBookmarksMetadata(
      java.lang.Iterable<? extends org.chromium.components.sync.protocol.BookmarkMetadata> values) {
    ensureBookmarksMetadataIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, bookmarksMetadata_);
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  private void clearBookmarksMetadata() {
    bookmarksMetadata_ = emptyProtobufList();
  }
  /**
   * <pre>
   * A set of all bookmarks metadata.
   * </pre>
   *
   * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
   */
  private void removeBookmarksMetadata(int index) {
    ensureBookmarksMetadataIsMutable();
    bookmarksMetadata_.remove(index);
  }

  public static final int BOOKMARKS_FULL_TITLE_REUPLOADED_FIELD_NUMBER = 3;
  private boolean bookmarksFullTitleReuploaded_;
  /**
   * <pre>
   * Indicates whether the reupload of bookmarks has been triggered such that
   * they include the full title, which means that their sequence number has
   * been increased (independently of whether the commit has succeeded or even
   * started).
   * TODO(crbug.com/1066962): remove this code when most of bookmarks are
   * reuploaded.
   * </pre>
   *
   * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
   * @return Whether the bookmarksFullTitleReuploaded field is set.
   */
  @java.lang.Override
  public boolean hasBookmarksFullTitleReuploaded() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Indicates whether the reupload of bookmarks has been triggered such that
   * they include the full title, which means that their sequence number has
   * been increased (independently of whether the commit has succeeded or even
   * started).
   * TODO(crbug.com/1066962): remove this code when most of bookmarks are
   * reuploaded.
   * </pre>
   *
   * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
   * @return The bookmarksFullTitleReuploaded.
   */
  @java.lang.Override
  public boolean getBookmarksFullTitleReuploaded() {
    return bookmarksFullTitleReuploaded_;
  }
  /**
   * <pre>
   * Indicates whether the reupload of bookmarks has been triggered such that
   * they include the full title, which means that their sequence number has
   * been increased (independently of whether the commit has succeeded or even
   * started).
   * TODO(crbug.com/1066962): remove this code when most of bookmarks are
   * reuploaded.
   * </pre>
   *
   * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
   * @param value The bookmarksFullTitleReuploaded to set.
   */
  private void setBookmarksFullTitleReuploaded(boolean value) {
    bitField0_ |= 0x00000002;
    bookmarksFullTitleReuploaded_ = value;
  }
  /**
   * <pre>
   * Indicates whether the reupload of bookmarks has been triggered such that
   * they include the full title, which means that their sequence number has
   * been increased (independently of whether the commit has succeeded or even
   * started).
   * TODO(crbug.com/1066962): remove this code when most of bookmarks are
   * reuploaded.
   * </pre>
   *
   * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
   */
  private void clearBookmarksFullTitleReuploaded() {
    bitField0_ = (bitField0_ & ~0x00000002);
    bookmarksFullTitleReuploaded_ = false;
  }

  public static final int LAST_SYNC_TIME_FIELD_NUMBER = 4;
  private long lastSyncTime_;
  /**
   * <pre>
   * The local timestamp corresponding to the last time remote updates were
   * received, in milliseconds since Unix epoch. Introduced in M86.
   * TODO(crbug.com/1032052): Remove this code once all local sync metadata
   * is required to populate the client tag (and be considered invalid
   * otherwise).
   * </pre>
   *
   * <code>optional int64 last_sync_time = 4;</code>
   * @return Whether the lastSyncTime field is set.
   */
  @java.lang.Override
  public boolean hasLastSyncTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The local timestamp corresponding to the last time remote updates were
   * received, in milliseconds since Unix epoch. Introduced in M86.
   * TODO(crbug.com/1032052): Remove this code once all local sync metadata
   * is required to populate the client tag (and be considered invalid
   * otherwise).
   * </pre>
   *
   * <code>optional int64 last_sync_time = 4;</code>
   * @return The lastSyncTime.
   */
  @java.lang.Override
  public long getLastSyncTime() {
    return lastSyncTime_;
  }
  /**
   * <pre>
   * The local timestamp corresponding to the last time remote updates were
   * received, in milliseconds since Unix epoch. Introduced in M86.
   * TODO(crbug.com/1032052): Remove this code once all local sync metadata
   * is required to populate the client tag (and be considered invalid
   * otherwise).
   * </pre>
   *
   * <code>optional int64 last_sync_time = 4;</code>
   * @param value The lastSyncTime to set.
   */
  private void setLastSyncTime(long value) {
    bitField0_ |= 0x00000004;
    lastSyncTime_ = value;
  }
  /**
   * <pre>
   * The local timestamp corresponding to the last time remote updates were
   * received, in milliseconds since Unix epoch. Introduced in M86.
   * TODO(crbug.com/1032052): Remove this code once all local sync metadata
   * is required to populate the client tag (and be considered invalid
   * otherwise).
   * </pre>
   *
   * <code>optional int64 last_sync_time = 4;</code>
   */
  private void clearLastSyncTime() {
    bitField0_ = (bitField0_ & ~0x00000004);
    lastSyncTime_ = 0L;
  }

  public static final int BOOKMARK_CLIENT_TAGS_IN_PROTOCOL_ENABLED_FIELD_NUMBER = 5;
  private boolean bookmarkClientTagsInProtocolEnabled_;
  /**
   * <pre>
   * Represents whether bookmark commits sent to the server (most importantly
   * creations) populate client tags. This is a layer on top of the usual
   * FeatureList to avoid risky transitions during startup, to guard against
   * in-flight commits.
   * TODO(crbug.com/1032052): remove this code when the logic is enabled by
   * default and enforced to true upon startup.
   * </pre>
   *
   * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
   * @return Whether the bookmarkClientTagsInProtocolEnabled field is set.
   */
  @java.lang.Override
  public boolean hasBookmarkClientTagsInProtocolEnabled() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Represents whether bookmark commits sent to the server (most importantly
   * creations) populate client tags. This is a layer on top of the usual
   * FeatureList to avoid risky transitions during startup, to guard against
   * in-flight commits.
   * TODO(crbug.com/1032052): remove this code when the logic is enabled by
   * default and enforced to true upon startup.
   * </pre>
   *
   * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
   * @return The bookmarkClientTagsInProtocolEnabled.
   */
  @java.lang.Override
  public boolean getBookmarkClientTagsInProtocolEnabled() {
    return bookmarkClientTagsInProtocolEnabled_;
  }
  /**
   * <pre>
   * Represents whether bookmark commits sent to the server (most importantly
   * creations) populate client tags. This is a layer on top of the usual
   * FeatureList to avoid risky transitions during startup, to guard against
   * in-flight commits.
   * TODO(crbug.com/1032052): remove this code when the logic is enabled by
   * default and enforced to true upon startup.
   * </pre>
   *
   * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
   * @param value The bookmarkClientTagsInProtocolEnabled to set.
   */
  private void setBookmarkClientTagsInProtocolEnabled(boolean value) {
    bitField0_ |= 0x00000008;
    bookmarkClientTagsInProtocolEnabled_ = value;
  }
  /**
   * <pre>
   * Represents whether bookmark commits sent to the server (most importantly
   * creations) populate client tags. This is a layer on top of the usual
   * FeatureList to avoid risky transitions during startup, to guard against
   * in-flight commits.
   * TODO(crbug.com/1032052): remove this code when the logic is enabled by
   * default and enforced to true upon startup.
   * </pre>
   *
   * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
   */
  private void clearBookmarkClientTagsInProtocolEnabled() {
    bitField0_ = (bitField0_ & ~0x00000008);
    bookmarkClientTagsInProtocolEnabled_ = false;
  }

  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.BookmarkModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.BookmarkModelMetadata prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Sync proto to carry the sync metadata for the bookmarks model. It is used for
   * persisting and loading sync metadata from disk.
   * </pre>
   *
   * Protobuf type {@code sync_pb.BookmarkModelMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.BookmarkModelMetadata, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.BookmarkModelMetadata)
      org.chromium.components.sync.protocol.BookmarkModelMetadataOrBuilder {
    // Construct using org.chromium.components.sync.protocol.BookmarkModelMetadata.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Bookmark global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    @java.lang.Override
    public boolean hasModelTypeState() {
      return instance.hasModelTypeState();
    }
    /**
     * <pre>
     * Bookmark global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.ModelTypeState getModelTypeState() {
      return instance.getModelTypeState();
    }
    /**
     * <pre>
     * Bookmark global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder setModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
      copyOnWrite();
      instance.setModelTypeState(value);
      return this;
      }
    /**
     * <pre>
     * Bookmark global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder setModelTypeState(
        org.chromium.components.sync.protocol.ModelTypeState.Builder builderForValue) {
      copyOnWrite();
      instance.setModelTypeState(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Bookmark global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder mergeModelTypeState(org.chromium.components.sync.protocol.ModelTypeState value) {
      copyOnWrite();
      instance.mergeModelTypeState(value);
      return this;
    }
    /**
     * <pre>
     * Bookmark global metadata.
     * </pre>
     *
     * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
     */
    public Builder clearModelTypeState() {  copyOnWrite();
      instance.clearModelTypeState();
      return this;
    }

    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.components.sync.protocol.BookmarkMetadata> getBookmarksMetadataList() {
      return java.util.Collections.unmodifiableList(
          instance.getBookmarksMetadataList());
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    @java.lang.Override
    public int getBookmarksMetadataCount() {
      return instance.getBookmarksMetadataCount();
    }/**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.BookmarkMetadata getBookmarksMetadata(int index) {
      return instance.getBookmarksMetadata(index);
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder setBookmarksMetadata(
        int index, org.chromium.components.sync.protocol.BookmarkMetadata value) {
      copyOnWrite();
      instance.setBookmarksMetadata(index, value);
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder setBookmarksMetadata(
        int index, org.chromium.components.sync.protocol.BookmarkMetadata.Builder builderForValue) {
      copyOnWrite();
      instance.setBookmarksMetadata(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder addBookmarksMetadata(org.chromium.components.sync.protocol.BookmarkMetadata value) {
      copyOnWrite();
      instance.addBookmarksMetadata(value);
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder addBookmarksMetadata(
        int index, org.chromium.components.sync.protocol.BookmarkMetadata value) {
      copyOnWrite();
      instance.addBookmarksMetadata(index, value);
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder addBookmarksMetadata(
        org.chromium.components.sync.protocol.BookmarkMetadata.Builder builderForValue) {
      copyOnWrite();
      instance.addBookmarksMetadata(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder addBookmarksMetadata(
        int index, org.chromium.components.sync.protocol.BookmarkMetadata.Builder builderForValue) {
      copyOnWrite();
      instance.addBookmarksMetadata(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder addAllBookmarksMetadata(
        java.lang.Iterable<? extends org.chromium.components.sync.protocol.BookmarkMetadata> values) {
      copyOnWrite();
      instance.addAllBookmarksMetadata(values);
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder clearBookmarksMetadata() {
      copyOnWrite();
      instance.clearBookmarksMetadata();
      return this;
    }
    /**
     * <pre>
     * A set of all bookmarks metadata.
     * </pre>
     *
     * <code>repeated .sync_pb.BookmarkMetadata bookmarks_metadata = 2;</code>
     */
    public Builder removeBookmarksMetadata(int index) {
      copyOnWrite();
      instance.removeBookmarksMetadata(index);
      return this;
    }

    /**
     * <pre>
     * Indicates whether the reupload of bookmarks has been triggered such that
     * they include the full title, which means that their sequence number has
     * been increased (independently of whether the commit has succeeded or even
     * started).
     * TODO(crbug.com/1066962): remove this code when most of bookmarks are
     * reuploaded.
     * </pre>
     *
     * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
     * @return Whether the bookmarksFullTitleReuploaded field is set.
     */
    @java.lang.Override
    public boolean hasBookmarksFullTitleReuploaded() {
      return instance.hasBookmarksFullTitleReuploaded();
    }
    /**
     * <pre>
     * Indicates whether the reupload of bookmarks has been triggered such that
     * they include the full title, which means that their sequence number has
     * been increased (independently of whether the commit has succeeded or even
     * started).
     * TODO(crbug.com/1066962): remove this code when most of bookmarks are
     * reuploaded.
     * </pre>
     *
     * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
     * @return The bookmarksFullTitleReuploaded.
     */
    @java.lang.Override
    public boolean getBookmarksFullTitleReuploaded() {
      return instance.getBookmarksFullTitleReuploaded();
    }
    /**
     * <pre>
     * Indicates whether the reupload of bookmarks has been triggered such that
     * they include the full title, which means that their sequence number has
     * been increased (independently of whether the commit has succeeded or even
     * started).
     * TODO(crbug.com/1066962): remove this code when most of bookmarks are
     * reuploaded.
     * </pre>
     *
     * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
     * @param value The bookmarksFullTitleReuploaded to set.
     * @return This builder for chaining.
     */
    public Builder setBookmarksFullTitleReuploaded(boolean value) {
      copyOnWrite();
      instance.setBookmarksFullTitleReuploaded(value);
      return this;
    }
    /**
     * <pre>
     * Indicates whether the reupload of bookmarks has been triggered such that
     * they include the full title, which means that their sequence number has
     * been increased (independently of whether the commit has succeeded or even
     * started).
     * TODO(crbug.com/1066962): remove this code when most of bookmarks are
     * reuploaded.
     * </pre>
     *
     * <code>optional bool bookmarks_full_title_reuploaded = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBookmarksFullTitleReuploaded() {
      copyOnWrite();
      instance.clearBookmarksFullTitleReuploaded();
      return this;
    }

    /**
     * <pre>
     * The local timestamp corresponding to the last time remote updates were
     * received, in milliseconds since Unix epoch. Introduced in M86.
     * TODO(crbug.com/1032052): Remove this code once all local sync metadata
     * is required to populate the client tag (and be considered invalid
     * otherwise).
     * </pre>
     *
     * <code>optional int64 last_sync_time = 4;</code>
     * @return Whether the lastSyncTime field is set.
     */
    @java.lang.Override
    public boolean hasLastSyncTime() {
      return instance.hasLastSyncTime();
    }
    /**
     * <pre>
     * The local timestamp corresponding to the last time remote updates were
     * received, in milliseconds since Unix epoch. Introduced in M86.
     * TODO(crbug.com/1032052): Remove this code once all local sync metadata
     * is required to populate the client tag (and be considered invalid
     * otherwise).
     * </pre>
     *
     * <code>optional int64 last_sync_time = 4;</code>
     * @return The lastSyncTime.
     */
    @java.lang.Override
    public long getLastSyncTime() {
      return instance.getLastSyncTime();
    }
    /**
     * <pre>
     * The local timestamp corresponding to the last time remote updates were
     * received, in milliseconds since Unix epoch. Introduced in M86.
     * TODO(crbug.com/1032052): Remove this code once all local sync metadata
     * is required to populate the client tag (and be considered invalid
     * otherwise).
     * </pre>
     *
     * <code>optional int64 last_sync_time = 4;</code>
     * @param value The lastSyncTime to set.
     * @return This builder for chaining.
     */
    public Builder setLastSyncTime(long value) {
      copyOnWrite();
      instance.setLastSyncTime(value);
      return this;
    }
    /**
     * <pre>
     * The local timestamp corresponding to the last time remote updates were
     * received, in milliseconds since Unix epoch. Introduced in M86.
     * TODO(crbug.com/1032052): Remove this code once all local sync metadata
     * is required to populate the client tag (and be considered invalid
     * otherwise).
     * </pre>
     *
     * <code>optional int64 last_sync_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastSyncTime() {
      copyOnWrite();
      instance.clearLastSyncTime();
      return this;
    }

    /**
     * <pre>
     * Represents whether bookmark commits sent to the server (most importantly
     * creations) populate client tags. This is a layer on top of the usual
     * FeatureList to avoid risky transitions during startup, to guard against
     * in-flight commits.
     * TODO(crbug.com/1032052): remove this code when the logic is enabled by
     * default and enforced to true upon startup.
     * </pre>
     *
     * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
     * @return Whether the bookmarkClientTagsInProtocolEnabled field is set.
     */
    @java.lang.Override
    public boolean hasBookmarkClientTagsInProtocolEnabled() {
      return instance.hasBookmarkClientTagsInProtocolEnabled();
    }
    /**
     * <pre>
     * Represents whether bookmark commits sent to the server (most importantly
     * creations) populate client tags. This is a layer on top of the usual
     * FeatureList to avoid risky transitions during startup, to guard against
     * in-flight commits.
     * TODO(crbug.com/1032052): remove this code when the logic is enabled by
     * default and enforced to true upon startup.
     * </pre>
     *
     * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
     * @return The bookmarkClientTagsInProtocolEnabled.
     */
    @java.lang.Override
    public boolean getBookmarkClientTagsInProtocolEnabled() {
      return instance.getBookmarkClientTagsInProtocolEnabled();
    }
    /**
     * <pre>
     * Represents whether bookmark commits sent to the server (most importantly
     * creations) populate client tags. This is a layer on top of the usual
     * FeatureList to avoid risky transitions during startup, to guard against
     * in-flight commits.
     * TODO(crbug.com/1032052): remove this code when the logic is enabled by
     * default and enforced to true upon startup.
     * </pre>
     *
     * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
     * @param value The bookmarkClientTagsInProtocolEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setBookmarkClientTagsInProtocolEnabled(boolean value) {
      copyOnWrite();
      instance.setBookmarkClientTagsInProtocolEnabled(value);
      return this;
    }
    /**
     * <pre>
     * Represents whether bookmark commits sent to the server (most importantly
     * creations) populate client tags. This is a layer on top of the usual
     * FeatureList to avoid risky transitions during startup, to guard against
     * in-flight commits.
     * TODO(crbug.com/1032052): remove this code when the logic is enabled by
     * default and enforced to true upon startup.
     * </pre>
     *
     * <code>optional bool bookmark_client_tags_in_protocol_enabled = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBookmarkClientTagsInProtocolEnabled() {
      copyOnWrite();
      instance.clearBookmarkClientTagsInProtocolEnabled();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.BookmarkModelMetadata)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.BookmarkModelMetadata();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "modelTypeState_",
            "bookmarksMetadata_",
            org.chromium.components.sync.protocol.BookmarkMetadata.class,
            "bookmarksFullTitleReuploaded_",
            "lastSyncTime_",
            "bookmarkClientTagsInProtocolEnabled_",
          };
          java.lang.String info =
              "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1009\u0000\u0002" +
              "\u001b\u0003\u1007\u0001\u0004\u1002\u0002\u0005\u1007\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.BookmarkModelMetadata> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.BookmarkModelMetadata.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.BookmarkModelMetadata>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.BookmarkModelMetadata)
  private static final org.chromium.components.sync.protocol.BookmarkModelMetadata DEFAULT_INSTANCE;
  static {
    BookmarkModelMetadata defaultInstance = new BookmarkModelMetadata();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      BookmarkModelMetadata.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.BookmarkModelMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BookmarkModelMetadata> PARSER;

  public static com.google.protobuf.Parser<BookmarkModelMetadata> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

