package com.google.ads.mediation;

import n4.d;
import n4.n;
import q4.f;
import q4.i;
import v4.r;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class e extends d implements i.a, f.c, f.b {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f14162a;

    /* renamed from: b  reason: collision with root package name */
    final r f14163b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, r rVar) {
        this.f14162a = abstractAdViewAdapter;
        this.f14163b = rVar;
    }

    public final void a(f fVar) {
        this.f14163b.zzc(this.f14162a, fVar);
    }

    public final void b(i iVar) {
        this.f14163b.onAdLoaded(this.f14162a, new a(iVar));
    }

    public final void c(f fVar, String str) {
        this.f14163b.zze(this.f14162a, fVar, str);
    }

    public final void onAdClicked() {
        this.f14163b.onAdClicked(this.f14162a);
    }

    public final void onAdClosed() {
        this.f14163b.onAdClosed(this.f14162a);
    }

    public final void onAdFailedToLoad(n nVar) {
        this.f14163b.onAdFailedToLoad(this.f14162a, nVar);
    }

    public final void onAdImpression() {
        this.f14163b.onAdImpression(this.f14162a);
    }

    public final void onAdLoaded() {
    }

    public final void onAdOpened() {
        this.f14163b.onAdOpened(this.f14162a);
    }
}
