package com.google.android.gms.ads.internal.client;

import n4.n;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class b3 extends y {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d3 f14420c;

    b3(d3 d3Var) {
        this.f14420c = d3Var;
    }

    public final void onAdFailedToLoad(n nVar) {
        d3 d3Var = this.f14420c;
        d3Var.f14437d.c(d3Var.l());
        super.onAdFailedToLoad(nVar);
    }

    public final void onAdLoaded() {
        d3 d3Var = this.f14420c;
        d3Var.f14437d.c(d3Var.l());
        super.onAdLoaded();
    }
}
