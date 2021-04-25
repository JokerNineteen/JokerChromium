// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.preferences;

/** Contains pref string constants. */
public final class Pref {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../chrome/common/pref_names.cc,
    //     ../../components/autofill/core/common/autofill_prefs.cc,
    //     ../../components/dom_distiller/core/pref_names.cc,
    //     ../../components/embedder_support/pref_names.cc,
    //     ../../components/feed/core/common/pref_names.cc,
    //     ../../components/feed/core/shared_prefs/pref_names.cc,
    //     ../../components/offline_pages/core/prefetch/prefetch_prefs.cc,
    //     ../../components/password_manager/core/common/password_manager_pref_names.cc,
    //     ../../components/payments/core/payment_prefs.cc,
    //     ../../components/safe_browsing/core/common/safe_browsing_prefs.cc,
    //     ../../components/signin/public/base/signin_pref_names.cc,
    //     ../../components/translate/core/browser/translate_pref_names.cc
    // Into
    //     ../../chrome/browser/preferences/android/java_templates/Pref.java.tmpl

    // A bool pref that keeps whether the child status for this profile was already
    // successfully checked via ChildAccountService.
    public static final String CHILD_ACCOUNT_STATUS_KNOWN = "child_account_status_known";

    // A string property indicating whether default apps should be installed
    // in this profile.  Use the value "install" to enable defaults apps, or
    // "noinstall" to disable them.  This property is usually set in the
    // master_preferences and copied into the profile preferences on first run.
    // Defaults apps are installed only when creating a new profile.
    public static final String DEFAULT_APPS = "default_apps";

    // Disable SafeBrowsing checks for files coming from trusted URLs when false.
    public static final String SAFE_BROWSING_FOR_TRUSTED_SOURCES_ENABLED = "safebrowsing_for_trusted_sources_enabled";

    // Disables screenshot accelerators and extension APIs.
    // This setting resides both in profile prefs and local state. Accelerator
    // handling code reads local state, while extension APIs use profile pref.
    public static final String DISABLE_SCREENSHOTS = "disable_screenshots";

    // Prevents certain types of downloads based on integer value, which corresponds
    // to DownloadPrefs::DownloadRestriction.
    // 0 - No special restrictions (default)
    // 1 - Block dangerous downloads
    // 2 - Block potentially dangerous downloads
    // 3 - Block all downloads
    // 4 - Block malicious downloads
    public static final String DOWNLOAD_RESTRICTIONS = "download_restrictions";

    // If set to true profiles are created in ephemeral mode and do not store their
    // data in the profile folder on disk but only in memory.
    public static final String FORCE_EPHEMERAL_PROFILES = "profile.ephemeral_mode";

    // A boolean specifying whether the New Tab page is the home page or not.
    public static final String HOME_PAGE_IS_NEW_TAB_PAGE = "homepage_is_newtabpage";

    // This is the URL of the page to load when opening new tabs.
    public static final String HOME_PAGE = "homepage";

    // Stores information about the important sites dialog, including the time and
    // frequency it has been ignored.
    public static final String IMPORTANT_SITES_DIALOG_HISTORY = "important_sites_dialog";

    // This is the profile creation time.
    public static final String PROFILE_CREATION_TIME = "profile.creation_time";

    // This is a timestamp of the last time this profile was reset by a third party
    // tool. On Windows, a third party tool may set a registry value that will be
    // compared to this value and if different will result in a profile reset
    // prompt. See triggered_profile_resetter.h for more information.
    public static final String LAST_PROFILE_RESET_TIMESTAMP = "profile.last_reset_timestamp";

    // A boolean indicating if settings should be reset for this profile once a
    // run of the Chrome Cleanup Tool has completed.
    public static final String CHROME_CLEANER_RESET_PENDING = "chrome_cleaner.reset_pending";

    // The last time the Chrome cleaner scan completed without finding anything,
    // while Chrome was opened.
    public static final String CHROME_CLEANER_SCAN_COMPLETION_TIME = "chrome_cleaner.scan_completion_time";

    // The URL to open the new tab page to. Only set by Group Policy.
    public static final String NEW_TAB_PAGE_LOCATION_OVERRIDE = "newtab_page_location_override";

    // An integer that keeps track of the profile icon version. This allows us to
    // determine the state of the profile icon for icon format changes.
    public static final String PROFILE_ICON_VERSION = "profile.icon_version";

    // Used to determine if the last session exited cleanly. Set to false when
    // first opened, and to true when closing. On startup if the value is false,
    // it means the profile didn't exit cleanly.
    // DEPRECATED: this is replaced by kSessionExitType and exists for backwards
    // compatibility.
    public static final String SESSION_EXITED_CLEANLY = "profile.exited_cleanly";

    // A string pref whose values is one of the values defined by
    // |ProfileImpl::kPrefExitTypeXXX|. Set to |kPrefExitTypeCrashed| on startup and
    // one of |kPrefExitTypeNormal| or |kPrefExitTypeSessionEnded| during
    // shutdown. Used to determine the exit type the last time the profile was open.
    public static final String SESSION_EXIT_TYPE = "profile.exit_type";

    // The last time that the site engagement service recorded an engagement event
    // for this profile for any URL. Recorded only during shutdown. Used to prevent
    // the service from decaying engagement when a user does not use Chrome at all
    // for an extended period of time.
    public static final String SITE_ENGAGEMENT_LAST_UPDATE_TIME = "profile.last_engagement_time";

    // An integer pref. Holds one of several values:
    // 0: unused, previously indicated to open the homepage on startup
    // 1: restore the last session.
    // 2: this was used to indicate a specific session should be restored. It is
    //    no longer used, but saved to avoid conflict with old preferences.
    // 3: unused, previously indicated the user wants to restore a saved session.
    // 4: restore the URLs defined in kURLsToRestoreOnStartup.
    // 5: open the New Tab Page on startup.
    public static final String RESTORE_ON_STARTUP = "session.restore_on_startup";

    // The URLs to restore on startup or when the home button is pressed. The URLs
    // are only restored on startup if kRestoreOnStartup is 4.
    public static final String UR_LS_TO_RESTORE_ON_STARTUP = "session.startup_urls";

    // Boolean that is true when user feedback to Google is allowed.
    public static final String USER_FEEDBACK_ALLOWED = "feedback_allowed";

    // DictionaryValue that maps extension ids to the approved version of this
    // extension for a supervised user. Missing extensions are not approved.
    public static final String SUPERVISED_USER_APPROVED_EXTENSIONS = "profile.managed.approved_extensions";

    // Stores the email address associated with the google account of the custodian
    // of the supervised user, set when the supervised user is created.
    public static final String SUPERVISED_USER_CUSTODIAN_EMAIL = "profile.managed.custodian_email";

    // Stores the display name associated with the google account of the custodian
    // of the supervised user, updated (if possible) each time the supervised user
    // starts a session.
    public static final String SUPERVISED_USER_CUSTODIAN_NAME = "profile.managed.custodian_name";

    // Stores the obfuscated gaia id associated with the google account of the
    // custodian of the supervised user, updated (if possible) each time the
    // supervised user starts a session.
    public static final String SUPERVISED_USER_CUSTODIAN_OBFUSCATED_GAIA_ID = "profile.managed.custodian_obfuscated_gaia_id";

    // Stores the URL of the profile image associated with the google account of the
    // custodian of the supervised user.
    public static final String SUPERVISED_USER_CUSTODIAN_PROFILE_IMAGE_URL = "profile.managed.custodian_profile_image_url";

    // Stores the URL of the profile associated with the google account of the
    // custodian of the supervised user.
    public static final String SUPERVISED_USER_CUSTODIAN_PROFILE_URL = "profile.managed.custodian_profile_url";

    // Whether the supervised user may approve extension permission requests. If
    // false, extensions should not be able to request new permissions, and new
    // extensions should not be installable.
    public static final String SUPERVISED_USER_EXTENSIONS_MAY_REQUEST_PERMISSIONS = "profile.managed.extensions_may_request_permissions";

    // Maps host names to whether the host is manually allowed or blocked.
    public static final String SUPERVISED_USER_MANUAL_HOSTS = "profile.managed.manual_hosts";

    // Maps URLs to whether the URL is manually allowed or blocked.
    public static final String SUPERVISED_USER_MANUAL_UR_LS = "profile.managed.manual_urls";

    // Stores whether the SafeSites filter is enabled.
    public static final String SUPERVISED_USER_SAFE_SITES = "profile.managed.safe_sites";

    // Stores the email address associated with the google account of the secondary
    // custodian of the supervised user, set when the supervised user is created.
    public static final String SUPERVISED_USER_SECOND_CUSTODIAN_EMAIL = "profile.managed.second_custodian_email";

    // Stores the display name associated with the google account of the secondary
    // custodian of the supervised user, updated (if possible) each time the
    // supervised user starts a session.
    public static final String SUPERVISED_USER_SECOND_CUSTODIAN_NAME = "profile.managed.second_custodian_name";

    // Stores the obfuscated gaia id associated with the google account of the
    // secondary custodian of the supervised user, updated (if possible) each time
    // the supervised user starts a session.
    public static final String SUPERVISED_USER_SECOND_CUSTODIAN_OBFUSCATED_GAIA_ID = "profile.managed.second_custodian_obfuscated_gaia_id";

    // Stores the URL of the profile image associated with the google account of the
    // secondary custodian of the supervised user.
    public static final String SUPERVISED_USER_SECOND_CUSTODIAN_PROFILE_IMAGE_URL = "profile.managed.second_custodian_profile_image_url";

    // Stores the URL of the profile associated with the google account of the
    // secondary custodian of the supervised user.
    public static final String SUPERVISED_USER_SECOND_CUSTODIAN_PROFILE_URL = "profile.managed.second_custodian_profile_url";

    // Stores settings that can be modified both by a supervised user and their
    // manager. See SupervisedUserSharedSettingsService for a description of
    // the format.
    public static final String SUPERVISED_USER_SHARED_SETTINGS = "profile.managed.shared_settings";

    // A dictionary storing allowlists for a supervised user. The key is the CRX ID
    // of the allowlist, the value a dictionary containing allowlist properties
    // (currently the name).
    public static final String SUPERVISED_USER_ALLOWLISTS = "profile.managed.whitelists";

    // Integer. RLZ ping delay in seconds.
    public static final String RLZ_PING_DELAY_SECONDS = "rlz_ping_delay";

    // Locale preference of device' owner.  ChromeOS device appears in this locale
    // after startup/wakeup/signout.
    public static final String OWNER_LOCALE = "intl.owner_locale";

    // Locale accepted by user.  Non-syncable.
    // Used to determine whether we need to show Locale Change notification.
    public static final String APPLICATION_LOCALE_ACCEPTED = "intl.app_locale_accepted";

    // Non-syncable item.
    // It is used in two distinct ways.
    // (1) Used for two-step initialization of locale in ChromeOS
    //     because synchronization of kApplicationLocale is not instant.
    // (2) Used to detect locale change.  Locale change is detected by
    //     LocaleChangeGuard in case values of kApplicationLocaleBackup and
    //     kApplicationLocale are both non-empty and differ.
    // Following is a table showing how state of those prefs may change upon
    // common real-life use cases:
    //                                  AppLocale Backup Accepted
    // Initial login                       -        A       -
    // Sync                                B        A       -
    // Accept (B)                          B        B       B
    // -----------------------------------------------------------
    // Initial login                       -        A       -
    // No sync and second login            A        A       -
    // Change options                      B        B       -
    // -----------------------------------------------------------
    // Initial login                       -        A       -
    // Sync                                A        A       -
    // Locale changed on login screen      A        C       -
    // Accept (A)                          A        A       A
    // -----------------------------------------------------------
    // Initial login                       -        A       -
    // Sync                                B        A       -
    // Revert                              A        A       -
    public static final String APPLICATION_LOCALE_BACKUP = "intl.app_locale_backup";

    // List of locales the UI is allowed to be displayed in by policy. The list is
    // empty if no restriction is being enforced.
    public static final String ALLOWED_LANGUAGES = "intl.allowed_languages";

    // The default character encoding to assume for a web page in the
    // absence of MIME charset specification
    public static final String DEFAULT_CHARSET = "intl.charset_default";


    public static final String WEB_KIT_FIXED_FONT_FAMILY_ARABIC = "webkit.webprefs.fonts.fixed.Arab";


    public static final String WEB_KIT_SERIF_FONT_FAMILY_ARABIC = "webkit.webprefs.fonts.serif.Arab";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY_ARABIC = "webkit.webprefs.fonts.sansserif.Arab";


    public static final String WEB_KIT_STANDARD_FONT_FAMILY_CYRILLIC = "webkit.webprefs.fonts.standard.Cyrl";


    public static final String WEB_KIT_FIXED_FONT_FAMILY_CYRILLIC = "webkit.webprefs.fonts.fixed.Cyrl";


    public static final String WEB_KIT_SERIF_FONT_FAMILY_CYRILLIC = "webkit.webprefs.fonts.serif.Cyrl";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY_CYRILLIC = "webkit.webprefs.fonts.sansserif.Cyrl";


    public static final String WEB_KIT_STANDARD_FONT_FAMILY_GREEK = "webkit.webprefs.fonts.standard.Grek";


    public static final String WEB_KIT_FIXED_FONT_FAMILY_GREEK = "webkit.webprefs.fonts.fixed.Grek";


    public static final String WEB_KIT_SERIF_FONT_FAMILY_GREEK = "webkit.webprefs.fonts.serif.Grek";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY_GREEK = "webkit.webprefs.fonts.sansserif.Grek";


    public static final String WEB_KIT_STANDARD_FONT_FAMILY_JAPANESE = "webkit.webprefs.fonts.standard.Jpan";


    public static final String WEB_KIT_FIXED_FONT_FAMILY_JAPANESE = "webkit.webprefs.fonts.fixed.Jpan";


    public static final String WEB_KIT_SERIF_FONT_FAMILY_JAPANESE = "webkit.webprefs.fonts.serif.Jpan";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY_JAPANESE = "webkit.webprefs.fonts.sansserif.Jpan";


    public static final String WEB_KIT_STANDARD_FONT_FAMILY_KOREAN = "webkit.webprefs.fonts.standard.Hang";


    public static final String WEB_KIT_FIXED_FONT_FAMILY_KOREAN = "webkit.webprefs.fonts.fixed.Hang";


    public static final String WEB_KIT_SERIF_FONT_FAMILY_KOREAN = "webkit.webprefs.fonts.serif.Hang";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY_KOREAN = "webkit.webprefs.fonts.sansserif.Hang";


    public static final String WEB_KIT_CURSIVE_FONT_FAMILY_KOREAN = "webkit.webprefs.fonts.cursive.Hang";


    public static final String WEB_KIT_STANDARD_FONT_FAMILY_SIMPLIFIED_HAN = "webkit.webprefs.fonts.standard.Hans";


    public static final String WEB_KIT_FIXED_FONT_FAMILY_SIMPLIFIED_HAN = "webkit.webprefs.fonts.fixed.Hans";


    public static final String WEB_KIT_SERIF_FONT_FAMILY_SIMPLIFIED_HAN = "webkit.webprefs.fonts.serif.Hans";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY_SIMPLIFIED_HAN = "webkit.webprefs.fonts.sansserif.Hans";


    public static final String WEB_KIT_STANDARD_FONT_FAMILY_TRADITIONAL_HAN = "webkit.webprefs.fonts.standard.Hant";


    public static final String WEB_KIT_FIXED_FONT_FAMILY_TRADITIONAL_HAN = "webkit.webprefs.fonts.fixed.Hant";


    public static final String WEB_KIT_SERIF_FONT_FAMILY_TRADITIONAL_HAN = "webkit.webprefs.fonts.serif.Hant";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY_TRADITIONAL_HAN = "webkit.webprefs.fonts.sansserif.Hant";


    public static final String WEB_KIT_CURSIVE_FONT_FAMILY_SIMPLIFIED_HAN = "webkit.webprefs.fonts.cursive.Hans";


    public static final String WEB_KIT_CURSIVE_FONT_FAMILY_TRADITIONAL_HAN = "webkit.webprefs.fonts.cursive.Hant";

    // WebKit preferences.
    public static final String WEB_KIT_WEB_SECURITY_ENABLED = "webkit.webprefs.web_security_enabled";


    public static final String WEB_KIT_DOM_PASTE_ENABLED = "webkit.webprefs.dom_paste_enabled";


    public static final String WEB_KIT_TEXT_AREAS_ARE_RESIZABLE = "webkit.webprefs.text_areas_are_resizable";


    public static final String WEB_KIT_JAVASCRIPT_CAN_ACCESS_CLIPBOARD = "webkit.webprefs.javascript_can_access_clipboard";


    public static final String WEBKIT_TABS_TO_LINKS = "webkit.webprefs.tabs_to_links";


    public static final String WEB_KIT_ALLOW_RUNNING_INSECURE_CONTENT = "webkit.webprefs.allow_running_insecure_content";


    public static final String WEB_KIT_FONT_SCALE_FACTOR = "webkit.webprefs.font_scale_factor";


    public static final String WEB_KIT_FORCE_ENABLE_ZOOM = "webkit.webprefs.force_enable_zoom";


    public static final String WEB_KIT_PASSWORD_ECHO_ENABLED = "webkit.webprefs.password_echo_enabled";


    public static final String WEB_KIT_FORCE_DARK_MODE_ENABLED = "webkit.webprefs.force_dark_mode_enabled";


    public static final String WEB_KIT_COMMON_SCRIPT = "Zyyy";


    public static final String WEB_KIT_STANDARD_FONT_FAMILY = "webkit.webprefs.fonts.standard.Zyyy";


    public static final String WEB_KIT_FIXED_FONT_FAMILY = "webkit.webprefs.fonts.fixed.Zyyy";


    public static final String WEB_KIT_SERIF_FONT_FAMILY = "webkit.webprefs.fonts.serif.Zyyy";


    public static final String WEB_KIT_SANS_SERIF_FONT_FAMILY = "webkit.webprefs.fonts.sansserif.Zyyy";


    public static final String WEB_KIT_CURSIVE_FONT_FAMILY = "webkit.webprefs.fonts.cursive.Zyyy";


    public static final String WEB_KIT_FANTASY_FONT_FAMILY = "webkit.webprefs.fonts.fantasy.Zyyy";


    public static final String WEB_KIT_PICTOGRAPH_FONT_FAMILY = "webkit.webprefs.fonts.pictograph.Zyyy";


    public static final String WEB_KIT_DEFAULT_FONT_SIZE = "webkit.webprefs.default_font_size";


    public static final String WEB_KIT_DEFAULT_FIXED_FONT_SIZE = "webkit.webprefs.default_fixed_font_size";


    public static final String WEB_KIT_MINIMUM_FONT_SIZE = "webkit.webprefs.minimum_font_size";


    public static final String WEB_KIT_MINIMUM_LOGICAL_FONT_SIZE = "webkit.webprefs.minimum_logical_font_size";


    public static final String WEB_KIT_JAVASCRIPT_ENABLED = "webkit.webprefs.javascript_enabled";


    public static final String WEB_KIT_LOADS_IMAGES_AUTOMATICALLY = "webkit.webprefs.loads_images_automatically";


    public static final String WEB_KIT_PLUGINS_ENABLED = "webkit.webprefs.plugins_enabled";

    // Boolean that is true when the SSL interstitial should allow users to
    // proceed anyway. Otherwise, proceeding is not possible.
    public static final String SSL_ERROR_OVERRIDE_ALLOWED = "ssl.error_override_allowed";

    // Enum that specifies whether Incognito mode is:
    // 0 - Enabled. Default behaviour. Default mode is available on demand.
    // 1 - Disabled. Used cannot browse pages in Incognito mode.
    // 2 - Forced. All pages/sessions are forced into Incognito.
    public static final String INCOGNITO_MODE_AVAILABILITY = "incognito.mode_availability";

    // Boolean that is true when Suggest support is enabled.
    public static final String SEARCH_SUGGEST_ENABLED = "search.suggest_enabled";

    // String indicating the Contextual Search enabled state.
    // "false" - opt-out (disabled)
    // "" (empty string) - undecided
    // "true" - opt-in (enabled)
    public static final String CONTEXTUAL_SEARCH_ENABLED = "search.contextual_search_enabled";


    public static final String CONTEXTUAL_SEARCH_DISABLED_VALUE = "false";


    public static final String CONTEXTUAL_SEARCH_ENABLED_VALUE = "true";

    // Boolean that indicates whether the browser should put up a confirmation
    // window when the user is attempting to quit. Only on Mac.
    public static final String CONFIRM_TO_QUIT_ENABLED = "browser.confirm_to_quit";

    // Boolean that indicates whether the browser should show the toolbar when it's
    // in fullscreen. Mac only.
    public static final String SHOW_FULLSCREEN_TOOLBAR = "browser.show_fullscreen_toolbar";

