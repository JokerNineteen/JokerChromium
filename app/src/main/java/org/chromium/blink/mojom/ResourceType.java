// ResourceType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/loader/resource_load_info.mojom
//

package org.chromium.blink.mojom;

public final class ResourceType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int MAIN_FRAME = 0;
    public static final int SUB_FRAME = 1;
    public static final int STYLESHEET = 2;
    public static final int SCRIPT = 3;
    public static final int IMAGE = 4;
    public static final int FONT_RESOURCE = 5;
    public static final int SUB_RESOURCE = 6;
    public static final int OBJECT = 7;
    public static final int MEDIA = 8;
    public static final int WORKER = 9;
    public static final int SHARED_WORKER = 10;
    public static final int PREFETCH = 11;
    public static final int FAVICON = 12;
    public static final int XHR = 13;
    public static final int PING = 14;
    public static final int SERVICE_WORKER = 15;
    public static final int CSP_REPORT = 16;
    public static final int PLUGIN_RESOURCE = 17;
    public static final int NAVIGATION_PRELOAD_MAIN_FRAME = 19;
    public static final int NAVIGATION_PRELOAD_SUB_FRAME = 20;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 20;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private ResourceType() {}
}