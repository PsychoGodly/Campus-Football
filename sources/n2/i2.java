package n2;

import i4.b0;
import i4.c0;
import j4.b;
import k4.n;
import n2.c4;
import o2.a;
import p3.x;
import s6.u;

/* compiled from: MediaPeriodQueue */
final class i2 {

    /* renamed from: a  reason: collision with root package name */
    private final c4.b f20441a = new c4.b();

    /* renamed from: b  reason: collision with root package name */
    private final c4.d f20442b = new c4.d();

    /* renamed from: c  reason: collision with root package name */
    private final a f20443c;

    /* renamed from: d  reason: collision with root package name */
    private final n f20444d;

    /* renamed from: e  reason: collision with root package name */
    private long f20445e;

    /* renamed from: f  reason: collision with root package name */
    private int f20446f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20447g;

    /* renamed from: h  reason: collision with root package name */
    private f2 f20448h;

    /* renamed from: i  reason: collision with root package name */
    private f2 f20449i;

    /* renamed from: j  reason: collision with root package name */
    private f2 f20450j;

    /* renamed from: k  reason: collision with root package name */
    private int f20451k;

    /* renamed from: l  reason: collision with root package name */
    private Object f20452l;

    /* renamed from: m  reason: collision with root package name */
    private long f20453m;

    public i2(a aVar, n nVar) {
        this.f20443c = aVar;
        this.f20444d = nVar;
    }

