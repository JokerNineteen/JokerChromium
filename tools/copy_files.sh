#!/bin/bash

set -e

PRO_DIR="/f/chromiumcopy"
BASE_DIR="/f/chromium/src"
RELEASE_DIR="${BASE_DIR}/out/89"
APP_DIR="${PRO_DIR}/app"
MODULES_DIR="${PRO_DIR}"

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

sync_src() {
  mkdir -p ${APP_DIR}/src/main/java
	local src_dir="${APP_DIR}/src/main/java"
  cp -r ${BASE_DIR}/chrome/android/java/src/* \
        "$src_dir"


#        ${BASE_DIR}/android_webview/glue/java/src/* \
#        ${BASE_DIR}/android_webview/java/src/* \
#        ${BASE_DIR}/android_webview/nonembedded/java/src/* \
#        ${BASE_DIR}/android_webview/support_library/boundary_interfaces/src/* \
#        ${BASE_DIR}/android_webview/support_library/callback/java/src/* \
#        ${BASE_DIR}/android_webview/support_library/java/src/* \
#        ${BASE_DIR}/android_webview/tools/automated_ui_tests/java/src/* \
#        ${BASE_DIR}/android_webview/tools/system_webview_shell/apk/src/* \
#        ${BASE_DIR}/android_webview/tools/system_webview_shell/layout_tests/src/* \
#        ${BASE_DIR}/android_webview/tools/system_webview_shell/page_cycler/src/* \
#        ${BASE_DIR}/android_webview/unittestjava/src/* \
#        ${BASE_DIR}/base/android/java/src/* \
#        ${BASE_DIR}/base/android/jni_generator/java/src/* \
#        ${BASE_DIR}/chrome/android/features/autofill_assistant/java/src/* \
#        ${BASE_DIR}/chrome/android/features/autofill_assistant/public/java/src/* \
#        ${BASE_DIR}/chrome/android/features/dev_ui/internal/java/src/* \
#        ${BASE_DIR}/chrome/android/features/dev_ui/public/java/src/* \
#        ${BASE_DIR}/chrome/android/features/keyboard_accessory/factory/java/src/* \
#        ${BASE_DIR}/chrome/android/features/keyboard_accessory/internal/java/src/* \
#        ${BASE_DIR}/chrome/android/features/keyboard_accessory/public/java/src/* \
#        ${BASE_DIR}/chrome/android/features/start_surface/internal/java/src/* \
#        ${BASE_DIR}/chrome/android/features/start_surface/public/java/src/* \
#        ${BASE_DIR}/chrome/android/features/tab_ui/java/src/* \
#        ${BASE_DIR}/chrome/android/features/vr/java/src/* \
#        ${BASE_DIR}/chrome/android/feed/core/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/cablev2_authenticator/public/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/dev_ui/provider/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/extra_icu/provider/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/extra_icu/public/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/image_editor/provider/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/stack_unwinder/internal/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/stack_unwinder/provider/java/src/* \
#        ${BASE_DIR}/chrome/android/modules/stack_unwinder/public/java/src/* \
#        ${BASE_DIR}/chrome/android/webapk/libs/client/src/* \
#        ${BASE_DIR}/chrome/android/webapk/libs/common/src/* \
#        ${BASE_DIR}/chrome/android/webapk/libs/runtime_library/src/* \
#        ${BASE_DIR}/chrome/android/webapk/shell_apk/src/* \
#        ${BASE_DIR}/chrome/browser/android/crypto/java/src/* \
#        ${BASE_DIR}/chrome/browser/android/lifecycle/java/src/* \
#        ${BASE_DIR}/chrome/browser/banners/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/browser_controls/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/contextmenu/java/src/* \
#        ${BASE_DIR}/chrome/browser/device/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/download/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/download/internal/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/endpoint_fetcher/java/src/* \
#        ${BASE_DIR}/chrome/browser/engagement/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/enterprise/util/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/feedback/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/flags/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/fullscreen/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/image_descriptions/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/image_editor/public/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/image_fetcher/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/metrics_settings/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/notifications/chime/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/offline_pages/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/omaha/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/optimization_guide/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/paint_preview/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/password_check/android/internal/java/src/* \
#        ${BASE_DIR}/chrome/browser/password_check/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/password_manager/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/performance_hints/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/policy/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/preferences/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/privacy/java/src/* \
#        ${BASE_DIR}/chrome/browser/profiles/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/safe_browsing/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/safety_check/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/settings/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/share/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/signin/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/tab/java/src/* \
#        ${BASE_DIR}/chrome/browser/tabmodel/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/tabmodel/internal/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/tabpersistence/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/thumbnail/generator/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/src/* \
#        ${BASE_DIR}/chrome/browser/touch_to_fill/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/android/default_browser_promo/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/android/favicon/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/android/layouts/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/android/layouts/third_party/float_property/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/android/native_page/java/src/* \
#        ${BASE_DIR}/chrome/browser/ui/messages/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/uid/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/user_education/java/src/* \
#        ${BASE_DIR}/chrome/browser/util/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/version/java/src/* \
#        ${BASE_DIR}/chrome/browser/video_tutorials/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/video_tutorials/internal/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/webauthn/android/java/src/* \
#        ${BASE_DIR}/chrome/browser/xsurface/android/java/src/* \
#        ${BASE_DIR}/components/about_ui/android/java/src/* \
#        ${BASE_DIR}/components/autofill/android/java/src/* \
#        ${BASE_DIR}/components/autofill/android/provider/java/src/* \
#        ${BASE_DIR}/components/background_task_scheduler/android/java/src/* \
#        ${BASE_DIR}/components/background_task_scheduler/internal/android/java/src/* \
#        ${BASE_DIR}/components/bookmarks/common/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/android/bottomsheet/internal/java/src/* \
#        ${BASE_DIR}/components/browser_ui/android/bottomsheet/java/src/* \
#        ${BASE_DIR}/components/browser_ui/banners/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/client_certificate/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/contacts_picker/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/display_cutout/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/http_auth/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/media/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/modaldialog/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/notifications/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/photo_picker/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/settings/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/settings/android/widget/java/src/* \
#        ${BASE_DIR}/components/browser_ui/share/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/site_settings/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/sms/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/styles/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/util/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/webshare/android/java/src/* \
#        ${BASE_DIR}/components/browser_ui/widget/android/java/src/* \
#        ${BASE_DIR}/components/content_capture/android/java/src/* \
#        ${BASE_DIR}/components/content_settings/android/java/src/* \
#        ${BASE_DIR}/components/crash/android/java/src/* \
#        ${BASE_DIR}/components/cronet/android/api/src/* \
#        ${BASE_DIR}/components/cronet/android/java/src/* \
#        ${BASE_DIR}/components/cronet/android/sample/src/* \
#        ${BASE_DIR}/components/dom_distiller/content/browser/android/java/src/* \
#        ${BASE_DIR}/components/dom_distiller/core/android/java/src/* \
#        ${BASE_DIR}/components/download/internal/background_service/android/java/src/* \
#        ${BASE_DIR}/components/download/internal/common/android/java/src/* \
#        ${BASE_DIR}/components/download/network/android/java/src/* \
#        ${BASE_DIR}/components/embedder_support/android/java/src/* \
#        ${BASE_DIR}/components/embedder_support/android/metrics/java/src/* \
#        ${BASE_DIR}/components/external_intents/android/java/src/* \
#        ${BASE_DIR}/components/favicon/android/java/src/* \
#        ${BASE_DIR}/components/feature_engagement/internal/android/java/src/* \
#        ${BASE_DIR}/components/feature_engagement/public/android/java/src/* \
#        ${BASE_DIR}/components/find_in_page/android/java/src/* \
#        ${BASE_DIR}/components/gcm_driver/android/java/src/* \
#        ${BASE_DIR}/components/gcm_driver/instance_id/android/java/src/* \
#        ${BASE_DIR}/components/infobars/android/java/src/* \
#        ${BASE_DIR}/components/javascript_dialogs/android/java/src/* \
#        ${BASE_DIR}/components/language/android/java/src/* \
#        ${BASE_DIR}/components/location/android/java/src/* \
#        ${BASE_DIR}/components/media_router/browser/android/java/src/* \
#        ${BASE_DIR}/components/messages/android/internal/java/src/* \
#        ${BASE_DIR}/components/messages/android/java/src/* \
#        ${BASE_DIR}/components/minidump_uploader/android/java/src/* \
#        ${BASE_DIR}/components/module_installer/android/java/src/* \
#        ${BASE_DIR}/components/navigation_interception/android/java/src/* \
#        ${BASE_DIR}/components/offline_items_collection/core/android/java/src/* \
#        ${BASE_DIR}/components/omnibox/browser/android/java/src/* \
#        ${BASE_DIR}/components/page_info/android/java/src/* \
#        ${BASE_DIR}/components/paint_preview/browser/android/java/src/* \
#        ${BASE_DIR}/components/paint_preview/player/android/java/src/* \
#        ${BASE_DIR}/components/payments/content/android/java/src/* \
#        ${BASE_DIR}/components/permissions/android/java/src/* \
#        ${BASE_DIR}/components/policy/android/java/src/* \
#        ${BASE_DIR}/components/prefs/android/java/src/* \
#        ${BASE_DIR}/components/query_tiles/android/java/src/* \
#        ${BASE_DIR}/components/safe_browsing/android/java/src/* \
#        ${BASE_DIR}/components/search_engines/android/java/src/* \
#        ${BASE_DIR}/components/security_interstitials/content/android/java/src/* \
#        ${BASE_DIR}/components/security_state/content/android/java/src/* \
#        ${BASE_DIR}/components/signin/core/browser/android/java/src/* \
#        ${BASE_DIR}/components/signin/public/android/java/src/* \
#        ${BASE_DIR}/components/spellcheck/browser/android/java/src/* \
#        ${BASE_DIR}/components/strictmode/android/java/src/* \
#        ${BASE_DIR}/components/subresource_filter/android/java/src/* \
#        ${BASE_DIR}/components/sync/android/java/src/* \
#        ${BASE_DIR}/components/thin_webview/internal/java/src/* \
#        ${BASE_DIR}/components/thin_webview/java/src/* \
#        ${BASE_DIR}/components/translate/content/android/java/src/* \
#        ${BASE_DIR}/components/url_formatter/android/java/src/* \
#        ${BASE_DIR}/components/user_prefs/android/java/src/* \
#        ${BASE_DIR}/components/variations/android/java/src/* \
#        ${BASE_DIR}/components/version_info/android/java/src/* \
#        ${BASE_DIR}/components/viz/common/java/src/* \
#        ${BASE_DIR}/components/viz/service/java/src/* \
#        ${BASE_DIR}/components/webapk/android/libs/client/src/* \
#        ${BASE_DIR}/components/webapk/android/libs/common/src/* \
#        ${BASE_DIR}/components/webrtc/android/java/src/* \
#        ${BASE_DIR}/components/webxr/android/java/src/* \
#        ${BASE_DIR}/content/public/android/java/src/* \
#        ${BASE_DIR}/content/shell/android/java/src/* \
#        ${BASE_DIR}/content/shell/android/shell_apk/src/* \
#        ${BASE_DIR}/device/bluetooth/android/java/src/* \
#        ${BASE_DIR}/device/gamepad/android/java/src/* \
#        ${BASE_DIR}/device/vr/android/java/src/* \
#        ${BASE_DIR}/media/base/android/java/src/* \
#        ${BASE_DIR}/media/capture/content/android/java/src/* \
#        ${BASE_DIR}/media/capture/video/android/java/src/* \
#        ${BASE_DIR}/media/midi/java/src/* \
#        ${BASE_DIR}/mojo/public/java/base/src/* \
#        ${BASE_DIR}/mojo/public/java/bindings/src/* \
#        ${BASE_DIR}/mojo/public/java/system/src/* \
#        ${BASE_DIR}/net/android/java/src/* \
#        ${RELEASE_DIR}/gen/base/base_java/generated_java/input_srcjars/* \
#        ${RELEASE_DIR}/gen/base/jni_java/generated_java/input_srcjars/* \
#        ${RELEASE_DIR}/gen/build/android/bytecode/bytecode_processor/generated_java/* \
#        ${RELEASE_DIR}/gen/build/android/bytecode/fragment_activity_replacer/generated_java/* \
#        ${BASE_DIR}/printing/android/java/src/* \
#        ${BASE_DIR}/remoting/android/apk/src/* \
#        ${BASE_DIR}/remoting/android/java/src/* \
#        ${BASE_DIR}/services/data_decoder/public/cpp/android/java/src/* \
#        ${BASE_DIR}/services/device/android/java/src/* \
#        ${BASE_DIR}/services/device/battery/android/java/src/* \
#        ${BASE_DIR}/services/device/generic_sensor/android/java/src/* \
#        ${BASE_DIR}/services/device/geolocation/android/java/src/* \
#        ${BASE_DIR}/services/device/nfc/android/java/src/* \
#        ${BASE_DIR}/services/device/public/java/src/* \
#        ${BASE_DIR}/services/device/screen_orientation/android/java/src/* \
#        ${BASE_DIR}/services/device/time_zone_monitor/android/java/src/* \
#        ${BASE_DIR}/services/device/usb/android/java/src/* \
#        ${BASE_DIR}/services/device/vibration/android/java/src/* \
#        ${BASE_DIR}/services/device/wake_lock/power_save_blocker/android/java/src/* \
#        ${BASE_DIR}/services/media_session/public/cpp/android/java/src/* \
#        ${BASE_DIR}/services/service_manager/public/java/src/* \
#        ${BASE_DIR}/services/shape_detection/android/java/src/* \
#        ${BASE_DIR}/third_party/android_data_chart/java/src/* \
#        ${BASE_DIR}/third_party/android_media/java/src/* \
#        ${BASE_DIR}/third_party/android_provider/java/src/* \
#        ${BASE_DIR}/third_party/android_sdk/public/extras/chromium/support/src/* \
#        ${BASE_DIR}/third_party/android_swipe_refresh/java/src/* \
#        ${BASE_DIR}/third_party/gif_player/src/* \
#        ${BASE_DIR}/third_party/robolectric/custom_asynctask/java/src/* \
#        ${BASE_DIR}/tools/android/audio_focus_grabber/java/src/* \
#        ${BASE_DIR}/tools/android/customtabs_benchmark/java/src/* \
#        ${BASE_DIR}/tools/android/errorprone_plugin/src/* \
#        ${BASE_DIR}/tools/android/kerberos/SpnegoAuthenticator/src/* \
#        ${BASE_DIR}/tools/android/memconsumer/java/src/* \
#        ${BASE_DIR}/tools/android/push_apps_to_background/src/* \
#        ${BASE_DIR}/ui/android/java/src/* \
#        ${BASE_DIR}/url/android/java/src/* \
#        ${RELEASE_DIR}/gen/content/public/android/content_java/generated_java/input_srcjars/* \
#  cp -r ${BASE_DIR}/third_party/mockito/src/src/main/java/* \
#        ${BASE_DIR}/third_party/mockito/src/subprojects/android/src/main/java/* \
#        ${BASE_DIR}/third_party/android_deps/util/* \
#        ${BASE_DIR}/third_party/android_sdk/androidx_browser/src/browser/browser/src/main/java/*/* \
#        "$src_dir"
}







