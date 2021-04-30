package org.chromium.chrome.browser.browserservices;

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
public final class ClientAppBroadcastReceiver_Factory implements Factory<ClientAppBroadcastReceiver> {
  @Override
  public ClientAppBroadcastReceiver get() {
    return newInstance();
  }

  public static ClientAppBroadcastReceiver_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ClientAppBroadcastReceiver newInstance() {
    return new ClientAppBroadcastReceiver();
  }

  private static final class InstanceHolder {
    private static final ClientAppBroadcastReceiver_Factory INSTANCE = new ClientAppBroadcastReceiver_Factory();
  }
}