    // Boolean that indicates whether the browser should allow Javascript injection
    // via Apple Events. Mac only.
    public static final String ALLOW_JAVASCRIPT_APPLE_EVENTS = "browser.allow_javascript_apple_events";

    // Boolean which specifies whether we should ask the user if we should download
    // a file (true) or just download it automatically.
    public static final String PROMPT_FOR_DOWNLOAD = "download.prompt_for_download";

    // Controls if the QUIC protocol is allowed.
    public static final String QUIC_ALLOWED = "net.quic_allowed";

    // Prefs for persisting network qualities.
    public static final String NETWORK_QUALITIES = "net.network_qualities";

    // Pref storing the user's network easter egg game high score.
    public static final String NETWORK_EASTER_EGG_HIGH_SCORE = "net.easter_egg_high_score";

    // Last time that a check for cloud policy management was done. This time is
    // recorded on Android so that retries aren't attempted on every startup.
    // Instead the cloud policy registration is retried at least 1 or 3 days later.
    public static final String LAST_POLICY_CHECK_TIME = "policy.last_policy_check_time";

    // A preference of enum chrome_browser_net::NetworkPredictionOptions shows
    // if prediction of network actions is allowed, depending on network type.
    // Actions include DNS prefetching, TCP and SSL preconnection, prerendering
    // of web pages, and resource prefetching.
    // TODO(bnc): Implement this preference as per crbug.com/334602.
    public static final String NETWORK_PREDICTION_OPTIONS = "net.network_prediction_options";

    // See possible values in external_provider_impl.cc.
    public static final String DEFAULT_APPS_INSTALL_STATE = "default_apps_install_state";

    // A boolean pref set to true if the Chrome Web Store icons should be hidden
    // from the New Tab Page and app launcher.
    public static final String HIDE_WEB_STORE_ICON = "hide_web_store_icon";

    // An integer preference to store the number of times the Chrome OS Account
    // Manager migration flow ran successfully.
    public static final String ACCOUNT_MANAGER_NUM_TIMES_MIGRATION_RAN_SUCCESSFULLY = "account_manager.num_times_migration_ran_successfully";

    // An integer preference to store the number of times the Chrome OS Account
    // Manager welcome screen has been shown.
    public static final String ACCOUNT_MANAGER_NUM_TIMES_WELCOME_SCREEN_SHOWN = "account_manager.num_times_welcome_screen_shown";

    // A boolean pref set to true if touchpad tap-to-click is enabled.
    public static final String TAP_TO_CLICK_ENABLED = "settings.touchpad.enable_tap_to_click";

    // A boolean pref set to true if touchpad three-finger-click is enabled.
    public static final String ENABLE_TOUCHPAD_THREE_FINGER_CLICK = "settings.touchpad.enable_three_finger_click";

    // A boolean pref set to true if primary mouse button is the left button.
    public static final String PRIMARY_MOUSE_BUTTON_RIGHT = "settings.mouse.primary_right";

    // A boolean pref set to true if mouse acceleration is enabled. When disabled
    // only simple linear scaling is applied based on sensitivity.
    public static final String MOUSE_ACCELERATION = "settings.mouse.acceleration";

    // A boolean pref set to true if mouse scroll acceleration is enabled. When
    // disabled, only simple linear scaling is applied based on sensitivity.
    public static final String MOUSE_SCROLL_ACCELERATION = "settings.mouse.scroll_acceleration";

    // A boolean pref set to true if touchpad acceleration is enabled. When
    // disabled only simple linear scaling is applied based on sensitivity.
    public static final String TOUCHPAD_ACCELERATION = "settings.touchpad.acceleration";

    // A boolean pref set to true if touchpad scroll acceleration is enabled. When
    // disabled only simple linear scaling is applied based on sensitivity.
    public static final String TOUCHPAD_SCROLL_ACCELERATION = "settings.touchpad.scroll_acceleration";

    // A integer pref for the touchpad sensitivity.
    public static final String MOUSE_SENSITIVITY = "settings.mouse.sensitivity2";

    // A integer pref for the touchpad scroll sensitivity, in the range
    // [PointerSensitivity::kLowest, PointerSensitivity::kHighest].
    public static final String MOUSE_SCROLL_SENSITIVITY = "settings.mouse.scroll_sensitivity";

    // A integer pref for the touchpad sensitivity.
    public static final String TOUCHPAD_SENSITIVITY = "settings.touchpad.sensitivity2";

    // A integer pref for the touchpad scroll sensitivity, in the range
    // [PointerSensitivity::kLowest, PointerSensitivity::kHighest].
    public static final String TOUCHPAD_SCROLL_SENSITIVITY = "settings.touchpad.scroll_sensitivity";

    // A boolean pref set to true if time should be displayed in 24-hour clock.
    public static final String USE24_HOUR_CLOCK = "settings.clock.use_24hour_clock";

    // A string pref containing Timezone ID for this user.
    public static final String USER_TIMEZONE = "settings.timezone";

    // This setting disables manual timezone selection and starts periodic timezone
    // refresh.
    // Deprecated. Replaced with kResolveTimezoneByGeolocationMethod.
    // TODO(alemate): https://crbug.com/783367 Remove outdated prefs.
    public static final String RESOLVE_TIMEZONE_BY_GEOLOCATION = "settings.resolve_timezone_by_geolocation";

    // This setting controls what information is sent to the server to get
    // device location to resolve time zone in user session. Values must
    // match TimeZoneResolverManager::TimeZoneResolveMethod enum.
    public static final String RESOLVE_TIMEZONE_BY_GEOLOCATION_METHOD = "settings.resolve_timezone_by_geolocation_method";

    // This setting is true when kResolveTimezoneByGeolocation value
    // has been migrated to kResolveTimezoneByGeolocationMethod.
    public static final String RESOLVE_TIMEZONE_BY_GEOLOCATION_MIGRATED_TO_METHOD = "settings.resolve_timezone_by_geolocation_migrated_to_method";

    // A string pref set to the current input method.
    public static final String LANGUAGE_CURRENT_INPUT_METHOD = "settings.language.current_input_method";

    // A string pref set to the previous input method.
    public static final String LANGUAGE_PREVIOUS_INPUT_METHOD = "settings.language.previous_input_method";

    // A list pref set to the allowed input methods (see policy
    // "AllowedInputMethods").
    public static final String LANGUAGE_ALLOWED_INPUT_METHODS = "settings.language.allowed_input_methods";

    // A string pref (comma-separated list) set to the preloaded (active) input
    // method IDs (ex. "pinyin,mozc").
    public static final String LANGUAGE_PRELOAD_ENGINES = "settings.language.preload_engines";


    public static final String LANGUAGE_PRELOAD_ENGINES_SYNCABLE = "settings.language.preload_engines_syncable";

    // A string pref (comma-separated list) set to the extension and ARC IMEs to be
    // enabled.
    public static final String LANGUAGE_ENABLED_IMES = "settings.language.enabled_extension_imes";


    public static final String LANGUAGE_ENABLED_IMES_SYNCABLE = "settings.language.enabled_extension_imes_syncable";

    // A boolean pref set to true if the IME menu is activated.
    public static final String LANGUAGE_IME_MENU_ACTIVATED = "settings.language.ime_menu_activated";

    // A dictionary of input method IDs and their settings. Each value is itself a
    // dictionary of key / value string pairs, with each pair representing a setting
    // and its value.
    public static final String LANGUAGE_INPUT_METHOD_SPECIFIC_SETTINGS = "settings.language.input_method_specific_settings";

    // A boolean pref to indicate whether we still need to add the globally synced
    // input methods. False after the initial post-OOBE sync.
    public static final String LANGUAGE_SHOULD_MERGE_INPUT_METHODS = "settings.language.merge_input_methods";

    // A boolean pref that causes top-row keys to be interpreted as function keys
    // instead of as media keys.
    public static final String LANGUAGE_SEND_FUNCTION_KEYS = "settings.language.send_function_keys";

    // A boolean pref which turns on Advanced Filesystem
    // (USB support, SD card, etc).
    public static final String LABS_ADVANCED_FILESYSTEM_ENABLED = "settings.labs.advanced_filesystem";

    // A boolean pref which turns on the mediaplayer.
    public static final String LABS_MEDIAPLAYER_ENABLED = "settings.labs.mediaplayer";

    // A boolean pref of whether to show mobile data first-use warning notification.
    // Note: 3g in the name is for legacy reasons. The pref was added while only 3G
    // mobile data was supported.
    public static final String SHOW_MOBILE_DATA_NOTIFICATION = "settings.internet.mobile.show_3g_promo_notification";

    // A string pref that contains version where "What's new" promo was shown.
    public static final String CHROME_OS_RELEASE_NOTES_VERSION = "settings.release_notes.version";

    // A string pref that contains either a Chrome app ID (see
    // extensions::ExtensionId) or an Android package name (using Java package
    // naming conventions) of the preferred note-taking app. An empty value
    // indicates that the user hasn't selected an app yet.
    public static final String NOTE_TAKING_APP_ID = "settings.note_taking_app_id";

    // A boolean pref indicating whether preferred note-taking app (see
    // |kNoteTakingAppId|) is allowed to handle note taking actions on the lock
    // screen.
    public static final String NOTE_TAKING_APP_ENABLED_ON_LOCK_SCREEN = "settings.note_taking_app_enabled_on_lock_screen";

    // List of note taking aps that can be enabled to run on the lock screen.
    // The intended usage is to allow the set of apps that the user can enable
    // to run on lock screen, not to actually enable the apps to run on lock screen.
    // Note that this used to be `kNoteTakingAppsLockScreenWhitelist`, hence the
    // difference between the variable name and the string value.
    public static final String NOTE_TAKING_APPS_LOCK_SCREEN_ALLOWLIST = "settings.note_taking_apps_lock_screen_whitelist";

    // Dictionary pref that maps lock screen app ID to a boolean indicating whether
    // the toast dialog has been show and dismissed as the app was being launched
    // on the lock screen.
    public static final String NOTE_TAKING_APPS_LOCK_SCREEN_TOAST_SHOWN = "settings.note_taking_apps_lock_screen_toast_shown";

    // Whether the preferred note taking app should be requested to restore the last
    // note created on lock screen when launched on lock screen.
    public static final String RESTORE_LAST_LOCK_SCREEN_NOTE = "settings.restore_last_lock_screen_note";

    // A boolean pref indicating whether user activity has been observed in the
    // current session already. The pref is used to restore information about user
    // activity after browser crashes.
    public static final String SESSION_USER_ACTIVITY_SEEN = "session.user_activity_seen";

    // A preference to keep track of the session start time. If the session length
    // limit is configured to start running after initial user activity has been
    // observed, the pref is set after the first user activity in a session.
    // Otherwise, it is set immediately after session start. The pref is used to
    // restore the session start time after browser crashes. The time is expressed
    // as the serialization obtained from base::Time::ToInternalValue().
    public static final String SESSION_START_TIME = "session.start_time";

    // Holds the maximum session time in milliseconds. If this pref is set, the
    // user is logged out when the maximum session time is reached. The user is
    // informed about the remaining time by a countdown timer shown in the ash
    // system tray.
    public static final String SESSION_LENGTH_LIMIT = "session.length_limit";

    // Whether the session length limit should start running only after the first
    // user activity has been observed in a session.
    public static final String SESSION_WAIT_FOR_INITIAL_USER_ACTIVITY = "session.wait_for_initial_user_activity";

    // A preference of the last user session type. It is used with the
    // kLastSessionLength pref below to store the last user session info
    // on shutdown so that it could be reported on the next run.
    public static final String LAST_SESSION_TYPE = "session.last_session_type";

    // A preference of the last user session length.
    public static final String LAST_SESSION_LENGTH = "session.last_session_length";

    // The URL from which the Terms of Service can be downloaded. The value is only
    // honored for public accounts.
    public static final String TERMS_OF_SERVICE_URL = "terms_of_service.url";

    // Indicates whether the remote attestation is enabled for the user.
    public static final String ATTESTATION_ENABLED = "attestation.enabled";

    // The list of extensions allowed to use the platformKeysPrivate API for
    // remote attestation.
    public static final String ATTESTATION_EXTENSION_ALLOWLIST = "attestation.extension_allowlist";

    // A boolean pref recording whether user has dismissed the multiprofile
    // itroduction dialog show.
    public static final String MULTI_PROFILE_NEVER_SHOW_INTRO = "settings.multi_profile_never_show_intro";

    // A boolean pref recording whether user has dismissed the multiprofile
    // teleport warning dialog show.
    public static final String MULTI_PROFILE_WARNING_SHOW_DISMISSED = "settings.multi_profile_warning_show_dismissed";

    // A string pref that holds string enum values of how the user should behave
    // in a multiprofile session. See ChromeOsMultiProfileUserBehavior policy
    // for more details of the valid values.
    public static final String MULTI_PROFILE_USER_BEHAVIOR = "settings.multiprofile_user_behavior";

    // A boolean preference indicating whether user has seen first-run tutorial
    // already.
    public static final String FIRST_RUN_TUTORIAL_SHOWN = "settings.first_run_tutorial_shown";

    // The total number of seconds that the machine has spent sitting on the
    // OOBE screen.
    public static final String TIME_ON_OOBE = "settings.time_on_oobe";

    // List of mounted file systems via the File System Provider API. Used to
    // restore them after a reboot.
    public static final String FILE_SYSTEM_PROVIDER_MOUNTED = "file_system_provider.mounted";

    // A boolean pref set to true if the virtual keyboard should be enabled.
    public static final String TOUCH_VIRTUAL_KEYBOARD_ENABLED = "ui.touch_virtual_keyboard_enabled";

    // This is the policy CaptivePortalAuthenticationIgnoresProxy that allows to
    // open captive portal authentication pages in a separate window under
    // a temporary incognito profile ("signin profile" is used for this purpose),
    // which allows to bypass the user's proxy for captive portal authentication.
    public static final String CAPTIVE_PORTAL_AUTHENTICATION_IGNORES_PROXY = "proxy.captive_portal_ignores_proxy";

    // This boolean controls whether the first window shown on first run should be
    // unconditionally maximized, overriding the heuristic that normally chooses the
    // window size.
    public static final String FORCE_MAXIMIZE_ON_FIRST_RUN = "ui.force_maximize_on_first_run";

    // A dictionary pref mapping public keys that identify platform keys to its
    // properties like whether it's meant for corporate usage.
    public static final String PLATFORM_KEYS = "platform_keys";

    // A boolean preference that will be registered in local_state prefs to track
    // migration of permissions on device-wide key pairs and will be registered in
    // Profile prefs to track migration of permissions on user-owned key pairs.
    public static final String KEY_PERMISSIONS_ONE_TIME_MIGRATION_DONE = "key_permissions_one_time_migration_done";

    // A boolean pref. If set to true, the Unified Desktop feature is made
    // available and turned on by default, which allows applications to span
    // multiple screens. Users may turn the feature off and on in the settings
    // while this is set to true.
    public static final String UNIFIED_DESKTOP_ENABLED_BY_DEFAULT = "settings.display.unified_desktop_enabled_by_default";

    // An int64 pref. This is a timestamp of the most recent time the profile took
    // or dismissed HaTS (happiness-tracking) survey.
    public static final String HATS_LAST_INTERACTION_TIMESTAMP = "hats_last_interaction_timestamp";

    // An int64 pref. This is the timestamp that indicates the end of the most
    // recent survey cycle.
    public static final String HATS_SURVEY_CYCLE_END_TIMESTAMP = "hats_survey_cycle_end_timestamp";

    // A boolean pref. Indicates if the device is selected for HaTS in the current
    // survey cycle.
    public static final String HATS_DEVICE_IS_SELECTED = "hats_device_is_selected";

    // A boolean pref. Indicates if we've already shown a notification to inform the
    // current user about the quick unlock feature.
    public static final String PIN_UNLOCK_FEATURE_NOTIFICATION_SHOWN = "pin_unlock_feature_notification_shown";

    // A boolean pref. Indicates if we've already shown a notification to inform the
    // current user about the fingerprint unlock feature.
    public static final String FINGERPRINT_UNLOCK_FEATURE_NOTIFICATION_SHOWN = "fingerprint_unlock_feature_notification_shown";

    // The hash for the pin quick unlock mechanism.
    public static final String QUICK_UNLOCK_PIN_SECRET = "quick_unlock.pin.secret";

    // An integer pref. Indicates the number of fingerprint records registered.
    public static final String QUICK_UNLOCK_FINGERPRINT_RECORD = "quick_unlock.fingerprint.record";

    // Deprecated (crbug/998983) in favor of kEndOfLifeDate.
    // An integer pref. Holds one of several values:
    // 0: Supported. Device is in supported state.
    // 1: Security Only. Device is in Security-Only update (after initial 5 years).
    // 2: EOL. Device is End of Life(No more updates expected).
    // This value needs to be consistent with EndOfLifeStatus enum.
    public static final String EOL_STATUS = "eol_status";

    // A Time pref.  Holds the last used Eol Date and is compared to the latest Eol
    // Date received to make changes to Eol notifications accordingly.
    public static final String END_OF_LIFE_DATE = "eol_date";

    // Boolean pref indicating that the first warning End Of Life month and year
    // notification was dismissed by the user.
    public static final String FIRST_EOL_WARNING_DISMISSED = "first_eol_warning_dismissed";

    // Boolean pref indicating that the second warning End Of Life month and year
    // notification was dismissed by the user.
    public static final String SECOND_EOL_WARNING_DISMISSED = "second_eol_warning_dismissed";

    // Boolean pref indicating that the End Of Life final update notification was
    // dismissed by the user.
    public static final String EOL_NOTIFICATION_DISMISSED = "eol_notification_dismissed";

    // A list of allowed quick unlock modes. A quick unlock mode can only be used if
    // its type is on this list, or if type all (all quick unlock modes enabled) is
    // on this list. The pref name variable was changed to match the policy, the
    // actual pref name stays the same to preserve the backward compatibility
    public static final String QUICK_UNLOCK_MODE_ALLOWLIST = "quick_unlock_mode_whitelist";

    // Enum that specifies how often a user has to enter their password to continue
    // using quick unlock. These values are the same as the ones in
    // chromeos::QuickUnlockPasswordConfirmationFrequency.
    // 0 - six hours. Users will have to enter their password every six hours.
    // 1 - twelve hours. Users will have to enter their password every twelve hours.
    // 2 - day. Users will have to enter their password every day.
    // 3 - week. Users will have to enter their password every week.
    public static final String QUICK_UNLOCK_TIMEOUT = "quick_unlock_timeout";

    // Integer prefs indicating the minimum and maximum lengths of the lock screen
    // pin.
    public static final String PIN_UNLOCK_MINIMUM_LENGTH = "pin_unlock_minimum_length";


    public static final String PIN_UNLOCK_MAXIMUM_LENGTH = "pin_unlock_maximum_length";

    // Boolean pref indicating whether users are allowed to set easy pins.
    public static final String PIN_UNLOCK_WEAK_PINS_ALLOWED = "pin_unlock_weak_pins_allowed";

    // A boolean pref that controls whether the PIN autosubmit feature is enabled.
    // This feature, when enabled, exposes the user's PIN length by showing how many
    // digits are necessary to unlock the device. Can be recommended.
    public static final String PIN_UNLOCK_AUTOSUBMIT_ENABLED = "pin_unlock_autosubmit_enabled";

    // Boolean pref indicating whether someone can cast to the device.
    public static final String CAST_RECEIVER_ENABLED = "cast_receiver.enabled";

    // String pref indicating what is the minimum version of Chrome required to
    // allow user sign in. If the string is empty or blank no restrictions will
    // be applied. See base::Version for exact string format.
    public static final String MINIMUM_ALLOWED_CHROME_VERSION = "minimum_req.version";

    // Boolean preference that triggers chrome://settings/androidApps/details to be
    // opened on user session start.
    public static final String SHOW_ARC_SETTINGS_ON_SESSION_START = "start_arc_settings_on_session_start";

    // Boolean preference that triggers chrome://settings/syncSetup to be opened
    // on user session start.
    public static final String SHOW_SYNC_SETTINGS_ON_SESSION_START = "start_sync_settings_on_session_start";

    // Dictionary preference that maps language to default voice name preferences
    // for the users's text-to-speech settings. For example, this might map
    // 'en-US' to 'Chrome OS US English'.
    public static final String TEXT_TO_SPEECH_LANG_TO_VOICE_NAME = "settings.tts.lang_to_voice_name";

    // Double preference that controls the default text-to-speech voice rate,
    // where 1.0 is an unchanged rate, and for example, 0.5 is half as fast,
    // and 2.0 is twice as fast.
    public static final String TEXT_TO_SPEECH_RATE = "settings.tts.speech_rate";

    // Double preference that controls the default text-to-speech voice pitch,
    // where 1.0 is unchanged, and for example 0.5 is lower, and 2.0 is
    // higher-pitched.
    public static final String TEXT_TO_SPEECH_PITCH = "settings.tts.speech_pitch";

