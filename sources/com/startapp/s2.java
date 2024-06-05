package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.video.b;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class s2 extends b {
    public s2(Context context, HtmlAd htmlAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_RETURN);
    }

    public void a(boolean z10) {
        super.a(z10);
        c(z10);
    }
}
