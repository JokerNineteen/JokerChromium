// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.browserservices.ui.controller;

import dagger.internal.Factory;

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