    // Double preference that controls the default text-to-speech voice volume
    // relative to the system volume, where lower than 1.0 is quieter than the
    // system volume, and higher than 1.0 is louder.
    public static final String TEXT_TO_SPEECH_VOLUME = "settings.tts.speech_volume";

    // A dictionary containing the latest Time Limits override authorized by parent
    // access code.
    public static final String TIME_LIMIT_LOCAL_OVERRIDE = "screen_time.local_override";

    // A dictionary preference holding the usage time limit definitions for a user.
    public static final String USAGE_TIME_LIMIT = "screen_time.limit";

    // Last state of the screen time limit.
    public static final String SCREEN_TIME_LAST_STATE = "screen_time.last_state";

    // Boolean controlling whether showing Sync Consent during sign-in is enabled.
    // Controlled by policy.
    public static final String ENABLE_SYNC_CONSENT = "sync_consent.enabled";

    // Boolean pref indicating whether a user is allowed to use the Network File
    // Shares for Chrome OS feature.
    public static final String NETWORK_FILE_SHARES_ALLOWED = "network_file_shares.allowed";

    // Boolean pref indicating whether the currently running public session runs in
    // the old standard "public session" mode (false), or in the new "managed
    // session" mode which has lifted restrictions (true).
    public static final String MANAGED_SESSION_ENABLED = "managed_session.enabled";

    // Boolean pref indicating whether the message displayed on the login screen for
    // the managed guest session should be the full warning or not.
    // True means the full warning should be displayed.
    // False means the normal warning should be displayed.
    // It's true by default, unless it's ensured that all extensions are "safe".
    public static final String MANAGED_SESSION_USE_FULL_LOGIN_WARNING = "managed_session.use_full_warning";

    // Boolean pref indicating whether the privacy notification displayed when the
    // managed-guest session on Chrome OS is auto-launched should be pinned or not.
    public static final String MANAGED_GUEST_SESSION_AUTO_LAUNCH_NOTIFICATION_REDUCED = "managed_session.reduce_auto_launch_notification";

    // Boolean pref indicating whether the user has previously dismissed the
    // one-time notification indicating the need for a cleanup powerwash after TPM
    // firmware update that didn't flush the TPM SRK.
    public static final String TPM_FIRMWARE_UPDATE_CLEANUP_DISMISSED = "tpm_firmware_update.cleanup_dismissed";

    // Int64 pref indicating the time in microseconds since Windows epoch
    // (1601-01-01 00:00:00 UTC) when the notification informing the user about a
    // planned TPM update that will clear all user data was shown. If the
    // notification was not yet shown the pref holds the value Time::Min().
    public static final String TPM_UPDATE_PLANNED_NOTIFICATION_SHOWN_TIME = "tpm_auto_update.planned_notification_shown_time";

    // Boolean pref indicating whether the notification informing the user that an
    // auto-update that will clear all the user data at next reboot was shown.
    public static final String TPM_UPDATE_ON_NEXT_REBOOT_NOTIFICATION_SHOWN = "tpm_auto_update.update_on_reboot_notification_shown";

    // Boolean pref indicating whether the NetBios Name Query Request Protocol is
    // used for discovering shares on the user's network by the Network File
    // Shares for Chrome OS feature.
    public static final String NET_BIOS_SHARE_DISCOVERY_ENABLED = "network_file_shares.netbios_discovery.enabled";

    // Amount of screen time that a child user has used in the current day.
    public static final String CHILD_SCREEN_TIME_MILLISECONDS = "child_screen_time";

    // Last time the kChildScreenTimeMilliseconds was saved.
    public static final String LAST_CHILD_SCREEN_TIME_SAVED = "last_child_screen_time_saved";

    // Last time that the kChildScreenTime pref was reset.
    public static final String LAST_CHILD_SCREEN_TIME_RESET = "last_child_screen_time_reset";

    // Last patch on which release notes were shown.
    public static final String RELEASE_NOTES_LAST_SHOWN_MILESTONE = "last_release_notes_shown_milestone";

    // Amount of times the release notes suggestion chip should be
    // shown before it disappears.
    public static final String RELEASE_NOTES_SUGGESTION_CHIP_TIMES_LEFT_TO_SHOW = "times_left_to_show_release_notes_suggestion_chip";

    // Boolean pref indicating whether the NTLM authentication protocol should be
    // enabled when mounting an SMB share with a user credential by the Network File
    // Shares for Chrome OS feature.
    public static final String NTLM_SHARE_AUTHENTICATION_ENABLED = "network_file_shares.ntlm_share_authentication.enabled";

    // Dictionary pref containing configuration used to verify Parent Access Code.
    // Controlled by ParentAccessCodeConfig policy.
    public static final String PARENT_ACCESS_CODE_CONFIG = "child_user.parent_access_code.config";

    // List pref containing app activity and state for each application.
    public static final String PER_APP_TIME_LIMITS_APP_ACTIVITIES = "child_user.per_app_time_limits.app_activities";

    // Int64 to specify the last timestamp the AppActivityRegistry was reset.
    public static final String PER_APP_TIME_LIMITS_LAST_RESET_TIME = "child_user.per_app_time_limits.last_reset_time";

    // Int64 to specify the last timestamp the app activity has been successfully
    // reported.
    public static final String PER_APP_TIME_LIMITS_LAST_SUCCESSFUL_REPORT_TIME = "child_user.per_app_time_limits.last_successful_report_time";

    // Int64 to specify the latest AppLimit update timestamp from.
    public static final String PER_APP_TIME_LIMITS_LATEST_LIMIT_UPDATE_TIME = "child_user.per_app_time_limits.latest_limit_update_time";

    // Dictionary pref containing the per-app time limits configuration for
    // child user. Controlled by PerAppTimeLimits policy.
    public static final String PER_APP_TIME_LIMITS_POLICY = "child_user.per_app_time_limits.policy";

    // Dictionary pref containing the allowed urls, schemes and applications
    // that would not be blocked by per app time limits.
    // Note that this used to be `kPerAppTimeLimitsWhitelistPolicy`, hence the
    // difference between the variable name and the string value.
    public static final String PER_APP_TIME_LIMITS_ALLOWLIST_POLICY = "child_user.per_app_time_limits.whitelist";

    // Integer pref to record the day id (number of days since origin of time) when
    // family user metrics were last recorded.
    public static final String FAMILY_USER_METRICS_DAY_ID = "family_user.metrics.day_id";

    // TimeDelta pref to record the accumulated user session duration for family
    // user metrics.
    public static final String FAMILY_USER_METRICS_SESSION_ENGAGEMENT_DURATION = "family_user.metrics.session_engagement_duration";

    // TimeDelta pref to record the accumulated Chrome browser app usage for family
    // user metrics.
    public static final String FAMILY_USER_METRICS_CHROME_BROWSER_ENGAGEMENT_DURATION = "family_user.metrics.chrome_browser_engagement_duration";

    // List of preconfigured network file shares.
    public static final String NETWORK_FILE_SHARES_PRECONFIGURED_SHARES = "network_file_shares.preconfigured_shares";

    // URL path string of the most recently used SMB NetworkFileShare path.
    public static final String MOST_RECENTLY_USED_NETWORK_FILE_SHARE_URL = "network_file_shares.most_recently_used_url";

    // List of network files shares added by the user.
    public static final String NETWORK_FILE_SHARES_SAVED_SHARES = "network_file_shares.saved_shares";

    // A string pref storing the path of device wallpaper image file.
    public static final String DEVICE_WALLPAPER_IMAGE_FILE_PATH = "policy.device_wallpaper_image_file_path";

    // Boolean whether Kerberos daemon supports remembering passwords.
    // Tied to KerberosRememberPasswordEnabled policy.
    public static final String KERBEROS_REMEMBER_PASSWORD_ENABLED = "kerberos.remember_password_enabled";

    // Boolean whether users may add new Kerberos accounts.
    // Tied to KerberosAddAccountsAllowed policy.
    public static final String KERBEROS_ADD_ACCOUNTS_ALLOWED = "kerberos.add_accounts_allowed";

    // Dictionary specifying a pre-set list of Kerberos accounts.
    // Tied to KerberosAccounts policy.
    public static final String KERBEROS_ACCOUNTS = "kerberos.accounts";

    // Used by KerberosCredentialsManager to remember which account is currently
    // active (empty if none) and to determine whether to wake up the Kerberos
    // daemon on session startup.
    public static final String KERBEROS_ACTIVE_PRINCIPAL_NAME = "kerberos.active_principal_name";

    // A boolean pref for enabling/disabling App reinstall recommendations in Zero
    // State Launcher by policy.
    public static final String APP_REINSTALL_RECOMMENDATION_ENABLED = "zero_state_app_install_recommendation.enabled";

    // A boolean pref that when set to true, prevents the browser window from
    // launching at the start of the session.
    public static final String STARTUP_BROWSER_WINDOW_LAUNCH_SUPPRESSED = "startup_browser_window_launch_suppressed";

    // A string pref stored in local state. Set and read by extensions using the
    // chrome.login API.
    public static final String LOGIN_EXTENSION_API_DATA_FOR_NEXT_LOGIN_ATTEMPT = "extensions_api.login.data_for_next_login_attempt";

    // A string user profile pref containing the ID of the extension which launched
    // the current Managed Guest Session using the chrome.login extension API. A
    // non-empty ID indicates that the current Managed Guest Session is lockable,
    // and can only be unlocked by the specified extension using the chrome.login
    // extension API.
    public static final String LOGIN_EXTENSION_API_LAUNCH_EXTENSION_ID = "extensions_api.login.launch_extension_id";

    // String containing last RSU lookup key uploaded. Empty until first upload.
    public static final String LAST_RSU_DEVICE_ID_UPLOADED = "rsu.last_rsu_device_id_uploaded";

    // A string pref stored in local state containing the name of the device.
    public static final String DEVICE_NAME = "device_name";

    // Boolean user profile pref that determines whether to show a banner in browser
    // settings that links to OS settings.
    public static final String SETTINGS_SHOW_OS_BANNER = "settings.cros.show_os_banner";

    // A JSON pref for controlling which USB devices are whitelisted for certain
    // urls to be used via the WebUSB API on the login screen.
    public static final String DEVICE_LOGIN_SCREEN_WEB_USB_ALLOW_DEVICES_FOR_URLS = "device_login_screen_webusb_allow_devices_for_urls";

    // Int64 pref indicating the time in microseconds since Windows epoch when the
    // timer for update required which will block user session was started. If the
    // timer is not started the pref holds the default value base::Time().
    public static final String UPDATE_REQUIRED_TIMER_START_TIME = "update_required_timer_start_time";

    // Int64 pref indicating the waiting time in microseconds after which the update
    // required timer will expire and block user session. If the timer is not
    // started the pref holds the default value base::TimeDelta().
    public static final String UPDATE_REQUIRED_WARNING_PERIOD = "update_required_warning_period";

    // String user profile pref that contains the host and port of the local
    // proxy which tunnels user traffic, in the format <address>:<proxy>. Only set
    // when System-proxy and ARC++ are enabled by policy.
    public static final String SYSTEM_PROXY_USER_TRAFFIC_HOST_AND_PORT = "system_proxy.user_traffic_host_and_port";

    // Boolean pref indicating whether the supervised user has migrated EDU
    // secondary account to ARC++.
    public static final String EDU_COEXISTENCE_ARC_MIGRATION_COMPLETED = "account_manager.edu_coexistence_arc_migration_completed";

    // A boolean pref set to true if a Home button to open the Home pages should be
    // visible on the toolbar.
    public static final String SHOW_HOME_BUTTON = "browser.show_home_button";

    // Boolean pref to define the default setting for "block offensive words".
    // The old key value is kept to avoid unnecessary migration code.
    public static final String SPEECH_RECOGNITION_FILTER_PROFANITIES = "browser.speechinput_censor_results";

    // Boolean controlling whether deleting browsing and download history is
    // permitted.
    public static final String ALLOW_DELETING_BROWSER_HISTORY = "history.deleting_enabled";

    // Boolean controlling whether SafeSearch is mandatory for Google Web Searches.
    public static final String FORCE_GOOGLE_SAFE_SEARCH = "settings.force_google_safesearch";

    // Integer controlling whether Restrict Mode (moderate/strict) is mandatory on
    // YouTube. See |safe_search_util::YouTubeRestrictMode| for possible values.
    public static final String FORCE_YOU_TUBE_RESTRICT = "settings.force_youtube_restrict";

    // Comma separated list of domain names (e.g. "google.com,school.edu").
    // When this pref is set, the user will be able to access Google Apps
    // only using an account that belongs to one of the domains from this pref.
    public static final String ALLOWED_DOMAINS_FOR_APPS = "settings.allowed_domains_for_apps";

    // Linux specific preference on whether we should match the system theme.
    public static final String USES_SYSTEM_THEME = "extensions.theme.use_system";


    public static final String CURRENT_THEME_PACK_FILENAME = "extensions.theme.pack";


    public static final String CURRENT_THEME_ID = "extensions.theme.id";


    public static final String AUTOGENERATED_THEME_COLOR = "autogenerated.theme.color";

    // Boolean pref which persists whether the extensions_ui is in developer mode
    // (showing developer packing tools and extensions details)
    public static final String EXTENSIONS_UI_DEVELOPER_MODE = "extensions.ui.developer_mode";

    // Dictionary pref that tracks which command belongs to which
    // extension + named command pair.
    public static final String EXTENSION_COMMANDS = "extensions.commands";

    // Pref containing the directory for internal plugins as written to the plugins
    // list (below).
    public static final String PLUGINS_LAST_INTERNAL_DIRECTORY = "plugins.last_internal_directory";

    // List pref containing information (dictionaries) on plugins.
    public static final String PLUGINS_PLUGINS_LIST = "plugins.plugins_list";

    // Whether Chrome should use its internal PDF viewer or not.
    public static final String PLUGINS_ALWAYS_OPEN_PDF_EXTERNALLY = "plugins.always_open_pdf_externally";

    // Whether about:plugins is shown in the details mode or not.
    public static final String PLUGINS_SHOW_DETAILS = "plugins.show_details";

    // Boolean that indicates whether outdated plugins are allowed or not.
    public static final String PLUGINS_ALLOW_OUTDATED = "plugins.allow_outdated";

    // Boolean that indicates whether all Flash content (including cross-origin and
    // small content) is allowed to run when it is explicitly allowed via content
    // settings.
    public static final String RUN_ALL_FLASH_IN_ALLOW_MODE = "plugins.run_all_flash_in_allow_mode";

    // Dictionary holding plugins metadata.
    public static final String PLUGINS_METADATA = "plugins.metadata";

    // Last update time of plugins resource cache.
    public static final String PLUGINS_RESOURCE_CACHE_UPDATE = "plugins.resource_cache_update";

    // Int64 containing the internal value of the time at which the default browser
    // infobar was last dismissed by the user.
    public static final String DEFAULT_BROWSER_LAST_DECLINED = "browser.default_browser_infobar_last_declined";

    // Boolean that indicates whether the kDefaultBrowserLastDeclined preference
    // should be reset on start-up.
    public static final String RESET_CHECK_DEFAULT_BROWSER = "browser.should_reset_check_default_browser";

    // Policy setting whether default browser check should be disabled and default
    // browser registration should take place.
    public static final String DEFAULT_BROWSER_SETTING_ENABLED = "browser.default_browser_setting_enabled";

    // String indicating the size of the captions text as a percentage.
    public static final String ACCESSIBILITY_CAPTIONS_TEXT_SIZE = "accessibility.captions.text_size";

    // String indicating the font of the captions text.
    public static final String ACCESSIBILITY_CAPTIONS_TEXT_FONT = "accessibility.captions.text_font";

    // Comma-separated string indicating the RGB values of the captions text color.
    public static final String ACCESSIBILITY_CAPTIONS_TEXT_COLOR = "accessibility.captions.text_color";

    // Integer indicating the opacity of the captions text from 0 - 100.
    public static final String ACCESSIBILITY_CAPTIONS_TEXT_OPACITY = "accessibility.captions.text_opacity";

    // Comma-separated string indicating the RGB values of the background color.
    public static final String ACCESSIBILITY_CAPTIONS_BACKGROUND_COLOR = "accessibility.captions.background_color";

    // CSS string indicating the shadow of the captions text.
    public static final String ACCESSIBILITY_CAPTIONS_TEXT_SHADOW = "accessibility.captions.text_shadow";

    // Integer indicating the opacity of the captions text background from 0 - 100.
    public static final String ACCESSIBILITY_CAPTIONS_BACKGROUND_OPACITY = "accessibility.captions.background_opacity";

    // Boolean that indicates whether chrome://accessibility should show the
    // internal accessibility tree.
    public static final String SHOW_INTERNAL_ACCESSIBILITY_TREE = "accessibility.show_internal_accessibility_tree";

    // Whether the "Get Image Descriptions from Google" feature is enabled.
    // Only shown to screen reader users.
    public static final String ACCESSIBILITY_IMAGE_LABELS_ENABLED = "settings.a11y.enable_accessibility_image_labels";

    // Whether the opt-in dialog for image labels has been accepted yet. The opt-in
    // need not be shown every time if it has already been accepted once.
    public static final String ACCESSIBILITY_IMAGE_LABELS_OPT_IN_ACCEPTED = "settings.a11y.enable_accessibility_image_labels_opt_in_accepted";

    // Whether the "Get Image Descriptions from Google" feature is enabled on
    // Android. We expose this only to mobile Android.
    public static final String ACCESSIBILITY_IMAGE_LABELS_ENABLED_ANDROID = "settings.a11y.enable_accessibility_image_labels_android";

    // Whether the "Get Image Descriptions from Google" feature is enabled only
    // while on Wi-Fi, or if it can use mobile data. Exposed only to mobile Android.
    public static final String ACCESSIBILITY_IMAGE_LABELS_ONLY_ON_WIFI = "settings.a11y.enable_accessibility_image_labels_only_on_wifi";

    // A boolean pref which determines whether focus highlighting is enabled.
    public static final String ACCESSIBILITY_FOCUS_HIGHLIGHT_ENABLED = "settings.a11y.focus_highlight";

    // Whether the Live Caption feature is enabled.
    public static final String LIVE_CAPTION_ENABLED = "accessibility.captions.live_caption_enabled";

    // The language to use with the Live Caption feature.
    public static final String LIVE_CAPTION_LANGUAGE_CODE = "accessibility.captions.live_caption_language";

    // The file path of the Speech On-Device API (SODA) binary.
    public static final String SODA_BINARY_PATH = "accessibility.captions.soda_binary_path";

    // The file path of the en-US Speech On-Device API (SODA) configuration file.
    public static final String SODA_EN_US_CONFIG_PATH = "accessibility.captions.soda_en_us_config_path";

    // The file path of the ja-JP Speech On-Device API (SODA) configuration file.
    public static final String SODA_JA_JP_CONFIG_PATH = "accessibility.captions.soda_ja_jp_config_path";

    // The scheduled time to clean up the Speech On-Device API (SODA) files from the
    // device.
    public static final String SODA_SCHEDULED_DELETION_TIME = "accessibility.captions.soda_scheduled_deletion_time";

    // Boolean that indicates whether the application should show the info bar
    // asking the user to set up automatic updates when Keystone promotion is
    // required.
    public static final String SHOW_UPDATE_PROMOTION_INFO_BAR = "browser.show_update_promotion_info_bar";

    // Boolean that is false if we should show window manager decorations.  If
    // true, we draw a custom chrome frame (thicker title bar and blue border).
    public static final String USE_CUSTOM_CHROME_FRAME = "browser.custom_chrome_frame";

    // Which plugins have been whitelisted manually by the user.
    public static final String CONTENT_SETTINGS_PLUGIN_WHITELIST = "profile.content_settings.plugin_whitelist";

    // Double that indicates the default zoom level.
    public static final String PARTITION_DEFAULT_ZOOM_LEVEL = "partition.default_zoom_level";

    // Dictionary that maps hostnames to zoom levels.  Hosts not in this pref will
    // be displayed at the default zoom level.
    public static final String PARTITION_PER_HOST_ZOOM_LEVELS = "partition.per_host_zoom_levels";


    public static final String PINNED_TABS = "pinned_tabs";

    // Preference to disable 3D APIs (WebGL, Pepper 3D).
    public static final String DISABLE3DAP_IS = "disable_3d_apis";

    // Whether to enable hyperlink auditing ("<a ping>").
    public static final String ENABLE_HYPERLINK_AUDITING = "enable_a_ping";

    // Whether to enable sending referrers.
    public static final String ENABLE_REFERRERS = "enable_referrers";

    // Whether to send the DNT header.
    public static final String ENABLE_DO_NOT_TRACK = "enable_do_not_track";

