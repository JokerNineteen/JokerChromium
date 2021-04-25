package org.chromium.components.feature_engagement.internal;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TrackerImplJni implements TrackerImpl.Natives {
  private static TrackerImpl.Natives testInstance;

  public static final JniStaticTestMocker<TrackerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.feature_engagement.internal.TrackerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.feature_engagement.internal.TrackerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyEvent(long nativeTrackerImplAndroid, TrackerImpl caller, String event) {
    GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_notifyEvent(nativeTrackerImplAndroid, caller, event);
  }

  @Override
  public boolean shouldTriggerHelpUI(long nativeTrackerImplAndroid, TrackerImpl caller,
      String feature) {
    return (boolean)GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_shouldTriggerHelpUI(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public boolean wouldTriggerHelpUI(long nativeTrackerImplAndroid, TrackerImpl caller,
      String feature) {
    return (boolean)GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_wouldTriggerHelpUI(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public boolean hasEverTriggered(long nativeTrackerImplAndroid, TrackerImpl caller, String feature,
      boolean fromWindow) {
    return (boolean)GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_hasEverTriggered(nativeTrackerImplAndroid, caller, feature, fromWindow);
  }

  @Override
  public int getTriggerState(long nativeTrackerImplAndroid, TrackerImpl caller, String feature) {
    return (int)GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_getTriggerState(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public void dismissed(long nativeTrackerImplAndroid, TrackerImpl caller, String feature) {
    GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_dismissed(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public TrackerImpl.DisplayLockHandleAndroid acquireDisplayLock(long nativeTrackerImplAndroid,
      TrackerImpl caller) {
    return (TrackerImpl.DisplayLockHandleAndroid)GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_acquireDisplayLock(nativeTrackerImplAndroid, caller);
  }

  @Override
  public boolean isInitialized(long nativeTrackerImplAndroid, TrackerImpl caller) {
    return (boolean)GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_isInitialized(nativeTrackerImplAndroid, caller);
  }

  @Override
  public void addOnInitializedCallback(long nativeTrackerImplAndroid, TrackerImpl caller,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_addOnInitializedCallback(nativeTrackerImplAndroid, caller, callback);
  }

  @Override
  public void release(long nativeDisplayLockHandleAndroid) {
    GEN_JNI.org_chromium_components_feature_1engagement_internal_TrackerImpl_release(nativeDisplayLockHandleAndroid);
  }

  public static TrackerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.feature_engagement.internal.TrackerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrackerImplJni();
  }
}
