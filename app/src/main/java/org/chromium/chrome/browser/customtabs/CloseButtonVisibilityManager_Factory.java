package org.chromium.chrome.browser.customtabs;

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
public final class CloseButtonVisibilityManager_Factory implements Factory<CloseButtonVisibilityManager> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public CloseButtonVisibilityManager_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public CloseButtonVisibilityManager get() {
    return newInstance(intentDataProvider.get());
  }

  public static CloseButtonVisibilityManager_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new CloseButtonVisibilityManager_Factory(intentDataProvider);
  }

  public static CloseButtonVisibilityManager newInstance(
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new CloseButtonVisibilityManager(intentDataProvider);
  }
}
