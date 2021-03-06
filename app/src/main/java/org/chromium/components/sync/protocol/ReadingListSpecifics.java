// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/reading_list_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Sync Reading list entry. This proto contains the fields synced for a reading
 * list entry. It must be kept synced with the reading_list.ReadingListLocal
 * protobuf.
 * </pre>
 *
 * Protobuf type {@code sync_pb.ReadingListSpecifics}
 */
public  final class ReadingListSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        ReadingListSpecifics, ReadingListSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.ReadingListSpecifics)
    ReadingListSpecificsOrBuilder {
  private ReadingListSpecifics() {
    entryId_ = "";
    title_ = "";
    url_ = "";
  }
  /**
   * Protobuf enum {@code sync_pb.ReadingListSpecifics.ReadingListEntryStatus}
   */
  public enum ReadingListEntryStatus
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNREAD = 0;</code>
     */
    UNREAD(0),
    /**
     * <code>READ = 1;</code>
     */
    READ(1),
    /**
     * <code>UNSEEN = 2;</code>
     */
    UNSEEN(2),
    ;

    /**
     * <code>UNREAD = 0;</code>
     */
    public static final int UNREAD_VALUE = 0;
    /**
     * <code>READ = 1;</code>
     */
    public static final int READ_VALUE = 1;
    /**
     * <code>UNSEEN = 2;</code>
     */
    public static final int UNSEEN_VALUE = 2;


    @java.lang.Override
    public final int getNumber() {
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReadingListEntryStatus valueOf(int value) {
      return forNumber(value);
    }

    public static ReadingListEntryStatus forNumber(int value) {
      switch (value) {
        case 0: return UNREAD;
        case 1: return READ;
        case 2: return UNSEEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReadingListEntryStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReadingListEntryStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReadingListEntryStatus>() {
            @java.lang.Override
            public ReadingListEntryStatus findValueByNumber(int number) {
              return ReadingListEntryStatus.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return ReadingListEntryStatusVerifier.INSTANCE;
    }

    private static final class ReadingListEntryStatusVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ReadingListEntryStatusVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return ReadingListEntryStatus.forNumber(number) != null;
            }
          };

    private final int value;

    private ReadingListEntryStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sync_pb.ReadingListSpecifics.ReadingListEntryStatus)
  }

  private int bitField0_;
  public static final int ENTRY_ID_FIELD_NUMBER = 1;
  private java.lang.String entryId_;
  /**
   * <code>optional string entry_id = 1;</code>
   * @return Whether the entryId field is set.
   */
  @java.lang.Override
  public boolean hasEntryId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string entry_id = 1;</code>
   * @return The entryId.
   */
  @java.lang.Override
  public java.lang.String getEntryId() {
    return entryId_;
  }
  /**
   * <code>optional string entry_id = 1;</code>
   * @return The bytes for entryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntryIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(entryId_);
  }
  /**
   * <code>optional string entry_id = 1;</code>
   * @param value The entryId to set.
   */
  private void setEntryId(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    entryId_ = value;
  }
  /**
   * <code>optional string entry_id = 1;</code>
   */
  private void clearEntryId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    entryId_ = getDefaultInstance().getEntryId();
  }
  /**
   * <code>optional string entry_id = 1;</code>
   * @param value The bytes for entryId to set.
   */
  private void setEntryIdBytes(
      com.google.protobuf.ByteString value) {
    entryId_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private java.lang.String title_;
  /**
   * <code>optional string title = 2;</code>
   * @return Whether the title field is set.
   */
  @java.lang.Override
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    return title_;
  }
  /**
   * <code>optional string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(title_);
  }
  /**
   * <code>optional string title = 2;</code>
   * @param value The title to set.
   */
  private void setTitle(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    title_ = value;
  }
  /**
   * <code>optional string title = 2;</code>
   */
  private void clearTitle() {
    bitField0_ = (bitField0_ & ~0x00000002);
    title_ = getDefaultInstance().getTitle();
  }
  /**
   * <code>optional string title = 2;</code>
   * @param value The bytes for title to set.
   */
  private void setTitleBytes(
      com.google.protobuf.ByteString value) {
    title_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static final int URL_FIELD_NUMBER = 3;
  private java.lang.String url_;
  /**
   * <code>optional string url = 3;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string url = 3;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    return url_;
  }
  /**
   * <code>optional string url = 3;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(url_);
  }
  /**
   * <code>optional string url = 3;</code>
   * @param value The url to set.
   */
  private void setUrl(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000004;
    url_ = value;
  }
  /**
   * <code>optional string url = 3;</code>
   */
  private void clearUrl() {
    bitField0_ = (bitField0_ & ~0x00000004);
    url_ = getDefaultInstance().getUrl();
  }
  /**
   * <code>optional string url = 3;</code>
   * @param value The bytes for url to set.
   */
  private void setUrlBytes(
      com.google.protobuf.ByteString value) {
    url_ = value.toStringUtf8();
    bitField0_ |= 0x00000004;
  }

  public static final int CREATION_TIME_US_FIELD_NUMBER = 4;
  private long creationTimeUs_;
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   * @return Whether the creationTimeUs field is set.
   */
  @java.lang.Override
  public boolean hasCreationTimeUs() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   * @return The creationTimeUs.
   */
  @java.lang.Override
  public long getCreationTimeUs() {
    return creationTimeUs_;
  }
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   * @param value The creationTimeUs to set.
   */
  private void setCreationTimeUs(long value) {
    bitField0_ |= 0x00000008;
    creationTimeUs_ = value;
  }
  /**
   * <code>optional int64 creation_time_us = 4;</code>
   */
  private void clearCreationTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000008);
    creationTimeUs_ = 0L;
  }

  public static final int UPDATE_TIME_US_FIELD_NUMBER = 5;
  private long updateTimeUs_;
  /**
   * <code>optional int64 update_time_us = 5;</code>
   * @return Whether the updateTimeUs field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTimeUs() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional int64 update_time_us = 5;</code>
   * @return The updateTimeUs.
   */
  @java.lang.Override
  public long getUpdateTimeUs() {
    return updateTimeUs_;
  }
  /**
   * <code>optional int64 update_time_us = 5;</code>
   * @param value The updateTimeUs to set.
   */
  private void setUpdateTimeUs(long value) {
    bitField0_ |= 0x00000010;
    updateTimeUs_ = value;
  }
  /**
   * <code>optional int64 update_time_us = 5;</code>
   */
  private void clearUpdateTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000010);
    updateTimeUs_ = 0L;
  }

  public static final int FIRST_READ_TIME_US_FIELD_NUMBER = 7;
  private long firstReadTimeUs_;
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   * @return Whether the firstReadTimeUs field is set.
   */
  @java.lang.Override
  public boolean hasFirstReadTimeUs() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   * @return The firstReadTimeUs.
   */
  @java.lang.Override
  public long getFirstReadTimeUs() {
    return firstReadTimeUs_;
  }
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   * @param value The firstReadTimeUs to set.
   */
  private void setFirstReadTimeUs(long value) {
    bitField0_ |= 0x00000020;
    firstReadTimeUs_ = value;
  }
  /**
   * <code>optional int64 first_read_time_us = 7;</code>
   */
  private void clearFirstReadTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000020);
    firstReadTimeUs_ = 0L;
  }

  public static final int UPDATE_TITLE_TIME_US_FIELD_NUMBER = 8;
  private long updateTitleTimeUs_;
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   * @return Whether the updateTitleTimeUs field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTitleTimeUs() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   * @return The updateTitleTimeUs.
   */
  @java.lang.Override
  public long getUpdateTitleTimeUs() {
    return updateTitleTimeUs_;
  }
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   * @param value The updateTitleTimeUs to set.
   */
  private void setUpdateTitleTimeUs(long value) {
    bitField0_ |= 0x00000040;
    updateTitleTimeUs_ = value;
  }
  /**
   * <code>optional int64 update_title_time_us = 8;</code>
   */
  private void clearUpdateTitleTimeUs() {
    bitField0_ = (bitField0_ & ~0x00000040);
    updateTitleTimeUs_ = 0L;
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private int status_;
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000080) != 0);
  }
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   * @return The status.
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus getStatus() {
    org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus result = org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus.forNumber(status_);
    return result == null ? org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus.UNREAD : result;
  }
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   * @param value The status to set.
   */
  private void setStatus(org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus value) {
    status_ = value.getNumber();
    bitField0_ |= 0x00000080;
  }
  /**
   * <pre>
   * If the field is not present, it defaults to UNSEEN.
   * </pre>
   *
   * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
   */
  private void clearStatus() {
    bitField0_ = (bitField0_ & ~0x00000080);
    status_ = 0;
  }

  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ReadingListSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.ReadingListSpecifics prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Sync Reading list entry. This proto contains the fields synced for a reading
   * list entry. It must be kept synced with the reading_list.ReadingListLocal
   * protobuf.
   * </pre>
   *
   * Protobuf type {@code sync_pb.ReadingListSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.ReadingListSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.ReadingListSpecifics)
      org.chromium.components.sync.protocol.ReadingListSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.ReadingListSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string entry_id = 1;</code>
     * @return Whether the entryId field is set.
     */
    @java.lang.Override
    public boolean hasEntryId() {
      return instance.hasEntryId();
    }
    /**
     * <code>optional string entry_id = 1;</code>
     * @return The entryId.
     */
    @java.lang.Override
    public java.lang.String getEntryId() {
      return instance.getEntryId();
    }
    /**
     * <code>optional string entry_id = 1;</code>
     * @return The bytes for entryId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEntryIdBytes() {
      return instance.getEntryIdBytes();
    }
    /**
     * <code>optional string entry_id = 1;</code>
     * @param value The entryId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryId(
        java.lang.String value) {
      copyOnWrite();
      instance.setEntryId(value);
      return this;
    }
    /**
     * <code>optional string entry_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntryId() {
      copyOnWrite();
      instance.clearEntryId();
      return this;
    }
    /**
     * <code>optional string entry_id = 1;</code>
     * @param value The bytes for entryId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEntryIdBytes(value);
      return this;
    }

    /**
     * <code>optional string title = 2;</code>
     * @return Whether the title field is set.
     */
    @java.lang.Override
    public boolean hasTitle() {
      return instance.hasTitle();
    }
    /**
     * <code>optional string title = 2;</code>
     * @return The title.
     */
    @java.lang.Override
    public java.lang.String getTitle() {
      return instance.getTitle();
    }
    /**
     * <code>optional string title = 2;</code>
     * @return The bytes for title.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return instance.getTitleBytes();
    }
    /**
     * <code>optional string title = 2;</code>
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
     * <code>optional string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      copyOnWrite();
      instance.clearTitle();
      return this;
    }
    /**
     * <code>optional string title = 2;</code>
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
     * <code>optional string url = 3;</code>
     * @return Whether the url field is set.
     */
    @java.lang.Override
    public boolean hasUrl() {
      return instance.hasUrl();
    }
    /**
     * <code>optional string url = 3;</code>
     * @return The url.
     */
    @java.lang.Override
    public java.lang.String getUrl() {
      return instance.getUrl();
    }
    /**
     * <code>optional string url = 3;</code>
     * @return The bytes for url.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUrlBytes() {
      return instance.getUrlBytes();
    }
    /**
     * <code>optional string url = 3;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrl(value);
      return this;
    }
    /**
     * <code>optional string url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      copyOnWrite();
      instance.clearUrl();
      return this;
    }
    /**
     * <code>optional string url = 3;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlBytes(value);
      return this;
    }

    /**
     * <code>optional int64 creation_time_us = 4;</code>
     * @return Whether the creationTimeUs field is set.
     */
    @java.lang.Override
    public boolean hasCreationTimeUs() {
      return instance.hasCreationTimeUs();
    }
    /**
     * <code>optional int64 creation_time_us = 4;</code>
     * @return The creationTimeUs.
     */
    @java.lang.Override
    public long getCreationTimeUs() {
      return instance.getCreationTimeUs();
    }
    /**
     * <code>optional int64 creation_time_us = 4;</code>
     * @param value The creationTimeUs to set.
     * @return This builder for chaining.
     */
    public Builder setCreationTimeUs(long value) {
      copyOnWrite();
      instance.setCreationTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 creation_time_us = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreationTimeUs() {
      copyOnWrite();
      instance.clearCreationTimeUs();
      return this;
    }

    /**
     * <code>optional int64 update_time_us = 5;</code>
     * @return Whether the updateTimeUs field is set.
     */
    @java.lang.Override
    public boolean hasUpdateTimeUs() {
      return instance.hasUpdateTimeUs();
    }
    /**
     * <code>optional int64 update_time_us = 5;</code>
     * @return The updateTimeUs.
     */
    @java.lang.Override
    public long getUpdateTimeUs() {
      return instance.getUpdateTimeUs();
    }
    /**
     * <code>optional int64 update_time_us = 5;</code>
     * @param value The updateTimeUs to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateTimeUs(long value) {
      copyOnWrite();
      instance.setUpdateTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 update_time_us = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateTimeUs() {
      copyOnWrite();
      instance.clearUpdateTimeUs();
      return this;
    }

    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     * @return Whether the firstReadTimeUs field is set.
     */
    @java.lang.Override
    public boolean hasFirstReadTimeUs() {
      return instance.hasFirstReadTimeUs();
    }
    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     * @return The firstReadTimeUs.
     */
    @java.lang.Override
    public long getFirstReadTimeUs() {
      return instance.getFirstReadTimeUs();
    }
    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     * @param value The firstReadTimeUs to set.
     * @return This builder for chaining.
     */
    public Builder setFirstReadTimeUs(long value) {
      copyOnWrite();
      instance.setFirstReadTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 first_read_time_us = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstReadTimeUs() {
      copyOnWrite();
      instance.clearFirstReadTimeUs();
      return this;
    }

    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     * @return Whether the updateTitleTimeUs field is set.
     */
    @java.lang.Override
    public boolean hasUpdateTitleTimeUs() {
      return instance.hasUpdateTitleTimeUs();
    }
    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     * @return The updateTitleTimeUs.
     */
    @java.lang.Override
    public long getUpdateTitleTimeUs() {
      return instance.getUpdateTitleTimeUs();
    }
    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     * @param value The updateTitleTimeUs to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateTitleTimeUs(long value) {
      copyOnWrite();
      instance.setUpdateTitleTimeUs(value);
      return this;
    }
    /**
     * <code>optional int64 update_title_time_us = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateTitleTimeUs() {
      copyOnWrite();
      instance.clearUpdateTitleTimeUs();
      return this;
    }

    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     * @return Whether the status field is set.
     */
    @java.lang.Override
    public boolean hasStatus() {
      return instance.hasStatus();
    }
    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     * @return The status.
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus getStatus() {
      return instance.getStatus();
    }
    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus value) {
      copyOnWrite();
      instance.setStatus(value);
      return this;
    }
    /**
     * <pre>
     * If the field is not present, it defaults to UNSEEN.
     * </pre>
     *
     * <code>optional .sync_pb.ReadingListSpecifics.ReadingListEntryStatus status = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      copyOnWrite();
      instance.clearStatus();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.ReadingListSpecifics)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.ReadingListSpecifics();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "entryId_",
            "title_",
            "url_",
            "creationTimeUs_",
            "updateTimeUs_",
            "status_",
            org.chromium.components.sync.protocol.ReadingListSpecifics.ReadingListEntryStatus.internalGetVerifier(),
            "firstReadTimeUs_",
            "updateTitleTimeUs_",
          };
          java.lang.String info =
              "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001" +
              "\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u100c\u0007\u0007\u1002" +
              "\u0005\b\u1002\u0006";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.ReadingListSpecifics> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.ReadingListSpecifics.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.ReadingListSpecifics>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.ReadingListSpecifics)
  private static final org.chromium.components.sync.protocol.ReadingListSpecifics DEFAULT_INSTANCE;
  static {
    ReadingListSpecifics defaultInstance = new ReadingListSpecifics();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ReadingListSpecifics.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.ReadingListSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ReadingListSpecifics> PARSER;

  public static com.google.protobuf.Parser<ReadingListSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

