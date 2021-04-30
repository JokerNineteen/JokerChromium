package org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashImageHolder_Factory implements Factory<SplashImageHolder> {
  @Override
  public SplashImageHolder get() {
    return newInstance();
  }

  public static SplashImageHolder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SplashImageHolder newInstance() {
    return new SplashImageHolder();
  }

  private static final class InstanceHolder {
    private static final SplashImageHolder_Factory INSTANCE = new SplashImageHolder_Factory();
  }
}
