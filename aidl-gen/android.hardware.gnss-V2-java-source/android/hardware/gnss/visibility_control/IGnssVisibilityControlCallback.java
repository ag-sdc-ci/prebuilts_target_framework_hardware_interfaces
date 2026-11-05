/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.gnss-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/visibility_control/IGnssVisibilityControlCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.gnss.visibility_control;
/** @hide */
public interface IGnssVisibilityControlCallback extends android.os.IInterface
{
  /** Default implementation for IGnssVisibilityControlCallback. */
  public static class Default implements android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback
  {
    @Override public void nfwNotifyCb(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification notification) throws android.os.RemoteException
    {
    }
    @Override public boolean isInEmergencySession() throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback interface,
     * generating a proxy if needed.
     */
    public static android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback))) {
        return ((android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback)iin);
      }
      return new android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.Stub.Proxy(obj);
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
        case TRANSACTION_nfwNotifyCb:
        {
          android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification _arg0;
          _arg0 = data.readTypedObject(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification.CREATOR);
          data.enforceNoDataAvail();
          this.nfwNotifyCb(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_isInEmergencySession:
        {
          boolean _result = this.isInEmergencySession();
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
    private static final class Proxy implements android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback
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
      @Override public void nfwNotifyCb(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification notification) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(notification, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_nfwNotifyCb, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean isInEmergencySession() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isInEmergencySession, _data, _reply, 0);
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
    static final int TRANSACTION_nfwNotifyCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_isInEmergencySession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$gnss$visibility_control$IGnssVisibilityControlCallback".replace('$', '.');
  public void nfwNotifyCb(android.hardware.gnss.visibility_control.IGnssVisibilityControlCallback.NfwNotification notification) throws android.os.RemoteException;
  public boolean isInEmergencySession() throws android.os.RemoteException;
  public static @interface NfwProtocolStack {
    public static final int CTRL_PLANE = 0;
    public static final int SUPL = 1;
    public static final int IMS = 10;
    public static final int SIM = 11;
    public static final int OTHER_PROTOCOL_STACK = 100;
  }
  public static @interface NfwRequestor {
    public static final int CARRIER = 0;
    public static final int OEM = 10;
    public static final int MODEM_CHIPSET_VENDOR = 11;
    public static final int GNSS_CHIPSET_VENDOR = 12;
    public static final int OTHER_CHIPSET_VENDOR = 13;
    public static final int AUTOMOBILE_CLIENT = 20;
    public static final int OTHER_REQUESTOR = 100;
  }
  public static @interface NfwResponseType {
    public static final int REJECTED = 0;
    public static final int ACCEPTED_NO_LOCATION_PROVIDED = 1;
    public static final int ACCEPTED_LOCATION_PROVIDED = 2;
  }
  public static class NfwNotification implements android.os.Parcelable
  {
    public java.lang.String proxyAppPackageName;
    public int protocolStack;
    public java.lang.String otherProtocolStackName;
    public int requestor;
    public java.lang.String requestorId;
    public int responseType;
    public boolean inEmergencyMode = false;
    public boolean isCachedLocation = false;
    @Override
     public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
    public static final android.os.Parcelable.Creator<NfwNotification> CREATOR = new android.os.Parcelable.Creator<NfwNotification>() {
      @Override
      public NfwNotification createFromParcel(android.os.Parcel _aidl_source) {
        NfwNotification _aidl_out = new NfwNotification();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public NfwNotification[] newArray(int _aidl_size) {
        return new NfwNotification[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeString(proxyAppPackageName);
      _aidl_parcel.writeInt(protocolStack);
      _aidl_parcel.writeString(otherProtocolStackName);
      _aidl_parcel.writeInt(requestor);
      _aidl_parcel.writeString(requestorId);
      _aidl_parcel.writeInt(responseType);
      _aidl_parcel.writeBoolean(inEmergencyMode);
      _aidl_parcel.writeBoolean(isCachedLocation);
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
        proxyAppPackageName = _aidl_parcel.readString();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        protocolStack = _aidl_parcel.readInt();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        otherProtocolStackName = _aidl_parcel.readString();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        requestor = _aidl_parcel.readInt();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        requestorId = _aidl_parcel.readString();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        responseType = _aidl_parcel.readInt();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        inEmergencyMode = _aidl_parcel.readBoolean();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        isCachedLocation = _aidl_parcel.readBoolean();
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
