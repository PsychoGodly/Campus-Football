package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import j4.b;
import j4.g0;
import j4.l;
import j4.p0;
import java.io.IOException;
import java.util.List;
import k4.n0;
import n2.o1;
import n2.z1;
import p3.e0;
import p3.i;
import p3.u;
import p3.u0;
import p3.x;
import r2.b0;
import r2.y;
import u3.c;
import u3.g;
import u3.h;
import v3.e;
import v3.g;
import v3.k;
import v3.l;

public final class HlsMediaSource extends p3.a implements l.e {

    /* renamed from: i  reason: collision with root package name */
    private final h f14322i;

    /* renamed from: j  reason: collision with root package name */
    private final z1.h f14323j;

    /* renamed from: k  reason: collision with root package name */
    private final g f14324k;

    /* renamed from: l  reason: collision with root package name */
    private final i f14325l;

    /* renamed from: m  reason: collision with root package name */
    private final y f14326m;

    /* renamed from: n  reason: collision with root package name */
    private final g0 f14327n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f14328o;

    /* renamed from: p  reason: collision with root package name */
    private final int f14329p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f14330q;

    /* renamed from: r  reason: collision with root package name */
    private final l f14331r;

    /* renamed from: s  reason: collision with root package name */
    private final long f14332s;

    /* renamed from: t  reason: collision with root package name */
    private final z1 f14333t;

    /* renamed from: u  reason: collision with root package name */
    private z1.g f14334u;

    /* renamed from: v  reason: collision with root package name */
    private p0 f14335v;

    public static final class Factory implements x.a {

        /* renamed from: a  reason: collision with root package name */
        private final g f14336a;

        /* renamed from: b  reason: collision with root package name */
        private h f14337b;

        /* renamed from: c  reason: collision with root package name */
        private k f14338c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f14339d;

        /* renamed from: e  reason: collision with root package name */
        private i f14340e;

        /* renamed from: f  reason: collision with root package name */
        private b0 f14341f;

        /* renamed from: g  reason: collision with root package name */
        private g0 f14342g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f14343h;

        /* renamed from: i  reason: collision with root package name */
        private int f14344i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f14345j;

        /* renamed from: k  reason: collision with root package name */
        private long f14346k;

        public Factory(l.a aVar) {
            this((g) new c(aVar));
        }

        public HlsMediaSource a(z1 z1Var) {
            z1 z1Var2 = z1Var;
            k4.a.e(z1Var2.f20785b);
            k kVar = this.f14338c;
            List<o3.c> list = z1Var2.f20785b.f20863e;
            if (!list.isEmpty()) {
                kVar = new e(kVar, list);
            }
            g gVar = this.f14336a;
            h hVar = this.f14337b;
            i iVar = this.f14340e;
            y a10 = this.f14341f.a(z1Var2);
            g0 g0Var = this.f14342g;
            return new HlsMediaSource(z1Var, gVar, hVar, iVar, a10, g0Var, this.f14339d.a(this.f14336a, g0Var, kVar), this.f14346k, this.f14343h, this.f14344i, this.f14345j);
        }

        public Factory(g gVar) {
            this.f14336a = (g) k4.a.e(gVar);
            this.f14341f = new r2.l();
            this.f14338c = new v3.a();
            this.f14339d = v3.c.f23184q;
            this.f14337b = h.f22885a;
            this.f14342g = new j4.x();
            this.f14340e = new p3.l();
            this.f14344i = 1;
            this.f14346k = -9223372036854775807L;
            this.f14343h = true;
        }
    }

    static {
        o1.a("goog.exo.hls");
    }

    private u0 F(v3.g gVar, long j10, long j11, a aVar) {
        long j12;
        v3.g gVar2 = gVar;
        long f10 = gVar2.f23218h - this.f14331r.f();
        long j13 = gVar2.f23225o ? f10 + gVar2.f23231u : -9223372036854775807L;
        long J = J(gVar);
        long j14 = this.f14334u.f20849a;
        if (j14 != -9223372036854775807L) {
            j12 = n0.C0(j14);
        } else {
            j12 = L(gVar2, J);
        }
        M(gVar2, n0.r(j12, J, gVar2.f23231u + J));
        return new u0(j10, j11, -9223372036854775807L, j13, gVar2.f23231u, f10, K(gVar2, J), true, !gVar2.f23225o, gVar2.f23214d == 2 && gVar2.f23216f, aVar, this.f14333t, this.f14334u);
    }

    private u0 G(v3.g gVar, long j10, long j11, a aVar) {
        long j12;
        v3.g gVar2 = gVar;
        if (gVar2.f23215e == -9223372036854775807L || gVar2.f23228r.isEmpty()) {
            j12 = 0;
        } else {
            if (!gVar2.f23217g) {
                long j13 = gVar2.f23215e;
                if (j13 != gVar2.f23231u) {
                    j12 = I(gVar2.f23228r, j13).f23244f;
                }
            }
            j12 = gVar2.f23215e;
        }
        long j14 = gVar2.f23231u;
        return new u0(j10, j11, -9223372036854775807L, j14, j14, 0, j12, true, false, true, aVar, this.f14333t, (z1.g) null);
    }

