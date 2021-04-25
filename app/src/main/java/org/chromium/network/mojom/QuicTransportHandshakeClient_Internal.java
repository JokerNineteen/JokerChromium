// QuicTransportHandshakeClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/quic_transport.mojom
//

package org.chromium.network.mojom;


class QuicTransportHandshakeClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<QuicTransportHandshakeClient, QuicTransportHandshakeClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<QuicTransportHandshakeClient, QuicTransportHandshakeClient.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.QuicTransportHandshakeClient";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, QuicTransportHandshakeClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public QuicTransportHandshakeClient[] buildArray(int size) {
          return new QuicTransportHandshakeClient[size];
        }
    };


    private static final int ON_CONNECTION_ESTABLISHED_ORDINAL = 0;

    private static final int ON_HANDSHAKE_FAILED_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements QuicTransportHandshakeClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onConnectionEstablished(
QuicTransport transport, org.chromium.mojo.bindings.InterfaceRequest<QuicTransportClient> client) {

            QuicTransportHandshakeClientOnConnectionEstablishedParams _message = new QuicTransportHandshakeClientOnConnectionEstablishedParams();

            _message.transport = transport;

            _message.client = client;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_CONNECTION_ESTABLISHED_ORDINAL)));

        }


        @Override
        public void onHandshakeFailed(
QuicTransportError error) {

            QuicTransportHandshakeClientOnHandshakeFailedParams _message = new QuicTransportHandshakeClientOnHandshakeFailedParams();

            _message.error = error;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_HANDSHAKE_FAILED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<QuicTransportHandshakeClient> {

        Stub(org.chromium.mojo.system.Core core, QuicTransportHandshakeClient impl) {
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
                                QuicTransportHandshakeClient_Internal.MANAGER, messageWithHeader);





                    case ON_CONNECTION_ESTABLISHED_ORDINAL: {

                        QuicTransportHandshakeClientOnConnectionEstablishedParams data =
                                QuicTransportHandshakeClientOnConnectionEstablishedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onConnectionEstablished(data.transport, data.client);
                        return true;
                    }





                    case ON_HANDSHAKE_FAILED_ORDINAL: {

                        QuicTransportHandshakeClientOnHandshakeFailedParams data =
                                QuicTransportHandshakeClientOnHandshakeFailedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onHandshakeFailed(data.error);
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
                                getCore(), QuicTransportHandshakeClient_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class QuicTransportHandshakeClientOnConnectionEstablishedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public QuicTransport transport;
        public org.chromium.mojo.bindings.InterfaceRequest<QuicTransportClient> client;

        private QuicTransportHandshakeClientOnConnectionEstablishedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuicTransportHandshakeClientOnConnectionEstablishedParams() {
            this(0);
        }

        public static QuicTransportHandshakeClientOnConnectionEstablishedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuicTransportHandshakeClientOnConnectionEstablishedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuicTransportHandshakeClientOnConnectionEstablishedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuicTransportHandshakeClientOnConnectionEstablishedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuicTransportHandshakeClientOnConnectionEstablishedParams(elementsOrVersion);
                    {
                        
                    result.transport = decoder0.readServiceInterface(8, false, QuicTransport.MANAGER);
                    }
                    {
                        
                    result.client = decoder0.readInterfaceRequest(16, false);
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
            
            encoder0.encode(this.transport, 8, false, QuicTransport.MANAGER);
            
            encoder0.encode(this.client, 16, false);
        }
    }



    
    static final class QuicTransportHandshakeClientOnHandshakeFailedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public QuicTransportError error;

        private QuicTransportHandshakeClientOnHandshakeFailedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuicTransportHandshakeClientOnHandshakeFailedParams() {
            this(0);
        }

        public static QuicTransportHandshakeClientOnHandshakeFailedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuicTransportHandshakeClientOnHandshakeFailedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuicTransportHandshakeClientOnHandshakeFailedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuicTransportHandshakeClientOnHandshakeFailedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuicTransportHandshakeClientOnHandshakeFailedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.error = QuicTransportError.decode(decoder1);
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
            
            encoder0.encode(this.error, 8, true);
        }
    }



}