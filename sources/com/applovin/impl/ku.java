package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ku implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f9097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f9098c;

    public /* synthetic */ ku(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        this.f9096a = z10;
        this.f9097b = maxAdListener;
        this.f9098c = maxAd;
    }

    public final void run() {
        bc.b(this.f9096a, this.f9097b, this.f9098c);
    }
}
