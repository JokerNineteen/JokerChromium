// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/nigori_local_data.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Sync proto to store Nigori data in storage. Proto should be encrypted with
 * os_crypt before storing it somewhere, because it contains sensitive data (
 * nigori_model.cryptographer_data.key_bag and nigori_model.keystore_keys).
 * </pre>
 *
 * Protobuf type {@code sync_pb.NigoriLocalData}
 */
public  final class NigoriLocalData extends
    com.google.protobuf.GeneratedMessageLite<
        NigoriLocalData, NigoriLocalData.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.NigoriLocalData)
    NigoriLocalDataOrBuilder {
  private NigoriLocalData() {
  }
  private int bitField0_;
  public static final int MODEL_TYPE_STATE_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.ModelTypeState modelTypeState_;
  /**
   * <pre>
   * Global metadata.
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
   * Global metadata.
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
   * Global metadata.
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
   * Global metadata.
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
   * Global metadata.
   * </pre>
   *
   * <code>optional .sync_pb.ModelTypeState model_type_state = 1;</code>
   */
  private void clearModelTypeState() {  modelTypeState_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int ENTITY_METADATA_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.EntityMetadata entityMetadata_;
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  @java.lang.Override
  public boolean hasEntityMetadata() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.EntityMetadata getEntityMetadata() {
    return entityMetadata_ == null ? org.chromium.components.sync.protocol.EntityMetadata.getDefaultInstance() : entityMetadata_;
  }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  private void setEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
    value.getClass();
  entityMetadata_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
    value.getClass();
  if (entityMetadata_ != null &&
        entityMetadata_ != org.chromium.components.sync.protocol.EntityMetadata.getDefaultInstance()) {
      entityMetadata_ =
        org.chromium.components.sync.protocol.EntityMetadata.newBuilder(entityMetadata_).mergeFrom(value).buildPartial();
    } else {
      entityMetadata_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * Metadata for Nigori entity.
   * </pre>
   *
   * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
   */
  private void clearEntityMetadata() {  entityMetadata_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int NIGORI_MODEL_FIELD_NUMBER = 3;
  private org.chromium.components.sync.protocol.NigoriModel nigoriModel_;
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  @java.lang.Override
  public boolean hasNigoriModel() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.NigoriModel getNigoriModel() {
    return nigoriModel_ == null ? org.chromium.components.sync.protocol.NigoriModel.getDefaultInstance() : nigoriModel_;
  }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  private void setNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
    value.getClass();
  nigoriModel_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
    value.getClass();
  if (nigoriModel_ != null &&
        nigoriModel_ != org.chromium.components.sync.protocol.NigoriModel.getDefaultInstance()) {
      nigoriModel_ =
        org.chromium.components.sync.protocol.NigoriModel.newBuilder(nigoriModel_).mergeFrom(value).buildPartial();
    } else {
      nigoriModel_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * Nigori model state.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
   */
  private void clearNigoriModel() {  nigoriModel_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.NigoriLocalData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.NigoriLocalData prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Sync proto to store Nigori data in storage. Proto should be encrypted with
   * os_crypt before storing it somewhere, because it contains sensitive data (
   * nigori_model.cryptographer_data.key_bag and nigori_model.keystore_keys).
   * </pre>
   *
   * Protobuf type {@code sync_pb.NigoriLocalData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.NigoriLocalData, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.NigoriLocalData)
      org.chromium.components.sync.protocol.NigoriLocalDataOrBuilder {
    // Construct using org.chromium.components.sync.protocol.NigoriLocalData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Global metadata.
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
     * Global metadata.
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
     * Global metadata.
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
     * Global metadata.
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
     * Global metadata.
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
     * Global metadata.
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
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    @java.lang.Override
    public boolean hasEntityMetadata() {
      return instance.hasEntityMetadata();
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.EntityMetadata getEntityMetadata() {
      return instance.getEntityMetadata();
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder setEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
      copyOnWrite();
      instance.setEntityMetadata(value);
      return this;
      }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder setEntityMetadata(
        org.chromium.components.sync.protocol.EntityMetadata.Builder builderForValue) {
      copyOnWrite();
      instance.setEntityMetadata(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder mergeEntityMetadata(org.chromium.components.sync.protocol.EntityMetadata value) {
      copyOnWrite();
      instance.mergeEntityMetadata(value);
      return this;
    }
    /**
     * <pre>
     * Metadata for Nigori entity.
     * </pre>
     *
     * <code>optional .sync_pb.EntityMetadata entity_metadata = 2;</code>
     */
    public Builder clearEntityMetadata() {  copyOnWrite();
      instance.clearEntityMetadata();
      return this;
    }

    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    @java.lang.Override
    public boolean hasNigoriModel() {
      return instance.hasNigoriModel();
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.NigoriModel getNigoriModel() {
      return instance.getNigoriModel();
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder setNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
      copyOnWrite();
      instance.setNigoriModel(value);
      return this;
      }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder setNigoriModel(
        org.chromium.components.sync.protocol.NigoriModel.Builder builderForValue) {
      copyOnWrite();
      instance.setNigoriModel(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder mergeNigoriModel(org.chromium.components.sync.protocol.NigoriModel value) {
      copyOnWrite();
      instance.mergeNigoriModel(value);
      return this;
    }
    /**
     * <pre>
     * Nigori model state.
     * </pre>
     *
     * <code>optional .sync_pb.NigoriModel nigori_model = 3;</code>
     */
    public Builder clearNigoriModel() {  copyOnWrite();
      instance.clearNigoriModel();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.NigoriLocalData)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.NigoriLocalData();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "modelTypeState_",
            "entityMetadata_",
            "nigoriModel_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001\u0003\u1009\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.NigoriLocalData> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.NigoriLocalData.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.NigoriLocalData>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.NigoriLocalData)
  private static final org.chromium.components.sync.protocol.NigoriLocalData DEFAULT_INSTANCE;
  static {
    NigoriLocalData defaultInstance = new NigoriLocalData();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      NigoriLocalData.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.NigoriLocalData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<NigoriLocalData> PARSER;

  public static com.google.protobuf.Parser<NigoriLocalData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

