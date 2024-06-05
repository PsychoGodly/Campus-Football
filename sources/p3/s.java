package p3;

import k4.n0;
import n2.c4;
import n2.z1;
import p3.x;
import q3.c;

/* compiled from: MaskingMediaSource */
public final class s extends b1 {

    /* renamed from: n  reason: collision with root package name */
    private final boolean f21627n;

    /* renamed from: o  reason: collision with root package name */
    private final c4.d f21628o;

    /* renamed from: p  reason: collision with root package name */
    private final c4.b f21629p;

    /* renamed from: q  reason: collision with root package name */
    private a f21630q;

    /* renamed from: r  reason: collision with root package name */
    private r f21631r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f21632s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f21633t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f21634u;

    /* compiled from: MaskingMediaSource */
    private static final class a extends o {

        /* renamed from: j  reason: collision with root package name */
        public static final Object f21635j = new Object();

        /* renamed from: h  reason: collision with root package name */
        private final Object f21636h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public final Object f21637i;

        private a(c4 c4Var, Object obj, Object obj2) {
            super(c4Var);
            this.f21636h = obj;
            this.f21637i = obj2;
        }

        public static a y(z1 z1Var) {
            return new a(new b(z1Var), c4.d.f20227s, f21635j);
        }

        public static a z(c4 c4Var, Object obj, Object obj2) {
            return new a(c4Var, obj, obj2);
        }

        public int f(Object obj) {
            Object obj2;
            c4 c4Var = this.f21573g;
            if (f21635j.equals(obj) && (obj2 = this.f21637i) != null) {
                obj = obj2;
            }
            return c4Var.f(obj);
        }

        public c4.b k(int i10, c4.b bVar, boolean z10) {
            this.f21573g.k(i10, bVar, z10);
            if (n0.c(bVar.f20217b, this.f21637i) && z10) {
                bVar.f20217b = f21635j;
            }
            return bVar;
        }

        public Object q(int i10) {
            Object q10 = this.f21573g.q(i10);
            return n0.c(q10, this.f21637i) ? f21635j : q10;
        }

        public c4.d s(int i10, c4.d dVar, long j10) {
            this.f21573g.s(i10, dVar, j10);
            if (n0.c(dVar.f20235a, this.f21636h)) {
                dVar.f20235a = c4.d.f20227s;
            }
            return dVar;
        }

        public a x(c4 c4Var) {
            return new a(c4Var, this.f21636h, this.f21637i);
        }
    }

    /* compiled from: MaskingMediaSource */
    public static final class b extends c4 {

        /* renamed from: g  reason: collision with root package name */
        private final z1 f21638g;

        public b(z1 z1Var) {
            this.f21638g = z1Var;
        }

        public int f(Object obj) {
            return obj == a.f21635j ? 0 : -1;
        }

        public c4.b k(int i10, c4.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f21635j;
            }
            bVar.v(num, obj, 0, -9223372036854775807L, 0, c.f21784h, true);
            return bVar;
        }

        public int m() {
            return 1;
        }

        public Object q(int i10) {
            return a.f21635j;
        }

        public c4.d s(int i10, c4.d dVar, long j10) {
            c4.d dVar2 = dVar;
            dVar.i(c4.d.f20227s, this.f21638g, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (z1.g) null, 0, -9223372036854775807L, 0, 0, 0);
            c4.d dVar3 = dVar;
            dVar3.f20246m = true;
            return dVar3;
        }

