package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class zt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinAdVideoPlaybackListener f13975a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13976b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ double f13977c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f13978d;

    public /* synthetic */ zt(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d10, boolean z10) {
        this.f13975a = appLovinAdVideoPlaybackListener;
        this.f13976b = appLovinAd;
        this.f13977c = d10;
        this.f13978d = z10;
    }

    public final void run() {
        bc.b(this.f13975a, this.f13976b, this.f13977c, this.f13978d);
    }
}
