package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.q;
import h5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class b3 implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f15073a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15074b;

    /* renamed from: c  reason: collision with root package name */
    private c3 f15075c;

    public b3(a<?> aVar, boolean z10) {
        this.f15073a = aVar;
        this.f15074b = z10;
    }

    private final c3 b() {
        q.l(this.f15075c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f15075c;
    }

    public final void a(c3 c3Var) {
        this.f15075c = c3Var;
    }

    public final void onConnected(Bundle bundle) {
        b().onConnected(bundle);
    }

    public final void onConnectionFailed(b bVar) {
        b().M0(bVar, this.f15073a, this.f15074b);
    }

    public final void onConnectionSuspended(int i10) {
        b().onConnectionSuspended(i10);
    }
}
