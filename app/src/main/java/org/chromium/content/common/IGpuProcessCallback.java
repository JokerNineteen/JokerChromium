/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.content.common;
public interface IGpuProcessCallback extends android.os.IInterface
{
  /** Default implementation for IGpuProcessCallback. */
  public static class Default implements org.chromium.content.common.IGpuProcessCallback
  {
    @Override public void forwardSurfaceForSurfaceRequest(org.chromium.base.UnguessableToken requestToken, android.view.Surface surface) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.content.common.SurfaceWrapper getViewSurface(int surfaceId) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.content.common.IGpuProcessCallback
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.content.common.IGpuProcessCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.content.common.IGpuProcessCallback interface,
     * generating a proxy if needed.
     */
    public static org.chromium.content.common.IGpuProcessCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.content.common.IGpuProcessCallback))) {
        return ((org.chromium.content.common.IGpuProcessCallback)iin);
      }
      return new org.chromium.content.common.IGpuProcessCallback.Stub.Proxy(obj);
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
        case TRANSACTION_forwardSurfaceForSurfaceRequest:
        {
          data.enforceInterface(descriptor);
          org.chromium.base.UnguessableToken _arg0;
          if ((0!=data.readInt())) {
            _arg0 = org.chromium.base.UnguessableToken.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.view.Surface _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.view.Surface.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.forwardSurfaceForSurfaceRequest(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_getViewSurface:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          org.chromium.content.common.SurfaceWrapper _result = this.getViewSurface(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.content.common.IGpuProcessCallback
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
      @Override public void forwardSurfaceForSurfaceRequest(org.chromium.base.UnguessableToken requestToken, android.view.Surface surface) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((requestToken!=null)) {
            _data.writeInt(1);
            requestToken.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((surface!=null)) {
            _data.writeInt(1);
            surface.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_forwardSurfaceForSurfaceRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().forwardSurfaceForSurfaceRequest(requestToken, surface);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public org.chromium.content.common.SurfaceWrapper getViewSurface(int surfaceId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.content.common.SurfaceWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(surfaceId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getViewSurface, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getViewSurface(surfaceId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = org.chromium.content.common.SurfaceWrapper.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.content.common.IGpuProcessCallback sDefaultImpl;
    }
    static final int TRANSACTION_forwardSurfaceForSurfaceRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getViewSurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(org.chromium.content.common.IGpuProcessCallback impl) {
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
    public static org.chromium.content.common.IGpuProcessCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void forwardSurfaceForSurfaceRequest(org.chromium.base.UnguessableToken requestToken, android.view.Surface surface) throws android.os.RemoteException;
  public org.chromium.content.common.SurfaceWrapper getViewSurface(int surfaceId) throws android.os.RemoteException;
}
