package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f11602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f11603b;

    public /* synthetic */ f1(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        this.f11602a = kVar;
        this.f11603b = sdkInitializationListener;
    }

    public final void run() {
        this.f11602a.d(this.f11603b);
    }
}
