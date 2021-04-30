package org.chromium.chrome.browser.browserservices;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BrowserServicesStore_Factory implements Factory<BrowserServicesStore> {
  private final Provider<SharedPreferencesManager> managerProvider;

  public BrowserServicesStore_Factory(Provider<SharedPreferencesManager> managerProvider) {
    this.managerProvider = managerProvider;
  }

  @Override
  public BrowserServicesStore get() {
    return newInstance(managerProvider.get());
  }

  public static BrowserServicesStore_Factory create(
      Provider<SharedPreferencesManager> managerProvider) {
    return new BrowserServicesStore_Factory(managerProvider);
  }

  public static BrowserServicesStore newInstance(SharedPreferencesManager manager) {
    return new BrowserServicesStore(manager);
  }
}
