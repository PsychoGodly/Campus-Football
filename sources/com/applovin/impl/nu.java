package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class nu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10027a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f10028b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f10029c;

    public /* synthetic */ nu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f10027a = z10;
        this.f10028b = maxAdListener;
        this.f10029c = maxAd;
    }

    public final void run() {
        bc.h(this.f10027a, this.f10028b, this.f10029c);
    }
}
