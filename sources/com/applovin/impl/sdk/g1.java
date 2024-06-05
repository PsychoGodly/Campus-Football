package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f11626a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f11627b;

    public /* synthetic */ g1(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        this.f11626a = kVar;
        this.f11627b = sdkInitializationListener;
    }

    public final void run() {
        this.f11626a.c(this.f11627b);
    }
}
