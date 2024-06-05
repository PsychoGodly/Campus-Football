package u3;

import android.net.Uri;
import f3.a;
import j4.l;
import j4.o;
import j4.p;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k3.h;
import k4.a;
import k4.a0;
import k4.j0;
import k4.l0;
import n2.r1;
import o2.u1;
import r2.m;
import r3.n;
import r6.c;
import s6.u;
import u3.f;
import v3.g;

/* compiled from: HlsMediaChunk */
final class i extends n {
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final u1 C;
    private j D;
    private p E;
    private int F;
    private boolean G;
    private volatile boolean H;
    private boolean I;
    private u<Integer> J;
    private boolean K;
    private boolean L;

    /* renamed from: k  reason: collision with root package name */
    public final int f22886k;

    /* renamed from: l  reason: collision with root package name */
    public final int f22887l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f22888m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f22889n;

    /* renamed from: o  reason: collision with root package name */
    public final int f22890o;

    /* renamed from: p  reason: collision with root package name */
    private final l f22891p;

    /* renamed from: q  reason: collision with root package name */
    private final p f22892q;

    /* renamed from: r  reason: collision with root package name */
    private final j f22893r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f22894s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f22895t;

    /* renamed from: u  reason: collision with root package name */
    private final j0 f22896u;

    /* renamed from: v  reason: collision with root package name */
    private final h f22897v;

    /* renamed from: w  reason: collision with root package name */
    private final List<r1> f22898w;

    /* renamed from: x  reason: collision with root package name */
    private final m f22899x;

    /* renamed from: y  reason: collision with root package name */
    private final h f22900y;

    /* renamed from: z  reason: collision with root package name */
    private final a0 f22901z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(h hVar, l lVar, p pVar, r1 r1Var, boolean z10, l lVar2, p pVar2, boolean z11, Uri uri, List<r1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, j0 j0Var, m mVar, j jVar, h hVar2, a0 a0Var, boolean z15, u1 u1Var) {
        super(lVar, pVar, r1Var, i10, obj, j10, j11, j12);
        p pVar3 = pVar2;
        this.A = z10;
        this.f22890o = i11;
        this.L = z12;
        this.f22887l = i12;
        this.f22892q = pVar3;
        this.f22891p = lVar2;
        this.G = pVar3 != null;
        this.B = z11;
        this.f22888m = uri;
        this.f22894s = z14;
        this.f22896u = j0Var;
        this.f22895t = z13;
        this.f22897v = hVar;
        this.f22898w = list;
        this.f22899x = mVar;
        this.f22893r = jVar;
        this.f22900y = hVar2;
        this.f22901z = a0Var;
        this.f22889n = z15;
        this.C = u1Var;
        this.J = u.y();
        this.f22886k = M.getAndIncrement();
    }

