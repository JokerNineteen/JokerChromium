/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.webapk.lib.common.identity_service;
/** IdentityService allows browsers to query information about the WebAPK. */
public interface IIdentityService extends android.os.IInterface
{
  /** Default implementation for IIdentityService. */
  public static class Default implements org.chromium.webapk.lib.common.identity_service.IIdentityService
  {
    // Gets the package name of its runtime host browser.

    @Override public java.lang.String getRuntimeHostBrowserPackageName() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.webapk.lib.common.identity_service.IIdentityService
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.webapk.lib.common.identity_service.IIdentityService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.webapk.lib.common.identity_service.IIdentityService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.webapk.lib.common.identity_service.IIdentityService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.webapk.lib.common.identity_service.IIdentityService))) {
        return ((org.chromium.webapk.lib.common.identity_service.IIdentityService)iin);
      }
      return new org.chromium.webapk.lib.common.identity_service.IIdentityService.Stub.Proxy(obj);
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
        case TRANSACTION_getRuntimeHostBrowserPackageName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getRuntimeHostBrowserPackageName();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.webapk.lib.common.identity_service.IIdentityService
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
      // Gets the package name of its runtime host browser.

      @Override public java.lang.String getRuntimeHostBrowserPackageName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRuntimeHostBrowserPackageName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRuntimeHostBrowserPackageName();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.webapk.lib.common.identity_service.IIdentityService sDefaultImpl;
    }
    static final int TRANSACTION_getRuntimeHostBrowserPackageName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.webapk.lib.common.identity_service.IIdentityService impl) {
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
    public static org.chromium.webapk.lib.common.identity_service.IIdentityService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Gets the package name of its runtime host browser.

  public java.lang.String getRuntimeHostBrowserPackageName() throws android.os.RemoteException;
}
