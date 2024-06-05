package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import v4.e;
import w4.a;
import w4.c;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, c cVar, String str, e eVar, Bundle bundle);

    void showInterstitial();
}
