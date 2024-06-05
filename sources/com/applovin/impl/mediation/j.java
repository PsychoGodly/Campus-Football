package com.applovin.impl.mediation;

import com.applovin.impl.de;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f9717a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ de f9718b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Long f9719c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f9720d;

    public /* synthetic */ j(MediationServiceImpl mediationServiceImpl, de deVar, Long l10, MaxAdListener maxAdListener) {
        this.f9717a = mediationServiceImpl;
        this.f9718b = deVar;
        this.f9719c = l10;
        this.f9720d = maxAdListener;
    }

    public final void run() {
        this.f9717a.a(this.f9718b, this.f9719c, this.f9720d);
    }
}