#        ${BASE_DIR}/weblayer/browser/java/* \
#        ${BASE_DIR}/weblayer/public/java/* \
#        ${BASE_DIR}/weblayer/shell/android/shell_apk/src/* \
#        ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_shell_apk/generated_java/* \
#        ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_shell_java/generated_java/* \
#        ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_shell_system_webview_apk/generated_java/* \
#        ${RELEASE_DIR}/gen/weblayer/shell/android/weblayer_support_apk/generated_java/* \


#        ${BASE_DIR}/components/cronet/android/fake/java/* \
#        ${BASE_DIR}/chrome/browser/android/examples/custom_tabs_client/src/java/* \
#        ${BASE_DIR}/chrome/browser/android/examples/partner_browser_customizations_provider/src/* \
#        ${BASE_DIR}/build/android/bytecode/java/* \

sync_res() {
  mkdir -p ${MODULES_DIR}/libraries_res/{android_webview_res,chrome_res,components_res,content_res,media_res,net_res,remoting_res,tools_res,ui_res,weblayer_res,gen_res,third_party_res}
	local android_webview_res="${MODULES_DIR}/libraries_res/android_webview_res/"
	local chrome_res="${MODULES_DIR}/libraries_res/chrome_res/"
	local components_res="${MODULES_DIR}/libraries_res/components_res/"
	local content_res="${MODULES_DIR}/libraries_res/content_res/"
	local media_res="${MODULES_DIR}/libraries_res/media_res/"
	local net_res="${MODULES_DIR}/libraries_res/net_res/"
	local remoting_res="${MODULES_DIR}/libraries_res/remoting_res/"
	local tools_res="${MODULES_DIR}/libraries_res/tools_res/"
	local ui_res="${MODULES_DIR}/libraries_res/ui_res/"
	local weblayer_res="${MODULES_DIR}/libraries_res/weblayer_res/"
	local gen_res="${MODULES_DIR}/libraries_res/gen_res/"
	local third_party_res="${MODULES_DIR}/libraries_res/third_party_res/"

  cp -r ${BASE_DIR}/android_webview/java/res \
        ${BASE_DIR}/android_webview/nonembedded/java/res_devui \
        ${BASE_DIR}/android_webview/nonembedded/java/res_icon \
        ${BASE_DIR}/android_webview/tools/system_webview_shell/apk/res \
        "$android_webview_res"

  cp -r ${BASE_DIR}/chrome/android/features/start_surface/internal/java/explore_res \
        ${BASE_DIR}/chrome/android/features/start_surface/internal/java/res \
        ${BASE_DIR}/chrome/android/features/vr/java/res \
        ${BASE_DIR}/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/piet/res \
        ${BASE_DIR}/chrome/android/trichrome/res_dummy \
        ${BASE_DIR}/chrome/android/webapk/libs/common/res_splash \
        ${BASE_DIR}/chrome/android/webapk/shell_apk/res \
        ${BASE_DIR}/chrome/android/webapk/shell_apk/res_app_icon \
        ${BASE_DIR}/chrome/browser/android/examples/partner_browser_customizations_provider/res \
        ${BASE_DIR}/chrome/browser/download/android/java/res \
        ${BASE_DIR}/chrome/browser/feedback/android/java/res \
        ${BASE_DIR}/chrome/browser/image_descriptions/android/java/res \
        ${BASE_DIR}/chrome/browser/metrics_settings/android/java/res \
        ${BASE_DIR}/chrome/browser/password_check/android/internal/java/res \
        ${BASE_DIR}/chrome/browser/password_check/android/java/res \
        ${BASE_DIR}/chrome/browser/privacy/java/res \
        ${BASE_DIR}/chrome/browser/safe_browsing/android/java/res \
        ${BASE_DIR}/chrome/browser/safety_check/android/java/res \
        ${BASE_DIR}/chrome/browser/share/android/java/res \
        ${BASE_DIR}/chrome/browser/touch_to_fill/android/internal/java/res \
        ${BASE_DIR}/chrome/browser/ui/android/appmenu/internal/java/res \
        ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/res \
        ${BASE_DIR}/chrome/browser/ui/android/default_browser_promo/java/res \
        ${BASE_DIR}/chrome/browser/user_education/java/res \
        ${BASE_DIR}/chrome/browser/video_tutorials/android/java/res \
        ${BASE_DIR}/chrome/browser/video_tutorials/internal/android/java/res \
        "$chrome_res"

  mkdir -p ${MODULES_DIR}/libraries_res/chrome_res/custom_tabs_res

  cp -r ${BASE_DIR}/chrome/browser/android/examples/custom_tabs_client/src/res/* \
        ${MODULES_DIR}/libraries_res/chrome_res/custom_tabs_res
#        ${BASE_DIR}/chrome/browser/ui/android/favicon/java/res \

  cp -r ${BASE_DIR}/components/blocked_content/android/res \
        ${BASE_DIR}/components/browser_ui/android/bottomsheet/java/res \
        ${BASE_DIR}/components/browser_ui/contacts_picker/android/java/res \
        ${BASE_DIR}/components/browser_ui/http_auth/android/java/res \
        ${BASE_DIR}/components/browser_ui/media/android/java/res \
        ${BASE_DIR}/components/browser_ui/photo_picker/android/java/res \
        ${BASE_DIR}/components/browser_ui/share/android/java/res \
        ${BASE_DIR}/components/browser_ui/site_settings/android/java/res \
        ${BASE_DIR}/components/browser_ui/styles/android/java/res-arcore \
        ${BASE_DIR}/components/cronet/android/sample/res \
        ${BASE_DIR}/components/cronet/android/test/res \
        ${BASE_DIR}/components/cronet/android/test/smoketests/res/native \
        ${BASE_DIR}/components/cronet/android/test/smoketests/res/platform_only \
        ${BASE_DIR}/components/find_in_page/android/java/res \
        ${BASE_DIR}/components/javascript_dialogs/android/java/res \
        ${BASE_DIR}/components/media_router/browser/android/java/res \
        ${BASE_DIR}/components/messages/android/java/res \
        ${BASE_DIR}/components/omnibox/browser/android/java/res \
        ${BASE_DIR}/components/page_info/android/java/res \
        ${BASE_DIR}/components/payments/content/android/java/res \
        ${BASE_DIR}/components/permissions/android/res \
        ${BASE_DIR}/components/signin/core/browser/android/javatests/res \
        ${BASE_DIR}/components/subresource_filter/android/java/res \
        ${BASE_DIR}/components/test/android/browsertests_apk/res \
        ${BASE_DIR}/components/translate/content/android/java/res \
        ${BASE_DIR}/components/webrtc/android/java/res \
        "$components_res"

  mkdir -p ${MODULES_DIR}/libraries_res/components_res/modaldialog_res
  cp -r ${BASE_DIR}/components/browser_ui/modaldialog/android/java/res \
        ${components_res}/modaldialog_res

  mkdir -p ${MODULES_DIR}/libraries_res/components_res/browser_ui_strings_res
  cp -r ${RELEASE_DIR}/gen/components/browser_ui/strings/android/browser_ui_strings_grd_grit_output/* \
        ${components_res}/browser_ui_strings_res

  mkdir -p ${MODULES_DIR}/libraries_res/components_res/browser_ui_settings_res
  cp -r ${BASE_DIR}/components/browser_ui/settings/android/java/res \
        ${components_res}/browser_ui_settings_res

   mkdir -p ${MODULES_DIR}/libraries_res/components_res/browser_ui_styles_res
   cp -r ${BASE_DIR}/components/browser_ui/styles/android/java/res \
        ${MODULES_DIR}/libraries_res/components_res/browser_ui_styles_res

  mkdir -p ${MODULES_DIR}/libraries_res/components_res/infobars_res
  cp -r ${RELEASE_DIR}/gen/components/strings/java/res/* \
        ${components_res}/infobars_res

  mkdir -p ${MODULES_DIR}/libraries_res/components_res/strings_res
  cp -r ${RELEASE_DIR}/gen/components/strings/java/res/* \
        ${components_res}/strings_res

  mkdir -p ${MODULES_DIR}/libraries_res/components_res/widget_res

  cp -r ${BASE_DIR}/components/browser_ui/widget/android/java/res \
        ${MODULES_DIR}/libraries_res/components_res/widget_res

  mkdir -p ${MODULES_DIR}/libraries_res/content_res/public_res
  cp -r ${BASE_DIR}/content/public/android/java/res \
        ${MODULES_DIR}/libraries_res/content_res/public_res

  mkdir -p ${MODULES_DIR}/libraries_res/content_res/shell_res
  cp -r ${BASE_DIR}/content/shell/android/java/res \
        ${MODULES_DIR}/libraries_res/content_res/shell_res

  mkdir -p ${MODULES_DIR}/libraries_res/content_res/shell_apk_res
  cp -r ${BASE_DIR}/content/shell/android/shell_apk/res \
        ${MODULES_DIR}/libraries_res/content_res/shell_apk_res

  cp -r ${BASE_DIR}/media/base/android/java/res \
        "$media_res"

  cp -r ${BASE_DIR}/net/android/unittest_support/res \
        "$net_res"

  cp -r ${BASE_DIR}/remoting/android/java/res \
        "$remoting_res"

  cp -r ${BASE_DIR}/tools/android/audio_focus_grabber/java/res \
        ${BASE_DIR}/tools/android/customtabs_benchmark/res \
        ${BASE_DIR}/tools/android/kerberos/SpnegoAuthenticator/res \
        ${BASE_DIR}/tools/android/memconsumer/java/res \
        ${BASE_DIR}/tools/android/push_apps_to_background/res \
        "$tools_res"

  cp -r ${BASE_DIR}/ui/android/java/res \
        "$ui_res"

  cp -r ${BASE_DIR}/weblayer/browser/java/res \
        ${BASE_DIR}/weblayer/browser/java/res_test \
        ${BASE_DIR}/weblayer/public/java/res \
        ${BASE_DIR}/weblayer/shell/android/shell_apk/res \
        "$weblayer_res"

  cp -r ${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
        ${RELEASE_DIR}//gen/chrome/java/res/* \
        "$gen_res"

  mkdir -p ${MODULES_DIR}/libraries_res/third_party_res/data_chart_res
        cp -r ${BASE_DIR}/third_party/android_data_chart/java/res/* \
        ${third_party_res}/data_chart_res

}

sync_components(){
  mkdir -p ${MODULES_DIR}/components/autofill/src/main/res
  cp -r ${BASE_DIR}/components/autofill/android/java/res/* \
        ${MODULES_DIR}/components/autofill/src/main/res

  mkdir -p ${MODULES_DIR}/components/embedder_support/src/main/res
  cp -r ${BASE_DIR}/components/embedder_support/android/java/res/* \
        ${MODULES_DIR}/components/embedder_support/src/main/res

  mkdir -p ${MODULES_DIR}/components/messages/src/main/res
  cp -r ${BASE_DIR}/chrome/browser/ui/messages/android/java/res/* \
        ${MODULES_DIR}/components/messages/src/main/res
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
#        ${BASE_DIR}/chrome/android/feed/core/java/resv1 \

#        ${BASE_DIR}/chrome/android/features/tab_ui/java/res \
}

sync_base(){
  mkdir -p ${APP_DIR}/src/main/res
	local res_dir="${APP_DIR}/src/main"
	mkdir -p ${PRO_DIR}/res_base

	cp -r ${BASE_DIR}/chrome/android/java/res \
	       "${PRO_DIR}/res_base"

	cp -r ${RELEASE_DIR}/gen/chrome/java/res/* \
		${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
		"$res_dir"

#res_base res_vr 文件夹/values/values.xml重复文件
#/gen/chrome/app/policy/android/
  cp -r ${BASE_DIR}/chrome/android/java/res \
        ${BASE_DIR}/chrome/android/java/res_base \
        ${BASE_DIR}/chrome/android/java/res_chromium \
        ${BASE_DIR}/chrome/android/java/res_chromium_base \
        ${BASE_DIR}/chrome/android/java/res_vr \
        ${BASE_DIR}/chrome/android/java/res_template/xml \
        ${RELEASE_DIR}/gen/chrome/app/policy/android/* \
        "$res_dir"
#ui_strings_grd_grit_output中的文件android_chrome_strings.xml
  cp -r ${RELEASE_DIR}/gen/chrome/browser/ui/android/strings/ui_strings_grd_grit_output/* \
        "$res_dir"
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

	local del_files="DIR_METADATA|LAYOUT_OWNERS|README|OWNERS|COPYING|BUILD|.*\.template|R\.java|.*\.stamp|.*stamp\.d|.*\.py|.*\.flags"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*/(${del_files})" -type f -print0 | \
		xargs -0 rm -f

	local langs="af|am|as|ar|az|b+sr+Latn|be|bn|bs|bg|ca|cs|da|de|el|en-rGB|es|es-rUS|et|eu|fa|fi|fr|fr-rCA|gl|gu|hdpi|hi|hr|hu|hy|in|is|it|iw"
	langs="$langs|ja|ka|kk|km|ko|kn|ky|lo|lt|lv|mk|ml|mn|mr|ms|my|ne|nb|nl|or|pa|pl|pt-rBR|pt-rPT|si|sq|ro|ru|sk|sl|sr|sv|sw|ta|te|th|tl|tr|ur|uk|uz|vi|zu"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*values-($langs)" -print0 | xargs -0 rm -rf

	find "${PRO_DIR}/libraries_res" -regextype "posix-egrep" -regex ".*/app_icon\.png" -type f -print0 | xargs -0 rm -f

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
#	sync_src
#	sync_libs
  sync_base
	sync_res
  sync_components
  sync_browser
	clean_project
	# NativeLibraries
}

