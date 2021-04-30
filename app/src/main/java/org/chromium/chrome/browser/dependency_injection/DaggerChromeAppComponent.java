package org.chromium.chrome.browser.dependency_injection;

import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.AppHooksModule;
import org.chromium.chrome.browser.AppHooksModule_ProvideCustomTabsConnectionFactory;
import org.chromium.chrome.browser.AppHooksModule_ProvideExternalAuthUtilsFactory;
import org.chromium.chrome.browser.AppHooksModule_ProvideMultiWindowUtilsFactory;
import org.chromium.chrome.browser.WebContentsFactory;
import org.chromium.chrome.browser.app.tabmodel.ChromeTabModelFilterFactory;
import org.chromium.chrome.browser.browser_controls.BrowserControlsVisibilityManager;
import org.chromium.chrome.browser.browserservices.BrowserServicesStore;
import org.chromium.chrome.browser.browserservices.ClearDataDialogResultRecorder;
import org.chromium.chrome.browser.browserservices.QualityEnforcer;
import org.chromium.chrome.browser.browserservices.SessionDataHolder;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityClient;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.permissiondelegation.LocationPermissionUpdater;
import org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationChannelPreserver;
import org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationChannelPreserver_Factory;
import org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationPermissionUpdater;
import org.chromium.chrome.browser.browserservices.permissiondelegation.PermissionUpdater;
import org.chromium.chrome.browser.browserservices.permissiondelegation.TrustedWebActivityPermissionManager;
import org.chromium.chrome.browser.browserservices.permissiondelegation.TrustedWebActivityPermissionStore;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaFinishHandler;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaIntentHandlingStrategy;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityBrowserControlsVisibilityManager;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.sharing.TwaSharingController;
import org.chromium.chrome.browser.browserservices.ui.SharedActivityCoordinator;
import org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.EmptyVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.Verifier;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.ClientAppDataRecorder;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.ClientAppDataRecorder_Factory;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.ClientPackageNameProvider;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TrustedWebActivityDisclosureController;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TrustedWebActivityDisclosureController_Factory;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TrustedWebActivityOpenTimeRecorder;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TrustedWebActivityOpenTimeRecorder_Factory;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TwaRegistrar;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TwaVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.webapps.AddToHomescreenVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.webapps.WebApkVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.webapps.WebappDisclosureController;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.SplashController;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity.SplashImageHolder;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity.TwaSplashController;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.webapps.WebappSplashController;
import org.chromium.chrome.browser.browserservices.ui.trustedwebactivity.DisclosureUiPicker;
import org.chromium.chrome.browser.browserservices.ui.trustedwebactivity.TrustedWebActivityCoordinator;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureInfobar;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureInfobar_Factory;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureNotification;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureNotification_Factory;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureSnackbar;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureSnackbar_Factory;
import org.chromium.chrome.browser.browserservices.verification.OriginVerifierFactory;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.bottombar.ephemeraltab.EphemeralTabCoordinator;
import org.chromium.chrome.browser.customtabs.CloseButtonNavigator;
import org.chromium.chrome.browser.customtabs.CloseButtonVisibilityManager;
import org.chromium.chrome.browser.customtabs.CustomTabActivityClientConnectionKeeper;
import org.chromium.chrome.browser.customtabs.CustomTabActivityLifecycleUmaTracker;
import org.chromium.chrome.browser.customtabs.CustomTabBottomBarDelegate;
import org.chromium.chrome.browser.customtabs.CustomTabCompositorContentInitializer;
import org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory;
import org.chromium.chrome.browser.customtabs.CustomTabIncognitoManager;
import org.chromium.chrome.browser.customtabs.CustomTabNavigationEventObserver;
import org.chromium.chrome.browser.customtabs.CustomTabObserver;
import org.chromium.chrome.browser.customtabs.CustomTabOrientationController;
import org.chromium.chrome.browser.customtabs.CustomTabSessionHandler;
import org.chromium.chrome.browser.customtabs.CustomTabStatusBarColorProvider;
import org.chromium.chrome.browser.customtabs.CustomTabTabPersistencePolicy;
import org.chromium.chrome.browser.customtabs.CustomTabTaskDescriptionHelper;
import org.chromium.chrome.browser.customtabs.CustomTabsClientFileProcessor;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.ReparentingTaskProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabFactory;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider_Factory;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandler;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.DefaultCustomTabIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.ProfileProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityComponent;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvideClientAppDataRegisterFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvideIntentHandlerFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvideIntentIgnoringCriterionFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvideNightModeControllerFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvidePostShareTargetNavigatorFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvideStartupTabPreloaderFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvideVerifierFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory;
import org.chromium.chrome.browser.customtabs.dependency_injection.BaseCustomTabActivityModule_ProvidesOriginVerifierFactoryFactory;
import org.chromium.chrome.browser.customtabs.features.ImmersiveModeController;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabBrowserControlsVisibilityDelegate;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarColorController;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator;
import org.chromium.chrome.browser.fullscreen.FullscreenManager;
import org.chromium.chrome.browser.metrics.ActivityTabStartupMetricsTracker;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;
import org.chromium.chrome.browser.tabmodel.AsyncTabParamsManager;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;
import org.chromium.chrome.browser.webapps.WebApkActivityCoordinator;
import org.chromium.chrome.browser.webapps.WebApkActivityLifecycleUmaTracker;
import org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator;
import org.chromium.chrome.browser.webapps.WebApkUpdateManager;
import org.chromium.chrome.browser.webapps.WebappActionsNotificationManager_Factory;
import org.chromium.chrome.browser.webapps.WebappActivityCoordinator;
import org.chromium.chrome.browser.webapps.WebappActivityCoordinator_Factory;
import org.chromium.chrome.browser.webapps.WebappDeferredStartupWithStorageHandler;
import org.chromium.components.externalauth.ExternalAuthUtils;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerChromeAppComponent implements ChromeAppComponent {
  private final ChromeAppModule chromeAppModule;

  private final AppHooksModule appHooksModule;

  private volatile Provider<SharedPreferencesManager> providesSharedPreferencesManagerProvider;

  private volatile TrustedWebActivityUmaRecorder trustedWebActivityUmaRecorder;

  private volatile Object trustedWebActivityPermissionStore = new MemoizedSentinel();

  private volatile Object notificationChannelPreserver = new MemoizedSentinel();

  private volatile Provider<NotificationChannelPreserver> notificationChannelPreserverProvider;

  private volatile Object trustedWebActivityPermissionManager = new MemoizedSentinel();

  private volatile Object notificationPermissionUpdater = new MemoizedSentinel();

  private volatile Object locationPermissionUpdater = new MemoizedSentinel();

  private volatile Object permissionUpdater = new MemoizedSentinel();

  private volatile Object trustedWebActivityServiceConnectionPool = new MemoizedSentinel();

  private volatile Object trustedWebActivityClient = new MemoizedSentinel();

  private volatile Object splashImageHolder = new MemoizedSentinel();

  private volatile Provider<SplashImageHolder> splashImageHolderProvider;

  private volatile Object customTabsClientFileProcessor = new MemoizedSentinel();

  private volatile Provider<CustomTabsConnection> provideCustomTabsConnectionProvider;

  private volatile Object sessionDataHolder = new MemoizedSentinel();

  private volatile Provider<AsyncTabParamsManager> provideAsyncTabParamsManagerProvider;

  private DaggerChromeAppComponent(ChromeAppModule chromeAppModuleParam,
      AppHooksModule appHooksModuleParam) {
    this.chromeAppModule = chromeAppModuleParam;
    this.appHooksModule = appHooksModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ChromeAppComponent create() {
    return new Builder().build();
  }

  private Provider<SharedPreferencesManager> sharedPreferencesManagerProvider() {
    Object local = providesSharedPreferencesManagerProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      providesSharedPreferencesManagerProvider = (Provider<SharedPreferencesManager>) local;
    }
    return (Provider<SharedPreferencesManager>) local;
  }

  private TrustedWebActivityUmaRecorder trustedWebActivityUmaRecorder() {
    Object local = trustedWebActivityUmaRecorder;
    if (local == null) {
      local = new TrustedWebActivityUmaRecorder(ChromeAppModule_ProvideChromeBrowserInitializerFactory.provideChromeBrowserInitializer(chromeAppModule));
      trustedWebActivityUmaRecorder = (TrustedWebActivityUmaRecorder) local;
    }
    return (TrustedWebActivityUmaRecorder) local;
  }

  private TrustedWebActivityPermissionStore trustedWebActivityPermissionStore() {
    Object local = trustedWebActivityPermissionStore;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityPermissionStore;
        if (local instanceof MemoizedSentinel) {
          local = ChromeAppModule_ProvidesTwaPermissionStoreFactory.providesTwaPermissionStore(chromeAppModule);
          trustedWebActivityPermissionStore = DoubleCheck.reentrantCheck(trustedWebActivityPermissionStore, local);
        }
      }
    }
    return (TrustedWebActivityPermissionStore) local;
  }

  private NotificationChannelPreserver notificationChannelPreserver() {
    Object local = notificationChannelPreserver;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = notificationChannelPreserver;
        if (local instanceof MemoizedSentinel) {
          local = NotificationChannelPreserver_Factory.newInstance(trustedWebActivityPermissionStore(), ChromeAppModule_ProvidesSiteChannelsManagerFactory.providesSiteChannelsManager(chromeAppModule));
          notificationChannelPreserver = DoubleCheck.reentrantCheck(notificationChannelPreserver, local);
        }
      }
    }
    return (NotificationChannelPreserver) local;
  }

  private Provider<NotificationChannelPreserver> notificationChannelPreserverProvider() {
    Object local = notificationChannelPreserverProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      notificationChannelPreserverProvider = (Provider<NotificationChannelPreserver>) local;
    }
    return (Provider<NotificationChannelPreserver>) local;
  }

  private NotificationPermissionUpdater notificationPermissionUpdater() {
    Object local = notificationPermissionUpdater;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = notificationPermissionUpdater;
        if (local instanceof MemoizedSentinel) {
          local = new NotificationPermissionUpdater(resolveTwaPermissionManager(), resolveTrustedWebActivityClient());
          notificationPermissionUpdater = DoubleCheck.reentrantCheck(notificationPermissionUpdater, local);
        }
      }
    }
    return (NotificationPermissionUpdater) local;
  }

  private LocationPermissionUpdater locationPermissionUpdater() {
    Object local = locationPermissionUpdater;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = locationPermissionUpdater;
        if (local instanceof MemoizedSentinel) {
          local = new LocationPermissionUpdater(resolveTwaPermissionManager(), resolveTrustedWebActivityClient(), trustedWebActivityUmaRecorder());
          locationPermissionUpdater = DoubleCheck.reentrantCheck(locationPermissionUpdater, local);
        }
      }
    }
    return (LocationPermissionUpdater) local;
  }

  private TrustedWebActivityServiceConnectionPool trustedWebActivityServiceConnectionPool() {
    Object local = trustedWebActivityServiceConnectionPool;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityServiceConnectionPool;
        if (local instanceof MemoizedSentinel) {
          local = ChromeAppModule_ProvidesTwaServiceConnectionManagerFactory.providesTwaServiceConnectionManager(chromeAppModule, ChromeAppModule_ProvideContextFactory.provideContext(chromeAppModule));
          trustedWebActivityServiceConnectionPool = DoubleCheck.reentrantCheck(trustedWebActivityServiceConnectionPool, local);
        }
      }
    }
    return (TrustedWebActivityServiceConnectionPool) local;
  }

  private SplashImageHolder splashImageHolder() {
    Object local = splashImageHolder;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = splashImageHolder;
        if (local instanceof MemoizedSentinel) {
          local = new SplashImageHolder();
          splashImageHolder = DoubleCheck.reentrantCheck(splashImageHolder, local);
        }
      }
    }
    return (SplashImageHolder) local;
  }

  private Provider<SplashImageHolder> splashImageHolderProvider() {
    Object local = splashImageHolderProvider;
    if (local == null) {
      local = new SwitchingProvider<>(2);
      splashImageHolderProvider = (Provider<SplashImageHolder>) local;
    }
    return (Provider<SplashImageHolder>) local;
  }

  private Provider<CustomTabsConnection> customTabsConnectionProvider() {
    Object local = provideCustomTabsConnectionProvider;
    if (local == null) {
      local = new SwitchingProvider<>(3);
      provideCustomTabsConnectionProvider = (Provider<CustomTabsConnection>) local;
    }
    return (Provider<CustomTabsConnection>) local;
  }

  private Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider() {
    Object local = provideAsyncTabParamsManagerProvider;
    if (local == null) {
      local = new SwitchingProvider<>(4);
      provideAsyncTabParamsManagerProvider = (Provider<AsyncTabParamsManager>) local;
    }
    return (Provider<AsyncTabParamsManager>) local;
  }

  @Override
  public CustomTabsConnection resolveCustomTabsConnection() {
    return AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection();
  }

  @Override
  public SharedPreferencesManager resolveSharedPreferencesManager() {
    return ChromeAppModule_ProvidesSharedPreferencesManagerFactory.providesSharedPreferencesManager(chromeAppModule);
  }

  @Override
  public ClearDataDialogResultRecorder resolveTwaClearDataDialogRecorder() {
    return new ClearDataDialogResultRecorder(DoubleCheck.lazy(sharedPreferencesManagerProvider()), ChromeAppModule_ProvideChromeBrowserInitializerFactory.provideChromeBrowserInitializer(chromeAppModule), trustedWebActivityUmaRecorder());
  }

  @Override
  public TrustedWebActivityPermissionManager resolveTwaPermissionManager() {
    Object local = trustedWebActivityPermissionManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityPermissionManager;
        if (local instanceof MemoizedSentinel) {
          local = new TrustedWebActivityPermissionManager(ChromeAppModule_ProvideContextFactory.provideContext(chromeAppModule), trustedWebActivityPermissionStore(), DoubleCheck.lazy(notificationChannelPreserverProvider()), trustedWebActivityUmaRecorder());
          trustedWebActivityPermissionManager = DoubleCheck.reentrantCheck(trustedWebActivityPermissionManager, local);
        }
      }
    }
    return (TrustedWebActivityPermissionManager) local;
  }

  @Override
  public PermissionUpdater resolveTwaPermissionUpdater() {
    Object local = permissionUpdater;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = permissionUpdater;
        if (local instanceof MemoizedSentinel) {
          local = new PermissionUpdater(resolveTwaPermissionManager(), notificationPermissionUpdater(), locationPermissionUpdater());
          permissionUpdater = DoubleCheck.reentrantCheck(permissionUpdater, local);
        }
      }
    }
    return (PermissionUpdater) local;
  }

  @Override
  public TrustedWebActivityClient resolveTrustedWebActivityClient() {
    Object local = trustedWebActivityClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trustedWebActivityClient;
        if (local instanceof MemoizedSentinel) {
          local = new TrustedWebActivityClient(trustedWebActivityServiceConnectionPool(), resolveTwaPermissionManager(), trustedWebActivityUmaRecorder());
          trustedWebActivityClient = DoubleCheck.reentrantCheck(trustedWebActivityClient, local);
        }
      }
    }
    return (TrustedWebActivityClient) local;
  }

  @Override
  public ExternalAuthUtils resolveExternalAuthUtils() {
    return AppHooksModule_ProvideExternalAuthUtilsFactory.provideExternalAuthUtils(appHooksModule);
  }

  @Override
  public CustomTabsClientFileProcessor resolveCustomTabsFileProcessor() {
    Object local = customTabsClientFileProcessor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = customTabsClientFileProcessor;
        if (local instanceof MemoizedSentinel) {
          local = new CustomTabsClientFileProcessor(ChromeAppModule_ProvideContextFactory.provideContext(chromeAppModule), DoubleCheck.lazy(splashImageHolderProvider()));
          customTabsClientFileProcessor = DoubleCheck.reentrantCheck(customTabsClientFileProcessor, local);
        }
      }
    }
    return (CustomTabsClientFileProcessor) local;
  }

  @Override
  public SessionDataHolder resolveSessionDataHolder() {
    Object local = sessionDataHolder;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sessionDataHolder;
        if (local instanceof MemoizedSentinel) {
          local = new SessionDataHolder(DoubleCheck.lazy(customTabsConnectionProvider()));
          sessionDataHolder = DoubleCheck.reentrantCheck(sessionDataHolder, local);
        }
      }
    }
    return (SessionDataHolder) local;
  }

  @Override
  public ChromeActivityComponent createChromeActivityComponent(ChromeActivityCommonsModule module) {
    Preconditions.checkNotNull(module);
    return new ChromeActivityComponentImpl(module);
  }

  @Override
  public BaseCustomTabActivityComponent createBaseCustomTabActivityComponent(
      ChromeActivityCommonsModule module, BaseCustomTabActivityModule baseCustomTabActivityModule) {
    Preconditions.checkNotNull(module);
    Preconditions.checkNotNull(baseCustomTabActivityModule);
    return new BaseCustomTabActivityComponentImpl(module, baseCustomTabActivityModule);
  }

  public static final class Builder {
    private ChromeAppModule chromeAppModule;

    private AppHooksModule appHooksModule;

    private Builder() {
    }

    public Builder chromeAppModule(ChromeAppModule chromeAppModule) {
      this.chromeAppModule = Preconditions.checkNotNull(chromeAppModule);
      return this;
    }

    public Builder appHooksModule(AppHooksModule appHooksModule) {
      this.appHooksModule = Preconditions.checkNotNull(appHooksModule);
      return this;
    }

    public ChromeAppComponent build() {
      if (chromeAppModule == null) {
        this.chromeAppModule = new ChromeAppModule();
      }
      if (appHooksModule == null) {
        this.appHooksModule = new AppHooksModule();
      }
      return new DaggerChromeAppComponent(chromeAppModule, appHooksModule);
    }
  }

  private final class ChromeActivityComponentImpl implements ChromeActivityComponent {
    private ChromeActivityComponentImpl(ChromeActivityCommonsModule module) {

    }

    @Override
    public ChromeAppComponent getParent() {
      return DaggerChromeAppComponent.this;
    }
  }

  private final class BaseCustomTabActivityComponentImpl implements BaseCustomTabActivityComponent {
    private final ChromeActivityCommonsModule chromeActivityCommonsModule;

    private final BaseCustomTabActivityModule baseCustomTabActivityModule;

    private volatile Object currentPageVerifier = new MemoizedSentinel();

    private volatile Object customTabActivityClientConnectionKeeper = new MemoizedSentinel();

    private volatile Object customTabActivityLifecycleUmaTracker = new MemoizedSentinel();

    private volatile Object customTabObserver = new MemoizedSentinel();

    private volatile Provider<CustomTabObserver> customTabObserverProvider;

    private volatile Object closeButtonNavigator = new MemoizedSentinel();

    private volatile Provider<FullscreenManager> provideFullscreenManagerProvider;

    private volatile Object customTabActivityNavigationController = new MemoizedSentinel();

    private volatile Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider;

    private volatile Provider<CompositorViewHolder> provideCompositorViewHolderProvider;

    private volatile WebContentsFactory webContentsFactory;

    private volatile Object customTabNavigationEventObserver = new MemoizedSentinel();

    private volatile Provider<CustomTabIncognitoManager> customTabIncognitoManagerProvider;

    private volatile Object customTabActivityTabController = new MemoizedSentinel();

    private volatile Object chromeTabModelFilterFactory = new MemoizedSentinel();

    private volatile Provider<ActivityWindowAndroid> provideActivityWindowAndroidProvider;

    private volatile Object customTabActivityTabFactory = new MemoizedSentinel();

    private volatile Object customTabActivityTabProvider = new MemoizedSentinel();

    private volatile Object customTabBottomBarDelegate = new MemoizedSentinel();

    private volatile Object customTabCompositorContentInitializer = new MemoizedSentinel();

    private volatile Provider<BrowserControlsVisibilityManager> provideBrowserControlsVisibilityManagerProvider;

    private volatile Object customTabBrowserControlsVisibilityDelegate = new MemoizedSentinel();

    private volatile Object ephemeralTabCoordinator = new MemoizedSentinel();

    private volatile Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider;

    private volatile Object customTabDelegateFactory = new MemoizedSentinel();

    private volatile Object customTabIncognitoManager = new MemoizedSentinel();

    private volatile Object defaultCustomTabIntentHandlingStrategy = new MemoizedSentinel();

    private volatile Provider<DefaultCustomTabIntentHandlingStrategy> defaultCustomTabIntentHandlingStrategyProvider;

    private volatile WebApkPostShareTargetNavigator webApkPostShareTargetNavigator;

    private volatile Object twaSharingController = new MemoizedSentinel();

    private volatile Object twaIntentHandlingStrategy = new MemoizedSentinel();

    private volatile Provider<TwaIntentHandlingStrategy> twaIntentHandlingStrategyProvider;

    private volatile Object customTabIntentHandler = new MemoizedSentinel();

    private volatile Provider<CustomTabToolbarCoordinator> customTabToolbarCoordinatorProvider;

    private volatile Provider<CustomTabBottomBarDelegate> customTabBottomBarDelegateProvider;

    private volatile Object customTabSessionHandler = new MemoizedSentinel();

    private volatile Object customTabStatusBarColorProvider = new MemoizedSentinel();

    private volatile Object customTabTaskDescriptionHelper = new MemoizedSentinel();

    private volatile Object closeButtonVisibilityManager = new MemoizedSentinel();

    private volatile Object customTabToolbarColorController = new MemoizedSentinel();

    private volatile Object customTabToolbarCoordinator = new MemoizedSentinel();

    private volatile Object tabObserverRegistrar = new MemoizedSentinel();

    private volatile Object twaFinishHandler = new MemoizedSentinel();

    private volatile Object webApkVerifier = new MemoizedSentinel();

    private volatile Provider<WebApkVerifier> webApkVerifierProvider;

    private volatile Object addToHomescreenVerifier = new MemoizedSentinel();

    private volatile Provider<AddToHomescreenVerifier> addToHomescreenVerifierProvider;

    private volatile OriginVerifierFactory originVerifierFactory;

    private volatile Object clientPackageNameProvider = new MemoizedSentinel();

    private volatile Object twaVerifier = new MemoizedSentinel();

    private volatile Provider<TwaVerifier> twaVerifierProvider;

    private volatile Object emptyVerifier = new MemoizedSentinel();

    private volatile Provider<EmptyVerifier> emptyVerifierProvider;

    private volatile Object trustedWebActivityBrowserControlsVisibilityManager = new MemoizedSentinel();

    private volatile Object immersiveModeController = new MemoizedSentinel();

    private volatile Provider<ImmersiveModeController> immersiveModeControllerProvider;

    private volatile Object customTabOrientationController = new MemoizedSentinel();

    private volatile Object sharedActivityCoordinator = new MemoizedSentinel();

    private volatile Object webappDeferredStartupWithStorageHandler = new MemoizedSentinel();

    private volatile Object webappActionsNotificationManager = new MemoizedSentinel();

    private volatile Object webappActivityCoordinator = new MemoizedSentinel();

    private volatile Object trustedWebActivityModel = new MemoizedSentinel();

    private volatile Object webappDisclosureController = new MemoizedSentinel();

    private volatile Provider<SnackbarManager> provideSnackbarManagerProvider;

    private volatile Object disclosureInfobar = new MemoizedSentinel();

    private volatile Provider<ActivityTabStartupMetricsTracker> provideActivityTabStartupMetricsTrackerProvider;

    private volatile Object webApkActivityLifecycleUmaTracker = new MemoizedSentinel();

    private volatile Object webApkUpdateManager = new MemoizedSentinel();

    private volatile Provider<WebApkUpdateManager> webApkUpdateManagerProvider;

    private volatile Object webApkActivityCoordinator = new MemoizedSentinel();

    private volatile Object browserServicesStore = new MemoizedSentinel();

    private volatile Provider<DisclosureInfobar> disclosureInfobarProvider;

    private volatile Object disclosureSnackbar = new MemoizedSentinel();

    private volatile Provider<DisclosureSnackbar> disclosureSnackbarProvider;

    private volatile Provider<DisclosureNotification> disclosureNotificationProvider;

    private volatile Object disclosureUiPicker = new MemoizedSentinel();

    private volatile Object trustedWebActivityOpenTimeRecorder = new MemoizedSentinel();

    private volatile Provider<TwaSplashController> twaSplashControllerProvider;

    private volatile Object clientAppDataRecorder = new MemoizedSentinel();

    private volatile Provider<ClientAppDataRecorder> clientAppDataRecorderProvider;

    private volatile Object qualityEnforcer = new MemoizedSentinel();

    private volatile Object trustedWebActivityCoordinator = new MemoizedSentinel();

    private volatile Object customTabTabPersistencePolicy = new MemoizedSentinel();

    private volatile Object splashController = new MemoizedSentinel();

    private BaseCustomTabActivityComponentImpl(ChromeActivityCommonsModule module,
        BaseCustomTabActivityModule baseCustomTabActivityModuleParam) {
      this.chromeActivityCommonsModule = module;
      this.baseCustomTabActivityModule = baseCustomTabActivityModuleParam;
    }

    private CustomTabObserver customTabObserver() {
      Object local = customTabObserver;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabObserver;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabObserver(ChromeAppModule_ProvideContextFactory.provideContext(DaggerChromeAppComponent.this.chromeAppModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection());
            customTabObserver = DoubleCheck.reentrantCheck(customTabObserver, local);
          }
        }
      }
      return (CustomTabObserver) local;
    }

    private Provider<CustomTabObserver> customTabObserverProvider() {
      Object local = customTabObserverProvider;
      if (local == null) {
        local = new SwitchingProvider<>(0);
        customTabObserverProvider = (Provider<CustomTabObserver>) local;
      }
      return (Provider<CustomTabObserver>) local;
    }

    private CloseButtonNavigator closeButtonNavigator() {
      Object local = closeButtonNavigator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = closeButtonNavigator;
          if (local instanceof MemoizedSentinel) {
            local = new CloseButtonNavigator(resolveTabController(), resolveTabProvider(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
            closeButtonNavigator = DoubleCheck.reentrantCheck(closeButtonNavigator, local);
          }
        }
      }
      return (CloseButtonNavigator) local;
    }

    private Provider<FullscreenManager> fullscreenManagerProvider() {
      Object local = provideFullscreenManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(1);
        provideFullscreenManagerProvider = (Provider<FullscreenManager>) local;
      }
      return (Provider<FullscreenManager>) local;
    }

    private Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider() {
      Object local = customTabDelegateFactoryProvider;
      if (local == null) {
        local = new SwitchingProvider<>(2);
        customTabDelegateFactoryProvider = (Provider<CustomTabDelegateFactory>) local;
      }
      return (Provider<CustomTabDelegateFactory>) local;
    }

    private Provider<CompositorViewHolder> compositorViewHolderProvider() {
      Object local = provideCompositorViewHolderProvider;
      if (local == null) {
        local = new SwitchingProvider<>(3);
        provideCompositorViewHolderProvider = (Provider<CompositorViewHolder>) local;
      }
      return (Provider<CompositorViewHolder>) local;
    }

    private WebContentsFactory webContentsFactory() {
      Object local = webContentsFactory;
      if (local == null) {
        local = new WebContentsFactory();
        webContentsFactory = (WebContentsFactory) local;
      }
      return (WebContentsFactory) local;
    }

    private CustomTabNavigationEventObserver customTabNavigationEventObserver() {
      Object local = customTabNavigationEventObserver;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabNavigationEventObserver;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabNavigationEventObserver(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection());
            customTabNavigationEventObserver = DoubleCheck.reentrantCheck(customTabNavigationEventObserver, local);
          }
        }
      }
      return (CustomTabNavigationEventObserver) local;
    }

    private Provider<CustomTabIncognitoManager> customTabIncognitoManagerProvider() {
      Object local = customTabIncognitoManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(4);
        customTabIncognitoManagerProvider = (Provider<CustomTabIncognitoManager>) local;
      }
      return (Provider<CustomTabIncognitoManager>) local;
    }

    private ChromeTabModelFilterFactory chromeTabModelFilterFactory() {
      Object local = chromeTabModelFilterFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = chromeTabModelFilterFactory;
          if (local instanceof MemoizedSentinel) {
            local = new ChromeTabModelFilterFactory();
            chromeTabModelFilterFactory = DoubleCheck.reentrantCheck(chromeTabModelFilterFactory, local);
          }
        }
      }
      return (ChromeTabModelFilterFactory) local;
    }

    private Provider<ActivityWindowAndroid> activityWindowAndroidProvider() {
      Object local = provideActivityWindowAndroidProvider;
      if (local == null) {
        local = new SwitchingProvider<>(5);
        provideActivityWindowAndroidProvider = (Provider<ActivityWindowAndroid>) local;
      }
      return (Provider<ActivityWindowAndroid>) local;
    }

    private Provider<BrowserControlsVisibilityManager> browserControlsVisibilityManagerProvider() {
      Object local = provideBrowserControlsVisibilityManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(6);
        provideBrowserControlsVisibilityManagerProvider = (Provider<BrowserControlsVisibilityManager>) local;
      }
      return (Provider<BrowserControlsVisibilityManager>) local;
    }

    private CustomTabBrowserControlsVisibilityDelegate customTabBrowserControlsVisibilityDelegate(
        ) {
      Object local = customTabBrowserControlsVisibilityDelegate;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabBrowserControlsVisibilityDelegate;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabBrowserControlsVisibilityDelegate(DoubleCheck.lazy(browserControlsVisibilityManagerProvider()), ChromeActivityCommonsModule_ProvideActivityTabProviderFactory.provideActivityTabProvider(chromeActivityCommonsModule));
            customTabBrowserControlsVisibilityDelegate = DoubleCheck.reentrantCheck(customTabBrowserControlsVisibilityDelegate, local);
          }
        }
      }
      return (CustomTabBrowserControlsVisibilityDelegate) local;
    }

    private EphemeralTabCoordinator ephemeralTabCoordinator() {
      Object local = ephemeralTabCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = ephemeralTabCoordinator;
          if (local instanceof MemoizedSentinel) {
            local = new EphemeralTabCoordinator(ChromeActivityCommonsModule_ProvideContextFactory.provideContext(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory.provideActivityWindowAndroid(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideDecorViewFactory.provideDecorView(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideActivityTabProviderFactory.provideActivityTabProvider(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideTabCreatorSupplierFactory.provideTabCreatorSupplier(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideBottomSheetControllerFactory.provideBottomSheetController(chromeActivityCommonsModule), chromeActivityCommonsModule.provideIsPromotableToTab());
            ephemeralTabCoordinator = DoubleCheck.reentrantCheck(ephemeralTabCoordinator, local);
          }
        }
      }
      return (EphemeralTabCoordinator) local;
    }

    private Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider() {
      Object local = ephemeralTabCoordinatorProvider;
      if (local == null) {
        local = new SwitchingProvider<>(7);
        ephemeralTabCoordinatorProvider = (Provider<EphemeralTabCoordinator>) local;
      }
      return (Provider<EphemeralTabCoordinator>) local;
    }

    private DefaultCustomTabIntentHandlingStrategy defaultCustomTabIntentHandlingStrategy() {
      Object local = defaultCustomTabIntentHandlingStrategy;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = defaultCustomTabIntentHandlingStrategy;
          if (local instanceof MemoizedSentinel) {
            local = new DefaultCustomTabIntentHandlingStrategy(resolveTabProvider(), resolveNavigationController(), customTabNavigationEventObserver(), DoubleCheck.lazy(customTabObserverProvider()));
            defaultCustomTabIntentHandlingStrategy = DoubleCheck.reentrantCheck(defaultCustomTabIntentHandlingStrategy, local);
          }
        }
      }
      return (DefaultCustomTabIntentHandlingStrategy) local;
    }

    private Provider<DefaultCustomTabIntentHandlingStrategy> defaultCustomTabIntentHandlingStrategyProvider(
        ) {
      Object local = defaultCustomTabIntentHandlingStrategyProvider;
      if (local == null) {
        local = new SwitchingProvider<>(8);
        defaultCustomTabIntentHandlingStrategyProvider = (Provider<DefaultCustomTabIntentHandlingStrategy>) local;
      }
      return (Provider<DefaultCustomTabIntentHandlingStrategy>) local;
    }

    private WebApkPostShareTargetNavigator webApkPostShareTargetNavigator() {
      Object local = webApkPostShareTargetNavigator;
      if (local == null) {
        local = BaseCustomTabActivityModule_ProvidePostShareTargetNavigatorFactory.providePostShareTargetNavigator(baseCustomTabActivityModule);
        webApkPostShareTargetNavigator = (WebApkPostShareTargetNavigator) local;
      }
      return (WebApkPostShareTargetNavigator) local;
    }

    private TwaSharingController twaSharingController() {
      Object local = twaSharingController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaSharingController;
          if (local instanceof MemoizedSentinel) {
            local = new TwaSharingController(resolveTabProvider(), resolveNavigationController(), webApkPostShareTargetNavigator(), resolveVerifier(), DaggerChromeAppComponent.this.trustedWebActivityUmaRecorder());
            twaSharingController = DoubleCheck.reentrantCheck(twaSharingController, local);
          }
        }
      }
      return (TwaSharingController) local;
    }

    private TwaIntentHandlingStrategy twaIntentHandlingStrategy() {
      Object local = twaIntentHandlingStrategy;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaIntentHandlingStrategy;
          if (local instanceof MemoizedSentinel) {
            local = new TwaIntentHandlingStrategy(defaultCustomTabIntentHandlingStrategy(), twaSharingController());
            twaIntentHandlingStrategy = DoubleCheck.reentrantCheck(twaIntentHandlingStrategy, local);
          }
        }
      }
      return (TwaIntentHandlingStrategy) local;
    }

    private Provider<TwaIntentHandlingStrategy> twaIntentHandlingStrategyProvider() {
      Object local = twaIntentHandlingStrategyProvider;
      if (local == null) {
        local = new SwitchingProvider<>(9);
        twaIntentHandlingStrategyProvider = (Provider<TwaIntentHandlingStrategy>) local;
      }
      return (Provider<TwaIntentHandlingStrategy>) local;
    }

    private CustomTabIntentHandlingStrategy customTabIntentHandlingStrategy() {
      return BaseCustomTabActivityModule_ProvideIntentHandlerFactory.provideIntentHandler(baseCustomTabActivityModule, DoubleCheck.lazy(defaultCustomTabIntentHandlingStrategyProvider()), DoubleCheck.lazy(twaIntentHandlingStrategyProvider()));
    }

    private Provider<CustomTabToolbarCoordinator> customTabToolbarCoordinatorProvider() {
      Object local = customTabToolbarCoordinatorProvider;
      if (local == null) {
        local = new SwitchingProvider<>(10);
        customTabToolbarCoordinatorProvider = (Provider<CustomTabToolbarCoordinator>) local;
      }
      return (Provider<CustomTabToolbarCoordinator>) local;
    }

    private Provider<CustomTabBottomBarDelegate> customTabBottomBarDelegateProvider() {
      Object local = customTabBottomBarDelegateProvider;
      if (local == null) {
        local = new SwitchingProvider<>(11);
        customTabBottomBarDelegateProvider = (Provider<CustomTabBottomBarDelegate>) local;
      }
      return (Provider<CustomTabBottomBarDelegate>) local;
    }

    private CloseButtonVisibilityManager closeButtonVisibilityManager() {
      Object local = closeButtonVisibilityManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = closeButtonVisibilityManager;
          if (local instanceof MemoizedSentinel) {
            local = new CloseButtonVisibilityManager(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
            closeButtonVisibilityManager = DoubleCheck.reentrantCheck(closeButtonVisibilityManager, local);
          }
        }
      }
      return (CloseButtonVisibilityManager) local;
    }

    private CustomTabToolbarColorController customTabToolbarColorController() {
      Object local = customTabToolbarColorController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabToolbarColorController;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabToolbarColorController(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), resolveTabProvider(), resolveTabObserverRegistrar(), BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory.provideTopUiThemeColorProvider(baseCustomTabActivityModule));
            customTabToolbarColorController = DoubleCheck.reentrantCheck(customTabToolbarColorController, local);
          }
        }
      }
      return (CustomTabToolbarColorController) local;
    }

    private WebApkVerifier webApkVerifier() {
      Object local = webApkVerifier;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webApkVerifier;
          if (local instanceof MemoizedSentinel) {
            local = new WebApkVerifier(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
            webApkVerifier = DoubleCheck.reentrantCheck(webApkVerifier, local);
          }
        }
      }
      return (WebApkVerifier) local;
    }

    private Provider<WebApkVerifier> webApkVerifierProvider() {
      Object local = webApkVerifierProvider;
      if (local == null) {
        local = new SwitchingProvider<>(12);
        webApkVerifierProvider = (Provider<WebApkVerifier>) local;
      }
      return (Provider<WebApkVerifier>) local;
    }

    private AddToHomescreenVerifier addToHomescreenVerifier() {
      Object local = addToHomescreenVerifier;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = addToHomescreenVerifier;
          if (local instanceof MemoizedSentinel) {
            local = new AddToHomescreenVerifier(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
            addToHomescreenVerifier = DoubleCheck.reentrantCheck(addToHomescreenVerifier, local);
          }
        }
      }
      return (AddToHomescreenVerifier) local;
    }

    private Provider<AddToHomescreenVerifier> addToHomescreenVerifierProvider() {
      Object local = addToHomescreenVerifierProvider;
      if (local == null) {
        local = new SwitchingProvider<>(13);
        addToHomescreenVerifierProvider = (Provider<AddToHomescreenVerifier>) local;
      }
      return (Provider<AddToHomescreenVerifier>) local;
    }

    private OriginVerifierFactory originVerifierFactory() {
      Object local = originVerifierFactory;
      if (local == null) {
        local = BaseCustomTabActivityModule_ProvidesOriginVerifierFactoryFactory.providesOriginVerifierFactory(baseCustomTabActivityModule);
        originVerifierFactory = (OriginVerifierFactory) local;
      }
      return (OriginVerifierFactory) local;
    }

    private ClientPackageNameProvider clientPackageNameProvider() {
      Object local = clientPackageNameProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = clientPackageNameProvider;
          if (local instanceof MemoizedSentinel) {
            local = new ClientPackageNameProvider(ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection());
            clientPackageNameProvider = DoubleCheck.reentrantCheck(clientPackageNameProvider, local);
          }
        }
      }
      return (ClientPackageNameProvider) local;
    }

    private TwaVerifier twaVerifier() {
      Object local = twaVerifier;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaVerifier;
          if (local instanceof MemoizedSentinel) {
            local = new TwaVerifier(ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), originVerifierFactory(), resolveTabProvider(), clientPackageNameProvider(), AppHooksModule_ProvideExternalAuthUtilsFactory.provideExternalAuthUtils(DaggerChromeAppComponent.this.appHooksModule));
            twaVerifier = DoubleCheck.reentrantCheck(twaVerifier, local);
          }
        }
      }
      return (TwaVerifier) local;
    }

    private Provider<TwaVerifier> twaVerifierProvider() {
      Object local = twaVerifierProvider;
      if (local == null) {
        local = new SwitchingProvider<>(14);
        twaVerifierProvider = (Provider<TwaVerifier>) local;
      }
      return (Provider<TwaVerifier>) local;
    }

    private EmptyVerifier emptyVerifier() {
      Object local = emptyVerifier;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = emptyVerifier;
          if (local instanceof MemoizedSentinel) {
            local = new EmptyVerifier();
            emptyVerifier = DoubleCheck.reentrantCheck(emptyVerifier, local);
          }
        }
      }
      return (EmptyVerifier) local;
    }

    private Provider<EmptyVerifier> emptyVerifierProvider() {
      Object local = emptyVerifierProvider;
      if (local == null) {
        local = new SwitchingProvider<>(15);
        emptyVerifierProvider = (Provider<EmptyVerifier>) local;
      }
      return (Provider<EmptyVerifier>) local;
    }

    private TrustedWebActivityBrowserControlsVisibilityManager trustedWebActivityBrowserControlsVisibilityManager(
        ) {
      Object local = trustedWebActivityBrowserControlsVisibilityManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityBrowserControlsVisibilityManager;
          if (local instanceof MemoizedSentinel) {
            local = new TrustedWebActivityBrowserControlsVisibilityManager(resolveTabObserverRegistrar(), resolveTabProvider(), resolveToolbarCoordinator(), closeButtonVisibilityManager(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
            trustedWebActivityBrowserControlsVisibilityManager = DoubleCheck.reentrantCheck(trustedWebActivityBrowserControlsVisibilityManager, local);
          }
        }
      }
      return (TrustedWebActivityBrowserControlsVisibilityManager) local;
    }

    private ImmersiveModeController immersiveModeController() {
      Object local = immersiveModeController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = immersiveModeController;
          if (local instanceof MemoizedSentinel) {
            local = new ImmersiveModeController(ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule));
            immersiveModeController = DoubleCheck.reentrantCheck(immersiveModeController, local);
          }
        }
      }
      return (ImmersiveModeController) local;
    }

    private Provider<ImmersiveModeController> immersiveModeControllerProvider() {
      Object local = immersiveModeControllerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(16);
        immersiveModeControllerProvider = (Provider<ImmersiveModeController>) local;
      }
      return (Provider<ImmersiveModeController>) local;
    }

    private CustomTabOrientationController customTabOrientationController() {
      Object local = customTabOrientationController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabOrientationController;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabOrientationController(ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory.provideActivityWindowAndroid(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
            customTabOrientationController = DoubleCheck.reentrantCheck(customTabOrientationController, local);
          }
        }
      }
      return (CustomTabOrientationController) local;
    }

    private SharedActivityCoordinator sharedActivityCoordinator() {
      Object local = sharedActivityCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = sharedActivityCoordinator;
          if (local instanceof MemoizedSentinel) {
            local = new SharedActivityCoordinator(resolveCurrentPageVerifier(), resolveVerifier(), resolveNavigationController(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), customTabToolbarColorController(), resolveCustomTabStatusBarColorProvider(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), trustedWebActivityBrowserControlsVisibilityManager(), DoubleCheck.lazy(immersiveModeControllerProvider()), customTabOrientationController());
            sharedActivityCoordinator = DoubleCheck.reentrantCheck(sharedActivityCoordinator, local);
          }
        }
      }
      return (SharedActivityCoordinator) local;
    }

    private WebappSplashController webappSplashController() {
      return new WebappSplashController(resolveSplashController(), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), resolveTabObserverRegistrar(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
    }

    private WebappDeferredStartupWithStorageHandler webappDeferredStartupWithStorageHandler() {
      Object local = webappDeferredStartupWithStorageHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webappDeferredStartupWithStorageHandler;
          if (local instanceof MemoizedSentinel) {
            local = new WebappDeferredStartupWithStorageHandler(ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
            webappDeferredStartupWithStorageHandler = DoubleCheck.reentrantCheck(webappDeferredStartupWithStorageHandler, local);
          }
        }
      }
      return (WebappDeferredStartupWithStorageHandler) local;
    }

    private Object webappActionsNotificationManager() {
      Object local = webappActionsNotificationManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webappActionsNotificationManager;
          if (local instanceof MemoizedSentinel) {
            local = WebappActionsNotificationManager_Factory.newInstance(resolveTabProvider(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
            webappActionsNotificationManager = DoubleCheck.reentrantCheck(webappActionsNotificationManager, local);
          }
        }
      }
      return (Object) local;
    }

    private TrustedWebActivityModel trustedWebActivityModel() {
      Object local = trustedWebActivityModel;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityModel;
          if (local instanceof MemoizedSentinel) {
            local = new TrustedWebActivityModel();
            trustedWebActivityModel = DoubleCheck.reentrantCheck(trustedWebActivityModel, local);
          }
        }
      }
      return (TrustedWebActivityModel) local;
    }

    private WebappDisclosureController webappDisclosureController() {
      Object local = webappDisclosureController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webappDisclosureController;
          if (local instanceof MemoizedSentinel) {
            local = new WebappDisclosureController(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), webappDeferredStartupWithStorageHandler(), trustedWebActivityModel(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveCurrentPageVerifier());
            webappDisclosureController = DoubleCheck.reentrantCheck(webappDisclosureController, local);
          }
        }
      }
      return (WebappDisclosureController) local;
    }

    private Provider<SnackbarManager> snackbarManagerProvider() {
      Object local = provideSnackbarManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(17);
        provideSnackbarManagerProvider = (Provider<SnackbarManager>) local;
      }
      return (Provider<SnackbarManager>) local;
    }

    private DisclosureInfobar disclosureInfobar() {
      Object local = disclosureInfobar;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = disclosureInfobar;
          if (local instanceof MemoizedSentinel) {
            local = DisclosureInfobar_Factory.newInstance(ChromeActivityCommonsModule_ProvideResourcesFactory.provideResources(chromeActivityCommonsModule), DoubleCheck.lazy(snackbarManagerProvider()), trustedWebActivityModel(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
            disclosureInfobar = DoubleCheck.reentrantCheck(disclosureInfobar, local);
          }
        }
      }
      return (DisclosureInfobar) local;
    }

    private Provider<ActivityTabStartupMetricsTracker> activityTabStartupMetricsTrackerProvider() {
      Object local = provideActivityTabStartupMetricsTrackerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(18);
        provideActivityTabStartupMetricsTrackerProvider = (Provider<ActivityTabStartupMetricsTracker>) local;
      }
      return (Provider<ActivityTabStartupMetricsTracker>) local;
    }

    private WebApkActivityLifecycleUmaTracker webApkActivityLifecycleUmaTracker() {
      Object local = webApkActivityLifecycleUmaTracker;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webApkActivityLifecycleUmaTracker;
          if (local instanceof MemoizedSentinel) {
            local = new WebApkActivityLifecycleUmaTracker(ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), resolveSplashController(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), webappDeferredStartupWithStorageHandler(), DoubleCheck.lazy(activityTabStartupMetricsTrackerProvider()));
            webApkActivityLifecycleUmaTracker = DoubleCheck.reentrantCheck(webApkActivityLifecycleUmaTracker, local);
          }
        }
      }
      return (WebApkActivityLifecycleUmaTracker) local;
    }

    private WebApkUpdateManager webApkUpdateManager() {
      Object local = webApkUpdateManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webApkUpdateManager;
          if (local instanceof MemoizedSentinel) {
            local = new WebApkUpdateManager(ChromeActivityCommonsModule_ProvideActivityTabProviderFactory.provideActivityTabProvider(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
            webApkUpdateManager = DoubleCheck.reentrantCheck(webApkUpdateManager, local);
          }
        }
      }
      return (WebApkUpdateManager) local;
    }

    private Provider<WebApkUpdateManager> webApkUpdateManagerProvider() {
      Object local = webApkUpdateManagerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(19);
        webApkUpdateManagerProvider = (Provider<WebApkUpdateManager>) local;
      }
      return (Provider<WebApkUpdateManager>) local;
    }

    private BrowserServicesStore browserServicesStore() {
      Object local = browserServicesStore;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = browserServicesStore;
          if (local instanceof MemoizedSentinel) {
            local = new BrowserServicesStore(ChromeAppModule_ProvidesSharedPreferencesManagerFactory.providesSharedPreferencesManager(DaggerChromeAppComponent.this.chromeAppModule));
            browserServicesStore = DoubleCheck.reentrantCheck(browserServicesStore, local);
          }
        }
      }
      return (BrowserServicesStore) local;
    }

    private TrustedWebActivityDisclosureController trustedWebActivityDisclosureController() {
      return TrustedWebActivityDisclosureController_Factory.newInstance(browserServicesStore(), trustedWebActivityModel(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveCurrentPageVerifier(), DaggerChromeAppComponent.this.trustedWebActivityUmaRecorder(), clientPackageNameProvider());
    }

    private Provider<DisclosureInfobar> disclosureInfobarProvider() {
      Object local = disclosureInfobarProvider;
      if (local == null) {
        local = new SwitchingProvider<>(20);
        disclosureInfobarProvider = (Provider<DisclosureInfobar>) local;
      }
      return (Provider<DisclosureInfobar>) local;
    }

    private DisclosureSnackbar disclosureSnackbar() {
      Object local = disclosureSnackbar;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = disclosureSnackbar;
          if (local instanceof MemoizedSentinel) {
            local = DisclosureSnackbar_Factory.newInstance(ChromeActivityCommonsModule_ProvideResourcesFactory.provideResources(chromeActivityCommonsModule), DoubleCheck.lazy(snackbarManagerProvider()), trustedWebActivityModel(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
            disclosureSnackbar = DoubleCheck.reentrantCheck(disclosureSnackbar, local);
          }
        }
      }
      return (DisclosureSnackbar) local;
    }

    private Provider<DisclosureSnackbar> disclosureSnackbarProvider() {
      Object local = disclosureSnackbarProvider;
      if (local == null) {
        local = new SwitchingProvider<>(21);
        disclosureSnackbarProvider = (Provider<DisclosureSnackbar>) local;
      }
      return (Provider<DisclosureSnackbar>) local;
    }

    private DisclosureNotification disclosureNotification() {
      return DisclosureNotification_Factory.newInstance(ChromeAppModule_ProvideContextFactory.provideContext(DaggerChromeAppComponent.this.chromeAppModule), ChromeActivityCommonsModule_ProvideResourcesFactory.provideResources(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory.provideNotificationManagerProxy(chromeActivityCommonsModule), trustedWebActivityModel(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
    }

    private Provider<DisclosureNotification> disclosureNotificationProvider() {
      Object local = disclosureNotificationProvider;
      if (local == null) {
        local = new SwitchingProvider<>(22);
        disclosureNotificationProvider = (Provider<DisclosureNotification>) local;
      }
      return (Provider<DisclosureNotification>) local;
    }

    private DisclosureUiPicker disclosureUiPicker() {
      Object local = disclosureUiPicker;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = disclosureUiPicker;
          if (local instanceof MemoizedSentinel) {
            local = new DisclosureUiPicker(DoubleCheck.lazy(disclosureInfobarProvider()), DoubleCheck.lazy(disclosureSnackbarProvider()), DoubleCheck.lazy(disclosureNotificationProvider()), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory.provideNotificationManagerProxy(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
            disclosureUiPicker = DoubleCheck.reentrantCheck(disclosureUiPicker, local);
          }
        }
      }
      return (DisclosureUiPicker) local;
    }

    private TrustedWebActivityOpenTimeRecorder trustedWebActivityOpenTimeRecorder() {
      Object local = trustedWebActivityOpenTimeRecorder;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityOpenTimeRecorder;
          if (local instanceof MemoizedSentinel) {
            local = TrustedWebActivityOpenTimeRecorder_Factory.newInstance(ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveCurrentPageVerifier(), DaggerChromeAppComponent.this.trustedWebActivityUmaRecorder(), ChromeActivityCommonsModule_ProvideActivityTabProviderFactory.provideActivityTabProvider(chromeActivityCommonsModule));
            trustedWebActivityOpenTimeRecorder = DoubleCheck.reentrantCheck(trustedWebActivityOpenTimeRecorder, local);
          }
        }
      }
      return (TrustedWebActivityOpenTimeRecorder) local;
    }

    private TwaSplashController twaSplashController() {
      return new TwaSplashController(resolveSplashController(), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory.provideActivityWindowAndroid(chromeActivityCommonsModule), DaggerChromeAppComponent.this.splashImageHolder(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule));
    }

    private Provider<TwaSplashController> twaSplashControllerProvider() {
      Object local = twaSplashControllerProvider;
      if (local == null) {
        local = new SwitchingProvider<>(23);
        twaSplashControllerProvider = (Provider<TwaSplashController>) local;
      }
      return (Provider<TwaSplashController>) local;
    }

    private ClientAppDataRecorder clientAppDataRecorder() {
      Object local = clientAppDataRecorder;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = clientAppDataRecorder;
          if (local instanceof MemoizedSentinel) {
            local = ClientAppDataRecorder_Factory.newInstance(ChromeAppModule_ProvideContextFactory.provideContext(DaggerChromeAppComponent.this.chromeAppModule), BaseCustomTabActivityModule_ProvideClientAppDataRegisterFactory.provideClientAppDataRegister(baseCustomTabActivityModule));
            clientAppDataRecorder = DoubleCheck.reentrantCheck(clientAppDataRecorder, local);
          }
        }
      }
      return (ClientAppDataRecorder) local;
    }

    private Provider<ClientAppDataRecorder> clientAppDataRecorderProvider() {
      Object local = clientAppDataRecorderProvider;
      if (local == null) {
        local = new SwitchingProvider<>(24);
        clientAppDataRecorderProvider = (Provider<ClientAppDataRecorder>) local;
      }
      return (Provider<ClientAppDataRecorder>) local;
    }

    private TwaRegistrar twaRegistrar() {
      return new TwaRegistrar(ChromeAppModule_ProvideContextFactory.provideContext(DaggerChromeAppComponent.this.chromeAppModule), DaggerChromeAppComponent.this.resolveTwaPermissionUpdater(), DoubleCheck.lazy(clientAppDataRecorderProvider()));
    }

    private QualityEnforcer qualityEnforcer() {
      Object local = qualityEnforcer;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = qualityEnforcer;
          if (local instanceof MemoizedSentinel) {
            local = new QualityEnforcer(ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveTabObserverRegistrar(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection(), resolveVerifier(), clientPackageNameProvider(), DaggerChromeAppComponent.this.trustedWebActivityUmaRecorder());
            qualityEnforcer = DoubleCheck.reentrantCheck(qualityEnforcer, local);
          }
        }
      }
      return (QualityEnforcer) local;
    }

    @Override
    public ChromeAppComponent getParent() {
      return DaggerChromeAppComponent.this;
    }

    @Override
    public CurrentPageVerifier resolveCurrentPageVerifier() {
      Object local = currentPageVerifier;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = currentPageVerifier;
          if (local instanceof MemoizedSentinel) {
            local = new CurrentPageVerifier(ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveTabObserverRegistrar(), resolveTabProvider(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), resolveVerifier());
            currentPageVerifier = DoubleCheck.reentrantCheck(currentPageVerifier, local);
          }
        }
      }
      return (CurrentPageVerifier) local;
    }

    @Override
    public CustomTabActivityClientConnectionKeeper resolveConnectionKeeper() {
      Object local = customTabActivityClientConnectionKeeper;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityClientConnectionKeeper;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabActivityClientConnectionKeeper(AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveTabProvider());
            customTabActivityClientConnectionKeeper = DoubleCheck.reentrantCheck(customTabActivityClientConnectionKeeper, local);
          }
        }
      }
      return (CustomTabActivityClientConnectionKeeper) local;
    }

    @Override
    public CustomTabActivityLifecycleUmaTracker resolveUmaTracker() {
      Object local = customTabActivityLifecycleUmaTracker;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityLifecycleUmaTracker;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabActivityLifecycleUmaTracker(ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection());
            customTabActivityLifecycleUmaTracker = DoubleCheck.reentrantCheck(customTabActivityLifecycleUmaTracker, local);
          }
        }
      }
      return (CustomTabActivityLifecycleUmaTracker) local;
    }

    @Override
    public CustomTabActivityNavigationController resolveNavigationController() {
      Object local = customTabActivityNavigationController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityNavigationController;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabActivityNavigationController(resolveTabController(), resolveTabProvider(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection(), DoubleCheck.lazy(customTabObserverProvider()), closeButtonNavigator(), ChromeAppModule_ProvideChromeBrowserInitializerFactory.provideChromeBrowserInitializer(DaggerChromeAppComponent.this.chromeAppModule), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), DoubleCheck.lazy(fullscreenManagerProvider()));
            customTabActivityNavigationController = DoubleCheck.reentrantCheck(customTabActivityNavigationController, local);
          }
        }
      }
      return (CustomTabActivityNavigationController) local;
    }

    @Override
    public CustomTabActivityTabController resolveTabController() {
      Object local = customTabActivityTabController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabController;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabActivityTabController(ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule), DoubleCheck.lazy(customTabDelegateFactoryProvider()), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideActivityTabProviderFactory.provideActivityTabProvider(chromeActivityCommonsModule), resolveTabObserverRegistrar(), DoubleCheck.lazy(compositorViewHolderProvider()), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), ChromeAppModule_ProvideWarmupManagerFactory.provideWarmupManager(DaggerChromeAppComponent.this.chromeAppModule), resolveTabPersistencePolicy(), resolveTabFactory(), DoubleCheck.lazy(customTabObserverProvider()), webContentsFactory(), customTabNavigationEventObserver(), resolveTabProvider(), BaseCustomTabActivityModule_ProvideStartupTabPreloaderFactory.provideStartupTabPreloader(baseCustomTabActivityModule), new ReparentingTaskProvider(), DoubleCheck.lazy(customTabIncognitoManagerProvider()), new ProfileProvider(), DoubleCheck.lazy(DaggerChromeAppComponent.this.asyncTabParamsManagerProvider()));
            customTabActivityTabController = DoubleCheck.reentrantCheck(customTabActivityTabController, local);
          }
        }
      }
      return (CustomTabActivityTabController) local;
    }

    @Override
    public CustomTabActivityTabFactory resolveTabFactory() {
      Object local = customTabActivityTabFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabFactory;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabActivityTabFactory(ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule), resolveTabPersistencePolicy(), chromeTabModelFilterFactory(), DoubleCheck.lazy(activityWindowAndroidProvider()), DoubleCheck.lazy(customTabDelegateFactoryProvider()), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), BaseCustomTabActivityModule_ProvideStartupTabPreloaderFactory.provideStartupTabPreloader(baseCustomTabActivityModule), DoubleCheck.lazy(DaggerChromeAppComponent.this.asyncTabParamsManagerProvider()));
            customTabActivityTabFactory = DoubleCheck.reentrantCheck(customTabActivityTabFactory, local);
          }
        }
      }
      return (CustomTabActivityTabFactory) local;
    }

    @Override
    public CustomTabActivityTabProvider resolveTabProvider() {
      Object local = customTabActivityTabProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabActivityTabProvider;
          if (local instanceof MemoizedSentinel) {
            local = CustomTabActivityTabProvider_Factory.newInstance();
            customTabActivityTabProvider = DoubleCheck.reentrantCheck(customTabActivityTabProvider, local);
          }
        }
      }
      return (CustomTabActivityTabProvider) local;
    }

    @Override
    public CustomTabBottomBarDelegate resolveBottomBarDelegate() {
      Object local = customTabBottomBarDelegate;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabBottomBarDelegate;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabBottomBarDelegate(ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideWindowAndroidFactory.provideWindowAndroid(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideBrowserControlsSizerFactory.provideBrowserControlsSizer(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvideNightModeControllerFactory.provideNightModeController(baseCustomTabActivityModule), ChromeAppModule_ProvideSystemNightModeMonitorFactory.provideSystemNightModeMonitor(DaggerChromeAppComponent.this.chromeAppModule), resolveTabProvider(), resolveCompositorContentInitializer());
            customTabBottomBarDelegate = DoubleCheck.reentrantCheck(customTabBottomBarDelegate, local);
          }
        }
      }
      return (CustomTabBottomBarDelegate) local;
    }

    @Override
    public CustomTabCompositorContentInitializer resolveCompositorContentInitializer() {
      Object local = customTabCompositorContentInitializer;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabCompositorContentInitializer;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabCompositorContentInitializer(ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), DoubleCheck.lazy(compositorViewHolderProvider()), ChromeActivityCommonsModule_ProvideTabContentManagerSupplierFactory.provideTabContentManagerSupplier(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideCompositorViewHolderInitializerFactory.provideCompositorViewHolderInitializer(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory.provideTopUiThemeColorProvider(baseCustomTabActivityModule));
            customTabCompositorContentInitializer = DoubleCheck.reentrantCheck(customTabCompositorContentInitializer, local);
          }
        }
      }
      return (CustomTabCompositorContentInitializer) local;
    }

    @Override
    public CustomTabDelegateFactory resolveTabDelegateFactory() {
      Object local = customTabDelegateFactory;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabDelegateFactory;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabDelegateFactory(ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), customTabBrowserControlsVisibilityDelegate(), AppHooksModule_ProvideExternalAuthUtilsFactory.provideExternalAuthUtils(DaggerChromeAppComponent.this.appHooksModule), AppHooksModule_ProvideMultiWindowUtilsFactory.provideMultiWindowUtils(DaggerChromeAppComponent.this.appHooksModule), resolveVerifier(), DoubleCheck.lazy(ephemeralTabCoordinatorProvider()), ChromeActivityCommonsModule_ProvideChromeActivityNativeDelegateFactory.provideChromeActivityNativeDelegate(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideBrowserControlsStateProviderFactory.provideBrowserControlsStateProvider(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideFullscreenManagerFactory.provideFullscreenManager(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory.provideTabCreatorManager(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideTabModelSelectorSupplierFactory.provideTabModelSelectorSupplier(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideCompositorViewHolderSupplierFactory.provideCompositorViewHolderSupplier(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideModalDialogManagerSupplierFactory.provideModalDialogManagerSupplier(chromeActivityCommonsModule));
            customTabDelegateFactory = DoubleCheck.reentrantCheck(customTabDelegateFactory, local);
          }
        }
      }
      return (CustomTabDelegateFactory) local;
    }

    @Override
    public CustomTabIncognitoManager resolveCustomTabIncognitoManager() {
      Object local = customTabIncognitoManager;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabIncognitoManager;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabIncognitoManager(ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideWindowAndroidFactory.provideWindowAndroid(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), resolveNavigationController(), resolveTabProvider(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
            customTabIncognitoManager = DoubleCheck.reentrantCheck(customTabIncognitoManager, local);
          }
        }
      }
      return (CustomTabIncognitoManager) local;
    }

    @Override
    public CustomTabIntentHandler resolveIntentHandler() {
      Object local = customTabIntentHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabIntentHandler;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabIntentHandler(resolveTabProvider(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), customTabIntentHandlingStrategy(), BaseCustomTabActivityModule_ProvideIntentIgnoringCriterionFactory.provideIntentIgnoringCriterion(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideContextFactory.provideContext(chromeActivityCommonsModule));
            customTabIntentHandler = DoubleCheck.reentrantCheck(customTabIntentHandler, local);
          }
        }
      }
      return (CustomTabIntentHandler) local;
    }

    @Override
    public CustomTabSessionHandler resolveSessionHandler() {
      Object local = customTabSessionHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabSessionHandler;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabSessionHandler(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), resolveTabProvider(), DoubleCheck.lazy(customTabToolbarCoordinatorProvider()), DoubleCheck.lazy(customTabBottomBarDelegateProvider()), resolveIntentHandler(), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection(), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), DaggerChromeAppComponent.this.resolveSessionDataHolder());
            customTabSessionHandler = DoubleCheck.reentrantCheck(customTabSessionHandler, local);
          }
        }
      }
      return (CustomTabSessionHandler) local;
    }

    @Override
    public CustomTabStatusBarColorProvider resolveCustomTabStatusBarColorProvider() {
      Object local = customTabStatusBarColorProvider;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabStatusBarColorProvider;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabStatusBarColorProvider(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory.provideStatusBarColorController(chromeActivityCommonsModule));
            customTabStatusBarColorProvider = DoubleCheck.reentrantCheck(customTabStatusBarColorProvider, local);
          }
        }
      }
      return (CustomTabStatusBarColorProvider) local;
    }

    @Override
    public CustomTabTaskDescriptionHelper resolveTaskDescriptionHelper() {
      Object local = customTabTaskDescriptionHelper;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabTaskDescriptionHelper;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabTaskDescriptionHelper(ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), resolveTabProvider(), resolveTabObserverRegistrar(), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory.provideTopUiThemeColorProvider(baseCustomTabActivityModule));
            customTabTaskDescriptionHelper = DoubleCheck.reentrantCheck(customTabTaskDescriptionHelper, local);
          }
        }
      }
      return (CustomTabTaskDescriptionHelper) local;
    }

    @Override
    public CustomTabToolbarCoordinator resolveToolbarCoordinator() {
      Object local = customTabToolbarCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabToolbarCoordinator;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabToolbarCoordinator(BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), resolveTabProvider(), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection(), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), ChromeAppModule_ProvideContextFactory.provideContext(DaggerChromeAppComponent.this.chromeAppModule), resolveTabController(), DoubleCheck.lazy(browserControlsVisibilityManagerProvider()), resolveNavigationController(), closeButtonVisibilityManager(), customTabBrowserControlsVisibilityDelegate(), resolveCompositorContentInitializer(), customTabToolbarColorController());
            customTabToolbarCoordinator = DoubleCheck.reentrantCheck(customTabToolbarCoordinator, local);
          }
        }
      }
      return (CustomTabToolbarCoordinator) local;
    }

    @Override
    public ProfileProvider resolveProfileProvider() {
      return new ProfileProvider();
    }

    @Override
    public TabObserverRegistrar resolveTabObserverRegistrar() {
      Object local = tabObserverRegistrar;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = tabObserverRegistrar;
          if (local instanceof MemoizedSentinel) {
            local = new TabObserverRegistrar(ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveTabProvider());
            tabObserverRegistrar = DoubleCheck.reentrantCheck(tabObserverRegistrar, local);
          }
        }
      }
      return (TabObserverRegistrar) local;
    }

    @Override
    public TwaFinishHandler resolveTwaFinishHandler() {
      Object local = twaFinishHandler;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = twaFinishHandler;
          if (local instanceof MemoizedSentinel) {
            local = new TwaFinishHandler(ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection());
            twaFinishHandler = DoubleCheck.reentrantCheck(twaFinishHandler, local);
          }
        }
      }
      return (TwaFinishHandler) local;
    }

    @Override
    public Verifier resolveVerifier() {
      return BaseCustomTabActivityModule_ProvideVerifierFactory.provideVerifier(baseCustomTabActivityModule, DoubleCheck.lazy(webApkVerifierProvider()), DoubleCheck.lazy(addToHomescreenVerifierProvider()), DoubleCheck.lazy(twaVerifierProvider()), DoubleCheck.lazy(emptyVerifierProvider()));
    }

    @Override
    public WebappActivityCoordinator resolveWebappActivityCoordinator() {
      Object local = webappActivityCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webappActivityCoordinator;
          if (local instanceof MemoizedSentinel) {
            local = WebappActivityCoordinator_Factory.newInstance(sharedActivityCoordinator(), ChromeActivityCommonsModule_ProvideActivityFactory.provideActivity(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), ChromeActivityCommonsModule_ProvideActivityTabProviderFactory.provideActivityTabProvider(chromeActivityCommonsModule), resolveCurrentPageVerifier(), webappSplashController(), webappDeferredStartupWithStorageHandler(), webappActionsNotificationManager(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule));
            webappActivityCoordinator = DoubleCheck.reentrantCheck(webappActivityCoordinator, local);
          }
        }
      }
      return (WebappActivityCoordinator) local;
    }

    @Override
    public WebApkActivityCoordinator resolveWebApkActivityCoordinator() {
      Object local = webApkActivityCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = webApkActivityCoordinator;
          if (local instanceof MemoizedSentinel) {
            local = new WebApkActivityCoordinator(webappDeferredStartupWithStorageHandler(), webappDisclosureController(), disclosureInfobar(), webApkActivityLifecycleUmaTracker(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), DoubleCheck.lazy(webApkUpdateManagerProvider()));
            webApkActivityCoordinator = DoubleCheck.reentrantCheck(webApkActivityCoordinator, local);
          }
        }
      }
      return (WebApkActivityCoordinator) local;
    }

    @Override
    public TrustedWebActivityCoordinator resolveTrustedWebActivityCoordinator() {
      Object local = trustedWebActivityCoordinator;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = trustedWebActivityCoordinator;
          if (local instanceof MemoizedSentinel) {
            local = new TrustedWebActivityCoordinator(sharedActivityCoordinator(), trustedWebActivityDisclosureController(), disclosureUiPicker(), trustedWebActivityOpenTimeRecorder(), resolveCurrentPageVerifier(), DoubleCheck.lazy(twaSplashControllerProvider()), BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory.providesBrowserServicesIntentDataProvider(baseCustomTabActivityModule), DaggerChromeAppComponent.this.trustedWebActivityUmaRecorder(), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), twaRegistrar(), clientPackageNameProvider(), AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection(), qualityEnforcer());
            trustedWebActivityCoordinator = DoubleCheck.reentrantCheck(trustedWebActivityCoordinator, local);
          }
        }
      }
      return (TrustedWebActivityCoordinator) local;
    }

    @Override
    public CustomTabTabPersistencePolicy resolveTabPersistencePolicy() {
      Object local = customTabTabPersistencePolicy;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = customTabTabPersistencePolicy;
          if (local instanceof MemoizedSentinel) {
            local = new CustomTabTabPersistencePolicy(ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule));
            customTabTabPersistencePolicy = DoubleCheck.reentrantCheck(customTabTabPersistencePolicy, local);
          }
        }
      }
      return (CustomTabTabPersistencePolicy) local;
    }

    @Override
    public ReparentingTaskProvider resolveReparentingTaskProvider() {
      return new ReparentingTaskProvider();
    }

    @Override
    public SplashController resolveSplashController() {
      Object local = splashController;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = splashController;
          if (local instanceof MemoizedSentinel) {
            local = new SplashController(ChromeActivityCommonsModule_ProvideChromeActivityFactory.provideChromeActivity(chromeActivityCommonsModule), ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory.provideLifecycleDispatcher(chromeActivityCommonsModule), resolveTabObserverRegistrar(), customTabOrientationController(), resolveTwaFinishHandler(), resolveTabProvider(), DoubleCheck.lazy(compositorViewHolderProvider()));
            splashController = DoubleCheck.reentrantCheck(splashController, local);
          }
        }
      }
      return (SplashController) local;
    }

    private final class SwitchingProvider<T> implements Provider<T> {
      private final int id;

      SwitchingProvider(int id) {
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // org.chromium.chrome.browser.customtabs.CustomTabObserver 
          return (T) BaseCustomTabActivityComponentImpl.this.customTabObserver();

          case 1: // org.chromium.chrome.browser.fullscreen.FullscreenManager 
          return (T) ChromeActivityCommonsModule_ProvideFullscreenManagerFactory.provideFullscreenManager(BaseCustomTabActivityComponentImpl.this.chromeActivityCommonsModule);

          case 2: // org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory 
          return (T) BaseCustomTabActivityComponentImpl.this.resolveTabDelegateFactory();

          case 3: // org.chromium.chrome.browser.compositor.CompositorViewHolder 
          return (T) ChromeActivityCommonsModule_ProvideCompositorViewHolderFactory.provideCompositorViewHolder(BaseCustomTabActivityComponentImpl.this.chromeActivityCommonsModule);

          case 4: // org.chromium.chrome.browser.customtabs.CustomTabIncognitoManager 
          return (T) BaseCustomTabActivityComponentImpl.this.resolveCustomTabIncognitoManager();

          case 5: // org.chromium.ui.base.ActivityWindowAndroid 
          return (T) ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory.provideActivityWindowAndroid(BaseCustomTabActivityComponentImpl.this.chromeActivityCommonsModule);

          case 6: // org.chromium.chrome.browser.browser_controls.BrowserControlsVisibilityManager 
          return (T) ChromeActivityCommonsModule_ProvideBrowserControlsVisibilityManagerFactory.provideBrowserControlsVisibilityManager(BaseCustomTabActivityComponentImpl.this.chromeActivityCommonsModule);

          case 7: // org.chromium.chrome.browser.compositor.bottombar.ephemeraltab.EphemeralTabCoordinator 
          return (T) BaseCustomTabActivityComponentImpl.this.ephemeralTabCoordinator();

          case 8: // org.chromium.chrome.browser.customtabs.content.DefaultCustomTabIntentHandlingStrategy 
          return (T) BaseCustomTabActivityComponentImpl.this.defaultCustomTabIntentHandlingStrategy();

          case 9: // org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaIntentHandlingStrategy 
          return (T) BaseCustomTabActivityComponentImpl.this.twaIntentHandlingStrategy();

          case 10: // org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator 
          return (T) BaseCustomTabActivityComponentImpl.this.resolveToolbarCoordinator();

          case 11: // org.chromium.chrome.browser.customtabs.CustomTabBottomBarDelegate 
          return (T) BaseCustomTabActivityComponentImpl.this.resolveBottomBarDelegate();

          case 12: // org.chromium.chrome.browser.browserservices.ui.controller.webapps.WebApkVerifier 
          return (T) BaseCustomTabActivityComponentImpl.this.webApkVerifier();

          case 13: // org.chromium.chrome.browser.browserservices.ui.controller.webapps.AddToHomescreenVerifier 
          return (T) BaseCustomTabActivityComponentImpl.this.addToHomescreenVerifier();

          case 14: // org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TwaVerifier 
          return (T) BaseCustomTabActivityComponentImpl.this.twaVerifier();

          case 15: // org.chromium.chrome.browser.browserservices.ui.controller.EmptyVerifier 
          return (T) BaseCustomTabActivityComponentImpl.this.emptyVerifier();

          case 16: // org.chromium.chrome.browser.customtabs.features.ImmersiveModeController 
          return (T) BaseCustomTabActivityComponentImpl.this.immersiveModeController();

          case 17: // org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager 
          return (T) ChromeActivityCommonsModule_ProvideSnackbarManagerFactory.provideSnackbarManager(BaseCustomTabActivityComponentImpl.this.chromeActivityCommonsModule);

          case 18: // org.chromium.chrome.browser.metrics.ActivityTabStartupMetricsTracker 
          return (T) ChromeActivityCommonsModule_ProvideActivityTabStartupMetricsTrackerFactory.provideActivityTabStartupMetricsTracker(BaseCustomTabActivityComponentImpl.this.chromeActivityCommonsModule);

          case 19: // org.chromium.chrome.browser.webapps.WebApkUpdateManager 
          return (T) BaseCustomTabActivityComponentImpl.this.webApkUpdateManager();

          case 20: // org.chromium.chrome.browser.browserservices.ui.view.DisclosureInfobar 
          return (T) BaseCustomTabActivityComponentImpl.this.disclosureInfobar();

          case 21: // org.chromium.chrome.browser.browserservices.ui.view.DisclosureSnackbar 
          return (T) BaseCustomTabActivityComponentImpl.this.disclosureSnackbar();

          case 22: // org.chromium.chrome.browser.browserservices.ui.view.DisclosureNotification 
          return (T) BaseCustomTabActivityComponentImpl.this.disclosureNotification();

          case 23: // org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity.TwaSplashController 
          return (T) BaseCustomTabActivityComponentImpl.this.twaSplashController();

          case 24: // org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.ClientAppDataRecorder 
          return (T) BaseCustomTabActivityComponentImpl.this.clientAppDataRecorder();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // org.chromium.chrome.browser.preferences.SharedPreferencesManager 
        return (T) ChromeAppModule_ProvidesSharedPreferencesManagerFactory.providesSharedPreferencesManager(DaggerChromeAppComponent.this.chromeAppModule);

        case 1: // org.chromium.chrome.browser.browserservices.permissiondelegation.NotificationChannelPreserver 
        return (T) DaggerChromeAppComponent.this.notificationChannelPreserver();

        case 2: // org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity.SplashImageHolder 
        return (T) DaggerChromeAppComponent.this.splashImageHolder();

        case 3: // org.chromium.chrome.browser.customtabs.CustomTabsConnection 
        return (T) AppHooksModule_ProvideCustomTabsConnectionFactory.provideCustomTabsConnection();

        case 4: // org.chromium.chrome.browser.tabmodel.AsyncTabParamsManager 
        return (T) ChromeAppModule_ProvideAsyncTabParamsManagerFactory.provideAsyncTabParamsManager(DaggerChromeAppComponent.this.chromeAppModule);

        default: throw new AssertionError(id);
      }
    }
  }
}
