package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f11652a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f11653b;

    public /* synthetic */ j1(m mVar, AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f11652a = mVar;
        this.f11653b = appLovinBidTokenCollectionListener;
    }

    public final void run() {
        this.f11652a.b(this.f11653b);
    }
}
