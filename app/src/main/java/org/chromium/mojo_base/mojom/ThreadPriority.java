// ThreadPriority.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/thread_priority.mojom
//

package org.chromium.mojo_base.mojom;

public final class ThreadPriority {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int BACKGROUND = 0;
    public static final int NORMAL = 1;
    public static final int DISPLAY = 2;
    public static final int REALTIME_AUDIO = 3;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 3;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private ThreadPriority() {}
}