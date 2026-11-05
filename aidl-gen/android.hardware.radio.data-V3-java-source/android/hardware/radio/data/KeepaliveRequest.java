/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.radio.data-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/3/android/hardware/radio/data/KeepaliveRequest.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/** @hide */
public class KeepaliveRequest implements android.os.Parcelable
{
  public int type = 0;
  public byte[] sourceAddress;
  public int sourcePort = 0;
  public byte[] destinationAddress;
  public int destinationPort = 0;
  public int maxKeepaliveIntervalMillis = 0;
  public int cid = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<KeepaliveRequest> CREATOR = new android.os.Parcelable.Creator<KeepaliveRequest>() {
    @Override
    public KeepaliveRequest createFromParcel(android.os.Parcel _aidl_source) {
      KeepaliveRequest _aidl_out = new KeepaliveRequest();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public KeepaliveRequest[] newArray(int _aidl_size) {
      return new KeepaliveRequest[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(type);
    _aidl_parcel.writeByteArray(sourceAddress);
    _aidl_parcel.writeInt(sourcePort);
    _aidl_parcel.writeByteArray(destinationAddress);
    _aidl_parcel.writeInt(destinationPort);
    _aidl_parcel.writeInt(maxKeepaliveIntervalMillis);
    _aidl_parcel.writeInt(cid);
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
      type = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sourceAddress = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sourcePort = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      destinationAddress = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      destinationPort = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxKeepaliveIntervalMillis = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cid = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final int TYPE_NATT_IPV4 = 0;
  public static final int TYPE_NATT_IPV6 = 1;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("type: " + (type));
    _aidl_sj.add("sourceAddress: " + (java.util.Arrays.toString(sourceAddress)));
    _aidl_sj.add("sourcePort: " + (sourcePort));
    _aidl_sj.add("destinationAddress: " + (java.util.Arrays.toString(destinationAddress)));
    _aidl_sj.add("destinationPort: " + (destinationPort));
    _aidl_sj.add("maxKeepaliveIntervalMillis: " + (maxKeepaliveIntervalMillis));
    _aidl_sj.add("cid: " + (cid));
    return "KeepaliveRequest" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
