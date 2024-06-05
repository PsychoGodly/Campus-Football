package com.google.ads.mediation;

import n4.m;
import v4.p;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class d extends m {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f14160a;

    /* renamed from: b  reason: collision with root package name */
    final p f14161b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f14160a = abstractAdViewAdapter;
        this.f14161b = pVar;
    }

    public final void b() {
        this.f14161b.onAdClosed(this.f14160a);
    }

    public final void e() {
        this.f14161b.onAdOpened(this.f14160a);
    }
}
