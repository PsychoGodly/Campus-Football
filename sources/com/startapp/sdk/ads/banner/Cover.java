package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class Cover extends BannerStandard {
    public Cover(Activity activity) {
        super(activity);
    }

    public String e() {
        return "StartApp Cover";
    }

    public int getHeightInDp() {
        return 628;
    }

    public int getWidthInDp() {
        return 1200;
    }

    public void loadAd(int i10, int i11) {
        super.loadAd(getWidthInDp(), getHeightInDp());
    }

    public int s() {
        return 2;
    }

    public Cover(Activity activity, AdPreferences adPreferences) {
        super((Context) activity, adPreferences);
    }

    public Cover(Activity activity, BannerListener bannerListener) {
        super((Context) activity, bannerListener);
    }

    public Cover(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super((Context) activity, adPreferences, bannerListener);
    }

    public Cover(Activity activity, AttributeSet attributeSet) {
        super((Context) activity, attributeSet);
    }

    public Cover(Activity activity, AttributeSet attributeSet, int i10) {
        super((Context) activity, attributeSet, i10);
    }

    @Deprecated
    public Cover(Context context) {
        super(context);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Cover(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public Cover(Context context, boolean z10, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context, z10, adPreferences, bannerStandardAd);
    }
}
