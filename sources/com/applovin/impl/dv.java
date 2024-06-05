package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class dv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f7332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f7333b;

    public /* synthetic */ dv(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        this.f7332a = appLovinAdDisplayListener;
        this.f7333b = appLovinAd;
    }

    public final void run() {
        bc.c(this.f7332a, this.f7333b);
    }
}
