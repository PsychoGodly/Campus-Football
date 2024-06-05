package com.google.ads.mediation;

import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import n4.a;
import n4.n;
import u4.b;
import v4.p;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f14158a;

    /* renamed from: b  reason: collision with root package name */
    final p f14159b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f14158a = abstractAdViewAdapter;
        this.f14159b = pVar;
    }

    public final void onAdFailedToLoad(n nVar) {
        this.f14159b.onAdFailedToLoad((MediationInterstitialAdapter) this.f14158a, (a) nVar);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        u4.a aVar = (u4.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f14158a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, this.f14159b));
        this.f14159b.onAdLoaded(this.f14158a);
    }
}
