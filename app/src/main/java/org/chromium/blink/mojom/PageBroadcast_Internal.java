// PageBroadcast_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page/page.mojom
//

package org.chromium.blink.mojom;


class PageBroadcast_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<PageBroadcast, PageBroadcast.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<PageBroadcast, PageBroadcast.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.PageBroadcast";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, PageBroadcast impl) {
            return new Stub(core, impl);
        }

        @Override
        public PageBroadcast[] buildArray(int size) {
          return new PageBroadcast[size];
        }
    };


    private static final int SET_PAGE_LIFECYCLE_STATE_ORDINAL = 0;

    private static final int AUDIO_STATE_CHANGED_ORDINAL = 1;

    private static final int SET_INSIDE_PORTAL_ORDINAL = 2;

    private static final int UPDATE_WEB_PREFERENCES_ORDINAL = 3;

    private static final int UPDATE_RENDERER_PREFERENCES_ORDINAL = 4;

    private static final int SET_HISTORY_OFFSET_AND_LENGTH_ORDINAL = 5;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements PageBroadcast.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void setPageLifecycleState(
PageLifecycleState state, PageRestoreParams pageRestoreParams, 
SetPageLifecycleStateResponse callback) {

            PageBroadcastSetPageLifecycleStateParams _message = new PageBroadcastSetPageLifecycleStateParams();

            _message.state = state;

            _message.pageRestoreParams = pageRestoreParams;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    SET_PAGE_LIFECYCLE_STATE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new PageBroadcastSetPageLifecycleStateResponseParamsForwardToCallback(callback));

        }


        @Override
        public void audioStateChanged(
boolean isAudioPlaying) {

            PageBroadcastAudioStateChangedParams _message = new PageBroadcastAudioStateChangedParams();

            _message.isAudioPlaying = isAudioPlaying;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(AUDIO_STATE_CHANGED_ORDINAL)));

        }


        @Override
        public void setInsidePortal(
boolean isInsidePortal) {

            PageBroadcastSetInsidePortalParams _message = new PageBroadcastSetInsidePortalParams();

            _message.isInsidePortal = isInsidePortal;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_INSIDE_PORTAL_ORDINAL)));

        }


        @Override
        public void updateWebPreferences(
WebPreferences preferences) {

            PageBroadcastUpdateWebPreferencesParams _message = new PageBroadcastUpdateWebPreferencesParams();

            _message.preferences = preferences;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(UPDATE_WEB_PREFERENCES_ORDINAL)));

        }


        @Override
        public void updateRendererPreferences(
RendererPreferences preferences) {

            PageBroadcastUpdateRendererPreferencesParams _message = new PageBroadcastUpdateRendererPreferencesParams();

            _message.preferences = preferences;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(UPDATE_RENDERER_PREFERENCES_ORDINAL)));

        }


        @Override
        public void setHistoryOffsetAndLength(
int offset, int length) {

            PageBroadcastSetHistoryOffsetAndLengthParams _message = new PageBroadcastSetHistoryOffsetAndLengthParams();

            _message.offset = offset;

            _message.length = length;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_HISTORY_OFFSET_AND_LENGTH_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<PageBroadcast> {

        Stub(org.chromium.mojo.system.Core core, PageBroadcast impl) {
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
                                PageBroadcast_Internal.MANAGER, messageWithHeader);







                    case AUDIO_STATE_CHANGED_ORDINAL: {

                        PageBroadcastAudioStateChangedParams data =
                                PageBroadcastAudioStateChangedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().audioStateChanged(data.isAudioPlaying);
                        return true;
                    }





                    case SET_INSIDE_PORTAL_ORDINAL: {

                        PageBroadcastSetInsidePortalParams data =
                                PageBroadcastSetInsidePortalParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setInsidePortal(data.isInsidePortal);
                        return true;
                    }





                    case UPDATE_WEB_PREFERENCES_ORDINAL: {

                        PageBroadcastUpdateWebPreferencesParams data =
                                PageBroadcastUpdateWebPreferencesParams.deserialize(messageWithHeader.getPayload());

                        getImpl().updateWebPreferences(data.preferences);
                        return true;
                    }





                    case UPDATE_RENDERER_PREFERENCES_ORDINAL: {

                        PageBroadcastUpdateRendererPreferencesParams data =
                                PageBroadcastUpdateRendererPreferencesParams.deserialize(messageWithHeader.getPayload());

                        getImpl().updateRendererPreferences(data.preferences);
                        return true;
                    }





                    case SET_HISTORY_OFFSET_AND_LENGTH_ORDINAL: {

                        PageBroadcastSetHistoryOffsetAndLengthParams data =
                                PageBroadcastSetHistoryOffsetAndLengthParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setHistoryOffsetAndLength(data.offset, data.length);
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
                                getCore(), PageBroadcast_Internal.MANAGER, messageWithHeader, receiver);







                    case SET_PAGE_LIFECYCLE_STATE_ORDINAL: {

                        PageBroadcastSetPageLifecycleStateParams data =
                                PageBroadcastSetPageLifecycleStateParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setPageLifecycleState(data.state, data.pageRestoreParams, new PageBroadcastSetPageLifecycleStateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class PageBroadcastSetPageLifecycleStateParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public PageLifecycleState state;
        public PageRestoreParams pageRestoreParams;

        private PageBroadcastSetPageLifecycleStateParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PageBroadcastSetPageLifecycleStateParams() {
            this(0);
        }

        public static PageBroadcastSetPageLifecycleStateParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PageBroadcastSetPageLifecycleStateParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PageBroadcastSetPageLifecycleStateParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PageBroadcastSetPageLifecycleStateParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PageBroadcastSetPageLifecycleStateParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.state = PageLifecycleState.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.pageRestoreParams = PageRestoreParams.decode(decoder1);
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
            
            encoder0.encode(this.state, 8, false);
            
            encoder0.encode(this.pageRestoreParams, 16, true);
        }
    }



    
    static final class PageBroadcastSetPageLifecycleStateResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private PageBroadcastSetPageLifecycleStateResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PageBroadcastSetPageLifecycleStateResponseParams() {
            this(0);
        }

        public static PageBroadcastSetPageLifecycleStateResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PageBroadcastSetPageLifecycleStateResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PageBroadcastSetPageLifecycleStateResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PageBroadcastSetPageLifecycleStateResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PageBroadcastSetPageLifecycleStateResponseParams(elementsOrVersion);

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

    static class PageBroadcastSetPageLifecycleStateResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final PageBroadcast.SetPageLifecycleStateResponse mCallback;

        PageBroadcastSetPageLifecycleStateResponseParamsForwardToCallback(PageBroadcast.SetPageLifecycleStateResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(SET_PAGE_LIFECYCLE_STATE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                mCallback.call();
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class PageBroadcastSetPageLifecycleStateResponseParamsProxyToResponder implements PageBroadcast.SetPageLifecycleStateResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PageBroadcastSetPageLifecycleStateResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call() {
            PageBroadcastSetPageLifecycleStateResponseParams _response = new PageBroadcastSetPageLifecycleStateResponseParams();

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    SET_PAGE_LIFECYCLE_STATE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class PageBroadcastAudioStateChangedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean isAudioPlaying;

        private PageBroadcastAudioStateChangedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PageBroadcastAudioStateChangedParams() {
            this(0);
        }

        public static PageBroadcastAudioStateChangedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PageBroadcastAudioStateChangedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PageBroadcastAudioStateChangedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PageBroadcastAudioStateChangedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PageBroadcastAudioStateChangedParams(elementsOrVersion);
                    {
                        
                    result.isAudioPlaying = decoder0.readBoolean(8, 0);
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
            
            encoder0.encode(this.isAudioPlaying, 8, 0);
        }
    }



    
    static final class PageBroadcastSetInsidePortalParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean isInsidePortal;

        private PageBroadcastSetInsidePortalParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PageBroadcastSetInsidePortalParams() {
            this(0);
        }

        public static PageBroadcastSetInsidePortalParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PageBroadcastSetInsidePortalParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PageBroadcastSetInsidePortalParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PageBroadcastSetInsidePortalParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PageBroadcastSetInsidePortalParams(elementsOrVersion);
                    {
                        
                    result.isInsidePortal = decoder0.readBoolean(8, 0);
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
            
            encoder0.encode(this.isInsidePortal, 8, 0);
        }
    }



    
    static final class PageBroadcastUpdateWebPreferencesParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public WebPreferences preferences;

        private PageBroadcastUpdateWebPreferencesParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PageBroadcastUpdateWebPreferencesParams() {
            this(0);
        }

        public static PageBroadcastUpdateWebPreferencesParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PageBroadcastUpdateWebPreferencesParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PageBroadcastUpdateWebPreferencesParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PageBroadcastUpdateWebPreferencesParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PageBroadcastUpdateWebPreferencesParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.preferences = WebPreferences.decode(decoder1);
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
            
            encoder0.encode(this.preferences, 8, false);
        }
    }



    
    static final class PageBroadcastUpdateRendererPreferencesParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public RendererPreferences preferences;

        private PageBroadcastUpdateRendererPreferencesParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PageBroadcastUpdateRendererPreferencesParams() {
            this(0);
        }

        public static PageBroadcastUpdateRendererPreferencesParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PageBroadcastUpdateRendererPreferencesParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PageBroadcastUpdateRendererPreferencesParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PageBroadcastUpdateRendererPreferencesParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PageBroadcastUpdateRendererPreferencesParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.preferences = RendererPreferences.decode(decoder1);
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
            
            encoder0.encode(this.preferences, 8, false);
        }
    }



    
    static final class PageBroadcastSetHistoryOffsetAndLengthParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int offset;
        public int length;

        private PageBroadcastSetHistoryOffsetAndLengthParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PageBroadcastSetHistoryOffsetAndLengthParams() {
            this(0);
        }

        public static PageBroadcastSetHistoryOffsetAndLengthParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PageBroadcastSetHistoryOffsetAndLengthParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PageBroadcastSetHistoryOffsetAndLengthParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PageBroadcastSetHistoryOffsetAndLengthParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PageBroadcastSetHistoryOffsetAndLengthParams(elementsOrVersion);
                    {
                        
                    result.offset = decoder0.readInt(8);
                    }
                    {
                        
                    result.length = decoder0.readInt(12);
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
            
            encoder0.encode(this.offset, 8);
            
            encoder0.encode(this.length, 12);
        }
    }



}
