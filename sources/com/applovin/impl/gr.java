package com.applovin.impl;

import java.util.Arrays;

public abstract class gr {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8119a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8120b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f8121c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8122d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f8123e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f8119a = i10;
            this.f8120b = i11;
            this.f8121c = jArr;
            this.f8122d = i12;
            this.f8123e = z10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8124a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f8125b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8126c;

        public b(String str, String[] strArr, int i10) {
            this.f8124a = str;
            this.f8125b = strArr;
            this.f8126c = i10;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f8127a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8128b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8129c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8130d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f8127a = z10;
            this.f8128b = i10;
            this.f8129c = i11;
            this.f8130d = i12;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f8131a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8132b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8133c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8134d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8135e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8136f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8137g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8138h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f8139i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f8140j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f8131a = i10;
            this.f8132b = i11;
            this.f8133c = i12;
            this.f8134d = i13;
            this.f8135e = i14;
            this.f8136f = i15;
            this.f8137g = i16;
            this.f8138h = i17;
            this.f8139i = z10;
            this.f8140j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long a(long j10, long j11) {
        return (long) Math.floor(Math.pow((double) j10, 1.0d / ((double) j11)));
    }

    private static void b(dr drVar) {
        int a10 = drVar.a(6) + 1;
        for (int i10 = 0; i10 < a10; i10++) {
            int a11 = drVar.a(16);
            if (a11 == 0) {
                drVar.b(8);
                drVar.b(16);
                drVar.b(16);
                drVar.b(6);
                drVar.b(8);
                int a12 = drVar.a(4) + 1;
                for (int i11 = 0; i11 < a12; i11++) {
                    drVar.b(8);
                }
            } else if (a11 == 1) {
                int a13 = drVar.a(5);
                int i12 = -1;
                int[] iArr = new int[a13];
                for (int i13 = 0; i13 < a13; i13++) {
                    int a14 = drVar.a(4);
                    iArr[i13] = a14;
                    if (a14 > i12) {
                        i12 = a14;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = drVar.a(3) + 1;
                    int a15 = drVar.a(2);
                    if (a15 > 0) {
                        drVar.b(8);
                    }
                    for (int i16 = 0; i16 < (1 << a15); i16++) {
                        drVar.b(8);
                    }
                }
                drVar.b(2);
                int a16 = drVar.a(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < a13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        drVar.b(a16);
                        i18++;
                    }
                }
            } else {
                throw ah.a("floor type greater than 1 not decodable: " + a11, (Throwable) null);
            }
        }
    }

    private static c[] c(dr drVar) {
        int a10 = drVar.a(6) + 1;
        c[] cVarArr = new c[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            cVarArr[i10] = new c(drVar.c(), drVar.a(16), drVar.a(16), drVar.a(8));
        }
        return cVarArr;
    }

    private static void d(dr drVar) {
        int a10 = drVar.a(6) + 1;
        int i10 = 0;
        while (i10 < a10) {
            if (drVar.a(16) <= 2) {
                drVar.b(24);
                drVar.b(24);
                drVar.b(24);
                int a11 = drVar.a(6) + 1;
                drVar.b(8);
                int[] iArr = new int[a11];
                for (int i11 = 0; i11 < a11; i11++) {
                    iArr[i11] = ((drVar.c() ? drVar.a(5) : 0) * 8) + drVar.a(3);
                }
                for (int i12 = 0; i12 < a11; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            drVar.b(8);
                        }
                    }
                }
                i10++;
            } else {
                throw ah.a("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    private static a a(dr drVar) {
        if (drVar.a(24) == 5653314) {
            int a10 = drVar.a(16);
            int a11 = drVar.a(24);
            long[] jArr = new long[a11];
            boolean c10 = drVar.c();
            long j10 = 0;
            if (!c10) {
                boolean c11 = drVar.c();
                for (int i10 = 0; i10 < a11; i10++) {
                    if (!c11) {
                        jArr[i10] = (long) (drVar.a(5) + 1);
                    } else if (drVar.c()) {
                        jArr[i10] = (long) (drVar.a(5) + 1);
                    } else {
                        jArr[i10] = 0;
                    }
                }
            } else {
                int a12 = drVar.a(5) + 1;
                int i11 = 0;
                while (i11 < a11) {
                    int a13 = drVar.a(a(a11 - i11));
                    for (int i12 = 0; i12 < a13 && i11 < a11; i12++) {
                        jArr[i11] = (long) a12;
                        i11++;
                    }
                    a12++;
                }
            }
            int a14 = drVar.a(4);
            if (a14 <= 2) {
                if (a14 == 1 || a14 == 2) {
                    drVar.b(32);
                    drVar.b(32);
                    int a15 = drVar.a(4) + 1;
                    drVar.b(1);
                    if (a14 != 1) {
                        j10 = ((long) a11) * ((long) a10);
                    } else if (a10 != 0) {
                        j10 = a((long) a11, (long) a10);
                    }
                    drVar.b((int) (j10 * ((long) a15)));
                }
                return new a(a10, a11, jArr, a14, c10);
            }
            throw ah.a("lookup type greater than 2 not decodable: " + a14, (Throwable) null);
        }
        throw ah.a("expected code book to start with [0x56, 0x43, 0x42] at " + drVar.b(), (Throwable) null);
    }

    public static d b(yg ygVar) {
        boolean z10 = true;
        a(1, ygVar, false);
        int q10 = ygVar.q();
        int w10 = ygVar.w();
        int q11 = ygVar.q();
        int m10 = ygVar.m();
        if (m10 <= 0) {
            m10 = -1;
        }
        int m11 = ygVar.m();
        if (m11 <= 0) {
            m11 = -1;
        }
        int m12 = ygVar.m();
        if (m12 <= 0) {
            m12 = -1;
        }
        int w11 = ygVar.w();
        int pow = (int) Math.pow(2.0d, (double) (w11 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((w11 & 240) >> 4));
        if ((ygVar.w() & 1) <= 0) {
            z10 = false;
        }
        return new d(q10, w10, q11, m10, m11, m12, pow, pow2, z10, Arrays.copyOf(ygVar.c(), ygVar.e()));
    }

    private static void a(int i10, dr drVar) {
        int a10 = drVar.a(6) + 1;
        for (int i11 = 0; i11 < a10; i11++) {
            int a11 = drVar.a(16);
            if (a11 != 0) {
                kc.b("VorbisUtil", "mapping type other than 0 not supported: " + a11);
            } else {
                int a12 = drVar.c() ? drVar.a(4) + 1 : 1;
                if (drVar.c()) {
                    int a13 = drVar.a(8) + 1;
                    for (int i12 = 0; i12 < a13; i12++) {
                        int i13 = i10 - 1;
                        drVar.b(a(i13));
                        drVar.b(a(i13));
                    }
                }
                if (drVar.a(2) == 0) {
                    if (a12 > 1) {
                        for (int i14 = 0; i14 < i10; i14++) {
                            drVar.b(4);
                        }
                    }
                    for (int i15 = 0; i15 < a12; i15++) {
                        drVar.b(8);
                        drVar.b(8);
                        drVar.b(8);
                    }
                } else {
                    throw ah.a("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    public static b a(yg ygVar) {
        return a(ygVar, true, true);
    }

    public static b a(yg ygVar, boolean z10, boolean z11) {
        if (z10) {
            a(3, ygVar, false);
        }
        String c10 = ygVar.c((int) ygVar.p());
        int length = c10.length();
        long p10 = ygVar.p();
        String[] strArr = new String[((int) p10)];
        int i10 = length + 15;
        for (int i11 = 0; ((long) i11) < p10; i11++) {
            String c11 = ygVar.c((int) ygVar.p());
            strArr[i11] = c11;
            i10 = i10 + 4 + c11.length();
        }
        if (!z11 || (ygVar.w() & 1) != 0) {
            return new b(c10, strArr, i10 + 1);
        }
        throw ah.a("framing bit expected to be set", (Throwable) null);
    }

    public static c[] a(yg ygVar, int i10) {
        int i11 = 0;
        a(5, ygVar, false);
        int w10 = ygVar.w() + 1;
        dr drVar = new dr(ygVar.c());
        drVar.b(ygVar.d() * 8);
        for (int i12 = 0; i12 < w10; i12++) {
            a(drVar);
        }
        int a10 = drVar.a(6) + 1;
        while (i11 < a10) {
            if (drVar.a(16) == 0) {
                i11++;
            } else {
                throw ah.a("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        b(drVar);
        d(drVar);
        a(i10, drVar);
        c[] c10 = c(drVar);
        if (drVar.c()) {
            return c10;
        }
        throw ah.a("framing bit after modes not set as expected", (Throwable) null);
    }

    public static boolean a(int i10, yg ygVar, boolean z10) {
        if (ygVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ah.a("too short header: " + ygVar.a(), (Throwable) null);
        } else if (ygVar.w() != i10) {
            if (z10) {
                return false;
            }
            throw ah.a("expected header type " + Integer.toHexString(i10), (Throwable) null);
        } else if (ygVar.w() == 118 && ygVar.w() == 111 && ygVar.w() == 114 && ygVar.w() == 98 && ygVar.w() == 105 && ygVar.w() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw ah.a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