    private static g.b H(List<g.b> list, long j10) {
        g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            g.b bVar2 = list.get(i10);
            long j11 = bVar2.f23244f;
            if (j11 <= j10 && bVar2.f23233m) {
                bVar = bVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return bVar;
    }

    private static g.d I(List<g.d> list, long j10) {
        return list.get(n0.f(list, Long.valueOf(j10), true, true));
    }

    private long J(v3.g gVar) {
        if (gVar.f23226p) {
            return n0.C0(n0.a0(this.f14332s)) - gVar.e();
        }
        return 0;
    }

    private long K(v3.g gVar, long j10) {
        long j11 = gVar.f23215e;
        if (j11 == -9223372036854775807L) {
            j11 = (gVar.f23231u + j10) - n0.C0(this.f14334u.f20849a);
        }
        if (gVar.f23217g) {
            return j11;
        }
        g.b H = H(gVar.f23229s, j11);
        if (H != null) {
            return H.f23244f;
        }
        if (gVar.f23228r.isEmpty()) {
            return 0;
        }
        g.d I = I(gVar.f23228r, j11);
        g.b H2 = H(I.f23239n, j11);
        if (H2 != null) {
            return H2.f23244f;
        }
        return I.f23244f;
    }

    private static long L(v3.g gVar, long j10) {
        long j11;
        g.f fVar = gVar.f23232v;
        long j12 = gVar.f23215e;
        if (j12 != -9223372036854775807L) {
            j11 = gVar.f23231u - j12;
        } else {
            long j13 = fVar.f23254d;
            if (j13 == -9223372036854775807L || gVar.f23224n == -9223372036854775807L) {
                long j14 = fVar.f23253c;
                if (j14 != -9223372036854775807L) {
                    j11 = j14;
                } else {
                    j11 = gVar.f23223m * 3;
                }
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M(v3.g r6, long r7) {
        /*
            r5 = this;
            n2.z1 r0 = r5.f14333t
            n2.z1$g r0 = r0.f20787d
            float r1 = r0.f20852d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0028
            float r0 = r0.f20853f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            v3.g$f r6 = r6.f23232v
            long r0 = r6.f23253c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0028
            long r0 = r6.f23254d
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0028
            r6 = 1
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            n2.z1$g$a r0 = new n2.z1$g$a
            r0.<init>()
            long r7 = k4.n0.Z0(r7)
            n2.z1$g$a r7 = r0.k(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x003d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0041
        L_0x003d:
            n2.z1$g r0 = r5.f14334u
            float r0 = r0.f20852d
        L_0x0041:
            n2.z1$g$a r7 = r7.j(r0)
            if (r6 == 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            n2.z1$g r6 = r5.f14334u
            float r8 = r6.f20853f
        L_0x004c:
            n2.z1$g$a r6 = r7.h(r8)
            n2.z1$g r6 = r6.f()
            r5.f14334u = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.M(v3.g, long):void");
    }

    /* access modifiers changed from: protected */
    public void C(p0 p0Var) {
        this.f14335v = p0Var;
        this.f14326m.c((Looper) k4.a.e(Looper.myLooper()), A());
        this.f14326m.a();
        this.f14331r.a(this.f14323j.f20859a, w((x.b) null), this);
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.f14331r.stop();
        this.f14326m.release();
    }

    public u a(x.b bVar, b bVar2, long j10) {
        e0.a w10 = w(bVar);
        return new u3.k(this.f14322i, this.f14331r, this.f14324k, this.f14335v, this.f14326m, u(bVar), this.f14327n, w10, bVar2, this.f14325l, this.f14328o, this.f14329p, this.f14330q, A());
    }

    public void b(u uVar) {
        ((u3.k) uVar).A();
    }

    public void e(v3.g gVar) {
        u0 u0Var;
        long Z0 = gVar.f23226p ? n0.Z0(gVar.f23218h) : -9223372036854775807L;
        int i10 = gVar.f23214d;
        long j10 = (i10 == 2 || i10 == 1) ? Z0 : -9223372036854775807L;
        a aVar = new a((v3.h) k4.a.e(this.f14331r.h()), gVar);
        if (this.f14331r.g()) {
            u0Var = F(gVar, j10, Z0, aVar);
        } else {
            u0Var = G(gVar, j10, Z0, aVar);
        }
        D(u0Var);
    }

    public z1 g() {
        return this.f14333t;
    }

    public void h() throws IOException {
        this.f14331r.j();
    }

    private HlsMediaSource(z1 z1Var, u3.g gVar, h hVar, i iVar, y yVar, g0 g0Var, v3.l lVar, long j10, boolean z10, int i10, boolean z11) {
        this.f14323j = (z1.h) k4.a.e(z1Var.f20785b);
        this.f14333t = z1Var;
        this.f14334u = z1Var.f20787d;
        this.f14324k = gVar;
        this.f14322i = hVar;
        this.f14325l = iVar;
        this.f14326m = yVar;
        this.f14327n = g0Var;
        this.f14331r = lVar;
        this.f14332s = j10;
        this.f14328o = z10;
        this.f14329p = i10;
        this.f14330q = z11;
    }
}
