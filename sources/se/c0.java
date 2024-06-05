package se;

import pe.t0;
import sd.w;
import te.d;

/* compiled from: SharedFlow.kt */
public final class c0 extends d<a0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f38175a = -1;

    /* renamed from: b  reason: collision with root package name */
    public xd.d<? super w> f38176b;

    /* renamed from: c */
    public boolean a(a0<?> a0Var) {
        if (this.f38175a >= 0) {
            return false;
        }
        this.f38175a = a0Var.X();
        return true;
    }

    /* renamed from: d */
    public xd.d<w>[] b(a0<?> a0Var) {
        if (t0.a()) {
            if (!(this.f38175a >= 0)) {
                throw new AssertionError();
            }
        }
        long j10 = this.f38175a;
        this.f38175a = -1;
        this.f38176b = null;
        return a0Var.W(j10);
    }
}
