package org.chromium.chrome.browser.browserservices;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.init.ChromeBrowserInitializer;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrustedWebActivityUmaRecorder_Factory implements Factory<TrustedWebActivityUmaRecorder> {
  private final Provider<ChromeBrowserInitializer> browserInitializerProvider;

  public TrustedWebActivityUmaRecorder_Factory(
      Provider<ChromeBrowserInitializer> browserInitializerProvider) {
    this.browserInitializerProvider = browserInitializerProvider;
  }

  @Override
  public TrustedWebActivityUmaRecorder get() {
    return newInstance(browserInitializerProvider.get());
  }

  public static TrustedWebActivityUmaRecorder_Factory create(
      Provider<ChromeBrowserInitializer> browserInitializerProvider) {
    return new TrustedWebActivityUmaRecorder_Factory(browserInitializerProvider);
  }

  public static TrustedWebActivityUmaRecorder newInstance(
      ChromeBrowserInitializer browserInitializer) {
    return new TrustedWebActivityUmaRecorder(browserInitializer);
  }
}
