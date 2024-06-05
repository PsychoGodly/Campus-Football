package re;

import pe.m0;
import re.u;
import sd.w;
import xd.g;

/* compiled from: Produce.kt */
final class q<E> extends e<E> implements r<E> {
    public q(g gVar, d<E> dVar) {
        super(gVar, dVar, true, true);
    }

    /* access modifiers changed from: protected */
    public void R0(Throwable th, boolean z10) {
        if (!U0().e(th) && !z10) {
            m0.a(getContext(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public void S0(w wVar) {
        u.a.a(U0(), (Throwable) null, 1, (Object) null);
    }

    public boolean isActive() {
        return super.isActive();
    }
}
