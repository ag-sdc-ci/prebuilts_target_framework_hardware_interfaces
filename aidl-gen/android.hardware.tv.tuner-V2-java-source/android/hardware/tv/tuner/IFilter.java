/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/IFilter.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public interface IFilter extends android.os.IInterface
{
  /** Default implementation for IFilter. */
  public static class Default implements android.hardware.tv.tuner.IFilter
  {
    @Override public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<Byte,Byte> queue) throws android.os.RemoteException
    {
    }
    @Override public void close() throws android.os.RemoteException
    {
    }
    @Override public void configure(android.hardware.tv.tuner.DemuxFilterSettings settings) throws android.os.RemoteException
    {
    }
    @Override public void configureAvStreamType(android.hardware.tv.tuner.AvStreamType avStreamType) throws android.os.RemoteException
    {
    }
    @Override public void configureIpCid(int ipCid) throws android.os.RemoteException
    {
    }
    @Override public void configureMonitorEvent(int monitorEventTypes) throws android.os.RemoteException
    {
    }
    @Override public void start() throws android.os.RemoteException
    {
    }
    @Override public void stop() throws android.os.RemoteException
    {
    }
    @Override public void flush() throws android.os.RemoteException
    {
    }
    @Override public long getAvSharedHandle(android.hardware.common.NativeHandle avMemory) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public int getId() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public long getId64Bit() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public void releaseAvHandle(android.hardware.common.NativeHandle avMemory, long avDataId) throws android.os.RemoteException
    {
    }
    @Override public void setDataSource(android.hardware.tv.tuner.IFilter filter) throws android.os.RemoteException
    {
    }
    @Override public void setDelayHint(android.hardware.tv.tuner.FilterDelayHint hint) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IFilter
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.tv.tuner.IFilter interface,
     * generating a proxy if needed.
     */
    public static android.hardware.tv.tuner.IFilter asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.tv.tuner.IFilter))) {
        return ((android.hardware.tv.tuner.IFilter)iin);
      }
      return new android.hardware.tv.tuner.IFilter.Stub.Proxy(obj);
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
        case TRANSACTION_getQueueDesc:
        {
          android.hardware.common.fmq.MQDescriptor<Byte,Byte> _arg0;
          _arg0 = new android.hardware.common.fmq.MQDescriptor<Byte,Byte>();
          data.enforceNoDataAvail();
          this.getQueueDesc(_arg0);
          reply.writeNoException();
          reply.writeTypedObject(_arg0, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_close:
        {
          this.close();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_configure:
        {
          android.hardware.tv.tuner.DemuxFilterSettings _arg0;
          _arg0 = data.readTypedObject(android.hardware.tv.tuner.DemuxFilterSettings.CREATOR);
          data.enforceNoDataAvail();
          this.configure(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_configureAvStreamType:
        {
          android.hardware.tv.tuner.AvStreamType _arg0;
          _arg0 = data.readTypedObject(android.hardware.tv.tuner.AvStreamType.CREATOR);
          data.enforceNoDataAvail();
          this.configureAvStreamType(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_configureIpCid:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.configureIpCid(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_configureMonitorEvent:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.configureMonitorEvent(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_start:
        {
          this.start();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stop:
        {
          this.stop();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_flush:
        {
          this.flush();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getAvSharedHandle:
        {
          android.hardware.common.NativeHandle _arg0;
          _arg0 = new android.hardware.common.NativeHandle();
          data.enforceNoDataAvail();
          long _result = this.getAvSharedHandle(_arg0);
          reply.writeNoException();
          reply.writeLong(_result);
          reply.writeTypedObject(_arg0, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getId:
        {
          int _result = this.getId();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getId64Bit:
        {
          long _result = this.getId64Bit();
          reply.writeNoException();
          reply.writeLong(_result);
          break;
        }
        case TRANSACTION_releaseAvHandle:
        {
          android.hardware.common.NativeHandle _arg0;
          _arg0 = data.readTypedObject(android.hardware.common.NativeHandle.CREATOR);
          long _arg1;
          _arg1 = data.readLong();
          data.enforceNoDataAvail();
          this.releaseAvHandle(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setDataSource:
        {
          android.hardware.tv.tuner.IFilter _arg0;
          _arg0 = android.hardware.tv.tuner.IFilter.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setDataSource(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setDelayHint:
        {
          android.hardware.tv.tuner.FilterDelayHint _arg0;
          _arg0 = data.readTypedObject(android.hardware.tv.tuner.FilterDelayHint.CREATOR);
          data.enforceNoDataAvail();
          this.setDelayHint(_arg0);
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
    private static final class Proxy implements android.hardware.tv.tuner.IFilter
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
      @Override public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<Byte,Byte> queue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueueDesc, _data, _reply, 0);
          _reply.readException();
          if ((0!=_reply.readInt())) {
            queue.readFromParcel(_reply);
          }
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
      @Override public void configure(android.hardware.tv.tuner.DemuxFilterSettings settings) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(settings, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_configure, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void configureAvStreamType(android.hardware.tv.tuner.AvStreamType avStreamType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(avStreamType, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_configureAvStreamType, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void configureIpCid(int ipCid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(ipCid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_configureIpCid, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void configureMonitorEvent(int monitorEventTypes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(monitorEventTypes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_configureMonitorEvent, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void start() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_start, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void stop() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void flush() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_flush, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public long getAvSharedHandle(android.hardware.common.NativeHandle avMemory) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvSharedHandle, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
          if ((0!=_reply.readInt())) {
            avMemory.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getId, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getId64Bit() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getId64Bit, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void releaseAvHandle(android.hardware.common.NativeHandle avMemory, long avDataId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(avMemory, 0);
          _data.writeLong(avDataId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_releaseAvHandle, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDataSource(android.hardware.tv.tuner.IFilter filter) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(filter);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataSource, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDelayHint(android.hardware.tv.tuner.FilterDelayHint hint) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(hint, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDelayHint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_getQueueDesc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_configure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_configureAvStreamType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_configureIpCid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_configureMonitorEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_flush = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getAvSharedHandle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getId64Bit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_releaseAvHandle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_setDataSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setDelayHint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$tv$tuner$IFilter".replace('$', '.');
  public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<Byte,Byte> queue) throws android.os.RemoteException;
  public void close() throws android.os.RemoteException;
  public void configure(android.hardware.tv.tuner.DemuxFilterSettings settings) throws android.os.RemoteException;
  public void configureAvStreamType(android.hardware.tv.tuner.AvStreamType avStreamType) throws android.os.RemoteException;
  public void configureIpCid(int ipCid) throws android.os.RemoteException;
  public void configureMonitorEvent(int monitorEventTypes) throws android.os.RemoteException;
  public void start() throws android.os.RemoteException;
  public void stop() throws android.os.RemoteException;
  public void flush() throws android.os.RemoteException;
  public long getAvSharedHandle(android.hardware.common.NativeHandle avMemory) throws android.os.RemoteException;
  public int getId() throws android.os.RemoteException;
  public long getId64Bit() throws android.os.RemoteException;
  public void releaseAvHandle(android.hardware.common.NativeHandle avMemory, long avDataId) throws android.os.RemoteException;
  public void setDataSource(android.hardware.tv.tuner.IFilter filter) throws android.os.RemoteException;
  public void setDelayHint(android.hardware.tv.tuner.FilterDelayHint hint) throws android.os.RemoteException;
}
