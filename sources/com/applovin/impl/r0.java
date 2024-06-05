package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.cb;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.s0;
import com.applovin.impl.wd;
import com.applovin.impl.x1;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class r0 implements nh.e, p1, xq, xd, x1.a, y6 {

    /* renamed from: a  reason: collision with root package name */
    private final j3 f11092a;

    /* renamed from: b  reason: collision with root package name */
    private final go.b f11093b;

    /* renamed from: c  reason: collision with root package name */
    private final go.d f11094c = new go.d();

    /* renamed from: d  reason: collision with root package name */
    private final a f11095d;

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray f11096f;

    /* renamed from: g  reason: collision with root package name */
    private cc f11097g;

    /* renamed from: h  reason: collision with root package name */
    private nh f11098h;

    /* renamed from: i  reason: collision with root package name */
    private ha f11099i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11100j;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final go.b f11101a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ab f11102b = ab.h();

        /* renamed from: c  reason: collision with root package name */
        private cb f11103c = cb.h();

        /* renamed from: d  reason: collision with root package name */
        private wd.a f11104d;

        /* renamed from: e  reason: collision with root package name */
        private wd.a f11105e;

        /* renamed from: f  reason: collision with root package name */
        private wd.a f11106f;

        public a(go.b bVar) {
            this.f11101a = bVar;
        }

        public wd.a b() {
            if (this.f11102b.isEmpty()) {
                return null;
            }
            return (wd.a) rb.b(this.f11102b);
        }

        public wd.a c() {
            return this.f11105e;
        }

        public wd.a d() {
            return this.f11106f;
        }

        private void a(cb.a aVar, wd.a aVar2, go goVar) {
            if (aVar2 != null) {
                if (goVar.a(aVar2.f12394a) != -1) {
                    aVar.a(aVar2, goVar);
                    return;
                }
                go goVar2 = (go) this.f11103c.get(aVar2);
                if (goVar2 != null) {
                    aVar.a(aVar2, goVar2);
                }
            }
        }

        public void b(nh nhVar) {
            this.f11104d = a(nhVar, this.f11102b, this.f11105e, this.f11101a);
            a(nhVar.n());
        }

        private static wd.a a(nh nhVar, ab abVar, wd.a aVar, go.b bVar) {
            go n10 = nhVar.n();
            int v10 = nhVar.v();
            Object b10 = n10.c() ? null : n10.b(v10);
            int a10 = (nhVar.d() || n10.c()) ? -1 : n10.a(v10, bVar).a(r2.a(nhVar.getCurrentPosition()) - bVar.e());
            for (int i10 = 0; i10 < abVar.size(); i10++) {
                wd.a aVar2 = (wd.a) abVar.get(i10);
                if (a(aVar2, b10, nhVar.d(), nhVar.E(), nhVar.f(), a10)) {
                    return aVar2;
                }
            }
            if (abVar.isEmpty() && aVar != null) {
                if (a(aVar, b10, nhVar.d(), nhVar.E(), nhVar.f(), a10)) {
                    return aVar;
                }
            }
            return null;
        }

        public wd.a a() {
            return this.f11104d;
        }

        public go a(wd.a aVar) {
            return (go) this.f11103c.get(aVar);
        }

        private static boolean a(wd.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!aVar.f12394a.equals(obj)) {
                return false;
            }
            if ((z10 && aVar.f12395b == i10 && aVar.f12396c == i11) || (!z10 && aVar.f12395b == -1 && aVar.f12398e == i12)) {
                return true;
            }
            return false;
        }

        public void a(nh nhVar) {
            this.f11104d = a(nhVar, this.f11102b, this.f11105e, this.f11101a);
        }

        public void a(List list, wd.a aVar, nh nhVar) {
            this.f11102b = ab.a((Collection) list);
            if (!list.isEmpty()) {
                this.f11105e = (wd.a) list.get(0);
                this.f11106f = (wd.a) a1.a((Object) aVar);
            }
            if (this.f11104d == null) {
                this.f11104d = a(nhVar, this.f11102b, this.f11105e, this.f11101a);
            }
            a(nhVar.n());
        }

        private void a(go goVar) {
            cb.a a10 = cb.a();
            if (this.f11102b.isEmpty()) {
                a(a10, this.f11105e, goVar);
                if (!Objects.equal(this.f11106f, this.f11105e)) {
                    a(a10, this.f11106f, goVar);
                }
                if (!Objects.equal(this.f11104d, this.f11105e) && !Objects.equal(this.f11104d, this.f11106f)) {
                    a(a10, this.f11104d, goVar);
                }
            } else {
                for (int i10 = 0; i10 < this.f11102b.size(); i10++) {
                    a(a10, (wd.a) this.f11102b.get(i10), goVar);
                }
                if (!this.f11102b.contains(this.f11104d)) {
                    a(a10, this.f11104d, goVar);
                }
            }
            this.f11103c = a10.a();
        }
    }

    public r0(j3 j3Var) {
        this.f11092a = (j3) a1.a((Object) j3Var);
        this.f11097g = new cc(yp.d(), j3Var, x30.f13282a);
        go.b bVar = new go.b();
        this.f11093b = bVar;
        this.f11095d = new a(bVar);
        this.f11096f = new SparseArray();
    }

    private s0.a a(wd.a aVar) {
        go goVar;
        a1.a((Object) this.f11098h);
        if (aVar == null) {
            goVar = null;
        } else {
            goVar = this.f11095d.a(aVar);
        }
        if (aVar != null && goVar != null) {
            return a(goVar, goVar.a(aVar.f12394a, this.f11093b).f8054c, aVar);
        }
        int t10 = this.f11098h.t();
        go n10 = this.f11098h.n();
        if (t10 >= n10.b()) {
            n10 = go.f8049a;
        }
        return a(n10, t10, (wd.a) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0 s0Var, z8 z8Var) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.b(aVar, l5Var);
        s0Var.a(aVar, 1, l5Var);
    }

    private s0.a d() {
        return a(this.f11095d.b());
    }

    private s0.a e() {
        return a(this.f11095d.c());
    }

    private s0.a f(int i10, wd.a aVar) {
        a1.a((Object) this.f11098h);
        if (aVar == null) {
            go n10 = this.f11098h.n();
            if (i10 >= n10.b()) {
                n10 = go.f8049a;
            }
            return a(n10, i10, (wd.a) null);
        } else if (this.f11095d.a(aVar) != null) {
            return a(aVar);
        } else {
            return a(go.f8049a, i10, aVar);
        }
    }

    public /* synthetic */ void a() {
        vz.a(this);
    }

    public /* synthetic */ void a(d9 d9Var) {
        y70.a(this, d9Var);
    }

    public /* synthetic */ void a(nh nhVar, nh.d dVar) {
        vz.j(this, nhVar, dVar);
    }

    public /* synthetic */ void a(p6 p6Var) {
        vz.l(this, p6Var);
    }

    public /* synthetic */ void a(List list) {
        vz.q(this, list);
    }

    public /* synthetic */ void b(int i10, boolean z10) {
        vz.u(this, i10, z10);
    }

    public /* synthetic */ void b(d9 d9Var) {
        c10.a(this, d9Var);
    }

    public /* synthetic */ void b(kh khVar) {
        vz.v(this, khVar);
    }

    /* access modifiers changed from: protected */
    public final s0.a c() {
        return a(this.f11095d.a());
    }

    public /* synthetic */ void e(int i10) {
        uz.s(this, i10);
    }

    public /* synthetic */ void e(int i10, wd.a aVar) {
        k80.a(this, i10, aVar);
    }

    public /* synthetic */ void e(boolean z10) {
        uz.t(this, z10);
    }

    public final void h() {
        if (!this.f11100j) {
            s0.a c10 = c();
            this.f11100j = true;
            a(c10, -1, (cc.a) new z10(c10));
        }
    }

    public void i() {
        s0.a c10 = c();
        this.f11096f.put(1036, c10);
        a(c10, 1036, (cc.a) new g30(c10));
        ((ha) a1.b((Object) this.f11099i)).a((Runnable) new y30(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f11097g.b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.a(aVar, l5Var);
        s0Var.a(aVar, 2, l5Var);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.d(aVar, l5Var);
        s0Var.b(aVar, 2, l5Var);
    }

    public final void d(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1031, (cc.a) new r30(f10));
    }

    public final void c(Exception exc) {
        s0.a f10 = f();
        a(f10, 1037, (cc.a) new j30(f10, exc));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(s0.a aVar, String str, long j10, long j11, s0 s0Var) {
        s0Var.b(aVar, str, j10);
        long j12 = j10;
        s0Var.a(aVar, str, j11, j12);
        s0Var.a(aVar, 2, str, j12);
    }

    private s0.a f() {
        return a(this.f11095d.d());
    }

    /* access modifiers changed from: protected */
    public final s0.a a(go goVar, int i10, wd.a aVar) {
        long j10;
        go goVar2 = goVar;
        int i11 = i10;
        wd.a aVar2 = goVar.c() ? null : aVar;
        long c10 = this.f11092a.c();
        boolean z10 = goVar2.equals(this.f11098h.n()) && i11 == this.f11098h.t();
        if (aVar2 == null || !aVar2.a()) {
            if (z10) {
                j10 = this.f11098h.g();
            } else if (!goVar.c()) {
                j10 = goVar2.a(i11, this.f11094c).b();
            }
            return new s0.a(c10, goVar, i10, aVar2, j10, this.f11098h.n(), this.f11098h.t(), this.f11095d.a(), this.f11098h.getCurrentPosition(), this.f11098h.h());
        } else if (z10 && this.f11098h.E() == aVar2.f12395b && this.f11098h.f() == aVar2.f12396c) {
            j10 = this.f11098h.getCurrentPosition();
            return new s0.a(c10, goVar, i10, aVar2, j10, this.f11098h.n(), this.f11098h.t(), this.f11095d.a(), this.f11098h.getCurrentPosition(), this.f11098h.h());
        }
        j10 = 0;
        return new s0.a(c10, goVar, i10, aVar2, j10, this.f11098h.n(), this.f11098h.t(), this.f11095d.a(), this.f11098h.getCurrentPosition(), this.f11098h.h());
    }

    public void d(boolean z10) {
        s0.a c10 = c();
        a(c10, 7, (cc.a) new s30(c10, z10));
    }

    public final void c(l5 l5Var) {
        s0.a e10 = e();
        a(e10, 1014, (cc.a) new u20(e10, l5Var));
    }

    public final void d(l5 l5Var) {
        s0.a f10 = f();
        a(f10, 1020, (cc.a) new s20(f10, l5Var));
    }

    public final void c(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1033, (cc.a) new v20(f10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(s0.a aVar, d9 d9Var, o5 o5Var, s0 s0Var) {
        s0Var.a(aVar, d9Var);
        s0Var.a(aVar, d9Var, o5Var);
        s0Var.a(aVar, 2, d9Var);
    }

    public final void c(boolean z10) {
        s0.a c10 = c();
        a(c10, 3, (cc.a) new t30(c10, z10));
    }

    public final void b(String str) {
        s0.a f10 = f();
        a(f10, 1013, (cc.a) new m30(f10, str));
    }

    public final void c(int i10, wd.a aVar, ic icVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, (int) AdError.NO_FILL_ERROR_CODE, (cc.a) new n20(f10, icVar, pdVar));
    }

    public final void b(d9 d9Var, o5 o5Var) {
        s0.a f10 = f();
        a(f10, 1010, (cc.a) new m20(f10, d9Var, o5Var));
    }

    public final void c(int i10) {
        s0.a c10 = c();
        a(c10, 8, (cc.a) new d40(c10, i10));
    }

    public final void b(int i10, long j10, long j11) {
        s0.a f10 = f();
        a(f10, 1012, (cc.a) new g20(f10, i10, j10, j11));
    }

    public final void b(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1035, (cc.a) new a40(f10));
    }

    public final void b(int i10, wd.a aVar, ic icVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1000, (cc.a) new p20(f10, icVar, pdVar));
    }

    public final void b(int i10) {
        s0.a c10 = c();
        a(c10, 4, (cc.a) new c20(c10, i10));
    }

    public final void b(boolean z10, int i10) {
        s0.a c10 = c();
        a(c10, -1, (cc.a) new v30(c10, z10, i10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, String str, long j10, long j11, s0 s0Var) {
        s0Var.a(aVar, str, j10);
        long j12 = j10;
        s0Var.b(aVar, str, j11, j12);
        s0Var.a(aVar, 1, str, j12);
    }

    public final void b() {
        s0.a c10 = c();
        a(c10, -1, (cc.a) new z30(c10));
    }

    public final void b(boolean z10) {
        s0.a c10 = c();
        a(c10, 9, (cc.a) new p30(c10, z10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.c(aVar, l5Var);
        s0Var.b(aVar, 1, l5Var);
    }

    public final void b(Exception exc) {
        s0.a f10 = f();
        a(f10, 1038, (cc.a) new f30(f10, exc));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, d9 d9Var, o5 o5Var, s0 s0Var) {
        s0Var.b(aVar, d9Var);
        s0Var.b(aVar, d9Var, o5Var);
        s0Var.a(aVar, 1, d9Var);
    }

    public final void b(String str, long j10, long j11) {
        s0.a f10 = f();
        a(f10, 1021, (cc.a) new n30(f10, str, j11, j10));
    }

    public final void b(l5 l5Var) {
        s0.a e10 = e();
        a(e10, 1025, (cc.a) new w20(e10, l5Var));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, int i10, s0 s0Var) {
        s0Var.f(aVar);
        s0Var.b(aVar, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, boolean z10, s0 s0Var) {
        s0Var.c(aVar, z10);
        s0Var.e(aVar, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, int i10, nh.f fVar, nh.f fVar2, s0 s0Var) {
        s0Var.a(aVar, i10);
        s0Var.a(aVar, fVar, fVar2, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(s0.a aVar, yq yqVar, s0 s0Var) {
        s0Var.a(aVar, yqVar);
        s0Var.a(aVar, yqVar.f13679a, yqVar.f13680b, yqVar.f13681c, yqVar.f13682d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(nh nhVar, s0 s0Var, z8 z8Var) {
        s0Var.a(nhVar, new s0.b(z8Var, this.f11096f));
    }

    public final void a(String str, long j10, long j11) {
        s0.a f10 = f();
        a(f10, 1009, (cc.a) new o30(f10, str, j11, j10));
    }

    public final void a(l5 l5Var) {
        s0.a f10 = f();
        a(f10, 1008, (cc.a) new t20(f10, l5Var));
    }

    public final void a(long j10) {
        s0.a f10 = f();
        a(f10, 1011, (cc.a) new i20(f10, j10));
    }

    public final void a(Exception exc) {
        s0.a f10 = f();
        a(f10, 1018, (cc.a) new h30(f10, exc));
    }

    public void a(nh.b bVar) {
        s0.a c10 = c();
        a(c10, 13, (cc.a) new y20(c10, bVar));
    }

    public final void a(int i10, long j10, long j11) {
        s0.a d10 = d();
        a(d10, 1006, (cc.a) new f20(d10, i10, j10, j11));
    }

    public final void a(int i10, wd.a aVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1004, (cc.a) new a30(f10, pdVar));
    }

    public final void a(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1034, (cc.a) new k20(f10));
    }

    public final void a(int i10, wd.a aVar, int i11) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1030, (cc.a) new c40(f10, i11));
    }

    public final void a(int i10, wd.a aVar, Exception exc) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1032, (cc.a) new i30(f10, exc));
    }

    public final void a(int i10, long j10) {
        s0.a e10 = e();
        a(e10, 1023, (cc.a) new e20(e10, i10, j10));
    }

    public final void a(int i10, wd.a aVar, ic icVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, (int) AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, (cc.a) new o20(f10, icVar, pdVar));
    }

    public final void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1003, (cc.a) new q20(f10, icVar, pdVar, iOException, z10));
    }

    public final void a(od odVar, int i10) {
        s0.a c10 = c();
        a(c10, 1, (cc.a) new z20(c10, odVar, i10));
    }

    public void a(qd qdVar) {
        s0.a c10 = c();
        a(c10, 14, (cc.a) new b30(c10, qdVar));
    }

    public final void a(we weVar) {
        s0.a c10 = c();
        a(c10, 1007, (cc.a) new d30(c10, weVar));
    }

    public final void a(boolean z10, int i10) {
        s0.a c10 = c();
        a(c10, 5, (cc.a) new u30(c10, z10, i10));
    }

    public final void a(mh mhVar) {
        s0.a c10 = c();
        a(c10, 12, (cc.a) new x20(c10, mhVar));
    }

    public final void a(int i10) {
        s0.a c10 = c();
        a(c10, 6, (cc.a) new b20(c10, i10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((com.applovin.impl.y7) r3).f13537j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.applovin.impl.kh r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.applovin.impl.y7
            if (r0 == 0) goto L_0x0015
            r0 = r3
            com.applovin.impl.y7 r0 = (com.applovin.impl.y7) r0
            com.applovin.impl.td r0 = r0.f13537j
            if (r0 == 0) goto L_0x0015
            com.applovin.impl.wd$a r1 = new com.applovin.impl.wd$a
            r1.<init>((com.applovin.impl.td) r0)
            com.applovin.impl.s0$a r0 = r2.a((com.applovin.impl.wd.a) r1)
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001c
            com.applovin.impl.s0$a r0 = r2.c()
        L_0x001c:
            com.applovin.impl.r20 r1 = new com.applovin.impl.r20
            r1.<init>(r0, r3)
            r3 = 10
            r2.a((com.applovin.impl.s0.a) r0, (int) r3, (com.applovin.impl.cc.a) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.r0.a(com.applovin.impl.kh):void");
    }

    public final void a(nh.f fVar, nh.f fVar2, int i10) {
        if (i10 == 1) {
            this.f11100j = false;
        }
        this.f11095d.a((nh) a1.a((Object) this.f11098h));
        s0.a c10 = c();
        a(c10, 11, (cc.a) new h20(c10, i10, fVar, fVar2));
    }

    public final void a(Object obj, long j10) {
        s0.a f10 = f();
        a(f10, 1027, (cc.a) new k30(f10, obj, j10));
    }

    public final void a(boolean z10) {
        s0.a f10 = f();
        a(f10, 1017, (cc.a) new q30(f10, z10));
    }

    public void a(int i10, int i11) {
        s0.a f10 = f();
        a(f10, 1029, (cc.a) new d20(f10, i10, i11));
    }

    public final void a(go goVar, int i10) {
        this.f11095d.b((nh) a1.a((Object) this.f11098h));
        s0.a c10 = c();
        a(c10, 0, (cc.a) new a20(c10, i10));
    }

    public final void a(qo qoVar, uo uoVar) {
        s0.a c10 = c();
        a(c10, 2, (cc.a) new c30(c10, qoVar, uoVar));
    }

    public final void a(String str) {
        s0.a f10 = f();
        a(f10, 1024, (cc.a) new l30(f10, str));
    }

    public final void a(long j10, int i10) {
        s0.a e10 = e();
        a(e10, 1026, (cc.a) new j20(e10, j10, i10));
    }

    public final void a(d9 d9Var, o5 o5Var) {
        s0.a f10 = f();
        a(f10, 1022, (cc.a) new l20(f10, d9Var, o5Var));
    }

    public final void a(yq yqVar) {
        s0.a f10 = f();
        a(f10, 1028, (cc.a) new e30(f10, yqVar));
    }

    public final void a(float f10) {
        s0.a f11 = f();
        a(f11, 1019, (cc.a) new b40(f11, f10));
    }

    /* access modifiers changed from: protected */
    public final void a(s0.a aVar, int i10, cc.a aVar2) {
        this.f11096f.put(i10, aVar);
        this.f11097g.b(i10, aVar2);
    }

    public void a(nh nhVar, Looper looper) {
        a1.b(this.f11098h == null || this.f11095d.f11102b.isEmpty());
        this.f11098h = (nh) a1.a((Object) nhVar);
        this.f11099i = this.f11092a.a(looper, (Handler.Callback) null);
        this.f11097g = this.f11097g.a(looper, (cc.b) new w30(this, nhVar));
    }

    public final void a(List list, wd.a aVar) {
        this.f11095d.a(list, aVar, (nh) a1.a((Object) this.f11098h));
    }
}
