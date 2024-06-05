package com.applovin.impl;

public abstract class of {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f10221a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f10222b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f10223c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f10224d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f10225e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f10226f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f10227g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10228a;

        /* renamed from: b  reason: collision with root package name */
        public String f10229b;

        /* renamed from: c  reason: collision with root package name */
        public int f10230c;

        /* renamed from: d  reason: collision with root package name */
        public int f10231d;

        /* renamed from: e  reason: collision with root package name */
        public int f10232e;

        /* renamed from: f  reason: collision with root package name */
        public int f10233f;

        /* renamed from: g  reason: collision with root package name */
        public int f10234g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!of.c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f10228a = i11;
            this.f10229b = of.f10221a[3 - i12];
            int i15 = of.f10222b[i14];
            this.f10231d = i15;
            int i16 = 2;
            if (i11 == 2) {
                this.f10231d = i15 / 2;
            } else if (i11 == 0) {
                this.f10231d = i15 / 4;
            }
            int i17 = (i10 >>> 9) & 1;
            this.f10234g = of.b(i11, i12);
            if (i12 == 3) {
                int i18 = i11 == 3 ? of.f10223c[i13 - 1] : of.f10224d[i13 - 1];
                this.f10233f = i18;
                this.f10230c = (((i18 * 12) / this.f10231d) + i17) * 4;
            } else {
                int i19 = 144;
                if (i11 == 3) {
                    int i20 = i12 == 2 ? of.f10225e[i13 - 1] : of.f10226f[i13 - 1];
                    this.f10233f = i20;
                    this.f10230c = ((i20 * 144) / this.f10231d) + i17;
                } else {
                    int i21 = of.f10227g[i13 - 1];
                    this.f10233f = i21;
                    if (i12 == 1) {
                        i19 = 72;
                    }
                    this.f10230c = ((i19 * i21) / this.f10231d) + i17;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i16 = 1;
            }
            this.f10232e = i16;
            return true;
        }
    }

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f10222b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f10223c[i13 - 1] : f10224d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f10225e[i13 - 1] : f10226f[i13 - 1];
        } else {
            i15 = f10227g[i13 - 1];
        }
        int i18 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return ((i18 * i15) / i16) + i17;
    }

    /* access modifiers changed from: private */
    public static boolean c(int i10) {
        return (i10 & -2097152) == -2097152;
    }

    public static int d(int i10) {
        int i11;
        int i12;
        if (!c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return b(i11, i12);
    }

    /* access modifiers changed from: private */
    public static int b(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
