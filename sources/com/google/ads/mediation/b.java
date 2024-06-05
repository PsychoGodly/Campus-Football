package com.google.ads.mediation;

import com.google.android.gms.ads.internal.client.a;
import n4.d;
import n4.n;
import o4.e;
import v4.k;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class b extends d implements e, a {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f14156a;

    /* renamed from: b  reason: collision with root package name */
    final k f14157b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
        this.f14156a = abstractAdViewAdapter;
        this.f14157b = kVar;
    }

    public final void onAdClicked() {
        this.f14157b.onAdClicked(this.f14156a);
    }

    public final void onAdClosed() {
        this.f14157b.onAdClosed(this.f14156a);
    }

    public final void onAdFailedToLoad(n nVar) {
        this.f14157b.onAdFailedToLoad(this.f14156a, nVar);
    }

    public final void onAdLoaded() {
        this.f14157b.onAdLoaded(this.f14156a);
    }

    public final void onAdOpened() {
        this.f14157b.onAdOpened(this.f14156a);
    }

    public final void onAppEvent(String str, String str2) {
        this.f14157b.zzd(this.f14156a, str, str2);
    }
}
