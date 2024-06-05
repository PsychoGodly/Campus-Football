package a3;

import a3.a;
import android.util.Pair;
import f3.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k4.a0;
import k4.n0;
import k4.w;
import l3.b;
import n2.r1;
import n2.y2;
import p2.c;
import s2.b0;
import s2.e0;
import s2.f0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;
import s2.x;

/* compiled from: Mp4Extractor */
public final class k implements l, b0 {

    /* renamed from: y  reason: collision with root package name */
    public static final r f280y = j.f279b;

    /* renamed from: a  reason: collision with root package name */
    private final int f281a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f282b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f283c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f284d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f285e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<a.C0002a> f286f;

    /* renamed from: g  reason: collision with root package name */
    private final m f287g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a.b> f288h;

    /* renamed from: i  reason: collision with root package name */
    private int f289i;

    /* renamed from: j  reason: collision with root package name */
    private int f290j;

    /* renamed from: k  reason: collision with root package name */
    private long f291k;

    /* renamed from: l  reason: collision with root package name */
    private int f292l;

    /* renamed from: m  reason: collision with root package name */
    private a0 f293m;

    /* renamed from: n  reason: collision with root package name */
    private int f294n;

    /* renamed from: o  reason: collision with root package name */
    private int f295o;

    /* renamed from: p  reason: collision with root package name */
    private int f296p;

    /* renamed from: q  reason: collision with root package name */
    private int f297q;

    /* renamed from: r  reason: collision with root package name */
    private n f298r;

    /* renamed from: s  reason: collision with root package name */
    private a[] f299s;

    /* renamed from: t  reason: collision with root package name */
    private long[][] f300t;

    /* renamed from: u  reason: collision with root package name */
    private int f301u;

    /* renamed from: v  reason: collision with root package name */
    private long f302v;

    /* renamed from: w  reason: collision with root package name */
    private int f303w;

    /* renamed from: x  reason: collision with root package name */
    private b f304x;

    /* compiled from: Mp4Extractor */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f305a;

        /* renamed from: b  reason: collision with root package name */
        public final r f306b;

        /* renamed from: c  reason: collision with root package name */
        public final e0 f307c;

        /* renamed from: d  reason: collision with root package name */
        public final f0 f308d;

        /* renamed from: e  reason: collision with root package name */
        public int f309e;

