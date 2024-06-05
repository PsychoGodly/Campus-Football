package a3;

import a3.a;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.common.api.a;
import com.unity3d.services.core.device.MimeTypes;
import h3.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.a0;
import k4.j0;
import k4.n0;
import k4.w;
import n2.r1;
import n2.y2;
import r2.m;
import s2.b0;
import s2.d;
import s2.e0;
import s2.l;
import s2.n;
import s2.r;
import s2.x;

/* compiled from: FragmentedMp4Extractor */
public class g implements l {
    public static final r I = f.f235b;
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final r1 K = new r1.b().g0("application/x-emsg").G();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private n E;
    private e0[] F;
    private e0[] G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final int f236a;

    /* renamed from: b  reason: collision with root package name */
    private final o f237b;

    /* renamed from: c  reason: collision with root package name */
    private final List<r1> f238c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<b> f239d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f240e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f241f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f242g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f243h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f244i;

    /* renamed from: j  reason: collision with root package name */
    private final j0 f245j;

    /* renamed from: k  reason: collision with root package name */
    private final c f246k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f247l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque<a.C0002a> f248m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<a> f249n;

    /* renamed from: o  reason: collision with root package name */
    private final e0 f250o;

    /* renamed from: p  reason: collision with root package name */
    private int f251p;

    /* renamed from: q  reason: collision with root package name */
    private int f252q;

    /* renamed from: r  reason: collision with root package name */
    private long f253r;

    /* renamed from: s  reason: collision with root package name */
    private int f254s;

    /* renamed from: t  reason: collision with root package name */
    private a0 f255t;

    /* renamed from: u  reason: collision with root package name */
    private long f256u;

    /* renamed from: v  reason: collision with root package name */
    private int f257v;

    /* renamed from: w  reason: collision with root package name */
    private long f258w;

    /* renamed from: x  reason: collision with root package name */
    private long f259x;

    /* renamed from: y  reason: collision with root package name */
    private long f260y;

    /* renamed from: z  reason: collision with root package name */
    private b f261z;

    /* compiled from: FragmentedMp4Extractor */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f262a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f263b;

        /* renamed from: c  reason: collision with root package name */
        public final int f264c;

