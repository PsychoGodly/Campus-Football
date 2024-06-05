package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f12039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f12040b;

    public /* synthetic */ t0(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        this.f12039a = kVar;
        this.f12040b = sdkInitializationListener;
    }

    public final void run() {
        this.f12039a.b(this.f12040b);
    }
}
