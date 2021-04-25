// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.flags;

/**
 * Contains all of the command line switches that are specific to the chrome/
 * portion of Chromium on Android.
 */
public abstract class ChromeSwitches {
    // Switches used from Java.  Please continue switch style used Chrome where
    // options-have-hyphens and are_not_split_with_underscores.

    /** Whether fullscreen support is disabled (auto hiding controls, etc...). */
    public static final String DISABLE_FULLSCREEN = "disable-fullscreen";

    /**
     * When fullscreen support is enabled, this will disable the timer which
     * ensures the browser controls are visible for a minium period of time.
     */
    public static final String DISABLE_MINIMUM_SHOW_DURATION = "disable-minimum-show-duration";

    /** Whether instant is disabled. */
    public static final String DISABLE_INSTANT = "disable-instant";

    /** Enables StrictMode violation detection. By default this logs violations to logcat. */
    public static final String STRICT_MODE = "strict-mode";

    /** Don't restore persistent state from saved files on startup. */
    public static final String NO_RESTORE_STATE = "no-restore-state";

    /** Disable the First Run Experience. */
    public static final String DISABLE_FIRST_RUN_EXPERIENCE = "disable-fre";

    /**
     * Forces the First Run Experience (FRE) flow complete check to always return true.
     */
    public static final String FORCE_FIRST_RUN_FLOW_COMPLETE_FOR_TESTING =
            "force-first-run-flow-complete";

    /** Force the crash dump to be uploaded regardless of preferences. */
    public static final String FORCE_CRASH_DUMP_UPLOAD = "force-dump-upload";

    /** Disable Contextual Search. */
    public static final String DISABLE_CONTEXTUAL_SEARCH = "disable-contextual-search";

    /** Enable Contextual Search. */
    public static final String ENABLE_CONTEXTUAL_SEARCH = "enable-contextual-search";

    // How many thumbnails should we allow in the cache (per tab stack)?
    public static final String THUMBNAILS = "thumbnails";

    // How many "approximated" thumbnails should we allow in the cache
    // (per tab stack)?  These take very low memory but have poor quality.
    public static final String APPROXIMATION_THUMBNAILS = "approximation-thumbnails";

    /**
     * Disable bottom infobar-like Reader Mode panel.
     */
    public static final String DISABLE_READER_MODE_BOTTOM_BAR = "disable-reader-mode-bottom-bar";

    /**
     * Forces the update state to be set to the given state if the value is {@link
     * org.chromium.chrome.browser.omaha.UpdateMenuItemHelper#NONE_SWITCH_VALUE}, {@link
     * org.chromium.chrome.browser.omaha.UpdateMenuItemHelper#UPDATE_AVAILABLE_SWITCH_VALUE},
     * {@link
     * org.chromium.chrome.browser.omaha.UpdateMenuItemHelper#UNSUPPORTED_OS_VERSION_SWITCH_VALUE}.
     */
    public static final String FORCE_UPDATE_MENU_UPDATE_TYPE = "force-update-menu-type";

    /**
     * Disable multiwindow tab merging for testing.
     */
    public static final String DISABLE_TAB_MERGING_FOR_TESTING = "disable-tab-merging";


    /**
     * Disable native initialization for testing.
     */
    public static final String DISABLE_NATIVE_INITIALIZATION = "disable-native-initialization";

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Native Switches
    ///////////////////////////////////////////////////////////////////////////////////////////////

    /** Enable the DOM Distiller. */
    public static final String ENABLE_DOM_DISTILLER = "enable-dom-distiller";

    /**
     * Use sandbox Wallet environment for requestAutocomplete.
     * Native switch - autofill::switches::kWalletServiceUseSandbox.
     */
    public static final String USE_SANDBOX_WALLET_ENVIRONMENT = "wallet-service-use-sandbox";

    /**
     * Change Google base URL.
     * Native switch - switches::kGoogleBaseURL.
     */
    public static final String GOOGLE_BASE_URL = "google-base-url";

    /**
     * Enables hung renderer InfoBar activation for unresponsive web content.
     * Native switch - switches::kEnableHungRendererInfoBar
     */
    public static final String ENABLE_HUNG_RENDERER_INFOBAR = "enable-hung-renderer-infobar";

    /**
     * Set the partner-defined homepage URL, for testing.
     */
    public static final String PARTNER_HOMEPAGE_FOR_TESTING = "partner-homepage-for-testing";

    /**
     * Forces the WebAPK runtime dex to be extracted each time that Chrome is started.
     */
    public static final String ALWAYS_EXTRACT_WEBAPK_RUNTIME_DEX_ON_STARTUP =
            "always-extract-webapk-dex-on-startup";

    /** Treats all WebAPKs as valid - useful only for local testing. */
    public static final String SKIP_WEBAPK_VERIFICATION = "skip-webapk-verification";

    /**
     * Forces a check for whether the WebAPK's Web Manifest has changed each time that a WebAPK is
     * launched.
     */
    public static final String CHECK_FOR_WEB_MANIFEST_UPDATE_ON_STARTUP =
            "check-for-web-manifest-update-on-startup";

    /** Enable Vr Shell development environment. */
    public static final String ENABLE_VR_SHELL_DEV = "enable-vr-shell-dev";

    /** Command line switch for Chrome Home's swipe logic. */
    public static final String CHROME_HOME_SWIPE_LOGIC = "chrome-home-swipe-logic";

    /** Switch for enabling "restricted area" swipe logic for Chrome Home. */
    public static final String CHROME_HOME_SWIPE_LOGIC_RESTRICT_AREA = "restrict-area";

