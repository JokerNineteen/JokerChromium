package org.chromium.chrome.browser.database;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SQLiteCursorJni implements SQLiteCursor.Natives {
  private static SQLiteCursor.Natives testInstance;

  public static final JniStaticTestMocker<SQLiteCursor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.database.SQLiteCursor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.database.SQLiteCursor.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void destroy(long nativeSQLiteCursor, SQLiteCursor caller) {
    GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_destroy(nativeSQLiteCursor, caller);
  }

  @Override
  public int getCount(long nativeSQLiteCursor, SQLiteCursor caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getCount(nativeSQLiteCursor, caller);
  }

  @Override
  public String[] getColumnNames(long nativeSQLiteCursor, SQLiteCursor caller) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getColumnNames(nativeSQLiteCursor, caller);
  }

  @Override
  public int getColumnType(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (int)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getColumnType(nativeSQLiteCursor, caller, column);
  }

  @Override
  public String getString(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (String)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getString(nativeSQLiteCursor, caller, column);
  }

  @Override
  public byte[] getBlob(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (byte[])GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getBlob(nativeSQLiteCursor, caller, column);
  }

  @Override
  public boolean isNull(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_isNull(nativeSQLiteCursor, caller, column);
  }

  @Override
  public long getLong(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (long)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getLong(nativeSQLiteCursor, caller, column);
  }

  @Override
  public int getInt(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (int)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getInt(nativeSQLiteCursor, caller, column);
  }

  @Override
  public double getDouble(long nativeSQLiteCursor, SQLiteCursor caller, int column) {
    return (double)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_getDouble(nativeSQLiteCursor, caller, column);
  }

  @Override
  public int moveTo(long nativeSQLiteCursor, SQLiteCursor caller, int newPosition) {
    return (int)GEN_JNI.org_chromium_chrome_browser_database_SQLiteCursor_moveTo(nativeSQLiteCursor, caller, newPosition);
  }

  public static SQLiteCursor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.database.SQLiteCursor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SQLiteCursorJni();
  }
}
