package org.chromium.net.impl;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetUrlRequestContextJni implements CronetUrlRequestContext.Natives {
  private static CronetUrlRequestContext.Natives testInstance;

  public static final JniStaticTestMocker<CronetUrlRequestContext.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetUrlRequestContext.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.net.impl.CronetUrlRequestContext.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createRequestContextConfig(String userAgent, String storagePath, boolean quicEnabled,
      String quicUserAgentId, boolean http2Enabled, boolean brotliEnabled, boolean disableCache,
      int httpCacheMode, long httpCacheMaxSize, String experimentalOptions, long mockCertVerifier,
      boolean enableNetworkQualityEstimator, boolean bypassPublicKeyPinningForLocalTrustAnchors,
      int networkThreadPriority) {
    return (long)GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(userAgent, storagePath, quicEnabled, quicUserAgentId, http2Enabled, brotliEnabled, disableCache, httpCacheMode, httpCacheMaxSize, experimentalOptions, mockCertVerifier, enableNetworkQualityEstimator, bypassPublicKeyPinningForLocalTrustAnchors, networkThreadPriority);
  }

  @Override
  public void addQuicHint(long urlRequestContextConfig, String host, int port, int alternatePort) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(urlRequestContextConfig, host, port, alternatePort);
  }

  @Override
  public void addPkp(long urlRequestContextConfig, String host, byte[][] hashes,
      boolean includeSubdomains, long expirationTime) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addPkp(urlRequestContextConfig, host, hashes, includeSubdomains, expirationTime);
  }

  @Override
  public long createRequestContextAdapter(long urlRequestContextConfig) {
    return (long)GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(urlRequestContextConfig);
  }

  @Override
  public int setMinLogLevel(int loggingLevel) {
    return (int)GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_setMinLogLevel(loggingLevel);
  }

  @Override
  public byte[] getHistogramDeltas() {
    return (byte[])GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_getHistogramDeltas();
  }

  @Override
  public void destroy(long nativePtr, CronetUrlRequestContext caller) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_destroy(nativePtr, caller);
  }

  @Override
  public boolean startNetLogToFile(long nativePtr, CronetUrlRequestContext caller, String fileName,
      boolean logAll) {
    return (boolean)GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(nativePtr, caller, fileName, logAll);
  }

  @Override
  public void startNetLogToDisk(long nativePtr, CronetUrlRequestContext caller, String dirPath,
      boolean logAll, int maxSize) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(nativePtr, caller, dirPath, logAll, maxSize);
  }

  @Override
  public void stopNetLog(long nativePtr, CronetUrlRequestContext caller) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(nativePtr, caller);
  }

  @Override
  public void initRequestContextOnInitThread(long nativePtr, CronetUrlRequestContext caller) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(nativePtr, caller);
  }

  @Override
  public void configureNetworkQualityEstimatorForTesting(long nativePtr,
      CronetUrlRequestContext caller, boolean useLocalHostRequests, boolean useSmallerResponses,
      boolean disableOfflineCheck) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(nativePtr, caller, useLocalHostRequests, useSmallerResponses, disableOfflineCheck);
  }

  @Override
  public void provideRTTObservations(long nativePtr, CronetUrlRequestContext caller,
      boolean should) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(nativePtr, caller, should);
  }

  @Override
  public void provideThroughputObservations(long nativePtr, CronetUrlRequestContext caller,
      boolean should) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(nativePtr, caller, should);
  }

  public static CronetUrlRequestContext.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUrlRequestContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CronetUrlRequestContextJni();
  }
}