    /**
     * Switch for enabling "velocity" swipe logic for Chrome Home. This means the flings will not
     * open the sheet; the user must slide up the sheet relatively slowly.
     */
    public static final String CHROME_HOME_SWIPE_LOGIC_VELOCITY = "velocity";

    /** Switch for enabling the Chrome Survey. */
    public static final String CHROME_FORCE_ENABLE_SURVEY = "force-enable-chrome-survey";

    /** Switch to enable incognito tabs to be seen in Android Recents. */
    public static final String ENABLE_INCOGNITO_SNAPSHOTS_IN_ANDROID_RECENTS =
            "enable-incognito-snapshots-in-android-recents";

    /** Open all custom tabs in a new task. Used only for experimental purposes. */
    public static final String OPEN_CUSTOM_TABS_IN_NEW_TASK = "open-custom-tabs-in-new-task";

    /**
     * Don't crash on undispatched VIEW intents sent to .Main.
     * See ChromeTabbedActivity.maybeDispatchExplicitMainViewIntent() for more info.
     */
    public static final String DONT_CRASH_ON_VIEW_MAIN_INTENTS = "dont-crash-on-view-main-intents";

    /**
     * Disables digital asset link verification for the given website.
     */
    public static final String DISABLE_DIGITAL_ASSET_LINK_VERIFICATION =
            "disable-digital-asset-link-verification-for-url";

    /**
     * Forces Trusted Web Activities to show the the Disclosure Toast every time.
     */
    public static final String FORCE_TRUSTED_WEB_ACTIVITY_DISCLOSURE =
            "force-trusted-web-activity-disclosure";

    /**
     * Allows first-party apps to launch incognito custom tabs.
     */
    public static final String ENABLE_INCOGNITO_CUSTOM_TABS = "enable-incognito-custom-tabs";

    /** Force enable special user handling. */
    public static final String FORCE_ENABLE_SPECIAL_USER = "force-enable-special-user";

    /** Set the configuration to trigger the feed header menu IPH. */
    public static final String FEED_HEADER_MENU_IPH_TRIGGER_CONFIG =
            "feed-header-menu-iph-trigger-config";

    /** Disable the default browser promo. */
    public static final String DISABLE_DEFAULT_BROWSER_PROMO =
            "disable-default-browser-promo";


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../chrome/common/chrome_switches.cc
    // Into
    //     ../../chrome/browser/flags/android/java_templates/ChromeSwitches.java.tmpl

    // Allows third-party content included on a page to prompt for a HTTP basic
    // auth username/password pair.
    public static final String ALLOW_CROSS_ORIGIN_AUTH_PROMPT = "allow-cross-origin-auth-prompt";

    // Allow non-secure origins to use the screen capture API and the desktopCapture
    // extension API.
    public static final String ALLOW_HTTP_SCREEN_CAPTURE = "allow-http-screen-capture";

    // Allows profiles to be created outside of the user data dir.
    // TODO(https://crbug.com/1060366): Various places in Chrome assume that all
    // profiles are within the user data dir. Some tests need to violate that
    // assumption. The switch should be removed after this workaround is no longer
    // needed.
    public static final String ALLOW_PROFILES_OUTSIDE_USER_DIR = "allow-profiles-outside-user-dir";

    // By default, an https page cannot run JavaScript, CSS or plugins from http
    // URLs. This provides an override to get the old insecure behavior.
    public static final String ALLOW_RUNNING_INSECURE_CONTENT = "allow-running-insecure-content";

    // Allows Web Push notifications that do not show a notification.
    public static final String ALLOW_SILENT_PUSH = "allow-silent-push";

    // Specifies that the associated value should be launched in "application"
    // mode.
    public static final String APP = "app";

    // Specifies that the extension-app with the specified id should be launched
    // according to its configuration.
    public static final String APP_ID = "app-id";

    // Overrides the launch url of an app with the specified url. This is used
    // along with kAppId to launch a given app with the url corresponding to an item
    // in the app's shortcuts menu.
    public static final String APP_LAUNCH_URL_FOR_SHORTCUTS_MENU_ITEM = "app-launch-url-for-shortcuts-menu-item";

    // Value of GAIA auth code for --force-app-mode.
    public static final String APP_MODE_AUTH_CODE = "app-mode-auth-code";

    // Value of OAuth2 refresh token for --force-app-mode.
    public static final String APP_MODE_O_AUTH2_TOKEN = "app-mode-oauth-token";

    // The URL that the webstore APIs download extensions from.
    // Note: the URL must contain one '%s' for the extension ID.
    public static final String APPS_GALLERY_DOWNLOAD_URL = "apps-gallery-download-url";

    // The update url used by gallery/webstore extensions.
    public static final String APPS_GALLERY_UPDATE_URL = "apps-gallery-update-url";

    // The URL to use for the gallery link in the app launcher.
    public static final String APPS_GALLERY_URL = "apps-gallery-url";

    // Allowlist for Negotiate Auth servers
    public static final String AUTH_SERVER_ALLOWLIST = "auth-server-whitelist";

    // This flag makes Chrome auto-open DevTools window for each tab. It is
    // intended to be used by developers and automation to not require user
    // interaction for opening DevTools.
    public static final String AUTO_OPEN_DEV_TOOLS_FOR_TABS = "auto-open-devtools-for-tabs";

