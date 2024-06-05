package com.applovin.mediation.adapters;

import com.applovin.mediation.adapters.NimbusMediationAdapter;
import com.applovin.sdk.AppLovinAd;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NimbusMediationAdapter.NimbusAdapterAdViewListener f13994a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13995b;

    public /* synthetic */ b(NimbusMediationAdapter.NimbusAdapterAdViewListener nimbusAdapterAdViewListener, AppLovinAd appLovinAd) {
        this.f13994a = nimbusAdapterAdViewListener;
        this.f13995b = appLovinAd;
    }

    public final void run() {
        this.f13994a.lambda$adReceived$0(this.f13995b);
    }
}
