package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import n4.h;
import v4.e;
import v4.f;
import v4.k;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface MediationBannerAdapter extends f {
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, k kVar, Bundle bundle, h hVar, e eVar, Bundle bundle2);
}
