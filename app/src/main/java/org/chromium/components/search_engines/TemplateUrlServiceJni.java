package org.chromium.components.search_engines;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TemplateUrlServiceJni implements TemplateUrlService.Natives {
  private static TemplateUrlService.Natives testInstance;

  public static final JniStaticTestMocker<TemplateUrlService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.search_engines.TemplateUrlService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.search_engines.TemplateUrlService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void load(long nativeTemplateUrlServiceAndroid, TemplateUrlService caller) {
    GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_load(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public boolean isLoaded(long nativeTemplateUrlServiceAndroid, TemplateUrlService caller) {
    return (boolean)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_isLoaded(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public void setUserSelectedDefaultSearchProvider(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String selectedKeyword) {
    GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_setUserSelectedDefaultSearchProvider(nativeTemplateUrlServiceAndroid, caller, selectedKeyword);
  }

  @Override
  public boolean isDefaultSearchManaged(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (boolean)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_isDefaultSearchManaged(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public boolean isSearchResultsPageFromDefaultSearchProvider(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, GURL url) {
    return (boolean)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_isSearchResultsPageFromDefaultSearchProvider(nativeTemplateUrlServiceAndroid, caller, url);
  }

  @Override
  public boolean isSearchByImageAvailable(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (boolean)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_isSearchByImageAvailable(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public boolean isDefaultSearchEngineGoogle(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (boolean)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_isDefaultSearchEngineGoogle(nativeTemplateUrlServiceAndroid, caller);
  }

  @Override
  public String getUrlForSearchQuery(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String query, String[] searchParams) {
    return (String)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getUrlForSearchQuery(nativeTemplateUrlServiceAndroid, caller, query, searchParams);
  }

  @Override
  public String getSearchQueryForUrl(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, GURL url) {
    return (String)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getSearchQueryForUrl(nativeTemplateUrlServiceAndroid, caller, url);
  }

  @Override
  public GURL getUrlForVoiceSearchQuery(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String query) {
    return (GURL)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getUrlForVoiceSearchQuery(nativeTemplateUrlServiceAndroid, caller, query);
  }

  @Override
  public GURL getUrlForContextualSearchQuery(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String query, String alternateTerm, boolean shouldPrefetch,
      String protocolVersion) {
    return (GURL)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getUrlForContextualSearchQuery(nativeTemplateUrlServiceAndroid, caller, query, alternateTerm, shouldPrefetch, protocolVersion);
  }

  @Override
  public String getSearchEngineUrlFromTemplateUrl(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String keyword) {
    return (String)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getSearchEngineUrlFromTemplateUrl(nativeTemplateUrlServiceAndroid, caller, keyword);
  }

  @Override
  public int getSearchEngineTypeFromTemplateUrl(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String keyword) {
    return (int)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getSearchEngineTypeFromTemplateUrl(nativeTemplateUrlServiceAndroid, caller, keyword);
  }

  @Override
  public String addSearchEngineForTesting(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String keyword, int offset) {
    return (String)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_addSearchEngineForTesting(nativeTemplateUrlServiceAndroid, caller, keyword, offset);
  }

  @Override
  public boolean setPlayAPISearchEngine(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller, String name, String keyword, String searchUrl, String suggestUrl,
      String faviconUrl, boolean setAsDefault) {
    return (boolean)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_setPlayAPISearchEngine(nativeTemplateUrlServiceAndroid, caller, name, keyword, searchUrl, suggestUrl, faviconUrl, setAsDefault);
  }

  @Override
  public void getTemplateUrls(long nativeTemplateUrlServiceAndroid, TemplateUrlService caller,
      List<TemplateUrl> templateUrls) {
    GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getTemplateUrls(nativeTemplateUrlServiceAndroid, caller, templateUrls);
  }

  @Override
  public TemplateUrl getDefaultSearchEngine(long nativeTemplateUrlServiceAndroid,
      TemplateUrlService caller) {
    return (TemplateUrl)GEN_JNI.org_chromium_components_search_1engines_TemplateUrlService_getDefaultSearchEngine(nativeTemplateUrlServiceAndroid, caller);
  }

  public static TemplateUrlService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.search_engines.TemplateUrlService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TemplateUrlServiceJni();
  }
}
