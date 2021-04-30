// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.page_annotations;

import org.json.JSONException;
import org.json.JSONObject;

import org.chromium.base.Log;
import org.chromium.chrome.browser.page_annotations.PageAnnotation.PageAnnotationType;

import java.util.Locale;

/**
 * {@link PageAnnotation} for products in a page.
 */
public class BuyableProductPageAnnotation extends PageAnnotation {
    private static final String TAG = "BPPA";
    private static final String BUYABLE_PRODUCT_KEY = "buyableProduct";
    private static final String CURRENT_PRICE_KEY = "currentPrice";
    private static final String CURRENCY_CODE_KEY = "currencyCode";
    private static final String AMOUNT_MICROS_KEY = "amountMicros";

    private final long mPriceMicros;
    private final String mCurrencyCode;

    /** Creates a new instance. */
    public BuyableProductPageAnnotation(long priceMicros, String currencyCode) {
        super(PageAnnotationType.BUYABLE_PRODUCT);
        mPriceMicros = priceMicros;
        mCurrencyCode = currencyCode;
    }

    /** Gets the current price amount in micros. */
    public long getCurrentPriceMicros() {
        return mPriceMicros;
    }

    /** Gets the currency code used for the price. */
    public String getCurrencyCode() {
        return mCurrencyCode;
    }

    /** Creates a new {@link BuyableProductPageAnnotation} from a {@link JSONObject}. */
    public static BuyableProductPageAnnotation fromJson(JSONObject object) {
        try {
            JSONObject metadata = object.getJSONObject(BUYABLE_PRODUCT_KEY);
            JSONObject priceMetadata = metadata.getJSONObject(CURRENT_PRICE_KEY);
            if (priceMetadata == null || !priceMetadata.has(AMOUNT_MICROS_KEY)
                    || priceMetadata.isNull(AMOUNT_MICROS_KEY)) {
                Log.i(TAG, String.format(Locale.US, "Invalid price info."));
                return null;
            }

            Long priceAmountMicros =
                    PageAnnotationUtils.safeParseLong(priceMetadata.getString(AMOUNT_MICROS_KEY));

            if (priceAmountMicros == null) {
                Log.i(TAG, String.format(Locale.US, "Invalid price micros."));
                return null;
            }

            return new BuyableProductPageAnnotation(
                    priceAmountMicros, priceMetadata.getString(CURRENCY_CODE_KEY));
        } catch (JSONException e) {
            Log.i(TAG,
                    String.format(Locale.US,
                            "There was a problem parsing "
                                    + "BuyableProductPageAnnotation "
                                    + "Details: %s",
                            e.toString()));
        }

        return null;
    }
}