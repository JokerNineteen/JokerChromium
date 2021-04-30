// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.net.impl;

// Version based on chrome/VERSION.
public class ImplVersion {
    private static final String CRONET_VERSION = "90.0.4430.82";
    private static final int API_LEVEL = 14;
    private static final String LAST_CHANGE = "3a0b27d9ba1b2fc9de96e8266d4f7de37f3a052c-refs/branch-heads/4430@{#1304}";

   /**
    * Private constructor. All members of this class should be static.
    */
    private ImplVersion() {}

    public static String getCronetVersionWithLastChange() {
        return CRONET_VERSION + "@" + LAST_CHANGE.substring(0, 8);
    }

    public static int getApiLevel() {
        return API_LEVEL;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }
}
