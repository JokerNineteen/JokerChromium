package org.chromium.chrome.browser.usage_stats;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UsageStatsBridgeJni implements UsageStatsBridge.Natives {
  private static UsageStatsBridge.Natives testInstance;

  public static final JniStaticTestMocker<UsageStatsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.usage_stats.UsageStatsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.usage_stats.UsageStatsBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(UsageStatsBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeUsageStatsBridge, UsageStatsBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_destroy(nativeUsageStatsBridge, caller);
  }

  @Override
  public void getAllEvents(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<List<WebsiteEventProtos.WebsiteEvent>> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_getAllEvents(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void queryEventsInRange(long nativeUsageStatsBridge, UsageStatsBridge caller, long start,
      long end, Callback<List<WebsiteEventProtos.WebsiteEvent>> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_queryEventsInRange(nativeUsageStatsBridge, caller, start, end, callback);
  }

  @Override
  public void addEvents(long nativeUsageStatsBridge, UsageStatsBridge caller, byte[][] events,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_addEvents(nativeUsageStatsBridge, caller, events, callback);
  }

  @Override
  public void deleteAllEvents(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_deleteAllEvents(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void deleteEventsInRange(long nativeUsageStatsBridge, UsageStatsBridge caller, long start,
      long end, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_deleteEventsInRange(nativeUsageStatsBridge, caller, start, end, callback);
  }

  @Override
  public void deleteEventsWithMatchingDomains(long nativeUsageStatsBridge, UsageStatsBridge caller,
      String[] domains, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_deleteEventsWithMatchingDomains(nativeUsageStatsBridge, caller, domains, callback);
  }

  @Override
  public void getAllSuspensions(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<String[]> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_getAllSuspensions(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void setSuspensions(long nativeUsageStatsBridge, UsageStatsBridge caller, String[] domains,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_setSuspensions(nativeUsageStatsBridge, caller, domains, callback);
  }

  @Override
  public void getAllTokenMappings(long nativeUsageStatsBridge, UsageStatsBridge caller,
      Callback<Map<String, String>> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_getAllTokenMappings(nativeUsageStatsBridge, caller, callback);
  }

  @Override
  public void setTokenMappings(long nativeUsageStatsBridge, UsageStatsBridge caller,
      String[] tokens, String[] fqdns, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_UsageStatsBridge_setTokenMappings(nativeUsageStatsBridge, caller, tokens, fqdns, callback);
  }

  public static UsageStatsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.usage_stats.UsageStatsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UsageStatsBridgeJni();
  }
}
