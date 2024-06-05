package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class u2 extends r0 {
    public u2(Context context, SplashAd splashAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, splashAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_SPLASH, true);
    }

    public void a(boolean z10) {
        super.a(z10);
        c(z10);
    }
}
