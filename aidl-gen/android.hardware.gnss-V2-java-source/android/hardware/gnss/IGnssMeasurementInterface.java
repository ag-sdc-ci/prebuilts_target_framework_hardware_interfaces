/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.gnss-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/IGnssMeasurementInterface.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.gnss;
/** @hide */
public interface IGnssMeasurementInterface extends android.os.IInterface
{
  /** Default implementation for IGnssMeasurementInterface. */
  public static class Default implements android.hardware.gnss.IGnssMeasurementInterface
  {
    @Override public void setCallback(android.hardware.gnss.IGnssMeasurementCallback callback, boolean enableFullTracking, boolean enableCorrVecOutputs) throws android.os.RemoteException
    {
    }
    @Override public void close() throws android.os.RemoteException
    {
    }
    @Override public void setCallbackWithOptions(android.hardware.gnss.IGnssMeasurementCallback callback, android.hardware.gnss.IGnssMeasurementInterface.Options options) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssMeasurementInterface
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.gnss.IGnssMeasurementInterface interface,
     * generating a proxy if needed.
     */
    public static android.hardware.gnss.IGnssMeasurementInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.gnss.IGnssMeasurementInterface))) {
        return ((android.hardware.gnss.IGnssMeasurementInterface)iin);
      }
      return new android.hardware.gnss.IGnssMeasurementInterface.Stub.Proxy(obj);
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
        case TRANSACTION_setCallback:
        {
          android.hardware.gnss.IGnssMeasurementCallback _arg0;
          _arg0 = android.hardware.gnss.IGnssMeasurementCallback.Stub.asInterface(data.readStrongBinder());
          boolean _arg1;
          _arg1 = data.readBoolean();
          boolean _arg2;
          _arg2 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setCallback(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_close:
        {
          this.close();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setCallbackWithOptions:
        {
          android.hardware.gnss.IGnssMeasurementCallback _arg0;
          _arg0 = android.hardware.gnss.IGnssMeasurementCallback.Stub.asInterface(data.readStrongBinder());
          android.hardware.gnss.IGnssMeasurementInterface.Options _arg1;
          _arg1 = data.readTypedObject(android.hardware.gnss.IGnssMeasurementInterface.Options.CREATOR);
          data.enforceNoDataAvail();
          this.setCallbackWithOptions(_arg0, _arg1);
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
    private static final class Proxy implements android.hardware.gnss.IGnssMeasurementInterface
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
      @Override public void setCallback(android.hardware.gnss.IGnssMeasurementCallback callback, boolean enableFullTracking, boolean enableCorrVecOutputs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          _data.writeBoolean(enableFullTracking);
          _data.writeBoolean(enableCorrVecOutputs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallback, _data, _reply, 0);
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
      @Override public void setCallbackWithOptions(android.hardware.gnss.IGnssMeasurementCallback callback, android.hardware.gnss.IGnssMeasurementInterface.Options options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          _data.writeTypedObject(options, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallbackWithOptions, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setCallbackWithOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$gnss$IGnssMeasurementInterface".replace('$', '.');
  public void setCallback(android.hardware.gnss.IGnssMeasurementCallback callback, boolean enableFullTracking, boolean enableCorrVecOutputs) throws android.os.RemoteException;
  public void close() throws android.os.RemoteException;
  public void setCallbackWithOptions(android.hardware.gnss.IGnssMeasurementCallback callback, android.hardware.gnss.IGnssMeasurementInterface.Options options) throws android.os.RemoteException;
  public static class Options implements android.os.Parcelable
  {
    public boolean enableFullTracking = false;
    public boolean enableCorrVecOutputs = false;
    public int intervalMs = 0;
    @Override
     public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
    public static final android.os.Parcelable.Creator<Options> CREATOR = new android.os.Parcelable.Creator<Options>() {
      @Override
      public Options createFromParcel(android.os.Parcel _aidl_source) {
        Options _aidl_out = new Options();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public Options[] newArray(int _aidl_size) {
        return new Options[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeBoolean(enableFullTracking);
      _aidl_parcel.writeBoolean(enableCorrVecOutputs);
      _aidl_parcel.writeInt(intervalMs);
      int _aidl_end_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.setDataPosition(_aidl_start_pos);
      _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
      _aidl_parcel.setDataPosition(_aidl_end_pos);
    }
    public final void readFromParcel(android.os.Parcel _aidl_parcel)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      int _aidl_parcelable_size = _aidl_parcel.readInt();
      try {
        if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        enableFullTracking = _aidl_parcel.readBoolean();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        enableCorrVecOutputs = _aidl_parcel.readBoolean();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        intervalMs = _aidl_parcel.readInt();
      } finally {
        if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
          throw new android.os.BadParcelableException("Overflow in the size of parcelable");
        }
        _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
      }
    }
    @Override
    public int describeContents() {
      int _mask = 0;
      return _mask;
    }
  }
}
