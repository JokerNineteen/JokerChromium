// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/typed_url_specifics.proto

package org.chromium.components.sync.protocol;

public interface TypedUrlSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.TypedUrlSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Actual URL that was typed.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * Actual URL that was typed.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Actual URL that was typed.
   * </pre>
   *
   * <code>optional string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Title of the page corresponding to this URL.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * Title of the page corresponding to this URL.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Title of the page corresponding to this URL.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The number of times this URL was typed. Deprecated since we no longer sync
   * this information (it's inferred by the history code from the transition
   * type for each visit).
   * optional int32 typed_count = 3; (deprecated)
   * True if the URL should be used for auto-complete.
   * </pre>
   *
   * <code>optional bool hidden = 4;</code>
   * @return Whether the hidden field is set.
   */
  boolean hasHidden();
  /**
   * <pre>
   * The number of times this URL was typed. Deprecated since we no longer sync
   * this information (it's inferred by the history code from the transition
   * type for each visit).
   * optional int32 typed_count = 3; (deprecated)
   * True if the URL should be used for auto-complete.
   * </pre>
   *
   * <code>optional bool hidden = 4;</code>
   * @return The hidden.
   */
  boolean getHidden();

  /**
   * <pre>
   * The number of visits (includes page reloads).
   * repeated int64 visit = 5; (deprecated)
   * The number of explicit navigations to this URL (excludes page reloads) -
   * deprecated as we no longer sync this (history code infers this from the
   * |visits| array).
   * optional int32 visited_count = 6; (deprecated)
   * Timestamps for all visits to this URL.
   * </pre>
   *
   * <code>repeated int64 visits = 7 [packed = true];</code>
   * @return A list containing the visits.
   */
  java.util.List<java.lang.Long> getVisitsList();
  /**
   * <pre>
   * The number of visits (includes page reloads).
   * repeated int64 visit = 5; (deprecated)
   * The number of explicit navigations to this URL (excludes page reloads) -
   * deprecated as we no longer sync this (history code infers this from the
   * |visits| array).
   * optional int32 visited_count = 6; (deprecated)
   * Timestamps for all visits to this URL.
   * </pre>
   *
   * <code>repeated int64 visits = 7 [packed = true];</code>
   * @return The count of visits.
   */
  int getVisitsCount();
  /**
   * <pre>
   * The number of visits (includes page reloads).
   * repeated int64 visit = 5; (deprecated)
   * The number of explicit navigations to this URL (excludes page reloads) -
   * deprecated as we no longer sync this (history code infers this from the
   * |visits| array).
   * optional int32 visited_count = 6; (deprecated)
   * Timestamps for all visits to this URL.
   * </pre>
   *
   * <code>repeated int64 visits = 7 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The visits at the given index.
   */
  long getVisits(int index);

  /**
   * <pre>
   * The PageTransition::Type for each of the visits in the |visit| array. Both
   * arrays must be the same length.
   * </pre>
   *
   * <code>repeated int32 visit_transitions = 8 [packed = true];</code>
   * @return A list containing the visitTransitions.
   */
  java.util.List<java.lang.Integer> getVisitTransitionsList();
  /**
   * <pre>
   * The PageTransition::Type for each of the visits in the |visit| array. Both
   * arrays must be the same length.
   * </pre>
   *
   * <code>repeated int32 visit_transitions = 8 [packed = true];</code>
   * @return The count of visitTransitions.
   */
  int getVisitTransitionsCount();
  /**
   * <pre>
   * The PageTransition::Type for each of the visits in the |visit| array. Both
   * arrays must be the same length.
   * </pre>
   *
   * <code>repeated int32 visit_transitions = 8 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The visitTransitions at the given index.
   */
  int getVisitTransitions(int index);
}
