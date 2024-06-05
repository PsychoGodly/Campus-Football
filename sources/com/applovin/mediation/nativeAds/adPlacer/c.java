package com.applovin.mediation.nativeAds.adPlacer;

import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaxAdPlacer f14084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Collection f14086c;

    public /* synthetic */ c(MaxAdPlacer maxAdPlacer, int i10, Collection collection) {
        this.f14084a = maxAdPlacer;
        this.f14085b = i10;
        this.f14086c = collection;
    }

    public final void run() {
        this.f14084a.a(this.f14085b, this.f14086c);
    }
}
