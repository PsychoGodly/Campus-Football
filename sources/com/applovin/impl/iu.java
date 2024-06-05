package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class iu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f8601a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f8602b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f8603c;

    public /* synthetic */ iu(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f8601a = z10;
        this.f8602b = maxAdListener;
        this.f8603c = maxAd;
    }

    public final void run() {
        bc.a(this.f8601a, this.f8602b, this.f8603c);
    }
}
