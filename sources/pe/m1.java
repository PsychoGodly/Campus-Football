package pe;

import td.h;

/* compiled from: EventLoop.common.kt */
public abstract class m1 extends k0 {

    /* renamed from: b  reason: collision with root package name */
    private long f37361b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37362c;

    /* renamed from: d  reason: collision with root package name */
    private h<d1<?>> f37363d;

    public static /* synthetic */ void c1(m1 m1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            m1Var.b1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long d1(boolean z10) {
        return z10 ? 4294967296L : 1;
    }

    public static /* synthetic */ void h1(m1 m1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            m1Var.g1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void b1(boolean z10) {
        long d12 = this.f37361b - d1(z10);
        this.f37361b = d12;
        if (d12 <= 0) {
            if (t0.a()) {
                if (!(this.f37361b == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f37362c) {
                shutdown();
            }
        }
    }

    public final void e1(d1<?> d1Var) {
        h<d1<?>> hVar = this.f37363d;
        if (hVar == null) {
            hVar = new h<>();
            this.f37363d = hVar;
        }
        hVar.addLast(d1Var);
    }

    /* access modifiers changed from: protected */
    public long f1() {
        h<d1<?>> hVar = this.f37363d;
        if (hVar != null && !hVar.isEmpty()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    public final void g1(boolean z10) {
        this.f37361b += d1(z10);
        if (!z10) {
            this.f37362c = true;
        }
    }

    public final boolean i1() {
        return this.f37361b >= d1(true);
    }

    public final boolean j1() {
        h<d1<?>> hVar = this.f37363d;
        if (hVar != null) {
            return hVar.isEmpty();
        }
        return true;
    }

    public long k1() {
        return !l1() ? Long.MAX_VALUE : 0;
    }

    public final boolean l1() {
        d1 q10;
        h<d1<?>> hVar = this.f37363d;
        if (hVar == null || (q10 = hVar.q()) == null) {
            return false;
        }
        q10.run();
        return true;
    }

    public boolean m1() {
        return false;
    }

    public void shutdown() {
    }
}
