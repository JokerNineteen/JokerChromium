// TextureQuadState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/quads.mojom
//

package org.chromium.viz.mojom;


public final class TextureQuadState extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ResourceId resourceId;
    public org.chromium.gfx.mojom.Size resourceSizeInPixels;
    public boolean premultipliedAlpha;
    public org.chromium.gfx.mojom.PointF uvTopLeft;
    public org.chromium.gfx.mojom.PointF uvBottomRight;
    public int backgroundColor;
    public float[] vertexOpacity;
    public boolean yFlipped;
    public boolean nearestNeighbor;
    public boolean secureOutputOnly;
    public boolean isVideoFrame;
    public int protectedVideoType;
    public int hwProtectedValidationId;

    private TextureQuadState(int version) {
        super(STRUCT_SIZE, version);
    }

    public TextureQuadState() {
        this(0);
    }

    public static TextureQuadState deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TextureQuadState deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TextureQuadState decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TextureQuadState result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new TextureQuadState(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.resourceId = ResourceId.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.resourceSizeInPixels = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                result.premultipliedAlpha = decoder0.readBoolean(24, 0);
                }
                {
                    
                result.yFlipped = decoder0.readBoolean(24, 1);
                }
                {
                    
                result.nearestNeighbor = decoder0.readBoolean(24, 2);
                }
                {
                    
                result.secureOutputOnly = decoder0.readBoolean(24, 3);
                }
                {
                    
                result.isVideoFrame = decoder0.readBoolean(24, 4);
                }
                {
                    
                result.backgroundColor = decoder0.readInt(28);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.uvTopLeft = org.chromium.gfx.mojom.PointF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.uvBottomRight = org.chromium.gfx.mojom.PointF.decode(decoder1);
                }
                {
                    
                result.vertexOpacity = decoder0.readFloats(48, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 4);
                }
                {
                    
                result.protectedVideoType = decoder0.readInt(56);
                    ProtectedVideoState.validate(result.protectedVideoType);
                    result.protectedVideoType = ProtectedVideoState.toKnownValue(result.protectedVideoType);
                }
                {
                    
                result.hwProtectedValidationId = decoder0.readInt(60);
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
        
        encoder0.encode(this.resourceId, 8, false);
        
        encoder0.encode(this.resourceSizeInPixels, 16, false);
        
        encoder0.encode(this.premultipliedAlpha, 24, 0);
        
        encoder0.encode(this.yFlipped, 24, 1);
        
        encoder0.encode(this.nearestNeighbor, 24, 2);
        
        encoder0.encode(this.secureOutputOnly, 24, 3);
        
        encoder0.encode(this.isVideoFrame, 24, 4);
        
        encoder0.encode(this.backgroundColor, 28);
        
        encoder0.encode(this.uvTopLeft, 32, false);
        
        encoder0.encode(this.uvBottomRight, 40, false);
        
        encoder0.encode(this.vertexOpacity, 48, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 4);
        
        encoder0.encode(this.protectedVideoType, 56);
        
        encoder0.encode(this.hwProtectedValidationId, 60);
    }
}