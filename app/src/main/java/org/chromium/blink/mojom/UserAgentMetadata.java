// UserAgentMetadata.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/user_agent/user_agent_metadata.mojom
//

package org.chromium.blink.mojom;


public final class UserAgentMetadata extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public UserAgentBrandVersion[] brandVersionList;
    public String fullVersion;
    public String platform;
    public String platformVersion;
    public String architecture;
    public String model;
    public boolean mobile;

    private UserAgentMetadata(int version) {
        super(STRUCT_SIZE, version);
    }

    public UserAgentMetadata() {
        this(0);
    }

    public static UserAgentMetadata deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static UserAgentMetadata deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static UserAgentMetadata decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        UserAgentMetadata result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new UserAgentMetadata(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.brandVersionList = new UserAgentBrandVersion[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.brandVersionList[i1] = UserAgentBrandVersion.decode(decoder2);
                    }
                }
                }
                {
                    
                result.fullVersion = decoder0.readString(16, false);
                }
                {
                    
                result.platform = decoder0.readString(24, false);
                }
                {
                    
                result.platformVersion = decoder0.readString(32, false);
                }
                {
                    
                result.architecture = decoder0.readString(40, false);
                }
                {
                    
                result.model = decoder0.readString(48, false);
                }
                {
                    
                result.mobile = decoder0.readBoolean(56, 0);
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
        
        if (this.brandVersionList == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.brandVersionList.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.brandVersionList.length; ++i0) {
                
                encoder1.encode(this.brandVersionList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.fullVersion, 16, false);
        
        encoder0.encode(this.platform, 24, false);
        
        encoder0.encode(this.platformVersion, 32, false);
        
        encoder0.encode(this.architecture, 40, false);
        
        encoder0.encode(this.model, 48, false);
        
        encoder0.encode(this.mobile, 56, 0);
    }
}