package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class uu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f12635a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f12636b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f12637c;

    public /* synthetic */ uu(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        this.f12635a = z10;
        this.f12636b = maxNativeAdListener;
        this.f12637c = maxAd;
    }

    public final void run() {
        bc.a(this.f12635a, this.f12636b, this.f12637c);
    }
}