    // This flag makes Chrome auto-select the provided choice when an extension asks
    // permission to start desktop capture. Should only be used for tests. For
    // instance, --auto-select-desktop-capture-source="Entire screen" will
    // automatically select sharing the entire screen in English locales. The switch
    // value only needs to be substring of the capture source name, i.e. "display"
    // would match "Built-in display" and "External display", whichever comes first.
    public static final String AUTO_SELECT_DESKTOP_CAPTURE_SOURCE = "auto-select-desktop-capture-source";

    // This flag causes the user engagement checks for showing app banners to be
    // bypassed. It is intended to be used by developers who wish to test that their
    // sites otherwise meet the criteria needed to show app banners.
    public static final String BYPASS_APP_BANNER_ENGAGEMENT_CHECKS = "bypass-app-banner-engagement-checks";

    // How often (in seconds) to check for updates. Should only be used for testing
    // purposes.
    public static final String CHECK_FOR_UPDATE_INTERVAL_SEC = "check-for-update-interval";

    // Comma-separated list of SSL cipher suites to disable.
    public static final String CIPHER_SUITE_BLACKLIST = "cipher-suite-blacklist";

    // Tells chrome to display the cloud print dialog and upload the specified file
    // for printing.
    public static final String CLOUD_PRINT_FILE = "cloud-print-file";

    // Specifies the mime type to be used when uploading data from the file
    // referenced by cloud-print-file. Defaults to "application/pdf" if
    // unspecified.
    public static final String CLOUD_PRINT_FILE_TYPE = "cloud-print-file-type";

    // Used with kCloudPrintFile to specify a title for the resulting print job.
    public static final String CLOUD_PRINT_JOB_TITLE = "cloud-print-job-title";

    // Used with kCloudPrintFile to specify a JSON print ticket for the resulting
    // print job. Defaults to null if unspecified.
    public static final String CLOUD_PRINT_PRINT_TICKET = "cloud-print-print-ticket";

    // DO NOT CHANGE THIS VALUE. Cloud printing relies on an external binary
    // launching Chrome with this process type.
    public static final String CLOUD_PRINT_SERVICE_PROCESS = "service";

    // Setup cloud print proxy for provided printers. This does not start
    // service or register proxy for autostart.
    public static final String CLOUD_PRINT_SETUP_PROXY = "cloud-print-setup-proxy";

    // For example:
    //    --crash-on-hang-threads=UI:18,IO:18 --> Crash the browser if UI or IO is
    //    not responsive for 18 seconds while the other browser thread is
    //    responsive.
    public static final String CRASH_ON_HANG_THREADS = "crash-on-hang-threads";

    // Some platforms like ChromeOS default to empty desktop.
    // Browser tests may need to add this switch so that at least one browser
    // instance is created on startup.
    // TODO(nkostylev): Investigate if this switch could be removed.
    // (http://crbug.com/148675)
    public static final String CREATE_BROWSER_ON_STARTUP_FOR_TESTS = "create-browser-on-startup-for-tests";

    // Specifies the http:// endpoint which will be used to serve
    // devtools://devtools/custom/<path>
    // Or a file:// URL to specify a custom file path to load from for
    // devtools://devtools/bundled/<path>
    public static final String CUSTOM_DEVTOOLS_FRONTEND = "custom-devtools-frontend";

    // Enables a frame context menu item that toggles the frame in and out of glass
    // mode (Windows Vista and up only).
    public static final String DEBUG_ENABLE_FRAME_TOGGLE = "debug-enable-frame-toggle";

    // Adds debugging entries such as Inspect Element to context menus of packed
    // apps.
    public static final String DEBUG_PACKED_APPS = "debug-packed-apps";

    // Passes command line parameters to the DevTools front-end.
    public static final String DEV_TOOLS_FLAGS = "devtools-flags";

    // Triggers a plethora of diagnostic modes.
    public static final String DIAGNOSTICS = "diagnostics";

    // Sets the output format for diagnostic modes enabled by diagnostics flag.
    public static final String DIAGNOSTICS_FORMAT = "diagnostics-format";

    // Tells the diagnostics mode to do the requested recovery step(s).
    public static final String DIAGNOSTICS_RECOVERY = "diagnostics-recovery";

    // Disable auto-reload of error pages.
    public static final String DISABLE_AUTO_RELOAD = "disable-auto-reload";

    // Disable several subsystems which run network requests in the background.
    // This is for use when doing network performance testing to avoid noise in the
    // measurements.
    public static final String DISABLE_BACKGROUND_NETWORKING = "disable-background-networking";

    // Disables the client-side phishing detection feature. Note that even if
    // client-side phishing detection is enabled, it will only be active if the
    // user has opted in to UMA stats and SafeBrowsing is enabled in the
    // preferences.
    public static final String DISABLE_CLIENT_SIDE_PHISHING_DETECTION = "disable-client-side-phishing-detection";

    // Disable default component extensions with background pages - useful for
    // performance tests where these pages may interfere with perf results.
    public static final String DISABLE_COMPONENT_EXTENSIONS_WITH_BACKGROUND_PAGES = "disable-component-extensions-with-background-pages";


    public static final String DISABLE_COMPONENT_UPDATE = "disable-component-update";

    // Disables installation of default apps on first run. This is used during
    // automated testing.
    public static final String DISABLE_DEFAULT_APPS = "disable-default-apps";

    // Disables Domain Reliability Monitoring.
    public static final String DISABLE_DOMAIN_RELIABILITY = "disable-domain-reliability";

    // Disable extensions.
    public static final String DISABLE_EXTENSIONS = "disable-extensions";

