package org.chromium.chrome.browser.feature_engagement;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.feature_engagement.Tracker;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TrackerFactoryJni implements TrackerFactory.Natives {
  private static TrackerFactory.Natives testInstance;

  public static final JniStaticTestMocker<TrackerFactory.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feature_engagement.TrackerFactory.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feature_engagement.TrackerFactory.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public Tracker getTrackerForProfile(Profile profile) {
    return (Tracker)GEN_JNI.org_chromium_chrome_browser_feature_1engagement_TrackerFactory_getTrackerForProfile(profile);
  }

  @Override
  public void setTestingFactory(Profile profile, Tracker testTracker) {
    GEN_JNI.org_chromium_chrome_browser_feature_1engagement_TrackerFactory_setTestingFactory(profile, testTracker);
  }

  public static TrackerFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feature_engagement.TrackerFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrackerFactoryJni();
  }
}
