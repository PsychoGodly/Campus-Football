package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class fu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f7864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdExpirationListener f7865b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f7866c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxAd f7867d;

    public /* synthetic */ fu(boolean z10, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        this.f7864a = z10;
        this.f7865b = maxAdExpirationListener;
        this.f7866c = maxAd;
        this.f7867d = maxAd2;
    }

    public final void run() {
        bc.a(this.f7864a, this.f7865b, this.f7866c, this.f7867d);
    }
}
