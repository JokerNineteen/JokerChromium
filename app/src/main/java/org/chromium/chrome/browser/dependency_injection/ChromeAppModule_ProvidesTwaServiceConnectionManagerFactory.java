package org.chromium.chrome.browser.dependency_injection;

import android.content.Context;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory implements Factory<TrustedWebActivityServiceConnectionPool> {
  private final ChromeAppModule module;

  private final Provider<Context> contextProvider;

  public ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory(ChromeAppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public TrustedWebActivityServiceConnectionPool get() {
    return providesTwaServiceConnectionManager(module, contextProvider.get());
  }

  public static ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory create(
      ChromeAppModule module, Provider<Context> contextProvider) {
    return new ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory(module, contextProvider);
  }

  public static TrustedWebActivityServiceConnectionPool providesTwaServiceConnectionManager(
      ChromeAppModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesTwaServiceConnectionManager(context));
  }
}
