
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/browser/sms/sms_provider_gms.h

package org.chromium.content.browser.sms;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    GmsBackend.AUTO, GmsBackend.USER_CONSENT, GmsBackend.VERIFICATION
})
@Retention(RetentionPolicy.SOURCE)
public @interface GmsBackend {
  int AUTO = 0;
  int USER_CONSENT = 1;
  int VERIFICATION = 2;
}