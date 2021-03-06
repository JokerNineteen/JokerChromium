// UrlRequest.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_loader.mojom
//

package org.chromium.network.mojom;


public final class UrlRequest extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 208;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(208, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String method;
    public org.chromium.url.mojom.Url url;
    public SiteForCookies siteForCookies;
    public boolean updateFirstPartyUrlOnRedirect;
    public org.chromium.url.internal.mojom.Origin requestInitiator;
    public org.chromium.url.internal.mojom.Origin isolatedWorldOrigin;
    public org.chromium.url.mojom.Url referrer;
    public int referrerPolicy;
    public HttpRequestHeaders headers;
    public HttpRequestHeaders corsExemptHeaders;
    public int loadFlags;
    public int resourceType;
    public int priority;
    public boolean shouldResetAppcache;
    public boolean isExternalRequest;
    public int corsPreflightPolicy;
    public boolean originatedFromServiceWorker;
    public boolean skipServiceWorker;
    public boolean corbDetachable;
    public int mode;
    public int credentialsMode;
    public int redirectMode;
    public String fetchIntegrity;
    public int destination;
    public UrlRequestBody requestBody;
    public boolean keepalive;
    public boolean hasUserGesture;
    public boolean enableLoadTiming;
    public boolean enableUploadProgress;
    public boolean doNotPromptForLogin;
    public int renderFrameId;
    public boolean isMainFrame;
    public int transitionType;
    public boolean reportRawHeaders;
    public int previewsState;
    public boolean upgradeIfInsecure;
    public boolean isRevalidating;
    public org.chromium.mojo_base.mojom.UnguessableToken throttlingProfileId;
    public org.chromium.mojo_base.mojom.UnguessableToken fetchWindowId;
    public String devtoolsRequestId;
    public String devtoolsStackId;
    public boolean isSignedExchangePrefetchCacheEnabled;
    public boolean isFetchLikeApi;
    public boolean isFavicon;
    public boolean obeyOriginPolicy;
    public TrustedUrlRequestParams trustedParams;
    public org.chromium.mojo_base.mojom.UnguessableToken recursivePrefetchToken;
    public TrustTokenParams trustTokenParams;
    public WebBundleTokenParams webBundleTokenParams;

    private UrlRequest(int version) {
        super(STRUCT_SIZE, version);
        this.corbDetachable = (boolean) false;
    }

    public UrlRequest() {
        this(0);
    }

    public static UrlRequest deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static UrlRequest deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static UrlRequest decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        UrlRequest result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new UrlRequest(elementsOrVersion);
                {
                    
                result.method = decoder0.readString(8, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.siteForCookies = SiteForCookies.decode(decoder1);
                }
                {
                    
                result.updateFirstPartyUrlOnRedirect = decoder0.readBoolean(32, 0);
                }
                {
                    
                result.shouldResetAppcache = decoder0.readBoolean(32, 1);
                }
                {
                    
                result.isExternalRequest = decoder0.readBoolean(32, 2);
                }
                {
                    
                result.originatedFromServiceWorker = decoder0.readBoolean(32, 3);
                }
                {
                    
                result.skipServiceWorker = decoder0.readBoolean(32, 4);
                }
                {
                    
                result.corbDetachable = decoder0.readBoolean(32, 5);
                }
                {
                    
                result.keepalive = decoder0.readBoolean(32, 6);
                }
                {
                    
                result.hasUserGesture = decoder0.readBoolean(32, 7);
                }
                {
                    
                result.enableLoadTiming = decoder0.readBoolean(33, 0);
                }
                {
                    
                result.enableUploadProgress = decoder0.readBoolean(33, 1);
                }
                {
                    
                result.doNotPromptForLogin = decoder0.readBoolean(33, 2);
                }
                {
                    
                result.isMainFrame = decoder0.readBoolean(33, 3);
                }
                {
                    
                result.reportRawHeaders = decoder0.readBoolean(33, 4);
                }
                {
                    
                result.upgradeIfInsecure = decoder0.readBoolean(33, 5);
                }
                {
                    
                result.isRevalidating = decoder0.readBoolean(33, 6);
                }
                {
                    
                result.isSignedExchangePrefetchCacheEnabled = decoder0.readBoolean(33, 7);
                }
                {
                    
                result.isFetchLikeApi = decoder0.readBoolean(34, 0);
                }
                {
                    
                result.isFavicon = decoder0.readBoolean(34, 1);
                }
                {
                    
                result.obeyOriginPolicy = decoder0.readBoolean(34, 2);
                }
                {
                    
                result.referrerPolicy = decoder0.readInt(36);
                    UrlRequestReferrerPolicy.validate(result.referrerPolicy);
                    result.referrerPolicy = UrlRequestReferrerPolicy.toKnownValue(result.referrerPolicy);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                result.requestInitiator = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.isolatedWorldOrigin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.referrer = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                result.headers = HttpRequestHeaders.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, false);
                result.corsExemptHeaders = HttpRequestHeaders.decode(decoder1);
                }
                {
                    
                result.loadFlags = decoder0.readInt(80);
                }
                {
                    
                result.resourceType = decoder0.readInt(84);
                }
                {
                    
                result.priority = decoder0.readInt(88);
                    RequestPriority.validate(result.priority);
                    result.priority = RequestPriority.toKnownValue(result.priority);
                }
                {
                    
                result.corsPreflightPolicy = decoder0.readInt(92);
                    CorsPreflightPolicy.validate(result.corsPreflightPolicy);
                    result.corsPreflightPolicy = CorsPreflightPolicy.toKnownValue(result.corsPreflightPolicy);
                }
                {
                    
                result.mode = decoder0.readInt(96);
                    RequestMode.validate(result.mode);
                    result.mode = RequestMode.toKnownValue(result.mode);
                }
                {
                    
                result.credentialsMode = decoder0.readInt(100);
                    CredentialsMode.validate(result.credentialsMode);
                    result.credentialsMode = CredentialsMode.toKnownValue(result.credentialsMode);
                }
                {
                    
                result.redirectMode = decoder0.readInt(104);
                    RedirectMode.validate(result.redirectMode);
                    result.redirectMode = RedirectMode.toKnownValue(result.redirectMode);
                }
                {
                    
                result.destination = decoder0.readInt(108);
                    RequestDestination.validate(result.destination);
                    result.destination = RequestDestination.toKnownValue(result.destination);
                }
                {
                    
                result.fetchIntegrity = decoder0.readString(112, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(120, true);
                result.requestBody = UrlRequestBody.decode(decoder1);
                }
                {
                    
                result.renderFrameId = decoder0.readInt(128);
                }
                {
                    
                result.transitionType = decoder0.readInt(132);
                }
                {
                    
                result.previewsState = decoder0.readInt(136);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(144, true);
                result.throttlingProfileId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(152, true);
                result.fetchWindowId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                result.devtoolsRequestId = decoder0.readString(160, true);
                }
                {
                    
                result.devtoolsStackId = decoder0.readString(168, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(176, true);
                result.trustedParams = TrustedUrlRequestParams.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(184, true);
                result.recursivePrefetchToken = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(192, true);
                result.trustTokenParams = TrustTokenParams.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(200, true);
                result.webBundleTokenParams = WebBundleTokenParams.decode(decoder1);
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
        
        encoder0.encode(this.method, 8, false);
        
        encoder0.encode(this.url, 16, false);
        
        encoder0.encode(this.siteForCookies, 24, false);
        
        encoder0.encode(this.updateFirstPartyUrlOnRedirect, 32, 0);
        
        encoder0.encode(this.shouldResetAppcache, 32, 1);
        
        encoder0.encode(this.isExternalRequest, 32, 2);
        
        encoder0.encode(this.originatedFromServiceWorker, 32, 3);
        
        encoder0.encode(this.skipServiceWorker, 32, 4);
        
        encoder0.encode(this.corbDetachable, 32, 5);
        
        encoder0.encode(this.keepalive, 32, 6);
        
        encoder0.encode(this.hasUserGesture, 32, 7);
        
        encoder0.encode(this.enableLoadTiming, 33, 0);
        
        encoder0.encode(this.enableUploadProgress, 33, 1);
        
        encoder0.encode(this.doNotPromptForLogin, 33, 2);
        
        encoder0.encode(this.isMainFrame, 33, 3);
        
        encoder0.encode(this.reportRawHeaders, 33, 4);
        
        encoder0.encode(this.upgradeIfInsecure, 33, 5);
        
        encoder0.encode(this.isRevalidating, 33, 6);
        
        encoder0.encode(this.isSignedExchangePrefetchCacheEnabled, 33, 7);
        
        encoder0.encode(this.isFetchLikeApi, 34, 0);
        
        encoder0.encode(this.isFavicon, 34, 1);
        
        encoder0.encode(this.obeyOriginPolicy, 34, 2);
        
        encoder0.encode(this.referrerPolicy, 36);
        
        encoder0.encode(this.requestInitiator, 40, true);
        
        encoder0.encode(this.isolatedWorldOrigin, 48, true);
        
        encoder0.encode(this.referrer, 56, false);
        
        encoder0.encode(this.headers, 64, false);
        
        encoder0.encode(this.corsExemptHeaders, 72, false);
        
        encoder0.encode(this.loadFlags, 80);
        
        encoder0.encode(this.resourceType, 84);
        
        encoder0.encode(this.priority, 88);
        
        encoder0.encode(this.corsPreflightPolicy, 92);
        
        encoder0.encode(this.mode, 96);
        
        encoder0.encode(this.credentialsMode, 100);
        
        encoder0.encode(this.redirectMode, 104);
        
        encoder0.encode(this.destination, 108);
        
        encoder0.encode(this.fetchIntegrity, 112, false);
        
        encoder0.encode(this.requestBody, 120, true);
        
        encoder0.encode(this.renderFrameId, 128);
        
        encoder0.encode(this.transitionType, 132);
        
        encoder0.encode(this.previewsState, 136);
        
        encoder0.encode(this.throttlingProfileId, 144, true);
        
        encoder0.encode(this.fetchWindowId, 152, true);
        
        encoder0.encode(this.devtoolsRequestId, 160, true);
        
        encoder0.encode(this.devtoolsStackId, 168, true);
        
        encoder0.encode(this.trustedParams, 176, true);
        
        encoder0.encode(this.recursivePrefetchToken, 184, true);
        
        encoder0.encode(this.trustTokenParams, 192, true);
        
        encoder0.encode(this.webBundleTokenParams, 200, true);
    }
}