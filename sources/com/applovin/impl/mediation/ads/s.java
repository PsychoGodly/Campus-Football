package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdLoaderImpl.c f9538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAd f9539b;

    public /* synthetic */ s(MaxNativeAdLoaderImpl.c cVar, MaxAd maxAd) {
        this.f9538a = cVar;
        this.f9539b = maxAd;
    }

    public final void run() {
        this.f9538a.a(this.f9539b);
    }
}
