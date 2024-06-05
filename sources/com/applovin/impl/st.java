package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class st implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f12185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f12186b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f12187c;

    public /* synthetic */ st(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        this.f12185a = appLovinAdViewEventListener;
        this.f12186b = appLovinAd;
        this.f12187c = appLovinAdView;
    }

    public final void run() {
        bc.e(this.f12185a, this.f12186b, this.f12187c);
    }
}
