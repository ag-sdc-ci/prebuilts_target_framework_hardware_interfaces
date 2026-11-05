/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.radio.data-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/3/android/hardware/radio/data/IRadioDataIndication.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/** @hide */
public interface IRadioDataIndication extends android.os.IInterface
{
  /** Default implementation for IRadioDataIndication. */
  public static class Default implements android.hardware.radio.data.IRadioDataIndication
  {
    @Override public void dataCallListChanged(int type, android.hardware.radio.data.SetupDataCallResult[] dcList) throws android.os.RemoteException
    {
    }
    @Override public void keepaliveStatus(int type, android.hardware.radio.data.KeepaliveStatus status) throws android.os.RemoteException
    {
    }
    @Override public void pcoData(int type, android.hardware.radio.data.PcoDataInfo pco) throws android.os.RemoteException
    {
    }
    @Override public void unthrottleApn(int type, android.hardware.radio.data.DataProfileInfo dataProfileInfo) throws android.os.RemoteException
    {
    }
    @Override public void slicingConfigChanged(int type, android.hardware.radio.data.SlicingConfig slicingConfig) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.data.IRadioDataIndication
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.data.IRadioDataIndication interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.data.IRadioDataIndication asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.data.IRadioDataIndication))) {
        return ((android.hardware.radio.data.IRadioDataIndication)iin);
      }
      return new android.hardware.radio.data.IRadioDataIndication.Stub.Proxy(obj);
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
        case TRANSACTION_dataCallListChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.SetupDataCallResult[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.data.SetupDataCallResult.CREATOR);
          data.enforceNoDataAvail();
          this.dataCallListChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_keepaliveStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.KeepaliveStatus _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.KeepaliveStatus.CREATOR);
          data.enforceNoDataAvail();
          this.keepaliveStatus(_arg0, _arg1);
          break;
        }
        case TRANSACTION_pcoData:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.PcoDataInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.PcoDataInfo.CREATOR);
          data.enforceNoDataAvail();
          this.pcoData(_arg0, _arg1);
          break;
        }
        case TRANSACTION_unthrottleApn:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.DataProfileInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.DataProfileInfo.CREATOR);
          data.enforceNoDataAvail();
          this.unthrottleApn(_arg0, _arg1);
          break;
        }
        case TRANSACTION_slicingConfigChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.SlicingConfig _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.SlicingConfig.CREATOR);
          data.enforceNoDataAvail();
          this.slicingConfigChanged(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.hardware.radio.data.IRadioDataIndication
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
      @Override public void dataCallListChanged(int type, android.hardware.radio.data.SetupDataCallResult[] dcList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedArray(dcList, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataCallListChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void keepaliveStatus(int type, android.hardware.radio.data.KeepaliveStatus status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(status, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_keepaliveStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void pcoData(int type, android.hardware.radio.data.PcoDataInfo pco) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(pco, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_pcoData, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void unthrottleApn(int type, android.hardware.radio.data.DataProfileInfo dataProfileInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(dataProfileInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unthrottleApn, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void slicingConfigChanged(int type, android.hardware.radio.data.SlicingConfig slicingConfig) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(slicingConfig, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_slicingConfigChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_dataCallListChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_keepaliveStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_pcoData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_unthrottleApn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_slicingConfigChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$data$IRadioDataIndication".replace('$', '.');
  public void dataCallListChanged(int type, android.hardware.radio.data.SetupDataCallResult[] dcList) throws android.os.RemoteException;
  public void keepaliveStatus(int type, android.hardware.radio.data.KeepaliveStatus status) throws android.os.RemoteException;
  public void pcoData(int type, android.hardware.radio.data.PcoDataInfo pco) throws android.os.RemoteException;
  public void unthrottleApn(int type, android.hardware.radio.data.DataProfileInfo dataProfileInfo) throws android.os.RemoteException;
  public void slicingConfigChanged(int type, android.hardware.radio.data.SlicingConfig slicingConfig) throws android.os.RemoteException;
}
