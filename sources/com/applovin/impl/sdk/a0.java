package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdServiceImpl f11477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdLoadListener f11478b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f11479c;

    public /* synthetic */ a0(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        this.f11477a = appLovinAdServiceImpl;
        this.f11478b = appLovinAdLoadListener;
        this.f11479c = appLovinAd;
    }

    public final void run() {
        this.f11477a.a(this.f11478b, this.f11479c);
    }
}
