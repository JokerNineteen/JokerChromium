// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: delay_competing_low_priority_requests_metadata.proto

package org.chromium.components.optimization_guide.proto;

public final class DelayCompetingLowPriorityRequestsMetadataProto {
  private DelayCompetingLowPriorityRequestsMetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * <pre>
   * Enumerates the different request priorities that the Chromium experiment will
   * consider "important". For example, low priority requests will be queued
   * behind in-flight medium priority requests, when the PriorityThreshold is
   * PRIORITY_THRESHOLD_MEDIUM, etc.
   * </pre>
   *
   * Protobuf enum {@code optimization_guide.proto.PriorityThreshold}
   */
  public enum PriorityThreshold
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>PRIORITY_THRESHOLD_UNKNOWN = 0;</code>
     */
    PRIORITY_THRESHOLD_UNKNOWN(0),
    /**
     * <code>PRIORITY_THRESHOLD_MEDIUM = 1;</code>
     */
    PRIORITY_THRESHOLD_MEDIUM(1),
    /**
     * <code>PRIORITY_THRESHOLD_HIGH = 2;</code>
     */
    PRIORITY_THRESHOLD_HIGH(2),
    ;

    /**
     * <code>PRIORITY_THRESHOLD_UNKNOWN = 0;</code>
     */
    public static final int PRIORITY_THRESHOLD_UNKNOWN_VALUE = 0;
    /**
     * <code>PRIORITY_THRESHOLD_MEDIUM = 1;</code>
     */
    public static final int PRIORITY_THRESHOLD_MEDIUM_VALUE = 1;
    /**
     * <code>PRIORITY_THRESHOLD_HIGH = 2;</code>
     */
    public static final int PRIORITY_THRESHOLD_HIGH_VALUE = 2;


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
    public static PriorityThreshold valueOf(int value) {
      return forNumber(value);
    }

    public static PriorityThreshold forNumber(int value) {
      switch (value) {
        case 0: return PRIORITY_THRESHOLD_UNKNOWN;
        case 1: return PRIORITY_THRESHOLD_MEDIUM;
        case 2: return PRIORITY_THRESHOLD_HIGH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PriorityThreshold>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PriorityThreshold> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PriorityThreshold>() {
            @java.lang.Override
            public PriorityThreshold findValueByNumber(int number) {
              return PriorityThreshold.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return PriorityThresholdVerifier.INSTANCE;
    }

    private static final class PriorityThresholdVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new PriorityThresholdVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return PriorityThreshold.forNumber(number) != null;
            }
          };

    private final int value;

    private PriorityThreshold(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:optimization_guide.proto.PriorityThreshold)
  }

