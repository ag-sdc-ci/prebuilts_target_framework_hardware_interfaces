/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.gnss-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/IGnssPowerIndicationCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.gnss;
/** @hide */
public interface IGnssPowerIndicationCallback extends android.os.IInterface
{
  /** Default implementation for IGnssPowerIndicationCallback. */
  public static class Default implements android.hardware.gnss.IGnssPowerIndicationCallback
  {
    @Override public void setCapabilitiesCb(int capabilities) throws android.os.RemoteException
    {
    }
    @Override public void gnssPowerStatsCb(android.hardware.gnss.GnssPowerStats gnssPowerStats) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssPowerIndicationCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.gnss.IGnssPowerIndicationCallback interface,
     * generating a proxy if needed.
     */
    public static android.hardware.gnss.IGnssPowerIndicationCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.gnss.IGnssPowerIndicationCallback))) {
        return ((android.hardware.gnss.IGnssPowerIndicationCallback)iin);
      }
      return new android.hardware.gnss.IGnssPowerIndicationCallback.Stub.Proxy(obj);
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
        case TRANSACTION_setCapabilitiesCb:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setCapabilitiesCb(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_gnssPowerStatsCb:
        {
          android.hardware.gnss.GnssPowerStats _arg0;
          _arg0 = data.readTypedObject(android.hardware.gnss.GnssPowerStats.CREATOR);
          data.enforceNoDataAvail();
          this.gnssPowerStatsCb(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.hardware.gnss.IGnssPowerIndicationCallback
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
      @Override public void setCapabilitiesCb(int capabilities) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(capabilities);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCapabilitiesCb, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void gnssPowerStatsCb(android.hardware.gnss.GnssPowerStats gnssPowerStats) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(gnssPowerStats, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_gnssPowerStatsCb, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_setCapabilitiesCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_gnssPowerStatsCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$gnss$IGnssPowerIndicationCallback".replace('$', '.');
  public static final int CAPABILITY_TOTAL = 1;
  public static final int CAPABILITY_SINGLEBAND_TRACKING = 2;
  public static final int CAPABILITY_MULTIBAND_TRACKING = 4;
  public static final int CAPABILITY_SINGLEBAND_ACQUISITION = 8;
  public static final int CAPABILITY_MULTIBAND_ACQUISITION = 16;
  public static final int CAPABILITY_OTHER_MODES = 32;
  public void setCapabilitiesCb(int capabilities) throws android.os.RemoteException;
  public void gnssPowerStatsCb(android.hardware.gnss.GnssPowerStats gnssPowerStats) throws android.os.RemoteException;
}
