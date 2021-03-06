// RendererEvictionReason.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/back_forward_cache_controller.mojom
//

package org.chromium.blink.mojom;

public final class RendererEvictionReason {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int JAVA_SCRIPT_EXECUTION = 0;
    public static final int NETWORK_REQUEST_DATAPIPE_DRAINED = 1;
    public static final int NETWORK_REQUEST_REDIRECTED = 2;
    public static final int NETWORK_REQUEST_TIMEOUT = 3;
    public static final int NETWORK_EXCEEDS_BUFFER_LIMIT = 4;
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

    private RendererEvictionReason() {}
}