    // Whether to allow the use of Encrypted Media Extensions (EME), except for the
    // use of Clear Key key sytems, which is always allowed as required by the spec.
    // TODO(crbug.com/784675): This pref was used as a WebPreference which is why
    // the string is prefixed with "webkit.webprefs". Now this is used in
    // blink::RendererPreferences and we should migrate the pref to use a new
    // non-webkit-prefixed string.
    public static final String ENABLE_ENCRYPTED_MEDIA = "webkit.webprefs.encrypted_media_enabled";

    // Boolean that specifies whether to import the form data for autofill from the
    // default browser on first run.
    public static final String IMPORT_AUTOFILL_FORM_DATA = "import_autofill_form_data";

    // Boolean that specifies whether to import bookmarks from the default browser
    // on first run.
    public static final String IMPORT_BOOKMARKS = "import_bookmarks";

    // Boolean that specifies whether to import the browsing history from the
    // default browser on first run.
    public static final String IMPORT_HISTORY = "import_history";

    // Boolean that specifies whether to import the homepage from the default
    // browser on first run.
    public static final String IMPORT_HOMEPAGE = "import_home_page";

    // Boolean that specifies whether to import the saved passwords from the default
    // browser on first run.
    public static final String IMPORT_SAVED_PASSWORDS = "import_saved_passwords";

    // Boolean that specifies whether to import the search engine from the default
    // browser on first run.
    public static final String IMPORT_SEARCH_ENGINE = "import_search_engine";

    // Prefs used to remember selections in the "Import data" dialog on the settings
    // page (chrome://settings/importData).
    public static final String IMPORT_DIALOG_AUTOFILL_FORM_DATA = "import_dialog_autofill_form_data";


    public static final String IMPORT_DIALOG_BOOKMARKS = "import_dialog_bookmarks";


    public static final String IMPORT_DIALOG_HISTORY = "import_dialog_history";


    public static final String IMPORT_DIALOG_SAVED_PASSWORDS = "import_dialog_saved_passwords";


    public static final String IMPORT_DIALOG_SEARCH_ENGINE = "import_dialog_search_engine";

    // Profile avatar and name
    public static final String PROFILE_AVATAR_INDEX = "profile.avatar_index";


    public static final String PROFILE_NAME = "profile.name";

    // Whether a profile is using a default avatar name (eg. Pickles or Person 1)
    // because it was randomly assigned at profile creation time.
    public static final String PROFILE_USING_DEFAULT_NAME = "profile.using_default_name";

    // Whether a profile is using an avatar without having explicitely chosen it
    // (i.e. was assigned by default by legacy profile creation).
    public static final String PROFILE_USING_DEFAULT_AVATAR = "profile.using_default_avatar";


    public static final String PROFILE_USING_GAIA_AVATAR = "profile.using_gaia_avatar";

    // The supervised user ID.
    public static final String SUPERVISED_USER_ID = "profile.managed_user_id";

    // Integer that specifies the number of times that we have shown the upgrade
    // tutorial card in the avatar menu bubble.
    public static final String PROFILE_AVATAR_TUTORIAL_SHOWN = "profile.avatar_bubble_tutorial_shown";

    // Indicates if we've already shown a notification that high contrast
    // mode is on, recommending high-contrast extensions and themes.
    public static final String INVERT_NOTIFICATION_SHOWN = "invert_notification_version_2_shown";

    // A pref holding the list of printer types to be disabled.
    public static final String PRINTER_TYPE_DENY_LIST = "printing.printer_type_deny_list";

    // The allowed/default value for the 'Headers and footers' checkbox, in Print
    // Preview.
    public static final String PRINT_HEADER_FOOTER = "printing.print_header_footer";

    // A pref holding the allowed background graphics printing modes.
    public static final String PRINTING_ALLOWED_BACKGROUND_GRAPHICS_MODES = "printing.allowed_background_graphics_modes";

    // A pref holding the default background graphics mode.
    public static final String PRINTING_BACKGROUND_GRAPHICS_DEFAULT = "printing.background_graphics_default";

    // A pref holding the default paper size.
    public static final String PRINTING_PAPER_SIZE_DEFAULT = "printing.paper_size_default";

    // Boolean controlling whether printing is enabled.
    public static final String PRINTING_ENABLED = "printing.enabled";

    // Boolean controlling whether print preview is disabled.
    public static final String PRINT_PREVIEW_DISABLED = "printing.print_preview_disabled";

    // A pref holding the value of the policy used to control default destination
    // selection in the Print Preview. See DefaultPrinterSelection policy.
    public static final String PRINT_PREVIEW_DEFAULT_DESTINATION_SELECTION_RULES = "printing.default_destination_selection_rules";

    // An integer pref that holds the rasterization mode to use when printing.
    public static final String PRINT_RASTERIZATION_MODE = "printing.rasterization_mode";

    // A pref that sets the default destination in Print Preview to always be the
    // OS default printer instead of the most recently used destination.
    public static final String PRINT_PREVIEW_USE_SYSTEM_DEFAULT_PRINTER = "printing.use_system_default_printer";

    // A prefs that limits how many snapshots of the user's data directory there can
    // be on the disk at any time. Following each major version update, Chrome will
    // create a snapshot of certain portions of the user's browsing data for use in
    // case of a later emergency version rollback.
    public static final String USER_DATA_SNAPSHOT_RETENTION_LIMIT = "downgrade.snapshot_retention_limit";

    // List of print servers ids that are allowed in the user policy. List of
    // strings. Note that this used to be `kExternalPrintServersWhitelist`, hence
    // the difference between the variable name and the string value.
    public static final String EXTERNAL_PRINT_SERVERS_ALLOWLIST = "native_printing.external_print_servers_whitelist";

    // List of print servers ids that are allowed in the device policy. List of
    // strings.
    public static final String DEVICE_EXTERNAL_PRINT_SERVERS_ALLOWLIST = "native_printing.device_external_print_servers_allowlist";

    // List of printers configured by policy.
    public static final String RECOMMENDED_PRINTERS = "native_printing.recommended_printers";

    // Enum designating the type of restrictions bulk printers are using.
    public static final String RECOMMENDED_PRINTERS_ACCESS_MODE = "native_printing.recommended_printers_access_mode";

    // List of printer ids which are explicitly disallowed.  List of strings. Note
    // that this used to be `kRecommendedPrintersBlacklist`, hence the difference
    // between the variable name and the string value.
    public static final String RECOMMENDED_PRINTERS_BLOCKLIST = "native_printing.recommended_printers_blacklist";

    // List of printer ids that are allowed.  List of strings. Note that this
    // used to be `kRecommendedNativePrintersWhitelist`, hence the difference
    // between the variable name and the string value.
    public static final String RECOMMENDED_PRINTERS_ALLOWLIST = "native_printing.recommended_printers_whitelist";

    // A Boolean flag which represents whether or not users are allowed to configure
    // and use their own printers.
    public static final String USER_PRINTERS_ALLOWED = "native_printing.user_native_printers_allowed";

    // A pref holding the list of allowed printing color mode as a bitmask composed
    // of |printing::ColorModeRestriction| values. 0 is no restriction.
    public static final String PRINTING_ALLOWED_COLOR_MODES = "printing.allowed_color_modes";

    // A pref holding the list of allowed printing duplex mode as a bitmask composed
    // of |printing::DuplexModeRestriction| values. 0 is no restriction.
    public static final String PRINTING_ALLOWED_DUPLEX_MODES = "printing.allowed_duplex_modes";

    // A pref holding the allowed PIN printing modes.
    public static final String PRINTING_ALLOWED_PIN_MODES = "printing.allowed_pin_modes";

    // A pref holding the default color mode.
    public static final String PRINTING_COLOR_DEFAULT = "printing.color_default";

    // A pref holding the default duplex mode.
    public static final String PRINTING_DUPLEX_DEFAULT = "printing.duplex_default";

    // A pref holding the default PIN mode.
    public static final String PRINTING_PIN_DEFAULT = "printing.pin_default";

    // Boolean flag which represents whether username and filename should be sent
    // to print server.
    public static final String PRINTING_SEND_USERNAME_AND_FILENAME_ENABLED = "printing.send_username_and_filename_enabled";

    // Indicates how many sheets is allowed to use for a single print job.
    public static final String PRINTING_MAX_SHEETS_ALLOWED = "printing.max_sheets_allowed";

    // Indicates how long print jobs metadata is stored on the device, in days.
    public static final String PRINT_JOB_HISTORY_EXPIRATION_PERIOD = "printing.print_job_history_expiration_period";

    // The list of extensions allowed to skip print job confirmation dialog when
    // they use the chrome.printing.submitJob() function. Note that this used to be
    // `kPrintingAPIExtensionsWhitelist`, hence the difference between the variable
    // name and the string value.
    public static final String PRINTING_API_EXTENSIONS_ALLOWLIST = "printing.printing_api_extensions_whitelist";

    // Boolean flag which represents whether the user's print job history can be
    // deleted.
    public static final String DELETE_PRINT_JOB_HISTORY_ALLOWED = "printing.delete_print_job_history_allowed";

    // An integer pref specifying the fallback behavior for sites outside of content
    // packs. One of:
    // 0: Allow (does nothing)
    // 1: Warn.
    // 2: Block.
    public static final String DEFAULT_SUPERVISED_USER_FILTERING_BEHAVIOR = "profile.managed.default_filtering_behavior";

    // List pref containing the users supervised by this user.
    public static final String SUPERVISED_USERS = "profile.managed_users";

    // List pref containing the extension ids which are not allowed to send
    // notifications to the message center.
    public static final String MESSAGE_CENTER_DISABLED_EXTENSION_IDS = "message_center.disabled_extension_ids";

    // Boolean pref that determines whether the user can enter fullscreen mode.
    // Disabling fullscreen mode also makes kiosk mode unavailable on desktop
    // platforms.
    public static final String FULLSCREEN_ALLOWED = "fullscreen.allowed";

    // Enable controllable features in the local discovery UI (chrome://devices).
    // The UI shows discoverable devices near the user and registered cloud devices,
    // and allow users to add printers to cloud print when not on Chrome OS
    // devices .
    public static final String LOCAL_DISCOVERY_ENABLED = "local_discovery.enabled";

    // Enable notifications for new devices on the local network that can be
    // registered to the user's account, e.g. Google Cloud Print printers.
    public static final String LOCAL_DISCOVERY_NOTIFICATIONS_ENABLED = "local_discovery.notifications_enabled";

    // Boolean pref indicating whether notification permissions were migrated to
    // notification channels (on Android O+ we use channels to store notification
    // permission, so any existing permissions must be migrated).
    public static final String MIGRATED_TO_SITE_NOTIFICATION_CHANNELS = "notifications.migrated_to_channels";

    // Boolean pref indicating whether blocked site notification channels underwent
    // a one-time reset yet for https://crbug.com/835232.
    // TODO(https://crbug.com/837614): Remove this after a few releases (M69?).
    public static final String CLEARED_BLOCKED_SITE_NOTIFICATION_CHANNELS = "notifications.cleared_blocked_channels";

    // Usage stats reporting opt-in.
    public static final String USAGE_STATS_ENABLED = "usage_stats_reporting.enabled";

    // Maps from app ids to origin + Service Worker registration ID.
    public static final String PUSH_MESSAGING_APP_IDENTIFIER_MAP = "gcm.push_messaging_application_id_map";

    // A string like "com.chrome.macosx" that should be used as the GCM category
    // when an app_id is sent as a subtype instead of as a category.
    public static final String GCM_PRODUCT_CATEGORY_FOR_SUBTYPES = "gcm.product_category_for_subtypes";

    // Whether a user is allowed to use Easy Unlock.
    public static final String EASY_UNLOCK_ALLOWED = "easy_unlock.allowed";

    // Preference storing Easy Unlock pairing data.
    public static final String EASY_UNLOCK_PAIRING = "easy_unlock.pairing";

    // Used to indicate whether or not the toolbar redesign bubble has been shown
    // and acknowledged, and the last time the bubble was shown.
    public static final String TOOLBAR_ICON_SURFACING_BUBBLE_ACKNOWLEDGED = "toolbar_icon_surfacing_bubble_acknowledged";


    public static final String TOOLBAR_ICON_SURFACING_BUBBLE_LAST_SHOW_TIME = "toolbar_icon_surfacing_bubble_show_time";

    // Define the IP handling policy override that WebRTC should follow. When not
    // set, it defaults to "default".
    public static final String WEB_RTCIP_HANDLING_POLICY = "webrtc.ip_handling_policy";

    // Define range of UDP ports allowed to be used by WebRTC PeerConnections.
    public static final String WEB_RTCUDP_PORT_RANGE = "webrtc.udp_port_range";

    // Whether WebRTC event log collection by Google domains is allowed.
    public static final String WEB_RTC_EVENT_LOG_COLLECTION_ALLOWED = "webrtc.event_logs_collection";

    // Holds URL patterns that specify URLs for which local IP addresses are exposed
    // in ICE candidates.
    public static final String WEB_RTC_LOCAL_IPS_ALLOWED_URLS = "webrtc.local_ips_allowed_urls";

    // Whether WebRTC PeerConnections are allowed to use legacy versions of the TLS
    // and DTLS protocols.
    public static final String WEB_RTC_ALLOW_LEGACY_TLS_PROTOCOLS = "webrtc.allow_legacy_tls_protocols";

    // Whether or not this profile has been shown the Welcome page.
    public static final String HAS_SEEN_WELCOME_PAGE = "browser.has_seen_welcome_page";

    // Put the user into an onboarding group that's decided when they go through
    // the first run onboarding experience. Only users in a group will have their
    // finch group pinged to keep track of them for the experiment.
    public static final String NAVI_ONBOARD_GROUP = "browser.navi_onboard_group";

    // Boolean indicating whether, as part of the adaptive activation quiet UI dry
    // run experiment, the user has accumulated three notification permission
    // request denies in a row.
    public static final String HAD_THREE_CONSECUTIVE_NOTIFICATION_PERMISSION_DENIES = "profile.content_settings.had_three_consecutive_denies.notifications";

    // List containing a history of past permission actions.
    public static final String NOTIFICATION_PERMISSION_ACTIONS = "profile.content_settings.permission_actions.notifications";

    // Directory of the last profile used.
    public static final String PROFILE_LAST_USED = "profile.last_used";

    // List of directories of the profiles last active.
    public static final String PROFILES_LAST_ACTIVE = "profile.last_active_profiles";

    // Total number of profiles created for this Chrome build. Used to tag profile
    // directories.
    public static final String PROFILES_NUM_CREATED = "profile.profiles_created";

    // Total number of Guest profiles created for this Chrome build. Used to tag
    // ephemeral Guest profile directories.
    public static final String GUEST_PROFILES_NUM_CREATED = "profile.guest_profiles_created";

    // String containing the version of Chrome that the profile was created by.
    // If profile was created before this feature was added, this pref will default
    // to "1.0.0.0".
    public static final String PROFILE_CREATED_BY_VERSION = "profile.created_by_version";

    // A map of profile data directory to cached information. This cache can be
    // used to display information about profiles without actually having to load
    // them.
    public static final String PROFILE_INFO_CACHE = "profile.info_cache";

    // A list of profile paths that should be deleted on shutdown. The deletion does
    // not happen if the browser crashes, so we remove the profile on next start.
    public static final String PROFILES_DELETED = "profiles.profiles_deleted";

    // This is the location of a list of dictionaries of plugin stability stats.
    public static final String STABILITY_PLUGIN_STATS = "user_experience_metrics.stability.plugin_stats2";

    // On Chrome OS, total number of non-Chrome user process crashes
    // since the last report.
    public static final String STABILITY_OTHER_USER_CRASH_COUNT = "user_experience_metrics.stability.other_user_crash_count";

    // On Chrome OS, total number of kernel crashes since the last report.
    public static final String STABILITY_KERNEL_CRASH_COUNT = "user_experience_metrics.stability.kernel_crash_count";

    // On Chrome OS, total number of unclean system shutdowns since the
    // last report.
    public static final String STABILITY_SYSTEM_UNCLEAN_SHUTDOWN_COUNT = "user_experience_metrics.stability.system_unclean_shutdowns";

    // The keys below are used for the dictionaries in the
    // kStabilityPluginStats list.
    public static final String STABILITY_PLUGIN_NAME = "name";


    public static final String STABILITY_PLUGIN_LAUNCHES = "launches";


    public static final String STABILITY_PLUGIN_INSTANCES = "instances";


    public static final String STABILITY_PLUGIN_CRASHES = "crashes";


    public static final String STABILITY_PLUGIN_LOADING_ERRORS = "loading_errors";

    // String containing the version of Chrome for which Chrome will not prompt the
    // user about setting Chrome as the default browser.
    public static final String BROWSER_SUPPRESS_DEFAULT_BROWSER_PROMPT = "browser.suppress_default_browser_prompt_for_version";

    // A collection of position, size, and other data relating to the browser
    // window to restore on startup.
    public static final String BROWSER_WINDOW_PLACEMENT = "browser.window_placement";

    // Browser window placement for popup windows.
    public static final String BROWSER_WINDOW_PLACEMENT_POPUP = "browser.window_placement_popup";

    // A collection of position, size, and other data relating to the task
    // manager window to restore on startup.
    public static final String TASK_MANAGER_WINDOW_PLACEMENT = "task_manager.window_placement";

    // The most recent stored column visibility of the task manager table to be
    // restored on startup.
    public static final String TASK_MANAGER_COLUMN_VISIBILITY = "task_manager.column_visibility";

    // A boolean indicating if ending processes are enabled or disabled by policy.
    public static final String TASK_MANAGER_END_PROCESS_ENABLED = "task_manager.end_process_enabled";

    // A collection of position, size, and other data relating to app windows to
    // restore on startup.
    public static final String APP_WINDOW_PLACEMENT = "browser.app_window_placement";

    // String which specifies where to download files to by default.
    public static final String DOWNLOAD_DEFAULT_DIRECTORY = "download.default_directory";

    // Boolean that records if the download directory was changed by an
    // upgrade a unsafe location to a safe location.
    public static final String DOWNLOAD_DIR_UPGRADED = "download.directory_upgrade";


    public static final String OPEN_PDF_DOWNLOAD_IN_SYSTEM_READER = "download.open_pdf_in_system_reader";

    // Int (as defined by DownloadPromptStatus) which specifies whether we should
    // ask the user where they want to download the file (only for Android).
    public static final String PROMPT_FOR_DOWNLOAD_ANDROID = "download.prompt_for_download_android";

    // The prompt status for the download later dialog.
    public static final String DOWNLOAD_LATER_PROMPT_STATUS = "download.download_later_prompt_status";

    // Boolean which specifies whether we should display the missing SD card error.
    // This is only applicable for Android.
    public static final String SHOW_MISSING_SD_CARD_ERROR_ANDROID = "download.show_missing_sd_card_error_android";

    // String which specifies where to save html files to by default.
    public static final String SAVE_FILE_DEFAULT_DIRECTORY = "savefile.default_directory";

    // The type used to save the page. See the enum SavePackage::SavePackageType in
    // the chrome/browser/download/save_package.h for the possible values.
    public static final String SAVE_FILE_TYPE = "savefile.type";

    // String which specifies the last directory that was chosen for uploading
    // or opening a file.
    public static final String SELECT_FILE_LAST_DIRECTORY = "selectfile.last_directory";

    // Boolean that specifies if file selection dialogs are shown.
    public static final String ALLOW_FILE_SELECTION_DIALOGS = "select_file_dialogs.allowed";

    // Map of default tasks, associated by MIME type.
    public static final String DEFAULT_TASKS_BY_MIME_TYPE = "filebrowser.tasks.default_by_mime_type";

    // Map of default tasks, associated by file suffix.
    public static final String DEFAULT_TASKS_BY_SUFFIX = "filebrowser.tasks.default_by_suffix";

    // A flag to enable/disable the Shared Clipboard feature which enables users to
    // send text across devices.
    public static final String SHARED_CLIPBOARD_ENABLED = "browser.shared_clipboard_enabled";

    // A flag to enable/disable the Click to Call feature which enables users to
    // send phone numbers from desktop to Android phones.
    public static final String CLICK_TO_CALL_ENABLED = "browser.click_to_call_enabled";

    // Extensions which should be opened upon completion.
    public static final String DOWNLOAD_EXTENSIONS_TO_OPEN = "download.extensions_to_open";

    // Extensions which should be opened upon completion, set by policy.
    public static final String DOWNLOAD_EXTENSIONS_TO_OPEN_BY_POLICY = "download.extensions_to_open_by_policy";


    public static final String DOWNLOAD_ALLOWED_UR_LS_FOR_OPEN_BY_POLICY = "download.allowed_urls_for_open_by_policy";

    // Dictionary of origins that have permission to launch at least one protocol
    // without first prompting the user. Each origin is a nested dictionary.
    // Within an origin dictionary, if a protocol is present with value |true|,
    // that protocol may be launched by that origin without first prompting
    // the user.
    public static final String PROTOCOL_HANDLER_PER_ORIGIN_ALLOWED_PROTOCOLS = "protocol_handler.allowed_origin_protocol_pairs";

