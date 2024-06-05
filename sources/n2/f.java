package n2;

import java.io.IOException;
import k4.a;
import k4.t;
import o2.u1;
import p3.q0;
import q2.g;

/* compiled from: BaseRenderer */
public abstract class f implements p3, r3 {

    /* renamed from: a  reason: collision with root package name */
    private final int f20352a;

    /* renamed from: b  reason: collision with root package name */
    private final s1 f20353b = new s1();

    /* renamed from: c  reason: collision with root package name */
    private s3 f20354c;

    /* renamed from: d  reason: collision with root package name */
    private int f20355d;

    /* renamed from: f  reason: collision with root package name */
    private u1 f20356f;

    /* renamed from: g  reason: collision with root package name */
    private int f20357g;

    /* renamed from: h  reason: collision with root package name */
    private q0 f20358h;

    /* renamed from: i  reason: collision with root package name */
    private r1[] f20359i;

    /* renamed from: j  reason: collision with root package name */
    private long f20360j;

    /* renamed from: k  reason: collision with root package name */
    private long f20361k;

    /* renamed from: l  reason: collision with root package name */
    private long f20362l = Long.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20363m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f20364n;

    public f(int i10) {
        this.f20352a = i10;
    }

    private void N(long j10, boolean z10) throws q {
        this.f20363m = false;
        this.f20361k = j10;
        this.f20362l = j10;
        H(j10, z10);
    }

    /* access modifiers changed from: protected */
    public final s1 A() {
        this.f20353b.a();
        return this.f20353b;
    }

    /* access modifiers changed from: protected */
    public final int B() {
        return this.f20355d;
    }

    /* access modifiers changed from: protected */
    public final u1 C() {
        return (u1) a.e(this.f20356f);
    }

    /* access modifiers changed from: protected */
    public final r1[] D() {
        return (r1[]) a.e(this.f20359i);
    }

    /* access modifiers changed from: protected */
    public final boolean E() {
        return g() ? this.f20363m : ((q0) a.e(this.f20358h)).isReady();
    }

    /* access modifiers changed from: protected */
    public abstract void F();

    /* access modifiers changed from: protected */
    public void G(boolean z10, boolean z11) throws q {
    }

    /* access modifiers changed from: protected */
    public abstract void H(long j10, boolean z10) throws q;

    /* access modifiers changed from: protected */
    public void I() {
    }

    /* access modifiers changed from: protected */
    public void J() throws q {
    }

    /* access modifiers changed from: protected */
    public void K() {
    }

    /* access modifiers changed from: protected */
    public abstract void L(r1[] r1VarArr, long j10, long j11) throws q;

    /* access modifiers changed from: protected */
    public final int M(s1 s1Var, g gVar, int i10) {
        int j10 = ((q0) a.e(this.f20358h)).j(s1Var, gVar, i10);
        if (j10 == -4) {
            if (gVar.l()) {
                this.f20362l = Long.MIN_VALUE;
                if (this.f20363m) {
                    return -4;
                }
                return -3;
            }
            long j11 = gVar.f21757f + this.f20360j;
            gVar.f21757f = j11;
            this.f20362l = Math.max(this.f20362l, j11);
        } else if (j10 == -5) {
            r1 r1Var = (r1) a.e(s1Var.f20721b);
            if (r1Var.f20658q != Long.MAX_VALUE) {
                s1Var.f20721b = r1Var.b().k0(r1Var.f20658q + this.f20360j).G();
            }
        }
        return j10;
    }

    /* access modifiers changed from: protected */
    public int O(long j10) {
        return ((q0) a.e(this.f20358h)).e(j10 - this.f20360j);
    }

    public final void d() {
        boolean z10 = true;
        if (this.f20357g != 1) {
            z10 = false;
        }
        a.f(z10);
        this.f20353b.a();
        this.f20357g = 0;
        this.f20358h = null;
        this.f20359i = null;
        this.f20363m = false;
        F();
    }

    public final int f() {
        return this.f20352a;
    }

    public final boolean g() {
        return this.f20362l == Long.MIN_VALUE;
    }

    public final int getState() {
        return this.f20357g;
    }

    public final void h(r1[] r1VarArr, q0 q0Var, long j10, long j11) throws q {
        a.f(!this.f20363m);
        this.f20358h = q0Var;
        if (this.f20362l == Long.MIN_VALUE) {
            this.f20362l = j10;
        }
        this.f20359i = r1VarArr;
        this.f20360j = j11;
        L(r1VarArr, j10, j11);
    }

    public final void i(int i10, u1 u1Var) {
        this.f20355d = i10;
        this.f20356f = u1Var;
    }

    public final void j() {
        this.f20363m = true;
    }

    public final r3 k() {
        return this;
    }

    public /* synthetic */ void m(float f10, float f11) {
        o3.a(this, f10, f11);
    }

    public int n() throws q {
        return 0;
    }

    public void p(int i10, Object obj) throws q {
    }

    public final q0 q() {
        return this.f20358h;
    }

    public final void r(s3 s3Var, r1[] r1VarArr, q0 q0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws q {
        boolean z12 = z10;
        a.f(this.f20357g == 0);
        this.f20354c = s3Var;
        this.f20357g = 1;
        G(z10, z11);
        h(r1VarArr, q0Var, j11, j12);
        long j13 = j10;
        N(j10, z10);
    }

    public final void reset() {
        a.f(this.f20357g == 0);
        this.f20353b.a();
        I();
    }

    public final void s() throws IOException {
        ((q0) a.e(this.f20358h)).a();
    }

    public final void start() throws q {
        boolean z10 = true;
        if (this.f20357g != 1) {
            z10 = false;
        }
        a.f(z10);
        this.f20357g = 2;
        J();
    }

    public final void stop() {
        a.f(this.f20357g == 2);
        this.f20357g = 1;
        K();
    }

    public final long t() {
        return this.f20362l;
    }

    public final void u(long j10) throws q {
        N(j10, false);
    }

    public final boolean v() {
        return this.f20363m;
    }

    public t w() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final q x(Throwable th, r1 r1Var, int i10) {
        return y(th, r1Var, false, i10);
    }

    /* access modifiers changed from: protected */
    public final q y(Throwable th, r1 r1Var, boolean z10, int i10) {
        int i11;
        if (r1Var != null && !this.f20364n) {
            this.f20364n = true;
            try {
                int f10 = q3.f(a(r1Var));
                this.f20364n = false;
                i11 = f10;
            } catch (q unused) {
                this.f20364n = false;
            } catch (Throwable th2) {
                this.f20364n = false;
                throw th2;
            }
            return q.f(th, getName(), B(), r1Var, i11, z10, i10);
        }
        i11 = 4;
        return q.f(th, getName(), B(), r1Var, i11, z10, i10);
    }

    /* access modifiers changed from: protected */
    public final s3 z() {
        return (s3) a.e(this.f20354c);
    }
}
