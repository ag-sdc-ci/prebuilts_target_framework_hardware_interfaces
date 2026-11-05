/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/DemuxIpAddressIpAddress.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public final class DemuxIpAddressIpAddress implements android.os.Parcelable {
  // tags for union fields
  public final static int v4 = 0;  // byte[] v4;
  public final static int v6 = 1;  // byte[] v6;

  private int _tag;
  private Object _value;

  public DemuxIpAddressIpAddress() {
    byte[] _value = {};
    this._tag = v4;
    this._value = _value;
  }

  private DemuxIpAddressIpAddress(android.os.Parcel _aidl_parcel) {
    readFromParcel(_aidl_parcel);
  }

  private DemuxIpAddressIpAddress(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }

  public int getTag() {
    return _tag;
  }

  // byte[] v4;

  public static DemuxIpAddressIpAddress v4(byte[] _value) {
    return new DemuxIpAddressIpAddress(v4, _value);
  }

  public byte[] getV4() {
    _assertTag(v4);
    return (byte[]) _value;
  }

  public void setV4(byte[] _value) {
    _set(v4, _value);
  }

  // byte[] v6;

  public static DemuxIpAddressIpAddress v6(byte[] _value) {
    return new DemuxIpAddressIpAddress(v6, _value);
  }

  public byte[] getV6() {
    _assertTag(v6);
    return (byte[]) _value;
  }

  public void setV6(byte[] _value) {
    _set(v6, _value);
  }

  @Override
  public final int getStability() {
    return android.os.Parcelable.PARCELABLE_STABILITY_VINTF;
  }

  public static final android.os.Parcelable.Creator<DemuxIpAddressIpAddress> CREATOR = new android.os.Parcelable.Creator<DemuxIpAddressIpAddress>() {
    @Override
    public DemuxIpAddressIpAddress createFromParcel(android.os.Parcel _aidl_source) {
      return new DemuxIpAddressIpAddress(_aidl_source);
    }
    @Override
    public DemuxIpAddressIpAddress[] newArray(int _aidl_size) {
      return new DemuxIpAddressIpAddress[_aidl_size];
    }
  };

  @Override
  public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag) {
    _aidl_parcel.writeInt(_tag);
    switch (_tag) {
    case v4:
      _aidl_parcel.writeByteArray(getV4());
      break;
    case v6:
      _aidl_parcel.writeByteArray(getV6());
      break;
    }
  }

  public void readFromParcel(android.os.Parcel _aidl_parcel) {
    int _aidl_tag;
    _aidl_tag = _aidl_parcel.readInt();
    switch (_aidl_tag) {
    case v4: {
      byte[] _aidl_value;
      _aidl_value = _aidl_parcel.createByteArray();
      _set(_aidl_tag, _aidl_value);
      return; }
    case v6: {
      byte[] _aidl_value;
      _aidl_value = _aidl_parcel.createByteArray();
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
    case v4: return "v4";
    case v6: return "v6";
    }
    throw new IllegalStateException("unknown field: " + _tag);
  }

  private void _set(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }
  public static @interface Tag {
    public static final int v4 = 0;
    public static final int v6 = 1;
  }
}
