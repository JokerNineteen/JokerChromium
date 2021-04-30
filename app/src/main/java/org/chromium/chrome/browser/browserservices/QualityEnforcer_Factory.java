package org.chromium.chrome.browser.browserservices;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.ui.controller.Verifier;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.ClientPackageNameProvider;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QualityEnforcer_Factory implements Factory<QualityEnforcer> {
  private final Provider<Activity> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<Verifier> verifierProvider;

  private final Provider<ClientPackageNameProvider> clientPackageNameProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public QualityEnforcer_Factory(Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider, Provider<Verifier> verifierProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.intentDataProvider = intentDataProvider;
    this.connectionProvider = connectionProvider;
    this.verifierProvider = verifierProvider;
    this.clientPackageNameProvider = clientPackageNameProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public QualityEnforcer get() {
    return newInstance(activityProvider.get(), lifecycleDispatcherProvider.get(), tabObserverRegistrarProvider.get(), intentDataProvider.get(), connectionProvider.get(), verifierProvider.get(), clientPackageNameProvider.get(), umaRecorderProvider.get());
  }

  public static QualityEnforcer_Factory create(Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider, Provider<Verifier> verifierProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new QualityEnforcer_Factory(activityProvider, lifecycleDispatcherProvider, tabObserverRegistrarProvider, intentDataProvider, connectionProvider, verifierProvider, clientPackageNameProvider, umaRecorderProvider);
  }

  public static QualityEnforcer newInstance(Activity activity,
      ActivityLifecycleDispatcher lifecycleDispatcher, TabObserverRegistrar tabObserverRegistrar,
      BrowserServicesIntentDataProvider intentDataProvider, CustomTabsConnection connection,
      Verifier verifier, ClientPackageNameProvider clientPackageNameProvider,
      TrustedWebActivityUmaRecorder umaRecorder) {
    return new QualityEnforcer(activity, lifecycleDispatcher, tabObserverRegistrar, intentDataProvider, connection, verifier, clientPackageNameProvider, umaRecorder);
  }
}
