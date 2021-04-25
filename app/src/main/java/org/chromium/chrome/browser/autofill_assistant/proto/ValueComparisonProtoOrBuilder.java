// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ValueComparisonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ValueComparisonProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The first value to compare.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value_a = 4;</code>
   * @return Whether the valueA field is set.
   */
  boolean hasValueA();
  /**
   * <pre>
   * The first value to compare.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value_a = 4;</code>
   * @return The valueA.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValueA();

  /**
   * <pre>
   * The second value to compare.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value_b = 5;</code>
   * @return Whether the valueB field is set.
   */
  boolean hasValueB();
  /**
   * <pre>
   * The second value to compare.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value_b = 5;</code>
   * @return The valueB.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValueB();

  /**
   * <pre>
   * The comparison mode.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueComparisonProto.Mode mode = 3;</code>
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   * <pre>
   * The comparison mode.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueComparisonProto.Mode mode = 3;</code>
   * @return The mode.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueComparisonProto.Mode getMode();
}