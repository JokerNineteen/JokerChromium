/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.webapk.lib.runtime_library;
/**
 * Interface for communicating between WebAPK service and Chrome.
 */
public interface IWebApkApi extends android.os.IInterface
{
  /** Default implementation for IWebApkApi. */
  public static class Default implements org.chromium.webapk.lib.runtime_library.IWebApkApi
  {
    // Gets the id of the icon to represent WebAPK notifications in status bar.

    @Override public int getSmallIconId() throws android.os.RemoteException
    {
      return 0;
    }
    // Display a notification.
    // DEPRECATED: Use notifyNotificationWithChannel.

    @Override public void notifyNotification(java.lang.String platformTag, int platformID, android.app.Notification notification) throws android.os.RemoteException
    {
    }
    // Cancel a notification.

    @Override public void cancelNotification(java.lang.String platformTag, int platformID) throws android.os.RemoteException
    {
    }
    // Get if notification permission is enabled.

    @Override public boolean notificationPermissionEnabled() throws android.os.RemoteException
    {
      return false;
    }
    // Display a notification with a specified channel name.

    @Override public void notifyNotificationWithChannel(java.lang.String platformTag, int platformID, android.app.Notification notification, java.lang.String channelName) throws android.os.RemoteException
    {
    }
    // Finishes and removes the WebAPK's task. Returns true on success.

    @Override public boolean finishAndRemoveTaskSdk23() throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.webapk.lib.runtime_library.IWebApkApi
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.webapk.lib.runtime_library.IWebApkApi";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.webapk.lib.runtime_library.IWebApkApi interface,
     * generating a proxy if needed.
     */
    public static org.chromium.webapk.lib.runtime_library.IWebApkApi asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.webapk.lib.runtime_library.IWebApkApi))) {
        return ((org.chromium.webapk.lib.runtime_library.IWebApkApi)iin);
      }
      return new org.chromium.webapk.lib.runtime_library.IWebApkApi.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_getSmallIconId:
        {
          data.enforceInterface(descriptor);
          int _result = this.getSmallIconId();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_notifyNotification:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.app.Notification _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.app.Notification.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.notifyNotification(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_cancelNotification:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.cancelNotification(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_notificationPermissionEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.notificationPermissionEnabled();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_notifyNotificationWithChannel:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.app.Notification _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.app.Notification.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          java.lang.String _arg3;
          _arg3 = data.readString();
          this.notifyNotificationWithChannel(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_finishAndRemoveTaskSdk23:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.finishAndRemoveTaskSdk23();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.webapk.lib.runtime_library.IWebApkApi
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      // Gets the id of the icon to represent WebAPK notifications in status bar.

      @Override public int getSmallIconId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSmallIconId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSmallIconId();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Display a notification.
      // DEPRECATED: Use notifyNotificationWithChannel.

      @Override public void notifyNotification(java.lang.String platformTag, int platformID, android.app.Notification notification) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(platformTag);
          _data.writeInt(platformID);
          if ((notification!=null)) {
            _data.writeInt(1);
            notification.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifyNotification, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().notifyNotification(platformTag, platformID, notification);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Cancel a notification.

      @Override public void cancelNotification(java.lang.String platformTag, int platformID) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(platformTag);
          _data.writeInt(platformID);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelNotification, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().cancelNotification(platformTag, platformID);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Get if notification permission is enabled.

      @Override public boolean notificationPermissionEnabled() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notificationPermissionEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().notificationPermissionEnabled();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Display a notification with a specified channel name.

      @Override public void notifyNotificationWithChannel(java.lang.String platformTag, int platformID, android.app.Notification notification, java.lang.String channelName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(platformTag);
          _data.writeInt(platformID);
          if ((notification!=null)) {
            _data.writeInt(1);
            notification.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(channelName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifyNotificationWithChannel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().notifyNotificationWithChannel(platformTag, platformID, notification, channelName);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Finishes and removes the WebAPK's task. Returns true on success.

      @Override public boolean finishAndRemoveTaskSdk23() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_finishAndRemoveTaskSdk23, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().finishAndRemoveTaskSdk23();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.webapk.lib.runtime_library.IWebApkApi sDefaultImpl;
    }
    static final int TRANSACTION_getSmallIconId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_notifyNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_notificationPermissionEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_notifyNotificationWithChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_finishAndRemoveTaskSdk23 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    public static boolean setDefaultImpl(org.chromium.webapk.lib.runtime_library.IWebApkApi impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.chromium.webapk.lib.runtime_library.IWebApkApi getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Gets the id of the icon to represent WebAPK notifications in status bar.

  public int getSmallIconId() throws android.os.RemoteException;
  // Display a notification.
  // DEPRECATED: Use notifyNotificationWithChannel.

  public void notifyNotification(java.lang.String platformTag, int platformID, android.app.Notification notification) throws android.os.RemoteException;
  // Cancel a notification.

  public void cancelNotification(java.lang.String platformTag, int platformID) throws android.os.RemoteException;
  // Get if notification permission is enabled.

  public boolean notificationPermissionEnabled() throws android.os.RemoteException;
  // Display a notification with a specified channel name.

  public void notifyNotificationWithChannel(java.lang.String platformTag, int platformID, android.app.Notification notification, java.lang.String channelName) throws android.os.RemoteException;
  // Finishes and removes the WebAPK's task. Returns true on success.

  public boolean finishAndRemoveTaskSdk23() throws android.os.RemoteException;
}
