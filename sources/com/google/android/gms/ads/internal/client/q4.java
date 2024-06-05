package com.google.android.gms.ads.internal.client;

import n4.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class q4 extends j0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f14531a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14532b;

    public q4(e eVar, Object obj) {
        this.f14531a = eVar;
        this.f14532b = obj;
    }

    public final void zzb(c3 c3Var) {
        e eVar = this.f14531a;
        if (eVar != null) {
            eVar.onAdFailedToLoad(c3Var.w());
        }
    }

    public final void zzc() {
        Object obj;
        e eVar = this.f14531a;
        if (eVar != null && (obj = this.f14532b) != null) {
            eVar.onAdLoaded(obj);
        }
    }
}
