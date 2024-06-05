package com.applovin.impl;

abstract class q8 {

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f10887a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f10888b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10889c;

        /* renamed from: d  reason: collision with root package name */
        public final long[] f10890d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f10891e;

        /* renamed from: f  reason: collision with root package name */
        public final long f10892f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f10887a = jArr;
            this.f10888b = iArr;
            this.f10889c = i10;
            this.f10890d = jArr2;
            this.f10891e = iArr2;
            this.f10892f = j10;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int[] iArr2 = iArr;
        int i11 = 8192 / i10;
        int i12 = 0;
        for (int a10 : iArr2) {
            i12 += yp.a(a10, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr3 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr4 = new int[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr2.length; i16++) {
            int i17 = iArr2[i16];
            long j11 = jArr[i16];
            while (i17 > 0) {
                int min = Math.min(i11, i17);
                jArr2[i14] = j11;
                int i18 = i10 * min;
                iArr3[i14] = i18;
                i15 = Math.max(i15, i18);
                jArr3[i14] = ((long) i13) * j10;
                iArr4[i14] = 1;
                j11 += (long) iArr3[i14];
                i13 += min;
                i17 -= min;
                i14++;
            }
        }
        return new b(jArr2, iArr3, i15, jArr3, iArr4, j10 * ((long) i13));
    }
}
