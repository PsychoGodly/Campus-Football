package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import i4.s;
import j4.c0;
import j4.g0;
import j4.i0;
import j4.l;
import j4.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k4.n0;
import n2.r1;
import n2.u3;
import o2.u1;
import r3.g;
import r3.k;
import r3.m;
import r3.n;
import r3.o;
import r3.p;
import s2.d;
import s3.f;
import s3.h;
import t3.i;
import t3.j;

/* compiled from: DefaultDashChunkSource */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f14272a;

    /* renamed from: b  reason: collision with root package name */
    private final s3.b f14273b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f14274c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14275d;

    /* renamed from: e  reason: collision with root package name */
    private final l f14276e;

    /* renamed from: f  reason: collision with root package name */
    private final long f14277f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14278g;

    /* renamed from: h  reason: collision with root package name */
    private final e.c f14279h;

    /* renamed from: i  reason: collision with root package name */
    protected final b[] f14280i;

    /* renamed from: j  reason: collision with root package name */
    private s f14281j;

    /* renamed from: k  reason: collision with root package name */
    private t3.c f14282k;

    /* renamed from: l  reason: collision with root package name */
    private int f14283l;

    /* renamed from: m  reason: collision with root package name */
    private IOException f14284m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14285n;

    /* compiled from: DefaultDashChunkSource */
    public static final class a implements a.C0150a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f14286a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14287b;

        /* renamed from: c  reason: collision with root package name */
        private final g.a f14288c;

        public a(l.a aVar) {
            this(aVar, 1);
        }

        public a a(i0 i0Var, t3.c cVar, s3.b bVar, int i10, int[] iArr, s sVar, int i11, long j10, boolean z10, List<r1> list, e.c cVar2, p0 p0Var, u1 u1Var) {
            p0 p0Var2 = p0Var;
            l a10 = this.f14286a.a();
            if (p0Var2 != null) {
                a10.e(p0Var2);
            }
            return new c(this.f14288c, i0Var, cVar, bVar, i10, iArr, sVar, i11, a10, j10, this.f14287b, z10, list, cVar2, u1Var);
        }

        public a(l.a aVar, int i10) {
            this(r3.e.f22109k, aVar, i10);
        }

        public a(g.a aVar, l.a aVar2, int i10) {
            this.f14288c = aVar;
            this.f14286a = aVar2;
            this.f14287b = i10;
        }
    }

    /* compiled from: DefaultDashChunkSource */
    protected static final class b {

        /* renamed from: a  reason: collision with root package name */
        final g f14289a;

        /* renamed from: b  reason: collision with root package name */
        public final j f14290b;

        /* renamed from: c  reason: collision with root package name */
        public final t3.b f14291c;

        /* renamed from: d  reason: collision with root package name */
        public final f f14292d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f14293e;

        /* renamed from: f  reason: collision with root package name */
        private final long f14294f;

        b(long j10, j jVar, t3.b bVar, g gVar, long j11, f fVar) {
            this.f14293e = j10;
            this.f14290b = jVar;
            this.f14291c = bVar;
            this.f14294f = j11;
            this.f14289a = gVar;
            this.f14292d = fVar;
        }

        /* access modifiers changed from: package-private */
        public b b(long j10, j jVar) throws p3.b {
            long f10;
            long f11;
            long j11 = j10;
            f l10 = this.f14290b.l();
            f l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f14291c, this.f14289a, this.f14294f, l10);
            } else if (!l10.g()) {
                return new b(j10, jVar, this.f14291c, this.f14289a, this.f14294f, l11);
            } else {
                long i10 = l10.i(j11);
                if (i10 == 0) {
                    return new b(j10, jVar, this.f14291c, this.f14289a, this.f14294f, l11);
                }
                long h10 = l10.h();
                long a10 = l10.a(h10);
                long j12 = (i10 + h10) - 1;
                long h11 = l11.h();
                f fVar = l10;
                long a11 = l11.a(h11);
                long j13 = h10;
                long j14 = this.f14294f;
                int i11 = ((l10.a(j12) + l10.b(j12, j11)) > a11 ? 1 : ((l10.a(j12) + l10.b(j12, j11)) == a11 ? 0 : -1));
                if (i11 == 0) {
                    f10 = j12 + 1;
                } else if (i11 < 0) {
                    throw new p3.b();
                } else if (a11 < a10) {
                    f11 = j14 - (l11.f(a10, j11) - j13);
                    return new b(j10, jVar, this.f14291c, this.f14289a, f11, l11);
                } else {
                    f10 = fVar.f(a11, j11);
                }
                f11 = j14 + (f10 - h11);
                return new b(j10, jVar, this.f14291c, this.f14289a, f11, l11);
            }
        }

        /* access modifiers changed from: package-private */
        public b c(f fVar) {
            return new b(this.f14293e, this.f14290b, this.f14291c, this.f14289a, this.f14294f, fVar);
        }

        /* access modifiers changed from: package-private */
        public b d(t3.b bVar) {
            return new b(this.f14293e, this.f14290b, bVar, this.f14289a, this.f14294f, this.f14292d);
        }

        public long e(long j10) {
            return this.f14292d.c(this.f14293e, j10) + this.f14294f;
        }

        public long f() {
            return this.f14292d.h() + this.f14294f;
        }

        public long g(long j10) {
            return (e(j10) + this.f14292d.j(this.f14293e, j10)) - 1;
        }

        public long h() {
            return this.f14292d.i(this.f14293e);
        }

        public long i(long j10) {
            return k(j10) + this.f14292d.b(j10 - this.f14294f, this.f14293e);
        }

        public long j(long j10) {
            return this.f14292d.f(j10, this.f14293e) + this.f14294f;
        }

        public long k(long j10) {
            return this.f14292d.a(j10 - this.f14294f);
        }

        public i l(long j10) {
            return this.f14292d.e(j10 - this.f14294f);
        }

        public boolean m(long j10, long j11) {
            if (!this.f14292d.g() && j11 != -9223372036854775807L && i(j10) > j11) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultDashChunkSource */
    protected static final class C0151c extends r3.b {

        /* renamed from: e  reason: collision with root package name */
        private final b f14295e;

        /* renamed from: f  reason: collision with root package name */
        private final long f14296f;

        public C0151c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f14295e = bVar;
            this.f14296f = j12;
        }

        public long a() {
            c();
            return this.f14295e.k(d());
        }

        public long b() {
            c();
            return this.f14295e.i(d());
        }
    }

    public c(g.a aVar, i0 i0Var, t3.c cVar, s3.b bVar, int i10, int[] iArr, s sVar, int i11, l lVar, long j10, int i12, boolean z10, List<r1> list, e.c cVar2, u1 u1Var) {
        t3.c cVar3 = cVar;
        s3.b bVar2 = bVar;
        int i13 = i10;
        s sVar2 = sVar;
        this.f14272a = i0Var;
        this.f14282k = cVar3;
        this.f14273b = bVar2;
        this.f14274c = iArr;
        this.f14281j = sVar2;
        this.f14275d = i11;
        this.f14276e = lVar;
        this.f14283l = i13;
        this.f14277f = j10;
        this.f14278g = i12;
        this.f14279h = cVar2;
        long g10 = cVar3.g(i13);
        ArrayList<j> n10 = n();
        this.f14280i = new b[sVar.length()];
        int i14 = 0;
        while (i14 < this.f14280i.length) {
            j jVar = n10.get(sVar2.l(i14));
            t3.b j11 = bVar2.j(jVar.f22637c);
            b[] bVarArr = this.f14280i;
            if (j11 == null) {
                j11 = jVar.f22637c.get(0);
            }
            int i15 = i14;
            long j12 = g10;
            j jVar2 = jVar;
            bVarArr[i15] = new b(j12, jVar2, j11, aVar.a(i11, jVar.f22636b, z10, list, cVar2, u1Var), 0, jVar.l());
            i14 = i15 + 1;
        }
    }

    private g0.a k(s sVar, List<t3.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (sVar.h(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = s3.b.f(list);
        return new g0.a(f10, f10 - this.f14273b.g(list), length, i10);
    }

    private long l(long j10, long j11) {
        if (!this.f14282k.f22589d || this.f14280i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0, Math.min(m(j10), this.f14280i[0].i(this.f14280i[0].g(j10))) - j11);
    }

    private long m(long j10) {
        t3.c cVar = this.f14282k;
        long j11 = cVar.f22586a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - n0.C0(j11 + cVar.d(this.f14283l).f22622b);
    }

    private ArrayList<j> n() {
        List<t3.a> list = this.f14282k.d(this.f14283l).f22623c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f14274c) {
            arrayList.addAll(list.get(i10).f22578c);
        }
        return arrayList;
    }

    private long o(b bVar, n nVar, long j10, long j11, long j12) {
        if (nVar != null) {
            return nVar.g();
        }
        return n0.r(bVar.j(j10), j11, j12);
    }

    private b r(int i10) {
        b bVar = this.f14280i[i10];
        t3.b j10 = this.f14273b.j(bVar.f14290b.f22637c);
        if (j10 == null || j10.equals(bVar.f14291c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.f14280i[i10] = d10;
        return d10;
    }

    public void a() throws IOException {
        IOException iOException = this.f14284m;
        if (iOException == null) {
            this.f14272a.a();
            return;
        }
        throw iOException;
    }

    public void b(s sVar) {
        this.f14281j = sVar;
    }

    public void c(t3.c cVar, int i10) {
        try {
            this.f14282k = cVar;
            this.f14283l = i10;
            long g10 = cVar.g(i10);
            ArrayList<j> n10 = n();
            for (int i11 = 0; i11 < this.f14280i.length; i11++) {
                b[] bVarArr = this.f14280i;
                bVarArr[i11] = bVarArr[i11].b(g10, n10.get(this.f14281j.l(i11)));
            }
        } catch (p3.b e10) {
            this.f14284m = e10;
        }
    }

    public long d(long j10, u3 u3Var) {
        long j11 = j10;
        for (b bVar : this.f14280i) {
            if (bVar.f14292d != null) {
                long h10 = bVar.h();
                if (h10 != 0) {
                    long j12 = bVar.j(j11);
                    long k10 = bVar.k(j12);
                    return u3Var.a(j10, k10, (k10 >= j11 || (h10 != -1 && j12 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j12 + 1));
                }
            }
        }
        return j11;
    }

    public void e(r3.f fVar) {
        d d10;
        if (fVar instanceof m) {
            int c10 = this.f14281j.c(((m) fVar).f22130d);
            b bVar = this.f14280i[c10];
            if (bVar.f14292d == null && (d10 = bVar.f14289a.d()) != null) {
                this.f14280i[c10] = bVar.c(new h(d10, bVar.f14290b.f22638d));
            }
        }
        e.c cVar = this.f14279h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    public void g(long j10, long j11, List<? extends n> list, r3.h hVar) {
        n nVar;
        long j12;
        int i10;
        o[] oVarArr;
        int i11;
        long j13;
        long j14 = j10;
        r3.h hVar2 = hVar;
        if (this.f14284m == null) {
            long j15 = j11 - j14;
            long C0 = n0.C0(this.f14282k.f22586a) + n0.C0(this.f14282k.d(this.f14283l).f22622b) + j11;
            e.c cVar = this.f14279h;
            if (cVar == null || !cVar.h(C0)) {
                long C02 = n0.C0(n0.a0(this.f14277f));
                long m10 = m(C02);
                if (list.isEmpty()) {
                    List<? extends n> list2 = list;
                    nVar = null;
                } else {
                    nVar = (n) list.get(list.size() - 1);
                }
                int length = this.f14281j.length();
                o[] oVarArr2 = new o[length];
                int i12 = 0;
                while (i12 < length) {
                    b bVar = this.f14280i[i12];
                    if (bVar.f14292d == null) {
                        oVarArr2[i12] = o.f22179a;
                        i11 = i12;
                        i10 = length;
                        oVarArr = oVarArr2;
                        j12 = j15;
                        j13 = C02;
                    } else {
                        long e10 = bVar.e(C02);
                        long g10 = bVar.g(C02);
                        i11 = i12;
                        i10 = length;
                        oVarArr = oVarArr2;
                        j12 = j15;
                        j13 = C02;
                        long o10 = o(bVar, nVar, j11, e10, g10);
                        if (o10 < e10) {
                            oVarArr[i11] = o.f22179a;
                        } else {
                            oVarArr[i11] = new C0151c(r(i11), o10, g10, m10);
                        }
                    }
                    i12 = i11 + 1;
                    List<? extends n> list3 = list;
                    C02 = j13;
                    oVarArr2 = oVarArr;
                    length = i10;
                    j15 = j12;
                }
                long j16 = j15;
                long j17 = C02;
                this.f14281j.k(j10, j16, l(j17, j14), list, oVarArr2);
                b r10 = r(this.f14281j.f());
                g gVar = r10.f14289a;
                if (gVar != null) {
                    j jVar = r10.f14290b;
                    i n10 = gVar.b() == null ? jVar.n() : null;
                    i m11 = r10.f14292d == null ? jVar.m() : null;
                    if (!(n10 == null && m11 == null)) {
                        hVar2.f22136a = p(r10, this.f14276e, this.f14281j.o(), this.f14281j.p(), this.f14281j.r(), n10, m11);
                        return;
                    }
                }
                long a10 = r10.f14293e;
                long j18 = -9223372036854775807L;
                int i13 = (a10 > -9223372036854775807L ? 1 : (a10 == -9223372036854775807L ? 0 : -1));
                boolean z10 = i13 != 0;
                if (r10.h() == 0) {
                    hVar2.f22137b = z10;
                    return;
                }
                long e11 = r10.e(j17);
                long g11 = r10.g(j17);
                long o11 = o(r10, nVar, j11, e11, g11);
                if (o11 < e11) {
                    this.f14284m = new p3.b();
                    return;
                }
                int i14 = (o11 > g11 ? 1 : (o11 == g11 ? 0 : -1));
                if (i14 > 0 || (this.f14285n && i14 >= 0)) {
                    hVar2.f22137b = z10;
                } else if (!z10 || r10.k(o11) < a10) {
                    int min = (int) Math.min((long) this.f14278g, (g11 - o11) + 1);
                    if (i13 != 0) {
                        while (min > 1 && r10.k((((long) min) + o11) - 1) >= a10) {
                            min--;
                        }
                    }
                    int i15 = min;
                    if (list.isEmpty()) {
                        j18 = j11;
                    }
                    hVar2.f22136a = q(r10, this.f14276e, this.f14275d, this.f14281j.o(), this.f14281j.p(), this.f14281j.r(), o11, i15, j18, m10);
                } else {
                    hVar2.f22137b = true;
                }
            }
        }
    }

    public boolean h(r3.f fVar, boolean z10, g0.c cVar, g0 g0Var) {
        g0.b a10;
        if (!z10) {
            return false;
        }
        e.c cVar2 = this.f14279h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f14282k.f22589d && (fVar instanceof n)) {
            IOException iOException = cVar.f19319c;
            if ((iOException instanceof c0) && ((c0) iOException).f19295d == 404) {
                b bVar = this.f14280i[this.f14281j.c(fVar.f22130d)];
                long h10 = bVar.h();
                if (!(h10 == -1 || h10 == 0)) {
                    if (((n) fVar).g() > (bVar.f() + h10) - 1) {
                        this.f14285n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f14280i[this.f14281j.c(fVar.f22130d)];
        t3.b j10 = this.f14273b.j(bVar2.f14290b.f22637c);
        if (j10 != null && !bVar2.f14291c.equals(j10)) {
            return true;
        }
        g0.a k10 = k(this.f14281j, bVar2.f14290b.f22637c);
        if ((!k10.a(2) && !k10.a(1)) || (a10 = g0Var.a(k10, cVar)) == null || !k10.a(a10.f19315a)) {
            return false;
        }
        int i10 = a10.f19315a;
        if (i10 == 2) {
            s sVar = this.f14281j;
            return sVar.g(sVar.c(fVar.f22130d), a10.f19316b);
        } else if (i10 != 1) {
            return false;
        } else {
            this.f14273b.e(bVar2.f14291c, a10.f19316b);
            return true;
        }
    }

    public int i(long j10, List<? extends n> list) {
        if (this.f14284m != null || this.f14281j.length() < 2) {
            return list.size();
        }
        return this.f14281j.m(j10, list);
    }

    public boolean j(long j10, r3.f fVar, List<? extends n> list) {
        if (this.f14284m != null) {
            return false;
        }
        return this.f14281j.e(j10, fVar, list);
    }

    /* access modifiers changed from: protected */
    public r3.f p(b bVar, l lVar, r1 r1Var, int i10, Object obj, i iVar, i iVar2) {
        b bVar2 = bVar;
        i iVar3 = iVar;
        j jVar = bVar2.f14290b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar2.f14291c.f22582a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(lVar, s3.g.a(jVar, bVar2.f14291c.f22582a, iVar3, 0), r1Var, i10, obj, bVar2.f14289a);
    }

    /* access modifiers changed from: protected */
    public r3.f q(b bVar, l lVar, int i10, r1 r1Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        b bVar2 = bVar;
        long j13 = j10;
        long j14 = j12;
        j jVar = bVar2.f14290b;
        long k10 = bVar2.k(j13);
        i l10 = bVar2.l(j13);
        int i13 = 0;
        if (bVar2.f14289a == null) {
            long i14 = bVar2.i(j13);
            if (!bVar2.m(j13, j14)) {
                i13 = 8;
            }
            return new p(lVar, s3.g.a(jVar, bVar2.f14291c.f22582a, l10, i13), r1Var, i11, obj, k10, i14, j10, i10, r1Var);
        }
        int i15 = 1;
        int i16 = i12;
        int i17 = 1;
        while (i15 < i16) {
            i a10 = l10.a(bVar2.l(((long) i15) + j13), bVar2.f14291c.f22582a);
            if (a10 == null) {
                break;
            }
            i17++;
            i15++;
            l10 = a10;
        }
        long j15 = (((long) i17) + j13) - 1;
        long i18 = bVar2.i(j15);
        long a11 = bVar.f14293e;
        long j16 = (a11 == -9223372036854775807L || a11 > i18) ? -9223372036854775807L : a11;
        if (!bVar2.m(j15, j14)) {
            i13 = 8;
        }
        g gVar = bVar2.f14289a;
        return new k(lVar, s3.g.a(jVar, bVar2.f14291c.f22582a, l10, i13), r1Var, i11, obj, k10, i18, j11, j16, j10, i17, -jVar.f22638d, gVar);
    }

    public void release() {
        for (b bVar : this.f14280i) {
            g gVar = bVar.f14289a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
