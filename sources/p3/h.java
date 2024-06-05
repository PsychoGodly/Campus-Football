package p3;

/* compiled from: CompositeSequenceableLoader */
public class h implements r0 {

    /* renamed from: a  reason: collision with root package name */
    protected final r0[] f21452a;

    public h(r0[] r0VarArr) {
        this.f21452a = r0VarArr;
    }

    public final long b() {
        long j10 = Long.MAX_VALUE;
        for (r0 b10 : this.f21452a) {
            long b11 = b10.b();
            if (b11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public boolean c(long j10) {
        long j11 = j10;
        boolean z10 = false;
        while (true) {
            long b10 = b();
            if (b10 != Long.MIN_VALUE) {
                boolean z11 = false;
                for (r0 r0Var : this.f21452a) {
                    long b11 = r0Var.b();
                    boolean z12 = b11 != Long.MIN_VALUE && b11 <= j11;
                    if (b11 == b10 || z12) {
                        z11 |= r0Var.c(j11);
                    }
                }
                z10 |= z11;
                if (!z11) {
                    break;
                }
            } else {
                break;
            }
        }
        return z10;
    }

    public final long f() {
        long j10 = Long.MAX_VALUE;
        for (r0 f10 : this.f21452a) {
            long f11 = f10.f();
            if (f11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, f11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final void g(long j10) {
        for (r0 g10 : this.f21452a) {
            g10.g(j10);
        }
    }

    public boolean isLoading() {
        for (r0 isLoading : this.f21452a) {
            if (isLoading.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
