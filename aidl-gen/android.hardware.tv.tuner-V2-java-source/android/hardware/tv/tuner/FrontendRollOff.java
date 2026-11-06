/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=2 --hash=f8d74c149f04e76b6d622db2bd8e465dae24b08c --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/FrontendRollOff.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public final class FrontendRollOff implements android.os.Parcelable {
  // tags for union fields
  public final static int dvbs = 0;  // android.hardware.tv.tuner.FrontendDvbsRolloff dvbs;
  public final static int isdbs = 1;  // android.hardware.tv.tuner.FrontendIsdbsRolloff isdbs;
  public final static int isdbs3 = 2;  // android.hardware.tv.tuner.FrontendIsdbs3Rolloff isdbs3;

  private int _tag;
  private Object _value;

  public FrontendRollOff() {
    int _value = android.hardware.tv.tuner.FrontendDvbsRolloff.UNDEFINED;
    this._tag = dvbs;
    this._value = _value;
  }

  private FrontendRollOff(android.os.Parcel _aidl_parcel) {
    readFromParcel(_aidl_parcel);
  }

  private FrontendRollOff(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }

  public int getTag() {
    return _tag;
  }

  // android.hardware.tv.tuner.FrontendDvbsRolloff dvbs;

  public static FrontendRollOff dvbs(int _value) {
    return new FrontendRollOff(dvbs, _value);
  }

  public int getDvbs() {
    _assertTag(dvbs);
    return (int) _value;
  }

  public void setDvbs(int _value) {
    _set(dvbs, _value);
  }

  // android.hardware.tv.tuner.FrontendIsdbsRolloff isdbs;

  public static FrontendRollOff isdbs(int _value) {
    return new FrontendRollOff(isdbs, _value);
  }

  public int getIsdbs() {
    _assertTag(isdbs);
    return (int) _value;
  }

  public void setIsdbs(int _value) {
    _set(isdbs, _value);
  }

  // android.hardware.tv.tuner.FrontendIsdbs3Rolloff isdbs3;

  public static FrontendRollOff isdbs3(int _value) {
    return new FrontendRollOff(isdbs3, _value);
  }

  public int getIsdbs3() {
    _assertTag(isdbs3);
    return (int) _value;
  }

  public void setIsdbs3(int _value) {
    _set(isdbs3, _value);
  }

  @Override
  public final int getStability() {
    return android.os.Parcelable.PARCELABLE_STABILITY_VINTF;
  }

  public static final android.os.Parcelable.Creator<FrontendRollOff> CREATOR = new android.os.Parcelable.Creator<FrontendRollOff>() {
    @Override
    public FrontendRollOff createFromParcel(android.os.Parcel _aidl_source) {
      return new FrontendRollOff(_aidl_source);
    }
    @Override
    public FrontendRollOff[] newArray(int _aidl_size) {
      return new FrontendRollOff[_aidl_size];
    }
  };

  @Override
  public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag) {
    _aidl_parcel.writeInt(_tag);
    switch (_tag) {
    case dvbs:
      _aidl_parcel.writeInt(getDvbs());
      break;
    case isdbs:
      _aidl_parcel.writeInt(getIsdbs());
      break;
    case isdbs3:
      _aidl_parcel.writeInt(getIsdbs3());
      break;
    }
  }

  public void readFromParcel(android.os.Parcel _aidl_parcel) {
    int _aidl_tag;
    _aidl_tag = _aidl_parcel.readInt();
    switch (_aidl_tag) {
    case dvbs: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    case isdbs: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    case isdbs3: {
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
    case dvbs: return "dvbs";
    case isdbs: return "isdbs";
    case isdbs3: return "isdbs3";
    }
    throw new IllegalStateException("unknown field: " + _tag);
  }

  private void _set(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }
  public static @interface Tag {
    public static final int dvbs = 0;
    public static final int isdbs = 1;
    public static final int isdbs3 = 2;
  }
}
