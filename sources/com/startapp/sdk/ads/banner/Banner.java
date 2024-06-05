package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class Banner extends BannerStandard {
    public Banner(Context context) {
        super(context);
    }

    public Banner(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    public Banner(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    public Banner(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    public Banner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Banner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public Banner(Context context, boolean z10, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context, z10, adPreferences, bannerStandardAd);
    }
}
