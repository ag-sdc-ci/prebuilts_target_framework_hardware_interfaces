/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/IDescrambler.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public interface IDescrambler extends android.os.IInterface
{
  /** Default implementation for IDescrambler. */
  public static class Default implements android.hardware.tv.tuner.IDescrambler
  {
    @Override public void setDemuxSource(int demuxId) throws android.os.RemoteException
    {
    }
    @Override public void setKeyToken(byte[] keyToken) throws android.os.RemoteException
    {
    }
    @Override public void addPid(android.hardware.tv.tuner.DemuxPid pid, android.hardware.tv.tuner.IFilter optionalSourceFilter) throws android.os.RemoteException
    {
    }
    @Override public void removePid(android.hardware.tv.tuner.DemuxPid pid, android.hardware.tv.tuner.IFilter optionalSourceFilter) throws android.os.RemoteException
    {
    }
    @Override public void close() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IDescrambler
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.tv.tuner.IDescrambler interface,
     * generating a proxy if needed.
     */
    public static android.hardware.tv.tuner.IDescrambler asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.tv.tuner.IDescrambler))) {
        return ((android.hardware.tv.tuner.IDescrambler)iin);
      }
      return new android.hardware.tv.tuner.IDescrambler.Stub.Proxy(obj);
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
        case TRANSACTION_setDemuxSource:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setDemuxSource(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setKeyToken:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          data.enforceNoDataAvail();
          this.setKeyToken(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addPid:
        {
          android.hardware.tv.tuner.DemuxPid _arg0;
          _arg0 = data.readTypedObject(android.hardware.tv.tuner.DemuxPid.CREATOR);
          android.hardware.tv.tuner.IFilter _arg1;
          _arg1 = android.hardware.tv.tuner.IFilter.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.addPid(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removePid:
        {
          android.hardware.tv.tuner.DemuxPid _arg0;
          _arg0 = data.readTypedObject(android.hardware.tv.tuner.DemuxPid.CREATOR);
          android.hardware.tv.tuner.IFilter _arg1;
          _arg1 = android.hardware.tv.tuner.IFilter.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.removePid(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_close:
        {
          this.close();
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
    private static final class Proxy implements android.hardware.tv.tuner.IDescrambler
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
      @Override public void setDemuxSource(int demuxId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(demuxId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDemuxSource, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setKeyToken(byte[] keyToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(keyToken);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setKeyToken, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void addPid(android.hardware.tv.tuner.DemuxPid pid, android.hardware.tv.tuner.IFilter optionalSourceFilter) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(pid, 0);
          _data.writeStrongInterface(optionalSourceFilter);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addPid, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removePid(android.hardware.tv.tuner.DemuxPid pid, android.hardware.tv.tuner.IFilter optionalSourceFilter) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(pid, 0);
          _data.writeStrongInterface(optionalSourceFilter);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removePid, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
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
    }
    static final int TRANSACTION_setDemuxSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setKeyToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_addPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_removePid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$tv$tuner$IDescrambler".replace('$', '.');
  public void setDemuxSource(int demuxId) throws android.os.RemoteException;
  public void setKeyToken(byte[] keyToken) throws android.os.RemoteException;
  public void addPid(android.hardware.tv.tuner.DemuxPid pid, android.hardware.tv.tuner.IFilter optionalSourceFilter) throws android.os.RemoteException;
  public void removePid(android.hardware.tv.tuner.DemuxPid pid, android.hardware.tv.tuner.IFilter optionalSourceFilter) throws android.os.RemoteException;
  public void close() throws android.os.RemoteException;
}
