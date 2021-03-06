// ContentCategory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/content_index/content_index.mojom
//

package org.chromium.blink.mojom;

public final class ContentCategory {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int NONE = 0;
    public static final int HOME_PAGE = 1;
    public static final int ARTICLE = 2;
    public static final int VIDEO = 3;
    public static final int AUDIO = 4;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 4;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private ContentCategory() {}
}