package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v5.d;
import v5.l;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class m0 extends d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<r0> f15202a;

    m0(r0 r0Var) {
        this.f15202a = new WeakReference<>(r0Var);
    }

    public final void Q0(l lVar) {
        r0 r0Var = (r0) this.f15202a.get();
        if (r0Var != null) {
            r0Var.f15223a.l(new l0(this, r0Var, r0Var, lVar));
        }
    }
}
