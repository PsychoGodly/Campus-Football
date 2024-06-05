package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import h5.b;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class s0 implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final a1 f15255a;

    public s0(a1 a1Var) {
        this.f15255a = a1Var;
    }

    public final void a(Bundle bundle) {
    }

    public final void b() {
        this.f15255a.j();
    }

    public final void c(b bVar, a<?> aVar, boolean z10) {
    }

    public final void d(int i10) {
    }

    public final void e() {
        for (a.f disconnect : this.f15255a.f15054g.values()) {
            disconnect.disconnect();
        }
        this.f15255a.f15062o.f15308p = Collections.emptySet();
    }

    public final boolean f() {
        return true;
    }

    public final <A extends a.b, T extends d<? extends i, A>> T g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
