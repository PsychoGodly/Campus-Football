package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.g4;
import com.startapp.j9;
import com.startapp.l9;
import com.startapp.q9;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class VideoEnabledAd extends InterstitialAd {
    private static final long serialVersionUID = 1;
    private VideoAdDetails videoAdDetails = null;

    public VideoEnabledAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new b(this.f16757a, this, adPreferences, adEventListener, this.placement).c();
    }

    public void c(String str) {
        super.c(str);
        String a10 = j9.a(str, "@videoJson@", "@videoJson@");
        if (a10 != null) {
            VideoAdDetails videoAdDetails2 = (VideoAdDetails) g4.a(a10, VideoAdDetails.class);
            this.videoAdDetails = videoAdDetails2;
            if (videoAdDetails2 != null) {
                videoAdDetails2.p();
            }
        }
    }

    public boolean v() {
        return this.videoAdDetails != null;
    }

    public void w() {
        this.videoAdDetails = null;
    }

    public VideoAdDetails x() {
        return this.videoAdDetails;
    }

    public void a(l9 l9Var, VideoConfig videoConfig, q9 q9Var) {
        this.videoAdDetails = new VideoAdDetails(l9Var, videoConfig, q9Var);
        Integer num = l9Var.f16118q;
        if (num != null && l9Var.f16119r != null) {
            if (num.intValue() > l9Var.f16119r.intValue()) {
                a(SplashConfig.Orientation.LANDSCAPE);
            } else {
                a(SplashConfig.Orientation.PORTRAIT);
            }
        }
    }
}
