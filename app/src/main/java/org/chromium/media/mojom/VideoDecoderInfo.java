// VideoDecoderInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/media_types.mojom
//

package org.chromium.media.mojom;


public final class VideoDecoderInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int decoderType;
    public boolean isPlatformDecoder;
    public boolean hasDecryptingDemuxerStream;

    private VideoDecoderInfo(int version) {
        super(STRUCT_SIZE, version);
        this.isPlatformDecoder = (boolean) false;
        this.hasDecryptingDemuxerStream = (boolean) false;
    }

    public VideoDecoderInfo() {
        this(0);
    }

    public static VideoDecoderInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoDecoderInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VideoDecoderInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoDecoderInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VideoDecoderInfo(elementsOrVersion);
                {
                    
                result.decoderType = decoder0.readInt(8);
                    VideoDecoderType.validate(result.decoderType);
                    result.decoderType = VideoDecoderType.toKnownValue(result.decoderType);
                }
                {
                    
                result.isPlatformDecoder = decoder0.readBoolean(12, 0);
                }
                {
                    
                result.hasDecryptingDemuxerStream = decoder0.readBoolean(12, 1);
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
        
        encoder0.encode(this.decoderType, 8);
        
        encoder0.encode(this.isPlatformDecoder, 12, 0);
        
        encoder0.encode(this.hasDecryptingDemuxerStream, 12, 1);
    }
}