        public a(o oVar, r rVar, e0 e0Var) {
            this.f305a = oVar;
            this.f306b = rVar;
            this.f307c = e0Var;
            this.f308d = "audio/true-hd".equals(oVar.f327f.f20654m) ? new f0() : null;
        }
    }

    public k() {
        this(0);
    }

    private boolean A(m mVar) throws IOException {
        a.C0002a peek;
        if (this.f292l == 0) {
            if (!mVar.d(this.f285e.e(), 0, 8, true)) {
                w();
                return false;
            }
            this.f292l = 8;
            this.f285e.T(0);
            this.f291k = this.f285e.I();
            this.f290j = this.f285e.p();
        }
        long j10 = this.f291k;
        if (j10 == 1) {
            mVar.readFully(this.f285e.e(), 8, 8);
            this.f292l += 8;
            this.f291k = this.f285e.L();
        } else if (j10 == 0) {
            long b10 = mVar.b();
            if (b10 == -1 && (peek = this.f286f.peek()) != null) {
                b10 = peek.f191b;
            }
            if (b10 != -1) {
                this.f291k = (b10 - mVar.c()) + ((long) this.f292l);
            }
        }
        if (this.f291k >= ((long) this.f292l)) {
            if (E(this.f290j)) {
                long c10 = mVar.c();
                long j11 = this.f291k;
                int i10 = this.f292l;
                long j12 = (c10 + j11) - ((long) i10);
                if (j11 != ((long) i10) && this.f290j == 1835365473) {
                    u(mVar);
                }
                this.f286f.push(new a.C0002a(this.f290j, j12));
                if (this.f291k == ((long) this.f292l)) {
                    v(j12);
                } else {
                    n();
                }
            } else if (F(this.f290j)) {
                k4.a.f(this.f292l == 8);
                k4.a.f(this.f291k <= 2147483647L);
                a0 a0Var = new a0((int) this.f291k);
                System.arraycopy(this.f285e.e(), 0, a0Var.e(), 0, 8);
                this.f293m = a0Var;
                this.f289i = 1;
            } else {
                z(mVar.c() - ((long) this.f292l));
                this.f293m = null;
                this.f289i = 1;
            }
            return true;
        }
        throw y2.d("Atom size less than header length (unsupported).");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean B(s2.m r10, s2.a0 r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f291k
            int r2 = r9.f292l
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.c()
            long r2 = r2 + r0
            k4.a0 r4 = r9.f293m
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.e()
            int r7 = r9.f292l
            int r1 = (int) r0
            r10.readFully(r11, r7, r1)
            int r10 = r9.f290j
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = x(r4)
            r9.f303w = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque<a3.a$a> r10 = r9.f286f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque<a3.a$a> r10 = r9.f286f
            java.lang.Object r10 = r10.peek()
            a3.a$a r10 = (a3.a.C0002a) r10
            a3.a$b r11 = new a3.a$b
            int r0 = r9.f290j
            r11.<init>(r0, r4)
            r10.e(r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.m(r11)
        L_0x004f:
            r10 = 0
            goto L_0x0059
        L_0x0051:
            long r7 = r10.c()
            long r7 = r7 + r0
            r11.f22378a = r7
            r10 = 1
        L_0x0059:
            r9.v(r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.f289i
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.k.B(s2.m, s2.a0):boolean");
    }

    private int C(m mVar, s2.a0 a0Var) throws IOException {
        int i10;
        s2.a0 a0Var2;
        m mVar2 = mVar;
        long c10 = mVar.c();
        if (this.f294n == -1) {
            int q10 = q(c10);
            this.f294n = q10;
            if (q10 == -1) {
                return -1;
            }
        }
        a aVar = this.f299s[this.f294n];
        e0 e0Var = aVar.f307c;
        int i11 = aVar.f309e;
        r rVar = aVar.f306b;
        long j10 = rVar.f358c[i11];
        int i12 = rVar.f359d[i11];
        f0 f0Var = aVar.f308d;
        long j11 = (j10 - c10) + ((long) this.f295o);
        if (j11 < 0) {
            i10 = 1;
            a0Var2 = a0Var;
        } else if (j11 >= 262144) {
            a0Var2 = a0Var;
            i10 = 1;
        } else {
            if (aVar.f305a.f328g == 1) {
                j11 += 8;
                i12 -= 8;
            }
            mVar2.m((int) j11);
            o oVar = aVar.f305a;
            if (oVar.f331j == 0) {
                if ("audio/ac4".equals(oVar.f327f.f20654m)) {
                    if (this.f296p == 0) {
                        c.a(i12, this.f284d);
                        e0Var.d(this.f284d, 7);
                        this.f296p += 7;
                    }
                    i12 += 7;
                } else if (f0Var != null) {
                    f0Var.d(mVar2);
                }
                while (true) {
                    int i13 = this.f296p;
                    if (i13 >= i12) {
                        break;
                    }
                    int e10 = e0Var.e(mVar2, i12 - i13, false);
                    this.f295o += e10;
                    this.f296p += e10;
                    this.f297q -= e10;
                }
            } else {
                byte[] e11 = this.f283c.e();
                e11[0] = 0;
                e11[1] = 0;
                e11[2] = 0;
                int i14 = aVar.f305a.f331j;
                int i15 = 4 - i14;
                while (this.f296p < i12) {
                    int i16 = this.f297q;
                    if (i16 == 0) {
                        mVar2.readFully(e11, i15, i14);
                        this.f295o += i14;
                        this.f283c.T(0);
                        int p10 = this.f283c.p();
                        if (p10 >= 0) {
                            this.f297q = p10;
                            this.f282b.T(0);
                            e0Var.d(this.f282b, 4);
                            this.f296p += 4;
                            i12 += i15;
                        } else {
                            throw y2.a("Invalid NAL length", (Throwable) null);
                        }
                    } else {
                        int e12 = e0Var.e(mVar2, i16, false);
                        this.f295o += e12;
                        this.f296p += e12;
                        this.f297q -= e12;
                    }
                }
            }
            int i17 = i12;
            r rVar2 = aVar.f306b;
            long j12 = rVar2.f361f[i11];
            int i18 = rVar2.f362g[i11];
            if (f0Var != null) {
                int i19 = i17;
                f0 f0Var2 = f0Var;
                f0Var.c(e0Var, j12, i18, i19, 0, (e0.a) null);
                if (i11 + 1 == aVar.f306b.f357b) {
                    f0Var2.a(e0Var, (e0.a) null);
                }
            } else {
                e0Var.b(j12, i18, i17, 0, (e0.a) null);
            }
            aVar.f309e++;
            this.f294n = -1;
            this.f295o = 0;
            this.f296p = 0;
            this.f297q = 0;
            return 0;
        }
        a0Var2.f22378a = j10;
        return i10;
    }

    private int D(m mVar, s2.a0 a0Var) throws IOException {
        int c10 = this.f287g.c(mVar, a0Var, this.f288h);
        if (c10 == 1 && a0Var.f22378a == 0) {
            n();
        }
        return c10;
    }

    private static boolean E(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean F(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void G(a aVar, long j10) {
        r rVar = aVar.f306b;
        int a10 = rVar.a(j10);
        if (a10 == -1) {
            a10 = rVar.b(j10);
        }
        aVar.f309e = a10;
    }

    private static int l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f306b.f357b];
            jArr2[i10] = aVarArr[i10].f306b.f361f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13] && jArr2[i13] <= j11) {
                    j11 = jArr2[i13];
                    i12 = i13;
                }
            }
            int i14 = iArr[i12];
            jArr[i12][i14] = j10;
            j10 += (long) aVarArr[i12].f306b.f359d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr[i12].length) {
                jArr2[i12] = aVarArr[i12].f306b.f361f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void n() {
        this.f289i = 0;
        this.f292l = 0;
    }

    private static int p(r rVar, long j10) {
        int a10 = rVar.a(j10);
        return a10 == -1 ? rVar.b(j10) : a10;
    }

    private int q(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f299s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f309e;
            r rVar = aVar.f306b;
            if (i13 != rVar.f357b) {
                long j14 = rVar.f358c[i13];
                long j15 = ((long[][]) n0.j(this.f300t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ o r(o oVar) {
        return oVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] s() {
        return new l[]{new k()};
    }

    private static long t(r rVar, long j10, long j11) {
        int p10 = p(rVar, j10);
        if (p10 == -1) {
            return j11;
        }
        return Math.min(rVar.f358c[p10], j11);
    }

    private void u(m mVar) throws IOException {
        this.f284d.P(8);
        mVar.p(this.f284d.e(), 0, 8);
        b.e(this.f284d);
        mVar.m(this.f284d.f());
        mVar.l();
    }

    private void v(long j10) throws y2 {
        while (!this.f286f.isEmpty() && this.f286f.peek().f191b == j10) {
            a.C0002a pop = this.f286f.pop();
            if (pop.f190a == 1836019574) {
                y(pop);
                this.f286f.clear();
                this.f289i = 2;
            } else if (!this.f286f.isEmpty()) {
                this.f286f.peek().d(pop);
            }
        }
        if (this.f289i != 2) {
            n();
        }
    }

    private void w() {
        f3.a aVar;
        if (this.f303w == 2 && (this.f281a & 2) != 0) {
            e0 e10 = this.f298r.e(0, 4);
            if (this.f304x == null) {
                aVar = null;
            } else {
                aVar = new f3.a(this.f304x);
            }
            e10.a(new r1.b().Z(aVar).G());
            this.f298r.q();
            this.f298r.j(new b0.b(-9223372036854775807L));
        }
    }

    private static int x(a0 a0Var) {
        a0Var.T(8);
        int l10 = l(a0Var.p());
        if (l10 != 0) {
            return l10;
        }
        a0Var.U(4);
        while (a0Var.a() > 0) {
            int l11 = l(a0Var.p());
            if (l11 != 0) {
                return l11;
            }
        }
        return 0;
    }

    private void y(a.C0002a aVar) throws y2 {
        f3.a aVar2;
        f3.a aVar3;
        int i10;
        List<r> list;
        int i11;
        int i12;
        a.C0002a aVar4 = aVar;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f303w == 1;
        x xVar = new x();
        a.b g10 = aVar4.g(1969517665);
        if (g10 != null) {
            Pair<f3.a, f3.a> B = b.B(g10);
            f3.a aVar5 = (f3.a) B.first;
            f3.a aVar6 = (f3.a) B.second;
            if (aVar5 != null) {
                xVar.c(aVar5);
            }
            aVar3 = aVar6;
            aVar2 = aVar5;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        a.C0002a f10 = aVar4.f(1835365473);
        long j10 = -9223372036854775807L;
        f3.a n10 = f10 != null ? b.n(f10) : null;
        List<r> A = b.A(aVar, xVar, -9223372036854775807L, (r2.m) null, (this.f281a & 1) != 0, z10, i.f278a);
        int size = A.size();
        long j11 = -9223372036854775807L;
        int i13 = 0;
        int i14 = -1;
        while (i13 < size) {
            r rVar = A.get(i13);
            if (rVar.f357b == 0) {
                list = A;
                i10 = size;
            } else {
                o oVar = rVar.f356a;
                list = A;
                i10 = size;
                long j12 = oVar.f326e;
                if (j12 == j10) {
                    j12 = rVar.f363h;
                }
                long max = Math.max(j11, j12);
                a aVar7 = new a(oVar, rVar, this.f298r.e(i13, oVar.f323b));
                if ("audio/true-hd".equals(oVar.f327f.f20654m)) {
                    i11 = rVar.f360e * 16;
                } else {
                    i11 = rVar.f360e + 30;
                }
                r1.b b10 = oVar.f327f.b();
                b10.Y(i11);
                if (oVar.f323b == 2 && j12 > 0 && (i12 = rVar.f357b) > 1) {
                    b10.R(((float) i12) / (((float) j12) / 1000000.0f));
                }
                h.k(oVar.f323b, xVar, b10);
                int i15 = oVar.f323b;
                f3.a[] aVarArr = new f3.a[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.f288h.isEmpty() ? null : new f3.a((List<? extends a.b>) this.f288h);
                h.l(i15, aVar2, n10, b10, aVarArr);
                aVar7.f307c.a(b10.G());
                if (oVar.f323b == 2) {
                    if (i14 == -1) {
                        i14 = arrayList.size();
                    }
                }
                arrayList.add(aVar7);
                j11 = max;
            }
            i13++;
            A = list;
            size = i10;
            j10 = -9223372036854775807L;
        }
        this.f301u = i14;
        this.f302v = j11;
        a[] aVarArr2 = (a[]) arrayList.toArray(new a[0]);
        this.f299s = aVarArr2;
        this.f300t = m(aVarArr2);
        this.f298r.q();
        this.f298r.j(this);
    }

    private void z(long j10) {
        if (this.f290j == 1836086884) {
            int i10 = this.f292l;
            this.f304x = new b(0, j10, -9223372036854775807L, j10 + ((long) i10), this.f291k - ((long) i10));
        }
    }

    public void b(n nVar) {
        this.f298r = nVar;
    }

    public void c(long j10, long j11) {
        this.f286f.clear();
        this.f292l = 0;
        this.f294n = -1;
        this.f295o = 0;
        this.f296p = 0;
        this.f297q = 0;
        if (j10 != 0) {
            for (a aVar : this.f299s) {
                G(aVar, j11);
                f0 f0Var = aVar.f308d;
                if (f0Var != null) {
                    f0Var.b();
                }
            }
        } else if (this.f289i != 3) {
            n();
        } else {
            this.f287g.g();
            this.f288h.clear();
        }
    }

    public boolean e(m mVar) throws IOException {
        return n.d(mVar, (this.f281a & 2) != 0);
    }

    public boolean f() {
        return true;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        while (true) {
            int i10 = this.f289i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return C(mVar, a0Var);
                    }
                    if (i10 == 3) {
                        return D(mVar, a0Var);
                    }
                    throw new IllegalStateException();
                } else if (B(mVar, a0Var)) {
                    return 1;
                }
            } else if (!A(mVar)) {
                return -1;
            }
        }
    }

    public b0.a h(long j10) {
        return o(j10, -1);
    }

    public long i() {
        return this.f302v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s2.b0.a o(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            a3.k$a[] r4 = r0.f299s
            int r5 = r4.length
            if (r5 != 0) goto L_0x0013
            s2.b0$a r1 = new s2.b0$a
            s2.c0 r2 = s2.c0.f22383c
            r1.<init>(r2)
            return r1
        L_0x0013:
            r5 = -1
            r7 = -1
            if (r3 == r7) goto L_0x001a
            r8 = r3
            goto L_0x001c
        L_0x001a:
            int r8 = r0.f301u
        L_0x001c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == r7) goto L_0x0058
            r4 = r4[r8]
            a3.r r4 = r4.f306b
            int r8 = p(r4, r1)
            if (r8 != r7) goto L_0x0035
            s2.b0$a r1 = new s2.b0$a
            s2.c0 r2 = s2.c0.f22383c
            r1.<init>(r2)
            return r1
        L_0x0035:
            long[] r11 = r4.f361f
            r12 = r11[r8]
            long[] r11 = r4.f358c
            r14 = r11[r8]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x005e
            int r11 = r4.f357b
            int r11 = r11 + -1
            if (r8 >= r11) goto L_0x005e
            int r1 = r4.b(r1)
            if (r1 == r7) goto L_0x005e
            if (r1 == r8) goto L_0x005e
            long[] r2 = r4.f361f
            r5 = r2[r1]
            long[] r2 = r4.f358c
            r1 = r2[r1]
            goto L_0x0060
        L_0x0058:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L_0x005e:
            r1 = r5
            r5 = r9
        L_0x0060:
            if (r3 != r7) goto L_0x007f
            r3 = 0
        L_0x0063:
            a3.k$a[] r4 = r0.f299s
            int r7 = r4.length
            if (r3 >= r7) goto L_0x007f
            int r7 = r0.f301u
            if (r3 == r7) goto L_0x007c
            r4 = r4[r3]
            a3.r r4 = r4.f306b
            long r14 = t(r4, r12, r14)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
            long r1 = t(r4, r5, r1)
        L_0x007c:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x007f:
            s2.c0 r3 = new s2.c0
            r3.<init>(r12, r14)
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x008e
            s2.b0$a r1 = new s2.b0$a
            r1.<init>(r3)
            return r1
        L_0x008e:
            s2.c0 r4 = new s2.c0
            r4.<init>(r5, r1)
            s2.b0$a r1 = new s2.b0$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.k.o(long, int):s2.b0$a");
    }

    public void release() {
    }

    public k(int i10) {
        this.f281a = i10;
        this.f289i = (i10 & 4) != 0 ? 3 : 0;
        this.f287g = new m();
        this.f288h = new ArrayList();
        this.f285e = new a0(16);
        this.f286f = new ArrayDeque<>();
        this.f282b = new a0(w.f19780a);
        this.f283c = new a0(4);
        this.f284d = new a0();
        this.f294n = -1;
        this.f298r = n.D1;
        this.f299s = new a[0];
    }
}