    // String containing the last known intranet redirect URL, if any.  See
    // intranet_redirect_detector.h for more information.
    public static final String LAST_KNOWN_INTRANET_REDIRECT_ORIGIN = "browser.last_redirect_origin";

    // Boolean specifying that the intranet redirect detector should be enabled.
    // Defaults to true.
    // See also kIntranetRedirectBehavior in the omnibox component's prefs, which
    // also impacts the redirect detector.
    public static final String DNS_INTERCEPTION_CHECKS_ENABLED = "browser.dns_interception_checks_enabled";

    // An enum value of how the browser was shut down (see browser_shutdown.h).
    public static final String SHUTDOWN_TYPE = "shutdown.type";

    // Number of processes that were open when the user shut down.
    public static final String SHUTDOWN_NUM_PROCESSES = "shutdown.num_processes";

    // Number of processes that were shut down using the slow path.
    public static final String SHUTDOWN_NUM_PROCESSES_SLOW = "shutdown.num_processes_slow";

    // Whether to restart the current Chrome session automatically as the last thing
    // before shutting everything down.
    public static final String RESTART_LAST_SESSION_ON_SHUTDOWN = "restart.last.session.on.shutdown";

    // Pref name for the policy controlling presentation of full-tab promotional
    // and/or educational content.
    public static final String PROMOTIONAL_TABS_ENABLED = "browser.promotional_tabs_enabled";

    // Boolean that specifies whether or not to show security warnings for some
    // potentially bad command-line flags. True by default. Controlled by the
    // CommandLineFlagSecurityWarningsEnabled policy setting.
    public static final String COMMAND_LINE_FLAG_SECURITY_WARNINGS_ENABLED = "browser.command_line_flag_security_warnings_enabled";

    // Boolean that specifies whether or not showing the unsupported OS warning is
    // suppressed. False by default. Controlled by the SuppressUnsupportedOSWarning
    // policy setting.
    public static final String SUPPRESS_UNSUPPORTED_OS_WARNING = "browser.suppress_unsupported_os_warning";

    // Set before autorestarting Chrome, cleared on clean exit.
    public static final String WAS_RESTARTED = "was.restarted";

    // Whether Extensions are enabled.
    public static final String DISABLE_EXTENSIONS = "extensions.disabled";

    // Customized app page names that appear on the New Tab Page.
    public static final String NTP_APP_PAGE_NAMES = "ntp.app_page_names";

    // Keeps track of which sessions are collapsed in the Other Devices menu.
    public static final String NTP_COLLAPSED_FOREIGN_SESSIONS = "ntp.collapsed_foreign_sessions";

    // Keeps track of recently closed tabs collapsed state in the Other Devices
    // menu.
    public static final String NTP_COLLAPSED_RECENTLY_CLOSED_TABS = "ntp.collapsed_recently_closed_tabs";

    // Keeps track of snapshot documents collapsed state in the Other Devices menu.
    public static final String NTP_COLLAPSED_SNAPSHOT_DOCUMENT = "ntp.collapsed_snapshot_document";

    // Keeps track of sync promo collapsed state in the Other Devices menu.
    public static final String NTP_COLLAPSED_SYNC_PROMO = "ntp.collapsed_sync_promo";

    // Holds info for New Tab Page custom background
    public static final String NTP_CUSTOM_BACKGROUND_DICT = "ntp.custom_background_dict";


    public static final String NTP_CUSTOM_BACKGROUND_LOCAL_TO_DEVICE = "ntp.custom_background_local_to_device";


    public static final String NTP_MODULES_VISIBLE = "NewTabPage.ModulesVisible";

    // List of promos that the user has dismissed while on the NTP.
    public static final String NTP_PROMO_BLOCKLIST = "ntp.promo_blocklist";

    // Data associated with search suggestions that appear on the NTP.
    public static final String NTP_SEARCH_SUGGESTIONS_BLOCKLIST = "ntp.search_suggestions_blocklist";


    public static final String NTP_SEARCH_SUGGESTIONS_IMPRESSIONS = "ntp.search_suggestions_impressions";


    public static final String NTP_SEARCH_SUGGESTIONS_OPT_OUT = "ntp.search_suggestions_opt_out";

    // Tracks whether the user has chosen to hide the shortcuts tiles on the NTP.
    public static final String NTP_SHORTCUTS_VISIBLE = "ntp.shortcust_visible";

    // Tracks whether the user has chosen to use custom links or most visited sites
    // for the shortcut tiles on the NTP.
    public static final String NTP_USE_MOST_VISITED_TILES = "ntp.use_most_visited_tiles";

    // Which page should be visible on the new tab page v4
    public static final String NTP_SHOWN_PAGE = "ntp.shown_page";

    // A private RSA key for ADB handshake.
    public static final String DEV_TOOLS_ADB_KEY = "devtools.adb_key";

    // Defines administrator-set availability of developer tools.
    public static final String DEV_TOOLS_AVAILABILITY = "devtools.availability";

    // Dictionary from background service to recording expiration time.
    public static final String DEV_TOOLS_BACKGROUND_SERVICES_EXPIRATION_DICT = "devtools.backgroundserviceexpiration";

    // Determines whether devtools should be discovering usb devices for
    // remote debugging at chrome://inspect.
    public static final String DEV_TOOLS_DISCOVER_USB_DEVICES_ENABLED = "devtools.discover_usb_devices";

    // Maps of files edited locally using DevTools.
    public static final String DEV_TOOLS_EDITED_FILES = "devtools.edited_files";

    // List of file system paths added in DevTools.
    public static final String DEV_TOOLS_FILE_SYSTEM_PATHS = "devtools.file_system_paths";

    // A boolean specifying whether port forwarding should be enabled.
    public static final String DEV_TOOLS_PORT_FORWARDING_ENABLED = "devtools.port_forwarding_enabled";

    // A boolean specifying whether default port forwarding configuration has been
    // set.
    public static final String DEV_TOOLS_PORT_FORWARDING_DEFAULT_SET = "devtools.port_forwarding_default_set";

    // A dictionary of port->location pairs for port forwarding.
    public static final String DEV_TOOLS_PORT_FORWARDING_CONFIG = "devtools.port_forwarding_config";

    // A boolean specifying whether or not Chrome will scan for available remote
    // debugging targets.
    public static final String DEV_TOOLS_DISCOVER_TCP_TARGETS_ENABLED = "devtools.discover_tcp_targets";

    // A list of strings representing devtools target discovery servers.
    public static final String DEV_TOOLS_TCP_DISCOVERY_CONFIG = "devtools.tcp_discovery_config";

    // A dictionary with generic DevTools settings.
    public static final String DEV_TOOLS_PREFERENCES = "devtools.preferences";

    // Tracks the number of times the dice signin promo has been shown in the user
    // menu.
    public static final String DICE_SIGNIN_USER_MENU_PROMO_COUNT = "sync_promo.user_menu_show_count";

    // Create web application shortcut dialog preferences.
    public static final String WEB_APP_CREATE_ON_DESKTOP = "browser.web_app.create_on_desktop";


    public static final String WEB_APP_CREATE_IN_APPS_MENU = "browser.web_app.create_in_apps_menu";


    public static final String WEB_APP_CREATE_IN_QUICK_LAUNCH_BAR = "browser.web_app.create_in_quick_launch_bar";

    // A list of dictionaries for force-installed Web Apps. Each dictionary contains
    // two strings: the URL of the Web App and "tab" or "window" for where the app
    // will be launched.
    public static final String WEB_APP_INSTALL_FORCE_LIST = "profile.web_app.install.forcelist";

    // Dictionary that maps web app ids to installation metrics used by UMA.
    public static final String WEB_APP_INSTALL_METRICS = "web_app_install_metrics";

    // Dictionary that maps web app start URLs to temporary metric info to be
    // emitted once the date changes.
    public static final String WEB_APPS_DAILY_METRICS = "web_apps.daily_metrics";

    // Time representing the date for which |kWebAppsDailyMetrics| is stored.
    public static final String WEB_APPS_DAILY_METRICS_DATE = "web_apps.daily_metrics_date";

    // Dictionary that maps web app URLs to Chrome extension IDs.
    public static final String WEB_APPS_EXTENSION_I_DS = "web_apps.extension_ids";

    // A string representing the last version of Chrome preinstalled web apps were
    // synchronised for.
    public static final String WEB_APPS_LAST_PREINSTALL_SYNCHRONIZE_VERSION = "web_apps.last_preinstall_synchronize_version";

    // Dictionary that maps web app ID to a dictionary of various preferences.
    // Used only in the new web applications system to store app preferences which
    // outlive the app installation and uninstallation.
    public static final String WEB_APPS_PREFERENCES = "web_apps.web_app_ids";


    public static final String WEB_APPS_USER_DISPLAY_MODE_CLEANED_UP = "web_apps.user_display_mode_cleaned_up";

    // A string representing the last version of Chrome that System Web Apps were
    // updated for.
    public static final String SYSTEM_WEB_APP_LAST_UPDATE_VERSION = "web_apps.system_web_app_last_update";

    // A string representing the last locale that System Web Apps were installed in.
    // This is used to refresh System Web Apps i18n when the locale is changed.
    public static final String SYSTEM_WEB_APP_LAST_INSTALLED_LOCALE = "web_apps.system_web_app_last_installed_language";

    // An int representing the number of failures to install SWAs for a given
    // version & locale pair. After 3 failures, we'll abandon this version to avoid
    // bootlooping, and wait for a new version to come along.
    public static final String SYSTEM_WEB_APP_INSTALL_FAILURE_COUNT = "web_apps.system_web_app_failure_count";

    // The default audio capture device used by the Media content setting.
    public static final String DEFAULT_AUDIO_CAPTURE_DEVICE = "media.default_audio_capture_device";

    // The default video capture device used by the Media content setting.
    public static final String DEFAULT_VIDEO_CAPTURE_DEVICE = "media.default_video_capture_Device";

    // The salt used for creating random MediaSource IDs.
    public static final String MEDIA_DEVICE_ID_SALT = "media.device_id_salt";

    // The salt used for creating Storage IDs. The Storage ID is used by encrypted
    // media to bind persistent licenses to the device which is authorized to play
    // the content.
    public static final String MEDIA_STORAGE_ID_SALT = "media.storage_id_salt";

    // The last used printer and its settings.
    public static final String PRINT_PREVIEW_STICKY_SETTINGS = "printing.print_preview_sticky_settings";

    // The list of BackgroundContents that should be loaded when the browser
    // launches.
    public static final String REGISTERED_BACKGROUND_CONTENTS = "background_contents.registered";

    // Integer that specifies the total memory usage, in mb, that chrome will
    // attempt to stay under. Can be specified via policy in addition to the default
    // memory pressure rules applied per platform.
    public static final String TOTAL_MEMORY_LIMIT_MB = "total_memory_limit_mb";

    // String that lists supported HTTP authentication schemes.
    public static final String AUTH_SCHEMES = "auth.schemes";

    // Boolean that specifies whether to disable CNAME lookups when generating
    // Kerberos SPN.
    public static final String DISABLE_AUTH_NEGOTIATE_CNAME_LOOKUP = "auth.disable_negotiate_cname_lookup";

    // Boolean that specifies whether to include the port in a generated Kerberos
    // SPN.
    public static final String ENABLE_AUTH_NEGOTIATE_PORT = "auth.enable_negotiate_port";

    // Allowlist containing servers for which Integrated Authentication is enabled.
    // Note that this used to be `kAuthServerWhitelist`, hence the difference
    // between the variable name and the string value.
    public static final String AUTH_SERVER_ALLOWLIST = "auth.server_whitelist";

    // Allowlist containing servers Chrome is allowed to do Kerberos delegation
    // with. Note that this used to be `kAuthNegotiateDelegateWhitelist`, hence the
    // difference between the variable name and the string value.
    public static final String AUTH_NEGOTIATE_DELEGATE_ALLOWLIST = "auth.negotiate_delegate_whitelist";

    // String that specifies the name of a custom GSSAPI library to load.
    public static final String GSSAPI_LIBRARY_NAME = "auth.gssapi_library_name";

    // String that specifies the Android account type to use for Negotiate
    // authentication.
    public static final String AUTH_ANDROID_NEGOTIATE_ACCOUNT_TYPE = "auth.android_negotiate_account_type";

    // Boolean that specifies whether to allow basic auth prompting on cross-
    // domain sub-content requests.
    public static final String ALLOW_CROSS_ORIGIN_AUTH_PROMPT = "auth.allow_cross_origin_prompt";

    // Boolean that specifies whether cached (server) auth credentials are separated
    // by NetworkIsolationKey.
    public static final String GLOBALLY_SCOPE_HTTP_AUTH_CACHE_ENABLED = "auth.globally_scoped_http_auth_cache_enabled";

    // Integer specifying the cases where ambient authentication is enabled.
    // 0 - Only allow ambient authentication in regular sessions
    // 1 - Only allow ambient authentication in regular and incognito sessions
    // 2 - Only allow ambient authentication in regular and guest sessions
    // 3 - Allow ambient authentication in regular, incognito and guest sessions
    public static final String AMBIENT_AUTHENTICATION_IN_PRIVATE_MODES_ENABLED = "auth.ambient_auth_in_private_modes";

    // Boolean that specifies whether HTTP Basic authentication is allowed for HTTP
    // requests.
    public static final String BASIC_AUTH_OVER_HTTP_ENABLED = "auth.basic_over_http_enabled";

    // Boolean that specifies whether OK-AS-DELEGATE flag from KDC is respected
    // along with kAuthNegotiateDelegateAllowlist.
    public static final String AUTH_NEGOTIATE_DELEGATE_BY_KDC_POLICY = "auth.negotiate_delegate_by_kdc_policy";

    // Boolean that specifies whether NTLMv2 is enabled.
    public static final String NTLM_V2_ENABLED = "auth.ntlm_v2_enabled";

    // Boolean whether Kerberos functionality is enabled.
    public static final String KERBEROS_ENABLED = "kerberos.enabled";

    // Boolean that specifies whether to enable revocation checking (best effort)
    // by default.
    public static final String CERT_REVOCATION_CHECKING_ENABLED = "ssl.rev_checking.enabled";

    // Boolean that specifies whether to require a successful revocation check if
    // a certificate path ends in a locally-trusted (as opposed to publicly
    // trusted) trust anchor.
    public static final String CERT_REVOCATION_CHECKING_REQUIRED_LOCAL_ANCHORS = "ssl.rev_checking.required_for_local_anchors";

    // String specifying the minimum TLS version to negotiate. Supported values
    // are "tls1", "tls1.1", "tls1.2", "tls1.3".
    public static final String SSL_VERSION_MIN = "ssl.version_min";

    // String specifying the maximum TLS version to negotiate. Supported values
    // are "tls1.2", "tls1.3"
    public static final String SSL_VERSION_MAX = "ssl.version_max";

    // String specifying the TLS ciphersuites to disable. Ciphersuites are
    // specified as a comma-separated list of 16-bit hexadecimal values, with
    // the values being the ciphersuites assigned by the IANA registry (e.g.
    // "0x0004,0x0005").
    public static final String CIPHER_SUITE_BLACKLIST = "ssl.cipher_suites.blacklist";

    // List of strings specifying which hosts are allowed to have H2 connections
    // coalesced when client certs are also used. This follows rules similar to
    // the URLBlacklist format for hostnames: a pattern with a leading dot (e.g.
    // ".example.net") matches exactly the hostname following the dot (i.e. only
    // "example.net"), and a pattern with no leading dot (e.g. "example.com")
    // matches that hostname and all subdomains.
    public static final String H2_CLIENT_CERT_COALESCING_HOSTS = "ssl.client_certs.h2_coalescing_hosts";

    // List of single-label hostnames that will skip the check to possibly upgrade
    // from http to https.
    public static final String HSTS_POLICY_BYPASS_LIST = "hsts.policy.upgrade_bypass_list";

    // Boolean that specifies whether the built-in asynchronous DNS client is used.
    public static final String BUILT_IN_DNS_CLIENT_ENABLED = "async_dns.enabled";

    // String specifying the secure DNS mode to use. Any string other than
    // "secure" or "automatic" will be mapped to the default "off" mode.
    public static final String DNS_OVER_HTTPS_MODE = "dns_over_https.mode";

    // String containing a space-separated list of DNS over HTTPS templates to use
    // in secure mode or automatic mode. If no templates are specified in automatic
    // mode, we will attempt discovery of DoH servers associated with the configured
    // insecure resolvers.
    public static final String DNS_OVER_HTTPS_TEMPLATES = "dns_over_https.templates";

    // A pref holding the value of the policy used to explicitly allow or deny
    // access to audio capture devices.  When enabled or not set, the user is
    // prompted for device access.  When disabled, access to audio capture devices
    // is not allowed and no prompt will be shown.
    // See also kAudioCaptureAllowedUrls.
    public static final String AUDIO_CAPTURE_ALLOWED = "hardware.audio_capture_enabled";

    // Holds URL patterns that specify URLs that will be granted access to audio
    // capture devices without prompt.
    public static final String AUDIO_CAPTURE_ALLOWED_URLS = "hardware.audio_capture_allowed_urls";

    // A pref holding the value of the policy used to explicitly allow or deny
    // access to video capture devices.  When enabled or not set, the user is
    // prompted for device access.  When disabled, access to video capture devices
    // is not allowed and no prompt will be shown.
    public static final String VIDEO_CAPTURE_ALLOWED = "hardware.video_capture_enabled";

    // Holds URL patterns that specify URLs that will be granted access to video
    // capture devices without prompt.
    public static final String VIDEO_CAPTURE_ALLOWED_URLS = "hardware.video_capture_allowed_urls";

    // A pref holding the value of the policy used to explicitly allow or deny
    // access to screen capture.  This includes all APIs that allow capturing
    // the desktop, a window or a tab. When disabled, access to screen capture
    // is not allowed and API calls will fail with an error.
    public static final String SCREEN_CAPTURE_ALLOWED = "hardware.screen_capture_enabled";

    // An integer pref that holds enum value of current demo mode configuration.
    // Values are defined by DemoSession::DemoModeConfig enum.
    public static final String DEMO_MODE_CONFIG = "demo_mode.config";

    // A string pref holding the value of the current country for demo sessions.
    public static final String DEMO_MODE_COUNTRY = "demo_mode.country";

    // A string pref holding the value of the default locale for demo sessions.
    public static final String DEMO_MODE_DEFAULT_LOCALE = "demo_mode.default_locale";

    // Dictionary for transient storage of settings that should go into device
    // settings storage before owner has been assigned.
    public static final String DEVICE_SETTINGS_CACHE = "signed_settings_cache";

    // The hardware keyboard layout of the device. This should look like
    // "xkb:us::eng".
    public static final String HARDWARE_KEYBOARD_LAYOUT = "intl.hardware_keyboard";

    // A boolean pref of the auto-enrollment decision. Its value is only valid if
    // it's not the default value; otherwise, no auto-enrollment decision has been
    // made yet.
    public static final String SHOULD_AUTO_ENROLL = "ShouldAutoEnroll";

    // A boolean pref of the private-set-membership decision. Its value is only
    // valid if it's not the default value; otherwise, no private-set-membership
    // decision has been made yet.
    public static final String SHOULD_RETRIEVE_DEVICE_STATE = "ShouldRetrieveDeviceState";

    // An integer pref with the maximum number of bits used by the client in a
    // previous auto-enrollment request. If the client goes through an auto update
    // during OOBE and reboots into a version of the OS with a larger maximum
    // modulus, then it will retry auto-enrollment using the updated value.
    public static final String AUTO_ENROLLMENT_POWER_LIMIT = "AutoEnrollmentPowerLimit";

    // The local state pref that stores device activity times before reporting
    // them to the policy server.
    public static final String DEVICE_ACTIVITY_TIMES = "device_status.activity_times";

    // A pref that stores user app activity times before reporting them to the
    // policy server.
    public static final String APP_ACTIVITY_TIMES = "device_status.app_activity_times";

    // A pref that stores user activity times before reporting them to the policy
    // server.
    public static final String USER_ACTIVITY_TIMES = "consumer_device_status.activity_times";

    // A pref holding the value of the policy used to disable mounting of external
    // storage for the user.
    public static final String EXTERNAL_STORAGE_DISABLED = "hardware.external_storage_disabled";

    // A pref holding the value of the policy used to limit mounting of external
    // storage to read-only mode for the user.
    public static final String EXTERNAL_STORAGE_READ_ONLY = "hardware.external_storage_read_only";

    // Copy of owner swap mouse buttons option to use on login screen.
    public static final String OWNER_PRIMARY_MOUSE_BUTTON_RIGHT = "owner.mouse.primary_right";

    // Copy of owner tap-to-click option to use on login screen.
    public static final String OWNER_TAP_TO_CLICK_ENABLED = "owner.touchpad.enable_tap_to_click";

    // The length of device uptime after which an automatic reboot is scheduled,
    // expressed in seconds.
    public static final String UPTIME_LIMIT = "automatic_reboot.uptime_limit";

