package org.chromium.components.dom_distiller.core;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class DomDistillerUrlUtilsJni implements DomDistillerUrlUtils.Natives {
  private static DomDistillerUrlUtils.Natives testInstance;

  public static final JniStaticTestMocker<DomDistillerUrlUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.dom_distiller.core.DomDistillerUrlUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.dom_distiller.core.DomDistillerUrlUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getDistillerViewUrlFromUrl(String scheme, String url, String title) {
    return (String)GEN_JNI.org_chromium_components_dom_1distiller_core_DomDistillerUrlUtils_getDistillerViewUrlFromUrl(scheme, url, title);
  }

  @Override
  public GURL getOriginalUrlFromDistillerUrl(String viewerUrl) {
    return (GURL)GEN_JNI.org_chromium_components_dom_1distiller_core_DomDistillerUrlUtils_getOriginalUrlFromDistillerUrl(viewerUrl);
  }

  @Override
  public boolean isDistilledPage(String url) {
    return (boolean)GEN_JNI.org_chromium_components_dom_1distiller_core_DomDistillerUrlUtils_isDistilledPage(url);
  }

  @Override
  public String getValueForKeyInUrl(String url, String key) {
    return (String)GEN_JNI.org_chromium_components_dom_1distiller_core_DomDistillerUrlUtils_getValueForKeyInUrl(url, key);
  }

  public static DomDistillerUrlUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.dom_distiller.core.DomDistillerUrlUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DomDistillerUrlUtilsJni();
  }
}
