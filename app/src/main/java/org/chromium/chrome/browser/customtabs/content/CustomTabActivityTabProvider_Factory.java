package org.chromium.chrome.browser.customtabs.content;

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
public final class CustomTabActivityTabProvider_Factory implements Factory<CustomTabActivityTabProvider> {
  @Override
  public CustomTabActivityTabProvider get() {
    return newInstance();
  }

  public static CustomTabActivityTabProvider_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CustomTabActivityTabProvider newInstance() {
    return new CustomTabActivityTabProvider();
  }

  private static final class InstanceHolder {
    private static final CustomTabActivityTabProvider_Factory INSTANCE = new CustomTabActivityTabProvider_Factory();
  }
}