    private static x.b A(c4 c4Var, Object obj, long j10, long j11, c4.d dVar, c4.b bVar) {
        c4Var.l(obj, bVar);
        c4Var.r(bVar.f20218c, dVar);
        int f10 = c4Var.f(obj);
        Object obj2 = obj;
        while (bVar.f20219d == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0) == -1) {
            int i10 = f10 + 1;
            if (f10 >= dVar.f20250q) {
                break;
            }
            c4Var.k(i10, bVar, true);
            obj2 = k4.a.e(bVar.f20217b);
            f10 = i10;
        }
        c4Var.l(obj2, bVar);
        int h10 = bVar.h(j10);
        if (h10 == -1) {
            return new x.b(obj2, j11, bVar.g(j10));
        }
        return new x.b(obj2, h10, bVar.n(h10), j11);
    }

    private long C(c4 c4Var, Object obj) {
        int f10;
        int i10 = c4Var.l(obj, this.f20441a).f20218c;
        Object obj2 = this.f20452l;
        if (obj2 != null && (f10 = c4Var.f(obj2)) != -1 && c4Var.j(f10, this.f20441a).f20218c == i10) {
            return this.f20453m;
        }
        for (f2 f2Var = this.f20448h; f2Var != null; f2Var = f2Var.j()) {
            if (f2Var.f20366b.equals(obj)) {
                return f2Var.f20370f.f20388a.f21680d;
            }
        }
        for (f2 f2Var2 = this.f20448h; f2Var2 != null; f2Var2 = f2Var2.j()) {
            int f11 = c4Var.f(f2Var2.f20366b);
            if (f11 != -1 && c4Var.j(f11, this.f20441a).f20218c == i10) {
                return f2Var2.f20370f.f20388a.f21680d;
            }
        }
        long j10 = this.f20445e;
        this.f20445e = 1 + j10;
        if (this.f20448h == null) {
            this.f20452l = obj;
            this.f20453m = j10;
        }
        return j10;
    }

    private boolean E(c4 c4Var) {
        f2 f2Var = this.f20448h;
        if (f2Var == null) {
            return true;
        }
        int f10 = c4Var.f(f2Var.f20366b);
        while (true) {
            f10 = c4Var.h(f10, this.f20441a, this.f20442b, this.f20446f, this.f20447g);
            while (f2Var.j() != null && !f2Var.f20370f.f20394g) {
                f2Var = f2Var.j();
            }
            f2 j10 = f2Var.j();
            if (f10 == -1 || j10 == null || c4Var.f(j10.f20366b) != f10) {
                boolean z10 = z(f2Var);
                f2Var.f20370f = r(c4Var, f2Var.f20370f);
            } else {
                f2Var = j10;
            }
        }
        boolean z102 = z(f2Var);
        f2Var.f20370f = r(c4Var, f2Var.f20370f);
        return !z102;
    }

    private boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(g2 g2Var, g2 g2Var2) {
        return g2Var.f20389b == g2Var2.f20389b && g2Var.f20388a.equals(g2Var2.f20388a);
    }

    private g2 h(d3 d3Var) {
        return k(d3Var.f20264a, d3Var.f20265b, d3Var.f20266c, d3Var.f20281r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        if (r0.t(r0.r()) != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private n2.g2 i(n2.c4 r20, n2.f2 r21, long r22) {
        /*
            r19 = this;
            r9 = r19
            r8 = r20
            r10 = r21
            n2.g2 r11 = r10.f20370f
            long r0 = r21.l()
            long r2 = r11.f20392e
            long r0 = r0 + r2
            long r6 = r0 - r22
            boolean r0 = r11.f20394g
            r13 = -1
            r14 = 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            if (r0 == 0) goto L_0x00ef
            p3.x$b r0 = r11.f20388a
            java.lang.Object r0 = r0.f21677a
            int r1 = r8.f(r0)
            n2.c4$b r2 = r9.f20441a
            n2.c4$d r3 = r9.f20442b
            int r0 = r9.f20446f
            boolean r5 = r9.f20447g
            r4 = r0
            r0 = r20
            int r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L_0x0038
            return r17
        L_0x0038:
            n2.c4$b r1 = r9.f20441a
            n2.c4$b r1 = r8.k(r0, r1, r14)
            int r3 = r1.f20218c
            n2.c4$b r1 = r9.f20441a
            java.lang.Object r1 = r1.f20217b
            java.lang.Object r1 = k4.a.e(r1)
            p3.x$b r2 = r11.f20388a
            long r4 = r2.f21680d
            n2.c4$d r2 = r9.f20442b
            n2.c4$d r2 = r8.r(r3, r2)
            int r2 = r2.f20249p
            if (r2 != r0) goto L_0x0099
            n2.c4$d r1 = r9.f20442b
            n2.c4$b r2 = r9.f20441a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x006e
            return r17
        L_0x006e:
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            n2.f2 r0 = r21.j()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r2 = r0.f20366b
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x008d
            n2.g2 r0 = r0.f20370f
            p3.x$b r0 = r0.f20388a
            long r2 = r0.f21680d
            goto L_0x0094
        L_0x008d:
            long r2 = r9.f20445e
            r6 = 1
            long r6 = r6 + r2
            r9.f20445e = r6
        L_0x0094:
            r12 = r4
            r17 = r15
            r4 = r2
            goto L_0x009d
        L_0x0099:
            r12 = 0
            r17 = r12
        L_0x009d:
            n2.c4$d r6 = r9.f20442b
            n2.c4$b r7 = r9.f20441a
            r0 = r20
            r2 = r12
            p3.x$b r2 = A(r0, r1, r2, r4, r6, r7)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            long r0 = r11.f20390c
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x00e3
            p3.x$b r0 = r11.f20388a
            java.lang.Object r0 = r0.f21677a
            n2.c4$b r1 = r9.f20441a
            n2.c4$b r0 = r8.l(r0, r1)
            int r0 = r0.f()
            if (r0 <= 0) goto L_0x00cf
            n2.c4$b r0 = r9.f20441a
            int r1 = r0.r()
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r14 = 0
        L_0x00d0:
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x00dd
            if (r14 == 0) goto L_0x00dd
            long r0 = r11.f20390c
            r3 = r0
            r5 = r12
            goto L_0x00e6
        L_0x00dd:
            if (r14 == 0) goto L_0x00e3
            long r0 = r11.f20390c
            r5 = r0
            goto L_0x00e4
        L_0x00e3:
            r5 = r12
        L_0x00e4:
            r3 = r17
        L_0x00e6:
            r0 = r19
            r1 = r20
            n2.g2 r0 = r0.k(r1, r2, r3, r5)
            return r0
        L_0x00ef:
            r0 = -1
            r12 = 0
            p3.x$b r10 = r11.f20388a
            java.lang.Object r1 = r10.f21677a
            n2.c4$b r2 = r9.f20441a
            r8.l(r1, r2)
            boolean r1 = r10.b()
            if (r1 == 0) goto L_0x016b
            int r3 = r10.f21678b
            n2.c4$b r1 = r9.f20441a
            int r1 = r1.d(r3)
            if (r1 != r0) goto L_0x010c
            return r17
        L_0x010c:
            n2.c4$b r0 = r9.f20441a
            int r2 = r10.f21679c
            int r4 = r0.o(r3, r2)
            if (r4 >= r1) goto L_0x0126
            java.lang.Object r2 = r10.f21677a
            long r5 = r11.f20390c
            long r10 = r10.f21680d
            r0 = r19
            r1 = r20
            r7 = r10
            n2.g2 r0 = r0.l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x0126:
            long r0 = r11.f20390c
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x014c
            n2.c4$d r1 = r9.f20442b
            n2.c4$b r2 = r9.f20441a
            int r3 = r2.f20218c
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x0144
            return r17
        L_0x0144:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x014c:
            java.lang.Object r2 = r10.f21677a
            int r3 = r10.f21678b
            long r2 = r9.n(r8, r2, r3)
            java.lang.Object r4 = r10.f21677a
            long r5 = java.lang.Math.max(r2, r0)
            long r11 = r11.f20390c
            long r13 = r10.f21680d
            r0 = r19
            r1 = r20
            r2 = r4
            r3 = r5
            r5 = r11
            r7 = r13
            n2.g2 r0 = r0.m(r1, r2, r3, r5, r7)
            return r0
        L_0x016b:
            n2.c4$b r0 = r9.f20441a
            int r1 = r10.f21681e
            int r4 = r0.n(r1)
            n2.c4$b r0 = r9.f20441a
            int r1 = r10.f21681e
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x018a
            n2.c4$b r0 = r9.f20441a
            int r1 = r10.f21681e
            int r0 = r0.k(r1, r4)
            r1 = 3
            if (r0 != r1) goto L_0x018a
            r12 = 1
            goto L_0x018b
        L_0x018a:
            r12 = 0
        L_0x018b:
            n2.c4$b r0 = r9.f20441a
            int r1 = r10.f21681e
            int r0 = r0.d(r1)
            if (r4 == r0) goto L_0x01aa
            if (r12 == 0) goto L_0x0198
            goto L_0x01aa
        L_0x0198:
            java.lang.Object r2 = r10.f21677a
            int r3 = r10.f21681e
            long r5 = r11.f20392e
            long r10 = r10.f21680d
            r0 = r19
            r1 = r20
            r7 = r10
            n2.g2 r0 = r0.l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x01aa:
            java.lang.Object r0 = r10.f21677a
            int r1 = r10.f21681e
            long r3 = r9.n(r8, r0, r1)
            java.lang.Object r2 = r10.f21677a
            long r5 = r11.f20392e
            long r10 = r10.f21680d
            r0 = r19
            r1 = r20
            r7 = r10
            n2.g2 r0 = r0.m(r1, r2, r3, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.i2.i(n2.c4, n2.f2, long):n2.g2");
    }

    private g2 k(c4 c4Var, x.b bVar, long j10, long j11) {
        x.b bVar2 = bVar;
        c4 c4Var2 = c4Var;
        c4Var.l(bVar2.f21677a, this.f20441a);
        if (bVar.b()) {
            return l(c4Var, bVar2.f21677a, bVar2.f21678b, bVar2.f21679c, j10, bVar2.f21680d);
        }
        return m(c4Var, bVar2.f21677a, j11, j10, bVar2.f21680d);
    }

    private g2 l(c4 c4Var, Object obj, int i10, int i11, long j10, long j11) {
        int i12 = i11;
        x.b bVar = new x.b(obj, i10, i12, j11);
        long e10 = c4Var.l(bVar.f21677a, this.f20441a).e(bVar.f21678b, bVar.f21679c);
        long j12 = i12 == this.f20441a.n(i10) ? this.f20441a.j() : 0;
        return new g2(bVar, (e10 == -9223372036854775807L || j12 < e10) ? j12 : Math.max(0, e10 - 1), j10, -9223372036854775807L, e10, this.f20441a.t(bVar.f21678b), false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r9.t(r9.r()) != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private n2.g2 m(n2.c4 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            n2.c4$b r5 = r0.f20441a
            r1.l(r2, r5)
            n2.c4$b r5 = r0.f20441a
            int r5 = r5.g(r3)
            r6 = 1
            r7 = -1
            r8 = 0
            if (r5 != r7) goto L_0x002d
            n2.c4$b r9 = r0.f20441a
            int r9 = r9.f()
            if (r9 <= 0) goto L_0x004c
            n2.c4$b r9 = r0.f20441a
            int r10 = r9.r()
            boolean r9 = r9.t(r10)
            if (r9 == 0) goto L_0x004c
            goto L_0x004a
        L_0x002d:
            n2.c4$b r9 = r0.f20441a
            boolean r9 = r9.t(r5)
            if (r9 == 0) goto L_0x004c
            n2.c4$b r9 = r0.f20441a
            long r9 = r9.i(r5)
            n2.c4$b r11 = r0.f20441a
            long r12 = r11.f20219d
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x004c
            boolean r9 = r11.s(r5)
            if (r9 == 0) goto L_0x004c
            r5 = -1
        L_0x004a:
            r9 = 1
            goto L_0x004d
        L_0x004c:
            r9 = 0
        L_0x004d:
            p3.x$b r11 = new p3.x$b
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.s(r11)
            boolean r22 = r0.u(r1, r11)
            boolean r23 = r0.t(r1, r11, r2)
            if (r5 == r7) goto L_0x006d
            n2.c4$b r1 = r0.f20441a
            boolean r1 = r1.t(r5)
            if (r1 == 0) goto L_0x006d
            r20 = 1
            goto L_0x006f
        L_0x006d:
            r20 = 0
        L_0x006f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r7) goto L_0x007f
            n2.c4$b r1 = r0.f20441a
            long r14 = r1.i(r5)
        L_0x007c:
            r16 = r14
            goto L_0x0088
        L_0x007f:
            if (r9 == 0) goto L_0x0086
            n2.c4$b r1 = r0.f20441a
            long r14 = r1.f20219d
            goto L_0x007c
        L_0x0086:
            r16 = r12
        L_0x0088:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0096
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r18 = r16
            goto L_0x009c
        L_0x0096:
            n2.c4$b r1 = r0.f20441a
            long r14 = r1.f20219d
            r18 = r14
        L_0x009c:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00b3
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x00b3
            if (r23 != 0) goto L_0x00aa
            if (r9 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            r3 = 0
            long r5 = (long) r6
            long r5 = r18 - r5
            long r3 = java.lang.Math.max(r3, r5)
        L_0x00b3:
            r12 = r3
            n2.g2 r1 = new n2.g2
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.i2.m(n2.c4, java.lang.Object, long, long, long):n2.g2");
    }

    private long n(c4 c4Var, Object obj, int i10) {
        c4Var.l(obj, this.f20441a);
        long i11 = this.f20441a.i(i10);
        if (i11 == Long.MIN_VALUE) {
            return this.f20441a.f20219d;
        }
        return i11 + this.f20441a.l(i10);
    }

    private boolean s(x.b bVar) {
        return !bVar.b() && bVar.f21681e == -1;
    }

    private boolean t(c4 c4Var, x.b bVar, boolean z10) {
        int f10 = c4Var.f(bVar.f21677a);
        if (!c4Var.r(c4Var.j(f10, this.f20441a).f20218c, this.f20442b).f20243j) {
            return c4Var.v(f10, this.f20441a, this.f20442b, this.f20446f, this.f20447g) && z10;
        }
    }

    private boolean u(c4 c4Var, x.b bVar) {
        if (!s(bVar)) {
            return false;
        }
        int i10 = c4Var.l(bVar.f21677a, this.f20441a).f20218c;
        if (c4Var.r(i10, this.f20442b).f20250q == c4Var.f(bVar.f21677a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(u.a aVar, x.b bVar) {
        this.f20443c.F(aVar.k(), bVar);
    }

    private void x() {
        u.a p10 = u.p();
        for (f2 f2Var = this.f20448h; f2Var != null; f2Var = f2Var.j()) {
            p10.a(f2Var.f20370f.f20388a);
        }
        f2 f2Var2 = this.f20449i;
        this.f20444d.b(new h2(this, p10, f2Var2 == null ? null : f2Var2.f20370f.f20388a));
    }

    public x.b B(c4 c4Var, Object obj, long j10) {
        long C = C(c4Var, obj);
        c4Var.l(obj, this.f20441a);
        c4Var.r(this.f20441a.f20218c, this.f20442b);
        boolean z10 = false;
        for (int f10 = c4Var.f(obj); f10 >= this.f20442b.f20249p; f10--) {
            boolean z11 = true;
            c4Var.k(f10, this.f20441a, true);
            if (this.f20441a.f() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            c4.b bVar = this.f20441a;
            if (bVar.h(bVar.f20219d) != -1) {
                obj = k4.a.e(this.f20441a.f20217b);
            }
            if (z10 && (!z11 || this.f20441a.f20219d != 0)) {
                break;
            }
        }
        return A(c4Var, obj, j10, C, this.f20442b, this.f20441a);
    }

    public boolean D() {
        f2 f2Var = this.f20450j;
        return f2Var == null || (!f2Var.f20370f.f20396i && f2Var.q() && this.f20450j.f20370f.f20392e != -9223372036854775807L && this.f20451k < 100);
    }

    public boolean F(c4 c4Var, long j10, long j11) {
        g2 g2Var;
        long j12;
        f2 f2Var = this.f20448h;
        f2 f2Var2 = null;
        while (f2Var != null) {
            g2 g2Var2 = f2Var.f20370f;
            if (f2Var2 == null) {
                g2Var = r(c4Var, g2Var2);
            } else {
                g2 i10 = i(c4Var, f2Var2, j10);
                if (i10 == null) {
                    return !z(f2Var2);
                }
                if (!e(g2Var2, i10)) {
                    return !z(f2Var2);
                }
                g2Var = i10;
            }
            f2Var.f20370f = g2Var.a(g2Var2.f20390c);
            if (!d(g2Var2.f20392e, g2Var.f20392e)) {
                f2Var.A();
                long j13 = g2Var.f20392e;
                if (j13 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = f2Var.z(j13);
                }
                boolean z10 = f2Var == this.f20449i && !f2Var.f20370f.f20393f && (j11 == Long.MIN_VALUE || j11 >= j12);
                if (z(f2Var) || z10) {
                    return false;
                }
                return true;
            }
            f2Var2 = f2Var;
            f2Var = f2Var.j();
        }
        return true;
    }

    public boolean G(c4 c4Var, int i10) {
        this.f20446f = i10;
        return E(c4Var);
    }

    public boolean H(c4 c4Var, boolean z10) {
        this.f20447g = z10;
        return E(c4Var);
    }

    public f2 b() {
        f2 f2Var = this.f20448h;
        if (f2Var == null) {
            return null;
        }
        if (f2Var == this.f20449i) {
            this.f20449i = f2Var.j();
        }
        this.f20448h.t();
        int i10 = this.f20451k - 1;
        this.f20451k = i10;
        if (i10 == 0) {
            this.f20450j = null;
            f2 f2Var2 = this.f20448h;
            this.f20452l = f2Var2.f20366b;
            this.f20453m = f2Var2.f20370f.f20388a.f21680d;
        }
        this.f20448h = this.f20448h.j();
        x();
        return this.f20448h;
    }

    public f2 c() {
        f2 f2Var = this.f20449i;
        k4.a.f((f2Var == null || f2Var.j() == null) ? false : true);
        this.f20449i = this.f20449i.j();
        x();
        return this.f20449i;
    }

    public void f() {
        if (this.f20451k != 0) {
            f2 f2Var = (f2) k4.a.h(this.f20448h);
            this.f20452l = f2Var.f20366b;
            this.f20453m = f2Var.f20370f.f20388a.f21680d;
            while (f2Var != null) {
                f2Var.t();
                f2Var = f2Var.j();
            }
            this.f20448h = null;
            this.f20450j = null;
            this.f20449i = null;
            this.f20451k = 0;
            x();
        }
    }

    public f2 g(r3[] r3VarArr, b0 b0Var, b bVar, x2 x2Var, g2 g2Var, c0 c0Var) {
        long j10;
        f2 f2Var = this.f20450j;
        if (f2Var == null) {
            j10 = 1000000000000L;
            g2 g2Var2 = g2Var;
        } else {
            j10 = (f2Var.l() + this.f20450j.f20370f.f20392e) - g2Var.f20389b;
        }
        f2 f2Var2 = new f2(r3VarArr, j10, b0Var, bVar, x2Var, g2Var, c0Var);
        f2 f2Var3 = this.f20450j;
        if (f2Var3 != null) {
            f2Var3.w(f2Var2);
        } else {
            this.f20448h = f2Var2;
            this.f20449i = f2Var2;
        }
        this.f20452l = null;
        this.f20450j = f2Var2;
        this.f20451k++;
        x();
        return f2Var2;
    }

    public f2 j() {
        return this.f20450j;
    }

    public g2 o(long j10, d3 d3Var) {
        f2 f2Var = this.f20450j;
        if (f2Var == null) {
            return h(d3Var);
        }
        return i(d3Var.f20264a, f2Var, j10);
    }

    public f2 p() {
        return this.f20448h;
    }

    public f2 q() {
        return this.f20449i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r1 = r3.f21681e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n2.g2 r(n2.c4 r19, n2.g2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            p3.x$b r3 = r2.f20388a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            p3.x$b r4 = r2.f20388a
            java.lang.Object r4 = r4.f21677a
            n2.c4$b r5 = r0.f20441a
            r1.l(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f21681e
            if (r1 != r4) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            n2.c4$b r7 = r0.f20441a
            long r7 = r7.i(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r5
        L_0x0036:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x0048
            n2.c4$b r1 = r0.f20441a
            int r5 = r3.f21678b
            int r6 = r3.f21679c
            long r5 = r1.e(r5, r6)
        L_0x0046:
            r9 = r5
            goto L_0x005c
        L_0x0048:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005c
        L_0x0055:
            n2.c4$b r1 = r0.f20441a
            long r5 = r1.m()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x006c
            n2.c4$b r1 = r0.f20441a
            int r4 = r3.f21678b
            boolean r1 = r1.t(r4)
            r11 = r1
            goto L_0x007d
        L_0x006c:
            int r1 = r3.f21681e
            if (r1 == r4) goto L_0x007b
            n2.c4$b r4 = r0.f20441a
            boolean r1 = r4.t(r1)
            if (r1 == 0) goto L_0x007b
            r1 = 1
            r11 = 1
            goto L_0x007d
        L_0x007b:
            r1 = 0
            r11 = 0
        L_0x007d:
            n2.g2 r15 = new n2.g2
            long r4 = r2.f20389b
            long r1 = r2.f20390c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.i2.r(n2.c4, n2.g2):n2.g2");
    }

    public boolean v(p3.u uVar) {
        f2 f2Var = this.f20450j;
        return f2Var != null && f2Var.f20365a == uVar;
    }

    public void y(long j10) {
        f2 f2Var = this.f20450j;
        if (f2Var != null) {
            f2Var.s(j10);
        }
    }

    public boolean z(f2 f2Var) {
        boolean z10 = false;
        k4.a.f(f2Var != null);
        if (f2Var.equals(this.f20450j)) {
            return false;
        }
        this.f20450j = f2Var;
        while (f2Var.j() != null) {
            f2Var = f2Var.j();
            if (f2Var == this.f20449i) {
                this.f20449i = this.f20448h;
                z10 = true;
            }
            f2Var.t();
            this.f20451k--;
        }
        this.f20450j.w((f2) null);
        x();
        return z10;
    }
}
