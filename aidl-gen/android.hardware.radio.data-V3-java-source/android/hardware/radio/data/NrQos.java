/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=3 --hash=cd8913a3f9d39f1cc0a5fcf9e90257be94ec38df --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.radio.data-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/3/android/hardware/radio/data/NrQos.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/** @hide */
public class NrQos implements android.os.Parcelable
{
  public int fiveQi = 0;
  public android.hardware.radio.data.QosBandwidth downlink;
  public android.hardware.radio.data.QosBandwidth uplink;
  public byte qfi = 0;
  /** @deprecated use averagingWindowMillis; */
  @Deprecated
  public char averagingWindowMs = '\0';
  public int averagingWindowMillis = -1;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<NrQos> CREATOR = new android.os.Parcelable.Creator<NrQos>() {
    @Override
    public NrQos createFromParcel(android.os.Parcel _aidl_source) {
      NrQos _aidl_out = new NrQos();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public NrQos[] newArray(int _aidl_size) {
      return new NrQos[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(fiveQi);
    _aidl_parcel.writeTypedObject(downlink, _aidl_flag);
    _aidl_parcel.writeTypedObject(uplink, _aidl_flag);
    _aidl_parcel.writeByte(qfi);
    _aidl_parcel.writeInt(((int)averagingWindowMs));
    _aidl_parcel.writeInt(averagingWindowMillis);
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
      fiveQi = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      downlink = _aidl_parcel.readTypedObject(android.hardware.radio.data.QosBandwidth.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      uplink = _aidl_parcel.readTypedObject(android.hardware.radio.data.QosBandwidth.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      qfi = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      averagingWindowMs = (char)_aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      averagingWindowMillis = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final byte FLOW_ID_RANGE_MIN = 1;
  public static final byte FLOW_ID_RANGE_MAX = 63;
  public static final int AVERAGING_WINDOW_UNKNOWN = -1;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("fiveQi: " + (fiveQi));
    _aidl_sj.add("downlink: " + (java.util.Objects.toString(downlink)));
    _aidl_sj.add("uplink: " + (java.util.Objects.toString(uplink)));
    _aidl_sj.add("qfi: " + (qfi));
    _aidl_sj.add("averagingWindowMs: " + (averagingWindowMs));
    _aidl_sj.add("averagingWindowMillis: " + (averagingWindowMillis));
    return "NrQos" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(downlink);
    _mask |= describeContents(uplink);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
