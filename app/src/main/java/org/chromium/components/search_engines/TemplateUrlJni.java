package org.chromium.components.search_engines;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class TemplateUrlJni implements TemplateUrl.Natives {
  private static TemplateUrl.Natives testInstance;

  public static final JniStaticTestMocker<TemplateUrl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.search_engines.TemplateUrl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.search_engines.TemplateUrl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getShortName(long templateUrlPtr) {
    return (String)GEN_JNI.org_chromium_components_search_1engines_TemplateUrl_getShortName(templateUrlPtr);
  }

  @Override
  public String getKeyword(long templateUrlPtr) {
    return (String)GEN_JNI.org_chromium_components_search_1engines_TemplateUrl_getKeyword(templateUrlPtr);
  }

  @Override
  public boolean isPrepopulatedOrCreatedByPolicy(long templateUrlPtr) {
    return (boolean)GEN_JNI.org_chromium_components_search_1engines_TemplateUrl_isPrepopulatedOrCreatedByPolicy(templateUrlPtr);
  }

  @Override
  public long getLastVisitedTime(long templateUrlPtr) {
    return (long)GEN_JNI.org_chromium_components_search_1engines_TemplateUrl_getLastVisitedTime(templateUrlPtr);
  }

  @Override
  public int getPrepopulatedId(long templateUrlPtr) {
    return (int)GEN_JNI.org_chromium_components_search_1engines_TemplateUrl_getPrepopulatedId(templateUrlPtr);
  }

  @Override
  public String getURL(long templateUrlPtr) {
    return (String)GEN_JNI.org_chromium_components_search_1engines_TemplateUrl_getURL(templateUrlPtr);
  }

  public static TemplateUrl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.search_engines.TemplateUrl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TemplateUrlJni();
  }
}
