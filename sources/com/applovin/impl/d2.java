package com.applovin.impl;

public abstract class d2 implements li, mi {

    /* renamed from: a  reason: collision with root package name */
    private final int f7091a;

    /* renamed from: b  reason: collision with root package name */
    private final e9 f7092b = new e9();

    /* renamed from: c  reason: collision with root package name */
    private ni f7093c;

    /* renamed from: d  reason: collision with root package name */
    private int f7094d;

    /* renamed from: f  reason: collision with root package name */
    private int f7095f;

    /* renamed from: g  reason: collision with root package name */
    private yi f7096g;

    /* renamed from: h  reason: collision with root package name */
    private d9[] f7097h;

    /* renamed from: i  reason: collision with root package name */
    private long f7098i;

    /* renamed from: j  reason: collision with root package name */
    private long f7099j;

    /* renamed from: k  reason: collision with root package name */
    private long f7100k = Long.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7101l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7102m;

    public d2(int i10) {
        this.f7091a = i10;
    }

    /* access modifiers changed from: protected */
    public final y7 a(Throwable th, d9 d9Var, int i10) {
        return a(th, d9Var, false, i10);
    }

    public /* synthetic */ void a(float f10, float f11) {
        az.a(this, f10, f11);
    }

    public void a(int i10, Object obj) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j10, boolean z10);

    /* access modifiers changed from: protected */
    public void a(boolean z10, boolean z11) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(d9[] d9VarArr, long j10, long j11);

    public final int b() {
        return this.f7095f;
    }

    public final int e() {
        return this.f7091a;
    }

    public final void f() {
        boolean z10 = true;
        if (this.f7095f != 1) {
            z10 = false;
        }
        a1.b(z10);
        this.f7092b.a();
        this.f7095f = 0;
        this.f7096g = null;
        this.f7097h = null;
        this.f7101l = false;
        v();
    }

    public final void g() {
        this.f7101l = true;
    }

    public final void h() {
        ((yi) a1.a((Object) this.f7096g)).a();
    }

    public final long i() {
        return this.f7100k;
    }

    public final boolean j() {
        return this.f7100k == Long.MIN_VALUE;
    }

    public final boolean k() {
        return this.f7101l;
    }

    public bd l() {
        return null;
    }

    public int m() {
        return 0;
    }

    public final mi n() {
        return this;
    }

    public final yi o() {
        return this.f7096g;
    }

    /* access modifiers changed from: protected */
    public final ni q() {
        return (ni) a1.a((Object) this.f7093c);
    }

    /* access modifiers changed from: protected */
    public final e9 r() {
        this.f7092b.a();
        return this.f7092b;
    }

    public final void reset() {
        a1.b(this.f7095f == 0);
        this.f7092b.a();
        w();
    }

    /* access modifiers changed from: protected */
    public final int s() {
        return this.f7094d;
    }

    public final void start() {
        boolean z10 = true;
        if (this.f7095f != 1) {
            z10 = false;
        }
        a1.b(z10);
        this.f7095f = 2;
        x();
    }

    public final void stop() {
        a1.b(this.f7095f == 2);
        this.f7095f = 1;
        y();
    }

    /* access modifiers changed from: protected */
    public final d9[] t() {
        return (d9[]) a1.a((Object) this.f7097h);
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        return j() ? this.f7101l : ((yi) a1.a((Object) this.f7096g)).d();
    }

    /* access modifiers changed from: protected */
    public abstract void v();

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: protected */
    public void x() {
    }

    /* access modifiers changed from: protected */
    public void y() {
    }

    /* access modifiers changed from: protected */
    public final y7 a(Throwable th, d9 d9Var, boolean z10, int i10) {
        int i11;
        if (d9Var != null && !this.f7102m) {
            this.f7102m = true;
            try {
                int d10 = hz.d(a(d9Var));
                this.f7102m = false;
                i11 = d10;
            } catch (y7 unused) {
                this.f7102m = false;
            } catch (Throwable th2) {
                this.f7102m = false;
                throw th2;
            }
            return y7.a(th, getName(), s(), d9Var, i11, z10, i10);
        }
        i11 = 4;
        return y7.a(th, getName(), s(), d9Var, i11, z10, i10);
    }

    public final void b(int i10) {
        this.f7094d = i10;
    }

    /* access modifiers changed from: protected */
    public int b(long j10) {
        return ((yi) a1.a((Object) this.f7096g)).a(j10 - this.f7098i);
    }

    public final void a(ni niVar, d9[] d9VarArr, yi yiVar, long j10, boolean z10, boolean z11, long j11, long j12) {
        long j13 = j10;
        boolean z12 = z10;
        a1.b(this.f7095f == 0);
        this.f7093c = niVar;
        this.f7095f = 1;
        this.f7099j = j13;
        a(z12, z11);
        a(d9VarArr, yiVar, j11, j12);
        a(j13, z12);
    }

    /* access modifiers changed from: protected */
    public final int a(e9 e9Var, n5 n5Var, int i10) {
        int a10 = ((yi) a1.a((Object) this.f7096g)).a(e9Var, n5Var, i10);
        if (a10 == -4) {
            if (n5Var.e()) {
                this.f7100k = Long.MIN_VALUE;
                if (this.f7101l) {
                    return -4;
                }
                return -3;
            }
            long j10 = n5Var.f9908f + this.f7098i;
            n5Var.f9908f = j10;
            this.f7100k = Math.max(this.f7100k, j10);
        } else if (a10 == -5) {
            d9 d9Var = (d9) a1.a((Object) e9Var.f7378b);
            if (d9Var.f7157q != Long.MAX_VALUE) {
                e9Var.f7378b = d9Var.a().a(d9Var.f7157q + this.f7098i).a();
            }
        }
        return a10;
    }

    public final void a(d9[] d9VarArr, yi yiVar, long j10, long j11) {
        a1.b(!this.f7101l);
        this.f7096g = yiVar;
        if (this.f7100k == Long.MIN_VALUE) {
            this.f7100k = j10;
        }
        this.f7097h = d9VarArr;
        this.f7098i = j11;
        a(d9VarArr, j10, j11);
    }

    public final void a(long j10) {
        this.f7101l = false;
        this.f7099j = j10;
        this.f7100k = j10;
        a(j10, false);
    }
}
