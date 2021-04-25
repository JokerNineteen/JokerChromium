#!/bin/bash

set -e

PRO_DIR="/f/chromiumcopy"
BASE_DIR="/f/chromium/src"
RELEASE_DIR="${BASE_DIR}/out/89"
APP_DIR="${PRO_DIR}/app"
MODULES_DIR="${PRO_DIR}"

sync_ui() {
	mkdir -p ${MODULES_DIR}/ui/src/main/res

	cp -r ${BASE_DIR}/ui/android/java/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${BASE_DIR}/ui/android/java/res/* \
		${RELEASE_DIR}/gen/ui/android/ui_strings_grd_grit_output/* \
		"${MODULES_DIR}/ui/src/main/res"
}

sync_components() {
	mkdir -p ${MODULES_DIR}/components/{autofill,components_base,embedder_support}/src/main/res

		# ${components}/invalidation/impl/android/java/src/* \
		# ${components}/module_installer/android/java/src-common/* \
		# ${components}/module_installer/android/java/src-impl/* \
		# ${components}/web_restrictions/browser/java/src/* \

	local components="${BASE_DIR}/components"
	cp -r ${components}/autofill/android/java/src/* \
		${components}/background_task_scheduler/android/java/src/* \
		${components}/bookmarks/common/android/java/src/* \
		${components}/crash/android/java/src/* \
		${components}/dom_distiller/content/browser/android/java/src/* \
		${components}/dom_distiller/core/android/java/src/* \
		${components}/download/internal/background_service/android/java/src/* \
		${components}/download/network/android/java/src/* \
		${components}/embedder_support/android/java/src/* \
		${components}/feature_engagement/internal/android/java/src/* \
		${components}/feature_engagement/public/android/java/src/* \
		${components}/gcm_driver/android/java/src/* \
		${components}/gcm_driver/instance_id/android/java/src/* \
		${components}/language/android/java/src/* \
		${components}/location/android/java/src/* \
		${components}/minidump_uploader/android/java/src/* \
		${components}/navigation_interception/android/java/src/* \
		${components}/offline_items_collection/core/android/java/src/* \
		${components}/omnibox/browser/android/java/src/* \
		${components}/payments/content/android/java/src/* \
		${components}/policy/android/java/src/* \
		${components}/safe_browsing/android/java/src/* \
		${components}/signin/core/browser/android/java/src/* \
		${components}/spellcheck/browser/android/java/src/* \
		${components}/sync/android/java/src/* \
		${components}/url_formatter/android/java/src/* \
		${components}/variations/android/java/src/* \
		${components}/version_info/android/java/src/* \
		${components}/viz/service/java/src/* \
    ${components}/browser_ui/android/bottomsheet/internal/java/src* \   ok
    ${components}/browser_ui/android/bottomsheet/java/src* \
    ${components}/browser_ui/banners/android/java/src* \
    ${components}/browser_ui/client_certificate/android/java/src* \
    ${components}/browser_ui/contacts_picker/android/java/src* \
    ${components}/browser_ui/display_cutout/android/java/src* \
    ${components}/browser_ui/http_auth/android/java/src* \
    ${components}/browser_ui/media/android/java/src* \
    ${components}/browser_ui/modaldialog/android/java/src* \
    ${components}/browser_ui/notifications/android/java/src* \
    ${components}/browser_ui/photo_picker/android/java/src* \
    ${components}/browser_ui/settings/android/java/src* \
    ${components}/browser_ui/settings/android/widget/java/src* \
    ${components}/browser_ui/share/android/java/src* \
    ${components}/browser_ui/site_settings/android/java/src* \
    ${components}/browser_ui/sms/android/java/src* \
    ${components}/browser_ui/styles/android/java/src* \
    ${components}/browser_ui/util/android/java/src* \
    ${components}/browser_ui/webshare/android/java/src* \
    ${components}/browser_ui/widget/android/java/src* \
		"${APP_DIR}/src/main/java"

	cp -r ${RELEASE_DIR}/gen/components/version_info/android/java/* \
		"${APP_DIR}/src/main/java"

	cp -r ${components}/autofill/android/java/res/* \
		${RELEASE_DIR}/gen/components/autofill/android/autofill_strings_grd_grit_output/* \
		"${MODULES_DIR}/components/autofill/src/main/res"

	cp -r ${components}/embedder_support/android/java/res/* \
		${RELEASE_DIR}/gen/components/embedder_support/android/web_contents_delegate_strings_grd_grit_output/* \
		"${MODULES_DIR}/components/embedder_support/src/main/res"

	cp -r ${RELEASE_DIR}/gen/components/strings/java/res/* \
		"${MODULES_DIR}/components/components_base/src/main/res"
}

sync_content() {
	mkdir -p ${MODULES_DIR}/content/src/main/res

	cp -r ${BASE_DIR}/content/public/android/java/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${BASE_DIR}/content/public/android/java/res/* \
		${RELEASE_DIR}/gen/content/public/android/content_strings_grd_grit_output/* \
		"${MODULES_DIR}/content/src/main/res"

	# local aidl_i="${APP_DIR}/src/main/aidl/org/chromium"
	# mkdir -p "$aidl_i"
	#
	# mv ${APP_DIR}/src/main/java/org/chromium/*.aidl "$aidl_i"
	#
	# local aidl_j="${APP_DIR}/src/main/aidl/org/chromium/content/common"
	# mkdir -p "$aidl_j"
	#
	# mv ${APP_DIR}/src/main/java/org/chromium/content/common/*.aidl "$aidl_j"

	# find ${APP_DIR}/src/main/java/org/chromium -name "*.aidl" -type f -print0 | xargs -0 rm -f
}

sync_data_chart() {
	mkdir -p ${MODULES_DIR}/data_chart/src/main/{java,res}

	cp -r ${BASE_DIR}/third_party/android_data_chart/java/src/* \
		"${MODULES_DIR}/data_chart/src/main/java"

	cp -r ${BASE_DIR}/third_party/android_data_chart/java/res/* \
		"${MODULES_DIR}/data_chart/src/main/res"
}

sync_media() {
	mkdir -p ${MODULES_DIR}/media/src/main/{java,res}

	cp -r ${BASE_DIR}/third_party/android_media/java/src/* \
		"${MODULES_DIR}/media/src/main/java"
	cp -r ${BASE_DIR}/third_party/android_media/java/res/* \
		${BASE_DIR}/media/base/android/java/res/* \
		"${MODULES_DIR}/media/src/main/res"
}

sync_download() {
        mkdir -p ${MODULES_DIR}/download/src/main/res

	# cp -r ${BASE_DIR}/chrome/android/java/res_download/* \
	# 	"${MODULES_DIR}/download/src/main/res"
}

sync_autofill_assistant() {
	mkdir -p ${MODULES_DIR}/autofill_assistant/src/main/res

	# cp -r ${BASE_DIR}/chrome/android/java/res_autofill_assistant/* \
	# 	"${MODULES_DIR}/autofill_assistant/src/main/res"
}

sync_customtabs() {
	mkdir -p ${MODULES_DIR}/customtabs/src/main/res

	# cp -r ${BASE_DIR}/third_party/custom_tabs_client/src/customtabs/src/* \
	# 	"${APP_DIR}/src/main/java"

	# cp -r ${BASE_DIR}/third_party/custom_tabs_client/src/customtabs/res/* \
	# 	"${MODULES_DIR}/customtabs/src/main/res"
}

sync_splash() {
       mkdir -p ${MODULES_DIR}/splash/src/main/res

       cp -r ${BASE_DIR}/chrome/android/webapk/libs/common/res_splash/* \
	       "${MODULES_DIR}/splash/src/main/res"
}

sync_feed() {
	mkdir -p ${MODULES_DIR}/feed/{shared_res,shared_public_res,basic_res,basic_view_res,piet_res}

	# cp -r ${BASE_DIR}/third_party/feed/src/src/main/java/com/google/android/libraries/feed/sharedstream/res/* \
	# "${MODULES_DIR}/feed/shared_res"

	# cp -r ${BASE_DIR}/third_party/feed/src/src/main/java/com/google/android/libraries/feed/sharedstream/publicapi/menumeasurer/res/* \
	# "${MODULES_DIR}/feed/shared_public_res"

	# cp -r ${BASE_DIR}/third_party/feed/src/src/main/java/com/google/android/libraries/feed/basicstream/res/* \
	# "${MODULES_DIR}/feed/basic_res"

	# cp -r ${BASE_DIR}/third_party/feed/src/src/main/java/com/google/android/libraries/feed/basicstream/internal/viewholders/res/* \
	# "${MODULES_DIR}/feed/basic_view_res"

	# cp -r ${BASE_DIR}/third_party/feed/src/src/main/java/com/google/android/libraries/feed/piet/res/* \
	# "${MODULES_DIR}/feed/piet_res"
}

sync_aidl() {
        local custom_tabs_aidl="${APP_DIR}/src/main/aidl/android/support/customtabs"
        mkdir -p "$custom_tabs_aidl"
        # mv -f ${APP_DIR}/src/main/java/android/support/customtabs/*.aidl \
		# "$custom_tabs_aidl"

        local custom_tabs_trusted_aidl="${APP_DIR}/src/main/aidl/android/support/customtabs/trusted"
        mkdir -p "$custom_tabs_trusted_aidl"
        # mv -f ${APP_DIR}/src/main/java/android/support/customtabs/trusted/*.aidl \
        #         "$custom_tabs_trusted_aidl"
}

		# ${BASE_DIR}/build/android/buildhooks/java/* \
		
		# ${BASE_DIR}/chrome/android/third_party/compositor_animator/java/src/* \
		# ${BASE_DIR}/device/usb/android/java/src/* \
		# ${BASE_DIR}/third_party/cct_dynamic_module/src/src/java/* \
		# ${BASE_DIR}/third_party/cacheinvalidation/src/java/* \
		# ${BASE_DIR}/third_party/feed/src/src/main/java/* \
sync_chrome() {
	mkdir -p ${APP_DIR}/{src/main/{java,res,aidl},libs}
	local src_dir="${APP_DIR}/src/main/java"
	local res_dir="${APP_DIR}/src/main/res"

	cp -r ${BASE_DIR}/base/android/java/src/* \
		${BASE_DIR}/chrome/android/feed/core/java/src/* \
		${BASE_DIR}/chrome/android/java/src/* \
		${BASE_DIR}/chrome/android/webapk/libs/client/src/* \
		${BASE_DIR}/chrome/android/webapk/libs/common/src/* \
		${BASE_DIR}/device/bluetooth/android/java/src/* \
		${BASE_DIR}/device/gamepad/android/java/src/* \
		${BASE_DIR}/device/vr/android/java/src/* \
		${BASE_DIR}/media/base/android/java/src/* \
		${BASE_DIR}/media/capture/content/android/java/src/* \
		${BASE_DIR}/media/capture/video/android/java/src/* \
		${BASE_DIR}/media/midi/java/src/* \
		${BASE_DIR}/mojo/public/java/base/src/* \
		${BASE_DIR}/mojo/public/java/bindings/src/* \
		${BASE_DIR}/mojo/public/java/system/src/* \
		${BASE_DIR}/net/android/java/src/* \
		${BASE_DIR}/printing/android/java/src/* \
		${BASE_DIR}/services/data_decoder/public/cpp/android/java/src/* \
		${BASE_DIR}/services/device/android/java/src/* \
		${BASE_DIR}/services/device/battery/android/java/src/* \
		${BASE_DIR}/services/device/generic_sensor/android/java/src/* \
		${BASE_DIR}/services/device/geolocation/android/java/src/* \
		${BASE_DIR}/services/device/nfc/android/java/src/* \
		${BASE_DIR}/services/device/public/java/src/* \
		${BASE_DIR}/services/device/screen_orientation/android/java/src/* \
		${BASE_DIR}/services/device/time_zone_monitor/android/java/src/* \
		${BASE_DIR}/services/device/vibration/android/java/src/* \
		${BASE_DIR}/services/device/wake_lock/power_save_blocker/android/java/src/* \
		${BASE_DIR}/services/media_session/public/cpp/android/java/src/* \
		${BASE_DIR}/services/service_manager/public/java/src/* \
		${BASE_DIR}/services/shape_detection/android/java/src/* \
		${BASE_DIR}/third_party/android_protobuf/src/java/src/device/main/java/* \
		${BASE_DIR}/third_party/android_protobuf/src/java/src/main/java/* \
		${BASE_DIR}/third_party/android_swipe_refresh/java/src/* \
		${BASE_DIR}/third_party/gif_player/src/* \
		${BASE_DIR}/third_party/protobuf/java/core/src/main/java/* \
		"$src_dir"

	# cp -r ${RELEASE_DIR}/gradle/chrome/android/chrome_public_apk/extracted-srcjars/* \
	# 	"$src_dir"

	# cp -r ${RELEASE_DIR}/gen/chrome/android/templates/org/* \
	# 	"$src_dir/org"

	mkdir -p ${PRO_DIR}/res_base

	# cp -r ${BASE_DIR}/chrome/android/java/res/* \
	# 	${RELEASE_DIR}/gen/chrome/android/chrome_strings_grd_grit_output/* \
	#        "${PRO_DIR}/res_base"
#  "../../../../chrome/android/java/res",
#  "../../../../chrome/android/java/res_base",
#  "../../../../chrome/android/java/res_chromium",
#  "../../../../chrome/android/java/res_chromium_base",
    cp -r  ${BASE_DIR}/chrome/android/java/res/* \
		"$res_dir"
		cp -r  ${BASE_DIR}/chrome/android/java/res_base/* \
		"$res_dir"
		cp -r  ${BASE_DIR}/chrome/android/java/res_chromium/* \
		"$res_dir"
	cp -r  ${BASE_DIR}/chrome/android/java/res_chromium_base/* \
		"$res_dir"

	cp -r ${BASE_DIR}/chrome/android/java/res_vr/* "$res_dir"

		# ${RELEASE_DIR}/gradle/chrome/android/chrome_public_apk/extracted-res/xml \

	cp -r ${RELEASE_DIR}/gen/chrome/java/res/* \
		${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
		"$res_dir"

	cp "${RELEASE_DIR}/gen/chrome/android/chrome_public_apk/AndroidManifest.xml" \
		"${APP_DIR}/src/main"

	cp -r ${RELEASE_DIR}/gen/chrome/app/policy/android/* \
		"$res_dir"


		# ${RELEASE_DIR}/gen/base/base_build_config_gen/java_cpp_template/* \
		# ${RELEASE_DIR}/gen/net/android/net_errors_java/java_cpp_template/* \

	cp -r \
		${RELEASE_DIR}/gen/chrome/android/chrome_java/generated_java/* \
		${RELEASE_DIR}/gen/base/base_java/generated_java/* \
		"$src_dir"
}

sync_assets() {
	local asset_dir="${APP_DIR}/src/main/assets"
	mkdir -p "$asset_dir"
	mkdir -p "${asset_dir}/locales"


		# ${RELEASE_DIR}/natives_blob.bin \
		
		# ${RELEASE_DIR}/gen/chrome/android/chrome_public_apk_unwind_assets/* \

	cp ${RELEASE_DIR}/*.dat \
		${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/*.pak \
		"$asset_dir"

	cp ${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/locales/{en-US,zh-CN,zh-TW}.pak \
		"${asset_dir}/locales"
	cp ${RELEASE_DIR}/snapshot_blob.bin "$asset_dir"/snapshot_blob_32.bin
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

sync_jniLibs() {
	local jni_libs_dir="${APP_DIR}/src/main/jniLibs/armeabi-v7a"
	mkdir -p "$jni_libs_dir"
	cp ${RELEASE_DIR}/*.so "$jni_libs_dir"
}

clean_project() {
	rm -rf ${APP_DIR}/src/main/java/org/org \
		${APP_DIR}/src/main/java/org/src \
		${APP_DIR}/src/main/java/org/com \
		${APP_DIR}/src/main/java/com/google/protobuf \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/MonochromeApplication.java \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/preferences/password/PasswordEntryEditorPreference.java \
		${APP_DIR}/src/main/java/org/chromium/components/embedder_support/media \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/offlinepages/evaluation \
		${APP_DIR}/src/main/java/{src,test,templates}

	# local feed_dir="${APP_DIR}/src/main/java/com/google/android/libraries/feed"
	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/(testing|test_data|res)" -type d -print0 | \
	# 	xargs -0 rm -rf

	# find "$feed_dir" -regextype "posix-egrep" -regex ".*/AndroidManifest.xml" -type f -print0 | \
	# 	xargs -0 rm -f

	local del_files="README|OWNERS|COPYING|BUILD|.*\.template|R\.java|.*\.stamp|.*stamp\.d|.*\.py|.*\.flags"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*/(${del_files})" -type f -print0 | \
		xargs -0 rm -f

	local langs="af|am|as|ar|az|b+sr+Latn|be|bn|bs|bg|ca|cs|da|de|el|en-rGB|es|es-rUS|et|eu|fa|fi|fr|fr-rCA|gl|gu|hdpi|hi|hr|hu|hy|in|is|it|iw"
	langs="$langs|ja|ka|kk|km|ko|kn|ky|lo|lt|lv|mk|ml|mn|mr|ms|my|ne|nb|nl|or|pa|pl|pt-rBR|pt-rPT|si|sq|ro|ru|sk|sl|sr|sv|sw|ta|te|th|tl|tr|ur|uk|uz|vi|zu"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*values-($langs)" -print0 | xargs -0 rm -rf

	find "${PRO_DIR}/res_base" -regextype "posix-egrep" -regex ".*/app_icon\.png" -type f -print0 | xargs -0 rm -f

	local aidls
	aidls=$(find "${APP_DIR}/src/main/aidl" -name "*.aidl" -type f)
	local j_file;
	for aidl in $aidls; do
		j_file="$(basename "$aidl" ".aidl")"
		find "${APP_DIR}/src/main/java" -name "${j_file}.java" -type f -print0 | xargs -0 rm -f
	done

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
	sync_ui
	sync_media
	sync_data_chart
	sync_components
	sync_content
	sync_customtabs
	sync_download
	sync_splash
	sync_autofill_assistant
	sync_feed
	sync_aidl

	sync_assets
	sync_libs
	sync_jniLibs

	clean_project
	# NativeLibraries
}

do_sync
