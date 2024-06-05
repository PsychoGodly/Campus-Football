package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ut implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f12632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f12633b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12634c;

    public /* synthetic */ ut(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i10) {
        this.f12632a = appLovinAdRewardListener;
        this.f12633b = appLovinAd;
        this.f12634c = i10;
    }

    public final void run() {
        bc.b(this.f12632a, this.f12633b, this.f12634c);
    }
}
