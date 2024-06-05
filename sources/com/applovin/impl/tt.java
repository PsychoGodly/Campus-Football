package com.applovin.impl;

import com.applovin.sdk.AppLovinAdDisplayListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class tt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f12446a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12447b;

    public /* synthetic */ tt(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        this.f12446a = appLovinAdDisplayListener;
        this.f12447b = str;
    }

    public final void run() {
        ((lb) this.f12446a).onAdDisplayFailed(this.f12447b);
    }
}
