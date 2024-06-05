package com.applovin.impl;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class id {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f8522a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap f8523b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static int f8524c = -1;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8525a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8526b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f8527c;

        public b(String str, boolean z10, boolean z11) {
            this.f8525a = str;
            this.f8526b = z10;
            this.f8527c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            if (TextUtils.equals(this.f8525a, bVar.f8525a) && this.f8526b == bVar.f8526b && this.f8527c == bVar.f8527c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = 1231;
            int hashCode = (((this.f8525a.hashCode() + 31) * 31) + (this.f8526b ? 1231 : 1237)) * 31;
            if (!this.f8527c) {
                i10 = 1237;
            }
            return hashCode + i10;
        }
    }

    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private interface d {
        int a();

        MediaCodecInfo a(int i10);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    private static final class e implements d {
        private e() {
        }

        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }

        public int a() {
            return MediaCodecList.getCodecCount();
        }
    }

    private interface g {
        int a(Object obj);
    }

    private static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static Integer a(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = 12;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    private static int b(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static Integer b(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = 9;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            default:
                return null;
        }
    }

    private static int c(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static Pair c(String str, String[] strArr) {
        if (strArr.length < 3) {
            kc.d("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f8522a.matcher(strArr[1]);
        if (!matcher.matches()) {
            kc.d("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer b10 = b(group);
        if (b10 == null) {
            kc.d("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer a10 = a(str2);
        if (a10 != null) {
            return new Pair(b10, a10);
        }
        kc.d("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static int d(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Pair d(String str, String[] strArr) {
        if (strArr.length < 4) {
            kc.d("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f8522a.matcher(strArr[1]);
        if (!matcher.matches()) {
            kc.d("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(group)) {
            if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(group)) {
                i10 = 2;
            } else {
                kc.d("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer c10 = c(str2);
        if (c10 != null) {
            return new Pair(Integer.valueOf(i10), c10);
        }
        kc.d("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static int e(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static Pair e(String str, String[] strArr) {
        if (strArr.length < 3) {
            kc.d("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int g10 = g(parseInt);
            if (g10 == -1) {
                kc.d("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int f10 = f(parseInt2);
            if (f10 != -1) {
                return new Pair(Integer.valueOf(g10), Integer.valueOf(f10));
            }
            kc.d("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            kc.d("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static int f(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static boolean f(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static int g(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (yp.f13662a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return !lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.");
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    private static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f8528a;

        /* renamed from: b  reason: collision with root package name */
        private MediaCodecInfo[] f8529b;

        public f(boolean z10, boolean z11) {
            this.f8528a = (z10 || z11) ? 1 : 0;
        }

        private void c() {
            if (this.f8529b == null) {
                this.f8529b = new MediaCodecList(this.f8528a).getCodecInfos();
            }
        }

        public int a() {
            c();
            return this.f8529b.length;
        }

        public boolean b() {
            return true;
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public MediaCodecInfo a(int i10) {
            c();
            return this.f8529b[i10];
        }

        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    private static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (yp.f13662a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    private static Pair b(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            kc.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = parseInt;
            } else {
                kc.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int d10 = d(i11);
            if (d10 == -1) {
                kc.d("MediaCodecUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int b10 = b(i10);
            if (b10 != -1) {
                return new Pair(Integer.valueOf(d10), Integer.valueOf(b10));
            }
            kc.d("MediaCodecUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            kc.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Integer c(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    private static boolean d(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static Pair a(String str, String[] strArr) {
        int e10;
        if (strArr.length != 3) {
            kc.d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(df.a(Integer.parseInt(strArr[1], 16))) && (e10 = e(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(e10), 0);
            }
        } catch (NumberFormatException unused) {
            kc.d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r8 = r10.f10571c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair a(java.lang.String r8, java.lang.String[] r9, com.applovin.impl.p3 r10) {
        /*
            int r0 = r9.length
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 4
            if (r0 >= r4) goto L_0x001c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.applovin.impl.kc.d(r3, r8)
            return r2
        L_0x001c:
            r0 = 1
            r4 = r9[r0]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00a9 }
            r5 = 2
            r6 = r9[r5]     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 0
            java.lang.String r6 = r6.substring(r7, r5)     // Catch:{ NumberFormatException -> 0x00a9 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 3
            r9 = r9[r7]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x00a9 }
            if (r4 == 0) goto L_0x004d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 profile: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.applovin.impl.kc.d(r3, r8)
            return r2
        L_0x004d:
            r9 = 8
            if (r8 == r9) goto L_0x006a
            r1 = 10
            if (r8 == r1) goto L_0x006a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown AV1 bit depth: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.applovin.impl.kc.d(r3, r8)
            return r2
        L_0x006a:
            if (r8 != r9) goto L_0x006d
            goto L_0x007f
        L_0x006d:
            if (r10 == 0) goto L_0x007e
            byte[] r8 = r10.f10572d
            if (r8 != 0) goto L_0x007b
            int r8 = r10.f10571c
            r9 = 7
            if (r8 == r9) goto L_0x007b
            r9 = 6
            if (r8 != r9) goto L_0x007e
        L_0x007b:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x007f
        L_0x007e:
            r0 = 2
        L_0x007f:
            int r8 = a((int) r6)
            r9 = -1
            if (r8 != r9) goto L_0x009b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 level: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.applovin.impl.kc.d(r3, r8)
            return r2
        L_0x009b:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.<init>(r10, r8)
            return r9
        L_0x00a9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.applovin.impl.kc.d(r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.id.a(java.lang.String, java.lang.String[], com.applovin.impl.p3):android.util.Pair");
    }

    private static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(fd fdVar) {
        return fdVar.f7722a.startsWith("OMX.google") ? 1 : 0;
    }

    public static synchronized List b(String str, boolean z10, boolean z11) {
        d dVar;
        synchronized (id.class) {
            b bVar = new b(str, z10, z11);
            HashMap hashMap = f8523b;
            List list = (List) hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = yp.f13662a;
            if (i10 >= 21) {
                dVar = new f(z10, z11);
            } else {
                dVar = new e();
            }
            ArrayList a10 = a(bVar, dVar);
            if (z10 && a10.isEmpty() && 21 <= i10 && i10 <= 23) {
                a10 = a(bVar, (d) new e());
                if (!a10.isEmpty()) {
                    kc.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((fd) a10.get(0)).f7722a);
                }
            }
            a(str, (List) a10);
            List unmodifiableList = Collections.unmodifiableList(a10);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo) {
        if (yp.f13662a >= 29) {
            return d(mediaCodecInfo);
        }
        return !e(mediaCodecInfo);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair a(com.applovin.impl.d9 r6) {
        /*
            java.lang.String r0 = r6.f7150j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f7153m
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            java.lang.String r6 = r6.f7150j
            android.util.Pair r6 = c(r6, r0)
            return r6
        L_0x001d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x006f;
                case 3006243: goto L_0x0064;
                case 3006244: goto L_0x0059;
                case 3199032: goto L_0x004e;
                case 3214780: goto L_0x0043;
                case 3356560: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r2 = -1
            goto L_0x0078
        L_0x002d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r2 = 6
            goto L_0x0078
        L_0x0038:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r2 = 5
            goto L_0x0078
        L_0x0043:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r2 = 4
            goto L_0x0078
        L_0x004e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r2 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r2 = 2
            goto L_0x0078
        L_0x0064:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r2 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0091;
                case 2: goto L_0x0091;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r6 = r6.f7150j
            android.util.Pair r6 = e(r6, r0)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.f7150j
            android.util.Pair r6 = a((java.lang.String) r6, (java.lang.String[]) r0)
            return r6
        L_0x008a:
            java.lang.String r6 = r6.f7150j
            android.util.Pair r6 = d(r6, r0)
            return r6
        L_0x0091:
            java.lang.String r6 = r6.f7150j
            android.util.Pair r6 = b((java.lang.String) r6, (java.lang.String[]) r0)
            return r6
        L_0x0098:
            java.lang.String r1 = r6.f7150j
            com.applovin.impl.p3 r6 = r6.f7165y
            android.util.Pair r6 = a((java.lang.String) r1, (java.lang.String[]) r0, (com.applovin.impl.p3) r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.id.a(com.applovin.impl.d9):android.util.Pair");
    }

    public static int b() {
        if (f8524c == -1) {
            int i10 = 0;
            fd a10 = a(MimeTypes.VIDEO_H264, false, false);
            if (a10 != null) {
                MediaCodecInfo.CodecProfileLevel[] a11 = a10.a();
                int length = a11.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(c(a11[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, yp.f13662a >= 21 ? 345600 : 172800);
            }
            f8524c = i10;
        }
        return f8524c;
    }

    public static fd a(String str, boolean z10, boolean z11) {
        List b10 = b(str, z10, z11);
        if (b10.isEmpty()) {
            return null;
        }
        return (fd) b10.get(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1.f8526b == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101 A[SYNTHETIC, Splitter:B:60:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList a(com.applovin.impl.id.b r24, com.applovin.impl.id.d r25) {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014f }
            r5.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r15 = r1.f8525a     // Catch:{ Exception -> 0x014f }
            int r14 = r25.a()     // Catch:{ Exception -> 0x014f }
            boolean r13 = r25.b()     // Catch:{ Exception -> 0x014f }
            r0 = 0
            r12 = 0
        L_0x0019:
            if (r12 >= r14) goto L_0x014e
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x014f }
            boolean r6 = a((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x014f }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0120
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014f }
            boolean r6 = a(r0, r11, r13, r15)     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = a((android.media.MediaCodecInfo) r0, (java.lang.String) r11, (java.lang.String) r15)     // Catch:{ Exception -> 0x014f }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00ef }
            boolean r6 = r2.b(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.a(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f8527c     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            boolean r6 = r2.b(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.a(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f8526b     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0025
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            boolean r16 = c((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00ef }
            boolean r17 = e((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00ef }
            boolean r0 = g((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00ef }
            if (r13 == 0) goto L_0x007b
            boolean r7 = r1.f8526b     // Catch:{ Exception -> 0x00ef }
            if (r7 == r6) goto L_0x0081
        L_0x007b:
            if (r13 != 0) goto L_0x00b3
            boolean r7 = r1.f8526b     // Catch:{ Exception -> 0x00a8 }
            if (r7 != 0) goto L_0x00b3
        L_0x0081:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            com.applovin.impl.fd r0 = com.applovin.impl.fd.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a4 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0120
        L_0x00a4:
            r0 = move-exception
            r1 = r21
            goto L_0x00f9
        L_0x00a8:
            r0 = move-exception
            r20 = r10
            r22 = r12
            r23 = r13
            r18 = r14
            r1 = r11
            goto L_0x00f9
        L_0x00b3:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L_0x0120
            if (r6 == 0) goto L_0x0120
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r6.<init>()     // Catch:{ Exception -> 0x00a4 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00ec }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            com.applovin.impl.fd r0 = com.applovin.impl.fd.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ea }
            r5.add(r0)     // Catch:{ Exception -> 0x00ea }
            return r5
        L_0x00ea:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ec:
            r0 = move-exception
            r1 = r14
            goto L_0x00f9
        L_0x00ef:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        L_0x00f9:
            int r6 = com.applovin.impl.yp.f13662a     // Catch:{ Exception -> 0x014f }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x012a
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x012a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r0.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x014f }
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014f }
            com.applovin.impl.kc.b(r8, r0)     // Catch:{ Exception -> 0x014f }
        L_0x0120:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r2.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x014f }
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014f }
            com.applovin.impl.kc.b(r8, r1)     // Catch:{ Exception -> 0x014f }
            throw r0     // Catch:{ Exception -> 0x014f }
        L_0x014e:
            return r5
        L_0x014f:
            r0 = move-exception
            com.applovin.impl.id$c r1 = new com.applovin.impl.id$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.id.a(com.applovin.impl.id$b, com.applovin.impl.id$d):java.util.ArrayList");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = yp.f13662a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = yp.f13663b;
            if ("a70".equals(str3) || ("Xiaomi".equals(yp.f13664c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = yp.f13663b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = yp.f13663b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(yp.f13664c))) {
            String str6 = yp.f13663b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(yp.f13664c)) {
            String str7 = yp.f13663b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && yp.f13663b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (!"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(fd fdVar) {
        String str = fdVar.f7722a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (yp.f13662a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(d9 d9Var, fd fdVar) {
        try {
            return fdVar.b(d9Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    private static void a(List list, g gVar) {
        Collections.sort(list, new ay(gVar));
    }

    public static fd a() {
        return a("audio/raw", false, false);
    }

    public static List a(List list, d9 d9Var) {
        ArrayList arrayList = new ArrayList(list);
        a((List) arrayList, (g) new xx(d9Var));
        return arrayList;
    }

    private static void a(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (yp.f13662a < 26 && yp.f13663b.equals("R9") && list.size() == 1 && ((fd) list.get(0)).f7722a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(fd.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            a(list, (g) yx.f13720a);
        }
        int i10 = yp.f13662a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = ((fd) list.get(0)).f7722a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, (g) zx.f13984a);
            }
        }
        if (i10 < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((fd) list.get(0)).f7722a)) {
            list.add((fd) list.remove(0));
        }
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo) {
        return yp.f13662a >= 29 && b(mediaCodecInfo);
    }
}
