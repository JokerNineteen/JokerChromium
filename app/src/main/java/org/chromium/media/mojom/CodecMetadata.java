// CodecMetadata.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;


public final class CodecMetadata extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Vp8 = 0;
        public static final int Vp9 = 1;
    };
    private Vp8Metadata mVp8;
    private Vp9Metadata mVp9;

    public void setVp8(Vp8Metadata vp8) {
        this.mTag = Tag.Vp8;
        this.mVp8 = vp8;
    }

    public Vp8Metadata getVp8() {
        assert this.mTag == Tag.Vp8;
        return this.mVp8;
    }

    public void setVp9(Vp9Metadata vp9) {
        this.mTag = Tag.Vp9;
        this.mVp9 = vp9;
    }

    public Vp9Metadata getVp9() {
        assert this.mTag == Tag.Vp9;
        return this.mVp9;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Vp8: {
                
                encoder0.encode(this.mVp8, offset + 8, false);
                break;
            }
            case Tag.Vp9: {
                
                encoder0.encode(this.mVp9, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static CodecMetadata deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final CodecMetadata decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        CodecMetadata result = new CodecMetadata();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Vp8: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mVp8 = Vp8Metadata.decode(decoder1);
                result.mTag = Tag.Vp8;
                break;
            }
            case Tag.Vp9: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mVp9 = Vp9Metadata.decode(decoder1);
                result.mTag = Tag.Vp9;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}