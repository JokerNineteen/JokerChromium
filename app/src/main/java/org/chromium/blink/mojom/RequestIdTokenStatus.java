// RequestIdTokenStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webid/federated_auth_request.mojom
//

package org.chromium.blink.mojom;

public final class RequestIdTokenStatus {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int SUCCESS = 0;
    public static final int APPROVAL_DECLINED = 1;
    public static final int ERROR_TOO_MANY_REQUESTS = 2;
    public static final int ERROR_WEB_ID_NOT_SUPPORTED_BY_PROVIDER = 3;
    public static final int ERROR_FETCHING_WELL_KNOWN = 4;
    public static final int ERROR_INVALID_WELL_KNOWN = 5;
    public static final int ERROR_FETCHING_SIGNIN = 6;
    public static final int ERROR_INVALID_SIGNIN_RESPONSE = 7;
    public static final int ERROR = 8;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 8;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 8;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private RequestIdTokenStatus() {}
}