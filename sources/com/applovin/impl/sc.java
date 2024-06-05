package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.od;
import com.applovin.impl.wd;

public final class sc extends z3 {

    /* renamed from: j  reason: collision with root package name */
    private final wd f11347j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f11348k;

    /* renamed from: l  reason: collision with root package name */
    private final go.d f11349l;

    /* renamed from: m  reason: collision with root package name */
    private final go.b f11350m;

    /* renamed from: n  reason: collision with root package name */
    private a f11351n;

    /* renamed from: o  reason: collision with root package name */
    private rc f11352o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11353p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11354q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11355r;

    private static final class a extends g9 {

        /* renamed from: g  reason: collision with root package name */
        public static final Object f11356g = new Object();

        /* renamed from: d  reason: collision with root package name */
        private final Object f11357d;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final Object f11358f;

        private a(go goVar, Object obj, Object obj2) {
            super(goVar);
            this.f11357d = obj;
            this.f11358f = obj2;
        }

        public Object b(int i10) {
            Object b10 = this.f7934c.b(i10);
            return yp.a(b10, this.f11358f) ? f11356g : b10;
        }

        public int a(Object obj) {
            Object obj2;
            go goVar = this.f7934c;
            if (f11356g.equals(obj) && (obj2 = this.f11358f) != null) {
                obj = obj2;
            }
            return goVar.a(obj);
        }

        public go.b a(int i10, go.b bVar, boolean z10) {
            this.f7934c.a(i10, bVar, z10);
            if (yp.a(bVar.f8053b, this.f11358f) && z10) {
                bVar.f8053b = f11356g;
            }
            return bVar;
        }

        public go.d a(int i10, go.d dVar, long j10) {
            this.f7934c.a(i10, dVar, j10);
            if (yp.a(dVar.f8067a, this.f11357d)) {
                dVar.f8067a = go.d.f8063s;
            }
            return dVar;
        }

        public static a a(od odVar) {
            return new a(new b(odVar), go.d.f8063s, f11356g);
        }

        public static a a(go goVar, Object obj, Object obj2) {
            return new a(goVar, obj, obj2);
        }

        public a a(go goVar) {
            return new a(goVar, this.f11357d, this.f11358f);
        }
    }

    public static final class b extends go {

        /* renamed from: c  reason: collision with root package name */
        private final od f11359c;

        public b(od odVar) {
            this.f11359c = odVar;
        }

        public int a() {
            return 1;
        }

        public int a(Object obj) {
            return obj == a.f11356g ? 0 : -1;
        }

        public int b() {
            return 1;
        }

        public Object b(int i10) {
            return a.f11356g;
        }

        public go.b a(int i10, go.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f11356g;
            }
            bVar.a(num, obj, 0, -9223372036854775807L, 0, u.f12457h, true);
            return bVar;
        }

