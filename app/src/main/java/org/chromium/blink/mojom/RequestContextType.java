// RequestContextType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/fetch/fetch_api_request.mojom
//

package org.chromium.blink.mojom;

public final class RequestContextType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNSPECIFIED = 0;
    public static final int AUDIO = 1;
    public static final int BEACON = 2;
    public static final int CSP_REPORT = 3;
    public static final int DOWNLOAD = 4;
    public static final int EMBED = 5;
    public static final int EVENT_SOURCE = 6;
    public static final int FAVICON = 7;
    public static final int FETCH = 8;
    public static final int FONT = 9;
    public static final int FORM = 10;
    public static final int FRAME = 11;
    public static final int HYPERLINK = 12;
    public static final int IFRAME = 13;
    public static final int IMAGE = 14;
    public static final int IMAGE_SET = 15;
    public static final int IMPORT = 16;
    public static final int INTERNAL = 17;
    public static final int LOCATION = 18;
    public static final int MANIFEST = 19;
    public static final int OBJECT = 20;
    public static final int PING = 21;
    public static final int PLUGIN = 22;
    public static final int PREFETCH = 23;
    public static final int SCRIPT = 24;
    public static final int SERVICE_WORKER = 25;
    public static final int SHARED_WORKER = 26;
    public static final int SUBRESOURCE = 27;
    public static final int SUBRESOURCE_WEBBUNDLE = 28;
    public static final int STYLE = 29;
    public static final int TRACK = 30;
    public static final int VIDEO = 31;
    public static final int WORKER = 32;
    public static final int XML_HTTP_REQUEST = 33;
    public static final int XSLT = 34;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 34;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 34;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private RequestContextType() {}
}