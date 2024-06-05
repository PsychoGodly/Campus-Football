package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.m2;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class BannerStandardAd extends HtmlAd {
    private static final long serialVersionUID = 1;
    private int bannerType;
    private boolean fixedSize;
    private int offset = 0;

    public BannerStandardAd(Context context, int i10) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = i10;
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new m2(this.f16757a, this, this.offset, adPreferences, adEventListener).c();
        this.offset++;
    }

    public void b(boolean z10) {
        this.fixedSize = z10;
    }

    public void c(int i10) {
        this.bannerType = i10;
    }

    public int v() {
        return this.bannerType;
    }

    public int w() {
        return this.offset;
    }

    public boolean x() {
        return this.fixedSize;
    }
}
