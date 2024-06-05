package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ou implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f10543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f10544b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f10545c;

    public /* synthetic */ ou(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        this.f10543a = appLovinAdViewEventListener;
        this.f10544b = appLovinAd;
        this.f10545c = appLovinAdView;
    }

    public final void run() {
        bc.f(this.f10543a, this.f10544b, this.f10545c);
    }
}
