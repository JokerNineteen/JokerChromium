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
public final class AddToHomescreenVerifier_Factory implements Factory<AddToHomescreenVerifier> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public AddToHomescreenVerifier_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public AddToHomescreenVerifier get() {
    return newInstance(intentDataProvider.get());
  }

  public static AddToHomescreenVerifier_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new AddToHomescreenVerifier_Factory(intentDataProvider);
  }

  public static AddToHomescreenVerifier newInstance(
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new AddToHomescreenVerifier(intentDataProvider);
  }
}
