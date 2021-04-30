package org.chromium.net.impl;

import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetUrlRequestJni implements CronetUrlRequest.Natives {
  private static CronetUrlRequest.Natives testInstance;

  public static final JniStaticTestMocker<CronetUrlRequest.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetUrlRequest.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.impl.CronetUrlRequest.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createRequestAdapter(CronetUrlRequest caller, long urlRequestContextAdapter,
      String url, int priority, boolean disableCache, boolean disableConnectionMigration,
      boolean enableMetrics, boolean trafficStatsTagSet, int trafficStatsTag,
      boolean trafficStatsUidSet, int trafficStatsUid, int idempotency) {
    return (long)GEN_JNI.org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(caller, urlRequestContextAdapter, url, priority, disableCache, disableConnectionMigration, enableMetrics, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, idempotency);
  }

  @Override
  public boolean setHttpMethod(long nativePtr, CronetUrlRequest caller, String method) {
    return (boolean)GEN_JNI.org_chromium_net_impl_CronetUrlRequest_setHttpMethod(nativePtr, caller, method);
  }

  @Override
  public boolean addRequestHeader(long nativePtr, CronetUrlRequest caller, String name,
      String value) {
    return (boolean)GEN_JNI.org_chromium_net_impl_CronetUrlRequest_addRequestHeader(nativePtr, caller, name, value);
  }

  @Override
  public void start(long nativePtr, CronetUrlRequest caller) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequest_start(nativePtr, caller);
  }

  @Override
  public void followDeferredRedirect(long nativePtr, CronetUrlRequest caller) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(nativePtr, caller);
  }

  @Override
  public boolean readData(long nativePtr, CronetUrlRequest caller, ByteBuffer byteBuffer,
      int position, int capacity) {
    return (boolean)GEN_JNI.org_chromium_net_impl_CronetUrlRequest_readData(nativePtr, caller, byteBuffer, position, capacity);
  }

  @Override
  public void destroy(long nativePtr, CronetUrlRequest caller, boolean sendOnCanceled) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequest_destroy(nativePtr, caller, sendOnCanceled);
  }

  @Override
  public void getStatus(long nativePtr, CronetUrlRequest caller,
      VersionSafeCallbacks.UrlRequestStatusListener listener) {
    GEN_JNI.org_chromium_net_impl_CronetUrlRequest_getStatus(nativePtr, caller, listener);
  }

  public static CronetUrlRequest.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUrlRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CronetUrlRequestJni();
  }
}
