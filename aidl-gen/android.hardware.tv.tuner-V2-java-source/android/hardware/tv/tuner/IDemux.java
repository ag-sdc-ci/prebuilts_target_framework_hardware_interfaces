/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/IDemux.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public interface IDemux extends android.os.IInterface
{
  /** Default implementation for IDemux. */
  public static class Default implements android.hardware.tv.tuner.IDemux
  {
    @Override public void setFrontendDataSource(int frontendId) throws android.os.RemoteException
    {
    }
    @Override public android.hardware.tv.tuner.IFilter openFilter(android.hardware.tv.tuner.DemuxFilterType type, int bufferSize, android.hardware.tv.tuner.IFilterCallback cb) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.tv.tuner.ITimeFilter openTimeFilter() throws android.os.RemoteException
    {
      return null;
    }
    @Override public int getAvSyncHwId(android.hardware.tv.tuner.IFilter filter) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public long getAvSyncTime(int avSyncHwId) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public void close() throws android.os.RemoteException
    {
    }
    @Override public android.hardware.tv.tuner.IDvr openDvr(byte type, int bufferSize, android.hardware.tv.tuner.IDvrCallback cb) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void connectCiCam(int ciCamId) throws android.os.RemoteException
    {
    }
    @Override public void disconnectCiCam() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IDemux
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.tv.tuner.IDemux interface,
     * generating a proxy if needed.
     */
    public static android.hardware.tv.tuner.IDemux asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.tv.tuner.IDemux))) {
        return ((android.hardware.tv.tuner.IDemux)iin);
      }
      return new android.hardware.tv.tuner.IDemux.Stub.Proxy(obj);
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
        case TRANSACTION_setFrontendDataSource:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setFrontendDataSource(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_openFilter:
        {
          android.hardware.tv.tuner.DemuxFilterType _arg0;
          _arg0 = data.readTypedObject(android.hardware.tv.tuner.DemuxFilterType.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          android.hardware.tv.tuner.IFilterCallback _arg2;
          _arg2 = android.hardware.tv.tuner.IFilterCallback.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          android.hardware.tv.tuner.IFilter _result = this.openFilter(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_openTimeFilter:
        {
          android.hardware.tv.tuner.ITimeFilter _result = this.openTimeFilter();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getAvSyncHwId:
        {
          android.hardware.tv.tuner.IFilter _arg0;
          _arg0 = android.hardware.tv.tuner.IFilter.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          int _result = this.getAvSyncHwId(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getAvSyncTime:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          long _result = this.getAvSyncTime(_arg0);
          reply.writeNoException();
          reply.writeLong(_result);
          break;
        }
        case TRANSACTION_close:
        {
          this.close();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_openDvr:
        {
          byte _arg0;
          _arg0 = data.readByte();
          int _arg1;
          _arg1 = data.readInt();
          android.hardware.tv.tuner.IDvrCallback _arg2;
          _arg2 = android.hardware.tv.tuner.IDvrCallback.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          android.hardware.tv.tuner.IDvr _result = this.openDvr(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_connectCiCam:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.connectCiCam(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_disconnectCiCam:
        {
          this.disconnectCiCam();
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.hardware.tv.tuner.IDemux
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
      @Override public void setFrontendDataSource(int frontendId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(frontendId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFrontendDataSource, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.hardware.tv.tuner.IFilter openFilter(android.hardware.tv.tuner.DemuxFilterType type, int bufferSize, android.hardware.tv.tuner.IFilterCallback cb) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.tv.tuner.IFilter _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(type, 0);
          _data.writeInt(bufferSize);
          _data.writeStrongInterface(cb);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openFilter, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.tv.tuner.IFilter.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.tv.tuner.ITimeFilter openTimeFilter() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.tv.tuner.ITimeFilter _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openTimeFilter, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.tv.tuner.ITimeFilter.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getAvSyncHwId(android.hardware.tv.tuner.IFilter filter) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(filter);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvSyncHwId, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getAvSyncTime(int avSyncHwId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(avSyncHwId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvSyncTime, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void close() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.hardware.tv.tuner.IDvr openDvr(byte type, int bufferSize, android.hardware.tv.tuner.IDvrCallback cb) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.tv.tuner.IDvr _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(type);
          _data.writeInt(bufferSize);
          _data.writeStrongInterface(cb);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openDvr, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.tv.tuner.IDvr.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void connectCiCam(int ciCamId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(ciCamId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_connectCiCam, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void disconnectCiCam() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disconnectCiCam, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_setFrontendDataSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_openFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_openTimeFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getAvSyncHwId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getAvSyncTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_openDvr = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_connectCiCam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_disconnectCiCam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$tv$tuner$IDemux".replace('$', '.');
  public void setFrontendDataSource(int frontendId) throws android.os.RemoteException;
  public android.hardware.tv.tuner.IFilter openFilter(android.hardware.tv.tuner.DemuxFilterType type, int bufferSize, android.hardware.tv.tuner.IFilterCallback cb) throws android.os.RemoteException;
  public android.hardware.tv.tuner.ITimeFilter openTimeFilter() throws android.os.RemoteException;
  public int getAvSyncHwId(android.hardware.tv.tuner.IFilter filter) throws android.os.RemoteException;
  public long getAvSyncTime(int avSyncHwId) throws android.os.RemoteException;
  public void close() throws android.os.RemoteException;
  public android.hardware.tv.tuner.IDvr openDvr(byte type, int bufferSize, android.hardware.tv.tuner.IDvrCallback cb) throws android.os.RemoteException;
  public void connectCiCam(int ciCamId) throws android.os.RemoteException;
  public void disconnectCiCam() throws android.os.RemoteException;
}
