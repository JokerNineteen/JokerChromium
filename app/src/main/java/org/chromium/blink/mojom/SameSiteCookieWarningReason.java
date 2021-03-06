// SameSiteCookieWarningReason.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/inspector_issue.mojom
//

package org.chromium.blink.mojom;

public final class SameSiteCookieWarningReason {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int WARN_SAME_SITE_UNSPECIFIED_CROSS_SITE_CONTEXT = 0;
    public static final int WARN_SAME_SITE_NONE_INSECURE = 1;
    public static final int WARN_SAME_SITE_UNSPECIFIED_LAX_ALLOW_UNSAFE = 2;
    public static final int WARN_SAME_SITE_STRICT_LAX_DOWNGRADE_STRICT = 3;
    public static final int WARN_SAME_SITE_STRICT_CROSS_DOWNGRADE_STRICT = 4;
    public static final int WARN_SAME_SITE_STRICT_CROSS_DOWNGRADE_LAX = 5;
    public static final int WARN_SAME_SITE_LAX_CROSS_DOWNGRADE_STRICT = 6;
    public static final int WARN_SAME_SITE_LAX_CROSS_DOWNGRADE_LAX = 7;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 7;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private SameSiteCookieWarningReason() {}
}