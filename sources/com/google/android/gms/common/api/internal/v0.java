package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class v0 extends o1 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<w0> f15285a;

    v0(w0 w0Var) {
        this.f15285a = new WeakReference<>(w0Var);
    }

    public final void a() {
        w0 w0Var = (w0) this.f15285a.get();
        if (w0Var != null) {
            w0.o(w0Var);
        }
    }
}
