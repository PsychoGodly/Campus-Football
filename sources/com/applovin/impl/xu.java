package com.applovin.impl;

import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class xu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f13450a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f13451b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13452c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxError f13453d;

    public /* synthetic */ xu(boolean z10, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        this.f13450a = z10;
        this.f13451b = maxNativeAdListener;
        this.f13452c = str;
        this.f13453d = maxError;
    }

    public final void run() {
        bc.a(this.f13450a, this.f13451b, this.f13452c, this.f13453d);
    }
}
