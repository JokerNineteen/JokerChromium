#!/bin/bash

set -e

PRO_DIR="/f/chromiumcopy"
BASE_DIR="/f/chromium/src"
RELEASE_DIR="${BASE_DIR}/out/89"
APP_DIR="${PRO_DIR}/app"
MODULES_DIR="${PRO_DIR}"

sync_chrome() {
  mkdir -p ${APP_DIR}/{src/main/java,libs}
	local src_dir="${APP_DIR}/src/main/java"
  mkdir -p ${APP_DIR}/src/main
  mkdir -p ${APP_DIR}/src/main/res_gen
	local res_dir="${APP_DIR}/src/main"
	cp -r ${BASE_DIR}/chrome/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/base/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/start_surface/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/tab_ui/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/vr/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/contextmenu/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/device/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/fullscreen/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/version/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/preferences/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/image_descriptions/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/util/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tab/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tabmodel/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/browser_controls/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/flags/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/profiles/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/favicon/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/native_page/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/layouts/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/android/lifecycle/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/layouts/third_party/float_property/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/messages/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/settings/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/util/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/settings/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/styles/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/widget/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/android/bottomsheet/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/modaldialog/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/notifications/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/feature_engagement/public/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/page_info/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/policy/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/user_prefs/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/external_intents/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/navigation_interception/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/find_in_page/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/embedder_support/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/settings/android/widget/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/url_formatter/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/variations/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/webapk/android/libs/client/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/webapk/android/libs/common/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/prefs/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/bookmarks/common/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/services/service_manager/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/mojo/public/java/bindings/src/* ${src_dir}
  cp -r ${BASE_DIR}/mojo/public/java/base/src/* ${src_dir}
  cp -r ${BASE_DIR}/mojo/public/java/system/src/* ${src_dir}
  cp -r ${BASE_DIR}/net/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/ui/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/url/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/content/public/android/java/src/* ${src_dir}

  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/webxr/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/printing/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/webapk/libs/client/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/user_education/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/content_capture/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/signin/public/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/share/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/autofill/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/paint_preview/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/android/bottomsheet/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/messages/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/search_engines/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/infobars/android/java/src/* ${src_dir}

  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/factory/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/messages/android/internal/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/dom_distiller/core/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/share/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/public/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/signin/core/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/tabpersistence/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/image_fetcher/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/query_tiles/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/browser_ui/banners/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/third_party/android_deps/util/* ${src_dir}
  cp -r ${BASE_DIR}/components/omnibox/browser/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/favicon/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/internal/android/java/src/* ${src_dir}

  cp -r ${BASE_DIR}/components/security_state/content/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/video_tutorials/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/background_task_scheduler/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/crash/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/minidump_uploader/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/components/module_installer/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/safe_browsing/android/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/android/webapk/libs/common/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/android/crypto/java/src/* ${src_dir}
  cp -r ${BASE_DIR}/chrome/browser/ui/android/default_browser_promo/java/src/* ${src_dir}

   cp -r ${BASE_DIR}/components/browser_ui/site_settings/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/thin_webview/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/banners/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/tabmodel/internal/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/feedback/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/notifications/chime/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/xsurface/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/android/modules/image_editor/provider/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/uid/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/viz/common/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/payments/content/android/java/src/* ${src_dir}

   cp -r ${BASE_DIR}/components/browser_ui/contacts_picker/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/image_editor/public/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/omaha/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/strictmode/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/browser_ui/contacts_picker/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/performance_hints/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/enterprise/util/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/strictmode/android/java/src/* ${src_dir}

   cp -r ${BASE_DIR}/third_party/android_data_chart/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/location/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/browser_ui/display_cutout/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/dom_distiller/content/browser/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/offline_items_collection/core/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/download/internal/common/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/permissions/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/download/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/endpoint_fetcher/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/policy/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/password_check/android/internal/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/safety_check/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/translate/content/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/device/gamepad/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/language/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/browser_ui/media/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/browser_ui/http_auth/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/webrtc/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/services/media_session/public/cpp/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/browser_ui/media/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/media_router/browser/android/java/src/* ${src_dir}

   cp -r ${BASE_DIR}/chrome/browser/thumbnail/generator/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/offline_pages/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/engagement/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/password_check/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/content_settings/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/paint_preview/player/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/privacy/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/password_manager/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/signin/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/gcm_driver/android/java/src/* ${src_dir}

   cp -r ${BASE_DIR}/components/download/internal/background_service/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/optimization_guide/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/paint_preview/browser/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/third_party/android_swipe_refresh/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/webauthn/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/subresource_filter/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/sync/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/browser/touch_to_fill/android/java/src/* ${src_dir}


   cp -r ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/browser_ui/webshare/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/chrome/android/features/dev_ui/public/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/background_task_scheduler/internal/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/browser_ui/client_certificate/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/services/device/public/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/third_party/android_provider/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/download/network/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/feature_engagement/internal/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/gcm_driver/instance_id/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/javascript_dialogs/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/third_party/android_media/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/safe_browsing/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/security_interstitials/content/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/spellcheck/browser/android/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/thin_webview/internal/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/components/viz/service/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/services/device/public/java/src/* ${src_dir}
   cp -r ${BASE_DIR}/device/bluetooth/android/java/src/* ${src_dir}

    cp -r ${BASE_DIR}/services/device/geolocation/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/device/generic_sensor/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/device/time_zone_monitor/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/device/usb/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/media/base/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/media/midi/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/components/cronet/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/data_decoder/public/cpp/android/java/src/* ${src_dir}

    #这个文件会覆盖上一条生成的GNI_JNI，现在的做法是手工合并的

    cp -r ${BASE_DIR}/media/capture/video/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/media/capture/content/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/components/cronet/android/api/src/* ${src_dir}
    cp -r ${BASE_DIR}/chrome/android/modules/stack_unwinder/public/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/chrome/android/modules/extra_icu/public/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/chrome/android/modules/dev_ui/provider/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/chrome/android/modules/cablev2_authenticator/public/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/chrome/android/modules/extra_icu/provider/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/components/version_info/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/device/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/device/battery/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/device/nfc/android/java/src/* ${src_dir}
    cp -r ${BASE_DIR}/services/device/vibration/android/java/src/* ${src_dir}
     cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/generated_java/input_srcjars/org/chromium/chrome/browser/omaha/metrics/UpdateProtos.java \
            ${src_dir}/org/chromium/chrome/browser/omaha/metrics/
     cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/generated_java/input_srcjars/org/chromium/chrome/browser/net/SecureDnsManagementMode.java \
            ${src_dir}/org/chromium/chrome/browser/net/

    cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/generated_java/input_srcjars/* ${src_dir}


    cp -r ${RELEASE_DIR}/gen/cc/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}

    cp -r ${RELEASE_DIR}/gen/chrome/browser/preferences/java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/chrome/browser/tab/java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/chrome/browser/version/templates/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/components/cronet/android/templates/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/components/services/filesystem/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/components/version_info/android/java/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/content/public/android/content_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/media/capture/mojom/video_capture_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/media/mojo/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/mojo/public/java/bindings_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/mojo/public/mojom/base/base_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/services/device/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/cookies_mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_ip_address_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/url_loader_base_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/services/network/public/mojom/websocket_mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/services/viz/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/skia/public/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/third_party/metrics_proto/metrics_proto_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/base/cursor/mojom/cursor_type_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/base/cursor/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/base/dragdrop/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/base/ime/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/base/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/display/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/events/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/gfx/geometry/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/gfx/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/gfx/mojom/native_handle_types_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/gfx/range/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/ui/latency/mojom/mojom_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/url/mojom/url_mojom_gurl_java/generated_java/input_srcjars/* ${src_dir}
    cp -r ${RELEASE_DIR}/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/* ${src_dir}


    cp -r ${RELEASE_DIR}/gen/chrome/android/chrome_public_apk/generated_java/input_srcjars/* ${src_dir}



# 生成的无法编译通过部分
#  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_platform_java/generated_java/input_srcjars/* ${src_dir}
#  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/generated_java/input_srcjars/* ${src_dir}
#  cp -r ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/src/* ${src_dir}
#   cp -r ${BASE_DIR}/components/browser_ui/photo_picker/android/java/src/* ${src_dir}
#  cp -r ${RELEASE_DIR}/gen/base/base_java/generated_java/input_srcjars/* ${src_dir}
#    cp -r ${RELEASE_DIR}/gen/url/gurl_java/generated_java/input_srcjars/* ${src_dir}
#  cp -r ${RELEASE_DIR}/gen/ui/android/ui_no_recycler_view_java/generated_java/input_srcjars/* ${src_dir}

##    cp -r ${RELEASE_DIR}/gen/components/cronet/android/cronet_impl_native_base_java/generated_java/input_srcjars/* ${src_dir}

#        ${RELEASE_DIR}/gen/chrome/android/base_module_java/generated_java/input_srcjars/* \
#        ${RELEASE_DIR}/gen/base/base_java/generated_java/input_srcjars/* \
#        ${RELEASE_DIR}/gen/chrome/android/update_proto_java/generated_java/input_srcjars/* \
#        ${BASE_DIR}/android_webview/java/src/* \
#        ${BASE_DIR}/android_webview/nonembedded/java/src/* \
#F:\chromium\src\out\89\gen\chrome\android\features\keyboard_accessory\internal\java_strings_grd_grit_output

#	cp -r ${RELEASE_DIR}/gen/chrome/java/res/* \
#        ${RELEASE_DIR}/gen/chrome/app/policy/android/* \
#        ${RELEASE_DIR}/gen/third_party/blink/public/mojom/web_feature_mojo_bindings_java/generated_java/src/org/org/chromium/chrome/browser/feed/library/piet/res/* \
#		${res_dir}/res_gen
#
##ui_strings_grd_grit_output中的文件android_chrome_strings.xml
##${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/  values.xml
##res_base res_vr 文件夹/values/values.xml重复文件
##/gen/chrome/app/policy/android/
#
#  cp -r ${BASE_DIR}/chrome/android/java/res_base \
#        ${BASE_DIR}/chrome/android/java/res_chromium \
#        ${BASE_DIR}/chrome/android/java/res_chromium_base \
#        ${BASE_DIR}/chrome/android/java/res_vr \
#        ${BASE_DIR}/chrome/android/java/res_template \
#        "$res_dir"
}

sync_base_res() {
    mkdir -p ${MODULES_DIR}/base_res
    local base_res_dir="${MODULES_DIR}/base_res"
    cp -r ${BASE_DIR}/chrome/android/java/res \
          ${RELEASE_DIR}/gen/components/browser_ui/strings/android/browser_ui_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/components/strings/java/res/* \
          ${RELEASE_DIR}/gen/chrome/browser/password_check/android/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/start_surface/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/keyboard_accessory/internal/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/android/features/tab_ui/java_strings_grd_grit_output/* \
          ${RELEASE_DIR}/gen/chrome/browser/touch_to_fill/android/internal/java_strings_grd_grit_output/* \
          ${BASE_DIR}/components/blocked_content/android/res//* \
          "$base_res_dir"
#          ${RELEASE_DIR}/obj/third_party/android_deps/androidx_appcompat_appcompat_java/res/* \
}

sync_base() {
    mkdir -p ${MODULES_DIR}/base/src/main/res
    local base_res_dir="${MODULES_DIR}/base/src/main/res"
    cp -r ${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
          "$base_res_dir"
}

sync_aidl() {
    mkdir -p ${APP_DIR}/src/main/aidl
	  local aidl_dir="${APP_DIR}/src/main/aidl"
    cp -r ${BASE_DIR}/third_party/gvr-android-keyboard/* ${aidl_dir}
#        local android_webview_aidl="${APP_DIR}/src/main/aidl/android_webview/common/services"
#        mkdir -p "android_webview_aidl"
#        # mv -f ${APP_DIR}/src/main/java/android/support/customtabs/*.aidl \
#		# "$custom_tabs_aidl"
#
#        local custom_tabs_trusted_aidl="${APP_DIR}/src/main/aidl/android/support/customtabs/trusted"
#        mkdir -p "$custom_tabs_trusted_aidl"
#        # mv -f ${APP_DIR}/src/main/java/android/support/customtabs/trusted/*.aidl \
#        #         "$custom_tabs_trusted_aidl"
}

sync_ui() {
	mkdir -p ${MODULES_DIR}/ui/src/main/res

#	cp -r ${BASE_DIR}/ui/android/java/src/* \
#		"${APP_DIR}/src/main/java"
#	F:\chromium\src\out\89\resource_zips\chrome\android\ui_locale_string_resources\values\strings.xml
  #resource_zips\chrome\android\ui_locale_string_resources\values\strings.xml会覆盖gen/ui/android/ui_strings_grd_grit_output/strings.xml
	cp -r ${BASE_DIR}/ui/android/java/res/* \
		${RELEASE_DIR}/gen/ui/android/ui_strings_grd_grit_output/* \
		${RELEASE_DIR}/gen/chrome/browser/ui/android/strings/ui_strings_grd_grit_output/* \
		${RELEASE_DIR}/resource_zips/chrome/android/ui_locale_string_resources/* \
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

  mkdir -p ${MODULES_DIR}/components/browser_ui_bottomsheet/src/main/res
  cp -r ${BASE_DIR}/components/browser_ui/android/bottomsheet/java/res/* \
        ${MODULES_DIR}/components/browser_ui_bottomsheet/src/main/res

  mkdir -p ${MODULES_DIR}/components/omnibox/src/main/res
  cp -r ${BASE_DIR}/components/omnibox/browser/android/java/res/* \
        ${MODULES_DIR}/components/omnibox/src/main/res

  mkdir -p ${MODULES_DIR}/components/payments/src/main/res
  cp -r ${BASE_DIR}/components/payments/content/android/java/res/* \
        ${MODULES_DIR}/components/payments/src/main/res

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


}

sync_browser(){
  mkdir -p ${MODULES_DIR}/browser/autofill_assistant/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res/* \
        ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res_poodle/* \
        ${MODULES_DIR}/browser/autofill_assistant/src/main/res
#        chrome/android/features/autofill_assistant/java/res/values-night-v17/colors.xml
        #这个目录也没有生成，原因不明
        #out/Default/gen/chrome/android/features/autofill_assistant/java_strings_grd_grit_output/

  mkdir -p ${MODULES_DIR}/browser/keyboard_accessory/src/main/res
  cp -r ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/res/* \
        ${MODULES_DIR}/browser/keyboard_accessory/src/main/res

  mkdir -p ${MODULES_DIR}/browser/feed/src/main/res
  cp -r ${BASE_DIR}/chrome/android/feed/core/java/res/* \
        ${MODULES_DIR}/browser/feed/src/main/res

  mkdir -p ${MODULES_DIR}/browser/feed/src/main/resv1
  cp -r ${BASE_DIR}/chrome/android/feed/core/java/resv1/* \
        ${MODULES_DIR}/browser/feed/src/main/resv1
#        ${BASE_DIR}/chrome/android/feed/core/java/resv1 \

#        ${BASE_DIR}/chrome/android/features/tab_ui/java/res \
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

   mkdir -p ${MODULES_DIR}/browser/ui_default_browser_promo/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/android/default_browser_promo/java/res/* \
        ${MODULES_DIR}/browser/ui_default_browser_promo/src/main/res

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
#        out/89/obj/third_party/android_deps/androidx_preference_preference_java/res/values/values.xml
}

sync_third_party_res(){
  mkdir -p ${MODULES_DIR}/third_party_res
  cp -r ${RELEASE_DIR}/obj/third_party/android_deps/androidx_appcompat_appcompat_java/res/* \
        ${MODULES_DIR}/third_party_res
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
#  cp -r ${RELEASE_DIR}/gen/chrome/android/features/vr/java_strings_grd_grit_output/* \
#        ${MODULES_DIR}/chrome_vr/src/main/res
}

sync_media(){
  mkdir -p ${MODULES_DIR}/media/src/main/res
  cp -r ${BASE_DIR}/media/base/android/java/res/* \
        ${MODULES_DIR}/media/src/main/res
}

sync_libs() {
	mkdir -p "${APP_DIR}/libs"
	cp ${BASE_DIR}/third_party/android_deps/libs/androidx_annotation_annotation/annotation-1.1.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/androidx_collection_collection/collection-1.1.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/androidx_concurrent_concurrent_futures/concurrent-futures-1.2.0-SNAPSHOT.jar \
    ${BASE_DIR}/third_party/android_deps/libs/androidx_lifecycle_lifecycle_common/lifecycle-common-2.2.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/androidx_lifecycle_lifecycle_common_java8/lifecycle-common-java8-2.0.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_android_support_support_annotations/support-annotations-28.0.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_auto_service_auto_service_annotations/auto-service-annotations-1.0-rc6.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_code_findbugs_jsr305/jsr305-3.0.2.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_dagger_dagger/dagger-2.26.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_errorprone_error_prone_annotation/error_prone_annotation-2.4.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_errorprone_error_prone_check_api/error_prone_check_api-2.4.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_errorprone_error_prone_core/error_prone_core-2.4.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_errorprone_javac/javac-9+181-r4173-1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_guava_failureaccess/failureaccess-1.0.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_guava_guava/guava-27.1-jre.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_guava_listenablefuture/listenablefuture-1.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_google_protobuf_protobuf_javalite/protobuf-javalite-3.13.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_googlecode_java_diff_utils_diffutils/diffutils-1.3.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/com_squareup_javapoet/javapoet-1.11.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/javax_annotation_jsr250_api/jsr250-api-1.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/javax_inject_javax_inject/javax.inject-1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_ow2_asm_asm/asm-7.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_ow2_asm_asm_commons/asm-commons-7.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_ow2_asm_asm_util/asm-util-7.0.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_annotations/annotations-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_junit/junit-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_pluginapi/pluginapi-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_plugins_maven_dependency_resolver/plugins-maven-dependency-resolver-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_resources/resources-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_robolectric/robolectric-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_sandbox/sandbox-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_shadowapi/shadowapi-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_shadows_framework/shadows-framework-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_shadows_multidex/shadows-multidex-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_shadows_playservices/shadows-playservices-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_utils/utils-4.3.1.jar \
    ${BASE_DIR}/third_party/android_deps/libs/org_robolectric_utils_reflector/utils-reflector-4.3.1.jar \
    ${BASE_DIR}/third_party/android_sdk/public/extras/google/gcm/gcm-client/dist/gcm.jar \
    ${BASE_DIR}/third_party/android_support_test_runner/lib/exposed-instrumentation-api-publish-no-dep.jar \
    ${BASE_DIR}/third_party/android_support_test_runner/lib/runner-release-no-dep.jar \
    ${BASE_DIR}/third_party/byte_buddy/lib/byte-buddy-agent.jar \
    ${BASE_DIR}/third_party/byte_buddy/lib/byte-buddy-android.jar \
    ${BASE_DIR}/third_party/byte_buddy/lib/byte-buddy.jar \
    ${BASE_DIR}/third_party/espresso/lib/espresso-contrib-release-no-dep.jar \
    ${BASE_DIR}/third_party/espresso/lib/espresso-core-release-no-dep.jar \
    ${BASE_DIR}/third_party/espresso/lib/espresso-idling-resource-release-no-dep.jar \
    ${BASE_DIR}/third_party/espresso/lib/espresso-intents-release-no-dep.jar \
    ${BASE_DIR}/third_party/espresso/lib/espresso-web-release-no-dep.jar \
    ${BASE_DIR}/third_party/google-truth/lib/truth-0.45.jar \
    ${BASE_DIR}/third_party/guava/lib/guava-android.jar \
    ${BASE_DIR}/third_party/hamcrest/lib/hamcrest-core.jar \
    ${BASE_DIR}/third_party/hamcrest/lib/hamcrest-library.jar \
    ${BASE_DIR}/third_party/netty4/src/jar/all-in-one/netty-all-4.1.9.Final.jar \
    ${BASE_DIR}/third_party/objenesis/lib/objenesis.jar \
    ${BASE_DIR}/third_party/robolectric/lib/android-all-10-robolectric-5803371.jar \
    ${BASE_DIR}/third_party/robolectric/lib/android-all-4.4_r1-robolectric-r2.jar \
    ${BASE_DIR}/third_party/robolectric/lib/android-all-5.0.2_r3-robolectric-r0.jar \
    ${BASE_DIR}/third_party/robolectric/lib/android-all-7.1.0_r7-robolectric-r1.jar \
    ${BASE_DIR}/third_party/robolectric/lib/android-all-8.0.0_r4-robolectric-r1.jar \
    ${BASE_DIR}/third_party/robolectric/lib/android-all-8.1.0-robolectric-4611349.jar \
    ${BASE_DIR}/third_party/robolectric/lib/android-all-9-robolectric-4913185-2.jar \
    ${BASE_DIR}/third_party/ub-uiautomator/lib/ub-uiautomator.jar \
    ${RELEASE_DIR}/cronet/cronet_api.jar \
    ${RELEASE_DIR}/cronet/cronet_impl_native_java.jar \
    ${RELEASE_DIR}/obj/third_party/junit/junit.javac.jar \
    "${APP_DIR}/libs"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_activity_activity_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_activity_activity_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_activity_activity_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_appcompat_appcompat_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_appcompat_appcompat_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_appcompat_appcompat_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_appcompat_appcompat_resources_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_appcompat_appcompat_resources_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_appcompat_appcompat_resources_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_asynclayoutinflater_asynclayoutinflater_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_asynclayoutinflater_asynclayoutinflater_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_activity_activity_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_activity_activity_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_cardview_cardview_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_cardview_cardview_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_coordinatorlayout_coordinatorlayout_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_coordinatorlayout_coordinatorlayout_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_coordinatorlayout_coordinatorlayout_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_core_core_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_core_core_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_core_core_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_customview_customview_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_customview_customview_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_customview_customview_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_drawerlayout_drawerlayout_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_drawerlayout_drawerlayout_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_drawerlayout_drawerlayout_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_fragment_fragment_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_fragment_fragment_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_fragment_fragment_java"

    mkdir -p "${APP_DIR}/libs/2third_party/android_deps/androidx_gridlayout_gridlayout_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_gridlayout_gridlayout_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_gridlayout_gridlayout_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_interpolator_interpolator_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_interpolator_interpolator_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_interpolator_interpolator_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_lifecycle_lifecycle_livedata_core_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_lifecycle_lifecycle_livedata_core_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_lifecycle_lifecycle_livedata_core_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_lifecycle_lifecycle_runtime_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_lifecycle_lifecycle_runtime_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_lifecycle_lifecycle_runtime_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_lifecycle_lifecycle_viewmodel_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_lifecycle_lifecycle_viewmodel_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_lifecycle_lifecycle_viewmodel_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_media_media_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_media_media_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_media_media_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_mediarouter_mediarouter_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_mediarouter_mediarouter_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_mediarouter_mediarouter_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_multidex_multidex_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_multidex_multidex_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_multidex_multidex_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_preference_preference_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_preference_preference_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_preference_preference_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_recyclerview_recyclerview_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_recyclerview_recyclerview_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_recyclerview_recyclerview_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_savedstate_savedstate_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_savedstate_savedstate_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_savedstate_savedstate_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_swiperefreshlayout_swiperefreshlayout_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_swiperefreshlayout_swiperefreshlayout_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_swiperefreshlayout_swiperefreshlayout_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_test_core_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_test_core_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_test_core_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_test_ext_junit_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_test_ext_junit_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_test_ext_junit_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_test_monitor_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_test_monitor_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_test_monitor_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_test_runner_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_test_runner_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_test_runner_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_test_uiautomator_uiautomator_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_test_uiautomator_uiautomator_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_test_uiautomator_uiautomator_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_vectordrawable_vectordrawable_animated_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_vectordrawable_vectordrawable_animated_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_vectordrawable_vectordrawable_animated_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_vectordrawable_vectordrawable_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_vectordrawable_vectordrawable_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_vectordrawable_vectordrawable_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_viewpager_viewpager_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_viewpager_viewpager_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_viewpager_viewpager_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/androidx_webkit_webkit_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/androidx_webkit_webkit_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/androidx_webkit_webkit_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/com_android_support_drawerlayout_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/com_android_support_drawerlayout_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/com_android_support_drawerlayout_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/com_google_android_material_material_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/com_google_android_material_material_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/com_google_android_material_material_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_auth_api_phone_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_auth_api_phone_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_auth_api_phone_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_auth_base_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_auth_base_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_auth_base_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_base_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_base_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_base_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_basement_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_basement_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_basement_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_cast_framework_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_cast_framework_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_cast_framework_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_cast_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_cast_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_cast_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_fido_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_fido_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_fido_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_gcm_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_gcm_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_gcm_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_iid_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_iid_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_iid_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_location_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_location_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_location_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_tasks_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_tasks_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_tasks_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_vision_common_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_vision_common_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_vision_common_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_deps/google_play_services_vision_java"
    cp ${RELEASE_DIR}/obj/third_party/android_deps/google_play_services_vision_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_deps/google_play_services_vision_java"

    mkdir -p "${APP_DIR}/libs/third_party/android_support_test_runner/rules_java/"
    cp ${RELEASE_DIR}/obj/third_party/android_support_test_runner/rules_java/classes.jar \
      "${APP_DIR}/libs/third_party/android_support_test_runner/rules_java"

    mkdir -p "${APP_DIR}/libs/third_party/arcore-android-sdk-client/com_google_ar_core_java"
    cp ${RELEASE_DIR}/obj/third_party/arcore-android-sdk-client/com_google_ar_core_java/classes.jar \
      "${APP_DIR}/libs/third_party/arcore-android-sdk-client/com_google_ar_core_java"

    mkdir -p "${APP_DIR}/libs/third_party/google_android_play_core/com_google_android_play_core_java"
    cp ${RELEASE_DIR}/obj/third_party/google_android_play_core/com_google_android_play_core_java/classes.jar \
      "${APP_DIR}/libs/third_party/google_android_play_core/com_google_android_play_core_java"

    mkdir -p "${APP_DIR}/libs/third_party/gvr-android-sdk/controller_test_api_java"
    cp ${RELEASE_DIR}/obj/third_party/gvr-android-sdk/controller_test_api_java/classes.jar \
      "${APP_DIR}/libs/third_party/gvr-android-sdk/controller_test_api_java"

    mkdir -p "${APP_DIR}/libs/third_party/gvr-android-sdk/gvr_common_java"
    cp ${RELEASE_DIR}/obj/third_party/gvr-android-sdk/gvr_common_java/classes.jar \
      "${APP_DIR}/libs/third_party/gvr-android-sdk/gvr_common_java"

		# ${RELEASE_DIR}/lib.java/third_party/android_tools/gcm.jar \

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
    src\main\java\org\chromium\chrome\browser\vr\AndroidUiGestureTarget.java
    src\main\java\org\chromium\chrome\browser\vr\AndroidVSyncHelper.java
    src\main\java\org\chromium\chrome\browser\vr\VrShell.java
    src\main\java\org\chromium\chrome\browser\vr\VrCoreInstallUtils.java
    src\main\java\org\chromium\chrome\browser\vr\VrInputConnection.java
    src\main\java\org\chromium\chrome\browser\vr\VrShellDelegate.java
    src\main\java\org\chromium\chrome\browser\vr\VrFirstRunActivity.java
    src\main\java\org\chromium\chrome\browser\vr\VrInputConnection.java
    src\main\java\org\chromium\chrome\browser\vr\VrUiWidgetFactory.java
    src\main\java\org\chromium\chrome\browser\vr\VrDelegateImpl.java
    src\main\java\org\chromium\chrome\browser\vr\VrIntentDelegateImpl.java
    src\main\java\org\chromium\chrome\browser\vr\VrDelegateProviderImpl.java
		${APP_DIR}/src/main/java/{src,test,templates}

	# local feed_dir="${APP_DIR}/src/main/java/com/google/android/libraries/feed"
	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/(testing|test_data|res)" -type d -print0 | \
	# 	xargs -0 rm -rf

	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/AndroidManifest.xml" -type f -print0 | \
	# 	xargs -0 rm -f

  #.*Test.*\.java|.*test.*\.java|.*Test\.java|.*test\.java|"
	local del_files="DIR_METADATA|LAYOUT_OWNERS|README|OWNERS|COPYING|BUILD|LICENSE|README.chromium|*\.template|*\.tmpl|R\.java|.*\.stamp|.*stamp\.d|.*\.py|.*\.flags|.*\.gn|.*Test.*\.java|.*test.*\.java|.*Test\.java|.*test\.java|"
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
#  sync_messages
##  sync_aidl
#  sync_ui
#  sync_components
#  sync_chrome_tab_ui
#  sync_browser
#  sync_third_party
#  sync_content
#  sync_surface
#  sync_base_res
#  sync_base
#  sync_splash
#  sync_libs
#  sync_chrome_vr
#  sync_third_party_res
  sync_media
	clean_project
	# NativeLibraries
}

do_sync
