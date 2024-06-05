package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class cv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdClickListener f7052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f7053b;

    public /* synthetic */ cv(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        this.f7052a = appLovinAdClickListener;
        this.f7053b = appLovinAd;
    }

    public final void run() {
        bc.b(this.f7052a, this.f7053b);
    }
}
