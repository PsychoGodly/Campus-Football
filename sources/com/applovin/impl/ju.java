package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ju implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f8807a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f8808b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f8809c;

    public /* synthetic */ ju(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f8807a = z10;
        this.f8808b = maxAdListener;
        this.f8809c = maxAd;
    }

    public final void run() {
        bc.e(this.f8807a, this.f8808b, this.f8809c);
    }
}
