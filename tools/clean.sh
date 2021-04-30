#!/bin/sh

PRO_DIR="$(dirname $0)/../"
echo $PRO_DIR

rm -rf ${PRO_DIR}/app/libs/* \
	${PRO_DIR}/app/src/main/aidl/* \
	${PRO_DIR}/app/src/main/assets/* \
	${PRO_DIR}/app/src/main/java/* \
	${PRO_DIR}/app/src/main/jniLibs/* \
	${PRO_DIR}/app/src/main/res/* \
	${PRO_DIR}/app/src/main/res_base/* \
	${PRO_DIR}/app/src/main/res_chromium/* \
	${PRO_DIR}/app/src/main/res_chromium_base/* \
	${PRO_DIR}/app/src/main/res_download/* \
	${PRO_DIR}/app/src/main/res_gen/* \
	${PRO_DIR}/app/src/main/res_template/* \
	${PRO_DIR}/app/src/main/res_vr/* \

rm -rf ${PRO_DIR}/base/src/main/res/*

rm -rf ${PRO_DIR}/base_res/* \
  ${PRO_DIR}/browser/autofill_assistant/src/main/res/* \
  ${PRO_DIR}/browser/banners/src/main/res/* \
  ${PRO_DIR}/browser/customtabs_content/src/main/res/* \
  ${PRO_DIR}/browser/download/src/main/res/* \
  ${PRO_DIR}/browser/feed/src/main/res/* \
  ${PRO_DIR}/browser/feedback/src/main/res/* \
  ${PRO_DIR}/browser/image_descriptions/src/main/res/* \
  ${PRO_DIR}/browser/keyboard_accessory/src/main/res/* \
  ${PRO_DIR}/browser/paint_preview/src/main/res/* \
  ${PRO_DIR}/browser/password_check/src/main/res/* \
  ${PRO_DIR}/browser/password_check_internal/src/main/res/* \
  ${PRO_DIR}/browser/privacy_secure_dns/src/main/res/* \
  ${PRO_DIR}/browser/safe_browsing_settings/src/main/res/* \
  ${PRO_DIR}/browser/safety_check/src/main/res/* \
  ${PRO_DIR}/browser/share/src/main/res/* \
  ${PRO_DIR}/browser/touch_to_fill/src/main/res/* \
  ${PRO_DIR}/browser/ui_appmenu/src/main/res/* \
  ${PRO_DIR}/browser/ui_appmenu_internal/src/main/res/* \
  ${PRO_DIR}/browser/ui_default_browser_promo/src/main/res/* \
  ${PRO_DIR}/browser/ui_favicon/src/main/res/* \
  ${PRO_DIR}/browser/ui_messages/src/main/res/* \
  ${PRO_DIR}/browser/user_education/src/main/res/* \
  ${PRO_DIR}/browser/video_tutorials/src/main/res/* \

rm -rf ${PRO_DIR}/chrome_start_surface/src/main/res/*

rm -rf ${PRO_DIR}/chrome_tab_ui/src/main/res/*

rm -rf ${PRO_DIR}/chrome_ui_messages/src/main/res/*

rm -rf ${PRO_DIR}/chrome_vr/src/main/res/*

rm -rf ${PRO_DIR}/components/autofill/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_bottomsheet/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_bottomsheet_internal/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_client_certificate/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_contacts_picker/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_http_auth/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_media/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_modaldialog/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_photo_picker/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_settings/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_share/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_site_settings/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_styles/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_util/src/main/res/* \
  ${PRO_DIR}/components/browser_ui_widget/src/main/res/* \
  ${PRO_DIR}/components/embedder_support/src/main/res/* \
  ${PRO_DIR}/components/embedder_support_delegate/src/main/res/* \
  ${PRO_DIR}/components/external_intents/src/main/res/* \
  ${PRO_DIR}/components/find_in_page/src/main/res/* \
  ${PRO_DIR}/components/infobars/src/main/res/* \
  ${PRO_DIR}/components/javascript_dialogs/src/main/res/* \
  ${PRO_DIR}/components/media_router/src/main/res/* \
  ${PRO_DIR}/components/messages/src/main/res/* \
  ${PRO_DIR}/components/omnibox/src/main/res/* \
  ${PRO_DIR}/components/page_info/src/main/res/* \
  ${PRO_DIR}/components/payments/src/main/res/* \
  ${PRO_DIR}/components/permissions/src/main/res/* \
  ${PRO_DIR}/components/subresource_filter/src/main/res/* \
  ${PRO_DIR}/components/translate/src/main/res/* \
  ${PRO_DIR}/components/webrtc/src/main/res/* \
  ${PRO_DIR}/components/webxr/src/main/res/*

rm -rf ${PRO_DIR}/content/src/main/res/*

rm -rf ${PRO_DIR}/media/src/main/res/*

rm -rf ${PRO_DIR}/splash/src/main/res/*

rm -rf ${PRO_DIR}/third_party/src/main/res/*

rm -rf ${PRO_DIR}/third_party/android_media/src/main/res/*

rm -rf ${PRO_DIR}/third_party/data_chart/src/main/res/*

rm -rf ${PRO_DIR}/ui/src/main/res/*

