#!/bin/bash

set -e

PRO_DIR="/f/chromiumcopy"
BASE_DIR="/f/chromium/src"
RELEASE_DIR="${BASE_DIR}/out/90"
APP_DIR="${PRO_DIR}/app"
LIB_DIR="${BASE_DIR}/out/90/lib.java"
MODULES_DIR="${PRO_DIR}"

sync_chrome() {
  mkdir -p ${APP_DIR}/{src/main/java,libs}
	local src_dir="${APP_DIR}/src/main/java"
  mkdir -p ${APP_DIR}/src/main
  mkdir -p ${APP_DIR}/src/main/res_gen
	local res_dir="${APP_DIR}/src/main"
  cp -r ${BASE_DIR}/chrome/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/base/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/base/base_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/version/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/settings/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/preferences/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/image_descriptions/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tab/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/browser_controls/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/flags/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/tab_ui/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/native_page/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/layouts/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/profiles/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tabmodel/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/favicon/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/settings/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/preferences/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/util/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/settings/android/widget/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/user_prefs/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/styles/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/tab/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/embedder_support/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/content/public/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/find_in_page/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/profile_metrics/browser_profile_type_enum_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/contextmenu/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/external_intents/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/profiles/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/util/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/navigation_interception/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/content/public/android/content_main_dex_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/url/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/net/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/mojo/public/java/bindings/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_platform_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/embedder_support/android/util_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/webapk/android/libs/client/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/mojo/public/java/system/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/mojo/public/java/bindings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/mojo/public/java/base/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/gfx/geometry/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/url/mojom/url_mojom_gurl_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/mojo/public/mojom/base/base_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/url_loader_base_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/cookies_mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_ip_address_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/websocket_mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/proxy_resolver/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/media/mojo/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/skia/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/cc/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/display/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/base/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/services/filesystem/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/viz/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_schemeful_site_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/version/templates/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/cronet/android/templates/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/version_info/android/java/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/media/capture/mojom/video_capture_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/device/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/metrics_proto/metrics_proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/base/cursor/mojom/cursor_type_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/base/cursor/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/base/dragdrop/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/base/ime/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/events/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/gfx/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/gfx/mojom/native_handle_types_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/gfx/range/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/ui/latency/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_network_param_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/payments/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/schema_org/common/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/frame/frame_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/media_session/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/tokens/tokens_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/gpu/ipc/common/interfaces_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/net/android/net_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/cc/cc_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_core_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/blink_headers_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/data_decoder/public/mojom/mojom_resource_snapshot_for_web_bundle_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/service_worker/storage_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/flags/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/chrome_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/ui/android/favicon/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/widget/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/layouts/glue/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/url_formatter/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/layouts/third_party/float_property/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/theme/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/toolbar/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/fullscreen/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/device/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/bookmarks/common/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/vr/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/start_surface/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/variations/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/webapk/android/libs/common/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/gsa/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/bookmarks/common/android/bookmarks_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/url_formatter/android/url_formatter_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/content/public/android/content_full_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/prefs/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/feed/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/messages/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/notifications/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/policy/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/sync/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/printing/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/ui/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/android/lifecycle/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/language/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/content_capture/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/share/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/share/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/favicon/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tabpersistence/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/signin/public/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/feature_engagement/public/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/translate/content/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/language/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/bottomsheet/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/contextual_search/content/common/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/page_info/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/webxr/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/webapk/libs/client/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/sync/android/sync_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/user_education/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/paint_preview/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/messages/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/messages/android/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/feature_engagement/internal/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/update_proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tab_group/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/externalauth/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/dom_distiller/core/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/security_state/content/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/public/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/signin/public/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/factory/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/webapps/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/modaldialog/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/autofill/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/bottomsheet/android/internal/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/messages/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/search_engines/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/feature_engagement/public/public_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/infobars/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/security_state/core/security_state_enums_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/omnibox/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/image_fetcher/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/query_tiles/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/banners/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/android/browserservices/verification/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/content_settings/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/third_party/android_deps/util/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/omnibox/browser/browser_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/internal/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/permissions/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/webapps/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/signin/services/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/infobars/android/infobar_android_enums_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/autofill/android/full_autofill_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/image_fetcher/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/browser_ui/site_settings/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/favicon/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/video_tutorials/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/background_task_scheduler/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/crash/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/minidump_uploader/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/module_installer/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/offline_items_collection/core/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/safe_browsing/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/safe_browsing/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/webapps/browser/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/infobars/core/infobar_enums_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/content_settings/android/content_settings_enums_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/signin/ui/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/safe_browsing/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/privacy/settings/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/android/crypto/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/thin_webview/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/default_browser_promo/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/banners/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/page_annotations/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/uid/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/contacts_picker/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/viz/common/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/payments/content/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/background_task_scheduler/background_task_scheduler_task_ids_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/chrome_public_apk/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/strictmode/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/performance_hints/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/crash/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/version_info/android/version_constants_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/enterprise/util/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/third_party/android_data_chart/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/location/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/display_cutout/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/dom_distiller/content/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/download/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/download/internal/common/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/download/internal/background_service/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/offline_items_collection/core/core_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/offline_pages/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/xsurface/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/feedback/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/policy/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/consent_auditor/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/site_settings/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/translate/content/android/translate_android_enums_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/services/service_manager/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/device/gamepad/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/public/public_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/media/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/http_auth/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/webrtc/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/media_session/public/cpp/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/webapk/libs/common/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tabmodel/internal/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/notifications/chime/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/modules/image_editor/provider/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/browser_ui/contacts_picker/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/dom_distiller/core/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/media_router/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/endpoint_fetcher/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/safety_check/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/gcm_driver/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/subresource_filter/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/optimization_guide/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/third_party/android_provider/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/nfc/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/webapk/libs/client/client_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/image_editor/public/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/payments/content/android/minimal_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/component_updater/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/omaha/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/consent_auditor/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/download/public/common/public_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/payments/content/android/service_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/download/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/feed/core/proto/proto_java_v2/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/policy/android/policy_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/service_manager/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/partner_location_descriptor_proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/download/public/task/public_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/optimization_guide/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/optimization_guide/proto/optimization_guide_proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/paint_preview/player/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/password_manager/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/payments/content/android/full_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/privacy/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/privacy_sandbox/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/password_check/android/password_check_java_enums/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/gcm_driver/instance_id/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/password_entry_edit/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/paint_preview/common/proto/proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/third_party/android_swipe_refresh/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/password_manager/core/browser/password_manager_java_enums/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/privacy/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/safety_check/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/gcm_driver/instance_id/android/instance_id_driver_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/paint_preview/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/webauthn/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/password_entry_edit/android/internal/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/sync/protocol/protocol_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/signin/services/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/incognito/interstitial/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/continuous_search/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/commerce/price_tracking/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/continuous_search/internal/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/paint_preview/player/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/signin/core/browser/signin_enums_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/site_engagement/content/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/endpoint_fetcher/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/usage_stats_proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/webapk/libs/common/common_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/webapk/libs/runtime_library/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/modules/cablev2_authenticator/public/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/webshare/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/background_task_scheduler/internal/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/third_party/android_media/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/signin/core/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/thin_webview/internal/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/content/public/common/trust_tokens_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/gpu/ipc/common/vulkan_interface_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_network_isolation_key_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/continuous_search/internal/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/tab/critical_persisted_tab_data_proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/background_task_scheduler/internal/proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/contextmenu/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/page_info/android/page_info_action_enum_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/location/android/location_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/webxr/android/webxr_android_enums_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/script_type_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/color_scheme_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/ui/android/layouts/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/search_engines/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/infobars/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/prefs/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/ui/android/toolbar/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/content_capture/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/ui/android/toolbar/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/content_settings/core/common/mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/android/browserservices/verification/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/find_in_page/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/base_module_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/offline_pages/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/content_settings/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/paint_preview/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/password_check/android/internal/internal_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/printing/printing_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/mojo/public/java/system/system_impl_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/device/gamepad/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/device/public/java/device_feature_list_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/permissions/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/performance_hints/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/dom_distiller/core/android/dom_distiller_core_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/enterprise/util/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/translate/core/common/translate_infobar_event_enum_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/internal/internal_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/language/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/ui/messages/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/video_tutorials/internal/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/component_updater/android/background_task_update_scheduler_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/dom_distiller/content/browser/android/dom_distiller_content_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/download/internal/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/feedback/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/image_descriptions/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/password_entry_edit/android/internal/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/policy/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/privacy_sandbox/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/external_intents/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/webauthn/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/thumbnail/generator/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/thumbnail/generator/proto_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/password_manager/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/webapps/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/embedder_support/android/web_contents_delegate_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/download/internal/common/internal_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/feature_engagement/internal/internal_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/gcm_driver/android/gcm_driver_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/language/android/language_bridge_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/geolocation/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/webxr/android/ar_java_base/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/variations/android/variations_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/user_prefs/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/translate/content/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/thin_webview/internal/internal_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/subresource_filter/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/thumbnail/generator/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/location/android/settings_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/media_router/browser/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/download/internal/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/minidump_uploader/minidump_uploader_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/page_info/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/payments/content/android/feature_list_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/query_tiles/public_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/safe_browsing/android/safe_browsing_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/security_state/content/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/site_engagement/content/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/device/geolocation/geolocation_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/module_installer/android/module_installer_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/media/learning/mojo/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/modules/cablev2_authenticator/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/modules/extra_icu/provider/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/modules/extra_icu/public/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/modules/extra_icu/public/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/version_info/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/shape_detection/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/shape_detection/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/battery/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/vibration/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/media/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/media/base/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/media/midi/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/media/capture/video/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/media/capture/content/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/media/base/android/media_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/media/capture/video/android/capture_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/media/capture/content/android/screen_capture_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/media/midi/midi_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/time_zone_monitor/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/device/time_zone_monitor/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/download/network/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/download/network/network_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/services/data_decoder/public/cpp/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/data_decoder/public/cpp/android/safe_json_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/engagement/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/touch_to_fill/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/dev_ui/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/client_certificate/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/javascript_dialogs/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/security_interstitials/content/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/spellcheck/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/viz/service/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/device/bluetooth/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/generic_sensor/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/usb/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/cronet/android/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/device/public/mojom/generic_sensor_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/components/cronet/android/api/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/modules/stack_unwinder/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/modules/dev_ui/provider/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/src/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/features/dev_ui/public/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_native_base_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_common_base_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/internal/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/chrome/android/modules/dev_ui/provider/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/browser_ui/client_certificate/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/javascript_dialogs/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/security_interstitials/content/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/spellcheck/browser/android/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/viz/service/service_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/device/bluetooth/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/device/generic_sensor/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/services/device/usb/java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_common_base_java/generated_java/input_srcjars/* ${src_dir}
  cp -r ${BASE_DIR}/services/device/wake_lock/power_save_blocker/android/java/src/* ${src_dir}
  cp ${RELEASE_DIR}/gen/chrome/android/chrome_public_apk/generated_java/input_srcjars/org/chromium/base/natives/GEN_JNI.java ${src_dir}/org/chromium/base/natives/

#tools/metrics/histograms/enums.xml
#    cp -r ${RELEASE_DIR}/gen/chrome/browser/version/templates/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/components/cronet/android/templates/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/components/version_info/android/java/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/media/capture/mojom/video_capture_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/services/device/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/third_party/metrics_proto/metrics_proto_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/base/cursor/mojom/cursor_type_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/base/cursor/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/base/dragdrop/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/base/ime/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/events/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/gfx/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/gfx/mojom/native_handle_types_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/gfx/range/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/ui/latency/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}


  cp -r ${BASE_DIR}/chrome/android/java/res_base \
        ${BASE_DIR}/chrome/android/java/res_chromium \
        ${BASE_DIR}/chrome/android/java/res_chromium_base \
        ${BASE_DIR}/chrome/android/java/res_vr \
        ${BASE_DIR}/chrome/android/java/res_template \
        "$res_dir"

  	cp "${RELEASE_DIR}/gen/chrome/android/chrome_public_apk/AndroidManifest.xml" \
		"${APP_DIR}/src/main"
}

sync_base_res() {
    mkdir -p ${MODULES_DIR}/base_res
#    mkdir -p ${MODULES_DIR}/base_res/xml
    local base_res_dir="${MODULES_DIR}/base_res"
    cp -r ${BASE_DIR}/chrome/android/java/res \
          ${RELEASE_DIR}/gen/components/browser_ui/strings/android/browser_ui_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/components/strings/java/res/* \
          ${RELEASE_DIR}/gen/chrome/browser/password_check/android/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/start_surface/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/tab_ui/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/internal/java_strings_grd_grit_output/* \
          ${BASE_DIR}/components/blocked_content/android/res/* \
          ${RELEASE_DIR}/gen/chrome/java/res/* \
          ${RELEASE_DIR}/gen/components/webapps/browser/android/webapps_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/app/policy/android/* \
          ${RELEASE_DIR}/gen/components/permissions/android/permissions_strings_grd_grit_output/* \
          "$base_res_dir"
          #先解压压缩包
      cp -r ${RELEASE_DIR}/resource_zips/chrome/android/ui_locale_string_resources/* "$base_res_dir"
}

sync_base() {
    mkdir -p ${MODULES_DIR}/base/src/main/res
    local base_res_dir="${MODULES_DIR}/base/src/main/res"
    cp -r ${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
          "$base_res_dir"
}

sync_assets() {
	local asset_dir="${APP_DIR}/src/main/assets"
	mkdir -p "$asset_dir"
	mkdir -p "${asset_dir}/locales"

	cp ${RELEASE_DIR}/*.dat \
		${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/*.pak \
		"$asset_dir"

	cp ${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/locales/{en-US,zh-CN}.pak \
		"${asset_dir}/locales"
	cp ${RELEASE_DIR}/snapshot_blob.bin "$asset_dir"/snapshot_blob_32.bin
}

sync_aidl() {
    mkdir -p ${APP_DIR}/src/main/aidl
    mkdir -p ${APP_DIR}/src/main/aidl/com/google/vr/keyboard
	  local aidl_dir="${APP_DIR}/src/main/aidl"

    cp -r ${BASE_DIR}/third_party/gvr-android-keyboard/com/google/vr/keyboard/IGvrKeyboardLoader.aidl \
          ${APP_DIR}/src/main/aidl/com/google/vr/keyboard

    local runtime_library_aidl="${APP_DIR}/src/main/aidl/org/chromium/webapk/lib/runtime_library"
    mkdir -p "$runtime_library_aidl"
    mv -f ${APP_DIR}/src/main/java/org/chromium/webapk/lib/runtime_library/*.aidl \
		  "$runtime_library_aidl"

}

sync_ui() {
	mkdir -p ${MODULES_DIR}/ui/src/main/res
cp -r ${BASE_DIR}/ui/android/java/res/* \
		${RELEASE_DIR}/gen/ui/android/ui_strings_grd_grit_output/* \
		${RELEASE_DIR}/gen/chrome/browser/ui/android/strings/ui_strings_grd_grit_output/* \
		"${MODULES_DIR}/ui/src/main/res"
}

sync_components(){
  mkdir -p ${MODULES_DIR}/components/autofill/src/main/res
  cp -r ${BASE_DIR}/components/autofill/android/java/res/* \
        ${RELEASE_DIR}/gen/components/autofill/android/autofill_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/autofill/src/main/res

  mkdir -p ${MODULES_DIR}/components/embedder_support/src/main/res
  cp -r ${BASE_DIR}/components/embedder_support/android/java/res/* \
        ${MODULES_DIR}/components/embedder_support/src/main/res

  mkdir -p ${MODULES_DIR}/components/messages/src/main/res
  cp -r ${BASE_DIR}/components/messages/android/java/res/* \
        ${MODULES_DIR}/components/messages/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_widget/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/widget/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_widget/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_styles/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/styles/android/java/res/* \
        ${BASE_DIR}/components/browser_ui/styles/android/java/res-arcore/* \
        ${MODULES_DIR}/components/browser_ui_styles/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_settings/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/settings/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_settings/src/main/res

  mkdir -p ${MODULES_DIR}/components/infobars/src/main/res
  cp -r ${BASE_DIR}/components/infobars/android/res/* \
        ${MODULES_DIR}/components/infobars/src/main/res

  mkdir -p ${MODULES_DIR}/components/permissions/src/main/res
  cp -r ${BASE_DIR}/components/permissions/android/res/* \
        ${MODULES_DIR}/components/permissions/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_modaldialog/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/modaldialog/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_modaldialog/src/main/res

  mkdir -p ${MODULES_DIR}/components/omnibox/src/main/res
  cp -r ${BASE_DIR}/components/omnibox/browser/android/java/res/* \
        ${MODULES_DIR}/components/omnibox/src/main/res

  mkdir -p ${MODULES_DIR}/components/payments/src/main/res
  cp -r ${BASE_DIR}/components/payments/content/android/java/res/* \
        ${MODULES_DIR}/components/payments/src/main/res

  mkdir -p ${MODULES_DIR}/components/payments/src/main/google_pay_res
  cp -r ${BASE_DIR}/components/payments/content/android/google_pay_res/* \
        ${MODULES_DIR}/components/payments/src/main/google_pay_res

  mkdir -p ${MODULES_DIR}/components/browser_ui_contacts_picker/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/contacts_picker/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_contacts_picker/src/main/res

  mkdir -p ${MODULES_DIR}/components/page_info/src/main/res
  cp -r ${BASE_DIR}/components/page_info/android/java/res/* \
        ${MODULES_DIR}/components/page_info/src/main/res

  mkdir -p ${MODULES_DIR}/components/translate/src/main/res
  cp -r ${BASE_DIR}/components/translate/content/android/java/res/* \
        ${MODULES_DIR}/components/translate/src/main/res

  mkdir -p ${MODULES_DIR}/components/find_in_page/src/main/res
  cp -r ${BASE_DIR}/components/find_in_page/android/java/res/* \
        ${MODULES_DIR}/components/find_in_page/src/main/res

  mkdir -p ${MODULES_DIR}/components/media_router/src/main/res
  cp -r ${BASE_DIR}/components/media_router/browser/android/java/res/* \
        ${RELEASE_DIR}/gen/components/media_router/browser/android/java_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/media_router/src/main/res

  mkdir -p ${MODULES_DIR}/components/subresource_filter/src/main/res
  cp -r ${BASE_DIR}/components/subresource_filter/android/java/res/* \
        ${MODULES_DIR}/components/subresource_filter/src/main/res

  mkdir -p ${MODULES_DIR}/components/embedder_support/src/main/res
  cp -r ${RELEASE_DIR}/gen/components/embedder_support/android/web_contents_delegate_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/embedder_support/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_site_settings/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/site_settings/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_site_settings/src/main/res

  mkdir -p ${MODULES_DIR}/components/javascript_dialogs/src/main/res
  cp -r ${BASE_DIR}/components/javascript_dialogs/android/java/res/* \
        ${RELEASE_DIR}/gen/components/javascript_dialogs/android/javascript_dialogs_strings_grd_grit_output/* \
        ${MODULES_DIR}/components/javascript_dialogs/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_photo_picker/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/photo_picker/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_photo_picker/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_media/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/media/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_media/src/main/res

  mkdir -p ${MODULES_DIR}/components/webrtc/src/main/res
  cp -r ${BASE_DIR}/components/webrtc/android/java/res/* \
        ${MODULES_DIR}/components/webrtc/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_http_auth/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/http_auth/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_http_auth/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_share/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/share/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_share/src/main/res

  mkdir -p ${MODULES_DIR}/components/browser_ui_bottomsheet/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/bottomsheet/android/java/res/* \
        ${MODULES_DIR}/components/browser_ui_bottomsheet/src/main/res

  mkdir -p ${MODULES_DIR}/components/webapk_lib_common/src/main/res
  cp -r ${BASE_DIR}/components/webapk/android/libs/common/res_splash/* \
        ${MODULES_DIR}/components/webapk_lib_common/src/main/res

  mkdir -p ${MODULES_DIR}/components/webapps/src/main/res
  cp -r ${BASE_DIR}/components/webapps/browser/android/java/res/* \
        ${MODULES_DIR}/components/webapps/src/main/res
}

sync_browser(){
  mkdir -p ${MODULES_DIR}/browser/autofill_assistant/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res/* \
        ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res_poodle/* \
        ${MODULES_DIR}/browser/autofill_assistant/src/main/res

  mkdir -p ${MODULES_DIR}/browser/keyboard_accessory/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/res/* \
        ${MODULES_DIR}/browser/keyboard_accessory/src/main/res

  mkdir -p ${MODULES_DIR}/browser/feed/src/main/res
  cp -r ${BASE_DIR}/chrome/android/feed/core/java/res/* \
        ${MODULES_DIR}/browser/feed/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_favicon/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/favicon/java/res/* \
        ${MODULES_DIR}/browser/ui_favicon/src/main/res

  mkdir -p ${MODULES_DIR}/browser/share/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/share/android/java/res/* \
        ${MODULES_DIR}/browser/share/src/main/res

  mkdir -p ${MODULES_DIR}/browser/video_tutorials/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/android/java/res/* \
        ${MODULES_DIR}/browser/video_tutorials/src/main/res

  mkdir -p ${MODULES_DIR}/browser/download/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/download/android/java/res/* \
        ${MODULES_DIR}/browser/download/src/main/res

  mkdir -p ${MODULES_DIR}/browser/feedback/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/feedback/android/java/res/* \
        ${MODULES_DIR}/browser/feedback/src/main/res

  mkdir -p ${MODULES_DIR}/browser/password_check/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/java/res/* \
        ${MODULES_DIR}/browser/password_check/src/main/res

  mkdir -p ${MODULES_DIR}/browser/image_descriptions/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/image_descriptions/android/java/res/* \
        ${MODULES_DIR}/browser/image_descriptions/src/main/res

  mkdir -p ${MODULES_DIR}/browser/user_education/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/user_education/java/res/* \
        ${MODULES_DIR}/browser/user_education/src/main/res

  mkdir -p ${MODULES_DIR}/browser/touch_to_fill/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/res/* \
        ${MODULES_DIR}/browser/touch_to_fill/src/main/res

  mkdir -p ${MODULES_DIR}/browser/safety_check/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/safety_check/android/java/res/* \
        ${MODULES_DIR}/browser/safety_check/src/main/res

  mkdir -p ${MODULES_DIR}/browser/password_check_internal/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/internal/java/res/* \
        ${MODULES_DIR}/browser/password_check_internal/src/main/res

   mkdir -p ${MODULES_DIR}/browser/password_check_internal/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_check/android/internal/java/res/* \
        ${MODULES_DIR}/browser/password_check_internal/src/main/res

   mkdir -p ${MODULES_DIR}/browser/video_tutorials/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/internal/android/java/res/* \
        ${MODULES_DIR}/browser/video_tutorials/src/main/res

     mkdir -p ${MODULES_DIR}/browser/privacy_secure_dns/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/privacy/java/res/* \
        ${MODULES_DIR}/browser/privacy_secure_dns/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_appmenu_internal/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/res/* \
        ${MODULES_DIR}/browser/ui_appmenu_internal/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_appmenu/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/res/* \
        ${MODULES_DIR}/browser/ui_appmenu/src/main/res

  mkdir -p ${MODULES_DIR}/browser/ui_appmenu/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/res/* \
        ${MODULES_DIR}/browser/ui_appmenu/src/main/res

  mkdir -p ${MODULES_DIR}/browser/safe_browsing_settings/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/safe_browsing/android/java/res/* \
        ${MODULES_DIR}/browser/safe_browsing_settings/src/main/res

  mkdir -p ${MODULES_DIR}/browser/theme/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/theme/java/res/* \
        ${MODULES_DIR}/browser/theme/src/main/res

  mkdir -p ${MODULES_DIR}/browser/toolbar/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/toolbar/java/res/* \
        ${MODULES_DIR}/browser/toolbar/src/main/res

  mkdir -p ${MODULES_DIR}/browser/language/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/language/android/java/res/* \
        ${MODULES_DIR}/browser/language/src/main/res

  mkdir -p ${MODULES_DIR}/browser/download_home/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/download/internal/android/java/res/* \
        ${MODULES_DIR}/browser/download_home/src/main/res

  mkdir -p ${MODULES_DIR}/browser/signin_services/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/signin/services/android/java/res/* \
        ${MODULES_DIR}/browser/signin_services/src/main/res

  mkdir -p ${MODULES_DIR}/browser/signin_ui/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/signin/ui/android/java/res/* \
        ${MODULES_DIR}/browser/signin_ui/src/main/res

   mkdir -p ${MODULES_DIR}/browser/incognito_interstitial/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/incognito/interstitial/android/java/res/* \
        ${MODULES_DIR}/browser/incognito_interstitial/src/main/res

   mkdir -p ${MODULES_DIR}/browser/continuous_search/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/continuous_search/android/java/res/* \
        ${MODULES_DIR}/browser/continuous_search/src/main/res

   mkdir -p ${MODULES_DIR}/browser/password_entry_edit/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/password_entry_edit/android/java/res/* \
        ${MODULES_DIR}/browser/password_entry_edit/src/main/res

   mkdir -p ${MODULES_DIR}/browser/webapps/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/webapps/android/java/res/* \
        ${MODULES_DIR}/browser/webapps/src/main/res

   mkdir -p ${MODULES_DIR}/browser/privacy_sandbox/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/privacy_sandbox/android/java/res/* \
        ${MODULES_DIR}/browser/privacy_sandbox/src/main/res
}

sync_surface() {
       mkdir -p ${MODULES_DIR}/chrome_start_surface/src/main/res
       cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/res/* \
          ${BASE_DIR}/chrome/android/features/start_surface/internal/java/explore_res/* \
	       "${MODULES_DIR}/chrome_start_surface/src/main/res"
}

sync_splash() {
       mkdir -p ${MODULES_DIR}/splash/src/main/res
       cp -r ${BASE_DIR}/chrome/android/webapk/libs/common/res_splash/* \
	       "${MODULES_DIR}/splash/src/main/res"
}

sync_third_party() {
  mkdir -p ${MODULES_DIR}/third_party/data_chart/src/main/res
  cp -r ${BASE_DIR}/third_party/android_data_chart/java/res/* \
        ${MODULES_DIR}/third_party/data_chart/src/main/res

  mkdir -p ${MODULES_DIR}/third_party/android_media/src/main/res
  cp -r ${BASE_DIR}/third_party/android_media/java/res/* \
        ${MODULES_DIR}/third_party/android_media/src/main/res
}

sync_content(){
  mkdir -p ${MODULES_DIR}/content/src/main/res
  cp -r ${BASE_DIR}/content/public/android/java/res/* \
        ${RELEASE_DIR}/gen/content/public/android/content_strings_grd_grit_output/* \
        ${MODULES_DIR}/content/src/main/res
}

sync_messages(){
  mkdir -p ${MODULES_DIR}/browser/ui_messages/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/messages/android/java/res/* \
        ${MODULES_DIR}/browser/ui_messages/src/main/res
}

sync_chrome_tab_ui(){
  mkdir -p ${MODULES_DIR}/chrome_tab_ui/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/tab_ui/java/res/* \
        ${MODULES_DIR}/chrome_tab_ui/src/main/res
}

sync_chrome_vr(){
#不清楚是不是生成脚本有问题，未生成该文件，之前的编译目录中有这个文件
  mkdir -p ${MODULES_DIR}/chrome_vr/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/vr/java/res/* \
        ${MODULES_DIR}/chrome_vr/src/main/res
}

sync_media(){
  mkdir -p ${MODULES_DIR}/media/src/main/res
  cp -r ${BASE_DIR}/media/base/android/java/res/* \
        ${MODULES_DIR}/media/src/main/res
}

sync_libs() {
	mkdir -p "${APP_DIR}/libs"
	mkdir -p "${APP_DIR}/libs/ui/android"
	mkdir -p "${APP_DIR}/libs/components/browser_ui/photo_picker/android"
	mkdir -p "${APP_DIR}/libs/url"
	mkdir -p "${APP_DIR}/libs/third_party/gif_player"
	cp ${LIB_DIR}/components/browser_ui/photo_picker/android/java.jar "${APP_DIR}/libs/components/browser_ui/photo_picker/android/"
	cp ${LIB_DIR}/third_party/gif_player/gif_player_java.jar "${APP_DIR}/libs/third_party/gif_player/"
	cp ${LIB_DIR}/ui/android/ui_no_recycler_view_java.jar "${APP_DIR}/libs/ui/android/"
	cp ${LIB_DIR}/url/gurl_java.jar "${APP_DIR}/libs/url/"
	cp ${BASE_DIR}/third_party/google_android_play_core/*.aar \
    "${APP_DIR}/libs"
}


clean_project() {
	rm -rf ${APP_DIR}/src/main/java/org/org \
		${APP_DIR}/src/main/java/org/src \
		${APP_DIR}/src/main/java/org/com \
		${APP_DIR}/src/main/java/org/templates \
		${APP_DIR}/src/main/java/com/google/protobuf \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/MonochromeApplication.java \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/base/SplitMonochromeApplication.java \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/preferences/password/PasswordEntryEditorPreference.java \
		${APP_DIR}/src/main/java/org/chromium/components/module_installer/builder/ModuleInterfaceProcessor.java \
		${APP_DIR}/src/main/java/org/chromium/components/embedder_support/media \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/offlinepages/evaluation \
		${APP_DIR}/src/main/java/src/main/java/org/chromium/chrome/browser/feed/library/common/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/common/time/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/feedstore/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/hostimpl/storage/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/piet/testing \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/basicstream/internal/drivers/testing \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/api/internal/common/testing \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/video_tutorials/test \
    ${APP_DIR}/src/main/java/org/chromium/chrome/modules/test_dummy \
    ${APP_DIR}/src/main/java/org/chromium/components/feed/core/proto/libraries/testing \
    ${APP_DIR}/src/main/java/org/chromium/blink/test \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/feed/library/testing \
    ${APP_DIR}/src/main/java/org/chromium/components/crash/browser/CrashpadMain.java \
    ${APP_DIR}/src/main/java/org/chromium/components/embedder_support/view/ContentViewRenderView.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/offlinepages/downloads/OfflinePageNotificationBridge.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/password_check/PasswordCheckPreference.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/thumbnail/generator/ThumbnailMediaParserBridge.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/AndroidUiGestureTarget.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/AndroidVSyncHelper.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrShell.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrCoreInstallUtils.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrInputConnection.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrShellDelegate.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrFirstRunActivity.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrInputConnection.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrUiWidgetFactory.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrDelegateImpl.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrIntentDelegateImpl.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/vr/VrDelegateProviderImpl.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/download/home/StubbedOfflineContentProvider.java \
    ${APP_DIR}/src/main/java/org/chromium/chrome/browser/download/home/StubbedProvider.java \
		${APP_DIR}/src/main/java/{src,test,templates}

	# local feed_dir="${APP_DIR}/src/main/java/com/google/android/libraries/feed"
	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/(testing|test_data|res)" -type d -print0 | \
	# 	xargs -0 rm -rf

	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/AndroidManifest.xml" -type f -print0 | \
	# 	xargs -0 rm -f

  #.*Test.*\.java|.*test.*\.java|.*Test\.java|.*test\.java|"
	local del_files="|DEPS|DIR_METADATA|LAYOUT_OWNERS|README|OWNERS|COPYING|BUILD|LICENSE|README.chromium|*\.template|*\.tmpl|R\.java|.*\.stamp|.*stamp\.d|.*\.py|.*\.flags|.*\.gn|.*Test.*\.java|.*test.*\.java|.*Test\.java|.*test\.java|"
	find "$PRO_DIR" -not \( -name 'JniStaticTestMocker.java' -or -name 'MockedInTests.java' -or -name 'EditorObserverForTest.java' \
	  -or -name 'PaymentUiServiceTestInterface.java' -or -name 'FlushForTesting.java' -or -name 'NetworkServiceTest.java' -or -name 'HitTestRegionList.java' \
	  -or -name 'HitTestRegion.java' -or -name 'AttestationConveyancePreference.java' -or -name 'NetworkServiceTest_Internal.java' \) \
	 -regextype "posix-egrep" -regex ".*/(${del_files})" -type f -print0 | \
		xargs -0 rm -f

	local langs="af|am|as|ar|az|b\+sr\+Latn|be|bn|bs|bg|ca|cs|da|de|el|en-rGB|en-rUS|es|es-rUS|et|eu|fa|fi|fr|fr-rCA|gl|gu|hdpi|hi|hr|hu|hy|in|is|it|iw"
	langs="$langs|ja|ka|kk|km|ko|kn|ky|lo|lt|lv|mk|ml|mn|mr|ms|my|ne|nb|nl|or|pa|pl|pt-rBR|pt-rPT|si|sq|ro|ru|sk|sl|sr|sv|sw|ta|te|th|tl|tr|ur|uk|uz|vi|zu|zh-rHK|zh-rTW|"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*values-($langs)" -print0 | xargs -0 rm -rf

#	find "${PRO_DIR}/libraries_res" -regextype "posix-egrep" -regex ".*/app_icon\.png" -type f -print0 | xargs -0 rm -f

#	local aidls
#	aidls=$(find "${APP_DIR}/src/main/aidl" -name "*.aidl" -type f)
#	local j_file;
#	for aidl in $aidls; do
#		j_file="$(basename "$aidl" ".aidl")"
#		find "${APP_DIR}/src/main/java" -name "${j_file}.java" -type f -print0 | xargs -0 rm -f
#	done

	local empty_dirs;
	while :; do
		empty_dirs="$(find "$PRO_DIR" -type d -empty)"
		if [ -n "$empty_dirs" ]; then
			echo "$empty_dirs" | xargs rm -rf
		else
			break
		fi
	done
}

do_sync() {
	rm -rf "$PRO_DIR"
  sync_chrome
  sync_assets
  sync_messages
  sync_aidl
  sync_ui
  sync_components
  sync_chrome_tab_ui
  sync_browser
  sync_third_party
  sync_content
  sync_surface
  sync_base_res
  sync_base
  sync_splash
  sync_libs
  sync_chrome_vr
  sync_third_party_res
  sync_media
	clean_project
	# NativeLibraries
}

do_sync