        public a(long j10, boolean z10, int i10) {
            this.f262a = j10;
            this.f263b = z10;
            this.f264c = i10;
        }
    }

    /* compiled from: FragmentedMp4Extractor */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f265a;

        /* renamed from: b  reason: collision with root package name */
        public final q f266b = new q();

        /* renamed from: c  reason: collision with root package name */
        public final a0 f267c = new a0();

        /* renamed from: d  reason: collision with root package name */
        public r f268d;

        /* renamed from: e  reason: collision with root package name */
        public c f269e;

        /* renamed from: f  reason: collision with root package name */
        public int f270f;

        /* renamed from: g  reason: collision with root package name */
        public int f271g;

        /* renamed from: h  reason: collision with root package name */
        public int f272h;

        /* renamed from: i  reason: collision with root package name */
        public int f273i;

        /* renamed from: j  reason: collision with root package name */
        private final a0 f274j = new a0(1);

        /* renamed from: k  reason: collision with root package name */
        private final a0 f275k = new a0();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f276l;

        public b(e0 e0Var, r rVar, c cVar) {
            this.f265a = e0Var;
            this.f268d = rVar;
            this.f269e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10;
            if (!this.f276l) {
                i10 = this.f268d.f362g[this.f270f];
            } else {
                i10 = this.f266b.f348k[this.f270f] ? 1 : 0;
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            if (!this.f276l) {
                return this.f268d.f358c[this.f270f];
            }
            return this.f266b.f344g[this.f272h];
        }

        public long e() {
            if (!this.f276l) {
                return this.f268d.f361f[this.f270f];
            }
            return this.f266b.c(this.f270f);
        }

        public int f() {
            if (!this.f276l) {
                return this.f268d.f359d[this.f270f];
            }
            return this.f266b.f346i[this.f270f];
        }

        public p g() {
            if (!this.f276l) {
                return null;
            }
            int i10 = ((c) n0.j(this.f266b.f338a)).f224a;
            p pVar = this.f266b.f351n;
            if (pVar == null) {
                pVar = this.f268d.f356a.a(i10);
            }
            if (pVar == null || !pVar.f333a) {
                return null;
            }
            return pVar;
        }

        public boolean h() {
            this.f270f++;
            if (!this.f276l) {
                return false;
            }
            int i10 = this.f271g + 1;
            this.f271g = i10;
            int[] iArr = this.f266b.f345h;
            int i11 = this.f272h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f272h = i11 + 1;
            this.f271g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            a0 a0Var;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f336d;
            if (i12 != 0) {
                a0Var = this.f266b.f352o;
            } else {
                byte[] bArr = (byte[]) n0.j(g10.f337e);
                this.f275k.R(bArr, bArr.length);
                a0 a0Var2 = this.f275k;
                i12 = bArr.length;
                a0Var = a0Var2;
            }
            boolean g11 = this.f266b.g(this.f270f);
            boolean z10 = g11 || i11 != 0;
            this.f274j.e()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f274j.T(0);
            this.f265a.f(this.f274j, 1, 1);
            this.f265a.f(a0Var, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!g11) {
                this.f267c.P(8);
                byte[] e10 = this.f267c.e();
                e10[0] = 0;
                e10[1] = 1;
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                e10[4] = (byte) ((i10 >> 24) & 255);
                e10[5] = (byte) ((i10 >> 16) & 255);
                e10[6] = (byte) ((i10 >> 8) & 255);
                e10[7] = (byte) (i10 & 255);
                this.f265a.f(this.f267c, 8, 1);
                return i12 + 1 + 8;
            }
            a0 a0Var3 = this.f266b.f352o;
            int M = a0Var3.M();
            a0Var3.U(-2);
            int i13 = (M * 6) + 2;
            if (i11 != 0) {
                this.f267c.P(i13);
                byte[] e11 = this.f267c.e();
                a0Var3.l(e11, 0, i13);
                int i14 = (((e11[2] & 255) << 8) | (e11[3] & 255)) + i11;
                e11[2] = (byte) ((i14 >> 8) & 255);
                e11[3] = (byte) (i14 & 255);
                a0Var3 = this.f267c;
            }
            this.f265a.f(a0Var3, i13, 1);
            return i12 + 1 + i13;
        }

        public void j(r rVar, c cVar) {
            this.f268d = rVar;
            this.f269e = cVar;
            this.f265a.a(rVar.f356a.f327f);
            k();
        }

        public void k() {
            this.f266b.f();
            this.f270f = 0;
            this.f272h = 0;
            this.f271g = 0;
            this.f273i = 0;
            this.f276l = false;
        }

        public void l(long j10) {
            int i10 = this.f270f;
            while (true) {
                q qVar = this.f266b;
                if (i10 < qVar.f343f && qVar.c(i10) <= j10) {
                    if (this.f266b.f348k[i10]) {
                        this.f273i = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void m() {
            p g10 = g();
            if (g10 != null) {
                a0 a0Var = this.f266b.f352o;
                int i10 = g10.f336d;
                if (i10 != 0) {
                    a0Var.U(i10);
                }
                if (this.f266b.g(this.f270f)) {
                    a0Var.U(a0Var.M() * 6);
                }
            }
        }

        public void n(m mVar) {
            p a10 = this.f268d.f356a.a(((c) n0.j(this.f266b.f338a)).f224a);
            this.f265a.a(this.f268d.f356a.f327f.b().O(mVar.c(a10 != null ? a10.f334b : null)).G());
        }
    }

    public g() {
        this(0);
    }

    private static void A(a0 a0Var, q qVar) throws y2 {
        z(a0Var, 0, qVar);
    }

    private static Pair<Long, d> B(a0 a0Var, long j10) throws y2 {
        long j11;
        long j12;
        a0 a0Var2 = a0Var;
        a0Var2.T(8);
        int c10 = a.c(a0Var.p());
        a0Var2.U(4);
        long I2 = a0Var.I();
        if (c10 == 0) {
            j12 = a0Var.I();
            j11 = a0Var.I();
        } else {
            j12 = a0Var.L();
            j11 = a0Var.L();
        }
        long j13 = j12;
        long j14 = j10 + j11;
        long O0 = n0.O0(j13, 1000000, I2);
        a0Var2.U(2);
        int M = a0Var.M();
        int[] iArr = new int[M];
        long[] jArr = new long[M];
        long[] jArr2 = new long[M];
        long[] jArr3 = new long[M];
        long j15 = j13;
        long j16 = O0;
        int i10 = 0;
        while (i10 < M) {
            int p10 = a0Var.p();
            if ((p10 & RecyclerView.UNDEFINED_DURATION) == 0) {
                long I3 = a0Var.I();
                iArr[i10] = p10 & a.e.API_PRIORITY_OTHER;
                jArr[i10] = j14;
                jArr3[i10] = j16;
                long j17 = j15 + I3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = M;
                int[] iArr2 = iArr;
                long O02 = n0.O0(j17, 1000000, I2);
                jArr4[i10] = O02 - jArr5[i10];
                a0Var2.U(4);
                j14 += (long) iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                M = i11;
                long j18 = O02;
                j15 = j17;
                j16 = j18;
            } else {
                throw y2.a("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(O0), new d(iArr, jArr, jArr2, jArr3));
    }

    private static long C(a0 a0Var) {
        a0Var.T(8);
        return a.c(a0Var.p()) == 1 ? a0Var.L() : a0Var.I();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.util.SparseArray, android.util.SparseArray<a3.g$b>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static a3.g.b D(k4.a0 r4, android.util.SparseArray<a3.g.b> r5, boolean r6) {
        /*
            r0 = 8
            r4.T(r0)
            int r0 = r4.p()
            int r0 = a3.a.b(r0)
            int r1 = r4.p()
            if (r6 == 0) goto L_0x0019
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
            goto L_0x001d
        L_0x0019:
            java.lang.Object r5 = r5.get(r1)
        L_0x001d:
            a3.g$b r5 = (a3.g.b) r5
            if (r5 != 0) goto L_0x0023
            r4 = 0
            return r4
        L_0x0023:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0031
            long r1 = r4.L()
            a3.q r6 = r5.f266b
            r6.f340c = r1
            r6.f341d = r1
        L_0x0031:
            a3.c r6 = r5.f269e
            r1 = r0 & 2
            if (r1 == 0) goto L_0x003e
            int r1 = r4.p()
            int r1 = r1 + -1
            goto L_0x0040
        L_0x003e:
            int r1 = r6.f224a
        L_0x0040:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0049
            int r2 = r4.p()
            goto L_0x004b
        L_0x0049:
            int r2 = r6.f225b
        L_0x004b:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0054
            int r3 = r4.p()
            goto L_0x0056
        L_0x0054:
            int r3 = r6.f226c
        L_0x0056:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x005f
            int r4 = r4.p()
            goto L_0x0061
        L_0x005f:
            int r4 = r6.f227d
        L_0x0061:
            a3.q r6 = r5.f266b
            a3.c r0 = new a3.c
            r0.<init>(r1, r2, r3, r4)
            r6.f338a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.g.D(k4.a0, android.util.SparseArray, boolean):a3.g$b");
    }

    private static void E(a.C0002a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws y2 {
        b D2 = D(((a.b) k4.a.e(aVar.g(1952868452))).f194b, sparseArray, z10);
        if (D2 != null) {
            q qVar = D2.f266b;
            long j10 = qVar.f354q;
            boolean z11 = qVar.f355r;
            D2.k();
            boolean unused = D2.f276l = true;
            a.b g10 = aVar.g(1952867444);
            if (g10 == null || (i10 & 2) != 0) {
                qVar.f354q = j10;
                qVar.f355r = z11;
            } else {
                qVar.f354q = C(g10.f194b);
                qVar.f355r = true;
            }
            H(aVar, D2, i10);
            p a10 = D2.f268d.f356a.a(((c) k4.a.e(qVar.f338a)).f224a);
            a.b g11 = aVar.g(1935763834);
            if (g11 != null) {
                x((p) k4.a.e(a10), g11.f194b, qVar);
            }
            a.b g12 = aVar.g(1935763823);
            if (g12 != null) {
                w(g12.f194b, qVar);
            }
            a.b g13 = aVar.g(1936027235);
            if (g13 != null) {
                A(g13.f194b, qVar);
            }
            y(aVar, a10 != null ? a10.f334b : null, qVar);
            int size = aVar.f192c.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f192c.get(i11);
                if (bVar.f190a == 1970628964) {
                    I(bVar.f194b, qVar, bArr);
                }
            }
        }
    }

    private static Pair<Integer, c> F(a0 a0Var) {
        a0Var.T(12);
        return Pair.create(Integer.valueOf(a0Var.p()), new c(a0Var.p() - 1, a0Var.p(), a0Var.p(), a0Var.p()));
    }

    private static int G(b bVar, int i10, int i11, a0 a0Var, int i12) throws y2 {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        b bVar2 = bVar;
        a0Var.T(8);
        int b10 = a.b(a0Var.p());
        o oVar = bVar2.f268d.f356a;
        q qVar = bVar2.f266b;
        c cVar = (c) n0.j(qVar.f338a);
        qVar.f345h[i10] = a0Var.K();
        long[] jArr = qVar.f344g;
        jArr[i10] = qVar.f340c;
        if ((b10 & 1) != 0) {
            jArr[i10] = jArr[i10] + ((long) a0Var.p());
        }
        boolean z15 = (b10 & 4) != 0;
        int i16 = cVar.f227d;
        if (z15) {
            i16 = a0Var.p();
        }
        boolean z16 = (b10 & 256) != 0;
        boolean z17 = (b10 & 512) != 0;
        boolean z18 = (b10 & 1024) != 0;
        boolean z19 = (b10 & 2048) != 0;
        long j10 = 0;
        if (l(oVar)) {
            j10 = ((long[]) n0.j(oVar.f330i))[0];
        }
        int[] iArr = qVar.f346i;
        long[] jArr2 = qVar.f347j;
        boolean[] zArr = qVar.f348k;
        int i17 = i16;
        boolean z20 = oVar.f323b == 2 && (i11 & 1) != 0;
        int i18 = i12 + qVar.f345h[i10];
        boolean z21 = z20;
        long[] jArr3 = jArr2;
        boolean[] zArr2 = zArr;
        long j11 = oVar.f324c;
        long j12 = qVar.f354q;
        int i19 = i12;
        while (i19 < i18) {
            int d10 = d(z16 ? a0Var.p() : cVar.f225b);
            if (z17) {
                i13 = a0Var.p();
                z10 = z16;
            } else {
                z10 = z16;
                i13 = cVar.f226c;
            }
            int d11 = d(i13);
            if (z18) {
                z11 = z15;
                i14 = a0Var.p();
            } else if (i19 != 0 || !z15) {
                z11 = z15;
                i14 = cVar.f227d;
            } else {
                z11 = z15;
                i14 = i17;
            }
            if (z19) {
                z14 = z19;
                z13 = z17;
                z12 = z18;
                i15 = a0Var.p();
            } else {
                z14 = z19;
                z13 = z17;
                z12 = z18;
                i15 = 0;
            }
            jArr3[i19] = n0.O0((((long) i15) + j12) - j10, 1000000, j11);
            if (!qVar.f355r) {
                jArr3[i19] = jArr3[i19] + bVar2.f268d.f363h;
            }
            iArr[i19] = d11;
            zArr2[i19] = ((i14 >> 16) & 1) == 0 && (!z21 || i19 == 0);
            j12 += (long) d10;
            i19++;
            bVar2 = bVar;
            z16 = z10;
            z15 = z11;
            z19 = z14;
            z17 = z13;
            z18 = z12;
        }
        qVar.f354q = j12;
        return i18;
    }

    private static void H(a.C0002a aVar, b bVar, int i10) throws y2 {
        List<a.b> list = aVar.f192c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f190a == 1953658222) {
                a0 a0Var = bVar2.f194b;
                a0Var.T(12);
                int K2 = a0Var.K();
                if (K2 > 0) {
                    i12 += K2;
                    i11++;
                }
            }
        }
        bVar.f272h = 0;
        bVar.f271g = 0;
        bVar.f270f = 0;
        bVar.f266b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f190a == 1953658222) {
                i15 = G(bVar, i14, i10, bVar3.f194b, i15);
                i14++;
            }
        }
    }

    private static void I(a0 a0Var, q qVar, byte[] bArr) throws y2 {
        a0Var.T(8);
        a0Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            z(a0Var, 16, qVar);
        }
    }

    private void J(long j10) throws y2 {
        while (!this.f248m.isEmpty() && this.f248m.peek().f191b == j10) {
            o(this.f248m.pop());
        }
        f();
    }

    private boolean K(s2.m mVar) throws IOException {
        if (this.f254s == 0) {
            if (!mVar.d(this.f247l.e(), 0, 8, true)) {
                return false;
            }
            this.f254s = 8;
            this.f247l.T(0);
            this.f253r = this.f247l.I();
            this.f252q = this.f247l.p();
        }
        long j10 = this.f253r;
        if (j10 == 1) {
            mVar.readFully(this.f247l.e(), 8, 8);
            this.f254s += 8;
            this.f253r = this.f247l.L();
        } else if (j10 == 0) {
            long b10 = mVar.b();
            if (b10 == -1 && !this.f248m.isEmpty()) {
                b10 = this.f248m.peek().f191b;
            }
            if (b10 != -1) {
                this.f253r = (b10 - mVar.c()) + ((long) this.f254s);
            }
        }
        if (this.f253r >= ((long) this.f254s)) {
            long c10 = mVar.c() - ((long) this.f254s);
            int i10 = this.f252q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.j(new b0.b(this.f259x, c10));
                this.H = true;
            }
            if (this.f252q == 1836019558) {
                int size = this.f239d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    q qVar = this.f239d.valueAt(i11).f266b;
                    qVar.f339b = c10;
                    qVar.f341d = c10;
                    qVar.f340c = c10;
                }
            }
            int i12 = this.f252q;
            if (i12 == 1835295092) {
                this.f261z = null;
                this.f256u = c10 + this.f253r;
                this.f251p = 2;
                return true;
            }
            if (O(i12)) {
                long c11 = (mVar.c() + this.f253r) - 8;
                this.f248m.push(new a.C0002a(this.f252q, c11));
                if (this.f253r == ((long) this.f254s)) {
                    J(c11);
                } else {
                    f();
                }
            } else if (P(this.f252q)) {
                if (this.f254s != 8) {
                    throw y2.d("Leaf atom defines extended atom size (unsupported).");
                } else if (this.f253r <= 2147483647L) {
                    a0 a0Var = new a0((int) this.f253r);
                    System.arraycopy(this.f247l.e(), 0, a0Var.e(), 0, 8);
                    this.f255t = a0Var;
                    this.f251p = 1;
                } else {
                    throw y2.d("Leaf atom with length > 2147483647 (unsupported).");
                }
            } else if (this.f253r <= 2147483647L) {
                this.f255t = null;
                this.f251p = 1;
            } else {
                throw y2.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw y2.d("Atom size less than header length (unsupported).");
    }

    private void L(s2.m mVar) throws IOException {
        int i10 = ((int) this.f253r) - this.f254s;
        a0 a0Var = this.f255t;
        if (a0Var != null) {
            mVar.readFully(a0Var.e(), 8, i10);
            q(new a.b(this.f252q, a0Var), mVar.c());
        } else {
            mVar.m(i10);
        }
        J(mVar.c());
    }

    private void M(s2.m mVar) throws IOException {
        int size = this.f239d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f239d.valueAt(i10).f266b;
            if (qVar.f353p) {
                long j11 = qVar.f341d;
                if (j11 < j10) {
                    bVar = this.f239d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f251p = 3;
            return;
        }
        int c10 = (int) (j10 - mVar.c());
        if (c10 >= 0) {
            mVar.m(c10);
            bVar.f266b.b(mVar);
            return;
        }
        throw y2.a("Offset to encryption data was negative.", (Throwable) null);
    }

    private boolean N(s2.m mVar) throws IOException {
        int i10;
        s2.m mVar2 = mVar;
        b bVar = this.f261z;
        Throwable th = null;
        if (bVar == null) {
            bVar = j(this.f239d);
            if (bVar == null) {
                int c10 = (int) (this.f256u - mVar.c());
                if (c10 >= 0) {
                    mVar2.m(c10);
                    f();
                    return false;
                }
                throw y2.a("Offset to end of mdat was negative.", (Throwable) null);
            }
            int d10 = (int) (bVar.d() - mVar.c());
            if (d10 < 0) {
                k4.r.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            mVar2.m(d10);
            this.f261z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f251p == 3) {
            int f10 = bVar.f();
            this.A = f10;
            if (bVar.f270f < bVar.f273i) {
                mVar2.m(f10);
                bVar.m();
                if (!bVar.h()) {
                    this.f261z = null;
                }
                this.f251p = 3;
                return true;
            }
            if (bVar.f268d.f356a.f328g == 1) {
                this.A = f10 - 8;
                mVar2.m(8);
            }
            if ("audio/ac4".equals(bVar.f268d.f356a.f327f.f20654m)) {
                this.B = bVar.i(this.A, 7);
                p2.c.a(this.A, this.f244i);
                bVar.f265a.d(this.f244i, 7);
                this.B += 7;
            } else {
                this.B = bVar.i(this.A, 0);
            }
            this.A += this.B;
            this.f251p = 4;
            this.C = 0;
        }
        o oVar = bVar.f268d.f356a;
        e0 e0Var = bVar.f265a;
        long e10 = bVar.e();
        j0 j0Var = this.f245j;
        if (j0Var != null) {
            e10 = j0Var.a(e10);
        }
        long j10 = e10;
        if (oVar.f331j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += e0Var.e(mVar2, i14 - i13, false);
            }
        } else {
            byte[] e11 = this.f241f.e();
            e11[0] = 0;
            e11[1] = 0;
            e11[2] = 0;
            int i15 = oVar.f331j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    mVar2.readFully(e11, i17, i16);
                    this.f241f.T(0);
                    int p10 = this.f241f.p();
                    if (p10 >= i12) {
                        this.C = p10 - 1;
                        this.f240e.T(0);
                        e0Var.d(this.f240e, i11);
                        e0Var.d(this.f241f, i12);
                        this.D = this.G.length > 0 && w.g(oVar.f327f.f20654m, e11[i11]);
                        this.B += 5;
                        this.A += i17;
                    } else {
                        throw y2.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.f242g.P(i18);
                        mVar2.readFully(this.f242g.e(), 0, this.C);
                        e0Var.d(this.f242g, this.C);
                        i10 = this.C;
                        int q10 = w.q(this.f242g.e(), this.f242g.g());
                        this.f242g.T(MimeTypes.VIDEO_H265.equals(oVar.f327f.f20654m) ? 1 : 0);
                        this.f242g.S(q10);
                        s2.c.a(j10, this.f242g, this.G);
                    } else {
                        i10 = e0Var.e(mVar2, i18, false);
                    }
                    this.B += i10;
                    this.C -= i10;
                    th = null;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int c11 = bVar.c();
        p g10 = bVar.g();
        e0Var.b(j10, c11, this.A, 0, g10 != null ? g10.f335c : null);
        t(j10);
        if (!bVar.h()) {
            this.f261z = null;
        }
        this.f251p = 3;
        return true;
    }

    private static boolean O(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean P(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int d(int i10) throws y2 {
        if (i10 >= 0) {
            return i10;
        }
        throw y2.a("Unexpected negative value: " + i10, (Throwable) null);
    }

    private void f() {
        this.f251p = 0;
        this.f254s = 0;
    }

    private c h(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) k4.a.e(sparseArray.get(i10));
    }

    private static m i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f190a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e10 = bVar.f194b.e();
                UUID f10 = l.f(e10);
                if (f10 == null) {
                    k4.r.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f10, "video/mp4", e10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new m((List<m.b>) arrayList);
    }

    private static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f276l || valueAt.f270f != valueAt.f268d.f357b) && (!valueAt.f276l || valueAt.f272h != valueAt.f266b.f342e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void k() {
        int i10;
        e0[] e0VarArr = new e0[2];
        this.F = e0VarArr;
        e0 e0Var = this.f250o;
        int i11 = 0;
        if (e0Var != null) {
            e0VarArr[0] = e0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f236a & 4) != 0) {
            e0VarArr[i10] = this.E.e(100, 5);
            i10++;
            i12 = 101;
        }
        e0[] e0VarArr2 = (e0[]) n0.H0(this.F, i10);
        this.F = e0VarArr2;
        for (e0 a10 : e0VarArr2) {
            a10.a(K);
        }
        this.G = new e0[this.f238c.size()];
        while (i11 < this.G.length) {
            e0 e10 = this.E.e(i12, 3);
            e10.a(this.f238c.get(i11));
            this.G[i11] = e10;
            i11++;
            i12++;
        }
    }

    private static boolean l(o oVar) {
        long[] jArr;
        long[] jArr2 = oVar.f329h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = oVar.f330i) == null) {
            return false;
        }
        if (jArr2[0] != 0 && n0.O0(jArr2[0] + jArr[0], 1000000, oVar.f325d) < oVar.f326e) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] m() {
        return new l[]{new g()};
    }

    private void o(a.C0002a aVar) throws y2 {
        int i10 = aVar.f190a;
        if (i10 == 1836019574) {
            s(aVar);
        } else if (i10 == 1836019558) {
            r(aVar);
        } else if (!this.f248m.isEmpty()) {
            this.f248m.peek().d(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void p(k4.a0 r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            s2.e0[] r2 = r0.F
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.T(r2)
            int r2 = r28.p()
            int r2 = a3.a.c(r2)
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            if (r2 == r3) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            k4.r.i(r2, r1)
            return
        L_0x0038:
            long r12 = r28.I()
            long r6 = r28.L()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = k4.n0.O0(r6, r8, r10)
            long r6 = r28.I()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = k4.n0.O0(r6, r8, r10)
            long r8 = r28.I()
            java.lang.String r2 = r28.A()
            java.lang.Object r2 = k4.a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = r28.A()
            java.lang.Object r10 = k4.a.e(r10)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r2
            r22 = r6
            r24 = r8
            r21 = r10
            r8 = r4
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r28.A()
            java.lang.Object r2 = k4.a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r28.A()
            java.lang.Object r6 = k4.a.e(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            long r6 = r28.I()
            long r11 = r28.I()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = k4.n0.O0(r11, r13, r15)
            long r11 = r0.f260y
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            long r11 = r11 + r8
            r17 = r11
            goto L_0x00a5
        L_0x00a3:
            r17 = r4
        L_0x00a5:
            long r11 = r28.I()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = r6
            long r6 = k4.n0.O0(r11, r13, r15)
            long r11 = r28.I()
            r20 = r2
            r22 = r6
            r21 = r10
            r24 = r11
            r14 = r17
        L_0x00be:
            int r2 = r28.a()
            byte[] r2 = new byte[r2]
            int r6 = r28.a()
            r7 = 0
            r1.l(r2, r7, r6)
            h3.a r1 = new h3.a
            r19 = r1
            r26 = r2
            r19.<init>(r20, r21, r22, r24, r26)
            k4.a0 r2 = new k4.a0
            h3.c r6 = r0.f246k
            byte[] r1 = r6.a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.a()
            s2.e0[] r6 = r0.F
            int r10 = r6.length
            r11 = 0
        L_0x00e8:
            if (r11 >= r10) goto L_0x00f5
            r12 = r6[r11]
            r2.T(r7)
            r12.d(r2, r1)
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque<a3.g$a> r2 = r0.f249n
            a3.g$a r4 = new a3.g$a
            r4.<init>(r8, r3, r1)
            r2.addLast(r4)
            int r2 = r0.f257v
            int r2 = r2 + r1
            r0.f257v = r2
            goto L_0x0140
        L_0x0109:
            java.util.ArrayDeque<a3.g$a> r2 = r0.f249n
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0121
            java.util.ArrayDeque<a3.g$a> r2 = r0.f249n
            a3.g$a r3 = new a3.g$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f257v
            int r2 = r2 + r1
            r0.f257v = r2
            goto L_0x0140
        L_0x0121:
            k4.j0 r2 = r0.f245j
            if (r2 == 0) goto L_0x0129
            long r14 = r2.a(r14)
        L_0x0129:
            s2.e0[] r2 = r0.F
            int r3 = r2.length
        L_0x012c:
            if (r7 >= r3) goto L_0x0140
            r16 = r2[r7]
            r19 = 1
            r21 = 0
            r22 = 0
            r17 = r14
            r20 = r1
            r16.b(r17, r19, r20, r21, r22)
            int r7 = r7 + 1
            goto L_0x012c
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.g.p(k4.a0):void");
    }

    private void q(a.b bVar, long j10) throws y2 {
        if (!this.f248m.isEmpty()) {
            this.f248m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f190a;
        if (i10 == 1936286840) {
            Pair<Long, d> B2 = B(bVar.f194b, j10);
            this.f260y = ((Long) B2.first).longValue();
            this.E.j((b0) B2.second);
            this.H = true;
        } else if (i10 == 1701671783) {
            p(bVar.f194b);
        }
    }

    private void r(a.C0002a aVar) throws y2 {
        v(aVar, this.f239d, this.f237b != null, this.f236a, this.f243h);
        m i10 = i(aVar.f192c);
        if (i10 != null) {
            int size = this.f239d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f239d.valueAt(i11).n(i10);
            }
        }
        if (this.f258w != -9223372036854775807L) {
            int size2 = this.f239d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f239d.valueAt(i12).l(this.f258w);
            }
            this.f258w = -9223372036854775807L;
        }
    }

    private void s(a.C0002a aVar) throws y2 {
        boolean z10 = true;
        int i10 = 0;
        k4.a.g(this.f237b == null, "Unexpected moov box.");
        m i11 = i(aVar.f192c);
        a.C0002a aVar2 = (a.C0002a) k4.a.e(aVar.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f192c.size();
        long j10 = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = aVar2.f192c.get(i12);
            int i13 = bVar.f190a;
            if (i13 == 1953654136) {
                Pair<Integer, c> F2 = F(bVar.f194b);
                sparseArray.put(((Integer) F2.first).intValue(), (c) F2.second);
            } else if (i13 == 1835362404) {
                j10 = u(bVar.f194b);
            }
        }
        List<r> A2 = b.A(aVar, new x(), j10, i11, (this.f236a & 16) != 0, false, new e(this));
        int size2 = A2.size();
        if (this.f239d.size() == 0) {
            while (i10 < size2) {
                r rVar = A2.get(i10);
                o oVar = rVar.f356a;
                this.f239d.put(oVar.f322a, new b(this.E.e(i10, oVar.f323b), rVar, h(sparseArray, oVar.f322a)));
                this.f259x = Math.max(this.f259x, oVar.f326e);
                i10++;
            }
            this.E.q();
            return;
        }
        if (this.f239d.size() != size2) {
            z10 = false;
        }
        k4.a.f(z10);
        while (i10 < size2) {
            r rVar2 = A2.get(i10);
            o oVar2 = rVar2.f356a;
            this.f239d.get(oVar2.f322a).j(rVar2, h(sparseArray, oVar2.f322a));
            i10++;
        }
    }

    private void t(long j10) {
        while (!this.f249n.isEmpty()) {
            a removeFirst = this.f249n.removeFirst();
            this.f257v -= removeFirst.f264c;
            long j11 = removeFirst.f262a;
            if (removeFirst.f263b) {
                j11 += j10;
            }
            j0 j0Var = this.f245j;
            if (j0Var != null) {
                j11 = j0Var.a(j11);
            }
            for (e0 b10 : this.F) {
                b10.b(j11, 1, removeFirst.f264c, this.f257v, (e0.a) null);
            }
        }
    }

    private static long u(a0 a0Var) {
        a0Var.T(8);
        return a.c(a0Var.p()) == 0 ? a0Var.I() : a0Var.L();
    }

    private static void v(a.C0002a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws y2 {
        int size = aVar.f193d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0002a aVar2 = aVar.f193d.get(i11);
            if (aVar2.f190a == 1953653094) {
                E(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void w(a0 a0Var, q qVar) throws y2 {
        a0Var.T(8);
        int p10 = a0Var.p();
        if ((a.b(p10) & 1) == 1) {
            a0Var.U(8);
        }
        int K2 = a0Var.K();
        if (K2 == 1) {
            qVar.f341d += a.c(p10) == 0 ? a0Var.I() : a0Var.L();
            return;
        }
        throw y2.a("Unexpected saio entry count: " + K2, (Throwable) null);
    }

    private static void x(p pVar, a0 a0Var, q qVar) throws y2 {
        int i10;
        int i11 = pVar.f336d;
        a0Var.T(8);
        boolean z10 = true;
        if ((a.b(a0Var.p()) & 1) == 1) {
            a0Var.U(8);
        }
        int G2 = a0Var.G();
        int K2 = a0Var.K();
        if (K2 <= qVar.f343f) {
            if (G2 == 0) {
                boolean[] zArr = qVar.f350m;
                i10 = 0;
                for (int i12 = 0; i12 < K2; i12++) {
                    int G3 = a0Var.G();
                    i10 += G3;
                    zArr[i12] = G3 > i11;
                }
            } else {
                if (G2 <= i11) {
                    z10 = false;
                }
                i10 = (G2 * K2) + 0;
                Arrays.fill(qVar.f350m, 0, K2, z10);
            }
            Arrays.fill(qVar.f350m, K2, qVar.f343f, false);
            if (i10 > 0) {
                qVar.d(i10);
                return;
            }
            return;
        }
        throw y2.a("Saiz sample count " + K2 + " is greater than fragment sample count" + qVar.f343f, (Throwable) null);
    }

    private static void y(a.C0002a aVar, String str, q qVar) throws y2 {
        a.C0002a aVar2 = aVar;
        q qVar2 = qVar;
        byte[] bArr = null;
        a0 a0Var = null;
        a0 a0Var2 = null;
        for (int i10 = 0; i10 < aVar2.f192c.size(); i10++) {
            a.b bVar = aVar2.f192c.get(i10);
            a0 a0Var3 = bVar.f194b;
            int i11 = bVar.f190a;
            if (i11 == 1935828848) {
                a0Var3.T(12);
                if (a0Var3.p() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i11 == 1936158820) {
                a0Var3.T(12);
                if (a0Var3.p() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var != null && a0Var2 != null) {
            a0Var.T(8);
            int c10 = a.c(a0Var.p());
            a0Var.U(4);
            if (c10 == 1) {
                a0Var.U(4);
            }
            if (a0Var.p() == 1) {
                a0Var2.T(8);
                int c11 = a.c(a0Var2.p());
                a0Var2.U(4);
                if (c11 == 1) {
                    if (a0Var2.I() == 0) {
                        throw y2.d("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c11 >= 2) {
                    a0Var2.U(4);
                }
                if (a0Var2.I() == 1) {
                    a0Var2.U(1);
                    int G2 = a0Var2.G();
                    int i12 = (G2 & 240) >> 4;
                    int i13 = G2 & 15;
                    boolean z10 = a0Var2.G() == 1;
                    if (z10) {
                        int G3 = a0Var2.G();
                        byte[] bArr2 = new byte[16];
                        a0Var2.l(bArr2, 0, 16);
                        if (G3 == 0) {
                            int G4 = a0Var2.G();
                            bArr = new byte[G4];
                            a0Var2.l(bArr, 0, G4);
                        }
                        qVar2.f349l = true;
                        qVar2.f351n = new p(z10, str, G3, bArr2, i12, i13, bArr);
                        return;
                    }
                    return;
                }
                throw y2.d("Entry count in sgpd != 1 (unsupported).");
            }
            throw y2.d("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static void z(a0 a0Var, int i10, q qVar) throws y2 {
        a0Var.T(i10 + 8);
        int b10 = a.b(a0Var.p());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int K2 = a0Var.K();
            if (K2 == 0) {
                Arrays.fill(qVar.f350m, 0, qVar.f343f, false);
            } else if (K2 == qVar.f343f) {
                Arrays.fill(qVar.f350m, 0, K2, z10);
                qVar.d(a0Var.a());
                qVar.a(a0Var);
            } else {
                throw y2.a("Senc sample count " + K2 + " is different from fragment sample count" + qVar.f343f, (Throwable) null);
            }
        } else {
            throw y2.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    public void b(n nVar) {
        this.E = nVar;
        f();
        k();
        o oVar = this.f237b;
        if (oVar != null) {
            this.f239d.put(0, new b(nVar.e(0, oVar.f323b), new r(this.f237b, new long[0], new int[0], 0, new long[0], new int[0], 0), new c(0, 0, 0, 0)));
            this.E.q();
        }
    }

    public void c(long j10, long j11) {
        int size = this.f239d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f239d.valueAt(i10).k();
        }
        this.f249n.clear();
        this.f257v = 0;
        this.f258w = j11;
        this.f248m.clear();
        f();
    }

    public boolean e(s2.m mVar) throws IOException {
        return n.b(mVar);
    }

    public int g(s2.m mVar, s2.a0 a0Var) throws IOException {
        while (true) {
            int i10 = this.f251p;
            if (i10 != 0) {
                if (i10 == 1) {
                    L(mVar);
                } else if (i10 == 2) {
                    M(mVar);
                } else if (N(mVar)) {
                    return 0;
                }
            } else if (!K(mVar)) {
                return -1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public o n(o oVar) {
        return oVar;
    }

    public void release() {
    }

    public g(int i10) {
        this(i10, (j0) null);
    }

    public g(int i10, j0 j0Var) {
        this(i10, j0Var, (o) null, Collections.emptyList());
    }

    public g(int i10, j0 j0Var, o oVar) {
        this(i10, j0Var, oVar, Collections.emptyList());
    }

    public g(int i10, j0 j0Var, o oVar, List<r1> list) {
        this(i10, j0Var, oVar, list, (e0) null);
    }

    public g(int i10, j0 j0Var, o oVar, List<r1> list, e0 e0Var) {
        this.f236a = i10;
        this.f245j = j0Var;
        this.f237b = oVar;
        this.f238c = Collections.unmodifiableList(list);
        this.f250o = e0Var;
        this.f246k = new c();
        this.f247l = new a0(16);
        this.f240e = new a0(w.f19780a);
        this.f241f = new a0(5);
        this.f242g = new a0();
        byte[] bArr = new byte[16];
        this.f243h = bArr;
        this.f244i = new a0(bArr);
        this.f248m = new ArrayDeque<>();
        this.f249n = new ArrayDeque<>();
        this.f239d = new SparseArray<>();
        this.f259x = -9223372036854775807L;
        this.f258w = -9223372036854775807L;
        this.f260y = -9223372036854775807L;
        this.E = n.D1;
        this.F = new e0[0];
        this.G = new e0[0];
    }
}
