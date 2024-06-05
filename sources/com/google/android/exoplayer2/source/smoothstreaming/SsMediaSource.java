package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.unity3d.services.UnityAdsConstants;
import j4.g0;
import j4.h0;
import j4.i0;
import j4.j0;
import j4.l;
import j4.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k4.n0;
import n2.o1;
import n2.z1;
import o3.c;
import p3.e0;
import p3.i;
import p3.q;
import p3.t;
import p3.u;
import p3.u0;
import p3.x;
import r2.b0;
import r2.y;
import x3.a;

public final class SsMediaSource extends p3.a implements h0.b<j0<x3.a>> {
    private x3.a A;
    private Handler B;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f14350i;

    /* renamed from: j  reason: collision with root package name */
    private final Uri f14351j;

    /* renamed from: k  reason: collision with root package name */
    private final z1.h f14352k;

    /* renamed from: l  reason: collision with root package name */
    private final z1 f14353l;

    /* renamed from: m  reason: collision with root package name */
    private final l.a f14354m;

    /* renamed from: n  reason: collision with root package name */
    private final b.a f14355n;

    /* renamed from: o  reason: collision with root package name */
    private final i f14356o;

    /* renamed from: p  reason: collision with root package name */
    private final y f14357p;

    /* renamed from: q  reason: collision with root package name */
    private final g0 f14358q;

    /* renamed from: r  reason: collision with root package name */
    private final long f14359r;

    /* renamed from: s  reason: collision with root package name */
    private final e0.a f14360s;

    /* renamed from: t  reason: collision with root package name */
    private final j0.a<? extends x3.a> f14361t;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList<c> f14362u;

    /* renamed from: v  reason: collision with root package name */
    private l f14363v;

    /* renamed from: w  reason: collision with root package name */
    private h0 f14364w;

    /* renamed from: x  reason: collision with root package name */
    private i0 f14365x;

    /* renamed from: y  reason: collision with root package name */
    private p0 f14366y;

    /* renamed from: z  reason: collision with root package name */
    private long f14367z;

    public static final class Factory implements x.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f14368a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f14369b;

        /* renamed from: c  reason: collision with root package name */
        private i f14370c;

        /* renamed from: d  reason: collision with root package name */
        private b0 f14371d;

        /* renamed from: e  reason: collision with root package name */
        private g0 f14372e;

        /* renamed from: f  reason: collision with root package name */
        private long f14373f;

        /* renamed from: g  reason: collision with root package name */
        private j0.a<? extends x3.a> f14374g;

        public Factory(l.a aVar) {
            this(new a.C0152a(aVar), aVar);
        }

        public SsMediaSource a(z1 z1Var) {
            k4.a.e(z1Var.f20785b);
            j0.a aVar = this.f14374g;
            if (aVar == null) {
                aVar = new x3.b();
            }
            List<c> list = z1Var.f20785b.f20863e;
            return new SsMediaSource(z1Var, (x3.a) null, this.f14369b, !list.isEmpty() ? new o3.b(aVar, list) : aVar, this.f14368a, this.f14370c, this.f14371d.a(z1Var), this.f14372e, this.f14373f);
        }

