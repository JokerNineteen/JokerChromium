// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/autofill_specifics.proto

package org.chromium.components.sync.protocol;

public interface WalletMaskedCreditCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.WalletMaskedCreditCard)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Server-generated unique ID string. This is opaque to the client.
   * This is the legacy version of |instrument_id|.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Server-generated unique ID string. This is opaque to the client.
   * This is the legacy version of |instrument_id|.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Server-generated unique ID string. This is opaque to the client.
   * This is the legacy version of |instrument_id|.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * What the server thinks of this card.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard.WalletCardStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * What the server thinks of this card.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard.WalletCardStatus status = 2;</code>
   * @return The status.
   */
  org.chromium.components.sync.protocol.WalletMaskedCreditCard.WalletCardStatus getStatus();

  /**
   * <code>optional string name_on_card = 3;</code>
   * @return Whether the nameOnCard field is set.
   */
  boolean hasNameOnCard();
  /**
   * <code>optional string name_on_card = 3;</code>
   * @return The nameOnCard.
   */
  java.lang.String getNameOnCard();
  /**
   * <code>optional string name_on_card = 3;</code>
   * @return The bytes for nameOnCard.
   */
  com.google.protobuf.ByteString
      getNameOnCardBytes();

  /**
   * <code>optional .sync_pb.WalletMaskedCreditCard.WalletCardType type = 4;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .sync_pb.WalletMaskedCreditCard.WalletCardType type = 4;</code>
   * @return The type.
   */
  org.chromium.components.sync.protocol.WalletMaskedCreditCard.WalletCardType getType();

  /**
   * <pre>
   * Last 4 digits of the credit card number.
   * </pre>
   *
   * <code>optional string last_four = 5;</code>
   * @return Whether the lastFour field is set.
   */
  boolean hasLastFour();
  /**
   * <pre>
   * Last 4 digits of the credit card number.
   * </pre>
   *
   * <code>optional string last_four = 5;</code>
   * @return The lastFour.
   */
  java.lang.String getLastFour();
  /**
   * <pre>
   * Last 4 digits of the credit card number.
   * </pre>
   *
   * <code>optional string last_four = 5;</code>
   * @return The bytes for lastFour.
   */
  com.google.protobuf.ByteString
      getLastFourBytes();

  /**
   * <pre>
   * Month number 1-12.
   * </pre>
   *
   * <code>optional int32 exp_month = 6;</code>
   * @return Whether the expMonth field is set.
   */
  boolean hasExpMonth();
  /**
   * <pre>
   * Month number 1-12.
   * </pre>
   *
   * <code>optional int32 exp_month = 6;</code>
   * @return The expMonth.
   */
  int getExpMonth();

  /**
   * <pre>
   * Four-digit year (e.g. 2017).
   * </pre>
   *
   * <code>optional int32 exp_year = 7;</code>
   * @return Whether the expYear field is set.
   */
  boolean hasExpYear();
  /**
   * <pre>
   * Four-digit year (e.g. 2017).
   * </pre>
   *
   * <code>optional int32 exp_year = 7;</code>
   * @return The expYear.
   */
  int getExpYear();

  /**
   * <pre>
   * The WalletPostalAddress.id of the billing address.
   * </pre>
   *
   * <code>optional string billing_address_id = 8;</code>
   * @return Whether the billingAddressId field is set.
   */
  boolean hasBillingAddressId();
  /**
   * <pre>
   * The WalletPostalAddress.id of the billing address.
   * </pre>
   *
   * <code>optional string billing_address_id = 8;</code>
   * @return The billingAddressId.
   */
  java.lang.String getBillingAddressId();
  /**
   * <pre>
   * The WalletPostalAddress.id of the billing address.
   * </pre>
   *
   * <code>optional string billing_address_id = 8;</code>
   * @return The bytes for billingAddressId.
   */
  com.google.protobuf.ByteString
      getBillingAddressIdBytes();

  /**
   * <pre>
   * Issuing Bank name which is internationalized (e.g. "Chase", "????????????")
   * </pre>
   *
   * <code>optional string bank_name = 10;</code>
   * @return Whether the bankName field is set.
   */
  boolean hasBankName();
  /**
   * <pre>
   * Issuing Bank name which is internationalized (e.g. "Chase", "????????????")
   * </pre>
   *
   * <code>optional string bank_name = 10;</code>
   * @return The bankName.
   */
  java.lang.String getBankName();
  /**
   * <pre>
   * Issuing Bank name which is internationalized (e.g. "Chase", "????????????")
   * </pre>
   *
   * <code>optional string bank_name = 10;</code>
   * @return The bytes for bankName.
   */
  com.google.protobuf.ByteString
      getBankNameBytes();

  /**
   * <pre>
   * TODO(crbug.com/1020740): Deprecated, remove this once dependent change is
   * done.
   * Use WalletCreditCardCloudTokenData instead. This field will be set if
   * a cloud token is available for the instrument.
   * </pre>
   *
   * <code>optional .sync_pb.CloudTokenData cloud_token_data = 11;</code>
   * @return Whether the cloudTokenData field is set.
   */
  boolean hasCloudTokenData();
  /**
   * <pre>
   * TODO(crbug.com/1020740): Deprecated, remove this once dependent change is
   * done.
   * Use WalletCreditCardCloudTokenData instead. This field will be set if
   * a cloud token is available for the instrument.
   * </pre>
   *
   * <code>optional .sync_pb.CloudTokenData cloud_token_data = 11;</code>
   * @return The cloudTokenData.
   */
  org.chromium.components.sync.protocol.CloudTokenData getCloudTokenData();

  /**
   * <pre>
   * The card's nickname, if it exists.
   * </pre>
   *
   * <code>optional string nickname = 12;</code>
   * @return Whether the nickname field is set.
   */
  boolean hasNickname();
  /**
   * <pre>
   * The card's nickname, if it exists.
   * </pre>
   *
   * <code>optional string nickname = 12;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <pre>
   * The card's nickname, if it exists.
   * </pre>
   *
   * <code>optional string nickname = 12;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <pre>
   * Issuer of the card.
   * </pre>
   *
   * <code>optional .sync_pb.CardIssuer card_issuer = 13;</code>
   * @return Whether the cardIssuer field is set.
   */
  boolean hasCardIssuer();
  /**
   * <pre>
   * Issuer of the card.
   * </pre>
   *
   * <code>optional .sync_pb.CardIssuer card_issuer = 13;</code>
   * @return The cardIssuer.
   */
  org.chromium.components.sync.protocol.CardIssuer getCardIssuer();

  /**
   * <pre>
   * Server-generated unique ID. This is opaque to the client.
   * |id| is the legacy version of this.
   * </pre>
   *
   * <code>optional int64 instrument_id = 15;</code>
   * @return Whether the instrumentId field is set.
   */
  boolean hasInstrumentId();
  /**
   * <pre>
   * Server-generated unique ID. This is opaque to the client.
   * |id| is the legacy version of this.
   * </pre>
   *
   * <code>optional int64 instrument_id = 15;</code>
   * @return The instrumentId.
   */
  long getInstrumentId();
}
