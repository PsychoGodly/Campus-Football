package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import v4.u;
import w4.a;
import w4.d;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, u uVar, Bundle bundle);
}
