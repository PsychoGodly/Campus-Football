package com.applovin.impl.mediation;

import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.mediation.MaxAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl.b f9723a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAd f9724b;

    public /* synthetic */ k(MediationServiceImpl.b bVar, MaxAd maxAd) {
        this.f9723a = bVar;
        this.f9724b = maxAd;
    }

    public final void run() {
        this.f9723a.a(this.f9724b);
    }
}