    // Whether an automatic reboot should be scheduled when an update has been
    // applied and a reboot is required to complete the update process.
    public static final String REBOOT_AFTER_UPDATE = "automatic_reboot.reboot_after_update";

    // An any-api scoped refresh token for enterprise-enrolled devices.  Allows
    // for connection to Google APIs when the user isn't logged in.  Currently used
    // for for getting a cloudprint scoped token to allow printing in Guest mode,
    // Public Accounts and kiosks.
    public static final String DEVICE_ROBOT_ANY_API_REFRESH_TOKEN = "device_robot_refresh_token.any-api";

    // Device requisition for enterprise enrollment.
    public static final String DEVICE_ENROLLMENT_REQUISITION = "enrollment.device_requisition";

    // Sub organization for enterprise enrollment.
    public static final String DEVICE_ENROLLMENT_SUB_ORGANIZATION = "enrollment.sub_organization";

    // Whether to automatically start the enterprise enrollment step during OOBE.
    public static final String DEVICE_ENROLLMENT_AUTO_START = "enrollment.auto_start";

    // Whether the user may exit enrollment.
    public static final String DEVICE_ENROLLMENT_CAN_EXIT = "enrollment.can_exit";

    // DM token fetched from the DM server during enrollment. Stored for Active
    // Directory devices only.
    public static final String DEVICE_DM_TOKEN = "device_dm_token";

    // How many times HID detection OOBE dialog was shown.
    public static final String TIMES_HID_DIALOG_SHOWN = "HIDDialog.shown_how_many_times";

    // Dictionary of per-user last input method (used at login screen). Note that
    // the pref name is UsersLRUInputMethods for compatibility with previous
    // versions.
    public static final String USERS_LAST_INPUT_METHOD = "UsersLRUInputMethod";

    // A dictionary pref of the echo offer check flag. It sets offer info when
    // an offer is checked.
    public static final String ECHO_CHECKED_OFFERS = "EchoCheckedOffers";

    // Key name of a dictionary in local state to store cached multiprofle user
    // behavior policy value.
    public static final String CACHED_MULTI_PROFILE_USER_BEHAVIOR = "CachedMultiProfileUserBehavior";

    // A string pref with initial locale set in VPD or manifest.
    public static final String INITIAL_LOCALE = "intl.initial_locale";

    // A boolean pref of the OOBE complete flag (first OOBE part before login).
    public static final String OOBE_COMPLETE = "OobeComplete";

    // The name of the screen that has to be shown if OOBE has been interrupted.
    public static final String OOBE_SCREEN_PENDING = "OobeScreenPending";

    // A boolean pref to indicate if the marketing opt-in screen in OOBE is finished
    // for the user.
    public static final String OOBE_MARKETING_OPT_IN_SCREEN_FINISHED = "OobeMarketingOptInScreenFinished";

    // A boolean pref of the device registered flag (second part after first login).
    public static final String DEVICE_REGISTERED = "DeviceRegistered";

    // Boolean pref to signal corrupted enrollment to force the device through
    // enrollment recovery flow upon next boot.
    public static final String ENROLLMENT_RECOVERY_REQUIRED = "EnrollmentRecoveryRequired";

    // Pref name for whether we should show the Getting Started module in the Help
    // app.
    public static final String HELP_APP_SHOULD_SHOW_GET_STARTED = "help_app.should_show_get_started";

    // Pref name for whether we should show the Parental Control module in the Help
    // app.
    public static final String HELP_APP_SHOULD_SHOW_PARENTAL_CONTROL = "help_app.should_show_parental_control";

    // Pref name for whether the device was in tablet mode when going through
    // the OOBE.
    public static final String HELP_APP_TABLET_MODE_DURING_OOBE = "help_app.tablet_mode_during_oobe";

    // List of usernames that used certificates pushed by policy before.
    // This is used to prevent these users from joining multiprofile sessions.
    public static final String USED_POLICY_CERTIFICATES = "policy.used_policy_certificates";

    // A dictionary containing server-provided device state pulled form the cloud
    // after recovery.
    public static final String SERVER_BACKED_DEVICE_STATE = "server_backed_device_state";

    // Customized wallpaper URL, which is already downloaded and scaled.
    // The URL from this preference must never be fetched. It is compared to the
    // URL from customization document to check if wallpaper URL has changed
    // since wallpaper was cached.
    public static final String CUSTOMIZATION_DEFAULT_WALLPAPER_URL = "customization.default_wallpaper_url";

    // System uptime, when last logout started.
    // This is saved to file and cleared after chrome process starts.
    public static final String LOGOUT_STARTED_LAST = "chromeos.logout-started";

    // A boolean preference controlling Android status reporting.
    public static final String REPORT_ARC_STATUS_ENABLED = "arc.status_reporting_enabled";

    // A string preference indicating the name of the OS level task scheduler
    // configuration to use.
    public static final String SCHEDULER_CONFIGURATION = "chromeos.scheduler_configuration";

    // Dictionary indicating current network bandwidth throttling settings.
    // Contains a boolean (is throttling enabled) and two integers (upload rate
    // and download rate in kbits/s to throttle to)
    public static final String NETWORK_THROTTLING_ENABLED = "net.throttling_enabled";

    // Integer pref used by the metrics::DailyEvent owned by
    // chromeos::PowerMetricsReporter.
    public static final String POWER_METRICS_DAILY_SAMPLE = "power.metrics.daily_sample";

    // Integer prefs used to back event counts reported by
    // chromeos::PowerMetricsReporter.
    public static final String POWER_METRICS_IDLE_SCREEN_DIM_COUNT = "power.metrics.idle_screen_dim_count";


    public static final String POWER_METRICS_IDLE_SCREEN_OFF_COUNT = "power.metrics.idle_screen_off_count";


    public static final String POWER_METRICS_IDLE_SUSPEND_COUNT = "power.metrics.idle_suspend_count";


    public static final String POWER_METRICS_LID_CLOSED_SUSPEND_COUNT = "power.metrics.lid_closed_suspend_count";

    // Key for list of users that should be reported.
    public static final String REPORTING_USERS = "reporting_users";

    // Whether to log events for Android app installs.
    public static final String ARC_APP_INSTALL_EVENT_LOGGING_ENABLED = "arc.app_install_event_logging_enabled";

    // Boolean pref indicating if event logging is enabled for policy based
    // extension.
    public static final String EXTENSION_INSTALL_EVENT_LOGGING_ENABLED = "extensions.install.event_logging_enabled";

    // Whether we received the remove users remote command, and hence should proceed
    // with removing the users while at the login screen.
    public static final String REMOVE_USERS_REMOTE_COMMAND = "remove_users_remote_command";

    // Integer pref used by the metrics::DailyEvent owned by
    // chromeos::power::auto_screen_brightness::MetricsReporter.
    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_DAILY_SAMPLE = "auto_screen_brightness.metrics.daily_sample";

    // Integer prefs used to back event counts reported by
    // chromeos::power::auto_screen_brightness::MetricsReporter.
    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_ATLAS_USER_ADJUSTMENT_COUNT = "auto_screen_brightness.metrics.atlas_user_adjustment_count";


    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_EVE_USER_ADJUSTMENT_COUNT = "auto_screen_brightness.metrics.eve_user_adjustment_count";


    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_NOCTURNE_USER_ADJUSTMENT_COUNT = "auto_screen_brightness.metrics.nocturne_user_adjustment_count";


    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_KOHAKU_USER_ADJUSTMENT_COUNT = "auto_screen_brightness.metrics.kohaku_user_adjustment_count";


    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_NO_ALS_USER_ADJUSTMENT_COUNT = "auto_screen_brightness.metrics.no_als_user_adjustment_count";


    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_SUPPORTED_ALS_USER_ADJUSTMENT_COUNT = "auto_screen_brightness.metrics.supported_als_user_adjustment_count";


    public static final String AUTO_SCREEN_BRIGHTNESS_METRICS_UNSUPPORTED_ALS_USER_ADJUSTMENT_COUNT = "auto_screen_brightness.metrics.unsupported_als_user_adjustment_count";

    // Dictionary pref containing the configuration used to verify Parent Access
    // Code. The data is sent through the ParentAccessCodeConfig policy, which is
    // set for child users only, and kept on the known user storage.
    public static final String KNOWN_USER_PARENT_ACCESS_CODE_CONFIG = "child_user.parent_access_code.config";

    // Whether there is a Flash version installed that supports clearing LSO data.
    public static final String CLEAR_PLUGIN_LSO_DATA_ENABLED = "browser.clear_lso_data_enabled";

    // Whether we should show Pepper Flash-specific settings.
    public static final String PEPPER_FLASH_SETTINGS_ENABLED = "browser.pepper_flash_settings_enabled";

    // String which specifies where to store the disk cache.
    public static final String DISK_CACHE_DIR = "browser.disk_cache_dir";

    // Pref name for the policy specifying the maximal cache size.
    public static final String DISK_CACHE_SIZE = "browser.disk_cache_size";

    // Specifies the release channel that the device should be locked to.
    // Possible values: "stable-channel", "beta-channel", "dev-channel", or an
    // empty string, in which case the value will be ignored.
    // TODO(dubroy): This preference may not be necessary once
    // http://crosbug.com/17015 is implemented and the update engine can just
    // fetch the correct value from the policy.
    public static final String CHROME_OS_RELEASE_CHANNEL = "cros.system.releaseChannel";


    public static final String PERFORMANCE_TRACING_ENABLED = "feedback.performance_tracing_enabled";

    // Boolean indicating whether tabstrip uses stacked layout (on touch devices).
    // Defaults to false.
    public static final String TAB_STRIP_STACKED_LAYOUT = "tab-strip-stacked-layout";

    // Indicates that factory reset was requested from options page or reset screen.
    public static final String FACTORY_RESET_REQUESTED = "FactoryResetRequested";

    // Indicates that when a factory reset is requested by setting
    // |kFactoryResetRequested|, the user should only have the option to powerwash
    // and cannot cancel the dialog otherwise.
    public static final String FORCE_FACTORY_RESET = "ForceFactoryReset";

    // Presence of this value indicates that a TPM firmware update has been
    // requested. The value indicates the requested update mode.
    public static final String FACTORY_RESET_TPM_FIRMWARE_UPDATE_MODE = "FactoryResetTPMFirmwareUpdateMode";

    // Indicates that debugging features were requested from oobe screen.
    public static final String DEBUGGING_FEATURES_REQUESTED = "DebuggingFeaturesRequested";

    // Indicates that the user has requested that ARC APK Sideloading be enabled.
    public static final String ENABLE_ADB_SIDELOADING_REQUESTED = "EnableAdbSideloadingRequested";

    // This setting controls initial device timezone that is used before user
    // session started. It is controlled by device owner.
    public static final String SIGNIN_SCREEN_TIMEZONE = "settings.signin_screen_timezone";

    // Deprecated. Superseded by kResolveDeviceTimezoneByGeolocationMethod.
    // TODO(alemate): https://crbug.com/783367 Remove outdated prefs.
    public static final String RESOLVE_DEVICE_TIMEZONE_BY_GEOLOCATION = "settings.resolve_device_timezone_by_geolocation";

    // This setting controls what information is sent to the server to get
    // device location to resolve time zone outside of user session. Values must
    // match TimeZoneResolverManager::TimeZoneResolveMethod enum.
    public static final String RESOLVE_DEVICE_TIMEZONE_BY_GEOLOCATION_METHOD = "settings.resolve_device_timezone_by_geolocation_method";

    // This is policy-controlled preference.
    // It has values defined in policy enum
    // SystemTimezoneAutomaticDetectionProto_AutomaticTimezoneDetectionType;
    public static final String SYSTEM_TIMEZONE_AUTOMATIC_DETECTION_POLICY = "settings.resolve_device_timezone_by_geolocation_policy";

    // Pref name for the policy controlling whether to enable Media Router.
    public static final String ENABLE_MEDIA_ROUTER = "media_router.enable_media_router";

    // Pref name for the policy controlling whether to force the Cast icon to be
    // shown in the toolbar/overflow menu.
    public static final String SHOW_CAST_ICON_IN_TOOLBAR = "media_router.show_cast_icon_in_toolbar";

    // Pref name for the policy controlling the way in which users are notified of
    // the need to relaunch the browser for a pending update.
    public static final String RELAUNCH_NOTIFICATION = "browser.relaunch_notification";

    // Pref name for the policy controlling the time period over which users are
    // notified of the need to relaunch the browser for a pending update. Values
    // are in milliseconds.
    public static final String RELAUNCH_NOTIFICATION_PERIOD = "browser.relaunch_notification_period";

    // Pref name for the policy controlling the time period between the first user
    // notification about need to relaunch and the end of the
    // RelaunchNotificationPeriod. Values are in milliseconds.
    public static final String RELAUNCH_HEADS_UP_PERIOD = "browser.relaunch_heads_up_period";


    public static final String CLOUD_PRINT_ROOT = "cloud_print";


    public static final String CLOUD_PRINT_PROXY_ENABLED = "cloud_print.enabled";

    // The unique id for this instance of the cloud print proxy.
    public static final String CLOUD_PRINT_PROXY_ID = "cloud_print.proxy_id";

    // The GAIA auth token for Cloud Print
    public static final String CLOUD_PRINT_AUTH_TOKEN = "cloud_print.auth_token";

    // The email address of the account used to authenticate with the Cloud Print
    // server.
    public static final String CLOUD_PRINT_EMAIL = "cloud_print.email";

    // Settings specific to underlying print system.
    public static final String CLOUD_PRINT_PRINT_SYSTEM_SETTINGS = "cloud_print.print_system_settings";

    // A boolean indicating whether we should poll for print jobs when don't have
    // an XMPP connection (false by default).
    public static final String CLOUD_PRINT_ENABLE_JOB_POLL = "cloud_print.enable_job_poll";


    public static final String CLOUD_PRINT_ROBOT_REFRESH_TOKEN = "cloud_print.robot_refresh_token";


    public static final String CLOUD_PRINT_ROBOT_EMAIL = "cloud_print.robot_email";

    // A boolean indicating whether we should connect to cloud print new printers.
    public static final String CLOUD_PRINT_CONNECT_NEW_PRINTERS = "cloud_print.user_settings.connectNewPrinters";

    // A boolean indicating whether we should ping XMPP connection.
    public static final String CLOUD_PRINT_XMPP_PING_ENABLED = "cloud_print.xmpp_ping_enabled";

    // An int value indicating the average timeout between xmpp pings.
    public static final String CLOUD_PRINT_XMPP_PING_TIMEOUT = "cloud_print.xmpp_ping_timeout_sec";

    // Dictionary with settings stored by connector setup page.
    public static final String CLOUD_PRINT_USER_SETTINGS = "cloud_print.user_settings";

    // List of printers settings.
    public static final String CLOUD_PRINT_PRINTERS = "cloud_print.user_settings.printers";

    // A boolean indicating whether submitting jobs to Google Cloud Print is
    // blocked by policy.
    public static final String CLOUD_PRINT_SUBMIT_ENABLED = "cloud_print.submit_enabled";

    // A boolean indicating whether Cloud Print deprecation warnings should be
    // suppressed.
    public static final String CLOUD_PRINT_DEPRECATION_WARNINGS_SUPPRESSED = "cloud_print.deprecation_warnings_suppressed";

    // Preference to store proxy settings.
    public static final String MAX_CONNECTIONS_PER_PROXY = "net.max_connections_per_proxy";

    // Set to true if the user removed our login item so we should not create a new
    // one when uninstalling background apps.
    public static final String USER_REMOVED_LOGIN_ITEM = "background_mode.user_removed_login_item";

    // Set to true if Chrome already created a login item, so there's no need to
    // create another one.
    public static final String CHROME_CREATED_LOGIN_ITEM = "background_mode.chrome_created_login_item";

    // Set to true once we've initialized kChromeCreatedLoginItem for the first
    // time.
    public static final String MIGRATED_LOGIN_ITEM_PREF = "background_mode.migrated_login_item_pref";

    // A boolean that tracks whether to show a notification when trying to quit
    // while there are apps running.
    public static final String NOTIFY_WHEN_APPS_KEEP_CHROME_ALIVE = "apps.notify-when-apps-keep-chrome-alive";

    // Set to true if background mode is enabled on this browser.
    public static final String BACKGROUND_MODE_ENABLED = "background_mode.enabled";

    // Set to true if hardware acceleration mode is enabled on this browser.
    public static final String HARDWARE_ACCELERATION_MODE_ENABLED = "hardware_acceleration_mode.enabled";

    // Hardware acceleration mode from previous browser launch.
    public static final String HARDWARE_ACCELERATION_MODE_PREVIOUS = "hardware_acceleration_mode_previous";

    // List of protocol handlers.
    public static final String REGISTERED_PROTOCOL_HANDLERS = "custom_handlers.registered_protocol_handlers";

    // List of protocol handlers the user has requested not to be asked about again.
    public static final String IGNORED_PROTOCOL_HANDLERS = "custom_handlers.ignored_protocol_handlers";

    // List of protocol handlers registered by policy.
    public static final String POLICY_REGISTERED_PROTOCOL_HANDLERS = "custom_handlers.policy.registered_protocol_handlers";

    // List of protocol handlers the policy has requested to be ignored.
    public static final String POLICY_IGNORED_PROTOCOL_HANDLERS = "custom_handlers.policy.ignored_protocol_handlers";

    // Whether user-specified handlers for protocols and content types can be
    // specified.
    public static final String CUSTOM_HANDLERS_ENABLED = "custom_handlers.enabled";

    // Integer that specifies the policy refresh rate for device-policy in
    // milliseconds. Not all values are meaningful, so it is clamped to a sane range
    // by the cloud policy subsystem.
    public static final String DEVICE_POLICY_REFRESH_RATE = "policy.device_refresh_rate";

    // A boolean where true means that the browser has previously attempted to
    // enable autoupdate and failed, so the next out-of-date browser start should
    // not prompt the user to enable autoupdate, it should offer to reinstall Chrome
    // instead.
    public static final String ATTEMPTED_TO_ENABLE_AUTOUPDATE = "browser.attempted_to_enable_autoupdate";

    // The next media gallery ID to assign.
    public static final String MEDIA_GALLERIES_UNIQUE_ID = "media_galleries.gallery_id";

    // A list of dictionaries, where each dictionary represents a known media
    // gallery.
    public static final String MEDIA_GALLERIES_REMEMBERED_GALLERIES = "media_galleries.remembered_galleries";


    public static final String POLICY_PINNED_LAUNCHER_APPS = "policy_pinned_launcher_apps";

    // Keeps names of rolled default pin layouts for shelf in order not to apply
    // this twice. Names are separated by comma.
    public static final String SHELF_DEFAULT_PIN_LAYOUT_ROLLS = "shelf_default_pin_layout_rolls";

    // Same as kShelfDefaultPinLayoutRolls, but for tablet form factor devices.
    public static final String SHELF_DEFAULT_PIN_LAYOUT_ROLLS_FOR_TABLET_FORM_FACTOR = "shelf_default_pin_layout_rolls_for_tablet_form_factor";

    // Counts how many more times the 'profile on a network share' warning should be
    // shown to the user before the next silence period.
    public static final String NETWORK_PROFILE_WARNINGS_LEFT = "network_profile.warnings_left";

    // Tracks the time of the last shown warning. Used to reset
    // |network_profile.warnings_left| after a silence period.
    public static final String NETWORK_PROFILE_LAST_WARNING_TIME = "network_profile.last_warning_time";

    // The last Chrome version at which
    // shell_integration::win::MigrateTaskbarPins() completed.
    public static final String SHORTCUT_MIGRATION_VERSION = "browser.shortcut_migration_version";

    // The RLZ brand code, if enabled.
    public static final String RLZ_BRAND = "rlz.brand";

    // Whether RLZ pings are disabled.
    public static final String RLZ_DISABLED = "rlz.disabled";

    // Keeps local state of app list while sync service is not available.
    public static final String APP_LIST_LOCAL_STATE = "app_list.local_state";

    // An integer that is incremented whenever changes are made to app shortcuts.
    // Increasing this causes all app shortcuts to be recreated.
    public static final String APP_SHORTCUTS_VERSION = "apps.shortcuts_version";

    // A string indicating the architecture in which app shortcuts have been
    // created. If this changes (e.g, due to migrating one's home directory
    // from an Intel mac to an ARM mac), then this will cause all shortcuts to be
    // re-created.
    public static final String APP_SHORTCUTS_ARCH = "apps.shortcuts_arch";

    // A string pref for storing the salt used to compute the pepper device ID.
    public static final String DRM_SALT = "settings.privacy.drm_salt";

    // A boolean pref that enables the (private) pepper GetDeviceID() call and
    // enables the use of remote attestation for content protection.
    public static final String ENABLE_DRM = "settings.privacy.drm_enabled";

