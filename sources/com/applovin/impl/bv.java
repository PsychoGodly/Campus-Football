package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class bv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaxAdReviewListener f6797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f6798b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAd f6799c;

    public /* synthetic */ bv(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        this.f6797a = maxAdReviewListener;
        this.f6798b = str;
        this.f6799c = maxAd;
    }

    public final void run() {
        bc.a(this.f6797a, this.f6798b, this.f6799c);
    }
}
