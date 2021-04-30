package org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.ClientAppDataRegister;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClientAppDataRecorder_Factory implements Factory<ClientAppDataRecorder> {
  private final Provider<Context> contextProvider;

  private final Provider<ClientAppDataRegister> clientAppDataRegisterProvider;

  public ClientAppDataRecorder_Factory(Provider<Context> contextProvider,
      Provider<ClientAppDataRegister> clientAppDataRegisterProvider) {
    this.contextProvider = contextProvider;
    this.clientAppDataRegisterProvider = clientAppDataRegisterProvider;
  }

  @Override
  public ClientAppDataRecorder get() {
    return newInstance(contextProvider.get(), clientAppDataRegisterProvider.get());
  }

  public static ClientAppDataRecorder_Factory create(Provider<Context> contextProvider,
      Provider<ClientAppDataRegister> clientAppDataRegisterProvider) {
    return new ClientAppDataRecorder_Factory(contextProvider, clientAppDataRegisterProvider);
  }

  public static ClientAppDataRecorder newInstance(Context context,
      ClientAppDataRegister clientAppDataRegister) {
    return new ClientAppDataRecorder(context, clientAppDataRegister);
  }
}
