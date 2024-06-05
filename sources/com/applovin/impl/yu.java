package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class yu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f13712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13713b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f13714c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewDisplayErrorCode f13715d;

    public /* synthetic */ yu(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        this.f13712a = appLovinAdViewEventListener;
        this.f13713b = appLovinAd;
        this.f13714c = appLovinAdView;
        this.f13715d = appLovinAdViewDisplayErrorCode;
    }

    public final void run() {
        bc.b(this.f13712a, this.f13713b, this.f13714c, this.f13715d);
    }
}
