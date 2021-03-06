// TransferableResource.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/transferable_resource.mojom
//

package org.chromium.viz.mojom;


public final class TransferableResource extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ResourceId id;
    public int format;
    public int filter;
    public org.chromium.gfx.mojom.Size size;
    public org.chromium.gpu.mojom.MailboxHolder mailboxHolder;
    public boolean readLockFencesEnabled;
    public boolean isSoftware;
    public boolean isOverlayCandidate;
    public boolean isBackedBySurfaceTexture;
    public boolean wantsPromotionHint;
    public org.chromium.gfx.mojom.ColorSpace colorSpace;
    public org.chromium.gpu.mojom.VulkanYCbCrInfo ycbcrInfo;

    private TransferableResource(int version) {
        super(STRUCT_SIZE, version);
    }

    public TransferableResource() {
        this(0);
    }

    public static TransferableResource deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TransferableResource deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TransferableResource decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TransferableResource result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new TransferableResource(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.id = ResourceId.decode(decoder1);
                }
                {
                    
                result.format = decoder0.readInt(16);
                    ResourceFormat.validate(result.format);
                    result.format = ResourceFormat.toKnownValue(result.format);
                }
                {
                    
                result.filter = decoder0.readInt(20);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.size = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.mailboxHolder = org.chromium.gpu.mojom.MailboxHolder.decode(decoder1);
                }
                {
                    
                result.readLockFencesEnabled = decoder0.readBoolean(40, 0);
                }
                {
                    
                result.isSoftware = decoder0.readBoolean(40, 1);
                }
                {
                    
                result.isOverlayCandidate = decoder0.readBoolean(40, 2);
                }
                {
                    
                result.isBackedBySurfaceTexture = decoder0.readBoolean(40, 3);
                }
                {
                    
                result.wantsPromotionHint = decoder0.readBoolean(40, 4);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.colorSpace = org.chromium.gfx.mojom.ColorSpace.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.ycbcrInfo = org.chromium.gpu.mojom.VulkanYCbCrInfo.decode(decoder1);
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
        
        encoder0.encode(this.id, 8, false);
        
        encoder0.encode(this.format, 16);
        
        encoder0.encode(this.filter, 20);
        
        encoder0.encode(this.size, 24, false);
        
        encoder0.encode(this.mailboxHolder, 32, false);
        
        encoder0.encode(this.readLockFencesEnabled, 40, 0);
        
        encoder0.encode(this.isSoftware, 40, 1);
        
        encoder0.encode(this.isOverlayCandidate, 40, 2);
        
        encoder0.encode(this.isBackedBySurfaceTexture, 40, 3);
        
        encoder0.encode(this.wantsPromotionHint, 40, 4);
        
        encoder0.encode(this.colorSpace, 48, false);
        
        encoder0.encode(this.ycbcrInfo, 56, true);
    }
}