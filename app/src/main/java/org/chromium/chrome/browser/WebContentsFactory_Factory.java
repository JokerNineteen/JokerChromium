package org.chromium.chrome.browser;

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
public final class WebContentsFactory_Factory implements Factory<WebContentsFactory> {
  @Override
  public WebContentsFactory get() {
    return newInstance();
  }

  public static WebContentsFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WebContentsFactory newInstance() {
    return new WebContentsFactory();
  }

  private static final class InstanceHolder {
    private static final WebContentsFactory_Factory INSTANCE = new WebContentsFactory_Factory();
  }
}