        public go.d a(int i10, go.d dVar, long j10) {
            go.d dVar2 = dVar;
            dVar.a(go.d.f8063s, this.f11359c, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (od.f) null, 0, -9223372036854775807L, 0, 0, 0);
            go.d dVar3 = dVar;
            dVar3.f8078m = true;
            return dVar3;
        }
    }

    public sc(wd wdVar, boolean z10) {
        this.f11347j = wdVar;
        this.f11348k = z10 && wdVar.c();
        this.f11349l = new go.d();
        this.f11350m = new go.b();
        go d10 = wdVar.d();
        if (d10 != null) {
            this.f11351n = a.a(d10, (Object) null, (Object) null);
            this.f11355r = true;
            return;
        }
        this.f11351n = a.a(wdVar.a());
    }

    /* renamed from: b */
    public rc a(wd.a aVar, n0 n0Var, long j10) {
        rc rcVar = new rc(aVar, n0Var, j10);
        rcVar.a(this.f11347j);
        if (this.f11354q) {
            rcVar.a(aVar.b(b(aVar.f12394a)));
        } else {
            this.f11352o = rcVar;
            if (!this.f11353p) {
                this.f11353p = true;
                a((Object) null, this.f11347j);
            }
        }
        return rcVar;
    }

    public void b() {
    }

    public void h() {
        this.f11354q = false;
        this.f11353p = false;
        super.h();
    }

    public go i() {
        return this.f11351n;
    }

    private Object a(Object obj) {
        return (this.f11351n.f11358f == null || !this.f11351n.f11358f.equals(obj)) ? obj : a.f11356g;
    }

    public od a() {
        return this.f11347j.a();
    }

    /* access modifiers changed from: protected */
    public wd.a a(Void voidR, wd.a aVar) {
        return aVar.b(a(aVar.f12394a));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.Void r13, com.applovin.impl.wd r14, com.applovin.impl.go r15) {
        /*
            r12 = this;
            boolean r13 = r12.f11354q
            if (r13 == 0) goto L_0x0019
            com.applovin.impl.sc$a r13 = r12.f11351n
            com.applovin.impl.sc$a r13 = r13.a((com.applovin.impl.go) r15)
            r12.f11351n = r13
            com.applovin.impl.rc r13 = r12.f11352o
            if (r13 == 0) goto L_0x00ae
            long r13 = r13.c()
            r12.a((long) r13)
            goto L_0x00ae
        L_0x0019:
            boolean r13 = r15.c()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f11355r
            if (r13 == 0) goto L_0x002a
            com.applovin.impl.sc$a r13 = r12.f11351n
            com.applovin.impl.sc$a r13 = r13.a((com.applovin.impl.go) r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = com.applovin.impl.go.d.f8063s
            java.lang.Object r14 = com.applovin.impl.sc.a.f11356g
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a((com.applovin.impl.go) r15, (java.lang.Object) r13, (java.lang.Object) r14)
        L_0x0032:
            r12.f11351n = r13
            goto L_0x00ae
        L_0x0036:
            com.applovin.impl.go$d r13 = r12.f11349l
            r14 = 0
            r15.a((int) r14, (com.applovin.impl.go.d) r13)
            com.applovin.impl.go$d r13 = r12.f11349l
            long r0 = r13.c()
            com.applovin.impl.go$d r13 = r12.f11349l
            java.lang.Object r13 = r13.f8067a
            com.applovin.impl.rc r2 = r12.f11352o
            if (r2 == 0) goto L_0x0074
            long r2 = r2.d()
            com.applovin.impl.sc$a r4 = r12.f11351n
            com.applovin.impl.rc r5 = r12.f11352o
            com.applovin.impl.wd$a r5 = r5.f11170a
            java.lang.Object r5 = r5.f12394a
            com.applovin.impl.go$b r6 = r12.f11350m
            r4.a((java.lang.Object) r5, (com.applovin.impl.go.b) r6)
            com.applovin.impl.go$b r4 = r12.f11350m
            long r4 = r4.e()
            long r4 = r4 + r2
            com.applovin.impl.sc$a r2 = r12.f11351n
            com.applovin.impl.go$d r3 = r12.f11349l
            com.applovin.impl.go$d r14 = r2.a((int) r14, (com.applovin.impl.go.d) r3)
            long r2 = r14.c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            com.applovin.impl.go$d r7 = r12.f11349l
            com.applovin.impl.go$b r8 = r12.f11350m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f11355r
            if (r14 == 0) goto L_0x0094
            com.applovin.impl.sc$a r13 = r12.f11351n
            com.applovin.impl.sc$a r13 = r13.a((com.applovin.impl.go) r15)
            goto L_0x0098
        L_0x0094:
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a((com.applovin.impl.go) r15, (java.lang.Object) r13, (java.lang.Object) r0)
        L_0x0098:
            r12.f11351n = r13
            com.applovin.impl.rc r13 = r12.f11352o
            if (r13 == 0) goto L_0x00ae
            r12.a((long) r1)
            com.applovin.impl.wd$a r13 = r13.f11170a
            java.lang.Object r14 = r13.f12394a
            java.lang.Object r14 = r12.b(r14)
            com.applovin.impl.wd$a r13 = r13.b(r14)
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14 = 1
            r12.f11355r = r14
            r12.f11354q = r14
            com.applovin.impl.sc$a r14 = r12.f11351n
            r12.a((com.applovin.impl.go) r14)
            if (r13 == 0) goto L_0x00c6
            com.applovin.impl.rc r14 = r12.f11352o
            java.lang.Object r14 = com.applovin.impl.a1.a((java.lang.Object) r14)
            com.applovin.impl.rc r14 = (com.applovin.impl.rc) r14
            r14.a((com.applovin.impl.wd.a) r13)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sc.b(java.lang.Void, com.applovin.impl.wd, com.applovin.impl.go):void");
    }

    private Object b(Object obj) {
        return (this.f11351n.f11358f == null || !obj.equals(a.f11356g)) ? obj : this.f11351n.f11358f;
    }

    public void a(yo yoVar) {
        super.a(yoVar);
        if (!this.f11348k) {
            this.f11353p = true;
            a((Object) null, this.f11347j);
        }
    }

    public void a(rd rdVar) {
        ((rc) rdVar).i();
        if (rdVar == this.f11352o) {
            this.f11352o = null;
        }
    }

    private void a(long j10) {
        rc rcVar = this.f11352o;
        int a10 = this.f11351n.a(rcVar.f11170a.f12394a);
        if (a10 != -1) {
            long j11 = this.f11351n.a(a10, this.f11350m).f8055d;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            rcVar.e(j10);
        }
    }
}
