package com.startapp.sdk.ads.splash;

import android.content.Context;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.u2;

/* compiled from: Sta */
public class SplashAd extends InterstitialAd {
    private static final long serialVersionUID = 1;

    public SplashAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new u2(this.f16757a, this, adPreferences, adEventListener).c();
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        super.load(adPreferences, adEventListener, false);
    }
}
