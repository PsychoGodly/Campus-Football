package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class zu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinNativeAdEventListener f13979a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinNativeAd f13980b;

    public /* synthetic */ zu(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        this.f13979a = appLovinNativeAdEventListener;
        this.f13980b = appLovinNativeAd;
    }

    public final void run() {
        bc.a(this.f13979a, this.f13980b);
    }
}
