package z2;

import k4.n0;
import k4.s;
import s2.b0;
import s2.c0;

/* compiled from: IndexSeeker */
final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f24112a;

    /* renamed from: b  reason: collision with root package name */
    private final s f24113b;

    /* renamed from: c  reason: collision with root package name */
    private final s f24114c;

    /* renamed from: d  reason: collision with root package name */
    private long f24115d;

    public b(long j10, long j11, long j12) {
        this.f24115d = j10;
        this.f24112a = j12;
        s sVar = new s();
        this.f24113b = sVar;
        s sVar2 = new s();
        this.f24114c = sVar2;
        sVar.a(0);
        sVar2.a(j11);
    }

    public long a(long j10) {
        return this.f24113b.b(n0.g(this.f24114c, j10, true, true));
    }

    public boolean b(long j10) {
        s sVar = this.f24113b;
        return j10 - sVar.b(sVar.c() - 1) < 100000;
    }

    public void c(long j10, long j11) {
        if (!b(j10)) {
            this.f24113b.a(j10);
            this.f24114c.a(j11);
        }
    }

    public long d() {
        return this.f24112a;
    }

    /* access modifiers changed from: package-private */
    public void e(long j10) {
        this.f24115d = j10;
    }

    public boolean f() {
        return true;
    }

    public b0.a h(long j10) {
        int g10 = n0.g(this.f24113b, j10, true, true);
        c0 c0Var = new c0(this.f24113b.b(g10), this.f24114c.b(g10));
        if (c0Var.f22384a == j10 || g10 == this.f24113b.c() - 1) {
            return new b0.a(c0Var);
        }
        int i10 = g10 + 1;
        return new b0.a(c0Var, new c0(this.f24113b.b(i10), this.f24114c.b(i10)));
    }

    public long i() {
        return this.f24115d;
    }
}
