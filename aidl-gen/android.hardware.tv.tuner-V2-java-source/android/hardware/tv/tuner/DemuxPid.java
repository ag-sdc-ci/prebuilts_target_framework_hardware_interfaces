/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/DemuxPid.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public final class DemuxPid implements android.os.Parcelable {
  // tags for union fields
  public final static int tPid = 0;  // int tPid;
  public final static int mmtpPid = 1;  // int mmtpPid;

  private int _tag;
  private Object _value;

  public DemuxPid() {
    int _value = 0;
    this._tag = tPid;
    this._value = _value;
  }

  private DemuxPid(android.os.Parcel _aidl_parcel) {
    readFromParcel(_aidl_parcel);
  }

  private DemuxPid(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }

  public int getTag() {
    return _tag;
  }

  // int tPid;

  public static DemuxPid tPid(int _value) {
    return new DemuxPid(tPid, _value);
  }

  public int getTPid() {
    _assertTag(tPid);
    return (int) _value;
  }

  public void setTPid(int _value) {
    _set(tPid, _value);
  }

  // int mmtpPid;

  public static DemuxPid mmtpPid(int _value) {
    return new DemuxPid(mmtpPid, _value);
  }

  public int getMmtpPid() {
    _assertTag(mmtpPid);
    return (int) _value;
  }

  public void setMmtpPid(int _value) {
    _set(mmtpPid, _value);
  }

  @Override
  public final int getStability() {
    return android.os.Parcelable.PARCELABLE_STABILITY_VINTF;
  }

  public static final android.os.Parcelable.Creator<DemuxPid> CREATOR = new android.os.Parcelable.Creator<DemuxPid>() {
    @Override
    public DemuxPid createFromParcel(android.os.Parcel _aidl_source) {
      return new DemuxPid(_aidl_source);
    }
    @Override
    public DemuxPid[] newArray(int _aidl_size) {
      return new DemuxPid[_aidl_size];
    }
  };

  @Override
  public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag) {
    _aidl_parcel.writeInt(_tag);
    switch (_tag) {
    case tPid:
      _aidl_parcel.writeInt(getTPid());
      break;
    case mmtpPid:
      _aidl_parcel.writeInt(getMmtpPid());
      break;
    }
  }

  public void readFromParcel(android.os.Parcel _aidl_parcel) {
    int _aidl_tag;
    _aidl_tag = _aidl_parcel.readInt();
    switch (_aidl_tag) {
    case tPid: {
      int _aidl_value;
      _aidl_value = _aidl_parcel.readInt();
      _set(_aidl_tag, _aidl_value);
      return; }
    case mmtpPid: {
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
    case tPid: return "tPid";
    case mmtpPid: return "mmtpPid";
    }
    throw new IllegalStateException("unknown field: " + _tag);
  }

  private void _set(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }
  public static @interface Tag {
    public static final int tPid = 0;
    public static final int mmtpPid = 1;
  }
}