    // An integer per-profile pref that signals if the watchdog extension is
    // installed and active. We need to know if the watchdog extension active for
    // ActivityLog initialization before the extension system is initialized.
    public static final String WATCHDOG_EXTENSION_ACTIVE = "profile.extensions.activity_log.num_consumers_active";

    // A list of partner bookmark rename/remove mappings.
    // Each list item is a dictionary containing a "url", a "provider_title" and
    // "mapped_title" entries, detailing the bookmark target URL (if any), the title
    // given by the PartnerBookmarksProvider and either the user-visible renamed
    // title or an empty string if the bookmark node was removed.
    public static final String PARTNER_BOOKMARK_MAPPINGS = "partnerbookmarks.mappings";

    // For instance, if the DNS resolution for 'wpad' takes longer than 1
    // second, auto-detection will give up and fallback to the next proxy
    // configuration (which could be manually configured proxy server
    // rules, or an implicit fallback to DIRECT connections).
    public static final String QUICK_CHECK_ENABLED = "proxy.quick_check_enabled";

    // Whether Guest Mode is enabled within the browser.
    public static final String BROWSER_GUEST_MODE_ENABLED = "profile.browser_guest_enabled";

    // Whether Guest Mode is enforced within the browser.
    public static final String BROWSER_GUEST_MODE_ENFORCED = "profile.browser_guest_enforced";

    // Whether Adding a new Person is enabled within the user manager.
    public static final String BROWSER_ADD_PERSON_ENABLED = "profile.add_person_enabled";

    // Whether profile can be used before sign in.
    public static final String FORCE_BROWSER_SIGNIN = "profile.force_browser_signin";

    // Whether to show the profile picker on startup or not.
    public static final String BROWSER_SHOW_PROFILE_PICKER_ON_STARTUP = "profile.show_picker_on_startup";

    // Boolean which indicates if the user is allowed to sign into Chrome on the
    // next startup.
    public static final String SIGNIN_ALLOWED_ON_NEXT_STARTUP = "signin.allowed_on_next_startup";

    // Device identifier used by CryptAuth stored in local state. This ID is
    // combined with a user ID before being registered with the CryptAuth server,
    // so it can't correlate users on the same device.
    // Note: This constant was previously specific to EasyUnlock, so the string
    //       constant contains "easy_unlock".
    public static final String CRYPT_AUTH_DEVICE_ID = "easy_unlock.device_id";

    // The most recently retrieved Instance ID and Instance ID token for the app ID,
    // "com.google.chrome.cryptauth", used by the CryptAuth client. These prefs are
    // used to track how often (if ever) the Instance ID and Instance ID token
    // rotate because CryptAuth assumes the Instance ID is static.
    public static final String CRYPT_AUTH_INSTANCE_ID = "cryptauth.instance_id";


    public static final String CRYPT_AUTH_INSTANCE_ID_TOKEN = "cryptauth.instance_id_token";

    // A dictionary that maps user id to hardlock state.
    public static final String EASY_UNLOCK_HARDLOCK_STATE = "easy_unlock.hardlock_state";

    // A dictionary that maps user id to public part of RSA key pair used by
    // Easy Sign-in for the user.
    public static final String EASY_UNLOCK_LOCAL_STATE_TPM_KEYS = "easy_unlock.public_tpm_keys";

    // A dictionary in local state containing each user's Easy Unlock profile
    // preferences, so they can be accessed outside of the user's profile. The value
    // is a dictionary containing an entry for each user. Each user's entry mirrors
    // their profile's Easy Unlock preferences.
    public static final String EASY_UNLOCK_LOCAL_STATE_USER_PREFS = "easy_unlock.user_prefs";

    // Boolean that indicates whether elevation is needed to recover Chrome upgrade.
    public static final String RECOVERY_COMPONENT_NEEDS_ELEVATION = "recovery_component.needs_elevation";

    // A dictionary that maps from supervised user whitelist IDs to their properties
    // (name and a list of clients that registered the whitelist).
    public static final String REGISTERED_SUPERVISED_USER_WHITELISTS = "supervised_users.whitelists";

    // Boolean that indicates whether Chrome enterprise extension request is enabled
    // or not.
    public static final String CLOUD_EXTENSION_REQUEST_ENABLED = "enterprise_reporting.extension_request.enabled";

    // A list of extension ids represents pending extension request. The ids are
    // stored once user sent the request until the request is canceled, approved or
    // denied.
    public static final String CLOUD_EXTENSION_REQUEST_IDS = "enterprise_reporting.extension_request.ids";

    // Policy that indicates how to handle animated images.
    public static final String ANIMATION_POLICY = "settings.a11y.animation_policy";

    // A list of URLs (for U2F) or domains (for webauthn) that automatically permit
    // direct attestation of a Security Key.
    public static final String SECURITY_KEY_PERMIT_ATTESTATION = "securitykey.permit_attestation";


    public static final String BACKGROUND_TRACING_LAST_UPLOAD = "background_tracing.last_upload";


    public static final String ALLOW_DINOSAUR_EASTER_EGG = "allow_dinosaur_easter_egg";

    // Whether the update menu item was clicked. Used to facilitate logging whether
    // Chrome was updated after the menu item is clicked.
    public static final String CLICKED_UPDATE_MENU_ITEM = "omaha.clicked_update_menu_item";

    // The latest version of Chrome available when the user clicked on the update
    // menu item.
    public static final String LATEST_VERSION_WHEN_CLICKED_UPDATE_MENU_ITEM = "omaha.latest_version_when_clicked_upate_menu_item";

    // The base64-encoded representation of the public key to use to validate origin
    // trial token signatures.
    public static final String ORIGIN_TRIAL_PUBLIC_KEY = "origin_trials.public_key";

    // A list of origin trial features to disable by policy.
    public static final String ORIGIN_TRIAL_DISABLED_FEATURES = "origin_trials.disabled_features";

    // A list of origin trial tokens to disable by policy.
    public static final String ORIGIN_TRIAL_DISABLED_TOKENS = "origin_trials.disabled_tokens";

    // Policy that indicates the state of updates for the binary components.
    public static final String COMPONENT_UPDATES_ENABLED = "component_updates.component_updates_enabled";

    // Whether the search geolocation disclosure has been dismissed by the user.
    public static final String SEARCH_GEOLOCATION_DISCLOSURE_DISMISSED = "search_geolocation_disclosure.dismissed";

    // How many times the search geolocation disclosure has been shown.
    public static final String SEARCH_GEOLOCATION_DISCLOSURE_SHOWN_COUNT = "search_geolocation_disclosure.shown_count";

    // When the disclosure was shown last.
    public static final String SEARCH_GEOLOCATION_DISCLOSURE_LAST_SHOW_DATE = "search_geolocation_disclosure.last_show_date";

    // Whether the metrics for the state of geolocation pre-disclosure being shown
    // have been recorded.
    public static final String SEARCH_GEOLOCATION_PRE_DISCLOSURE_METRICS_RECORDED = "search_geolocation_pre_disclosure_metrics_recorded";

    // Whether the metrics for the state of geolocation post-disclosure being shown
    // have been recorded.
    public static final String SEARCH_GEOLOCATION_POST_DISCLOSURE_METRICS_RECORDED = "search_geolocation_post_disclosure_metrics_recorded";

    // A dictionary which stores whether location access is enabled for the current
    // default search engine. Deprecated for kDSEPermissionsSetting.
    public static final String DSE_GEOLOCATION_SETTING_DEPRECATED = "dse_geolocation_setting";

    // A dictionary which stores the geolocation and notifications content settings
    // for the default search engine before it became the default search engine so
    // that they can be restored if the DSE is ever changed.
    public static final String DSE_PERMISSIONS_SETTINGS = "dse_permissions_settings";

    // A boolean indicating whether the DSE was previously disabled by enterprise
    // policy.
    public static final String DSE_WAS_DISABLED_BY_POLICY = "dse_was_disabled_by_policy";

    // A dictionary of manifest URLs of Web Share Targets to a dictionary containing
    // attributes of its share_target field found in its manifest. Each key in the
    // dictionary is the name of the attribute, and the value is the corresponding
    // value.
    public static final String WEB_SHARE_VISITED_TARGETS = "profile.web_share.visited_targets";

    // Acts as a cache to remember incompatible applications through restarts. Used
    // for the Incompatible Applications Warning feature.
    public static final String INCOMPATIBLE_APPLICATIONS = "incompatible_applications";

    // Contains the MD5 digest of the current module blacklist cache. Used to detect
    // external tampering.
    public static final String MODULE_BLACKLIST_CACHE_MD5_DIGEST = "module_blacklist_cache_md5_digest";

    // A boolean value, controlling whether third party software is allowed to
    // inject into Chrome's processes.
    public static final String THIRD_PARTY_BLOCKING_ENABLED = "third_party_blocking_enabled";

    // A boolean value, controlling whether Chrome renderer processes have the CIG
    // mitigation enabled.
    public static final String RENDERER_CODE_INTEGRITY_ENABLED = "renderer_code_integrity_enabled";

    // An integer that keeps track of prompt waves for the settings reset
    // prompt. Users will be prompted to reset settings at most once per prompt wave
    // for each setting that the prompt targets (default search, startup URLs and
    // homepage). The value is obtained via a feature parameter. When the stored
    // value is different from the feature parameter, a new prompt wave begins.
    public static final String SETTINGS_RESET_PROMPT_PROMPT_WAVE = "settings_reset_prompt.prompt_wave";

    // Timestamp of the last time the settings reset prompt was shown during the
    // current prompt wave asking the user if they want to restore their search
    // engine.
    public static final String SETTINGS_RESET_PROMPT_LAST_TRIGGERED_FOR_DEFAULT_SEARCH = "settings_reset_prompt.last_triggered_for_default_search";

    // Timestamp of the last time the settings reset prompt was shown during the
    // current prompt wave asking the user if they want to restore their startup
    // settings.
    public static final String SETTINGS_RESET_PROMPT_LAST_TRIGGERED_FOR_STARTUP_URLS = "settings_reset_prompt.last_triggered_for_startup_urls";

    // Timestamp of the last time the settings reset prompt was shown during the
    // current prompt wave asking the user if they want to restore their homepage.
    public static final String SETTINGS_RESET_PROMPT_LAST_TRIGGERED_FOR_HOMEPAGE = "settings_reset_prompt.last_triggered_for_homepage";

    // Timestamp of the clipboard's last modified time, stored in base::Time's
    // internal format (int64) in local store.  (I.e., this is not a per-profile
    // pref.)
    public static final String CLIPBOARD_LAST_MODIFIED_TIME = "ui.clipboard.last_modified_time";

    // The boolean flags indicating whether the specific activity was observed
    // in Chrome during the day that started at |kOfflineUsageTrackingDay|. These
    // are used to track usage of Chrome is used while offline and how various
    // offline features affect that.
    public static final String OFFLINE_USAGE_START_OBSERVED = "offline_pages.start_observed";


    public static final String OFFLINE_USAGE_ONLINE_OBSERVED = "offline_pages.online_observed";


    public static final String OFFLINE_USAGE_OFFLINE_OBSERVED = "offline_pages.offline_observed";

    // Boolean flags indicating state of a prefetch subsystem during a day.
    public static final String PREFETCH_USAGE_ENABLED_OBSERVED = "offline_pages.prefetch_enabled_observed";


    public static final String PREFETCH_USAGE_FETCH_OBSERVED = "offline_pages.prefetch_fetch_observed";


    public static final String PREFETCH_USAGE_OPEN_OBSERVED = "offline_pages.prefetch_open_observed";

    // A time corresponding to a midnight that starts the day for which
    // OfflineMetricsCollector tracks the Chrome usage. Once current time passes
    // 24hrs from this point, the further tracking is attributed to the next day.
    public static final String OFFLINE_USAGE_TRACKING_DAY = "offline_pages.tracking_day";

    // Accumulated counters of days with specified Chrome usage. When there is
    // likely a network connection, these counters are reported via UMA and reset.
    public static final String OFFLINE_USAGE_UNUSED_COUNT = "offline_pages.unused_count";


    public static final String OFFLINE_USAGE_STARTED_COUNT = "offline_pages.started_count";


    public static final String OFFLINE_USAGE_OFFLINE_COUNT = "offline_pages.offline_count";


    public static final String OFFLINE_USAGE_ONLINE_COUNT = "offline_pages.online_count";


    public static final String OFFLINE_USAGE_MIXED_COUNT = "offline_pages.mixed_count";

    // Accumulated counters of days with specified Prefetch usage. When there is
    // likely a network connection, these counters are reported via UMA and reset.
    public static final String PREFETCH_USAGE_ENABLED_COUNT = "offline_pages.prefetch_enabled_count";


    public static final String PREFETCH_USAGE_FETCHED_COUNT = "offline_pages.prefetch_fetched_count";


    public static final String PREFETCH_USAGE_OPENED_COUNT = "offline_pages.prefetch_opened_count";


    public static final String PREFETCH_USAGE_MIXED_COUNT = "offline_pages.prefetch_mixed_count";

    // Stores the Media Engagement Index schema version. If the stored value
    // is lower than the value in MediaEngagementService then the MEI data
    // will be wiped.
    public static final String MEDIA_ENGAGEMENT_SCHEMA_VERSION = "media.engagement.schema_version";

    // Maximum number of tabs that has been opened since the last time it has been
    // reported.
    public static final String TAB_STATS_TOTAL_TAB_COUNT_MAX = "tab_stats.total_tab_count_max";

    // Maximum number of tabs that has been opened in a single window since the last
    // time it has been reported.
    public static final String TAB_STATS_MAX_TABS_PER_WINDOW = "tab_stats.max_tabs_per_window";

    // Maximum number of windows that has been opened since the last time it has
    // been reported.
    public static final String TAB_STATS_WINDOW_COUNT_MAX = "tab_stats.window_count_max";

    //  Timestamp of the last time the tab stats daily metrics have been reported.
    public static final String TAB_STATS_DAILY_SAMPLE = "tab_stats.last_daily_sample";

    // A list of origins (URLs) to treat as "secure origins" for debugging purposes.
    public static final String UNSAFELY_TREAT_INSECURE_ORIGIN_AS_SECURE = "unsafely_treat_insecure_origin_as_secure";

    // A list of origins (URLs) that specifies opting into --isolate-origins=...
    // (selective Site Isolation).
    public static final String ISOLATE_ORIGINS = "site_isolation.isolate_origins";

    // Boolean that specifies opting into --site-per-process (full Site Isolation).
    public static final String SITE_PER_PROCESS = "site_isolation.site_per_process";

    // Boolean that specifies whether media (audio/video) autoplay is allowed.
    public static final String AUTOPLAY_ALLOWED = "media.autoplay_allowed";

    // Holds URL patterns that specify URLs that will be allowed to autoplay.
    public static final String AUTOPLAY_WHITELIST = "media.autoplay_whitelist";

    // Boolean that specifies whether autoplay blocking is enabled.
    public static final String BLOCK_AUTOPLAY_ENABLED = "media.block_autoplay";

    // Boolean that indicates if native notifications are allowed to be used in
    // place of Chrome notifications.
    public static final String ALLOW_NATIVE_NOTIFICATIONS = "native_notifications.allowed";

    // Integer that holds the value of the next persistent notification ID to be
    // used.
    public static final String NOTIFICATION_NEXT_PERSISTENT_ID = "persistent_notifications.next_id";

    // Time that holds the value of the next notification trigger timestamp.
    public static final String NOTIFICATION_NEXT_TRIGGER_TIME = "persistent_notifications.next_trigger";

    // Preference for controlling whether tab freezing is enabled.
    public static final String TAB_FREEZING_ENABLED = "tab_freezing_enabled";

    // Boolean that enables the Enterprise Hardware Platform Extension API for
    // extensions installed by enterprise policy.
    public static final String ENTERPRISE_HARDWARE_PLATFORM_API_ENABLED = "enterprise_hardware_platform_api.enabled";

    // Boolean that specifies whether Signed HTTP Exchange (SXG) loading is enabled.
    public static final String SIGNED_HTTP_EXCHANGE_ENABLED = "web_package.signed_exchange.enabled";

    // Boolean that allows a page to perform synchronous XHR requests during page
    // dismissal.
    // TODO(https://crbug.com/1003101): Remove this in Chrome 88.
    public static final String ALLOW_SYNC_XHR_IN_PAGE_DISMISSAL = "allow_sync_xhr_in_page_dismissal";

    // Enum that specifies client certificate management permissions for user. It
    // can have one of the following values.
    // 0: Users can manage all certificates.
    // 1: Users can manage user certificates, but not device certificates.
    // 2: Disallow users from managing certificates
    // Controlled by ClientCertificateManagementAllowed policy.
    public static final String CLIENT_CERTIFICATE_MANAGEMENT_ALLOWED = "client_certificate_management_allowed";

    // Enum that specifies CA certificate management permissions for user. It
    // can have one of the following values.
    // 0: Users can manage all certificates.
    // 1: Users can manage user certificates, but not built-in certificates.
    // 2: Disallow users from managing certificates
    // Controlled by CACertificateManagementAllowed policy.
    public static final String CA_CERTIFICATE_MANAGEMENT_ALLOWED = "ca_certificate_management_allowed";

    // Boolean that specifies whether the built-in certificate verifier should be
    // used. If false, Chrome will use the platform certificate verifier. If not
    // set, Chrome will choose the certificate verifier based on experiments.
    public static final String BUILTIN_CERTIFICATE_VERIFIER_ENABLED = "builtin_certificate_verifier_enabled";


    public static final String SHARING_VAPID_KEY = "sharing.vapid_key";


    public static final String SHARING_FCM_REGISTRATION = "sharing.fcm_registration";


    public static final String SHARING_LOCAL_SHARING_INFO = "sharing.local_sharing_info";

    // Dictionary that contains all of the Hats Survey Metadata.
    public static final String HATS_SURVEY_METADATA = "hats.survey_metadata";


    public static final String EXTERNAL_PROTOCOL_DIALOG_SHOW_ALWAYS_OPEN_CHECKBOX = "external_protocol_dialog.show_always_open_checkbox";

    // List of dictionaries. For each dictionary, key "protocol" is a protocol
    // (as a string) that is permitted by policy to launch an external application
    // without prompting the user. Key "allowed_origins" is a nested list of origin
    // patterns that defines the scope of applicability of that protocol. If the
    // "allow" list is empty, that protocol rule will never apply.
    public static final String AUTO_LAUNCH_PROTOCOLS_FROM_ORIGINS = "protocol_handler.policy.auto_launch_protocols_from_origins";

    // This pref enables the ScrollToTextFragment feature.
    public static final String SCROLL_TO_TEXT_FRAGMENT_ENABLED = "scroll_to_text_fragment_enabled";

    // Last time the known interception disclosure message was dismissed. Used to
    // ensure a cooldown period passes before the disclosure message is displayed
    // again.
    public static final String KNOWN_INTERCEPTION_DISCLOSURE_INFOBAR_LAST_SHOWN = "known_interception_disclosure_infobar_last_shown";


    public static final String REQUIRED_CLIENT_CERTIFICATE_FOR_USER = "required_client_certificate_for_user";


    public static final String REQUIRED_CLIENT_CERTIFICATE_FOR_DEVICE = "required_client_certificate_for_device";


    public static final String CERTIFICATE_PROVISIONING_STATE_FOR_USER = "cert_provisioning_user_state";


    public static final String CERTIFICATE_PROVISIONING_STATE_FOR_DEVICE = "cert_provisioning_device_state";

    // This pref enables periodically fetching new Media Feed items for top feeds.
    public static final String MEDIA_FEEDS_BACKGROUND_FETCHING = "media_feeds_background_fetching_enabled";

    // This pref enables checking of Media Feed items against the Safe Search API.
    public static final String MEDIA_FEEDS_SAFE_SEARCH_ENABLED = "media_feeds_safe_search_enabled";

    // This pref reenables AppCache temporarily during its deprecation process.
    // In particular, this sets the AppcacheRequireOriginTrial feature to false.
    // TODO(enne): Remove this once AppCache has been removed.
    public static final String APP_CACHE_FORCE_ENABLED = "app_cache_force_enabled";

    // Boolean pref indicating whether the notification informing the user that
    // adb sideloading had been disabled by their admin was shown.
    public static final String ADB_SIDELOADING_DISALLOWED_NOTIFICATION_SHOWN = "adb_sideloading_disallowed_notification_shown";

    // Int64 pref indicating the time in microseconds since Windows epoch
    // (1601-01-01 00:00:00 UTC) when the notification informing the user about a
    // change in adb sideloading policy that will clear all user data was shown.
    // If the notification was not yet shown the pref holds the value Time::Min().
    public static final String ADB_SIDELOADING_POWERWASH_PLANNED_NOTIFICATION_SHOWN_TIME = "adb_sideloading_powerwash_planned_notification_shown_time";

