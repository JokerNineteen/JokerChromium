// AuthenticationAndCertificateObserver_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/auth_and_certificate_observer.mojom
//

package org.chromium.network.mojom;


class AuthenticationAndCertificateObserver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AuthenticationAndCertificateObserver, AuthenticationAndCertificateObserver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<AuthenticationAndCertificateObserver, AuthenticationAndCertificateObserver.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.AuthenticationAndCertificateObserver";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, AuthenticationAndCertificateObserver impl) {
            return new Stub(core, impl);
        }

        @Override
        public AuthenticationAndCertificateObserver[] buildArray(int size) {
          return new AuthenticationAndCertificateObserver[size];
        }
    };


    private static final int ON_SSL_CERTIFICATE_ERROR_ORDINAL = 0;

    private static final int ON_CERTIFICATE_REQUESTED_ORDINAL = 1;

    private static final int ON_AUTH_REQUIRED_ORDINAL = 2;

    private static final int CLONE_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AuthenticationAndCertificateObserver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onSslCertificateError(
org.chromium.url.mojom.Url url, int netError, SslInfo sslInfo, boolean fatal, 
OnSslCertificateErrorResponse callback) {

            AuthenticationAndCertificateObserverOnSslCertificateErrorParams _message = new AuthenticationAndCertificateObserverOnSslCertificateErrorParams();

            _message.url = url;

            _message.netError = netError;

            _message.sslInfo = sslInfo;

            _message.fatal = fatal;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ON_SSL_CERTIFICATE_ERROR_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParamsForwardToCallback(callback));

        }


        @Override
        public void onCertificateRequested(
org.chromium.mojo_base.mojom.UnguessableToken windowId, SslCertRequestInfo certInfo, ClientCertificateResponder certResponder) {

            AuthenticationAndCertificateObserverOnCertificateRequestedParams _message = new AuthenticationAndCertificateObserverOnCertificateRequestedParams();

            _message.windowId = windowId;

            _message.certInfo = certInfo;

            _message.certResponder = certResponder;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_CERTIFICATE_REQUESTED_ORDINAL)));

        }


        @Override
        public void onAuthRequired(
org.chromium.mojo_base.mojom.UnguessableToken windowId, int requestId, org.chromium.url.mojom.Url url, boolean firstAuthAttempt, AuthChallengeInfo authInfo, HttpResponseHeaders headHeaders, AuthChallengeResponder authChallengeResponder) {

            AuthenticationAndCertificateObserverOnAuthRequiredParams _message = new AuthenticationAndCertificateObserverOnAuthRequiredParams();

            _message.windowId = windowId;

            _message.requestId = requestId;

            _message.url = url;

            _message.firstAuthAttempt = firstAuthAttempt;

            _message.authInfo = authInfo;

            _message.headHeaders = headHeaders;

            _message.authChallengeResponder = authChallengeResponder;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_AUTH_REQUIRED_ORDINAL)));

        }


        @Override
        public void clone(
org.chromium.mojo.bindings.InterfaceRequest<AuthenticationAndCertificateObserver> listener) {

            AuthenticationAndCertificateObserverCloneParams _message = new AuthenticationAndCertificateObserverCloneParams();

            _message.listener = listener;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CLONE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AuthenticationAndCertificateObserver> {

        Stub(org.chromium.mojo.system.Core core, AuthenticationAndCertificateObserver impl) {
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
                                AuthenticationAndCertificateObserver_Internal.MANAGER, messageWithHeader);







                    case ON_CERTIFICATE_REQUESTED_ORDINAL: {

                        AuthenticationAndCertificateObserverOnCertificateRequestedParams data =
                                AuthenticationAndCertificateObserverOnCertificateRequestedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onCertificateRequested(data.windowId, data.certInfo, data.certResponder);
                        return true;
                    }





                    case ON_AUTH_REQUIRED_ORDINAL: {

                        AuthenticationAndCertificateObserverOnAuthRequiredParams data =
                                AuthenticationAndCertificateObserverOnAuthRequiredParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onAuthRequired(data.windowId, data.requestId, data.url, data.firstAuthAttempt, data.authInfo, data.headHeaders, data.authChallengeResponder);
                        return true;
                    }





                    case CLONE_ORDINAL: {

                        AuthenticationAndCertificateObserverCloneParams data =
                                AuthenticationAndCertificateObserverCloneParams.deserialize(messageWithHeader.getPayload());

                        getImpl().clone(data.listener);
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
                                getCore(), AuthenticationAndCertificateObserver_Internal.MANAGER, messageWithHeader, receiver);







                    case ON_SSL_CERTIFICATE_ERROR_ORDINAL: {

                        AuthenticationAndCertificateObserverOnSslCertificateErrorParams data =
                                AuthenticationAndCertificateObserverOnSslCertificateErrorParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSslCertificateError(data.url, data.netError, data.sslInfo, data.fatal, new AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class AuthenticationAndCertificateObserverOnSslCertificateErrorParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public int netError;
        public SslInfo sslInfo;
        public boolean fatal;

        private AuthenticationAndCertificateObserverOnSslCertificateErrorParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AuthenticationAndCertificateObserverOnSslCertificateErrorParams() {
            this(0);
        }

        public static AuthenticationAndCertificateObserverOnSslCertificateErrorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AuthenticationAndCertificateObserverOnSslCertificateErrorParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AuthenticationAndCertificateObserverOnSslCertificateErrorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AuthenticationAndCertificateObserverOnSslCertificateErrorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AuthenticationAndCertificateObserverOnSslCertificateErrorParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.netError = decoder0.readInt(16);
                    }
                    {
                        
                    result.fatal = decoder0.readBoolean(20, 0);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.sslInfo = SslInfo.decode(decoder1);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.netError, 16);
            
            encoder0.encode(this.fatal, 20, 0);
            
            encoder0.encode(this.sslInfo, 24, false);
        }
    }



    
    static final class AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int netError;

        private AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams() {
            this(0);
        }

        public static AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams(elementsOrVersion);
                    {
                        
                    result.netError = decoder0.readInt(8);
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
            
            encoder0.encode(this.netError, 8);
        }
    }

    static class AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final AuthenticationAndCertificateObserver.OnSslCertificateErrorResponse mCallback;

        AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParamsForwardToCallback(AuthenticationAndCertificateObserver.OnSslCertificateErrorResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(ON_SSL_CERTIFICATE_ERROR_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams response = AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.netError);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParamsProxyToResponder implements AuthenticationAndCertificateObserver.OnSslCertificateErrorResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer netError) {
            AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams _response = new AuthenticationAndCertificateObserverOnSslCertificateErrorResponseParams();

            _response.netError = netError;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ON_SSL_CERTIFICATE_ERROR_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class AuthenticationAndCertificateObserverOnCertificateRequestedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.UnguessableToken windowId;
        public SslCertRequestInfo certInfo;
        public ClientCertificateResponder certResponder;

        private AuthenticationAndCertificateObserverOnCertificateRequestedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AuthenticationAndCertificateObserverOnCertificateRequestedParams() {
            this(0);
        }

        public static AuthenticationAndCertificateObserverOnCertificateRequestedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AuthenticationAndCertificateObserverOnCertificateRequestedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AuthenticationAndCertificateObserverOnCertificateRequestedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AuthenticationAndCertificateObserverOnCertificateRequestedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AuthenticationAndCertificateObserverOnCertificateRequestedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.windowId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.certInfo = SslCertRequestInfo.decode(decoder1);
                    }
                    {
                        
                    result.certResponder = decoder0.readServiceInterface(24, false, ClientCertificateResponder.MANAGER);
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
            
            encoder0.encode(this.windowId, 8, true);
            
            encoder0.encode(this.certInfo, 16, false);
            
            encoder0.encode(this.certResponder, 24, false, ClientCertificateResponder.MANAGER);
        }
    }



    
    static final class AuthenticationAndCertificateObserverOnAuthRequiredParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 56;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.UnguessableToken windowId;
        public int requestId;
        public org.chromium.url.mojom.Url url;
        public boolean firstAuthAttempt;
        public AuthChallengeInfo authInfo;
        public HttpResponseHeaders headHeaders;
        public AuthChallengeResponder authChallengeResponder;

        private AuthenticationAndCertificateObserverOnAuthRequiredParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AuthenticationAndCertificateObserverOnAuthRequiredParams() {
            this(0);
        }

        public static AuthenticationAndCertificateObserverOnAuthRequiredParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AuthenticationAndCertificateObserverOnAuthRequiredParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AuthenticationAndCertificateObserverOnAuthRequiredParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AuthenticationAndCertificateObserverOnAuthRequiredParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AuthenticationAndCertificateObserverOnAuthRequiredParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.windowId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                    }
                    {
                        
                    result.requestId = decoder0.readInt(16);
                    }
                    {
                        
                    result.firstAuthAttempt = decoder0.readBoolean(20, 0);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                    result.authInfo = AuthChallengeInfo.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                    result.headHeaders = HttpResponseHeaders.decode(decoder1);
                    }
                    {
                        
                    result.authChallengeResponder = decoder0.readServiceInterface(48, false, AuthChallengeResponder.MANAGER);
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
            
            encoder0.encode(this.windowId, 8, true);
            
            encoder0.encode(this.requestId, 16);
            
            encoder0.encode(this.firstAuthAttempt, 20, 0);
            
            encoder0.encode(this.url, 24, false);
            
            encoder0.encode(this.authInfo, 32, false);
            
            encoder0.encode(this.headHeaders, 40, true);
            
            encoder0.encode(this.authChallengeResponder, 48, false, AuthChallengeResponder.MANAGER);
        }
    }



    
    static final class AuthenticationAndCertificateObserverCloneParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<AuthenticationAndCertificateObserver> listener;

        private AuthenticationAndCertificateObserverCloneParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AuthenticationAndCertificateObserverCloneParams() {
            this(0);
        }

        public static AuthenticationAndCertificateObserverCloneParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AuthenticationAndCertificateObserverCloneParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AuthenticationAndCertificateObserverCloneParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AuthenticationAndCertificateObserverCloneParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AuthenticationAndCertificateObserverCloneParams(elementsOrVersion);
                    {
                        
                    result.listener = decoder0.readInterfaceRequest(8, false);
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
            
            encoder0.encode(this.listener, 8, false);
        }
    }



}
