package org.chromium.chrome.browser.browserservices;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.init.ChromeBrowserInitializer;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClearDataDialogResultRecorder_Factory implements Factory<ClearDataDialogResultRecorder> {
  private final Provider<SharedPreferencesManager> managerProvider;

  private final Provider<ChromeBrowserInitializer> browserInitializerProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public ClearDataDialogResultRecorder_Factory(Provider<SharedPreferencesManager> managerProvider,
      Provider<ChromeBrowserInitializer> browserInitializerProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.managerProvider = managerProvider;
    this.browserInitializerProvider = browserInitializerProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public ClearDataDialogResultRecorder get() {
    return newInstance(DoubleCheck.lazy(managerProvider), browserInitializerProvider.get(), umaRecorderProvider.get());
  }

  public static ClearDataDialogResultRecorder_Factory create(
      Provider<SharedPreferencesManager> managerProvider,
      Provider<ChromeBrowserInitializer> browserInitializerProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new ClearDataDialogResultRecorder_Factory(managerProvider, browserInitializerProvider, umaRecorderProvider);
  }

  public static ClearDataDialogResultRecorder newInstance(Lazy<SharedPreferencesManager> manager,
      ChromeBrowserInitializer browserInitializer, TrustedWebActivityUmaRecorder umaRecorder) {
    return new ClearDataDialogResultRecorder(manager, browserInitializer, umaRecorder);
  }
}
