// OneShotBackgroundSyncService_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/background_sync/background_sync.mojom
//

package org.chromium.blink.mojom;


class OneShotBackgroundSyncService_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<OneShotBackgroundSyncService, OneShotBackgroundSyncService.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<OneShotBackgroundSyncService, OneShotBackgroundSyncService.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.OneShotBackgroundSyncService";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, OneShotBackgroundSyncService impl) {
            return new Stub(core, impl);
        }

        @Override
        public OneShotBackgroundSyncService[] buildArray(int size) {
          return new OneShotBackgroundSyncService[size];
        }
    };


    private static final int REGISTER_ORDINAL = 0;

    private static final int DID_RESOLVE_REGISTRATION_ORDINAL = 1;

    private static final int GET_REGISTRATIONS_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements OneShotBackgroundSyncService.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void register(
SyncRegistrationOptions options, long serviceWorkerRegistrationId, 
RegisterResponse callback) {

            OneShotBackgroundSyncServiceRegisterParams _message = new OneShotBackgroundSyncServiceRegisterParams();

            _message.options = options;

            _message.serviceWorkerRegistrationId = serviceWorkerRegistrationId;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REGISTER_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new OneShotBackgroundSyncServiceRegisterResponseParamsForwardToCallback(callback));

        }


        @Override
        public void didResolveRegistration(
BackgroundSyncRegistrationInfo registrationInfo) {

            OneShotBackgroundSyncServiceDidResolveRegistrationParams _message = new OneShotBackgroundSyncServiceDidResolveRegistrationParams();

            _message.registrationInfo = registrationInfo;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(DID_RESOLVE_REGISTRATION_ORDINAL)));

        }


        @Override
        public void getRegistrations(
long serviceWorkerRegistrationId, 
GetRegistrationsResponse callback) {

            OneShotBackgroundSyncServiceGetRegistrationsParams _message = new OneShotBackgroundSyncServiceGetRegistrationsParams();

            _message.serviceWorkerRegistrationId = serviceWorkerRegistrationId;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_REGISTRATIONS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new OneShotBackgroundSyncServiceGetRegistrationsResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<OneShotBackgroundSyncService> {

        Stub(org.chromium.mojo.system.Core core, OneShotBackgroundSyncService impl) {
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
                                OneShotBackgroundSyncService_Internal.MANAGER, messageWithHeader);







                    case DID_RESOLVE_REGISTRATION_ORDINAL: {

                        OneShotBackgroundSyncServiceDidResolveRegistrationParams data =
                                OneShotBackgroundSyncServiceDidResolveRegistrationParams.deserialize(messageWithHeader.getPayload());

                        getImpl().didResolveRegistration(data.registrationInfo);
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
                                getCore(), OneShotBackgroundSyncService_Internal.MANAGER, messageWithHeader, receiver);







                    case REGISTER_ORDINAL: {

                        OneShotBackgroundSyncServiceRegisterParams data =
                                OneShotBackgroundSyncServiceRegisterParams.deserialize(messageWithHeader.getPayload());

                        getImpl().register(data.options, data.serviceWorkerRegistrationId, new OneShotBackgroundSyncServiceRegisterResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }









                    case GET_REGISTRATIONS_ORDINAL: {

                        OneShotBackgroundSyncServiceGetRegistrationsParams data =
                                OneShotBackgroundSyncServiceGetRegistrationsParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getRegistrations(data.serviceWorkerRegistrationId, new OneShotBackgroundSyncServiceGetRegistrationsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class OneShotBackgroundSyncServiceRegisterParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public SyncRegistrationOptions options;
        public long serviceWorkerRegistrationId;

        private OneShotBackgroundSyncServiceRegisterParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public OneShotBackgroundSyncServiceRegisterParams() {
            this(0);
        }

        public static OneShotBackgroundSyncServiceRegisterParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static OneShotBackgroundSyncServiceRegisterParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static OneShotBackgroundSyncServiceRegisterParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            OneShotBackgroundSyncServiceRegisterParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new OneShotBackgroundSyncServiceRegisterParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.options = SyncRegistrationOptions.decode(decoder1);
                    }
                    {
                        
                    result.serviceWorkerRegistrationId = decoder0.readLong(16);
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
            
            encoder0.encode(this.options, 8, false);
            
            encoder0.encode(this.serviceWorkerRegistrationId, 16);
        }
    }



    
    static final class OneShotBackgroundSyncServiceRegisterResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int err;
        public SyncRegistrationOptions options;

        private OneShotBackgroundSyncServiceRegisterResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public OneShotBackgroundSyncServiceRegisterResponseParams() {
            this(0);
        }

        public static OneShotBackgroundSyncServiceRegisterResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static OneShotBackgroundSyncServiceRegisterResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static OneShotBackgroundSyncServiceRegisterResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            OneShotBackgroundSyncServiceRegisterResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new OneShotBackgroundSyncServiceRegisterResponseParams(elementsOrVersion);
                    {
                        
                    result.err = decoder0.readInt(8);
                        BackgroundSyncError.validate(result.err);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.options = SyncRegistrationOptions.decode(decoder1);
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
            
            encoder0.encode(this.err, 8);
            
            encoder0.encode(this.options, 16, true);
        }
    }

    static class OneShotBackgroundSyncServiceRegisterResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final OneShotBackgroundSyncService.RegisterResponse mCallback;

        OneShotBackgroundSyncServiceRegisterResponseParamsForwardToCallback(OneShotBackgroundSyncService.RegisterResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(REGISTER_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                OneShotBackgroundSyncServiceRegisterResponseParams response = OneShotBackgroundSyncServiceRegisterResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.err, response.options);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class OneShotBackgroundSyncServiceRegisterResponseParamsProxyToResponder implements OneShotBackgroundSyncService.RegisterResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        OneShotBackgroundSyncServiceRegisterResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer err, SyncRegistrationOptions options) {
            OneShotBackgroundSyncServiceRegisterResponseParams _response = new OneShotBackgroundSyncServiceRegisterResponseParams();

            _response.err = err;

            _response.options = options;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REGISTER_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class OneShotBackgroundSyncServiceDidResolveRegistrationParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public BackgroundSyncRegistrationInfo registrationInfo;

        private OneShotBackgroundSyncServiceDidResolveRegistrationParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public OneShotBackgroundSyncServiceDidResolveRegistrationParams() {
            this(0);
        }

        public static OneShotBackgroundSyncServiceDidResolveRegistrationParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static OneShotBackgroundSyncServiceDidResolveRegistrationParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static OneShotBackgroundSyncServiceDidResolveRegistrationParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            OneShotBackgroundSyncServiceDidResolveRegistrationParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new OneShotBackgroundSyncServiceDidResolveRegistrationParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.registrationInfo = BackgroundSyncRegistrationInfo.decode(decoder1);
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
            
            encoder0.encode(this.registrationInfo, 8, false);
        }
    }



    
    static final class OneShotBackgroundSyncServiceGetRegistrationsParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public long serviceWorkerRegistrationId;

        private OneShotBackgroundSyncServiceGetRegistrationsParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public OneShotBackgroundSyncServiceGetRegistrationsParams() {
            this(0);
        }

        public static OneShotBackgroundSyncServiceGetRegistrationsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static OneShotBackgroundSyncServiceGetRegistrationsParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static OneShotBackgroundSyncServiceGetRegistrationsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            OneShotBackgroundSyncServiceGetRegistrationsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new OneShotBackgroundSyncServiceGetRegistrationsParams(elementsOrVersion);
                    {
                        
                    result.serviceWorkerRegistrationId = decoder0.readLong(8);
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
            
            encoder0.encode(this.serviceWorkerRegistrationId, 8);
        }
    }



    
    static final class OneShotBackgroundSyncServiceGetRegistrationsResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int err;
        public SyncRegistrationOptions[] registrations;

        private OneShotBackgroundSyncServiceGetRegistrationsResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public OneShotBackgroundSyncServiceGetRegistrationsResponseParams() {
            this(0);
        }

        public static OneShotBackgroundSyncServiceGetRegistrationsResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static OneShotBackgroundSyncServiceGetRegistrationsResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static OneShotBackgroundSyncServiceGetRegistrationsResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            OneShotBackgroundSyncServiceGetRegistrationsResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new OneShotBackgroundSyncServiceGetRegistrationsResponseParams(elementsOrVersion);
                    {
                        
                    result.err = decoder0.readInt(8);
                        BackgroundSyncError.validate(result.err);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.registrations = new SyncRegistrationOptions[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.registrations[i1] = SyncRegistrationOptions.decode(decoder2);
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
            
            encoder0.encode(this.err, 8);
            
            if (this.registrations == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.registrations.length, 16, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.registrations.length; ++i0) {
                    
                    encoder1.encode(this.registrations[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }

    static class OneShotBackgroundSyncServiceGetRegistrationsResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final OneShotBackgroundSyncService.GetRegistrationsResponse mCallback;

        OneShotBackgroundSyncServiceGetRegistrationsResponseParamsForwardToCallback(OneShotBackgroundSyncService.GetRegistrationsResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_REGISTRATIONS_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                OneShotBackgroundSyncServiceGetRegistrationsResponseParams response = OneShotBackgroundSyncServiceGetRegistrationsResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.err, response.registrations);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class OneShotBackgroundSyncServiceGetRegistrationsResponseParamsProxyToResponder implements OneShotBackgroundSyncService.GetRegistrationsResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        OneShotBackgroundSyncServiceGetRegistrationsResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer err, SyncRegistrationOptions[] registrations) {
            OneShotBackgroundSyncServiceGetRegistrationsResponseParams _response = new OneShotBackgroundSyncServiceGetRegistrationsResponseParams();

            _response.err = err;

            _response.registrations = registrations;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_REGISTRATIONS_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}