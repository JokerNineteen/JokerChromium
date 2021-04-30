package org.chromium.chrome.browser.bookmarks;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BookmarkBridgeJni implements BookmarkBridge.Natives {
  private static BookmarkBridge.Natives testInstance;

  public static final JniStaticTestMocker<BookmarkBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.bookmarks.BookmarkBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.bookmarks.BookmarkBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getBookmarkIdForWebContents(long nativeBookmarkBridge, BookmarkBridge caller,
      WebContents webContents, boolean onlyEditable) {
    return (long)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getBookmarkIdForWebContents(nativeBookmarkBridge, caller, webContents, onlyEditable);
  }

  @Override
  public BookmarkBridge.BookmarkItem getBookmarkByID(long nativeBookmarkBridge,
      BookmarkBridge caller, long id, int type) {
    return (BookmarkBridge.BookmarkItem)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getBookmarkByID(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getTopLevelFolderParentIDs(long nativeBookmarkBridge, BookmarkBridge caller,
      List<BookmarkId> bookmarksList) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getTopLevelFolderParentIDs(nativeBookmarkBridge, caller, bookmarksList);
  }

  @Override
  public void getTopLevelFolderIDs(long nativeBookmarkBridge, BookmarkBridge caller,
      boolean getSpecial, boolean getNormal, List<BookmarkId> bookmarksList) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getTopLevelFolderIDs(nativeBookmarkBridge, caller, getSpecial, getNormal, bookmarksList);
  }

  @Override
  public void getAllFoldersWithDepths(long nativeBookmarkBridge, BookmarkBridge caller,
      List<BookmarkId> folderList, List<Integer> depthList) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getAllFoldersWithDepths(nativeBookmarkBridge, caller, folderList, depthList);
  }

  @Override
  public BookmarkId getRootFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getRootFolderId(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getMobileFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getMobileFolderId(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getOtherFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getOtherFolderId(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getDesktopFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getDesktopFolderId(nativeBookmarkBridge, caller);
  }

  @Override
  public BookmarkId getPartnerFolderId(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getPartnerFolderId(nativeBookmarkBridge, caller);
  }

  @Override
  public int getChildCount(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type) {
    return (int)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getChildCount(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getChildIDs(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      List<BookmarkId> bookmarksList) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getChildIDs(nativeBookmarkBridge, caller, id, type, bookmarksList);
  }

  @Override
  public BookmarkId getChildAt(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      int index) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getChildAt(nativeBookmarkBridge, caller, id, type, index);
  }

  @Override
  public int getTotalBookmarkCount(long nativeBookmarkBridge, BookmarkBridge caller, long id,
      int type) {
    return (int)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getTotalBookmarkCount(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void setBookmarkTitle(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      String title) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_setBookmarkTitle(nativeBookmarkBridge, caller, id, type, title);
  }

  @Override
  public void setBookmarkUrl(long nativeBookmarkBridge, BookmarkBridge caller, long id, int type,
      GURL url) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_setBookmarkUrl(nativeBookmarkBridge, caller, id, type, url);
  }

  @Override
  public boolean doesBookmarkExist(long nativeBookmarkBridge, BookmarkBridge caller, long id,
      int type) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_doesBookmarkExist(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getBookmarksForFolder(long nativeBookmarkBridge, BookmarkBridge caller,
      BookmarkId folderId, BookmarkBridge.BookmarksCallback callback,
      List<BookmarkBridge.BookmarkItem> bookmarksList) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getBookmarksForFolder(nativeBookmarkBridge, caller, folderId, callback, bookmarksList);
  }

  @Override
  public boolean isFolderVisible(long nativeBookmarkBridge, BookmarkBridge caller, long id,
      int type) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_isFolderVisible(nativeBookmarkBridge, caller, id, type);
  }

  @Override
  public void getCurrentFolderHierarchy(long nativeBookmarkBridge, BookmarkBridge caller,
      BookmarkId folderId, BookmarkBridge.BookmarksCallback callback,
      List<BookmarkBridge.BookmarkItem> bookmarksList) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getCurrentFolderHierarchy(nativeBookmarkBridge, caller, folderId, callback, bookmarksList);
  }

  @Override
  public BookmarkId addFolder(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId parent,
      int index, String title) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_addFolder(nativeBookmarkBridge, caller, parent, index, title);
  }

  @Override
  public void deleteBookmark(long nativeBookmarkBridge, BookmarkBridge caller,
      BookmarkId bookmarkId) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_deleteBookmark(nativeBookmarkBridge, caller, bookmarkId);
  }

  @Override
  public void removeAllUserBookmarks(long nativeBookmarkBridge, BookmarkBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_removeAllUserBookmarks(nativeBookmarkBridge, caller);
  }

  @Override
  public void moveBookmark(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId bookmarkId,
      BookmarkId newParentId, int index) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_moveBookmark(nativeBookmarkBridge, caller, bookmarkId, newParentId, index);
  }

  @Override
  public BookmarkId addBookmark(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId parent,
      int index, String title, GURL url) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_addBookmark(nativeBookmarkBridge, caller, parent, index, title, url);
  }

  @Override
  public BookmarkId addToReadingList(long nativeBookmarkBridge, BookmarkBridge caller, String title,
      GURL url) {
    return (BookmarkId)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_addToReadingList(nativeBookmarkBridge, caller, title, url);
  }

  @Override
  public BookmarkBridge.BookmarkItem getReadingListItem(long nativeBookmarkBridge,
      BookmarkBridge caller, GURL url) {
    return (BookmarkBridge.BookmarkItem)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_getReadingListItem(nativeBookmarkBridge, caller, url);
  }

  @Override
  public void setReadStatus(long nativeBookmarkBridge, BookmarkBridge caller, GURL url,
      boolean read) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_setReadStatus(nativeBookmarkBridge, caller, url, read);
  }

  @Override
  public void undo(long nativeBookmarkBridge, BookmarkBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_undo(nativeBookmarkBridge, caller);
  }

  @Override
  public void startGroupingUndos(long nativeBookmarkBridge, BookmarkBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_startGroupingUndos(nativeBookmarkBridge, caller);
  }

  @Override
  public void endGroupingUndos(long nativeBookmarkBridge, BookmarkBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_endGroupingUndos(nativeBookmarkBridge, caller);
  }

  @Override
  public void loadEmptyPartnerBookmarkShimForTesting(long nativeBookmarkBridge,
      BookmarkBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_loadEmptyPartnerBookmarkShimForTesting(nativeBookmarkBridge, caller);
  }

  @Override
  public void loadFakePartnerBookmarkShimForTesting(long nativeBookmarkBridge,
      BookmarkBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_loadFakePartnerBookmarkShimForTesting(nativeBookmarkBridge, caller);
  }

  @Override
  public void searchBookmarks(long nativeBookmarkBridge, BookmarkBridge caller,
      List<BookmarkId> bookmarkMatches, String query, int maxNumber) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_searchBookmarks(nativeBookmarkBridge, caller, bookmarkMatches, query, maxNumber);
  }

  @Override
  public long init(BookmarkBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_init(caller, profile);
  }

  @Override
  public boolean isDoingExtensiveChanges(long nativeBookmarkBridge, BookmarkBridge caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_isDoingExtensiveChanges(nativeBookmarkBridge, caller);
  }

  @Override
  public void destroy(long nativeBookmarkBridge, BookmarkBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_destroy(nativeBookmarkBridge, caller);
  }

  @Override
  public boolean isEditBookmarksEnabled(long nativeBookmarkBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_isEditBookmarksEnabled(nativeBookmarkBridge);
  }

  @Override
  public void reorderChildren(long nativeBookmarkBridge, BookmarkBridge caller, BookmarkId parent,
      long[] orderedNodes) {
    GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_reorderChildren(nativeBookmarkBridge, caller, parent, orderedNodes);
  }

  @Override
  public boolean isBookmarked(long nativeBookmarkBridge, GURL url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_bookmarks_BookmarkBridge_isBookmarked(nativeBookmarkBridge, url);
  }

  public static BookmarkBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.bookmarks.BookmarkBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BookmarkBridgeJni();
  }
}
