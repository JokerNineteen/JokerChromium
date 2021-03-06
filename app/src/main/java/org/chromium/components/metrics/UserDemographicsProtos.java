// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_demographics.proto

package org.chromium.components.metrics;

public final class UserDemographicsProtos {
  private UserDemographicsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface UserDemographicsProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:metrics.UserDemographicsProto)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The (noisy) year of birth specified by the user. The value reported in this
     * field cannot safely be interpreted as the true value for the user; it may
     * be offset by a randomly chosen number of years from [-2, +2].
     * </pre>
     *
     * <code>optional int32 birth_year = 1;</code>
     * @return Whether the birthYear field is set.
     */
    boolean hasBirthYear();
    /**
     * <pre>
     * The (noisy) year of birth specified by the user. The value reported in this
     * field cannot safely be interpreted as the true value for the user; it may
     * be offset by a randomly chosen number of years from [-2, +2].
     * </pre>
     *
     * <code>optional int32 birth_year = 1;</code>
     * @return The birthYear.
     */
    int getBirthYear();

    /**
     * <pre>
     * The gender specified by the user. If the user's gender is unknown or non-
     * binary, this field will be omitted, corresponding to a default
     * value of GENDER_UNKNOWN.
     * </pre>
     *
     * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
     * @return Whether the gender field is set.
     */
    boolean hasGender();
    /**
     * <pre>
     * The gender specified by the user. If the user's gender is unknown or non-
     * binary, this field will be omitted, corresponding to a default
     * value of GENDER_UNKNOWN.
     * </pre>
     *
     * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
     * @return The gender.
     */
    org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender getGender();
  }
  /**
   * <pre>
   * Limited demographics information about the user.
   * This data is drawn from the signed-in user's GAIA id and is provided to
   * Chrome via syncable priority pref.
   * Next tag: 3
   * </pre>
   *
   * Protobuf type {@code metrics.UserDemographicsProto}
   */
  public  static final class UserDemographicsProto extends
      com.google.protobuf.GeneratedMessageLite<
          UserDemographicsProto, UserDemographicsProto.Builder> implements
      // @@protoc_insertion_point(message_implements:metrics.UserDemographicsProto)
      UserDemographicsProtoOrBuilder {
    private UserDemographicsProto() {
    }
    /**
     * <pre>
     * The supported gender identifiers. These values correspond to those offered
     * in the "Gender" section of the Google Account settings. Note that these
     * values deliberately do not address the rich spectrum of possible gender
     * identities with high granularity because we do not want these values to be
     * highly identifying.
     * Values from this enum are both sent to Chrome via Chrome Sync, and
     * selectively forwarded from Chrome to UMA logs.
     * </pre>
     *
     * Protobuf enum {@code metrics.UserDemographicsProto.Gender}
     */
    public enum Gender
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <pre>
       * The default value for clients that do not have any gender information.
       * </pre>
       *
       * <code>GENDER_UNKNOWN = 0;</code>
       */
      GENDER_UNKNOWN(0),
      /**
       * <pre>
       * The user specified that they prefer to be referred to as male.
       * </pre>
       *
       * <code>GENDER_MALE = 1;</code>
       */
      GENDER_MALE(1),
      /**
       * <pre>
       * The user specified that they prefer to be referred to as female.
       * </pre>
       *
       * <code>GENDER_FEMALE = 2;</code>
       */
      GENDER_FEMALE(2),
      /**
       * <pre>
       * The user specified that they prefer not to disclose a gender or the user
       * provided a custom gender identifier. This value may be synced to Chrome,
       * but it is not transmitted to UMA because the population size is
       * relatively small vs MALE/FEMALE and thus may be highly identifying.
       * Instead, these users will not submit any demographics, blending them into
       * the GENDER_UNKNOWN group (which is large).
       * </pre>
       *
       * <code>GENDER_CUSTOM_OR_OTHER = 3;</code>
       */
      GENDER_CUSTOM_OR_OTHER(3),
      ;

      /**
       * <pre>
       * The default value for clients that do not have any gender information.
       * </pre>
       *
       * <code>GENDER_UNKNOWN = 0;</code>
       */
      public static final int GENDER_UNKNOWN_VALUE = 0;
      /**
       * <pre>
       * The user specified that they prefer to be referred to as male.
       * </pre>
       *
       * <code>GENDER_MALE = 1;</code>
       */
      public static final int GENDER_MALE_VALUE = 1;
      /**
       * <pre>
       * The user specified that they prefer to be referred to as female.
       * </pre>
       *
       * <code>GENDER_FEMALE = 2;</code>
       */
      public static final int GENDER_FEMALE_VALUE = 2;
      /**
       * <pre>
       * The user specified that they prefer not to disclose a gender or the user
       * provided a custom gender identifier. This value may be synced to Chrome,
       * but it is not transmitted to UMA because the population size is
       * relatively small vs MALE/FEMALE and thus may be highly identifying.
       * Instead, these users will not submit any demographics, blending them into
       * the GENDER_UNKNOWN group (which is large).
       * </pre>
       *
       * <code>GENDER_CUSTOM_OR_OTHER = 3;</code>
       */
      public static final int GENDER_CUSTOM_OR_OTHER_VALUE = 3;


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
      public static Gender valueOf(int value) {
        return forNumber(value);
      }

      public static Gender forNumber(int value) {
        switch (value) {
          case 0: return GENDER_UNKNOWN;
          case 1: return GENDER_MALE;
          case 2: return GENDER_FEMALE;
          case 3: return GENDER_CUSTOM_OR_OTHER;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Gender>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Gender> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Gender>() {
              @java.lang.Override
              public Gender findValueByNumber(int number) {
                return Gender.forNumber(number);
              }
            };

      public static com.google.protobuf.Internal.EnumVerifier 
          internalGetVerifier() {
        return GenderVerifier.INSTANCE;
      }

      private static final class GenderVerifier implements 
           com.google.protobuf.Internal.EnumVerifier { 
              static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new GenderVerifier();
              @java.lang.Override
              public boolean isInRange(int number) {
                return Gender.forNumber(number) != null;
              }
            };

      private final int value;

      private Gender(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:metrics.UserDemographicsProto.Gender)
    }

    private int bitField0_;
    public static final int BIRTH_YEAR_FIELD_NUMBER = 1;
    private int birthYear_;
    /**
     * <pre>
     * The (noisy) year of birth specified by the user. The value reported in this
     * field cannot safely be interpreted as the true value for the user; it may
     * be offset by a randomly chosen number of years from [-2, +2].
     * </pre>
     *
     * <code>optional int32 birth_year = 1;</code>
     * @return Whether the birthYear field is set.
     */
    @java.lang.Override
    public boolean hasBirthYear() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The (noisy) year of birth specified by the user. The value reported in this
     * field cannot safely be interpreted as the true value for the user; it may
     * be offset by a randomly chosen number of years from [-2, +2].
     * </pre>
     *
     * <code>optional int32 birth_year = 1;</code>
     * @return The birthYear.
     */
    @java.lang.Override
    public int getBirthYear() {
      return birthYear_;
    }
    /**
     * <pre>
     * The (noisy) year of birth specified by the user. The value reported in this
     * field cannot safely be interpreted as the true value for the user; it may
     * be offset by a randomly chosen number of years from [-2, +2].
     * </pre>
     *
     * <code>optional int32 birth_year = 1;</code>
     * @param value The birthYear to set.
     */
    private void setBirthYear(int value) {
      bitField0_ |= 0x00000001;
      birthYear_ = value;
    }
    /**
     * <pre>
     * The (noisy) year of birth specified by the user. The value reported in this
     * field cannot safely be interpreted as the true value for the user; it may
     * be offset by a randomly chosen number of years from [-2, +2].
     * </pre>
     *
     * <code>optional int32 birth_year = 1;</code>
     */
    private void clearBirthYear() {
      bitField0_ = (bitField0_ & ~0x00000001);
      birthYear_ = 0;
    }

    public static final int GENDER_FIELD_NUMBER = 2;
    private int gender_;
    /**
     * <pre>
     * The gender specified by the user. If the user's gender is unknown or non-
     * binary, this field will be omitted, corresponding to a default
     * value of GENDER_UNKNOWN.
     * </pre>
     *
     * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
     * @return Whether the gender field is set.
     */
    @java.lang.Override
    public boolean hasGender() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The gender specified by the user. If the user's gender is unknown or non-
     * binary, this field will be omitted, corresponding to a default
     * value of GENDER_UNKNOWN.
     * </pre>
     *
     * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
     * @return The gender.
     */
    @java.lang.Override
    public org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender getGender() {
      org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender result = org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender.forNumber(gender_);
      return result == null ? org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender.GENDER_UNKNOWN : result;
    }
    /**
     * <pre>
     * The gender specified by the user. If the user's gender is unknown or non-
     * binary, this field will be omitted, corresponding to a default
     * value of GENDER_UNKNOWN.
     * </pre>
     *
     * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
     * @param value The gender to set.
     */
    private void setGender(org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender value) {
      gender_ = value.getNumber();
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The gender specified by the user. If the user's gender is unknown or non-
     * binary, this field will be omitted, corresponding to a default
     * value of GENDER_UNKNOWN.
     * </pre>
     *
     * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
     */
    private void clearGender() {
      bitField0_ = (bitField0_ & ~0x00000002);
      gender_ = 0;
    }

    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Limited demographics information about the user.
     * This data is drawn from the signed-in user's GAIA id and is provided to
     * Chrome via syncable priority pref.
     * Next tag: 3
     * </pre>
     *
     * Protobuf type {@code metrics.UserDemographicsProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto, Builder> implements
        // @@protoc_insertion_point(builder_implements:metrics.UserDemographicsProto)
        org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProtoOrBuilder {
      // Construct using org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The (noisy) year of birth specified by the user. The value reported in this
       * field cannot safely be interpreted as the true value for the user; it may
       * be offset by a randomly chosen number of years from [-2, +2].
       * </pre>
       *
       * <code>optional int32 birth_year = 1;</code>
       * @return Whether the birthYear field is set.
       */
      @java.lang.Override
      public boolean hasBirthYear() {
        return instance.hasBirthYear();
      }
      /**
       * <pre>
       * The (noisy) year of birth specified by the user. The value reported in this
       * field cannot safely be interpreted as the true value for the user; it may
       * be offset by a randomly chosen number of years from [-2, +2].
       * </pre>
       *
       * <code>optional int32 birth_year = 1;</code>
       * @return The birthYear.
       */
      @java.lang.Override
      public int getBirthYear() {
        return instance.getBirthYear();
      }
      /**
       * <pre>
       * The (noisy) year of birth specified by the user. The value reported in this
       * field cannot safely be interpreted as the true value for the user; it may
       * be offset by a randomly chosen number of years from [-2, +2].
       * </pre>
       *
       * <code>optional int32 birth_year = 1;</code>
       * @param value The birthYear to set.
       * @return This builder for chaining.
       */
      public Builder setBirthYear(int value) {
        copyOnWrite();
        instance.setBirthYear(value);
        return this;
      }
      /**
       * <pre>
       * The (noisy) year of birth specified by the user. The value reported in this
       * field cannot safely be interpreted as the true value for the user; it may
       * be offset by a randomly chosen number of years from [-2, +2].
       * </pre>
       *
       * <code>optional int32 birth_year = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBirthYear() {
        copyOnWrite();
        instance.clearBirthYear();
        return this;
      }

      /**
       * <pre>
       * The gender specified by the user. If the user's gender is unknown or non-
       * binary, this field will be omitted, corresponding to a default
       * value of GENDER_UNKNOWN.
       * </pre>
       *
       * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
       * @return Whether the gender field is set.
       */
      @java.lang.Override
      public boolean hasGender() {
        return instance.hasGender();
      }
      /**
       * <pre>
       * The gender specified by the user. If the user's gender is unknown or non-
       * binary, this field will be omitted, corresponding to a default
       * value of GENDER_UNKNOWN.
       * </pre>
       *
       * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
       * @return The gender.
       */
      @java.lang.Override
      public org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender getGender() {
        return instance.getGender();
      }
      /**
       * <pre>
       * The gender specified by the user. If the user's gender is unknown or non-
       * binary, this field will be omitted, corresponding to a default
       * value of GENDER_UNKNOWN.
       * </pre>
       *
       * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
       * @param value The enum numeric value on the wire for gender to set.
       * @return This builder for chaining.
       */
      public Builder setGender(org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender value) {
        copyOnWrite();
        instance.setGender(value);
        return this;
      }
      /**
       * <pre>
       * The gender specified by the user. If the user's gender is unknown or non-
       * binary, this field will be omitted, corresponding to a default
       * value of GENDER_UNKNOWN.
       * </pre>
       *
       * <code>optional .metrics.UserDemographicsProto.Gender gender = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGender() {
        copyOnWrite();
        instance.clearGender();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:metrics.UserDemographicsProto)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "birthYear_",
              "gender_",
              org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.Gender.internalGetVerifier(),
            };
            java.lang.String info =
                "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002" +
                "\u100c\u0001";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto>(
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


    // @@protoc_insertion_point(class_scope:metrics.UserDemographicsProto)
    private static final org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto DEFAULT_INSTANCE;
    static {
      UserDemographicsProto defaultInstance = new UserDemographicsProto();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        UserDemographicsProto.class, defaultInstance);
    }

    public static org.chromium.components.metrics.UserDemographicsProtos.UserDemographicsProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserDemographicsProto> PARSER;

    public static com.google.protobuf.Parser<UserDemographicsProto> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
