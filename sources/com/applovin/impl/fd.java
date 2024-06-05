package com.applovin.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

public final class fd {

    /* renamed from: a  reason: collision with root package name */
    public final String f7722a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7723b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7724c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7725d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7726e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7727f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7728g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7729h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7730i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f7731j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7732k;

    fd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f7722a = (String) a1.a((Object) str);
        this.f7723b = str2;
        this.f7724c = str3;
        this.f7725d = codecCapabilities;
        this.f7729h = z10;
        this.f7730i = z11;
        this.f7731j = z12;
        this.f7726e = z13;
        this.f7727f = z14;
        this.f7728g = z15;
        this.f7732k = df.i(str2);
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((yp.f13662a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        kc.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f13662a >= 21 && e(codecCapabilities);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f13662a >= 21 && g(codecCapabilities);
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public boolean b(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7725d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            b("sampleRate.support, " + i10);
            return false;
        }
    }

    public String toString() {
        return this.f7722a;
    }

    private static boolean d(String str) {
        return yp.f13665d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(String str) {
        if (yp.f13662a <= 22) {
            String str2 = yp.f13665d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(yp.f13663b);
    }

    public boolean c(d9 d9Var) {
        if (this.f7732k) {
            return this.f7726e;
        }
        Pair a10 = id.a(d9Var);
        return a10 != null && ((Integer) a10.first).intValue() == 42;
    }

    private static boolean c(String str) {
        return "audio/opus".equals(str);
    }

    public boolean b(d9 d9Var) {
        int i10;
        boolean z10 = false;
        if (!a(d9Var)) {
            return false;
        }
        if (this.f7732k) {
            int i11 = d9Var.f7158r;
            if (i11 <= 0 || (i10 = d9Var.f7159s) <= 0) {
                return true;
            }
            if (yp.f13662a >= 21) {
                return a(i11, i10, (double) d9Var.f7160t);
            }
            if (i11 * i10 <= id.b()) {
                z10 = true;
            }
            if (!z10) {
                b("legacyFrameSize, " + d9Var.f7158r + "x" + d9Var.f7159s);
            }
            return z10;
        }
        if (yp.f13662a >= 21) {
            int i12 = d9Var.A;
            if (i12 != -1 && !b(i12)) {
                return false;
            }
            int i13 = d9Var.f7166z;
            if (i13 == -1 || a(i13)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7725d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i10, i11);
    }

    public boolean b() {
        if (yp.f13662a >= 29 && "video/x-vnd.on2.vp9".equals(this.f7723b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(yp.a(i10, widthAlignment) * widthAlignment, yp.a(i11, heightAlignment) * heightAlignment);
    }

    private void b(String str) {
        kc.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f7722a + ", " + this.f7723b + "] [" + yp.f13666e + "]");
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return yp.f13662a >= 19 && c(codecCapabilities);
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point a10 = a(videoCapabilities, i10, i11);
        int i12 = a10.x;
        int i13 = a10.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    public o5 a(d9 d9Var, d9 d9Var2) {
        int i10 = !yp.a((Object) d9Var.f7153m, (Object) d9Var2.f7153m) ? 8 : 0;
        if (this.f7732k) {
            if (d9Var.f7161u != d9Var2.f7161u) {
                i10 |= 1024;
            }
            if (!this.f7726e && !(d9Var.f7158r == d9Var2.f7158r && d9Var.f7159s == d9Var2.f7159s)) {
                i10 |= 512;
            }
            if (!yp.a((Object) d9Var.f7165y, (Object) d9Var2.f7165y)) {
                i10 |= 2048;
            }
            if (d(this.f7722a) && !d9Var.a(d9Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new o5(this.f7722a, d9Var, d9Var2, d9Var.a(d9Var2) ? 3 : 2, 0);
            }
        } else {
            if (d9Var.f7166z != d9Var2.f7166z) {
                i10 |= 4096;
            }
            if (d9Var.A != d9Var2.A) {
                i10 |= 8192;
            }
            if (d9Var.B != d9Var2.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f7723b)) {
                Pair a10 = id.a(d9Var);
                Pair a11 = id.a(d9Var2);
                if (!(a10 == null || a11 == null)) {
                    int intValue = ((Integer) a10.first).intValue();
                    int intValue2 = ((Integer) a11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new o5(this.f7722a, d9Var, d9Var2, 3, 0);
                    }
                }
            }
            if (!d9Var.a(d9Var2)) {
                i10 |= 32;
            }
            if (c(this.f7723b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new o5(this.f7722a, d9Var, d9Var2, 1, 0);
            }
        }
        return new o5(this.f7722a, d9Var, d9Var2, 0, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] a(android.media.MediaCodecInfo.CodecCapabilities r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fd.a(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] a() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f7725d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fd.a():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public boolean a(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7725d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        } else if (a(this.f7722a, this.f7723b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        } else {
            b("channelCount.support, " + i10);
            return false;
        }
    }

    public boolean a(d9 d9Var) {
        String b10;
        String str = d9Var.f7150j;
        if (str == null || this.f7723b == null || (b10 = df.b(str)) == null) {
            return true;
        }
        if (!this.f7723b.equals(b10)) {
            b("codec.mime " + d9Var.f7150j + ", " + b10);
            return false;
        }
        Pair a10 = id.a(d9Var);
        if (a10 == null) {
            return true;
        }
        int intValue = ((Integer) a10.first).intValue();
        int intValue2 = ((Integer) a10.second).intValue();
        if (!this.f7732k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] a11 = a();
        if (yp.f13662a <= 23 && "video/x-vnd.on2.vp9".equals(this.f7723b) && a11.length == 0) {
            a11 = a(this.f7725d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a11) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        b("codec.profileLevel, " + d9Var.f7150j + ", " + b10);
        return false;
    }

    public boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7725d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        } else if (a(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 >= i11 || !f(this.f7722a) || !a(videoCapabilities, i11, i10, d10)) {
                b("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
                return false;
            }
            a("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10);
            return true;
        }
    }

    public static fd a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new fd(str, str2, str3, codecCapabilities, z10, z11, z12, !z13 && codecCapabilities != null && b(codecCapabilities) && !e(str), codecCapabilities != null && f(codecCapabilities), z14 || (codecCapabilities != null && d(codecCapabilities)));
    }

    private void a(String str) {
        kc.a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f7722a + ", " + this.f7723b + "] [" + yp.f13666e + "]");
    }
}
