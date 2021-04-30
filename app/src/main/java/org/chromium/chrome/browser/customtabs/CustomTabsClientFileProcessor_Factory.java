package org.chromium.chrome.browser.customtabs;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity.SplashImageHolder;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabsClientFileProcessor_Factory implements Factory<CustomTabsClientFileProcessor> {
  private final Provider<Context> contextProvider;

  private final Provider<SplashImageHolder> twaSplashImageHolderProvider;

  public CustomTabsClientFileProcessor_Factory(Provider<Context> contextProvider,
      Provider<SplashImageHolder> twaSplashImageHolderProvider) {
    this.contextProvider = contextProvider;
    this.twaSplashImageHolderProvider = twaSplashImageHolderProvider;
  }

  @Override
  public CustomTabsClientFileProcessor get() {
    return newInstance(contextProvider.get(), DoubleCheck.lazy(twaSplashImageHolderProvider));
  }

  public static CustomTabsClientFileProcessor_Factory create(Provider<Context> contextProvider,
      Provider<SplashImageHolder> twaSplashImageHolderProvider) {
    return new CustomTabsClientFileProcessor_Factory(contextProvider, twaSplashImageHolderProvider);
  }

  public static CustomTabsClientFileProcessor newInstance(Context context,
      Lazy<SplashImageHolder> twaSplashImageHolder) {
    return new CustomTabsClientFileProcessor(context, twaSplashImageHolder);
  }
}
