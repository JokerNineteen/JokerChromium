package org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrustedWebActivityOpenTimeRecorder_Factory implements Factory<TrustedWebActivityOpenTimeRecorder> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  private final Provider<TrustedWebActivityUmaRecorder> recorderProvider;

  private final Provider<ActivityTabProvider> providerProvider;

  public TrustedWebActivityOpenTimeRecorder_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider,
      Provider<ActivityTabProvider> providerProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.currentPageVerifierProvider = currentPageVerifierProvider;
    this.recorderProvider = recorderProvider;
    this.providerProvider = providerProvider;
  }

  @Override
  public TrustedWebActivityOpenTimeRecorder get() {
    return newInstance(lifecycleDispatcherProvider.get(), currentPageVerifierProvider.get(), recorderProvider.get(), providerProvider.get());
  }

  public static TrustedWebActivityOpenTimeRecorder_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider,
      Provider<ActivityTabProvider> providerProvider) {
    return new TrustedWebActivityOpenTimeRecorder_Factory(lifecycleDispatcherProvider, currentPageVerifierProvider, recorderProvider, providerProvider);
  }

  public static TrustedWebActivityOpenTimeRecorder newInstance(
      ActivityLifecycleDispatcher lifecycleDispatcher, CurrentPageVerifier currentPageVerifier,
      TrustedWebActivityUmaRecorder recorder, ActivityTabProvider provider) {
    return new TrustedWebActivityOpenTimeRecorder(lifecycleDispatcher, currentPageVerifier, recorder, provider);
  }
}