  public interface DelayCompetingLowPriorityRequestsMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadata)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return Whether the delayType field is set.
     */
    boolean hasDelayType();
    /**
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return The delayType.
     */
    org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType getDelayType();

    /**
     * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
     * @return Whether the priorityThreshold field is set.
     */
    boolean hasPriorityThreshold();
    /**
     * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
     * @return The priorityThreshold.
     */
    org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold getPriorityThreshold();
  }
  /**
   * <pre>
   * Optimization metadata for
   * OptimizationType::DELAY_COMPETING_LOW_PRIORITY_REQUESTS.
   * </pre>
   *
   * Protobuf type {@code optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadata}
   */
  public  static final class DelayCompetingLowPriorityRequestsMetadata extends
      com.google.protobuf.GeneratedMessageLite<
          DelayCompetingLowPriorityRequestsMetadata, DelayCompetingLowPriorityRequestsMetadata.Builder> implements
      // @@protoc_insertion_point(message_implements:optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadata)
      DelayCompetingLowPriorityRequestsMetadataOrBuilder {
    private DelayCompetingLowPriorityRequestsMetadata() {
    }
    private int bitField0_;
    public static final int DELAY_TYPE_FIELD_NUMBER = 1;
    private int delayType_;
    /**
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return Whether the delayType field is set.
     */
    @java.lang.Override
    public boolean hasDelayType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @return The delayType.
     */
    @java.lang.Override
    public org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType getDelayType() {
      org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType result = org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType.forNumber(delayType_);
      return result == null ? org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType.DELAY_TYPE_UNKNOWN : result;
    }
    /**
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     * @param value The delayType to set.
     */
    private void setDelayType(org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType value) {
      delayType_ = value.getNumber();
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
     */
    private void clearDelayType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      delayType_ = 0;
    }

    public static final int PRIORITY_THRESHOLD_FIELD_NUMBER = 2;
    private int priorityThreshold_;
    /**
     * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
     * @return Whether the priorityThreshold field is set.
     */
    @java.lang.Override
    public boolean hasPriorityThreshold() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
     * @return The priorityThreshold.
     */
    @java.lang.Override
    public org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold getPriorityThreshold() {
      org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold result = org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold.forNumber(priorityThreshold_);
      return result == null ? org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold.PRIORITY_THRESHOLD_UNKNOWN : result;
    }
    /**
     * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
     * @param value The priorityThreshold to set.
     */
    private void setPriorityThreshold(org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold value) {
      priorityThreshold_ = value.getNumber();
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
     */
    private void clearPriorityThreshold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      priorityThreshold_ = 0;
    }

    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Optimization metadata for
     * OptimizationType::DELAY_COMPETING_LOW_PRIORITY_REQUESTS.
     * </pre>
     *
     * Protobuf type {@code optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata, Builder> implements
        // @@protoc_insertion_point(builder_implements:optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadata)
        org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadataOrBuilder {
      // Construct using org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @return Whether the delayType field is set.
       */
      @java.lang.Override
      public boolean hasDelayType() {
        return instance.hasDelayType();
      }
      /**
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @return The delayType.
       */
      @java.lang.Override
      public org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType getDelayType() {
        return instance.getDelayType();
      }
      /**
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @param value The enum numeric value on the wire for delayType to set.
       * @return This builder for chaining.
       */
      public Builder setDelayType(org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType value) {
        copyOnWrite();
        instance.setDelayType(value);
        return this;
      }
      /**
       * <code>optional .optimization_guide.proto.PerfectHeuristicsDelayType delay_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelayType() {
        copyOnWrite();
        instance.clearDelayType();
        return this;
      }

      /**
       * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
       * @return Whether the priorityThreshold field is set.
       */
      @java.lang.Override
      public boolean hasPriorityThreshold() {
        return instance.hasPriorityThreshold();
      }
      /**
       * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
       * @return The priorityThreshold.
       */
      @java.lang.Override
      public org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold getPriorityThreshold() {
        return instance.getPriorityThreshold();
      }
      /**
       * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
       * @param value The enum numeric value on the wire for priorityThreshold to set.
       * @return This builder for chaining.
       */
      public Builder setPriorityThreshold(org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold value) {
        copyOnWrite();
        instance.setPriorityThreshold(value);
        return this;
      }
      /**
       * <code>optional .optimization_guide.proto.PriorityThreshold priority_threshold = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriorityThreshold() {
        copyOnWrite();
        instance.clearPriorityThreshold();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadata)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "delayType_",
              org.chromium.components.optimization_guide.proto.CommonTypesProto.PerfectHeuristicsDelayType.internalGetVerifier(),
              "priorityThreshold_",
              org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.PriorityThreshold.internalGetVerifier(),
            };
            java.lang.String info =
                "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002" +
                "\u100c\u0001";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata>(
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


    // @@protoc_insertion_point(class_scope:optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadata)
    private static final org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata DEFAULT_INSTANCE;
    static {
      DelayCompetingLowPriorityRequestsMetadata defaultInstance = new DelayCompetingLowPriorityRequestsMetadata();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        DelayCompetingLowPriorityRequestsMetadata.class, defaultInstance);
    }

    public static org.chromium.components.optimization_guide.proto.DelayCompetingLowPriorityRequestsMetadataProto.DelayCompetingLowPriorityRequestsMetadata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<DelayCompetingLowPriorityRequestsMetadata> PARSER;

    public static com.google.protobuf.Parser<DelayCompetingLowPriorityRequestsMetadata> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
