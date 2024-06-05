package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.MobileAds;
import v4.a;
import v4.d;
import v4.g;
import v4.h;
import v4.i;
import v4.j;
import v4.m;
import v4.n;
import v4.o;
import v4.q;
import v4.s;
import v4.t;
import v4.x;
import x4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(x4.a aVar, b bVar);

    public void loadRtbAppOpenAd(h hVar, d<g, Object> dVar) {
        loadAppOpenAd(hVar, dVar);
    }

    public void loadRtbBannerAd(j jVar, d<i, Object> dVar) {
        loadBannerAd(jVar, dVar);
    }

    public void loadRtbInterscrollerAd(j jVar, d<m, Object> dVar) {
        dVar.onFailure(new n4.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRtbInterstitialAd(o oVar, d<n, Object> dVar) {
        loadInterstitialAd(oVar, dVar);
    }

    public void loadRtbNativeAd(q qVar, d<x, Object> dVar) {
        loadNativeAd(qVar, dVar);
    }

    public void loadRtbRewardedAd(t tVar, d<s, Object> dVar) {
        loadRewardedAd(tVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(t tVar, d<s, Object> dVar) {
        loadRewardedInterstitialAd(tVar, dVar);
    }
}
