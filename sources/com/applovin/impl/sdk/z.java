package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdLoadListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdServiceImpl f12100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinError f12101b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdLoadListener f12102c;

    public /* synthetic */ z(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f12100a = appLovinAdServiceImpl;
        this.f12101b = appLovinError;
        this.f12102c = appLovinAdLoadListener;
    }

    public final void run() {
        this.f12100a.a(this.f12101b, this.f12102c);
    }
}
