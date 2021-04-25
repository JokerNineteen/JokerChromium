package org.chromium.components.browser_ui.site_settings;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.browser_context.BrowserContextHandle;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class WebsitePreferenceBridgeJni implements WebsitePreferenceBridge.Natives {
  private static WebsitePreferenceBridge.Natives testInstance;

  public static final JniStaticTestMocker<WebsitePreferenceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isNotificationEmbargoedForOrigin(BrowserContextHandle browserContextHandle,
      String origin) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isNotificationEmbargoedForOrigin(browserContextHandle, origin);
  }

  @Override
  public void reportNotificationRevokedForOrigin(BrowserContextHandle browserContextHandle,
      String origin, int newSettingValue) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_reportNotificationRevokedForOrigin(browserContextHandle, origin, newSettingValue);
  }

  @Override
  public void clearBannerData(BrowserContextHandle browserContextHandle, String origin) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_clearBannerData(browserContextHandle, origin);
  }

  @Override
  public void clearMediaLicenses(BrowserContextHandle browserContextHandle, String origin) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_clearMediaLicenses(browserContextHandle, origin);
  }

  @Override
  public void clearCookieData(BrowserContextHandle browserContextHandle, String path) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_clearCookieData(browserContextHandle, path);
  }

  @Override
  public void clearLocalStorageData(BrowserContextHandle browserContextHandle, String path,
      Object callback) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_clearLocalStorageData(browserContextHandle, path, callback);
  }

  @Override
  public void clearStorageData(BrowserContextHandle browserContextHandle, String origin, int type,
      Object callback) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_clearStorageData(browserContextHandle, origin, type, callback);
  }

  @Override
  public void getChosenObjects(BrowserContextHandle browserContextHandle, int type, Object list) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_getChosenObjects(browserContextHandle, type, list);
  }

  @Override
  public void resetNotificationsSettingsForTest(BrowserContextHandle browserContextHandle) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_resetNotificationsSettingsForTest(browserContextHandle);
  }

  @Override
  public void revokeObjectPermission(BrowserContextHandle browserContextHandle, int type,
      String origin, String embedder, String object) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_revokeObjectPermission(browserContextHandle, type, origin, embedder, object);
  }

  @Override
  public boolean isContentSettingsPatternValid(String pattern) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isContentSettingsPatternValid(pattern);
  }

  @Override
  public boolean urlMatchesContentSettingsPattern(String url, String pattern) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_urlMatchesContentSettingsPattern(url, pattern);
  }

  @Override
  public void fetchStorageInfo(BrowserContextHandle browserContextHandle, Object callback) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_fetchStorageInfo(browserContextHandle, callback);
  }

  @Override
  public void fetchLocalStorageInfo(BrowserContextHandle browserContextHandle, Object callback,
      boolean includeImportant) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_fetchLocalStorageInfo(browserContextHandle, callback, includeImportant);
  }

  @Override
  public void getOriginsForPermission(BrowserContextHandle browserContextHandle,
      int contentSettingsType, Object list, boolean managedOnly) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_getOriginsForPermission(browserContextHandle, contentSettingsType, list, managedOnly);
  }

  @Override
  public int getSettingForOrigin(BrowserContextHandle browserContextHandle, int contentSettingsType,
      String origin, String embedder) {
    return (int)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_getSettingForOrigin(browserContextHandle, contentSettingsType, origin, embedder);
  }

  @Override
  public void setSettingForOrigin(BrowserContextHandle browserContextHandle,
      int contentSettingsType, String origin, String embedder, int value) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_setSettingForOrigin(browserContextHandle, contentSettingsType, origin, embedder, value);
  }

  @Override
  public boolean isPermissionControlledByDSE(BrowserContextHandle browserContextHandle,
      int contentSettingsType, String origin) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isPermissionControlledByDSE(browserContextHandle, contentSettingsType, origin);
  }

  @Override
  public boolean getAdBlockingActivated(BrowserContextHandle browserContextHandle, String origin) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_getAdBlockingActivated(browserContextHandle, origin);
  }

  @Override
  public boolean isContentSettingEnabled(BrowserContextHandle browserContextHandle,
      int contentSettingType) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isContentSettingEnabled(browserContextHandle, contentSettingType);
  }

  @Override
  public boolean isContentSettingManaged(BrowserContextHandle browserContextHandle,
      int contentSettingType) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isContentSettingManaged(browserContextHandle, contentSettingType);
  }

  @Override
  public boolean isCookieDeletionDisabled(BrowserContextHandle browserContextHandle,
      String origin) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isCookieDeletionDisabled(browserContextHandle, origin);
  }

  @Override
  public void setContentSettingEnabled(BrowserContextHandle browserContextHandle,
      int contentSettingType, boolean allow) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_setContentSettingEnabled(browserContextHandle, contentSettingType, allow);
  }

  @Override
  public void getContentSettingsExceptions(BrowserContextHandle browserContextHandle,
      int contentSettingsType, List<ContentSettingException> list) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_getContentSettingsExceptions(browserContextHandle, contentSettingsType, list);
  }

  @Override
  public void setContentSettingForPattern(BrowserContextHandle browserContextHandle,
      int contentSettingType, String primaryPattern, String secondaryPattern, int setting) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_setContentSettingForPattern(browserContextHandle, contentSettingType, primaryPattern, secondaryPattern, setting);
  }

  @Override
  public int getContentSetting(BrowserContextHandle browserContextHandle, int contentSettingType) {
    return (int)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_getContentSetting(browserContextHandle, contentSettingType);
  }

  @Override
  public void setContentSetting(BrowserContextHandle browserContextHandle, int contentSettingType,
      int setting) {
    GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_setContentSetting(browserContextHandle, contentSettingType, setting);
  }

  @Override
  public boolean isContentSettingUserModifiable(BrowserContextHandle browserContextHandle,
      int contentSettingType) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isContentSettingUserModifiable(browserContextHandle, contentSettingType);
  }

  @Override
  public boolean isContentSettingManagedByCustodian(BrowserContextHandle browserContextHandle,
      int contentSettingType) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_isContentSettingManagedByCustodian(browserContextHandle, contentSettingType);
  }

  @Override
  public boolean getLocationAllowedByPolicy(BrowserContextHandle browserContextHandle) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_WebsitePreferenceBridge_getLocationAllowedByPolicy(browserContextHandle);
  }

  public static WebsitePreferenceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebsitePreferenceBridgeJni();
  }
}