        public Factory(b.a aVar, l.a aVar2) {
            this.f14368a = (b.a) k4.a.e(aVar);
            this.f14369b = aVar2;
            this.f14371d = new r2.l();
            this.f14372e = new j4.x();
            this.f14373f = 30000;
            this.f14370c = new p3.l();
        }
    }

    static {
        o1.a("goog.exo.smoothstreaming");
    }

    private void J() {
        u0 u0Var;
        for (int i10 = 0; i10 < this.f14362u.size(); i10++) {
            this.f14362u.get(i10).u(this.A);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.A.f23625f) {
            if (bVar.f23641k > 0) {
                j11 = Math.min(j11, bVar.e(0));
                j10 = Math.max(j10, bVar.e(bVar.f23641k - 1) + bVar.c(bVar.f23641k - 1));
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.A.f23623d ? -9223372036854775807L : 0;
            x3.a aVar = this.A;
            boolean z10 = aVar.f23623d;
            u0Var = new u0(j12, 0, 0, 0, true, z10, z10, aVar, this.f14353l);
        } else {
            x3.a aVar2 = this.A;
            if (aVar2.f23623d) {
                long j13 = aVar2.f23627h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long C0 = j15 - n0.C0(this.f14359r);
                if (C0 < 5000000) {
                    C0 = Math.min(5000000, j15 / 2);
                }
                u0Var = new u0(-9223372036854775807L, j15, j14, C0, true, true, true, this.A, this.f14353l);
            } else {
                long j16 = aVar2.f23626g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                u0Var = new u0(j11 + j17, j17, j11, 0, true, false, false, this.A, this.f14353l);
            }
        }
        D(u0Var);
    }

    private void K() {
        if (this.A.f23623d) {
            this.B.postDelayed(new w3.a(this), Math.max(0, (this.f14367z + UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS) - SystemClock.elapsedRealtime()));
        }
    }

    /* access modifiers changed from: private */
    public void L() {
        if (!this.f14364w.i()) {
            j0 j0Var = new j0(this.f14363v, this.f14351j, 4, this.f14361t);
            this.f14360s.z(new q(j0Var.f19351a, j0Var.f19352b, this.f14364w.n(j0Var, this, this.f14358q.d(j0Var.f19353c))), j0Var.f19353c);
        }
    }

    /* access modifiers changed from: protected */
    public void C(p0 p0Var) {
        this.f14366y = p0Var;
        this.f14357p.c(Looper.myLooper(), A());
        this.f14357p.a();
        if (this.f14350i) {
            this.f14365x = new i0.a();
            J();
            return;
        }
        this.f14363v = this.f14354m.a();
        h0 h0Var = new h0("SsMediaSource");
        this.f14364w = h0Var;
        this.f14365x = h0Var;
        this.B = n0.w();
        L();
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.A = this.f14350i ? this.A : null;
        this.f14363v = null;
        this.f14367z = 0;
        h0 h0Var = this.f14364w;
        if (h0Var != null) {
            h0Var.l();
            this.f14364w = null;
        }
        Handler handler = this.B;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.B = null;
        }
        this.f14357p.release();
    }

    /* renamed from: G */
    public void l(j0<x3.a> j0Var, long j10, long j11, boolean z10) {
        j0<x3.a> j0Var2 = j0Var;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        this.f14358q.b(j0Var2.f19351a);
        this.f14360s.q(qVar, j0Var2.f19353c);
    }

    /* renamed from: H */
    public void k(j0<x3.a> j0Var, long j10, long j11) {
        j0<x3.a> j0Var2 = j0Var;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        this.f14358q.b(j0Var2.f19351a);
        this.f14360s.t(qVar, j0Var2.f19353c);
        this.A = j0Var.e();
        this.f14367z = j10 - j11;
        J();
        K();
    }

    /* renamed from: I */
    public h0.c o(j0<x3.a> j0Var, long j10, long j11, IOException iOException, int i10) {
        h0.c cVar;
        j0<x3.a> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        long c10 = this.f14358q.c(new g0.c(qVar, new t(j0Var2.f19353c), iOException2, i10));
        if (c10 == -9223372036854775807L) {
            cVar = h0.f19330g;
        } else {
            cVar = h0.h(false, c10);
        }
        boolean z10 = !cVar.c();
        this.f14360s.x(qVar, j0Var2.f19353c, iOException2, z10);
        if (z10) {
            this.f14358q.b(j0Var2.f19351a);
        }
        return cVar;
    }

    public u a(x.b bVar, j4.b bVar2, long j10) {
        e0.a w10 = w(bVar);
        c cVar = new c(this.A, this.f14355n, this.f14366y, this.f14356o, this.f14357p, u(bVar), this.f14358q, w10, this.f14365x, bVar2);
        this.f14362u.add(cVar);
        return cVar;
    }

    public void b(u uVar) {
        ((c) uVar).q();
        this.f14362u.remove(uVar);
    }

    public z1 g() {
        return this.f14353l;
    }

    public void h() throws IOException {
        this.f14365x.a();
    }

    private SsMediaSource(z1 z1Var, x3.a aVar, l.a aVar2, j0.a<? extends x3.a> aVar3, b.a aVar4, i iVar, y yVar, g0 g0Var, long j10) {
        Uri uri;
        boolean z10 = false;
        k4.a.f(aVar == null || !aVar.f23623d);
        this.f14353l = z1Var;
        z1.h hVar = (z1.h) k4.a.e(z1Var.f20785b);
        this.f14352k = hVar;
        this.A = aVar;
        if (hVar.f20859a.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            uri = n0.B(hVar.f20859a);
        }
        this.f14351j = uri;
        this.f14354m = aVar2;
        this.f14361t = aVar3;
        this.f14355n = aVar4;
        this.f14356o = iVar;
        this.f14357p = yVar;
        this.f14358q = g0Var;
        this.f14359r = j10;
        this.f14360s = w((x.b) null);
        this.f14350i = aVar != null ? true : z10;
        this.f14362u = new ArrayList<>();
    }
}