    // Boolean pref indicating whether the notification informing the user about a
    // change in adb sideloading policy that will clear all user data was shown.
    public static final String ADB_SIDELOADING_POWERWASH_ON_NEXT_REBOOT_NOTIFICATION_SHOWN = "adb_sideloading_powerwash_on_next_reboot_notification_shown";

    // Boolean pref that indicates whether caret browsing is currently enabled.
    public static final String CARET_BROWSING_ENABLED = "settings.a11y.caretbrowsing.enabled";

    // Boolean pref for whether the user is shown a dialog to confirm that caret
    // browsing should be enabled/disabled when the keyboard shortcut is pressed.
    // If set to false, no intervening dialog is displayed and caret browsing mode
    // is toggled silently by the keyboard shortcut.
    public static final String SHOW_CARET_BROWSING_DIALOG = "settings.a11y.caretbrowsing.show_dialog";

    // Boolean pref indicating whether the Lacros browser is allowed. This is set by
    // a policy, and the default value for managed users is false. Admins willing to
    // give rights to use Lacros can set the policy to true.
    public static final String LACROS_ALLOWED = "lacros_allowed";

    // String enum pref determining what should happen when a user who authenticates
    // via a security token is removing this token. "IGNORE" - nothing happens
    // (default). "LOGOUT" - The user is logged out. "LOCK" - The session is locked.
    public static final String SECURITY_TOKEN_SESSION_BEHAVIOR = "security_token_session_behavior";

    // When the above pref is set to "LOGOUT" or "LOCK", this integer pref
    // determines the duration of a notification that appears when the smart card is
    // removed. The action will only happen after the notification timed out. If
    // this pref is set to 0, the action happens immediately.
    public static final String SECURITY_TOKEN_SESSION_NOTIFICATION_SECONDS = "security_token_session_notification_seconds";

    // Integer that is set to the last choice user made when prompted for saving a
    // credit card. The prompt is for user's consent in saving the card in the
    // server for signed in users and saving the card locally for non signed-in
    // users.
    public static final String AUTOFILL_ACCEPT_SAVE_CREDIT_CARD_PROMPT_STATE = "autofill.accept_save_credit_card_prompt_state";

    // Boolean that is true if Autofill is enabled and allowed to save credit card
    // data.
    public static final String AUTOFILL_CREDIT_CARD_ENABLED = "autofill.credit_card_enabled";

    // Boolean that is true if FIDO Authentication is enabled for card unmasking.
    public static final String AUTOFILL_CREDIT_CARD_FIDO_AUTH_ENABLED = "autofill.credit_card_fido_auth_enabled";

    // Boolean that is true if FIDO Authentication is enabled for card unmasking.
    public static final String AUTOFILL_CREDIT_CARD_FIDO_AUTH_OFFER_CHECKBOX_STATE = "autofill.credit_card_fido_auth_offer_checkbox_state";

    // Number of times the credit card signin promo has been shown.
    public static final String AUTOFILL_CREDIT_CARD_SIGNIN_PROMO_IMPRESSION_COUNT = "autofill.credit_card_signin_promo_impression_count";

    // Boolean that is true if Autofill is enabled and allowed to save data.
    public static final String AUTOFILL_ENABLED_DEPRECATED = "autofill.enabled";

    // Deprecated 10/2019.
    public static final String AUTOFILL_JAPAN_CITY_FIELD_MIGRATED_DEPRECATED = "autofill.japan_city_field_migrated_to_street_address";

    // Integer that is set to the last version where the profile deduping routine
    // was run. This routine will be run once per version.
    public static final String AUTOFILL_LAST_VERSION_DEDUPED = "autofill.last_version_deduped";

    // Integer that is set to the last version where the profile validation routine
    // was run. We validate profiles at least once per version to keep track of the
    // changes in the validation logic.
    public static final String AUTOFILL_LAST_VERSION_VALIDATED = "autofill.last_version_validated";

    // Integer that is set to the last version where disused addresses were
    // deleted. This deletion will be run once per version.
    public static final String AUTOFILL_LAST_VERSION_DISUSED_ADDRESSES_DELETED = "autofill.last_version_disused_addresses_deleted";

    // Integer that is set to the last version where disused credit cards were
    // deleted. This deletion will be run once per version.
    public static final String AUTOFILL_LAST_VERSION_DISUSED_CREDIT_CARDS_DELETED = "autofill.last_version_disused_credit_cards_deleted";

    // Boolean that is true if the orphan rows in the autofill table were removed.
    public static final String AUTOFILL_ORPHAN_ROWS_REMOVED = "autofill.orphan_rows_removed";

    // Boolean that is true if Autofill is enabled and allowed to save profile data.
    public static final String AUTOFILL_PROFILE_ENABLED = "autofill.profile_enabled";

    // The field type, validity state map of all profiles.
    // TODO(crbug.com/910596): Pref name is "autofill_" instead of "autofill."
    // because of a mismatch when the priorify prefs were generated. Consider
    // migrating this back to "autofill." in the future.
    public static final String AUTOFILL_PROFILE_VALIDITY = "autofill_profile_validity";

    // This pref stores the file path where the autofill states data is
    // downloaded to.
    public static final String AUTOFILL_STATES_DATA_DIR = "autofill.states_data_dir";

    // The opt-ins for Sync Transport features for each client.
    public static final String AUTOFILL_SYNC_TRANSPORT_OPT_IN = "autofill.sync_transport_opt_ins";

    // The (randomly inititialied) seed value to use when encoding form/field
    // metadata for randomized uploads. The value of this pref is a string.
    public static final String AUTOFILL_UPLOAD_ENCODING_SEED = "autofill.upload_encoding_seed";

    // Dictionary pref used to track which form signature uploads have been
    // performed. Each entry in the dictionary maps a form signature (reduced
    // via a 10-bit modulus) to a integer bit-field where each bit denotes whether
    // or not a given upload event has occurred.
    public static final String AUTOFILL_UPLOAD_EVENTS = "autofill.upload_events";

    // The timestamp (seconds since the Epoch UTC) for when the the upload event
    // pref was last reset.
    public static final String AUTOFILL_UPLOAD_EVENTS_LAST_RESET_TIMESTAMP = "autofill.upload_events_last_reset_timestamp";

    // Boolean that's true when Wallet card and address import is enabled by the
    // user.
    public static final String AUTOFILL_WALLET_IMPORT_ENABLED = "autofill.wallet_import_enabled";

    // Boolean that is set to the last choice user made when prompted for saving an
    // unmasked server card locally.
    public static final String AUTOFILL_WALLET_IMPORT_STORAGE_CHECKBOX_STATE = "autofill.wallet_import_storage_checkbox_state";

    // Integer that is set to the last major version where the Autocomplete
    // retention policy was run.
    public static final String AUTOCOMPLETE_LAST_VERSION_RETENTION_POLICY = "autocomplete.retention_policy_last_version";

    // Path to the integer corresponding to user's preference theme.
    public static final String FONT = "dom_distiller.font_family";

    // Path to the integer corresponding to user's preference font family.
    public static final String THEME = "dom_distiller.theme";

    // Path to the float corresponding to user's preference font scaling.
    public static final String FONT_SCALE = "dom_distiller.font_scale";

    // Path to the boolean whether Reader Mode for Accessibility option is enabled.
    public static final String READER_FOR_ACCESSIBILITY = "dom_distiller.reader_for_accessibility";

    // A boolean pref set to true if the option to use reader mode should be visible
    // on articles, when available.
    public static final String OFFER_READER_MODE = "dom_distiller.offer_reader_mode";

    // A boolean pref set to true if we're using Link Doctor error pages.
    public static final String ALTERNATE_ERROR_PAGES_ENABLED = "alternate_error_pages.enabled";


    public static final String BACKGROUND_REFRESH_PERIOD = "feed.background_refresh_period";


    public static final String LAST_FETCH_ATTEMPT_TIME = "feed.last_fetch_attempt";


    public static final String THROTTLER_REQUEST_COUNT = "feed.refresh_throttler.count";


    public static final String THROTTLER_REQUESTS_DAY = "feed.refresh_throttler.day";


    public static final String USER_CLASSIFIER_AVERAGE_SUGGESTIONS_VIWED_PER_HOUR = "feed.user_classifier.average_suggestions_veiwed_per_hour";


    public static final String USER_CLASSIFIER_AVERAGE_SUGGESTIONS_USED_PER_HOUR = "feed.user_classifier.average_suggestions_used_per_hour";


    public static final String USER_CLASSIFIER_LAST_TIME_TO_VIEW_SUGGESTIONS = "feed.user_classifier.last_time_to_view_suggestions";


    public static final String USER_CLASSIFIER_LAST_TIME_TO_USE_SUGGESTIONS = "feed.user_classifier.last_time_to_use_suggestions";


    public static final String HOST_OVERRIDE_HOST = "feed.host_override.host";


    public static final String HOST_OVERRIDE_BLESS_NONCE = "feed.host_override.bless_nonce";


    public static final String HAS_REACHED_CLICK_AND_VIEW_ACTIONS_UPLOAD_CONDITIONS = "feed.clicks_and_views_upload_conditions_reached";


    public static final String LAST_FETCH_HAD_NOTICE_CARD = "feed.last_fetch_had_notice_card";


    public static final String LAST_REFRESH_WAS_SIGNED_IN = "feed.last_refresh_was_signed_in";


    public static final String NOTICE_CARD_VIEWS_COUNT = "feed.notice_card_views_count";


    public static final String NOTICE_CARD_CLICKS_COUNT = "feed.notice_card_clicks_count";


    public static final String THROTTLER_REQUEST_COUNT_LIST_PREF_NAME = "feedv2.request_throttler.request_counts";


    public static final String THROTTLER_LAST_REQUEST_TIME = "feedv2.request_throttler.last_request_time";


    public static final String DEBUG_STREAM_DATA = "feedv2.debug_stream_data";


    public static final String REQUEST_SCHEDULE = "feedv2.request_schedule";


    public static final String METRICS_DATA = "feedv2.metrics_data";


    public static final String CLIENT_INSTANCE_ID = "feedv2.client_instance_id";


    public static final String ACTIONS_ENDPOINT_OVERRIDE = "feedv2.actions_endpoint_override";


    public static final String ENABLE_SNIPPETS = "ntp_snippets.enable";

    // A boolean pref set to true if Feed articles are visible.
    // FEED_ARTICLES_LIST_VISIBLE in ChromePreferenceKeys.java is a pre-native cache
    // and should be consistent with this pref.
    public static final String ARTICLES_LIST_VISIBLE = "ntp_snippets.list_visible";

    // Prefs only accessed in this file
    public static final String LIMITLESS_PREFETCHING_ENABLED_TIME_PREF = "offline_prefetch.limitless_prefetching_enabled_time";


    public static final String PREFETCH_TESTING_HEADER_PREF = "offline_prefetch.testing_header_value";


    public static final String ENABLED_BY_SERVER = "offline_prefetch.enabled_by_server";


    public static final String NEXT_FORBIDDEN_CHECK_TIME_PREF = "offline_prefetch.next_gpb_check";


    public static final String PREFETCH_CACHED_GCM_TOKEN = "offline_prefetch.gcm_token";


    public static final String USER_SETTING_ENABLED = "offline_prefetch.enabled";


    public static final String BACKOFF = "offline_prefetch.backoff";


    public static final String CREDENTIALS_ENABLE_AUTOSIGNIN = "credentials_enable_autosignin";


    public static final String CREDENTIALS_ENABLE_SERVICE = "credentials_enable_service";


    public static final String OS_PASSWORD_BLANK = "password_manager.os_password_blank";


    public static final String OS_PASSWORD_LAST_CHANGED = "password_manager.os_password_last_changed";


    public static final String KEYCHAIN_MIGRATION_STATUS = "password_manager.keychain_migration";


    public static final String PASSWORD_RECOVERY = "password_manager.password_recovery";


    public static final String WAS_AUTO_SIGN_IN_FIRST_RUN_EXPERIENCE_SHOWN = "profile.was_auto_sign_in_first_run_experience_shown";


    public static final String WAS_SIGN_IN_PASSWORD_PROMO_CLICKED = "profile.was_sign_in_password_promo_clicked";


    public static final String NUMBER_SIGN_IN_PASSWORD_PROMO_SHOWN = "profile.number_sign_in_password_promo_shown";


    public static final String SIGN_IN_PASSWORD_PROMO_REVIVE = "profile.sign_in_password_promo_revive";


    public static final String ACCOUNT_STORAGE_PER_ACCOUNT_SETTINGS = "profile.password_account_storage_settings";


    public static final String ACCOUNT_STORAGE_EXISTS = "profile.password_account_storage_exists";


    public static final String SYNC_PASSWORD_HASH = "profile.sync_password_hash";


    public static final String SYNC_PASSWORD_LENGTH_AND_HASH_SALT = "profile.sync_password_length_and_hash_salt";


    public static final String LAST_TIME_OBSOLETE_HTTP_CREDENTIALS_REMOVED = "profile.last_time_obsolete_http_credentials_removed";


    public static final String LAST_TIME_PASSWORD_CHECK_COMPLETED = "profile.last_time_password_check_completed";


    public static final String PASSWORD_HASH_DATA_LIST = "profile.password_hash_data_list";


    public static final String PASSWORD_LEAK_DETECTION_ENABLED = "profile.password_manager_leak_detection";


    public static final String PROFILE_STORE_DATE_LAST_USED_FOR_FILLING = "password_manager.profile_store_date_last_used_for_filling";


    public static final String ACCOUNT_STORE_DATE_LAST_USED_FOR_FILLING = "password_manager.account_store_date_last_used_for_filling";


    public static final String PAYMENTS_FIRST_TRANSACTION_COMPLETED = "payments.first_transaction_completed";


    public static final String CAN_MAKE_PAYMENT_ENABLED = "payments.can_make_payment_enabled";


    public static final String SAFE_BROWSING_ENABLED = "safebrowsing.enabled";


    public static final String SAFE_BROWSING_ENHANCED = "safebrowsing.enhanced";


    public static final String SAFE_BROWSING_ENTERPRISE_REAL_TIME_URL_CHECK_MODE = "safebrowsing.enterprise_real_time_url_check_mode";


    public static final String SAFE_BROWSING_EXTENDED_REPORTING_OPT_IN_ALLOWED = "safebrowsing.extended_reporting_opt_in_allowed";


    public static final String SAFE_BROWSING_INCIDENTS_SENT = "safebrowsing.incidents_sent";


    public static final String SAFE_BROWSING_PROCEED_ANYWAY_DISABLED = "safebrowsing.proceed_anyway_disabled";


    public static final String SAFE_BROWSING_SAW_INTERSTITIAL_SCOUT_REPORTING = "safebrowsing.saw_interstitial_sber2";


    public static final String SAFE_BROWSING_SCOUT_REPORTING_ENABLED = "safebrowsing.scout_reporting_enabled";


    public static final String SAFE_BROWSING_TRIGGER_EVENT_TIMESTAMPS = "safebrowsing.trigger_event_timestamps";


    public static final String SAFE_BROWSING_UNHANDLED_GAIA_PASSWORD_REUSES = "safebrowsing.unhandled_sync_password_reuses";


    public static final String SAFE_BROWSING_NEXT_PASSWORD_CAPTURE_EVENT_LOG_TIME = "safebrowsing.next_password_capture_event_log_time";


    public static final String SAFE_BROWSING_WHITELIST_DOMAINS = "safebrowsing.safe_browsing_whitelist_domains";


    public static final String PASSWORD_PROTECTION_CHANGE_PASSWORD_URL = "safebrowsing.password_protection_change_password_url";


    public static final String PASSWORD_PROTECTION_LOGIN_UR_LS = "safebrowsing.password_protection_login_urls";


    public static final String PASSWORD_PROTECTION_WARNING_TRIGGER = "safebrowsing.password_protection_warning_trigger";


    public static final String ADVANCED_PROTECTION_LAST_REFRESH_IN_US = "safebrowsing.advanced_protection_last_refresh";


    public static final String ADVANCED_PROTECTION_ALLOWED = "safebrowsing.advanced_protection_allowed";


    public static final String SAFE_BROWSING_METRICS_LAST_LOG_TIME = "safebrowsing.metrics_last_log_time";

    // A boolean pref - should unauthenticated user should be logged out
    // automatically. Default value is false.
    public static final String FORCE_LOGOUT_UNAUTHENTICATED_USER_ENABLED = "profile.force_logout_unauthenticated_user_enabled";

    // An integer property indicating the state of account id migration from
    // email to gaia id for the the profile.  See account_tracker_service.h
    // for possible values.
    public static final String ACCOUNT_ID_MIGRATION_STATE = "account_id_migration_state";

    // Name of the preference property that persists the account information
    // tracked by this signin.
    public static final String ACCOUNT_INFO = "account_info";

    // Boolean identifying whether reverse auto-login is enabled.
    public static final String AUTOLOGIN_ENABLED = "autologin.enabled";

    // A hash of the GAIA accounts present in the content area. Order does not
    // affect the hash, but signed in/out status will. Stored as the Base64 string.
    public static final String GAIA_COOKIE_HASH = "gaia_cookie.hash";

    // The last time that kGaiaCookieHash was last updated. Stored as a double that
    // should be converted into base::Time.
    public static final String GAIA_COOKIE_CHANGED_TIME = "gaia_cookie.changed_time";

    // The last time that periodic reporting occured, to allow us to report as close
    // to once per intended interval as possible, through restarts. Stored as a
    // double that should be converted into base::Time.
    public static final String GAIA_COOKIE_PERIODIC_REPORT_TIME = "gaia_cookie.periodic_report_time";

    // Typically contains an obfuscated gaiaid. Some platforms may have
    // an email stored in this preference instead. This is transitional and will
    // eventually be fixed.
    public static final String GOOGLE_SERVICES_ACCOUNT_ID = "google.services.account_id";

    // Boolean indicating if the user gave consent for Sync.
    public static final String GOOGLE_SERVICES_CONSENTED_TO_SYNC = "google.services.consented_to_sync";

    // The profile's hosted domain; empty if unset; kNoHostedDomainFound if there
    // is none.
    public static final String GOOGLE_SERVICES_HOSTED_DOMAIN = "google.services.hosted_domain";

    // Similar to kGoogleServicesLastUsername, this is the corresponding version of
    // kGoogleServicesAccountId that is not cleared on signout.
    public static final String GOOGLE_SERVICES_LAST_ACCOUNT_ID = "google.services.last_account_id";

    // String the identifies the last user that logged into sync and other
    // google services. This value is not cleared on signout.
    // This pref remains in order to pre-fill the sign in page when reconnecting a
    // profile, but programmatic checks to see if a given account is the same as the
    // last account should use kGoogleServicesLastAccountId instead.
    public static final String GOOGLE_SERVICES_LAST_USERNAME = "google.services.last_username";

    // Device id scoped to single signin. This device id will be regenerated if user
    // signs out and signs back in. When refresh token is requested for this user it
    // will be annotated with this device id.
    public static final String GOOGLE_SERVICES_SIGNIN_SCOPED_DEVICE_ID = "google.services.signin_scoped_device_id";

    // Local state pref containing a string regex that restricts which accounts
    // can be used to log in to chrome (e.g. "*@google.com"). If missing or blank,
    // all accounts are allowed (no restrictions).
    public static final String GOOGLE_SERVICES_USERNAME_PATTERN = "google.services.username_pattern";

    // List to keep track of emails for which the user has rejected one-click
    // sign-in.
    public static final String REVERSE_AUTOLOGIN_REJECTED_EMAIL_LIST = "reverse_autologin.rejected_email_list";

    // Boolean indicating if this profile was signed in with information from a
    // credential provider.
    public static final String SIGNED_IN_WITH_CREDENTIAL_PROVIDER = "signin.with_credential_provider";

    // Boolean which stores if the user is allowed to signin to chrome.
    public static final String SIGNIN_ALLOWED = "signin.allowed";

    // True if the token service has been prepared for Dice migration.
    public static final String TOKEN_SERVICE_DICE_COMPATIBLE = "token_service.dice_compatible";

    // Boolean which stores if the ProfileOAuth2TokenService should ignore secondary
    // accounts.
    public static final String TOKEN_SERVICE_EXCLUDE_ALL_SECONDARY_ACCOUNTS = "token_service.exclude_all_secondary_accounts";

    // List that identifies the account id that should be ignored by the token
    // service.
    public static final String TOKEN_SERVICE_EXCLUDED_SECONDARY_ACCOUNTS = "token_service.excluded_secondary_accounts";

    // Contains last |ListAccounts| data which corresponds to Gaia cookies.
    public static final String GAIA_COOKIE_LAST_LIST_ACCOUNTS_DATA = "gaia_cookie.last_list_accounts_data";

    // Boolean that is true when offering translate (i.e. the automatic translate
    // bubble) is enabled. Even when this is false, the user can force translate
    // from the right-click context menu unless translate is disabled by policy.
    public static final String OFFER_TRANSLATE_ENABLED = "translate.enabled";

    // Prevents instantiation.
    private Pref() {}
}
