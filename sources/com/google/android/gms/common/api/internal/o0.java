package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import h5.b;
import u5.f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class o0 implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0 f15214a;

    /* synthetic */ o0(r0 r0Var, n0 n0Var) {
        this.f15214a = r0Var;
    }

    public final void onConnected(Bundle bundle) {
        d dVar = (d) q.k(this.f15214a.f15240r);
        ((f) q.k(this.f15214a.f15233k)).a(new m0(this.f15214a));
    }

    public final void onConnectionFailed(b bVar) {
        this.f15214a.f15224b.lock();
        try {
            if (this.f15214a.p(bVar)) {
                this.f15214a.h();
                this.f15214a.m();
            } else {
                this.f15214a.k(bVar);
            }
        } finally {
            this.f15214a.f15224b.unlock();
        }
    }

    public final void onConnectionSuspended(int i10) {
    }
}