    // Disable extensions except those specified in a comma-separated list.
    public static final String DISABLE_EXTENSIONS_EXCEPT = "disable-extensions-except";

    // Disable checking for user opt-in for extensions that want to inject script
    // into file URLs (ie, always allow it). This is used during automated testing.
    public static final String DISABLE_EXTENSIONS_FILE_ACCESS_CHECK = "disable-extensions-file-access-check";

    // Disables print preview (For testing, and for users who don't like us. :[ )
    public static final String DISABLE_PRINT_PREVIEW = "disable-print-preview";

    // Normally when the user attempts to navigate to a page that was the result of
    // a post we prompt to make sure they want to. This switch may be used to
    // disable that check. This switch is used during automated testing.
    public static final String DISABLE_PROMPT_ON_REPOST = "disable-prompt-on-repost";

    // Some tests seem to require the application to close when the last
    // browser window is closed. Thus, we need a switch to force this behavior
    // for ChromeOS Aura, disable "zero window mode".
    // TODO(pkotwicz): Investigate if this bug can be removed.
    // (http://crbug.com/119175)
    public static final String DISABLE_ZERO_BROWSERS_OPEN_FOR_TESTS = "disable-zero-browsers-open-for-tests";

    // Use a specific disk cache location, rather than one derived from the
    // UserDatadir.
    public static final String DISK_CACHE_DIR = "disk-cache-dir";

    // Forces the maximum disk space to be used by the disk cache, in bytes.
    public static final String DISK_CACHE_SIZE = "disk-cache-size";

    // Requests that a running browser process dump its collected histograms to a
    // given file. The file is overwritten if it exists.
    public static final String DUMP_BROWSER_HISTOGRAMS = "dump-browser-histograms";

    // Enable auto-reload of error pages.
    public static final String ENABLE_AUTO_RELOAD = "enable-auto-reload";

    // If the WebRTC logging private API is active, enables audio debug recordings.
    public static final String ENABLE_AUDIO_DEBUG_RECORDINGS_FROM_EXTENSION = "enable-audio-debug-recordings-from-extension";

    // Enables the multi-level undo system for bookmarks.
    public static final String ENABLE_BOOKMARK_UNDO = "enable-bookmark-undo";

    // This applies only when the process type is "service". Enables the Cloud Print
    // Proxy component within the service process.
    public static final String ENABLE_CLOUD_PRINT_PROXY = "enable-cloud-print-proxy";

    // Enables CriticalPersistedTabData - redesign/replacement for TabState
    public static final String ENABLE_CRITICAL_PERSISTED_TAB_DATA = "enable-critical-persisted-tab-data";

    // Enable device discovery notifications.
    public static final String ENABLE_DEVICE_DISCOVERY_NOTIFICATIONS = "enable-device-discovery-notifications";

    // Enables Domain Reliability Monitoring.
    public static final String ENABLE_DOMAIN_RELIABILITY = "enable-domain-reliability";

    // Enables logging for extension activity.
    public static final String ENABLE_EXTENSION_ACTIVITY_LOGGING = "enable-extension-activity-logging";


    public static final String ENABLE_EXTENSION_ACTIVITY_LOG_TESTING = "enable-extension-activity-log-testing";

    // Runs the Native Client inside the renderer process and enables GPU plugin
    // (internally adds lEnableGpuPlugin to the command line).
    public static final String ENABLE_NA_CL = "enable-nacl";

    // Enables the network-related benchmarking extensions.
    public static final String ENABLE_NET_BENCHMARKING = "enable-net-benchmarking";

    // Enables a number of potentially annoying security features (strict mixed
    // content mode, powerful feature restrictions, etc.)
    public static final String ENABLE_POTENTIALLY_ANNOYING_SECURITY_FEATURES = "enable-potentially-annoying-security-features";

    // Name of the command line flag to force content verification to be on in one
    // of various modes.
    public static final String EXTENSION_CONTENT_VERIFICATION = "extension-content-verification";

    // Values for the kExtensionContentVerification flag.
    // See ContentVerifierDelegate::Mode for more explanation.
    public static final String EXTENSION_CONTENT_VERIFICATION_BOOTSTRAP = "bootstrap";


    public static final String EXTENSION_CONTENT_VERIFICATION_ENFORCE = "enforce";


    public static final String EXTENSION_CONTENT_VERIFICATION_ENFORCE_STRICT = "enforce_strict";

    // Turns on extension install verification if it would not otherwise have been
    // turned on.
    public static final String EXTENSIONS_INSTALL_VERIFICATION = "extensions-install-verification";

    // Specifies a comma-separated list of extension ids that should be forced to
    // be treated as not from the webstore when doing install verification.
    public static final String EXTENSIONS_NOT_WEBSTORE = "extensions-not-webstore";

    // Forces application mode. This hides certain system UI elements and forces
    // the app to be installed if it hasn't been already.
    public static final String FORCE_APP_MODE = "force-app-mode";

    // Displays the First Run experience when the browser is started, regardless of
    // whether or not it's actually the First Run (this overrides kNoFirstRun).
    public static final String FORCE_FIRST_RUN = "force-first-run";

    // Forces Chrome to use a stacked tab strip layout.
    public static final String FORCE_STACKED_TAB_STRIP_LAYOUT = "force-stacked-tab-strip-layout";

    // Specifies which page will be displayed in newly-opened tabs. We need this
    // for testing purposes so that the UI tests don't depend on what comes up for
    // http://google.com.
    public static final String HOME_PAGE = "homepage";

