package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import v4.f;
import v4.r;
import v4.u;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface MediationNativeAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, r rVar, Bundle bundle, u uVar, Bundle bundle2);
}
