package org.chromium.components.offline_items_collection;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OfflineContentAggregatorBridgeJni implements OfflineContentAggregatorBridge.Natives {
  private static OfflineContentAggregatorBridge.Natives testInstance;

  public static final JniStaticTestMocker<OfflineContentAggregatorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void openItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, int location, boolean openInIncognito,
      String nameSpace, String id) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_openItem(nativeOfflineContentAggregatorBridge, caller, location, openInIncognito, nameSpace, id);
  }

  @Override
  public void removeItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_removeItem(nativeOfflineContentAggregatorBridge, caller, nameSpace, id);
  }

  @Override
  public void cancelDownload(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_cancelDownload(nativeOfflineContentAggregatorBridge, caller, nameSpace, id);
  }

  @Override
  public void pauseDownload(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_pauseDownload(nativeOfflineContentAggregatorBridge, caller, nameSpace, id);
  }

  @Override
  public void resumeDownload(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id, boolean hasUserGesture) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_resumeDownload(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, hasUserGesture);
  }

  @Override
  public void getItemById(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id,
      Callback<OfflineItem> callback) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_getItemById(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, callback);
  }

  @Override
  public void getAllItems(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, Callback<ArrayList<OfflineItem>> callback) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_getAllItems(nativeOfflineContentAggregatorBridge, caller, callback);
  }

  @Override
  public void getVisualsForItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id,
      VisualsCallback callback) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_getVisualsForItem(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, callback);
  }

  @Override
  public void getShareInfoForItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id, ShareCallback callback) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_getShareInfoForItem(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, callback);
  }

  @Override
  public void renameItem(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id, String name,
      Callback<Integer> callback) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_renameItem(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, name, callback);
  }

  @Override
  public void changeSchedule(long nativeOfflineContentAggregatorBridge,
      OfflineContentAggregatorBridge caller, String nameSpace, String id, boolean onlyOnWifi,
      long startTimeMs) {
    GEN_JNI.org_chromium_components_offline_1items_1collection_OfflineContentAggregatorBridge_changeSchedule(nativeOfflineContentAggregatorBridge, caller, nameSpace, id, onlyOnWifi, startTimeMs);
  }

  public static OfflineContentAggregatorBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OfflineContentAggregatorBridgeJni();
  }
}
