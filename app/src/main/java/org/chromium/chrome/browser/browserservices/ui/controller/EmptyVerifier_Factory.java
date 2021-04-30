package org.chromium.chrome.browser.browserservices.ui.controller;

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
public final class EmptyVerifier_Factory implements Factory<EmptyVerifier> {
  @Override
  public EmptyVerifier get() {
    return newInstance();
  }

  public static EmptyVerifier_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EmptyVerifier newInstance() {
    return new EmptyVerifier();
  }

  private static final class InstanceHolder {
    private static final EmptyVerifier_Factory INSTANCE = new EmptyVerifier_Factory();
  }
}
