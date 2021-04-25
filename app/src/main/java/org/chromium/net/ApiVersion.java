// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.net;

/**
 * Version based on chrome/VERSION.
 * {@hide as it's only used internally}
 */
public class ApiVersion {
    private static final String CRONET_VERSION = "88.0.4324.9";
    private static final int API_LEVEL = 13;
    /**
     * The minimum API level of implementations that are compatible with this API.
     * The last API level which broke backwards API compatibility. In other words, the
     * Cronet API that this class is part of won't work with Cronet implementations that implement
     * API levels less than this value. That is if
     * ImplVersion.getApiLevel() < ApiVersion.getApiLevel(), then the Cronet implementation
     * providing ImplVersion cannot be used with the Cronet API providing ApiVersion; if they are
     * used together various unexpected Errors, like AbstractMethodError, may result.
     */
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;
    private static final String LAST_CHANGE = "53e5af146109980360876c84775f25e05278fe73-refs/branch-heads/4324@{#84}";

    /**
     * Private constructor. All members of this class should be static.
     */
    private ApiVersion() {}

    public static String getCronetVersionWithLastChange() {
        return CRONET_VERSION + "@" + LAST_CHANGE.substring(0, 8);
    }

    /**
     * Returns API level of the API linked into the application. This is the maximum API
     * level the application can use, even if the application is run with a newer implementation.
     */
    public static int getMaximumAvailableApiLevel() {
        return API_LEVEL;
    }

    /**
     * The minimum API level of implementations that are compatible with this API.
     * Returns the last API level which broke backwards API compatibility. In other words, the
     * Cronet API that this class is part of won't work with Cronet implementations that implement
     * API levels less than this value. That is if
     * ImplVersion.getApiLevel() < ApiVersion.getApiLevel(), then the Cronet implementation
     * providing ImplVersion cannot be used with the Cronet API providing ApiVersion; if they are
     * used together various unexpected Errors, like AbstractMethodError, may result.
     */
    public static int getApiLevel() {
        return MIN_COMPATIBLE_API_LEVEL;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }
}
