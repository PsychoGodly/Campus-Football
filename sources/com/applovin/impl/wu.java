package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class wu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f13179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f13180b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdView f13181c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxAd f13182d;

    public /* synthetic */ wu(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f13179a = z10;
        this.f13180b = maxNativeAdListener;
        this.f13181c = maxNativeAdView;
        this.f13182d = maxAd;
    }

    public final void run() {
        bc.a(this.f13179a, this.f13180b, this.f13181c, this.f13182d);
    }
}