    // Causes the browser to launch directly in incognito mode.
    public static final String INCOGNITO = "incognito";

    // Installs an autogenerated theme based on the given RGB value.
    // The format is "r,g,b", where r, g, b are a numeric values from 0 to 255.
    public static final String INSTALL_AUTOGENERATED_THEME = "install-autogenerated-theme";

    // Causes Chrome to initiate an installation flow for the given app.
    public static final String INSTALL_CHROME_APP = "install-chrome-app";

    // A list of allowlists to install for a supervised user, for testing.
    // The list is of the following form: <id>[:<name>],[<id>[:<name>],...]
    public static final String INSTALL_SUPERVISED_USER_ALLOWLISTS = "install-supervised-user-whitelists";

    // Marks a renderer as an Instant process.
    public static final String INSTANT_PROCESS = "instant-process";

    // Used for testing - keeps browser alive after last browser window closes.
    public static final String KEEP_ALIVE_FOR_TEST = "keep-alive-for-test";

    // Enable kiosk mode. Please note this is not Chrome OS kiosk mode.
    public static final String KIOSK_MODE = "kiosk";

    // Enable automatically pressing the print button in print preview.
    public static final String KIOSK_MODE_PRINTING = "kiosk-printing";

    // Loads the Media Router component extension on startup.
    public static final String LOAD_MEDIA_ROUTER_COMPONENT_EXTENSION = "load-media-router-component-extension";

    // Makes Chrome default browser
    public static final String MAKE_DEFAULT_BROWSER = "make-default-browser";

    // Allows setting a different destination ID for connection-monitoring GCM
    // messages. Useful when running against a non-prod management server.
    public static final String MONITORING_DESTINATION_ID = "monitoring-destination-id";

    // Requests a native messaging connection be established between the native
    // messaging host named by this switch and the extension with ID specified by
    // kNativeMessagingConnectExtension.
    public static final String NATIVE_MESSAGING_CONNECT_HOST = "native-messaging-connect-host";

    // Requests a native messaging connection be established between the extension
    // with ID specified by this switch and the native messaging host named by the
    // kNativeMessagingConnectHost switch.
    public static final String NATIVE_MESSAGING_CONNECT_EXTENSION = "native-messaging-connect-extension";

    // If set when kNativeMessagingConnectHost and kNativeMessagingConnectExtension
    // are specified, is reflected to the native messaging host as a command line
    // parameter.
    public static final String NATIVE_MESSAGING_CONNECT_ID = "native-messaging-connect-id";

    // Disables the default browser check. Useful for UI/browser tests where we
    // want to avoid having the default browser info-bar displayed.
    public static final String NO_DEFAULT_BROWSER_CHECK = "no-default-browser-check";

    // Disables all experiments set on about:flags. Does not disable about:flags
    // itself. Useful if an experiment makes chrome crash at startup: One can start
    // chrome with --no-experiments, disable the problematic lab at about:flags and
    // then restart chrome without this switch again.
    public static final String NO_EXPERIMENTS = "no-experiments";

    // Skip First Run tasks, whether or not it's actually the First Run. Overridden
    // by kForceFirstRun. This does not drop the First Run sentinel and thus doesn't
    // prevent first run from occuring the next time chrome is launched without this
    // flag.
    public static final String NO_FIRST_RUN = "no-first-run";

    // Don't send hyperlink auditing pings
    public static final String NO_PINGS = "no-pings";

    // Don't use a proxy server, always make direct connections. Overrides any
    // other proxy server flags that are passed.
    public static final String NO_PROXY_SERVER = "no-proxy-server";

    // Disables the service process from adding itself as an autorun process. This
    // does not delete existing autorun registrations, it just prevents the service
    // from registering a new one.
    public static final String NO_SERVICE_AUTORUN = "no-service-autorun";

    // Does not automatically open a browser window on startup (used when
    // launching Chrome for the purpose of hosting background apps).
    public static final String NO_STARTUP_WINDOW = "no-startup-window";

    // Calculate the hash of an MHTML file as it is being saved.
    // The browser process will write the serialized MHTML contents to a file and
    // calculate its hash as it is streamed back from the renderer via a Mojo data
    // pipe.
    public static final String ON_THE_FLY_MHTML_HASH_COMPUTATION = "on-the-fly-mhtml-hash-computation";

    // Launches URL in new browser window.
    public static final String OPEN_IN_NEW_WINDOW = "new-window";

    // Packages an extension to a .crx installable file from a given directory.
    public static final String PACK_EXTENSION = "pack-extension";

    // Optional PEM private key to use in signing packaged .crx.
    public static final String PACK_EXTENSION_KEY = "pack-extension-key";

    // Development flag for permission request API. This flag is needed until
    // the API is finalized.
    // TODO(bauerb): Remove when this flag is not needed anymore.
    public static final String PERMISSION_REQUEST_API_SCOPE = "permission-request-api-scope";

    // Development flag for permission request API. This flag is needed until
    // the API is finalized.
    // TODO(bauerb): Remove when this flag is not needed anymore.
    public static final String PERMISSION_REQUEST_API_URL = "permission-request-api-url";

    // Use IPv6 only for privet HTTP.
    public static final String PRIVET_I_PV6_ONLY = "privet-ipv6-only";

    // Outputs the product version information and quit. Used as an internal api to
    // detect the installed version of Chrome on Linux.
    public static final String PRODUCT_VERSION = "product-version";

    // Selects directory of profile to associate with the first browser launched.
    public static final String PROFILE_DIRECTORY = "profile-directory";

