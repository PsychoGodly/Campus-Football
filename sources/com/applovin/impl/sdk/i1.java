package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f11637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f11638b;

    public /* synthetic */ i1(l lVar, AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f11637a = lVar;
        this.f11638b = appLovinBidTokenCollectionListener;
    }

    public final void run() {
        this.f11637a.b(this.f11638b);
    }
}
