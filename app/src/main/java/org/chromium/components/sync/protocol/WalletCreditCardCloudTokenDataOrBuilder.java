// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/autofill_specifics.proto

package org.chromium.components.sync.protocol;

public interface WalletCreditCardCloudTokenDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.WalletCreditCardCloudTokenData)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Server-generated ID string for the card this cloud token data is related
   * to. This should match the id in WalletMaskedCreditCard for to fetch the
   * corresponding actual card data. Note this is not unique across all cloud
   * token data, which means one card can have multiple sets of cloud token data
   * with the same masked_card_id.
   * </pre>
   *
   * <code>optional string masked_card_id = 1;</code>
   * @return Whether the maskedCardId field is set.
   */
  boolean hasMaskedCardId();
  /**
   * <pre>
   * Server-generated ID string for the card this cloud token data is related
   * to. This should match the id in WalletMaskedCreditCard for to fetch the
   * corresponding actual card data. Note this is not unique across all cloud
   * token data, which means one card can have multiple sets of cloud token data
   * with the same masked_card_id.
   * </pre>
   *
   * <code>optional string masked_card_id = 1;</code>
   * @return The maskedCardId.
   */
  java.lang.String getMaskedCardId();
  /**
   * <pre>
   * Server-generated ID string for the card this cloud token data is related
   * to. This should match the id in WalletMaskedCreditCard for to fetch the
   * corresponding actual card data. Note this is not unique across all cloud
   * token data, which means one card can have multiple sets of cloud token data
   * with the same masked_card_id.
   * </pre>
   *
   * <code>optional string masked_card_id = 1;</code>
   * @return The bytes for maskedCardId.
   */
  com.google.protobuf.ByteString
      getMaskedCardIdBytes();

  /**
   * <pre>
   * Last 4-5 digits of the Cloud Primary Account Number (CPAN).
   * </pre>
   *
   * <code>optional string suffix = 2;</code>
   * @return Whether the suffix field is set.
   */
  boolean hasSuffix();
  /**
   * <pre>
   * Last 4-5 digits of the Cloud Primary Account Number (CPAN).
   * </pre>
   *
   * <code>optional string suffix = 2;</code>
   * @return The suffix.
   */
  java.lang.String getSuffix();
  /**
   * <pre>
   * Last 4-5 digits of the Cloud Primary Account Number (CPAN).
   * </pre>
   *
   * <code>optional string suffix = 2;</code>
   * @return The bytes for suffix.
   */
  com.google.protobuf.ByteString
      getSuffixBytes();

  /**
   * <pre>
   * CPAN Month number 1-12.
   * </pre>
   *
   * <code>optional int32 exp_month = 3;</code>
   * @return Whether the expMonth field is set.
   */
  boolean hasExpMonth();
  /**
   * <pre>
   * CPAN Month number 1-12.
   * </pre>
   *
   * <code>optional int32 exp_month = 3;</code>
   * @return The expMonth.
   */
  int getExpMonth();

  /**
   * <pre>
   * CPAN Four-digit year (e.g. 2017).
   * </pre>
   *
   * <code>optional int32 exp_year = 4;</code>
   * @return Whether the expYear field is set.
   */
  boolean hasExpYear();
  /**
   * <pre>
   * CPAN Four-digit year (e.g. 2017).
   * </pre>
   *
   * <code>optional int32 exp_year = 4;</code>
   * @return The expYear.
   */
  int getExpYear();

  /**
   * <pre>
   * URL of the card art to be displayed for CPAN.
   * </pre>
   *
   * <code>optional string art_fife_url = 5;</code>
   * @return Whether the artFifeUrl field is set.
   */
  boolean hasArtFifeUrl();
  /**
   * <pre>
   * URL of the card art to be displayed for CPAN.
   * </pre>
   *
   * <code>optional string art_fife_url = 5;</code>
   * @return The artFifeUrl.
   */
  java.lang.String getArtFifeUrl();
  /**
   * <pre>
   * URL of the card art to be displayed for CPAN.
   * </pre>
   *
   * <code>optional string art_fife_url = 5;</code>
   * @return The bytes for artFifeUrl.
   */
  com.google.protobuf.ByteString
      getArtFifeUrlBytes();

  /**
   * <pre>
   * Opaque identifier for the cloud token.
   * </pre>
   *
   * <code>optional string instrument_token = 6;</code>
   * @return Whether the instrumentToken field is set.
   */
  boolean hasInstrumentToken();
  /**
   * <pre>
   * Opaque identifier for the cloud token.
   * </pre>
   *
   * <code>optional string instrument_token = 6;</code>
   * @return The instrumentToken.
   */
  java.lang.String getInstrumentToken();
  /**
   * <pre>
   * Opaque identifier for the cloud token.
   * </pre>
   *
   * <code>optional string instrument_token = 6;</code>
   * @return The bytes for instrumentToken.
   */
  com.google.protobuf.ByteString
      getInstrumentTokenBytes();
}
