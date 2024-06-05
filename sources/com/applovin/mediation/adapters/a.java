package com.applovin.mediation.adapters;

import com.applovin.sdk.AppLovinAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdapterAdViewListener f13992a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13993b;

    public /* synthetic */ a(AppLovinAdapterAdViewListener appLovinAdapterAdViewListener, AppLovinAd appLovinAd) {
        this.f13992a = appLovinAdapterAdViewListener;
        this.f13993b = appLovinAd;
    }

    public final void run() {
        this.f13992a.lambda$adReceived$0(this.f13993b);
    }
}
