package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class lu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f9278b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f9279c;

    public /* synthetic */ lu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f9277a = z10;
        this.f9278b = maxAdListener;
        this.f9279c = maxAd;
    }

    public final void run() {
        bc.g(this.f9277a, this.f9278b, this.f9279c);
    }
}
