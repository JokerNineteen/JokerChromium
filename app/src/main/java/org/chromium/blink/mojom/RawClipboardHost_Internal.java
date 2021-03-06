// RawClipboardHost_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/clipboard/raw_clipboard.mojom
//

package org.chromium.blink.mojom;


class RawClipboardHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<RawClipboardHost, RawClipboardHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<RawClipboardHost, RawClipboardHost.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.RawClipboardHost";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, RawClipboardHost impl) {
            return new Stub(core, impl);
        }

        @Override
        public RawClipboardHost[] buildArray(int size) {
          return new RawClipboardHost[size];
        }
    };


    private static final int READ_AVAILABLE_FORMAT_NAMES_ORDINAL = 0;

    private static final int READ_ORDINAL = 1;

    private static final int WRITE_ORDINAL = 2;

    private static final int COMMIT_WRITE_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements RawClipboardHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void readAvailableFormatNames(

ReadAvailableFormatNamesResponse callback) {

            RawClipboardHostReadAvailableFormatNamesParams _message = new RawClipboardHostReadAvailableFormatNamesParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    READ_AVAILABLE_FORMAT_NAMES_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new RawClipboardHostReadAvailableFormatNamesResponseParamsForwardToCallback(callback));

        }


        @Override
        public void read(
org.chromium.mojo_base.mojom.String16 format, 
ReadResponse callback) {

            RawClipboardHostReadParams _message = new RawClipboardHostReadParams();

            _message.format = format;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    READ_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new RawClipboardHostReadResponseParamsForwardToCallback(callback));

        }


        @Override
        public void write(
org.chromium.mojo_base.mojom.String16 format, org.chromium.mojo_base.mojom.BigBuffer data) {

            RawClipboardHostWriteParams _message = new RawClipboardHostWriteParams();

            _message.format = format;

            _message.data = data;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(WRITE_ORDINAL)));

        }


        @Override
        public void commitWrite(
) {

            RawClipboardHostCommitWriteParams _message = new RawClipboardHostCommitWriteParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(COMMIT_WRITE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<RawClipboardHost> {

        Stub(org.chromium.mojo.system.Core core, RawClipboardHost impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                RawClipboardHost_Internal.MANAGER, messageWithHeader);









                    case WRITE_ORDINAL: {

                        RawClipboardHostWriteParams data =
                                RawClipboardHostWriteParams.deserialize(messageWithHeader.getPayload());

                        getImpl().write(data.format, data.data);
                        return true;
                    }





                    case COMMIT_WRITE_ORDINAL: {

                        RawClipboardHostCommitWriteParams.deserialize(messageWithHeader.getPayload());

                        getImpl().commitWrite();
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), RawClipboardHost_Internal.MANAGER, messageWithHeader, receiver);







                    case READ_AVAILABLE_FORMAT_NAMES_ORDINAL: {

                        RawClipboardHostReadAvailableFormatNamesParams.deserialize(messageWithHeader.getPayload());

                        getImpl().readAvailableFormatNames(new RawClipboardHostReadAvailableFormatNamesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }







                    case READ_ORDINAL: {

                        RawClipboardHostReadParams data =
                                RawClipboardHostReadParams.deserialize(messageWithHeader.getPayload());

                        getImpl().read(data.format, new RawClipboardHostReadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class RawClipboardHostReadAvailableFormatNamesParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private RawClipboardHostReadAvailableFormatNamesParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RawClipboardHostReadAvailableFormatNamesParams() {
            this(0);
        }

        public static RawClipboardHostReadAvailableFormatNamesParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RawClipboardHostReadAvailableFormatNamesParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RawClipboardHostReadAvailableFormatNamesParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RawClipboardHostReadAvailableFormatNamesParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RawClipboardHostReadAvailableFormatNamesParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class RawClipboardHostReadAvailableFormatNamesResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.String16[] rawTypes;

        private RawClipboardHostReadAvailableFormatNamesResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RawClipboardHostReadAvailableFormatNamesResponseParams() {
            this(0);
        }

        public static RawClipboardHostReadAvailableFormatNamesResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RawClipboardHostReadAvailableFormatNamesResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RawClipboardHostReadAvailableFormatNamesResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RawClipboardHostReadAvailableFormatNamesResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RawClipboardHostReadAvailableFormatNamesResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.rawTypes = new org.chromium.mojo_base.mojom.String16[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.rawTypes[i1] = org.chromium.mojo_base.mojom.String16.decode(decoder2);
                        }
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
            
            if (this.rawTypes == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.rawTypes.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.rawTypes.length; ++i0) {
                    
                    encoder1.encode(this.rawTypes[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }

    static class RawClipboardHostReadAvailableFormatNamesResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final RawClipboardHost.ReadAvailableFormatNamesResponse mCallback;

        RawClipboardHostReadAvailableFormatNamesResponseParamsForwardToCallback(RawClipboardHost.ReadAvailableFormatNamesResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(READ_AVAILABLE_FORMAT_NAMES_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                RawClipboardHostReadAvailableFormatNamesResponseParams response = RawClipboardHostReadAvailableFormatNamesResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.rawTypes);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class RawClipboardHostReadAvailableFormatNamesResponseParamsProxyToResponder implements RawClipboardHost.ReadAvailableFormatNamesResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RawClipboardHostReadAvailableFormatNamesResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(org.chromium.mojo_base.mojom.String16[] rawTypes) {
            RawClipboardHostReadAvailableFormatNamesResponseParams _response = new RawClipboardHostReadAvailableFormatNamesResponseParams();

            _response.rawTypes = rawTypes;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    READ_AVAILABLE_FORMAT_NAMES_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class RawClipboardHostReadParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.String16 format;

        private RawClipboardHostReadParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RawClipboardHostReadParams() {
            this(0);
        }

        public static RawClipboardHostReadParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RawClipboardHostReadParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RawClipboardHostReadParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RawClipboardHostReadParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RawClipboardHostReadParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.format = org.chromium.mojo_base.mojom.String16.decode(decoder1);
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
            
            encoder0.encode(this.format, 8, false);
        }
    }



    
    static final class RawClipboardHostReadResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.BigBuffer data;

        private RawClipboardHostReadResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RawClipboardHostReadResponseParams() {
            this(0);
        }

        public static RawClipboardHostReadResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RawClipboardHostReadResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RawClipboardHostReadResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RawClipboardHostReadResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RawClipboardHostReadResponseParams(elementsOrVersion);
                    {
                        
                    result.data = org.chromium.mojo_base.mojom.BigBuffer.decode(decoder0, 8);
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
            
            encoder0.encode(this.data, 8, false);
        }
    }

    static class RawClipboardHostReadResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final RawClipboardHost.ReadResponse mCallback;

        RawClipboardHostReadResponseParamsForwardToCallback(RawClipboardHost.ReadResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(READ_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                RawClipboardHostReadResponseParams response = RawClipboardHostReadResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.data);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class RawClipboardHostReadResponseParamsProxyToResponder implements RawClipboardHost.ReadResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RawClipboardHostReadResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(org.chromium.mojo_base.mojom.BigBuffer data) {
            RawClipboardHostReadResponseParams _response = new RawClipboardHostReadResponseParams();

            _response.data = data;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    READ_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class RawClipboardHostWriteParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.String16 format;
        public org.chromium.mojo_base.mojom.BigBuffer data;

        private RawClipboardHostWriteParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RawClipboardHostWriteParams() {
            this(0);
        }

        public static RawClipboardHostWriteParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RawClipboardHostWriteParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RawClipboardHostWriteParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RawClipboardHostWriteParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RawClipboardHostWriteParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.format = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                    }
                    {
                        
                    result.data = org.chromium.mojo_base.mojom.BigBuffer.decode(decoder0, 16);
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
            
            encoder0.encode(this.format, 8, false);
            
            encoder0.encode(this.data, 16, false);
        }
    }



    
    static final class RawClipboardHostCommitWriteParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private RawClipboardHostCommitWriteParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RawClipboardHostCommitWriteParams() {
            this(0);
        }

        public static RawClipboardHostCommitWriteParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RawClipboardHostCommitWriteParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RawClipboardHostCommitWriteParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RawClipboardHostCommitWriteParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RawClipboardHostCommitWriteParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



}
