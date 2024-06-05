package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import h5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class r2 implements GoogleApiClient.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f15244a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleApiClient f15245b;

    /* renamed from: c  reason: collision with root package name */
    public final GoogleApiClient.c f15246c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s2 f15247d;

    public r2(s2 s2Var, int i10, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        this.f15247d = s2Var;
        this.f15244a = i10;
        this.f15245b = googleApiClient;
        this.f15246c = cVar;
    }

    public final void onConnectionFailed(b bVar) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(bVar)));
        this.f15247d.h(bVar, this.f15244a);
    }
}
