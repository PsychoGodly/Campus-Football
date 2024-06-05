package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class hu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f8369a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f8370b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f8371c;

    public /* synthetic */ hu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f8369a = z10;
        this.f8370b = maxAdListener;
        this.f8371c = maxAd;
    }

    public final void run() {
        bc.c(this.f8369a, this.f8370b, this.f8371c);
    }
}
