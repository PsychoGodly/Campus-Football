package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class av implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinNativeAdLoadListener f6584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinError f6585b;

    public /* synthetic */ av(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        this.f6584a = appLovinNativeAdLoadListener;
        this.f6585b = appLovinError;
    }

    public final void run() {
        bc.a(this.f6584a, this.f6585b);
    }
}
