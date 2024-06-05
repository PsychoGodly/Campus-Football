package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class vt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f12878a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f12879b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f12880c;

    public /* synthetic */ vt(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        this.f12878a = appLovinAdRewardListener;
        this.f12879b = appLovinAd;
        this.f12880c = map;
    }

    public final void run() {
        bc.e(this.f12878a, this.f12879b, this.f12880c);
    }
}
