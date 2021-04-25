// KeyData.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/input_handler.mojom
//

package org.chromium.blink.mojom;


public final class KeyData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int domKey;
    public int domCode;
    public int windowsKeyCode;
    public int nativeKeyCode;
    public boolean isSystemKey;
    public boolean isBrowserShortcut;
    public org.chromium.mojo_base.mojom.String16 text;
    public org.chromium.mojo_base.mojom.String16 unmodifiedText;

    private KeyData(int version) {
        super(STRUCT_SIZE, version);
    }

    public KeyData() {
        this(0);
    }

    public static KeyData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static KeyData deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static KeyData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        KeyData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new KeyData(elementsOrVersion);
                {
                    
                result.domKey = decoder0.readInt(8);
                }
                {
                    
                result.domCode = decoder0.readInt(12);
                }
                {
                    
                result.windowsKeyCode = decoder0.readInt(16);
                }
                {
                    
                result.nativeKeyCode = decoder0.readInt(20);
                }
                {
                    
                result.isSystemKey = decoder0.readBoolean(24, 0);
                }
                {
                    
                result.isBrowserShortcut = decoder0.readBoolean(24, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.text = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.unmodifiedText = org.chromium.mojo_base.mojom.String16.decode(decoder1);
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
        
        encoder0.encode(this.domKey, 8);
        
        encoder0.encode(this.domCode, 12);
        
        encoder0.encode(this.windowsKeyCode, 16);
        
        encoder0.encode(this.nativeKeyCode, 20);
        
        encoder0.encode(this.isSystemKey, 24, 0);
        
        encoder0.encode(this.isBrowserShortcut, 24, 1);
        
        encoder0.encode(this.text, 32, false);
        
        encoder0.encode(this.unmodifiedText, 40, false);
    }
}