package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.d;

/* compiled from: Sta */
public class c implements d.C0170d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.e f16927a;

    public c(d dVar, d.e eVar) {
        this.f16927a = eVar;
    }

    public void a(Ad ad2, CacheKey cacheKey, boolean z10) {
        AdEventListener adEventListener = this.f16927a.f16945d;
        if (adEventListener == null) {
            return;
        }
        if (!z10 || ad2 == null) {
            adEventListener.onFailedToReceiveAd(ad2);
        } else {
            adEventListener.onReceiveAd(ad2);
        }
    }
}
