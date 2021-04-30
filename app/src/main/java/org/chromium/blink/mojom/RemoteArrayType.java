// RemoteArrayType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/remote_objects/remote_objects.mojom
//

package org.chromium.blink.mojom;

public final class RemoteArrayType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int INT8_ARRAY = 1;
    public static final int UINT8_ARRAY = 2;
    public static final int INT16_ARRAY = 3;
    public static final int UINT16_ARRAY = 4;
    public static final int INT32_ARRAY = 5;
    public static final int UINT32_ARRAY = 6;
    public static final int FLOAT32_ARRAY = 7;
    public static final int FLOAT64_ARRAY = 8;
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 8;

    public static boolean isKnownValue(int value) {
        return value >= 1 && value <= 8;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private RemoteArrayType() {}
}