    // Forces proxy auto-detection.
    public static final String PROXY_AUTO_DETECT = "proxy-auto-detect";

    // Specifies a list of hosts for whom we bypass proxy settings and use direct
    // connections. Ignored if --proxy-auto-detect or --no-proxy-server are also
    // specified. This is a comma-separated list of bypass rules. See:
    // "net/proxy_resolution/proxy_bypass_rules.h" for the format of these rules.
    public static final String PROXY_BYPASS_LIST = "proxy-bypass-list";

    // Uses the pac script at the given URL
    public static final String PROXY_PAC_URL = "proxy-pac-url";

    // Porvides a list of addresses to discover DevTools remote debugging targets.
    // The format is <host>:<port>,...,<host>:port.
    public static final String REMOTE_DEBUGGING_TARGETS = "remote-debugging-targets";

    // Indicates the last session should be restored on startup. This overrides the
    // preferences value. Note that this does not force automatic session restore
    // following a crash, so as to prevent a crash loop. This switch is used to
    // implement support for OS-specific "continue where you left off" functionality
    // on OS X and Windows.
    public static final String RESTORE_LAST_SESSION = "restore-last-session";

    // Disable saving pages as HTML-only, disable saving pages as HTML Complete
    // (with a directory of sub-resources). Enable only saving pages as MHTML.
    // See http://crbug.com/120416 for how to remove this switch.
    public static final String SAVE_PAGE_AS_MHTML = "save-page-as-mhtml";

    // Sets the Reporting API delay to under a second to allow much quicker reports.
    public static final String SHORT_REPORTING_DELAY = "short-reporting-delay";

    // Does not show an infobar when an extension attaches to a page using
    // chrome.debugger page. Required to attach to extension background pages.
    public static final String SILENT_DEBUGGER_EXTENSION_API = "silent-debugger-extension-api";

    // Causes Chrome to launch without opening any windows by default. Useful if
    // one wishes to use Chrome as an ash server.
    public static final String SILENT_LAUNCH = "silent-launch";

    // Simulates a critical update being available.
    public static final String SIMULATE_CRITICAL_UPDATE = "simulate-critical-update";

    // Simulates that elevation is needed to recover upgrade channel.
    public static final String SIMULATE_ELEVATED_RECOVERY = "simulate-elevated-recovery";

    // Simulates that current version is outdated.
    public static final String SIMULATE_OUTDATED = "simulate-outdated";

    // Simulates that current version is outdated and auto-update is off.
    public static final String SIMULATE_OUTDATED_NO_AU = "simulate-outdated-no-au";

    // Simulates an update being available.
    public static final String SIMULATE_UPGRADE = "simulate-upgrade";

    // Specifies the maximum SSL/TLS version ("tls1.2" or "tls1.3").
    public static final String SSL_VERSION_MAX = "ssl-version-max";

    // Specifies the minimum SSL/TLS version ("tls1", "tls1.1", "tls1.2", or
    // "tls1.3").
    public static final String SSL_VERSION_MIN = "ssl-version-min";

    // TLS 1.0 mode for the |kSSLVersionMin| switch.
    public static final String SSL_VERSION_TL_SV1 = "tls1";

    // TLS 1.1 mode for the |kSSLVersionMin| switch.
    public static final String SSL_VERSION_TL_SV11 = "tls1.1";

    // TLS 1.2 mode for |kSSLVersionMax| and |kSSLVersionMin| switches.
    public static final String SSL_VERSION_TL_SV12 = "tls1.2";

    // TLS 1.3 mode for |kSSLVersionMax| and |kSSLVersionMin| switches.
    public static final String SSL_VERSION_TL_SV13 = "tls1.3";

    // Starts the browser maximized, regardless of any previous settings.
    public static final String START_MAXIMIZED = "start-maximized";

    // Starts the stack sampling profiler in the child process.
    public static final String START_STACK_PROFILER = "start-stack-profiler";

    // Browser test mode for the |kStartStackProfiler| switch. Limits the profile
    // durations to be significantly less than the test timeout.
    public static final String START_STACK_PROFILER_BROWSER_TEST = "browser-test";

    // Interval, in minutes, used for storage pressure notification throttling.
    // Useful for developers testing applications that might use non-trivial
    // amounts of disk space.
    public static final String STORAGE_PRESSURE_NOTIFICATION_INTERVAL = "storage-pressure-notification-interval";

    // Sets the supervised user ID for any loaded or newly created profile to the
    // given value. Pass an empty string to mark the profile as non-supervised.
    // Used for testing.
    public static final String SUPERVISED_USER_ID = "managed-user-id";

    // Frequency in Milliseconds for system log uploads. Should only be used for
    // testing purposes.
    public static final String SYSTEM_LOG_UPLOAD_FREQUENCY = "system-log-upload-frequency";

    // Passes the name of the current running automated test to Chrome.
    public static final String TEST_NAME = "test-name";

    // Identifies a list of download sources as trusted, but only if proper group
    // policy is set.
    public static final String TRUSTED_DOWNLOAD_SOURCES = "trusted-download-sources";

    // Experimental. Shows a dialog asking the user to try chrome. This flag is to
    // be used only by the upgrade process.
    public static final String TRY_CHROME_AGAIN = "try-chrome-again";

    // Overrides per-origin quota settings to unlimited storage for any
    // apps/origins.  This should be used only for testing purpose.
    public static final String UNLIMITED_STORAGE = "unlimited-storage";

