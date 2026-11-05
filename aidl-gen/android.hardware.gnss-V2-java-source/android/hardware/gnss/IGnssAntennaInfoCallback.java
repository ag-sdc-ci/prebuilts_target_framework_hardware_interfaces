/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.gnss-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/IGnssAntennaInfoCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.gnss;
/** @hide */
public interface IGnssAntennaInfoCallback extends android.os.IInterface
{
  /** Default implementation for IGnssAntennaInfoCallback. */
  public static class Default implements android.hardware.gnss.IGnssAntennaInfoCallback
  {
    @Override public void gnssAntennaInfoCb(android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo[] gnssAntennaInfos) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssAntennaInfoCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.gnss.IGnssAntennaInfoCallback interface,
     * generating a proxy if needed.
     */
    public static android.hardware.gnss.IGnssAntennaInfoCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.gnss.IGnssAntennaInfoCallback))) {
        return ((android.hardware.gnss.IGnssAntennaInfoCallback)iin);
      }
      return new android.hardware.gnss.IGnssAntennaInfoCallback.Stub.Proxy(obj);
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
        case TRANSACTION_gnssAntennaInfoCb:
        {
          android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo[] _arg0;
          _arg0 = data.createTypedArray(android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo.CREATOR);
          data.enforceNoDataAvail();
          this.gnssAntennaInfoCb(_arg0);
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
    private static final class Proxy implements android.hardware.gnss.IGnssAntennaInfoCallback
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
      @Override public void gnssAntennaInfoCb(android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo[] gnssAntennaInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(gnssAntennaInfos, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_gnssAntennaInfoCb, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_gnssAntennaInfoCb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$gnss$IGnssAntennaInfoCallback".replace('$', '.');
  public void gnssAntennaInfoCb(android.hardware.gnss.IGnssAntennaInfoCallback.GnssAntennaInfo[] gnssAntennaInfos) throws android.os.RemoteException;
  public static class Row implements android.os.Parcelable
  {
    public double[] row;
    @Override
     public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
    public static final android.os.Parcelable.Creator<Row> CREATOR = new android.os.Parcelable.Creator<Row>() {
      @Override
      public Row createFromParcel(android.os.Parcel _aidl_source) {
        Row _aidl_out = new Row();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public Row[] newArray(int _aidl_size) {
        return new Row[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeDoubleArray(row);
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
        row = _aidl_parcel.createDoubleArray();
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
  public static class Coord implements android.os.Parcelable
  {
    public double x = 0.000000;
    public double xUncertainty = 0.000000;
    public double y = 0.000000;
    public double yUncertainty = 0.000000;
    public double z = 0.000000;
    public double zUncertainty = 0.000000;
    @Override
     public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
    public static final android.os.Parcelable.Creator<Coord> CREATOR = new android.os.Parcelable.Creator<Coord>() {
      @Override
      public Coord createFromParcel(android.os.Parcel _aidl_source) {
        Coord _aidl_out = new Coord();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public Coord[] newArray(int _aidl_size) {
        return new Coord[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeDouble(x);
      _aidl_parcel.writeDouble(xUncertainty);
      _aidl_parcel.writeDouble(y);
      _aidl_parcel.writeDouble(yUncertainty);
      _aidl_parcel.writeDouble(z);
      _aidl_parcel.writeDouble(zUncertainty);
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
        x = _aidl_parcel.readDouble();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        xUncertainty = _aidl_parcel.readDouble();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        y = _aidl_parcel.readDouble();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        yUncertainty = _aidl_parcel.readDouble();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        z = _aidl_parcel.readDouble();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        zUncertainty = _aidl_parcel.readDouble();
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
  public static class GnssAntennaInfo implements android.os.Parcelable
  {
    public long carrierFrequencyHz = 0L;
    public android.hardware.gnss.IGnssAntennaInfoCallback.Coord phaseCenterOffsetCoordinateMillimeters;
    public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] phaseCenterVariationCorrectionMillimeters;
    public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] phaseCenterVariationCorrectionUncertaintyMillimeters;
    public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] signalGainCorrectionDbi;
    public android.hardware.gnss.IGnssAntennaInfoCallback.Row[] signalGainCorrectionUncertaintyDbi;
    @Override
     public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
    public static final android.os.Parcelable.Creator<GnssAntennaInfo> CREATOR = new android.os.Parcelable.Creator<GnssAntennaInfo>() {
      @Override
      public GnssAntennaInfo createFromParcel(android.os.Parcel _aidl_source) {
        GnssAntennaInfo _aidl_out = new GnssAntennaInfo();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public GnssAntennaInfo[] newArray(int _aidl_size) {
        return new GnssAntennaInfo[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeLong(carrierFrequencyHz);
      _aidl_parcel.writeTypedObject(phaseCenterOffsetCoordinateMillimeters, _aidl_flag);
      _aidl_parcel.writeTypedArray(phaseCenterVariationCorrectionMillimeters, _aidl_flag);
      _aidl_parcel.writeTypedArray(phaseCenterVariationCorrectionUncertaintyMillimeters, _aidl_flag);
      _aidl_parcel.writeTypedArray(signalGainCorrectionDbi, _aidl_flag);
      _aidl_parcel.writeTypedArray(signalGainCorrectionUncertaintyDbi, _aidl_flag);
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
        carrierFrequencyHz = _aidl_parcel.readLong();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        phaseCenterOffsetCoordinateMillimeters = _aidl_parcel.readTypedObject(android.hardware.gnss.IGnssAntennaInfoCallback.Coord.CREATOR);
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        phaseCenterVariationCorrectionMillimeters = _aidl_parcel.createTypedArray(android.hardware.gnss.IGnssAntennaInfoCallback.Row.CREATOR);
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        phaseCenterVariationCorrectionUncertaintyMillimeters = _aidl_parcel.createTypedArray(android.hardware.gnss.IGnssAntennaInfoCallback.Row.CREATOR);
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        signalGainCorrectionDbi = _aidl_parcel.createTypedArray(android.hardware.gnss.IGnssAntennaInfoCallback.Row.CREATOR);
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        signalGainCorrectionUncertaintyDbi = _aidl_parcel.createTypedArray(android.hardware.gnss.IGnssAntennaInfoCallback.Row.CREATOR);
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
      _mask |= describeContents(phaseCenterOffsetCoordinateMillimeters);
      _mask |= describeContents(phaseCenterVariationCorrectionMillimeters);
      _mask |= describeContents(phaseCenterVariationCorrectionUncertaintyMillimeters);
      _mask |= describeContents(signalGainCorrectionDbi);
      _mask |= describeContents(signalGainCorrectionUncertaintyDbi);
      return _mask;
    }
    private int describeContents(Object _v) {
      if (_v == null) return 0;
      if (_v instanceof Object[]) {
        int _mask = 0;
        for (Object o : (Object[]) _v) {
          _mask |= describeContents(o);
        }
        return _mask;
      }
      if (_v instanceof android.os.Parcelable) {
        return ((android.os.Parcelable) _v).describeContents();
      }
      return 0;
    }
  }
}