        public int t() {
            return 1;
        }
    }

    public s(x xVar, boolean z10) {
        super(xVar);
        this.f21627n = z10 && xVar.i();
        this.f21628o = new c4.d();
        this.f21629p = new c4.b();
        c4 j10 = xVar.j();
        if (j10 != null) {
            this.f21630q = a.z(j10, (Object) null, (Object) null);
            this.f21634u = true;
            return;
        }
        this.f21630q = a.y(xVar.g());
    }

    private Object a0(Object obj) {
        return (this.f21630q.f21637i == null || !this.f21630q.f21637i.equals(obj)) ? obj : a.f21635j;
    }

    private Object b0(Object obj) {
        return (this.f21630q.f21637i == null || !obj.equals(a.f21635j)) ? obj : this.f21630q.f21637i;
    }

    private void d0(long j10) {
        r rVar = this.f21631r;
        int f10 = this.f21630q.f(rVar.f21618a.f21677a);
        if (f10 != -1) {
            long j11 = this.f21630q.j(f10, this.f21629p).f20219d;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            rVar.u(j10);
        }
    }

    public void E() {
        this.f21633t = false;
        this.f21632s = false;
        super.E();
    }

    /* access modifiers changed from: protected */
    public x.b Q(x.b bVar) {
        return bVar.c(a0(bVar.f21677a));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W(n2.c4 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f21633t
            if (r0 == 0) goto L_0x0019
            p3.s$a r0 = r14.f21630q
            p3.s$a r15 = r0.x(r15)
            r14.f21630q = r15
            p3.r r15 = r14.f21631r
            if (r15 == 0) goto L_0x00ae
            long r0 = r15.k()
            r14.d0(r0)
            goto L_0x00ae
        L_0x0019:
            boolean r0 = r15.u()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.f21634u
            if (r0 == 0) goto L_0x002a
            p3.s$a r0 = r14.f21630q
            p3.s$a r15 = r0.x(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r0 = n2.c4.d.f20227s
            java.lang.Object r1 = p3.s.a.f21635j
            p3.s$a r15 = p3.s.a.z(r15, r0, r1)
        L_0x0032:
            r14.f21630q = r15
            goto L_0x00ae
        L_0x0036:
            n2.c4$d r0 = r14.f21628o
            r1 = 0
            r15.r(r1, r0)
            n2.c4$d r0 = r14.f21628o
            long r2 = r0.e()
            n2.c4$d r0 = r14.f21628o
            java.lang.Object r0 = r0.f20235a
            p3.r r4 = r14.f21631r
            if (r4 == 0) goto L_0x0074
            long r4 = r4.l()
            p3.s$a r6 = r14.f21630q
            p3.r r7 = r14.f21631r
            p3.x$b r7 = r7.f21618a
            java.lang.Object r7 = r7.f21677a
            n2.c4$b r8 = r14.f21629p
            r6.l(r7, r8)
            n2.c4$b r6 = r14.f21629p
            long r6 = r6.q()
            long r6 = r6 + r4
            p3.s$a r4 = r14.f21630q
            n2.c4$d r5 = r14.f21628o
            n2.c4$d r1 = r4.r(r1, r5)
            long r4 = r1.e()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0074
            r12 = r6
            goto L_0x0075
        L_0x0074:
            r12 = r2
        L_0x0075:
            n2.c4$d r9 = r14.f21628o
            n2.c4$b r10 = r14.f21629p
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.n(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f21634u
            if (r1 == 0) goto L_0x0094
            p3.s$a r0 = r14.f21630q
            p3.s$a r15 = r0.x(r15)
            goto L_0x0098
        L_0x0094:
            p3.s$a r15 = p3.s.a.z(r15, r0, r2)
        L_0x0098:
            r14.f21630q = r15
            p3.r r15 = r14.f21631r
            if (r15 == 0) goto L_0x00ae
            r14.d0(r3)
            p3.x$b r15 = r15.f21618a
            java.lang.Object r0 = r15.f21677a
            java.lang.Object r0 = r14.b0(r0)
            p3.x$b r15 = r15.c(r0)
            goto L_0x00af
        L_0x00ae:
            r15 = 0
        L_0x00af:
            r0 = 1
            r14.f21634u = r0
            r14.f21633t = r0
            p3.s$a r0 = r14.f21630q
            r14.D(r0)
            if (r15 == 0) goto L_0x00c6
            p3.r r0 = r14.f21631r
            java.lang.Object r0 = k4.a.e(r0)
            p3.r r0 = (p3.r) r0
            r0.a(r15)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.s.W(n2.c4):void");
    }

    public void Y() {
        if (!this.f21627n) {
            this.f21632s = true;
            X();
        }
    }

    /* renamed from: Z */
    public r a(x.b bVar, j4.b bVar2, long j10) {
        r rVar = new r(bVar, bVar2, j10);
        rVar.w(this.f21406l);
        if (this.f21633t) {
            rVar.a(bVar.c(b0(bVar.f21677a)));
        } else {
            this.f21631r = rVar;
            if (!this.f21632s) {
                this.f21632s = true;
                X();
            }
        }
        return rVar;
    }

    public void b(u uVar) {
        ((r) uVar).v();
        if (uVar == this.f21631r) {
            this.f21631r = null;
        }
    }

    public c4 c0() {
        return this.f21630q;
    }

    public void h() {
    }
}
