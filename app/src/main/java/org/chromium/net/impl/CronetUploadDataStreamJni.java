package org.chromium.net.impl;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetUploadDataStreamJni implements CronetUploadDataStream.Natives {
  private static CronetUploadDataStream.Natives testInstance;

  public static final JniStaticTestMocker<CronetUploadDataStream.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetUploadDataStream.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.impl.CronetUploadDataStream.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long attachUploadDataToRequest(CronetUploadDataStream caller, long urlRequestAdapter,
      long length) {
    return (long)GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(caller, urlRequestAdapter, length);
  }

  @Override
  public long createAdapterForTesting(CronetUploadDataStream caller) {
    return (long)GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(caller);
  }

  @Override
  public long createUploadDataStreamForTesting(CronetUploadDataStream caller, long length,
      long adapter) {
    return (long)GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(caller, length, adapter);
  }

  @Override
  public void onReadSucceeded(long nativePtr, CronetUploadDataStream caller, int bytesRead,
      boolean finalChunk) {
    GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(nativePtr, caller, bytesRead, finalChunk);
  }

  @Override
  public void onRewindSucceeded(long nativePtr, CronetUploadDataStream caller) {
    GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(nativePtr, caller);
  }

  @Override
  public void destroy(long nativePtr) {
    GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_destroy(nativePtr);
  }

  public static CronetUploadDataStream.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUploadDataStream.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CronetUploadDataStreamJni();
  }
}
