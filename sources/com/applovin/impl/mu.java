package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class mu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f9861b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f9862c;

    public /* synthetic */ mu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f9860a = z10;
        this.f9861b = maxAdListener;
        this.f9862c = maxAd;
    }

    public final void run() {
        bc.f(this.f9860a, this.f9861b, this.f9862c);
    }
}
