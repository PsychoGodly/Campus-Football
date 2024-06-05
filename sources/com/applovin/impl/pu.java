package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class pu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10755a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f10756b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f10757c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxError f10758d;

    public /* synthetic */ pu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        this.f10755a = z10;
        this.f10756b = maxAdListener;
        this.f10757c = maxAd;
        this.f10758d = maxError;
    }

    public final void run() {
        bc.a(this.f10755a, this.f10756b, this.f10757c, this.f10758d);
    }
}
