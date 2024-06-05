package com.applovin.impl;

import com.applovin.sdk.AppLovinPostbackListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class eu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinPostbackListener f7514a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7515b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7516c;

    public /* synthetic */ eu(AppLovinPostbackListener appLovinPostbackListener, String str, int i10) {
        this.f7514a = appLovinPostbackListener;
        this.f7515b = str;
        this.f7516c = i10;
    }

    public final void run() {
        bc.b(this.f7514a, this.f7515b, this.f7516c);
    }
}
