package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class vu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f12881a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f12882b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f12883c;

    public /* synthetic */ vu(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        this.f12881a = z10;
        this.f12882b = maxNativeAdListener;
        this.f12883c = maxAd;
    }

    public final void run() {
        bc.b(this.f12881a, this.f12882b, this.f12883c);
    }
}
