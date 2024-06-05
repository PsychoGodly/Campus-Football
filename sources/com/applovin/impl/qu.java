package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class qu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f11078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f11079b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f11080c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxReward f11081d;

    public /* synthetic */ qu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        this.f11078a = z10;
        this.f11079b = maxAdListener;
        this.f11080c = maxAd;
        this.f11081d = maxReward;
    }

    public final void run() {
        bc.a(this.f11078a, this.f11079b, this.f11080c, this.f11081d);
    }
}
