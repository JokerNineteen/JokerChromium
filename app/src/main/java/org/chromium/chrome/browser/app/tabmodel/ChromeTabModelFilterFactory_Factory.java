package org.chromium.chrome.browser.app.tabmodel;

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
public final class ChromeTabModelFilterFactory_Factory implements Factory<ChromeTabModelFilterFactory> {
  @Override
  public ChromeTabModelFilterFactory get() {
    return newInstance();
  }

  public static ChromeTabModelFilterFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ChromeTabModelFilterFactory newInstance() {
    return new ChromeTabModelFilterFactory();
  }

  private static final class InstanceHolder {
    private static final ChromeTabModelFilterFactory_Factory INSTANCE = new ChromeTabModelFilterFactory_Factory();
  }
}