do_sync

#libs
#../../obj/third_party/android_deps/google_play_services_gcm_java/classes.jar
#
#
#src_files
#${RELEASE_DIR}/../../chrome/android/java/src \
#${RELEASE_DIR}/../../components/browser_ui/android/bottomsheet/java/src \
#${RELEASE_DIR}/../../chrome/android/features/vr/java/src \
#${RELEASE_DIR}/../../chrome/browser/util/android/java/src \
# ${RELEASE_DIR}/../../base/android/java/src \
# ${RELEASE_DIR}/../../chrome/browser/download/android/java/src \
# ${RELEASE_DIR}/../../content/public/android/java/src \
# ${RELEASE_DIR}/gen/content/public/android/content_java/generated_java/org"
#${RELEASE_DIR}/../../third_party/android_sdk/androidx_browser/src/browser/browser/src/main/java \
#${RELEASE_DIR}/../../components/crash/android/java/src \
#	mkdir -p ${PRO_DIR}/libraries_res
#gen\chrome\browser\ui\android\strings\ui_strings_grd_grit_output
#	# cp -r ${BASE_DIR}/chrome/android/java/res/* \
#	# 	${RELEASE_DIR}/gen/chrome/android/chrome_strings_grd_grit_output/* \
#	#        "${PRO_DIR}/res_base"
#    cp -r  ${BASE_DIR}/chrome/android/java/res/* \
#		"$res_dir"
#		cp -r  ${BASE_DIR}/chrome/android/java/res_base/* \
#		"$res_dir"
#		cp -r  ${BASE_DIR}/chrome/android/java/res_chromium/* \
#		"$res_dir"
#	cp -r  ${BASE_DIR}/chrome/android/java/res_chromium_base/* \
#		"$res_dir"