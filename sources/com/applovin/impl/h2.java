package com.applovin.impl;

import com.applovin.impl.ej;

public abstract class h2 {

    /* renamed from: a  reason: collision with root package name */
    protected final a f8184a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f8185b;

    /* renamed from: c  reason: collision with root package name */
    protected c f8186c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8187d;

    public static class a implements ej {

        /* renamed from: a  reason: collision with root package name */
        private final d f8188a;

        /* renamed from: b  reason: collision with root package name */
        private final long f8189b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f8190c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f8191d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f8192e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final long f8193f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final long f8194g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f8188a = dVar;
            this.f8189b = j10;
            this.f8190c = j11;
            this.f8191d = j12;
            this.f8192e = j13;
            this.f8193f = j14;
            this.f8194g = j15;
        }

        public boolean b() {
            return true;
        }

        public ej.a b(long j10) {
            return new ej.a(new gj(j10, c.a(this.f8188a.a(j10), this.f8190c, this.f8191d, this.f8192e, this.f8193f, this.f8194g)));
        }

        public long c(long j10) {
            return this.f8188a.a(j10);
        }

        public long d() {
            return this.f8189b;
        }
    }

    public static final class b implements d {
        public long a(long j10) {
            return j10;
        }
    }

    protected static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f8195a;

        /* renamed from: b  reason: collision with root package name */
        private final long f8196b;

        /* renamed from: c  reason: collision with root package name */
        private final long f8197c;

        /* renamed from: d  reason: collision with root package name */
        private long f8198d;

        /* renamed from: e  reason: collision with root package name */
        private long f8199e;

        /* renamed from: f  reason: collision with root package name */
        private long f8200f;

        /* renamed from: g  reason: collision with root package name */
        private long f8201g;

        /* renamed from: h  reason: collision with root package name */
        private long f8202h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f8195a = j10;
            this.f8196b = j11;
            this.f8198d = j12;
            this.f8199e = j13;
            this.f8200f = j14;
            this.f8201g = j15;
            this.f8197c = j16;
            this.f8202h = a(j11, j12, j13, j14, j15, j16);
        }

        private void f() {
            this.f8202h = a(this.f8196b, this.f8198d, this.f8199e, this.f8200f, this.f8201g, this.f8197c);
        }

        /* access modifiers changed from: private */
        public long c() {
            return this.f8202h;
        }

        /* access modifiers changed from: private */
        public long d() {
            return this.f8195a;
        }

        /* access modifiers changed from: private */
        public long e() {
            return this.f8196b;
        }

        protected static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return yp.b(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* access modifiers changed from: private */
        public long b() {
            return this.f8200f;
        }

        /* access modifiers changed from: private */
        public void b(long j10, long j11) {
            this.f8198d = j10;
            this.f8200f = j11;
            f();
        }

        /* access modifiers changed from: private */
        public long a() {
            return this.f8201g;
        }

        /* access modifiers changed from: private */
        public void a(long j10, long j11) {
            this.f8199e = j10;
            this.f8201g = j11;
            f();
        }
    }

    protected interface d {
        long a(long j10);
    }

    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f8203d = new e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f8204a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f8205b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f8206c;

        private e(int i10, long j10, long j11) {
            this.f8204a = i10;
            this.f8205b = j10;
            this.f8206c = j11;
        }

        public static e a(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e b(long j10, long j11) {
            return new e(-2, j10, j11);
        }

        public static e a(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }
    }

    protected interface f {
        e a(j8 j8Var, long j10);

        void a();
    }

    protected h2(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f8185b = fVar;
        this.f8187d = i10;
        this.f8184a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public final ej a() {
        return this.f8184a;
    }

    /* access modifiers changed from: protected */
    public void b(boolean z10, long j10) {
    }

    public final boolean b() {
        return this.f8186c != null;
    }

    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            c cVar = (c) a1.b((Object) this.f8186c);
            long b10 = cVar.b();
            long c10 = cVar.a();
            long d10 = cVar.c();
            if (c10 - b10 <= ((long) this.f8187d)) {
                a(false, b10);
                return a(j8Var, b10, qhVar);
            } else if (!a(j8Var, d10)) {
                return a(j8Var, d10, qhVar);
            } else {
                j8Var.b();
                e a10 = this.f8185b.a(j8Var, cVar.e());
                int a11 = a10.f8204a;
                if (a11 == -3) {
                    a(false, d10);
                    return a(j8Var, d10, qhVar);
                } else if (a11 == -2) {
                    cVar.b(a10.f8205b, a10.f8206c);
                } else if (a11 == -1) {
                    cVar.a(a10.f8205b, a10.f8206c);
                } else if (a11 == 0) {
                    a(j8Var, a10.f8206c);
                    a(true, a10.f8206c);
                    return a(j8Var, a10.f8206c, qhVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final void b(long j10) {
        c cVar = this.f8186c;
        if (cVar == null || cVar.d() != j10) {
            this.f8186c = a(j10);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z10, long j10) {
        this.f8186c = null;
        this.f8185b.a();
        b(z10, j10);
    }

    /* access modifiers changed from: protected */
    public final int a(j8 j8Var, long j10, qh qhVar) {
        if (j10 == j8Var.f()) {
            return 0;
        }
        qhVar.f10991a = j10;
        return 1;
    }

    /* access modifiers changed from: protected */
    public final boolean a(j8 j8Var, long j10) {
        long f10 = j10 - j8Var.f();
        if (f10 < 0 || f10 > 262144) {
            return false;
        }
        j8Var.a((int) f10);
        return true;
    }

    /* access modifiers changed from: protected */
    public c a(long j10) {
        long j11 = j10;
        return new c(j11, this.f8184a.c(j11), this.f8184a.f8190c, this.f8184a.f8191d, this.f8184a.f8192e, this.f8184a.f8193f, this.f8184a.f8194g);
    }
}
