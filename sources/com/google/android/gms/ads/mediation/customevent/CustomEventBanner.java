package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import n4.h;
import v4.e;
import w4.a;
import w4.b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, h hVar, e eVar, Bundle bundle);
}
