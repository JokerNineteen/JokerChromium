package org.chromium.chrome.browser.browserservices.trustedwebactivityui;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TwaFinishHandler_Factory implements Factory<TwaFinishHandler> {
  private final Provider<Activity> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  public TwaFinishHandler_Factory(Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.connectionProvider = connectionProvider;
  }

  @Override
  public TwaFinishHandler get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), connectionProvider.get());
  }

  public static TwaFinishHandler_Factory create(Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    return new TwaFinishHandler_Factory(activityProvider, intentDataProvider, connectionProvider);
  }

  public static TwaFinishHandler newInstance(Activity activity,
      BrowserServicesIntentDataProvider intentDataProvider, CustomTabsConnection connection) {
    return new TwaFinishHandler(activity, intentDataProvider, connection);
  }
}
