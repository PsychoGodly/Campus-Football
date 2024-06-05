package com.applovin.impl;

import com.applovin.impl.sdk.network.e;
import com.applovin.sdk.AppLovinPostbackListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n40 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rr f9902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f9903b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinPostbackListener f9904c;

    public /* synthetic */ n40(rr rrVar, e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f9902a = rrVar;
        this.f9903b = eVar;
        this.f9904c = appLovinPostbackListener;
    }

    public final void run() {
        this.f9902a.b(this.f9903b, this.f9904c);
    }
}
