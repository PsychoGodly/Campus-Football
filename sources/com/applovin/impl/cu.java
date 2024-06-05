package com.applovin.impl;

import com.applovin.sdk.AppLovinPostbackListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class cu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinPostbackListener f7050a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7051b;

    public /* synthetic */ cu(AppLovinPostbackListener appLovinPostbackListener, String str) {
        this.f7050a = appLovinPostbackListener;
        this.f7051b = str;
    }

    public final void run() {
        bc.b(this.f7050a, this.f7051b);
    }
}
