package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class wt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f13176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13177b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f13178c;

    public /* synthetic */ wt(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        this.f13176a = appLovinAdRewardListener;
        this.f13177b = appLovinAd;
        this.f13178c = map;
    }

    public final void run() {
        bc.f(this.f13176a, this.f13177b, this.f13178c);
    }
}
