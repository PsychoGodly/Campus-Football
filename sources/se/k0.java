package se;

import pe.t0;
import re.a;
import te.s;
import ue.l0;
import xd.g;

/* compiled from: StateFlow.kt */
public final class k0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f38225a = new l0("NONE");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f38226b = new l0("PENDING");

    public static final <T> v<T> a(T t10) {
        if (t10 == null) {
            t10 = s.f38707a;
        }
        return new j0(t10);
    }

    public static final <T> e<T> d(i0<? extends T> i0Var, g gVar, int i10, a aVar) {
        boolean z10 = true;
        if (t0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        if (i10 < 0 || i10 >= 2) {
            z10 = false;
        }
        if ((z10 || i10 == -2) && aVar == a.DROP_OLDEST) {
            return i0Var;
        }
        return b0.e(i0Var, gVar, i10, aVar);
    }
}
