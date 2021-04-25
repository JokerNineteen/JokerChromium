package org.chromium.chrome.browser.search_engines;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.search_engines.TemplateUrlService;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class TemplateUrlServiceFactoryJni implements TemplateUrlServiceFactory.Natives {
  private static TemplateUrlServiceFactory.Natives testInstance;

  public static final JniStaticTestMocker<TemplateUrlServiceFactory.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.search_engines.TemplateUrlServiceFactory.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.search_engines.TemplateUrlServiceFactory.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public TemplateUrlService getTemplateUrlService() {
    return (TemplateUrlService)GEN_JNI.org_chromium_chrome_browser_search_1engines_TemplateUrlServiceFactory_getTemplateUrlService();
  }

  @Override
  public boolean doesDefaultSearchEngineHaveLogo() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_search_1engines_TemplateUrlServiceFactory_doesDefaultSearchEngineHaveLogo();
  }

  public static TemplateUrlServiceFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.search_engines.TemplateUrlServiceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TemplateUrlServiceFactoryJni();
  }
}
