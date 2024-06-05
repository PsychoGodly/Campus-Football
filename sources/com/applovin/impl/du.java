package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class du implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f7329a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f7330b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f7331c;

    public /* synthetic */ du(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        this.f7329a = appLovinAdViewEventListener;
        this.f7330b = appLovinAd;
        this.f7331c = appLovinAdView;
    }

    public final void run() {
        bc.d(this.f7329a, this.f7330b, this.f7331c);
    }
}