    private static l i(l lVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return lVar;
        }
        a.e(bArr2);
        return new a(lVar, bArr, bArr2);
    }

    public static i j(h hVar, l lVar, r1 r1Var, long j10, g gVar, f.e eVar, Uri uri, List<r1> list, int i10, Object obj, boolean z10, s sVar, i iVar, byte[] bArr, byte[] bArr2, boolean z11, u1 u1Var) {
        boolean z12;
        boolean z13;
        p pVar;
        l lVar2;
        a0 a0Var;
        h hVar2;
        j jVar;
        l lVar3 = lVar;
        g gVar2 = gVar;
        f.e eVar2 = eVar;
        i iVar2 = iVar;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        g.e eVar3 = eVar2.f22881a;
        p a10 = new p.b().i(l0.e(gVar2.f23277a, eVar3.f23240a)).h(eVar3.f23248j).g(eVar3.f23249k).b(eVar2.f22884d ? 8 : 0).a();
        boolean z14 = bArr3 != null;
        l i11 = i(lVar3, bArr3, z14 ? l((String) a.e(eVar3.f23247i)) : null);
        g.d dVar = eVar3.f23241b;
        if (dVar != null) {
            boolean z15 = bArr4 != null;
            byte[] l10 = z15 ? l((String) a.e(dVar.f23247i)) : null;
            z12 = z14;
            pVar = new p(l0.e(gVar2.f23277a, dVar.f23240a), dVar.f23248j, dVar.f23249k);
            lVar2 = i(lVar3, bArr4, l10);
            z13 = z15;
        } else {
            z12 = z14;
            lVar2 = null;
            pVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar3.f23244f;
        long j12 = j11 + eVar3.f23242c;
        int i12 = gVar2.f23220j + eVar3.f23243d;
        if (iVar2 != null) {
            p pVar2 = iVar2.f22892q;
            boolean z16 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.f19387a.equals(pVar2.f19387a) && pVar.f19393g == iVar2.f22892q.f19393g);
            boolean z17 = uri.equals(iVar2.f22888m) && iVar2.I;
            h hVar3 = iVar2.f22900y;
            hVar2 = hVar3;
            a0Var = iVar2.f22901z;
            jVar = (!z16 || !z17 || iVar2.K || iVar2.f22887l != i12) ? null : iVar2.D;
        } else {
            Uri uri2 = uri;
            hVar2 = new h();
            a0Var = new a0(10);
            jVar = null;
        }
        return new i(hVar, i11, a10, r1Var, z12, lVar2, pVar, z13, uri, list, i10, obj, j11, j12, eVar2.f22882b, eVar2.f22883c, !eVar2.f22884d, i12, eVar3.f23250l, z10, sVar.a(i12), eVar3.f23245g, jVar, hVar2, a0Var, z11, u1Var);
    }

    private void k(l lVar, p pVar, boolean z10, boolean z11) throws IOException {
        p pVar2;
        s2.f u10;
        long c10;
        long j10;
        boolean z12 = false;
        if (z10) {
            if (this.F != 0) {
                z12 = true;
            }
            pVar2 = pVar;
        } else {
            pVar2 = pVar.e((long) this.F);
        }
        try {
            u10 = u(lVar, pVar2, z11);
            if (z12) {
                u10.m(this.F);
            }
            do {
                if (this.H || !this.D.a(u10)) {
                    break;
                }
                break;
                break;
            } while (!this.D.a(u10));
            break;
            c10 = u10.c();
            j10 = pVar.f19393g;
        } catch (EOFException e10) {
            if ((this.f22130d.f20647f & 16384) != 0) {
                this.D.c();
                c10 = u10.c();
                j10 = pVar.f19393g;
            } else {
                throw e10;
            }
        } catch (Throwable th) {
            o.a(lVar);
            throw th;
        }
        this.F = (int) (c10 - j10);
        o.a(lVar);
    }

    private static byte[] l(String str) {
        if (c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, g gVar) {
        g.e eVar2 = eVar.f22881a;
        if (eVar2 instanceof g.b) {
            return ((g.b) eVar2).f23233m || (eVar.f22883c == 0 && gVar.f23279c);
        }
        return gVar.f23279c;
    }

    private void r() throws IOException {
        k(this.f22135i, this.f22128b, this.A, true);
    }

    private void s() throws IOException {
        if (this.G) {
            a.e(this.f22891p);
            a.e(this.f22892q);
            k(this.f22891p, this.f22892q, this.B, false);
            this.F = 0;
            this.G = false;
        }
    }

    private long t(s2.m mVar) throws IOException {
        mVar.l();
        try {
            this.f22901z.P(10);
            mVar.p(this.f22901z.e(), 0, 10);
            if (this.f22901z.J() != 4801587) {
                return -9223372036854775807L;
            }
            this.f22901z.U(3);
            int F2 = this.f22901z.F();
            int i10 = F2 + 10;
            if (i10 > this.f22901z.b()) {
                byte[] e10 = this.f22901z.e();
                this.f22901z.P(i10);
                System.arraycopy(e10, 0, this.f22901z.e(), 0, 10);
            }
            mVar.p(this.f22901z.e(), 10, F2);
            f3.a e11 = this.f22900y.e(this.f22901z.e(), F2);
            if (e11 == null) {
                return -9223372036854775807L;
            }
            int e12 = e11.e();
            for (int i11 = 0; i11 < e12; i11++) {
                a.b d10 = e11.d(i11);
                if (d10 instanceof k3.l) {
                    k3.l lVar = (k3.l) d10;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f19663b)) {
                        System.arraycopy(lVar.f19664c, 0, this.f22901z.e(), 0, 8);
                        this.f22901z.T(0);
                        this.f22901z.S(8);
                        return this.f22901z.z() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    private s2.f u(l lVar, p pVar, boolean z10) throws IOException {
        j jVar;
        long j10;
        long f10 = lVar.f(pVar);
        if (z10) {
            try {
                this.f22896u.h(this.f22894s, this.f22133g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        s2.f fVar = new s2.f(lVar, pVar.f19393g, f10);
        if (this.D == null) {
            long t10 = t(fVar);
            fVar.l();
            j jVar2 = this.f22893r;
            if (jVar2 != null) {
                jVar = jVar2.f();
            } else {
                jVar = this.f22897v.a(pVar.f19387a, this.f22130d, this.f22898w, this.f22896u, lVar.k(), fVar, this.C);
            }
            this.D = jVar;
            if (jVar.d()) {
                p pVar2 = this.E;
                if (t10 != -9223372036854775807L) {
                    j10 = this.f22896u.b(t10);
                } else {
                    j10 = this.f22133g;
                }
                pVar2.m0(j10);
            } else {
                this.E.m0(0);
            }
            this.E.Y();
            this.D.b(this.E);
        }
        this.E.j0(this.f22899x);
        return fVar;
    }

    public static boolean w(i iVar, Uri uri, g gVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f22888m) && iVar.I) {
            return false;
        }
        long j11 = j10 + eVar.f22881a.f23244f;
        if (!p(eVar, gVar) || j11 < iVar.f22134h) {
            return true;
        }
        return false;
    }

    public void a() throws IOException {
        j jVar;
        k4.a.e(this.E);
        if (this.D == null && (jVar = this.f22893r) != null && jVar.e()) {
            this.D = this.f22893r;
            this.G = false;
        }
        s();
        if (!this.H) {
            if (!this.f22895t) {
                r();
            }
            this.I = !this.H;
        }
    }

    public void c() {
        this.H = true;
    }

    public boolean h() {
        return this.I;
    }

    public int m(int i10) {
        k4.a.f(!this.f22889n);
        if (i10 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i10).intValue();
    }

    public void n(p pVar, u<Integer> uVar) {
        this.E = pVar;
        this.J = uVar;
    }

    public void o() {
        this.K = true;
    }

    public boolean q() {
        return this.L;
    }

    public void v() {
        this.L = true;
    }
}
