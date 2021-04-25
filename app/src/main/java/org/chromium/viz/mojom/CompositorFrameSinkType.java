// CompositorFrameSinkType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/compositor_frame_sink.mojom
//

package org.chromium.viz.mojom;

public final class CompositorFrameSinkType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNSPECIFIED = 0;
    public static final int VIDEO = 1;
    public static final int MEDIA_STREAM = 2;
    public static final int LAYER_TREE = 3;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 3;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private CompositorFrameSinkType() {}
}