    // A string used to override the default user agent with a custom one.
    public static final String USER_AGENT = "user-agent";

    // Specifies the user data directory, which is where the browser will look for
    // all of its state.
    public static final String USER_DATA_DIR = "user-data-dir";

    // Examines a .crx for validity and prints the result.
    public static final String VALIDATE_CRX = "validate-crx";

    // Prints version information and quits.
    public static final String VERSION = "version";

    // Sets the delay (in seconds) between proactive prunings of remote-bound
    // WebRTC event logs which are pending upload.
    // All positive values are legal.
    // All negative values are illegal, and ignored.
    // If set to 0, the meaning is "no proactive pruning".
    public static final String WEB_RTC_REMOTE_EVENT_LOG_PROACTIVE_PRUNING_DELTA = "webrtc-event-log-proactive-pruning-delta";

    // WebRTC event logs will only be uploaded if the conditions hold for this
    // many milliseconds.
    public static final String WEB_RTC_REMOTE_EVENT_LOG_UPLOAD_DELAY_MS = "webrtc-event-log-upload-delay-ms";

    // Normally, remote-bound WebRTC event logs are uploaded only when no
    // peer connections are active. With this flag, the upload is never suppressed.
    public static final String WEB_RTC_REMOTE_EVENT_LOG_UPLOAD_NO_SUPPRESSION = "webrtc-event-log-upload-no-suppression";

    // Specify the initial window position: --window-position=x,y
    public static final String WINDOW_POSITION = "window-position";

    // Specify the initial window size: --window-size=w,h
    public static final String WINDOW_SIZE = "window-size";

    // Specify the initial window workspace: --window-workspace=id
    public static final String WINDOW_WORKSPACE = "window-workspace";

    // Uses WinHTTP to fetch and evaluate PAC scripts. Otherwise the default is to
    // use Chromium's network stack to fetch, and V8 to evaluate.
    public static final String WIN_HTTP_PROXY_RESOLVER = "winhttp-proxy-resolver";

    // Specifies which category option was clicked in the Windows Jumplist that
    // resulted in a browser startup.
    public static final String WIN_JUMPLIST_ACTION = "win-jumplist-action";

    // Android authentication account type for SPNEGO authentication
    public static final String AUTH_ANDROID_NEGOTIATE_ACCOUNT_TYPE = "auth-spnego-account-type";

    // Enable the accessibility tab switcher.
    public static final String ENABLE_ACCESSIBILITY_TAB_SWITCHER = "enable-accessibility-tab-switcher";

    // Enables a hung renderer InfoBar allowing the user to close or wait on
    // unresponsive web content.
    public static final String ENABLE_HUNG_RENDERER_INFO_BAR = "enable-hung-renderer-infobar";

    // Forces the device to report being owned by an enterprise. This mimics the
    // presence of an app signaling device ownerhsip.
    public static final String FORCE_DEVICE_OWNERSHIP = "force-device-ownership";

    // Forces the night mode to be enabled.
    public static final String FORCE_ENABLE_NIGHT_MODE = "force-enable-night-mode";

    // Forces the update menu badge to show.
    public static final String FORCE_SHOW_UPDATE_MENU_BADGE = "force-show-update-menu-badge";

    // Forces the update menu type to a specific type.
    public static final String FORCE_UPDATE_MENU_TYPE = "force-update-menu-type";

    // Forces a custom summary to be displayed below the update menu item.
    public static final String FORCE_SHOW_UPDATE_MENU_ITEM_CUSTOM_SUMMARY = "custom_summary";

    // Sets the market URL for Chrome for use in testing.
    public static final String MARKET_URL_FOR_TESTING = "market-url-for-testing";

    // Custom WebAPK server URL for the sake of testing.
    public static final String WEB_APK_SERVER_URL = "webapk-server-url";

    // Custom crosh command.
    public static final String CROSH_COMMAND = "crosh-command";

    // Disables logging redirect for testing.
    public static final String DISABLE_LOGGING_REDIRECT = "disable-logging-redirect";

    // Disables apps on the login screen. By default, they are allowed and can be
    // installed through policy.
    public static final String DISABLE_LOGIN_SCREEN_APPS = "disable-login-screen-apps";

    // Use a short (1 second) timeout for merge session loader throttle testing.
    public static final String SHORT_MERGE_SESSION_TIMEOUT_FOR_TEST = "short-merge-session-timeout-for-test";

    // Selects the scheduler configuration specified in the parameter.
    public static final String SCHEDULER_CONFIGURATION = "scheduler-configuration";


    public static final String SCHEDULER_CONFIGURATION_CONSERVATIVE = "conservative";


    public static final String SCHEDULER_CONFIGURATION_PERFORMANCE = "performance";

    // Specifies what the default scheduler configuration value is if the user does
    // not set one.
    public static final String SCHEDULER_CONFIGURATION_DEFAULT = "scheduler-configuration-default";

    // These flags show the man page on Linux. They are equivalent to each
    // other.
    public static final String HELP = "help";


    public static final String HELP_SHORT = "h";

    // Specifies which encryption storage backend to use. Possible values are
    // kwallet, kwallet5, gnome, gnome-keyring, gnome-libsecret, basic. Any other
    // value will lead to Chrome detecting the best backend automatically.
    // TODO(crbug.com/571003): Once PasswordStore no longer uses the Keyring or
    // KWallet for storing passwords, rename this flag to stop referencing
    // passwords. Do not rename it sooner, though; developers and testers might
    // rely on it keeping large amounts of testing passwords out of their Keyrings
    // or KWallets.
    public static final String PASSWORD_STORE = "password-store";

