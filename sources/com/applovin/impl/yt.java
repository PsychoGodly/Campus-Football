package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class yt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdVideoPlaybackListener f13710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13711b;

    public /* synthetic */ yt(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        this.f13710a = appLovinAdVideoPlaybackListener;
        this.f13711b = appLovinAd;
    }

    public final void run() {
        bc.b(this.f13710a, this.f13711b);
    }
}
