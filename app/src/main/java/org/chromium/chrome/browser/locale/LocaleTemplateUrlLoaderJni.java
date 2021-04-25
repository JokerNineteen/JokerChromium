package org.chromium.chrome.browser.locale;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LocaleTemplateUrlLoaderJni implements LocaleTemplateUrlLoader.Natives {
  private static LocaleTemplateUrlLoader.Natives testInstance;

  public static final JniStaticTestMocker<LocaleTemplateUrlLoader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.locale.LocaleTemplateUrlLoader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.locale.LocaleTemplateUrlLoader.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(String localeId) {
    return (long)GEN_JNI.org_chromium_chrome_browser_locale_LocaleTemplateUrlLoader_init(localeId);
  }

  @Override
  public void destroy(long nativeLocaleTemplateUrlLoader) {
    GEN_JNI.org_chromium_chrome_browser_locale_LocaleTemplateUrlLoader_destroy(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public boolean loadTemplateUrls(long nativeLocaleTemplateUrlLoader) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_locale_LocaleTemplateUrlLoader_loadTemplateUrls(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public void removeTemplateUrls(long nativeLocaleTemplateUrlLoader) {
    GEN_JNI.org_chromium_chrome_browser_locale_LocaleTemplateUrlLoader_removeTemplateUrls(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public void overrideDefaultSearchProvider(long nativeLocaleTemplateUrlLoader) {
    GEN_JNI.org_chromium_chrome_browser_locale_LocaleTemplateUrlLoader_overrideDefaultSearchProvider(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public void setGoogleAsDefaultSearch(long nativeLocaleTemplateUrlLoader) {
    GEN_JNI.org_chromium_chrome_browser_locale_LocaleTemplateUrlLoader_setGoogleAsDefaultSearch(nativeLocaleTemplateUrlLoader);
  }

  public static LocaleTemplateUrlLoader.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.locale.LocaleTemplateUrlLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LocaleTemplateUrlLoaderJni();
  }
}
