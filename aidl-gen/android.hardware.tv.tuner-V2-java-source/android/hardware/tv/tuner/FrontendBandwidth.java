/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=2 --hash=f8d74c149f04e76b6d622db2bd8e465dae24b08c --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/FrontendBandwidth.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public final class FrontendBandwidth implements android.os.Parcelable {
  // tags for union fields
  public final static int atsc3 = 0;  // android.hardware.tv.tuner.FrontendAtsc3Bandwidth atsc3;
  public final static int dvbc = 1;  // android.hardware.tv.tuner.FrontendDvbcBandwidth dvbc;
  public final static int dvbt = 2;  // android.hardware.tv.tuner.FrontendDvbtBandwidth dvbt;
  public final static int isdbt = 3;  // android.hardware.tv.tuner.FrontendIsdbtBandwidth isdbt;
  public final static int dtmb = 4;  // android.hardware.tv.tuner.FrontendDtmbBandwidth dtmb;

  private int _tag;
  private Object _value;

  public FrontendBandwidth() {
    int _value = android.hardware.tv.tuner.FrontendAtsc3Bandwidth.UNDEFINED;
    this._tag = atsc3;
    this._value = _value;
  }

  private FrontendBandwidth(android.os.Parcel _aidl_parcel) {
    readFromParcel(_aidl_parcel);
  }

  private FrontendBandwidth(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }

  public int getTag() {
    return _tag;
  }

  // android.hardware.tv.tuner.FrontendAtsc3Bandwidth atsc3;

  public static FrontendBandwidth atsc3(int _value) {
    return new FrontendBandwidth(atsc3, _value);
  }

  public int getAtsc3() {
    _assertTag(atsc3);
    return (int) _value;
  }

  public void setAtsc3(int _value) {
    _set(atsc3, _value);
  }

  // android.hardware.tv.tuner.FrontendDvbcBandwidth dvbc;

  public static FrontendBandwidth dvbc(int _value) {
    return new FrontendBandwidth(dvbc, _value);
  }

  public int getDvbc() {
    _assertTag(dvbc);
    return (int) _value;
  }

  public void setDvbc(int _value) {
    _set(dvbc, _value);
  }

  // android.hardware.tv.tuner.FrontendDvbtBandwidth dvbt;

  public static FrontendBandwidth dvbt(int _value) {
    return new FrontendBandwidth(dvbt, _value);
  }

  public int getDvbt() {
    _assertTag(dvbt);
    return (int) _value;
  }

  public void setDvbt(int _value) {
    _set(dvbt, _value);
  }

  // android.hardware.tv.tuner.FrontendIsdbtBandwidth isdbt;

  public static FrontendBandwidth isdbt(int _value) {
    return new FrontendBandwidth(isdbt, _value);
  }

  public int getIsdbt() {
    _assertTag(isdbt);
    return (int) _value;
  }

  public void setIsdbt(int _value) {
    _set(isdbt, _value);
  }

  // android.hardware.tv.tuner.FrontendDtmbBandwidth dtmb;

  public static FrontendBandwidth dtmb(int _value) {
    return new FrontendBandwidth(dtmb, _value);
  }

  public int getDtmb() {
    _assertTag(dtmb);
    return (int) _value;
  }

  public void setDtmb(int _value) {
    _set(dtmb, _value);
  }

  @Override
  public final int getStability() {
    return android.os.Parcelable.PARCELABLE_STABILITY_VINTF;
  }

  public static final android.os.Parcelable.Creator<FrontendBandwidth> CREATOR = new android.os.Parcelable.Creator<FrontendBandwidth>() {
    @Override
    public FrontendBandwidth createFromParcel(android.os.Parcel _aidl_source) {
      return new FrontendBandwidth(_aidl_source);
    }
    @Override
    public FrontendBandwidth[] newArray(int _aidl_size) {
      return new FrontendBandwidth[_aidl_size];
    }
  };

  @Override
  public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag) {
    _aidl_parcel.writeInt(_tag);
    switch (_tag) {
    case atsc3:
      _aidl_parcel.writeInt(getAtsc3());
      break;
    case dvbc:
      _aidl_parcel.writeInt(getDvbc());
      break;
    case dvbt:
      _aidl_parcel.writeInt(getDvbt());
      break;
    case isdbt:
      _aidl_parcel.writeInt(getIsdbt());
      break;
    case dtmb:
      _aidl_parcel.writeInt(getDtmb());
      break;
    }
  }

  public void readFromParcel(android.os.Parcel _aidl_parcel) {
    int _aidl_tag;
    _aidl_tag = _aidl_parcel.readInt();
    switch (_aidl_tag) {
    case atsc3: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    case dvbc: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    case dvbt: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    case isdbt: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    case dtmb: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    }
    throw new IllegalArgumentException("union: unknown tag: " + _aidl_tag);
  }

  @Override
  public int describeContents() {
    int _mask = 0;
    switch (getTag()) {
    }
    return _mask;
  }

  private void _assertTag(int tag) {
    if (getTag() != tag) {
      throw new IllegalStateException("bad access: " + _tagString(tag) + ", " + _tagString(getTag()) + " is available.");
    }
  }

  private String _tagString(int _tag) {
    switch (_tag) {
    case atsc3: return "atsc3";
    case dvbc: return "dvbc";
    case dvbt: return "dvbt";
    case isdbt: return "isdbt";
    case dtmb: return "dtmb";
    }
    throw new IllegalStateException("unknown field: " + _tag);
  }

  private void _set(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }
  public static @interface Tag {
    public static final int atsc3 = 0;
    public static final int dvbc = 1;
    public static final int dvbt = 2;
    public static final int isdbt = 3;
    public static final int dtmb = 4;
  }
}
