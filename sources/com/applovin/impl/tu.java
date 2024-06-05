package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class tu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f12448a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdRevenueListener f12449b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f12450c;

    public /* synthetic */ tu(boolean z10, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        this.f12448a = z10;
        this.f12449b = maxAdRevenueListener;
        this.f12450c = maxAd;
    }

    public final void run() {
        bc.a(this.f12448a, this.f12449b, this.f12450c);
    }
}
