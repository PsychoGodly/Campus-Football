package s2;

import android.util.Base64;
import f3.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.a0;
import k4.n0;
import k4.r;
import n2.y2;

/* compiled from: VorbisUtil */
public final class h0 {

    /* compiled from: VorbisUtil */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f22421a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22422b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f22423c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22424d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f22425e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f22421a = i10;
            this.f22422b = i11;
            this.f22423c = jArr;
            this.f22424d = i12;
            this.f22425e = z10;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f22426a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f22427b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22428c;

        public b(String str, String[] strArr, int i10) {
            this.f22426a = str;
            this.f22427b = strArr;
            this.f22428c = i10;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f22429a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22430b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22431c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22432d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f22429a = z10;
            this.f22430b = i10;
            this.f22431c = i11;
            this.f22432d = i12;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f22433a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22434b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22435c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22436d;

        /* renamed from: e  reason: collision with root package name */
        public final int f22437e;

        /* renamed from: f  reason: collision with root package name */
        public final int f22438f;

        /* renamed from: g  reason: collision with root package name */
        public final int f22439g;

        /* renamed from: h  reason: collision with root package name */
        public final int f22440h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f22441i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f22442j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f22433a = i10;
            this.f22434b = i11;
            this.f22435c = i12;
            this.f22436d = i13;
            this.f22437e = i14;
            this.f22438f = i15;
            this.f22439g = i16;
            this.f22440h = i17;
            this.f22441i = z10;
            this.f22442j = bArr;
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

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow((double) j10, 1.0d / ((double) j11)));
    }

    public static f3.a c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] S0 = n0.S0(str, "=");
            if (S0.length != 2) {
                r.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (S0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(i3.a.a(new a0(Base64.decode(S0[1], 0))));
                } catch (RuntimeException e10) {
                    r.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new n3.a(S0[0], S0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f3.a((List<? extends a.b>) arrayList);
    }

    private static a d(g0 g0Var) throws y2 {
        if (g0Var.d(24) == 5653314) {
            int d10 = g0Var.d(16);
            int d11 = g0Var.d(24);
            long[] jArr = new long[d11];
            boolean c10 = g0Var.c();
            long j10 = 0;
            if (!c10) {
                boolean c11 = g0Var.c();
                for (int i10 = 0; i10 < d11; i10++) {
                    if (!c11) {
                        jArr[i10] = (long) (g0Var.d(5) + 1);
                    } else if (g0Var.c()) {
                        jArr[i10] = (long) (g0Var.d(5) + 1);
                    } else {
                        jArr[i10] = 0;
                    }
                }
            } else {
                int d12 = g0Var.d(5) + 1;
                int i11 = 0;
                while (i11 < d11) {
                    int d13 = g0Var.d(a(d11 - i11));
                    for (int i12 = 0; i12 < d13 && i11 < d11; i12++) {
                        jArr[i11] = (long) d12;
                        i11++;
                    }
                    d12++;
                }
            }
            int d14 = g0Var.d(4);
            if (d14 <= 2) {
                if (d14 == 1 || d14 == 2) {
                    g0Var.e(32);
                    g0Var.e(32);
                    int d15 = g0Var.d(4) + 1;
                    g0Var.e(1);
                    if (d14 != 1) {
                        j10 = ((long) d11) * ((long) d10);
                    } else if (d10 != 0) {
                        j10 = b((long) d11, (long) d10);
                    }
                    g0Var.e((int) (j10 * ((long) d15)));
                }
                return new a(d10, d11, jArr, d14, c10);
            }
            throw y2.a("lookup type greater than 2 not decodable: " + d14, (Throwable) null);
        }
        throw y2.a("expected code book to start with [0x56, 0x43, 0x42] at " + g0Var.b(), (Throwable) null);
    }

    private static void e(g0 g0Var) throws y2 {
        int d10 = g0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = g0Var.d(16);
            if (d11 == 0) {
                g0Var.e(8);
                g0Var.e(16);
                g0Var.e(16);
                g0Var.e(6);
                g0Var.e(8);
                int d12 = g0Var.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    g0Var.e(8);
                }
            } else if (d11 == 1) {
                int d13 = g0Var.d(5);
                int i12 = -1;
                int[] iArr = new int[d13];
                for (int i13 = 0; i13 < d13; i13++) {
                    iArr[i13] = g0Var.d(4);
                    if (iArr[i13] > i12) {
                        i12 = iArr[i13];
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = g0Var.d(3) + 1;
                    int d14 = g0Var.d(2);
                    if (d14 > 0) {
                        g0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d14); i16++) {
                        g0Var.e(8);
                    }
                }
                g0Var.e(2);
                int d15 = g0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        g0Var.e(d15);
                        i18++;
                    }
                }
            } else {
                throw y2.a("floor type greater than 1 not decodable: " + d11, (Throwable) null);
            }
        }
    }

    private static void f(int i10, g0 g0Var) throws y2 {
        int d10 = g0Var.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = g0Var.d(16);
            if (d11 != 0) {
                r.c("VorbisUtil", "mapping type other than 0 not supported: " + d11);
            } else {
                int d12 = g0Var.c() ? g0Var.d(4) + 1 : 1;
                if (g0Var.c()) {
                    int d13 = g0Var.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        g0Var.e(a(i13));
                        g0Var.e(a(i13));
                    }
                }
                if (g0Var.d(2) == 0) {
                    if (d12 > 1) {
                        for (int i14 = 0; i14 < i10; i14++) {
                            g0Var.e(4);
                        }
                    }
                    for (int i15 = 0; i15 < d12; i15++) {
                        g0Var.e(8);
                        g0Var.e(8);
                        g0Var.e(8);
                    }
                } else {
                    throw y2.a("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    private static c[] g(g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        c[] cVarArr = new c[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            cVarArr[i10] = new c(g0Var.c(), g0Var.d(16), g0Var.d(16), g0Var.d(8));
        }
        return cVarArr;
    }

    private static void h(g0 g0Var) throws y2 {
        int d10 = g0Var.d(6) + 1;
        int i10 = 0;
        while (i10 < d10) {
            if (g0Var.d(16) <= 2) {
                g0Var.e(24);
                g0Var.e(24);
                g0Var.e(24);
                int d11 = g0Var.d(6) + 1;
                g0Var.e(8);
                int[] iArr = new int[d11];
                for (int i11 = 0; i11 < d11; i11++) {
                    iArr[i11] = ((g0Var.c() ? g0Var.d(5) : 0) * 8) + g0Var.d(3);
                }
                for (int i12 = 0; i12 < d11; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            g0Var.e(8);
                        }
                    }
                }
                i10++;
            } else {
                throw y2.a("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    public static b i(a0 a0Var) throws y2 {
        return j(a0Var, true, true);
    }

    public static b j(a0 a0Var, boolean z10, boolean z11) throws y2 {
        if (z10) {
            m(3, a0Var, false);
        }
        String D = a0Var.D((int) a0Var.w());
        int length = 11 + D.length();
        long w10 = a0Var.w();
        String[] strArr = new String[((int) w10)];
        int i10 = length + 4;
        for (int i11 = 0; ((long) i11) < w10; i11++) {
            strArr[i11] = a0Var.D((int) a0Var.w());
            i10 = i10 + 4 + strArr[i11].length();
        }
        if (!z11 || (a0Var.G() & 1) != 0) {
            return new b(D, strArr, i10 + 1);
        }
        throw y2.a("framing bit expected to be set", (Throwable) null);
    }

    public static d k(a0 a0Var) throws y2 {
        boolean z10 = true;
        m(1, a0Var, false);
        int x10 = a0Var.x();
        int G = a0Var.G();
        int x11 = a0Var.x();
        int t10 = a0Var.t();
        if (t10 <= 0) {
            t10 = -1;
        }
        int t11 = a0Var.t();
        if (t11 <= 0) {
            t11 = -1;
        }
        int t12 = a0Var.t();
        if (t12 <= 0) {
            t12 = -1;
        }
        int G2 = a0Var.G();
        int pow = (int) Math.pow(2.0d, (double) (G2 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((G2 & 240) >> 4));
        if ((a0Var.G() & 1) <= 0) {
            z10 = false;
        }
        return new d(x10, G, x11, t10, t11, t12, pow, pow2, z10, Arrays.copyOf(a0Var.e(), a0Var.g()));
    }

    public static c[] l(a0 a0Var, int i10) throws y2 {
        int i11 = 0;
        m(5, a0Var, false);
        int G = a0Var.G() + 1;
        g0 g0Var = new g0(a0Var.e());
        g0Var.e(a0Var.f() * 8);
        for (int i12 = 0; i12 < G; i12++) {
            d(g0Var);
        }
        int d10 = g0Var.d(6) + 1;
        while (i11 < d10) {
            if (g0Var.d(16) == 0) {
                i11++;
            } else {
                throw y2.a("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        e(g0Var);
        h(g0Var);
        f(i10, g0Var);
        c[] g10 = g(g0Var);
        if (g0Var.c()) {
            return g10;
        }
        throw y2.a("framing bit after modes not set as expected", (Throwable) null);
    }

    public static boolean m(int i10, a0 a0Var, boolean z10) throws y2 {
        if (a0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw y2.a("too short header: " + a0Var.a(), (Throwable) null);
        } else if (a0Var.G() != i10) {
            if (z10) {
                return false;
            }
            throw y2.a("expected header type " + Integer.toHexString(i10), (Throwable) null);
        } else if (a0Var.G() == 118 && a0Var.G() == 111 && a0Var.G() == 114 && a0Var.G() == 98 && a0Var.G() == 105 && a0Var.G() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw y2.a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
