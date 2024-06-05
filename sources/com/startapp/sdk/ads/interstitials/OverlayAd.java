package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.r2;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class OverlayAd extends InterstitialAd {
    private static final long serialVersionUID = 1;

    public OverlayAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new r2(this.f16757a, this, adPreferences, adEventListener).c();
    }
}
