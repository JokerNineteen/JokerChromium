// ItemDetails.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/digital_goods/digital_goods.mojom
//

package org.chromium.payments.mojom;


public final class ItemDetails extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 72;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(72, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String itemId;
    public String title;
    public String description;
    public PaymentCurrencyAmount price;
    public String subscriptionPeriod;
    public String freeTrialPeriod;
    public PaymentCurrencyAmount introductoryPrice;
    public String introductoryPricePeriod;

    private ItemDetails(int version) {
        super(STRUCT_SIZE, version);
    }

    public ItemDetails() {
        this(0);
    }

    public static ItemDetails deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ItemDetails deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ItemDetails decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ItemDetails result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ItemDetails(elementsOrVersion);
                {
                    
                result.itemId = decoder0.readString(8, false);
                }
                {
                    
                result.title = decoder0.readString(16, false);
                }
                {
                    
                result.description = decoder0.readString(24, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.price = PaymentCurrencyAmount.decode(decoder1);
                }
                {
                    
                result.subscriptionPeriod = decoder0.readString(40, true);
                }
                {
                    
                result.freeTrialPeriod = decoder0.readString(48, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.introductoryPrice = PaymentCurrencyAmount.decode(decoder1);
                }
                {
                    
                result.introductoryPricePeriod = decoder0.readString(64, true);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.itemId, 8, false);
        
        encoder0.encode(this.title, 16, false);
        
        encoder0.encode(this.description, 24, false);
        
        encoder0.encode(this.price, 32, false);
        
        encoder0.encode(this.subscriptionPeriod, 40, true);
        
        encoder0.encode(this.freeTrialPeriod, 48, true);
        
        encoder0.encode(this.introductoryPrice, 56, true);
        
        encoder0.encode(this.introductoryPricePeriod, 64, true);
    }
}