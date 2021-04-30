package org.chromium.components.query_tiles.bridges;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.query_tiles.QueryTile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TileProviderBridgeJni implements TileProviderBridge.Natives {
  private static TileProviderBridge.Natives testInstance;

  public static final JniStaticTestMocker<TileProviderBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.query_tiles.bridges.TileProviderBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.query_tiles.bridges.TileProviderBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getQueryTiles(long nativeTileProviderBridge, TileProviderBridge caller, String tileId,
      Callback<List<QueryTile>> callback) {
    GEN_JNI.org_chromium_components_query_1tiles_bridges_TileProviderBridge_getQueryTiles(nativeTileProviderBridge, caller, tileId, callback);
  }

  @Override
  public void onTileClicked(long nativeTileProviderBridge, String tileId) {
    GEN_JNI.org_chromium_components_query_1tiles_bridges_TileProviderBridge_onTileClicked(nativeTileProviderBridge, tileId);
  }

  public static TileProviderBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.query_tiles.bridges.TileProviderBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TileProviderBridgeJni();
  }
}
