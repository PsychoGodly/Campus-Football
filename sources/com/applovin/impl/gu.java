package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class gu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f8148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f8149b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f8150c;

    public /* synthetic */ gu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f8148a = z10;
        this.f8149b = maxAdListener;
        this.f8150c = maxAd;
    }

    public final void run() {
        bc.d(this.f8148a, this.f8149b, this.f8150c);
    }
}
