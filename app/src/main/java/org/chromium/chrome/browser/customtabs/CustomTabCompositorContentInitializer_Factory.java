package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.theme.TopUiThemeColorProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabCompositorContentInitializer_Factory implements Factory<CustomTabCompositorContentInitializer> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<CompositorViewHolder> compositorViewHolderProvider;

  private final Provider<ObservableSupplier<TabContentManager>> tabContentManagerSupplierProvider;

  private final Provider<CompositorViewHolder.Initializer> compositorViewHolderInitializerProvider;

  private final Provider<TopUiThemeColorProvider> topUiThemeColorProvider;

  public CustomTabCompositorContentInitializer_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<Activity> activityProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider,
      Provider<ObservableSupplier<TabContentManager>> tabContentManagerSupplierProvider,
      Provider<CompositorViewHolder.Initializer> compositorViewHolderInitializerProvider,
      Provider<TopUiThemeColorProvider> topUiThemeColorProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.activityProvider = activityProvider;
    this.compositorViewHolderProvider = compositorViewHolderProvider;
    this.tabContentManagerSupplierProvider = tabContentManagerSupplierProvider;
    this.compositorViewHolderInitializerProvider = compositorViewHolderInitializerProvider;
    this.topUiThemeColorProvider = topUiThemeColorProvider;
  }

  @Override
  public CustomTabCompositorContentInitializer get() {
    return newInstance(lifecycleDispatcherProvider.get(), activityProvider.get(), DoubleCheck.lazy(compositorViewHolderProvider), tabContentManagerSupplierProvider.get(), compositorViewHolderInitializerProvider.get(), topUiThemeColorProvider.get());
  }

  public static CustomTabCompositorContentInitializer_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<Activity> activityProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider,
      Provider<ObservableSupplier<TabContentManager>> tabContentManagerSupplierProvider,
      Provider<CompositorViewHolder.Initializer> compositorViewHolderInitializerProvider,
      Provider<TopUiThemeColorProvider> topUiThemeColorProvider) {
    return new CustomTabCompositorContentInitializer_Factory(lifecycleDispatcherProvider, activityProvider, compositorViewHolderProvider, tabContentManagerSupplierProvider, compositorViewHolderInitializerProvider, topUiThemeColorProvider);
  }

  public static CustomTabCompositorContentInitializer newInstance(
      ActivityLifecycleDispatcher lifecycleDispatcher, Activity activity,
      Lazy<CompositorViewHolder> compositorViewHolder,
      ObservableSupplier<TabContentManager> tabContentManagerSupplier,
      CompositorViewHolder.Initializer compositorViewHolderInitializer,
      TopUiThemeColorProvider topUiThemeColorProvider) {
    return new CustomTabCompositorContentInitializer(lifecycleDispatcher, activity, compositorViewHolder, tabContentManagerSupplier, compositorViewHolderInitializer, topUiThemeColorProvider);
  }
}
