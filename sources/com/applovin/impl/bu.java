package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class bu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f6795a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f6796b;

    public /* synthetic */ bu(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        this.f6795a = appLovinBidTokenCollectionListener;
        this.f6796b = str;
    }

    public final void run() {
        bc.c(this.f6795a, this.f6796b);
    }
}
