package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class xt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f13447a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13448b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f13449c;

    public /* synthetic */ xt(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        this.f13447a = appLovinAdRewardListener;
        this.f13448b = appLovinAd;
        this.f13449c = map;
    }

    public final void run() {
        bc.d(this.f13447a, this.f13448b, this.f13449c);
    }
}
