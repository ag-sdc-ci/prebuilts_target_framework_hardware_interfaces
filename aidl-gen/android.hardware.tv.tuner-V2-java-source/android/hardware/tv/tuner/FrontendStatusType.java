/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=2 --hash=f8d74c149f04e76b6d622db2bd8e465dae24b08c --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/FrontendStatusType.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public @interface FrontendStatusType {
  public static final int DEMOD_LOCK = 0;
  public static final int SNR = 1;
  public static final int BER = 2;
  public static final int PER = 3;
  public static final int PRE_BER = 4;
  public static final int SIGNAL_QUALITY = 5;
  public static final int SIGNAL_STRENGTH = 6;
  public static final int SYMBOL_RATE = 7;
  public static final int FEC = 8;
  public static final int MODULATION = 9;
  public static final int SPECTRAL = 10;
  public static final int LNB_VOLTAGE = 11;
  public static final int PLP_ID = 12;
  public static final int EWBS = 13;
  public static final int AGC = 14;
  public static final int LNA = 15;
  public static final int LAYER_ERROR = 16;
  public static final int MER = 17;
  public static final int FREQ_OFFSET = 18;
  public static final int HIERARCHY = 19;
  public static final int RF_LOCK = 20;
  public static final int ATSC3_PLP_INFO = 21;
  public static final int MODULATIONS = 22;
  public static final int BERS = 23;
  public static final int CODERATES = 24;
  public static final int BANDWIDTH = 25;
  public static final int GUARD_INTERVAL = 26;
  public static final int TRANSMISSION_MODE = 27;
  public static final int UEC = 28;
  public static final int T2_SYSTEM_ID = 29;
  public static final int INTERLEAVINGS = 30;
  public static final int ISDBT_SEGMENTS = 31;
  public static final int TS_DATA_RATES = 32;
  public static final int ROLL_OFF = 33;
  public static final int IS_MISO = 34;
  public static final int IS_LINEAR = 35;
  public static final int IS_SHORT_FRAMES = 36;
  public static final int ISDBT_MODE = 37;
  public static final int ISDBT_PARTIAL_RECEPTION_FLAG = 38;
  public static final int STREAM_ID_LIST = 39;
  public static final int DVBT_CELL_IDS = 40;
  public static final int ATSC3_ALL_PLP_INFO = 41;
  public static final int IPTV_CONTENT_URL = 42;
  public static final int IPTV_PACKETS_LOST = 43;
  public static final int IPTV_PACKETS_RECEIVED = 44;
  public static final int IPTV_WORST_JITTER_MS = 45;
  public static final int IPTV_AVERAGE_JITTER_MS = 46;
}
