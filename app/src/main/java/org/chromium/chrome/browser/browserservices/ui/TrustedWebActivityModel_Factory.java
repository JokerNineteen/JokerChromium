package org.chromium.chrome.browser.browserservices.ui;

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
public final class TrustedWebActivityModel_Factory implements Factory<TrustedWebActivityModel> {
  @Override
  public TrustedWebActivityModel get() {
    return newInstance();
  }

  public static TrustedWebActivityModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TrustedWebActivityModel newInstance() {
    return new TrustedWebActivityModel();
  }

  private static final class InstanceHolder {
    private static final TrustedWebActivityModel_Factory INSTANCE = new TrustedWebActivityModel_Factory();
  }
}
