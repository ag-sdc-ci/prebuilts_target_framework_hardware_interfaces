/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.cas-V1-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/cas/aidl/aidl_api/android.hardware.cas/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/cas/aidl/aidl_api/android.hardware.cas/1/android/hardware/cas/IMediaCasService.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.cas;
/** @hide */
public interface IMediaCasService extends android.os.IInterface
{
  /** Default implementation for IMediaCasService. */
  public static class Default implements android.hardware.cas.IMediaCasService
  {
    @Override public android.hardware.cas.IDescrambler createDescrambler(int CA_system_id) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.cas.ICas createPlugin(int CA_system_id, android.hardware.cas.ICasListener listener) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.cas.AidlCasPluginDescriptor[] enumeratePlugins() throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean isDescramblerSupported(int CA_system_id) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean isSystemIdSupported(int CA_system_id) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.cas.IMediaCasService
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.cas.IMediaCasService interface,
     * generating a proxy if needed.
     */
    public static android.hardware.cas.IMediaCasService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.cas.IMediaCasService))) {
        return ((android.hardware.cas.IMediaCasService)iin);
      }
      return new android.hardware.cas.IMediaCasService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_createDescrambler:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          android.hardware.cas.IDescrambler _result = this.createDescrambler(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_createPlugin:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.cas.ICasListener _arg1;
          _arg1 = android.hardware.cas.ICasListener.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          android.hardware.cas.ICas _result = this.createPlugin(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_enumeratePlugins:
        {
          android.hardware.cas.AidlCasPluginDescriptor[] _result = this.enumeratePlugins();
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_isDescramblerSupported:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          boolean _result = this.isDescramblerSupported(_arg0);
          reply.writeNoException();
          reply.writeBoolean(_result);
          break;
        }
        case TRANSACTION_isSystemIdSupported:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          boolean _result = this.isSystemIdSupported(_arg0);
          reply.writeNoException();
          reply.writeBoolean(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.hardware.cas.IMediaCasService
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
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public android.hardware.cas.IDescrambler createDescrambler(int CA_system_id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.cas.IDescrambler _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(CA_system_id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createDescrambler, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.cas.IDescrambler.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.cas.ICas createPlugin(int CA_system_id, android.hardware.cas.ICasListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.cas.ICas _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(CA_system_id);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createPlugin, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.cas.ICas.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.cas.AidlCasPluginDescriptor[] enumeratePlugins() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.cas.AidlCasPluginDescriptor[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enumeratePlugins, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArray(android.hardware.cas.AidlCasPluginDescriptor.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean isDescramblerSupported(int CA_system_id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(CA_system_id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isDescramblerSupported, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readBoolean();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean isSystemIdSupported(int CA_system_id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(CA_system_id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isSystemIdSupported, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readBoolean();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_createDescrambler = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_createPlugin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_enumeratePlugins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_isDescramblerSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_isSystemIdSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$cas$IMediaCasService".replace('$', '.');
  public android.hardware.cas.IDescrambler createDescrambler(int CA_system_id) throws android.os.RemoteException;
  public android.hardware.cas.ICas createPlugin(int CA_system_id, android.hardware.cas.ICasListener listener) throws android.os.RemoteException;
  public android.hardware.cas.AidlCasPluginDescriptor[] enumeratePlugins() throws android.os.RemoteException;
  public boolean isDescramblerSupported(int CA_system_id) throws android.os.RemoteException;
  public boolean isSystemIdSupported(int CA_system_id) throws android.os.RemoteException;
}
