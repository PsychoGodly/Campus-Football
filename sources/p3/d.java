package p3;

import i4.s;
import java.io.IOException;
import k4.n0;
import k4.v;
import n2.r1;
import n2.s1;
import n2.u3;
import p3.e;
import p3.u;
import q2.g;

/* compiled from: ClippingMediaPeriod */
public final class d implements u, u.a {

    /* renamed from: a  reason: collision with root package name */
    public final u f21410a;

    /* renamed from: b  reason: collision with root package name */
    private u.a f21411b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f21412c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f21413d;

    /* renamed from: f  reason: collision with root package name */
    long f21414f;

    /* renamed from: g  reason: collision with root package name */
    long f21415g;

    /* renamed from: h  reason: collision with root package name */
    private e.b f21416h;

    /* compiled from: ClippingMediaPeriod */
    private final class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        public final q0 f21417a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21418b;

        public a(q0 q0Var) {
            this.f21417a = q0Var;
        }

        public void a() throws IOException {
            this.f21417a.a();
        }

        public void b() {
            this.f21418b = false;
        }

        public int e(long j10) {
            if (d.this.k()) {
                return -3;
            }
            return this.f21417a.e(j10);
        }

        public boolean isReady() {
            return !d.this.k() && this.f21417a.isReady();
        }

        public int j(s1 s1Var, g gVar, int i10) {
            if (d.this.k()) {
                return -3;
            }
            if (this.f21418b) {
                gVar.p(4);
                return -4;
            }
            int j10 = this.f21417a.j(s1Var, gVar, i10);
            if (j10 == -5) {
                r1 r1Var = (r1) k4.a.e(s1Var.f20721b);
                int i11 = r1Var.C;
                if (!(i11 == 0 && r1Var.D == 0)) {
                    d dVar = d.this;
                    int i12 = 0;
                    if (dVar.f21414f != 0) {
                        i11 = 0;
                    }
                    if (dVar.f21415g == Long.MIN_VALUE) {
                        i12 = r1Var.D;
                    }
                    s1Var.f20721b = r1Var.b().P(i11).Q(i12).G();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j11 = dVar2.f21415g;
            if (j11 == Long.MIN_VALUE || ((j10 != -4 || gVar.f21757f < j11) && (j10 != -3 || dVar2.f() != Long.MIN_VALUE || gVar.f21756d))) {
                return j10;
            }
            gVar.g();
            gVar.p(4);
            this.f21418b = true;
            return -4;
        }
    }

    public d(u uVar, boolean z10, long j10, long j11) {
        this.f21410a = uVar;
        this.f21413d = z10 ? j10 : -9223372036854775807L;
        this.f21414f = j10;
        this.f21415g = j11;
    }

    private u3 a(long j10, u3 u3Var) {
        long r10 = n0.r(u3Var.f20734a, 0, j10 - this.f21414f);
        long j11 = u3Var.f20735b;
        long j12 = this.f21415g;
        long r11 = n0.r(j11, 0, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        if (r10 == u3Var.f20734a && r11 == u3Var.f20735b) {
            return u3Var;
        }
        return new u3(r10, r11);
    }

    private static boolean q(long j10, s[] sVarArr) {
        if (j10 != 0) {
            for (s sVar : sVarArr) {
                if (sVar != null) {
                    r1 o10 = sVar.o();
                    if (!v.a(o10.f20654m, o10.f20651j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public long b() {
        long b10 = this.f21410a.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.f21415g;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean c(long j10) {
        return this.f21410a.c(j10);
    }

    public long d(long j10, u3 u3Var) {
        long j11 = this.f21414f;
        if (j10 == j11) {
            return j11;
        }
        return this.f21410a.d(j10, a(j10, u3Var));
    }

    public void e(u uVar) {
        if (this.f21416h == null) {
            ((u.a) k4.a.e(this.f21411b)).e(this);
        }
    }

    public long f() {
        long f10 = this.f21410a.f();
        if (f10 != Long.MIN_VALUE) {
            long j10 = this.f21415g;
            if (j10 == Long.MIN_VALUE || f10 < j10) {
                return f10;
            }
        }
        return Long.MIN_VALUE;
    }

    public void g(long j10) {
        this.f21410a.g(j10);
    }

    public void h(u.a aVar, long j10) {
        this.f21411b = aVar;
        this.f21410a.h(this, j10);
    }

    public boolean isLoading() {
        return this.f21410a.isLoading();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f21413d != -9223372036854775807L;
    }

    /* renamed from: l */
    public void j(u uVar) {
        ((u.a) k4.a.e(this.f21411b)).j(this);
    }

    public void m() throws IOException {
        e.b bVar = this.f21416h;
        if (bVar == null) {
            this.f21410a.m();
            return;
        }
        throw bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long n(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f21413d = r0
            p3.d$a[] r0 = r6.f21412c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            p3.u r0 = r6.f21410a
            long r0 = r0.n(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f21414f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f21415g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            k4.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.n(long):long");
    }

    public void o(e.b bVar) {
        this.f21416h = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long p(i4.s[] r13, boolean[] r14, p3.q0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            p3.d$a[] r2 = new p3.d.a[r2]
            r0.f21412c = r2
            int r2 = r1.length
            p3.q0[] r9 = new p3.q0[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            p3.d$a[] r3 = r0.f21412c
            r4 = r1[r2]
            p3.d$a r4 = (p3.d.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            p3.q0 r11 = r3.f21417a
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            p3.u r2 = r0.f21410a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.p(r3, r4, r5, r6, r7)
            boolean r4 = r12.k()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f21414f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = q(r4, r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f21413d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f21414f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.f21415g
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            k4.a.f(r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0097
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            p3.d$a[] r4 = r0.f21412c
            r4[r10] = r11
            goto L_0x008e
        L_0x0077:
            p3.d$a[] r4 = r0.f21412c
            r5 = r4[r10]
            if (r5 == 0) goto L_0x0085
            r5 = r4[r10]
            p3.q0 r5 = r5.f21417a
            r6 = r9[r10]
            if (r5 == r6) goto L_0x008e
        L_0x0085:
            p3.d$a r5 = new p3.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x008e:
            p3.d$a[] r4 = r0.f21412c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.p(i4.s[], boolean[], p3.q0[], boolean[], long):long");
    }

    public long r() {
        if (k()) {
            long j10 = this.f21413d;
            this.f21413d = -9223372036854775807L;
            long r10 = r();
            return r10 != -9223372036854775807L ? r10 : j10;
        }
        long r11 = this.f21410a.r();
        if (r11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        k4.a.f(r11 >= this.f21414f);
        long j11 = this.f21415g;
        if (j11 != Long.MIN_VALUE && r11 > j11) {
            z10 = false;
        }
        k4.a.f(z10);
        return r11;
    }

    public z0 s() {
        return this.f21410a.s();
    }

    public void t(long j10, boolean z10) {
        this.f21410a.t(j10, z10);
    }

    public void u(long j10, long j11) {
        this.f21414f = j10;
        this.f21415g = j11;
    }
}
