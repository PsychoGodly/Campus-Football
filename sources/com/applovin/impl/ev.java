package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ev implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f7517a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f7518b;

    public /* synthetic */ ev(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        this.f7517a = appLovinAdDisplayListener;
        this.f7518b = appLovinAd;
    }

    public final void run() {
        bc.d(this.f7517a, this.f7518b);
    }
}
