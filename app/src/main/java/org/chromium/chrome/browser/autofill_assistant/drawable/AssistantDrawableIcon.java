
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/autofill_assistant/browser/generic_ui_java_generated_enums.h

package org.chromium.chrome.browser.autofill_assistant.drawable;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    AssistantDrawableIcon.DRAWABLE_ICON_UNDEFINED,
    AssistantDrawableIcon.PROGRESSBAR_DEFAULT_INITIAL_STEP,
    AssistantDrawableIcon.PROGRESSBAR_DEFAULT_DATA_COLLECTION,
    AssistantDrawableIcon.PROGRESSBAR_DEFAULT_PAYMENT,
    AssistantDrawableIcon.PROGRESSBAR_DEFAULT_FINAL_STEP, AssistantDrawableIcon.SITTING_PERSON,
    AssistantDrawableIcon.TICKET_STUB, AssistantDrawableIcon.SHOPPING_BASKET,
    AssistantDrawableIcon.FAST_FOOD, AssistantDrawableIcon.LOCAL_DINING,
    AssistantDrawableIcon.COGWHEEL, AssistantDrawableIcon.KEY, AssistantDrawableIcon.CAR,
    AssistantDrawableIcon.GROCERY, AssistantDrawableIcon.VISIBILITY_ON,
    AssistantDrawableIcon.VISIBILITY_OFF
})
@Retention(RetentionPolicy.SOURCE)
public @interface AssistantDrawableIcon {
  int DRAWABLE_ICON_UNDEFINED = 0;
  int PROGRESSBAR_DEFAULT_INITIAL_STEP = 1;
  int PROGRESSBAR_DEFAULT_DATA_COLLECTION = 2;
  int PROGRESSBAR_DEFAULT_PAYMENT = 3;
  int PROGRESSBAR_DEFAULT_FINAL_STEP = 4;
  int SITTING_PERSON = 5;
  int TICKET_STUB = 6;
  int SHOPPING_BASKET = 7;
  int FAST_FOOD = 8;
  int LOCAL_DINING = 9;
  int COGWHEEL = 10;
  int KEY = 11;
  int CAR = 12;
  int GROCERY = 13;
  int VISIBILITY_ON = 14;
  int VISIBILITY_OFF = 15;
}