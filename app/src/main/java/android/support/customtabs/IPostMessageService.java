/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.support.customtabs;
/**
 * Interface to a PostMessageService.
 * @hide
 */
public interface IPostMessageService extends android.os.IInterface
{
  /** Default implementation for IPostMessageService. */
  public static class Default implements android.support.customtabs.IPostMessageService
  {
    @Override public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback callback, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void onPostMessage(android.support.customtabs.ICustomTabsCallback callback, java.lang.String message, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.support.customtabs.IPostMessageService
  {
    private static final java.lang.String DESCRIPTOR = "android.support.customtabs.IPostMessageService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.support.customtabs.IPostMessageService interface,
     * generating a proxy if needed.
     */
    public static android.support.customtabs.IPostMessageService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.support.customtabs.IPostMessageService))) {
        return ((android.support.customtabs.IPostMessageService)iin);
      }
      return new android.support.customtabs.IPostMessageService.Stub.Proxy(obj);
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
        case TRANSACTION_onMessageChannelReady:
        {
          data.enforceInterface(descriptor);
          android.support.customtabs.ICustomTabsCallback _arg0;
          _arg0 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(data.readStrongBinder());
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onMessageChannelReady(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onPostMessage:
        {
          data.enforceInterface(descriptor);
          android.support.customtabs.ICustomTabsCallback _arg0;
          _arg0 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.onPostMessage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.support.customtabs.IPostMessageService
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
      @Override public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback callback, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onMessageChannelReady, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onMessageChannelReady(callback, extras);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onPostMessage(android.support.customtabs.ICustomTabsCallback callback, java.lang.String message, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          _data.writeString(message);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPostMessage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPostMessage(callback, message, extras);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static android.support.customtabs.IPostMessageService sDefaultImpl;
    }
    static final int TRANSACTION_onMessageChannelReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onPostMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(android.support.customtabs.IPostMessageService impl) {
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
    public static android.support.customtabs.IPostMessageService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback callback, android.os.Bundle extras) throws android.os.RemoteException;
  public void onPostMessage(android.support.customtabs.ICustomTabsCallback callback, java.lang.String message, android.os.Bundle extras) throws android.os.RemoteException;
}
