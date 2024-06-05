package e3;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import e3.v;
import java.util.List;
import k4.n0;
import k4.r;
import k4.v;
import n2.r1;
import q2.i;

/* compiled from: MediaCodecInfo */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f17853a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17854b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17855c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f17856d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17857e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17858f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17859g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17860h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17861i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17862j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f17863k;

    /* compiled from: MediaCodecInfo */
    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || n.C()) {
                return 0;
            }
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f17853a = (String) k4.a.e(str);
        this.f17854b = str2;
        this.f17855c = str3;
        this.f17856d = codecCapabilities;
        this.f17860h = z10;
        this.f17861i = z11;
        this.f17862j = z12;
        this.f17857e = z13;
        this.f17858f = z14;
        this.f17859g = z15;
        this.f17863k = v.s(str2);
    }

    private static boolean A(String str) {
        return n0.f19741d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B(String str) {
        if (n0.f19738a <= 22) {
            String str2 = n0.f19741d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean C() {
        String str = n0.f19739b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = n0.f19741d;
            return str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616");
        }
    }

    private static boolean D(String str, int i10) {
        if (MimeTypes.VIDEO_H265.equals(str) && 2 == i10) {
            String str2 = n0.f19739b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(n0.f19739b);
    }

    public static n F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, !z13 && codecCapabilities != null && i(codecCapabilities) && !B(str), codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)));
    }

    private static int b(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((n0.f19738a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        r.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(n0.l(i10, widthAlignment) * widthAlignment, n0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point d11 = d(videoCapabilities, i10, i11);
        int i12 = d11.x;
        int i13 = d11.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] g(android.media.MediaCodecInfo.CodecCapabilities r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0018
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0018
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r1 = 180000000(0xaba9500, float:1.7967196E-32)
            r2 = 1
            if (r3 < r1) goto L_0x0022
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0069
        L_0x0022:
            r1 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r1) goto L_0x002a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x0069
        L_0x002a:
            r1 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r1) goto L_0x0032
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0032:
            r1 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r1) goto L_0x003a
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0069
        L_0x003a:
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r1) goto L_0x0042
            r3 = 64
            goto L_0x0069
        L_0x0042:
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r1) goto L_0x004a
            r3 = 32
            goto L_0x0069
        L_0x004a:
            r1 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r1) goto L_0x0052
            r3 = 16
            goto L_0x0069
        L_0x0052:
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r1) goto L_0x005a
            r3 = 8
            goto L_0x0069
        L_0x005a:
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r1) goto L_0x0061
            r3 = 4
            goto L_0x0069
        L_0x0061:
            r1 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r1) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel r1 = new android.media.MediaCodecInfo$CodecProfileLevel
            r1.<init>()
            r1.profile = r2
            r1.level = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.n.g(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f19738a >= 19 && j(codecCapabilities);
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(r1 r1Var, boolean z10) {
        Pair<Integer, Integer> q10 = v.q(r1Var);
        if (q10 == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(r1Var.f20654m)) {
            if (MimeTypes.VIDEO_H264.equals(this.f17854b)) {
                intValue = 8;
            } else if (MimeTypes.VIDEO_H265.equals(this.f17854b)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.f17863k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] h10 = h();
        if (n0.f19738a <= 23 && "video/x-vnd.on2.vp9".equals(this.f17854b) && h10.length == 0) {
            h10 = g(this.f17856d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h10) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z10) && !D(this.f17854b, intValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + r1Var.f20651j + ", " + this.f17855c);
        return false;
    }

    private boolean q(r1 r1Var) {
        return this.f17854b.equals(r1Var.f20654m) || this.f17854b.equals(v.m(r1Var));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f19738a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f19738a >= 21 && v(codecCapabilities);
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        r.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f17853a + ", " + this.f17854b + "] [" + n0.f19742e + "]");
    }

    private void y(String str) {
        r.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f17853a + ", " + this.f17854b + "] [" + n0.f19742e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17856d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i10, i11);
    }

    public i f(r1 r1Var, r1 r1Var2) {
        int i10 = !n0.c(r1Var.f20654m, r1Var2.f20654m) ? 8 : 0;
        if (this.f17863k) {
            if (r1Var.f20662u != r1Var2.f20662u) {
                i10 |= 1024;
            }
            if (!this.f17857e && !(r1Var.f20659r == r1Var2.f20659r && r1Var.f20660s == r1Var2.f20660s)) {
                i10 |= 512;
            }
            if (!n0.c(r1Var.f20666y, r1Var2.f20666y)) {
                i10 |= 2048;
            }
            if (A(this.f17853a) && !r1Var.g(r1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new i(this.f17853a, r1Var, r1Var2, r1Var.g(r1Var2) ? 3 : 2, 0);
            }
        } else {
            if (r1Var.f20667z != r1Var2.f20667z) {
                i10 |= 4096;
            }
            if (r1Var.A != r1Var2.A) {
                i10 |= 8192;
            }
            if (r1Var.B != r1Var2.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f17854b)) {
                Pair<Integer, Integer> q10 = v.q(r1Var);
                Pair<Integer, Integer> q11 = v.q(r1Var2);
                if (!(q10 == null || q11 == null)) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new i(this.f17853a, r1Var, r1Var2, 3, 0);
                    }
                }
            }
            if (!r1Var.g(r1Var2)) {
                i10 |= 32;
            }
            if (z(this.f17854b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new i(this.f17853a, r1Var, r1Var2, 1, 0);
            }
        }
        return new i(this.f17853a, r1Var, r1Var2, 0, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] h() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f17856d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.n.h():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17856d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        } else if (b(this.f17853a, this.f17854b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        } else {
            y("channelCount.support, " + i10);
            return false;
        }
    }

    public boolean l(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17856d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            y("sampleRate.support, " + i10);
            return false;
        }
    }

    public boolean n(r1 r1Var) {
        if (!q(r1Var) || !m(r1Var, false)) {
            return false;
        }
        return true;
    }

    public boolean o(r1 r1Var) throws v.c {
        int i10;
        boolean z10 = false;
        if (!q(r1Var) || !m(r1Var, true)) {
            return false;
        }
        if (this.f17863k) {
            int i11 = r1Var.f20659r;
            if (i11 <= 0 || (i10 = r1Var.f20660s) <= 0) {
                return true;
            }
            if (n0.f19738a >= 21) {
                return w(i11, i10, (double) r1Var.f20661t);
            }
            if (i11 * i10 <= v.N()) {
                z10 = true;
            }
            if (!z10) {
                y("legacyFrameSize, " + r1Var.f20659r + "x" + r1Var.f20660s);
            }
            return z10;
        }
        if (n0.f19738a >= 21) {
            int i12 = r1Var.A;
            if (i12 != -1 && !l(i12)) {
                return false;
            }
            int i13 = r1Var.f20667z;
            if (i13 == -1 || k(i13)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean p() {
        if (n0.f19738a >= 29 && "video/x-vnd.on2.vp9".equals(this.f17854b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(r1 r1Var) {
        if (this.f17863k) {
            return this.f17857e;
        }
        Pair<Integer, Integer> q10 = v.q(r1Var);
        return q10 != null && ((Integer) q10.first).intValue() == 42;
    }

    public String toString() {
        return this.f17853a;
    }

    public boolean w(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17856d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (n0.f19738a >= 29) {
            int a10 = a.a(videoCapabilities, i10, i11, d10);
            if (a10 == 2) {
                return true;
            }
            if (a10 == 1) {
                y("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!e(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !E(this.f17853a) || !e(videoCapabilities, i11, i10, d10)) {
                y("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            x("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }
}
