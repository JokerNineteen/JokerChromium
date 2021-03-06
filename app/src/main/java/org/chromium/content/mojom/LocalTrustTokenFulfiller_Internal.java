// LocalTrustTokenFulfiller_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     content/public/common/trust_tokens.mojom
//

package org.chromium.content.mojom;


class LocalTrustTokenFulfiller_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<LocalTrustTokenFulfiller, LocalTrustTokenFulfiller.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<LocalTrustTokenFulfiller, LocalTrustTokenFulfiller.Proxy>() {

        @Override
        public String getName() {
            return "content.mojom.LocalTrustTokenFulfiller";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, LocalTrustTokenFulfiller impl) {
            return new Stub(core, impl);
        }

        @Override
        public LocalTrustTokenFulfiller[] buildArray(int size) {
          return new LocalTrustTokenFulfiller[size];
        }
    };


    private static final int FULFILL_TRUST_TOKEN_ISSUANCE_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements LocalTrustTokenFulfiller.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void fulfillTrustTokenIssuance(
org.chromium.network.mojom.FulfillTrustTokenIssuanceRequest request, 
FulfillTrustTokenIssuanceResponse callback) {

            LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams _message = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams();

            _message.request = request;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    FULFILL_TRUST_TOKEN_ISSUANCE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<LocalTrustTokenFulfiller> {

        Stub(org.chromium.mojo.system.Core core, LocalTrustTokenFulfiller impl) {
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
                                LocalTrustTokenFulfiller_Internal.MANAGER, messageWithHeader);




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
                                getCore(), LocalTrustTokenFulfiller_Internal.MANAGER, messageWithHeader, receiver);







                    case FULFILL_TRUST_TOKEN_ISSUANCE_ORDINAL: {

                        LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams data =
                                LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams.deserialize(messageWithHeader.getPayload());

                        getImpl().fulfillTrustTokenIssuance(data.request, new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.network.mojom.FulfillTrustTokenIssuanceRequest request;

        private LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams() {
            this(0);
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.request = org.chromium.network.mojom.FulfillTrustTokenIssuanceRequest.decode(decoder1);
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
            
            encoder0.encode(this.request, 8, false);
        }
    }



    
    static final class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.network.mojom.FulfillTrustTokenIssuanceAnswer answer;

        private LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams() {
            this(0);
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.answer = org.chromium.network.mojom.FulfillTrustTokenIssuanceAnswer.decode(decoder1);
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
            
            encoder0.encode(this.answer, 8, false);
        }
    }

    static class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final LocalTrustTokenFulfiller.FulfillTrustTokenIssuanceResponse mCallback;

        LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsForwardToCallback(LocalTrustTokenFulfiller.FulfillTrustTokenIssuanceResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(FULFILL_TRUST_TOKEN_ISSUANCE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams response = LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.answer);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsProxyToResponder implements LocalTrustTokenFulfiller.FulfillTrustTokenIssuanceResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(org.chromium.network.mojom.FulfillTrustTokenIssuanceAnswer answer) {
            LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams _response = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams();

            _response.answer = answer;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    FULFILL_TRUST_TOKEN_ISSUANCE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
