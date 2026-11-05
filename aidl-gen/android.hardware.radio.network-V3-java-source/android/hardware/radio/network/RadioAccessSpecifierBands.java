/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.radio.network-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3/android/hardware/radio/network/RadioAccessSpecifierBands.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public final class RadioAccessSpecifierBands implements android.os.Parcelable {
  // tags for union fields
  public final static int noinit = 0;  // boolean noinit;
  public final static int geranBands = 1;  // android.hardware.radio.network.GeranBands[] geranBands;
  public final static int utranBands = 2;  // android.hardware.radio.network.UtranBands[] utranBands;
  public final static int eutranBands = 3;  // android.hardware.radio.network.EutranBands[] eutranBands;
  public final static int ngranBands = 4;  // android.hardware.radio.network.NgranBands[] ngranBands;

  private int _tag;
  private Object _value;

  public RadioAccessSpecifierBands() {
    boolean _value = false;
    this._tag = noinit;
    this._value = _value;
  }

  private RadioAccessSpecifierBands(android.os.Parcel _aidl_parcel) {
    readFromParcel(_aidl_parcel);
  }

  private RadioAccessSpecifierBands(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }

  public int getTag() {
    return _tag;
  }

  // boolean noinit;

  public static RadioAccessSpecifierBands noinit(boolean _value) {
    return new RadioAccessSpecifierBands(noinit, _value);
  }

  public boolean getNoinit() {
    _assertTag(noinit);
    return (boolean) _value;
  }

  public void setNoinit(boolean _value) {
    _set(noinit, _value);
  }

  // android.hardware.radio.network.GeranBands[] geranBands;

  public static RadioAccessSpecifierBands geranBands(int[] _value) {
    return new RadioAccessSpecifierBands(geranBands, _value);
  }

  public int[] getGeranBands() {
    _assertTag(geranBands);
    return (int[]) _value;
  }

  public void setGeranBands(int[] _value) {
    _set(geranBands, _value);
  }

  // android.hardware.radio.network.UtranBands[] utranBands;

  public static RadioAccessSpecifierBands utranBands(int[] _value) {
    return new RadioAccessSpecifierBands(utranBands, _value);
  }

  public int[] getUtranBands() {
    _assertTag(utranBands);
    return (int[]) _value;
  }

  public void setUtranBands(int[] _value) {
    _set(utranBands, _value);
  }

  // android.hardware.radio.network.EutranBands[] eutranBands;

  public static RadioAccessSpecifierBands eutranBands(int[] _value) {
    return new RadioAccessSpecifierBands(eutranBands, _value);
  }

  public int[] getEutranBands() {
    _assertTag(eutranBands);
    return (int[]) _value;
  }

  public void setEutranBands(int[] _value) {
    _set(eutranBands, _value);
  }

  // android.hardware.radio.network.NgranBands[] ngranBands;

  public static RadioAccessSpecifierBands ngranBands(int[] _value) {
    return new RadioAccessSpecifierBands(ngranBands, _value);
  }

  public int[] getNgranBands() {
    _assertTag(ngranBands);
    return (int[]) _value;
  }

  public void setNgranBands(int[] _value) {
    _set(ngranBands, _value);
  }

  @Override
  public final int getStability() {
    return android.os.Parcelable.PARCELABLE_STABILITY_VINTF;
  }

  public static final android.os.Parcelable.Creator<RadioAccessSpecifierBands> CREATOR = new android.os.Parcelable.Creator<RadioAccessSpecifierBands>() {
    @Override
    public RadioAccessSpecifierBands createFromParcel(android.os.Parcel _aidl_source) {
      return new RadioAccessSpecifierBands(_aidl_source);
    }
    @Override
    public RadioAccessSpecifierBands[] newArray(int _aidl_size) {
      return new RadioAccessSpecifierBands[_aidl_size];
    }
  };

  @Override
  public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag) {
    _aidl_parcel.writeInt(_tag);
    switch (_tag) {
    case noinit:
      _aidl_parcel.writeBoolean(getNoinit());
      break;
    case geranBands:
      _aidl_parcel.writeIntArray(getGeranBands());
      break;
    case utranBands:
      _aidl_parcel.writeIntArray(getUtranBands());
      break;
    case eutranBands:
      _aidl_parcel.writeIntArray(getEutranBands());
      break;
    case ngranBands:
      _aidl_parcel.writeIntArray(getNgranBands());
      break;
    }
  }

  public void readFromParcel(android.os.Parcel _aidl_parcel) {
    int _aidl_tag;
    _aidl_tag = _aidl_parcel.readInt();
    switch (_aidl_tag) {
    case noinit: {
      boolean _aidl_value;
      _aidl_value = _aidl_parcel.readBoolean();
      _set(_aidl_tag, _aidl_value);
      return; }
    case geranBands: {
      int[] _aidl_value;
      _aidl_value = _aidl_parcel.createIntArray();
      _set(_aidl_tag, _aidl_value);
      return; }
    case utranBands: {
      int[] _aidl_value;
      _aidl_value = _aidl_parcel.createIntArray();
      _set(_aidl_tag, _aidl_value);
      return; }
    case eutranBands: {
      int[] _aidl_value;
      _aidl_value = _aidl_parcel.createIntArray();
      _set(_aidl_tag, _aidl_value);
      return; }
    case ngranBands: {
      int[] _aidl_value;
      _aidl_value = _aidl_parcel.createIntArray();
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

  @Override
  public String toString() {
    switch (_tag) {
    case noinit: return "RadioAccessSpecifierBands.noinit(" + (getNoinit()) + ")";
    case geranBands: return "RadioAccessSpecifierBands.geranBands(" + (android.hardware.radio.network.GeranBands.$.arrayToString(getGeranBands())) + ")";
    case utranBands: return "RadioAccessSpecifierBands.utranBands(" + (android.hardware.radio.network.UtranBands.$.arrayToString(getUtranBands())) + ")";
    case eutranBands: return "RadioAccessSpecifierBands.eutranBands(" + (android.hardware.radio.network.EutranBands.$.arrayToString(getEutranBands())) + ")";
    case ngranBands: return "RadioAccessSpecifierBands.ngranBands(" + (android.hardware.radio.network.NgranBands.$.arrayToString(getNgranBands())) + ")";
    }
    throw new IllegalStateException("unknown field: " + _tag);
  }
  private void _assertTag(int tag) {
    if (getTag() != tag) {
      throw new IllegalStateException("bad access: " + _tagString(tag) + ", " + _tagString(getTag()) + " is available.");
    }
  }

  private String _tagString(int _tag) {
    switch (_tag) {
    case noinit: return "noinit";
    case geranBands: return "geranBands";
    case utranBands: return "utranBands";
    case eutranBands: return "eutranBands";
    case ngranBands: return "ngranBands";
    }
    throw new IllegalStateException("unknown field: " + _tag);
  }

  private void _set(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }
  public static @interface Tag {
    public static final int noinit = 0;
    public static final int geranBands = 1;
    public static final int utranBands = 2;
    public static final int eutranBands = 3;
    public static final int ngranBands = 4;
  }
}
