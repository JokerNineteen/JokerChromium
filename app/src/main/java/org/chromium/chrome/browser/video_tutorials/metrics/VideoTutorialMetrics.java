// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.video_tutorials.metrics;

import androidx.annotation.IntDef;

import org.chromium.base.metrics.RecordHistogram;
import org.chromium.chrome.browser.video_tutorials.FeatureType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Responsible for collecting metrics associated with video tutorials.
 */
public class VideoTutorialMetrics {
    // Please treat this list as append only and keep it in sync with
    // VideoTutorials.WatchState in enums.xml.
    @IntDef({WatchState.STARTED, WatchState.COMPLETED, WatchState.PAUSED, WatchState.RESUMED,
            WatchState.WATCHED})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WatchState {
        int STARTED = 0;
        int COMPLETED = 1;
        int PAUSED = 2;
        int RESUMED = 3;
        int WATCHED = 4;
        int NUM_ENTRIES = 5;
    }

    // Please treat this list as append only and keep it in sync with
    // VideoTutorials.UserAction in enums.xml.
    @IntDef({UserAction.CHANGE_LANGUAGE, UserAction.WATCH_NEXT_VIDEO, UserAction.TRY_NOW,
            UserAction.SHARE, UserAction.CLOSE, UserAction.BACK_PRESS_WHEN_SHOWING_VIDEO_PLAYER,
            UserAction.OPEN_SHARED_VIDEO, UserAction.INVALID_SHARE_URL})
    @Retention(RetentionPolicy.SOURCE)
    public @interface UserAction {
        int CHANGE_LANGUAGE = 0;
        int WATCH_NEXT_VIDEO = 1;
        int TRY_NOW = 2;
        int SHARE = 3;
        int CLOSE = 4;
        int BACK_PRESS_WHEN_SHOWING_VIDEO_PLAYER = 5;
        int OPEN_SHARED_VIDEO = 6;
        int INVALID_SHARE_URL = 7;
        int NUM_ENTRIES = 8;
    }

    /** Called to record various user actions on the video player. */
    public static void recordUserAction(@FeatureType int feature, @UserAction int action) {
        String histogramSuffix = histogramSuffixFromFeatureType(feature);
        RecordHistogram.recordEnumeratedHistogram(
                "VideoTutorials." + histogramSuffix + ".Player.UserAction", action,
                UserAction.NUM_ENTRIES);
    }

    public static void recordVideoLoadTimeLatency(long videoLoadTime) {
        RecordHistogram.recordMediumTimesHistogram(
                "VideoTutorials.Player.LoadTimeLatency", videoLoadTime);
    }

    public static void recordWatchStateUpdate(@FeatureType int feature, @WatchState int state) {
        String histogramSuffix = histogramSuffixFromFeatureType(feature);
        RecordHistogram.recordEnumeratedHistogram(
                "VideoTutorials." + histogramSuffix + ".Player.Progress", state,
                WatchState.NUM_ENTRIES);
    }

    private static String histogramSuffixFromFeatureType(@FeatureType int feature) {
        switch (feature) {
            case FeatureType.CHROME_INTRO:
                return "ChromeIntro";
            case FeatureType.DOWNLOAD:
                return "Download";
            case FeatureType.SEARCH:
                return "Search";
            case FeatureType.VOICE_SEARCH:
                return "VoiceSearch";
            case FeatureType.SUMMARY:
                return "Summary";
            default:
                return "Unknown";
        }
    }
}
