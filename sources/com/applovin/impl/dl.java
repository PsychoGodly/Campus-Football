package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ro;

abstract class dl {

    /* renamed from: a  reason: collision with root package name */
    private final eg f7271a = new eg();

    /* renamed from: b  reason: collision with root package name */
    private ro f7272b;

    /* renamed from: c  reason: collision with root package name */
    private k8 f7273c;

    /* renamed from: d  reason: collision with root package name */
    private gg f7274d;

    /* renamed from: e  reason: collision with root package name */
    private long f7275e;

    /* renamed from: f  reason: collision with root package name */
    private long f7276f;

    /* renamed from: g  reason: collision with root package name */
    private long f7277g;

    /* renamed from: h  reason: collision with root package name */
    private int f7278h;

    /* renamed from: i  reason: collision with root package name */
    private int f7279i;

    /* renamed from: j  reason: collision with root package name */
    private b f7280j = new b();

    /* renamed from: k  reason: collision with root package name */
    private long f7281k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7282l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7283m;

    static class b {

        /* renamed from: a  reason: collision with root package name */
        d9 f7284a;

        /* renamed from: b  reason: collision with root package name */
        gg f7285b;

        b() {
        }
    }

    private static final class c implements gg {
        private c() {
        }

        public long a(j8 j8Var) {
            return -1;
        }

        public ej a() {
            return new ej.b(-9223372036854775807L);
        }

        public void a(long j10) {
        }
    }

    private void a() {
        a1.b((Object) this.f7272b);
        yp.a((Object) this.f7273c);
    }

    /* access modifiers changed from: protected */
    public abstract long a(yg ygVar);

    /* access modifiers changed from: protected */
    public abstract boolean a(yg ygVar, long j10, b bVar);

    /* access modifiers changed from: protected */
    public long b(long j10) {
        return (((long) this.f7279i) * j10) / 1000000;
    }

    /* access modifiers changed from: protected */
    public void c(long j10) {
        this.f7277g = j10;
    }

    private int b(j8 j8Var) {
        if (!a(j8Var)) {
            return -1;
        }
        d9 d9Var = this.f7280j.f7284a;
        this.f7279i = d9Var.A;
        if (!this.f7283m) {
            this.f7272b.a(d9Var);
            this.f7283m = true;
        }
        gg ggVar = this.f7280j.f7285b;
        if (ggVar != null) {
            this.f7274d = ggVar;
        } else if (j8Var.a() == -1) {
            this.f7274d = new c();
        } else {
            fg a10 = this.f7271a.a();
            this.f7274d = new h6(this, this.f7276f, j8Var.a(), (long) (a10.f7783h + a10.f7784i), a10.f7778c, (a10.f7777b & 4) != 0);
        }
        this.f7278h = 2;
        this.f7271a.d();
        return 0;
    }

    /* access modifiers changed from: protected */
    public long a(long j10) {
        return (j10 * 1000000) / ((long) this.f7279i);
    }

    /* access modifiers changed from: package-private */
    public void a(k8 k8Var, ro roVar) {
        this.f7273c = k8Var;
        this.f7272b = roVar;
        a(true);
    }

    /* access modifiers changed from: package-private */
    public final int a(j8 j8Var, qh qhVar) {
        a();
        int i10 = this.f7278h;
        if (i10 == 0) {
            return b(j8Var);
        }
        if (i10 == 1) {
            j8Var.a((int) this.f7276f);
            this.f7278h = 2;
            return 0;
        } else if (i10 == 2) {
            yp.a((Object) this.f7274d);
            return b(j8Var, qhVar);
        } else if (i10 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    private boolean a(j8 j8Var) {
        while (this.f7271a.a(j8Var)) {
            this.f7281k = j8Var.f() - this.f7276f;
            if (!a(this.f7271a.b(), this.f7276f, this.f7280j)) {
                return true;
            }
            this.f7276f = j8Var.f();
        }
        this.f7278h = 3;
        return false;
    }

    private int b(j8 j8Var, qh qhVar) {
        j8 j8Var2 = j8Var;
        long a10 = this.f7274d.a(j8Var2);
        if (a10 >= 0) {
            qhVar.f10991a = a10;
            return 1;
        }
        if (a10 < -1) {
            c(-(a10 + 2));
        }
        if (!this.f7282l) {
            this.f7273c.a((ej) a1.b((Object) this.f7274d.a()));
            this.f7282l = true;
        }
        if (this.f7281k > 0 || this.f7271a.a(j8Var2)) {
            this.f7281k = 0;
            yg b10 = this.f7271a.b();
            long a11 = a(b10);
            if (a11 >= 0) {
                long j10 = this.f7277g;
                if (j10 + a11 >= this.f7275e) {
                    long a12 = a(j10);
                    this.f7272b.a(b10, b10.e());
                    this.f7272b.a(a12, 1, b10.e(), 0, (ro.a) null);
                    this.f7275e = -1;
                }
            }
            this.f7277g += a11;
            return 0;
        }
        this.f7278h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10) {
        if (z10) {
            this.f7280j = new b();
            this.f7276f = 0;
            this.f7278h = 0;
        } else {
            this.f7278h = 1;
        }
        this.f7275e = -1;
        this.f7277g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j10, long j11) {
        this.f7271a.c();
        if (j10 == 0) {
            a(!this.f7282l);
        } else if (this.f7278h != 0) {
            this.f7275e = b(j11);
            ((gg) yp.a((Object) this.f7274d)).a(this.f7275e);
            this.f7278h = 2;
        }
    }
}
