package org.chromium.chrome.browser.browserservices.ui.controller.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebApkVerifier_Factory implements Factory<WebApkVerifier> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public WebApkVerifier_Factory(Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public WebApkVerifier get() {
    return newInstance(intentDataProvider.get());
  }

  public static WebApkVerifier_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new WebApkVerifier_Factory(intentDataProvider);
  }

  public static WebApkVerifier newInstance(BrowserServicesIntentDataProvider intentDataProvider) {
    return new WebApkVerifier(intentDataProvider);
  }
}
