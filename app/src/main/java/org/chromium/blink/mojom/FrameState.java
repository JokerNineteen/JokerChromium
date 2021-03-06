// FrameState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page_state/page_state.mojom
//

package org.chromium.blink.mojom;


public final class FrameState extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 104;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(96, 0),new org.chromium.mojo.bindings.DataHeader(104, 2)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[1];
    public org.chromium.mojo_base.mojom.String16 urlString;
    public org.chromium.mojo_base.mojom.String16 referrer;
    public org.chromium.mojo_base.mojom.String16 target;
    public org.chromium.mojo_base.mojom.String16 stateObject;
    public org.chromium.mojo_base.mojom.String16[] documentState;
    public int scrollRestorationType;
    public ViewState viewState;
    public long itemSequenceNumber;
    public long documentSequenceNumber;
    public int referrerPolicy;
    public HttpBody httpBody;
    public FrameState[] children;
    public String initiatorOrigin;

    private FrameState(int version) {
        super(STRUCT_SIZE, version);
    }

    public FrameState() {
        this(2);
    }

    public static FrameState deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FrameState deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FrameState decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FrameState result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FrameState(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                result.urlString = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                result.referrer = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.target = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.stateObject = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.documentState = new org.chromium.mojo_base.mojom.String16[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, true);
                        result.documentState[i1] = org.chromium.mojo_base.mojom.String16.decode(decoder2);
                    }
                }
                }
                {
                    
                result.scrollRestorationType = decoder0.readInt(48);
                    ScrollRestorationType.validate(result.scrollRestorationType);
                    result.scrollRestorationType = ScrollRestorationType.toKnownValue(result.scrollRestorationType);
                }
                {
                    
                result.referrerPolicy = decoder0.readInt(52);
                    org.chromium.network.mojom.ReferrerPolicy.validate(result.referrerPolicy);
                    result.referrerPolicy = org.chromium.network.mojom.ReferrerPolicy.toKnownValue(result.referrerPolicy);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.viewState = ViewState.decode(decoder1);
                }
                {
                    
                result.itemSequenceNumber = decoder0.readLong(64);
                }
                {
                    
                result.documentSequenceNumber = decoder0.readLong(72);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, false);
                result.httpBody = HttpBody.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.children = new FrameState[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.children[i1] = FrameState.decode(decoder2);
                    }
                }
                }
            if (elementsOrVersion >= 2) {
                {
                    
                result.initiatorOrigin = decoder0.readString(96, true);
                }
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
        
        encoder0.encode(this.urlString, 8, true);
        
        encoder0.encode(this.referrer, 16, true);
        
        encoder0.encode(this.target, 24, true);
        
        encoder0.encode(this.stateObject, 32, true);
        
        if (this.documentState == null) {
            encoder0.encodeNullPointer(40, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.documentState.length, 40, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.documentState.length; ++i0) {
                
                encoder1.encode(this.documentState[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, true);
            }
        }
        
        encoder0.encode(this.scrollRestorationType, 48);
        
        encoder0.encode(this.referrerPolicy, 52);
        
        encoder0.encode(this.viewState, 56, true);
        
        encoder0.encode(this.itemSequenceNumber, 64);
        
        encoder0.encode(this.documentSequenceNumber, 72);
        
        encoder0.encode(this.httpBody, 80, false);
        
        if (this.children == null) {
            encoder0.encodeNullPointer(88, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.children.length, 88, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.children.length; ++i0) {
                
                encoder1.encode(this.children[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.initiatorOrigin, 96, true);
    }
}