    // Enables the feature of allowing the user to disable the backend via a
    // setting.
    public static final String ENABLE_ENCRYPTION_SELECTION = "enable-encryption-selection";

    // The same as the --class argument in X applications.  Overrides the WM_CLASS
    // window property with the given value.
    public static final String WM_CLASS = "class";

    // Prevents Chrome from quitting when Chrome Apps are open.
    public static final String APPS_KEEP_CHROME_ALIVE_IN_TESTS = "apps-keep-chrome-alive-in-tests";

    // Disables app shim creation for hosted apps on Mac.
    public static final String DISABLE_HOSTED_APP_SHIM_CREATION = "disable-hosted-app-shim-creation";

    // Enable user metrics from within the installer.
    public static final String ENABLE_USER_METRICS = "enable-user-metrics";

    // Shows a notification when quitting Chrome with hosted apps running. Default
    // behavior is to also quit all hosted apps.
    public static final String HOSTED_APP_QUIT_NOTIFICATION = "enable-hosted-app-quit-notification";

    // This is how the metrics client ID is passed from the browser process to its
    // children. With Crashpad, the metrics client ID is distinct from the crash
    // client ID.
    public static final String METRICS_CLIENT_ID = "metrics-client-id";

    // A process type (switches::kProcessType) that relaunches the browser. See
    // chrome/browser/mac/relauncher.h.
    public static final String RELAUNCHER_PROCESS = "relauncher";

    // When switches::kProcessType is switches::kRelauncherProcess, if this switch
    // is also present, the relauncher process will unmount and eject a mounted disk
    // image and move its disk image file to the trash.  The argument's value must
    // be a BSD device name of the form "diskN" or "diskNsM".
    public static final String RELAUNCHER_PROCESS_DMG_DEVICE = "dmg-device";

    // Indicates whether Chrome should be set as the default browser during
    // installation.
    public static final String MAKE_CHROME_DEFAULT = "make-chrome-default";

    // Disables custom-drawing the window titlebar on Windows 10.
    public static final String DISABLE_WINDOWS10_CUSTOM_TITLEBAR = "disable-windows10-custom-titlebar";

    // Force-enables the profile shortcut manager. This is needed for tests since
    // they use a custom-user-data-dir which disables this.
    public static final String ENABLE_PROFILE_SHORTCUT_MANAGER = "enable-profile-shortcut-manager";

    // Makes Windows happy by allowing it to show "Enable access to this program"
    // checkbox in Add/Remove Programs->Set Program Access and Defaults. This only
    // shows an error box because the only way to hide Chrome is by uninstalling
    // it.
    public static final String HIDE_ICONS = "hide-icons";

    // Whether or not the browser should warn if the profile is on a network share.
    // This flag is only relevant for Windows currently.
    public static final String NO_NETWORK_PROFILE_WARNING = "no-network-profile-warning";

    // Used in combination with kNotificationLaunchId to specify the inline reply
    // entered in the toast in the Windows Action Center.
    public static final String NOTIFICATION_INLINE_REPLY = "notification-inline-reply";

    // Used for launching Chrome when a toast displayed in the Windows Action Center
    // has been activated. Should contain the launch ID encoded by Chrome.
    public static final String NOTIFICATION_LAUNCH_ID = "notification-launch-id";

    // /prefetch:# arguments for the browser process launched in background mode and
    // for the watcher process. Use profiles 5, 6 and 7 as documented on
    // kPrefetchArgument* in content_switches.cc.
    public static final String PREFETCH_ARGUMENT_BROWSER_BACKGROUND = "/prefetch:5";

    // See kHideIcons.
    public static final String SHOW_ICONS = "show-icons";

    // Runs un-installation steps that were done by chrome first-run.
    public static final String UNINSTALL = "uninstall";

    // Specifies the version of the Progressive-Web-App launcher that launched
    // Chrome, used to determine whether to update all launchers.
    // NOTE: changing this switch requires adding legacy handling for the previous
    // method, as older PWA launchers still using this switch will rely on Chrome to
    // update them to use the new method.
    public static final String PWA_LAUNCHER_VERSION = "pwa-launcher-version";

    // Enables support to debug printing subsystem.
    public static final String DEBUG_PRINT = "debug-print";

    // Specifies comma-separated list of extension ids or hosts to grant
    // access to CRX file system APIs.
    public static final String ALLOW_NA_CL_CRX_FS_API = "allow-nacl-crxfs-api";

    // Specifies comma-separated list of extension ids or hosts to grant
    // access to file handle APIs.
    public static final String ALLOW_NA_CL_FILE_HANDLE_API = "allow-nacl-file-handle-api";

    // Specifies comma-separated list of extension ids or hosts to grant
    // access to TCP/UDP socket APIs.
    public static final String ALLOW_NA_CL_SOCKET_API = "allow-nacl-socket-api";


    public static final String ENABLE_NEW_APP_MENU_ICON = "enable-new-app-menu-icon";

    // Causes the browser to launch directly in guest mode.
    public static final String GUEST = "guest";

    // Uses the system default printer as the initially selected destination in
    // print preview, instead of the most recently used destination.
    public static final String USE_SYSTEM_DEFAULT_PRINTER = "use-system-default-printer";

    // Indicates that this process is the product of a relaunch following migration
    // of User Data.
    public static final String USER_DATA_MIGRATED = "user-data-migrated";

    // Prevent instantiation.
    protected ChromeSwitches() {}
}
