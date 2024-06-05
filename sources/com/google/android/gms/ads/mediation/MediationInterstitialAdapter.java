package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import v4.e;
import v4.f;
import v4.p;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface MediationInterstitialAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, p pVar, Bundle bundle, e eVar, Bundle bundle2);

    void showInterstitial();
}
