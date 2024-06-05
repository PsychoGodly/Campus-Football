package com.applovin.mediation;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.t;
import com.applovin.impl.ve;
import com.applovin.sdk.AppLovinSdkUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;

public class MaxAdFormat {
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat BANNER = new MaxAdFormat(AdPreferences.TYPE_BANNER, "Banner");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    /* renamed from: a  reason: collision with root package name */
    private final String f13989a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13990b;

    private MaxAdFormat(String str, String str2) {
        this.f13989a = str;
        this.f13990b = str2;
    }

    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("appopen") || str.equalsIgnoreCase("app_open")) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("reward")) {
            return REWARDED;
        }
        if (str.equalsIgnoreCase("rewarded_inter") || str.equalsIgnoreCase("rewarded_interstitial")) {
            return REWARDED_INTERSTITIAL;
        }
        t.h("AppLovinSdk", "Unknown ad format: " + str);
        return null;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Activity activity) {
        return getAdaptiveSize(-1, activity);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f13990b;
    }

    public String getLabel() {
        return this.f13989a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        if (this == MREC) {
            return new AppLovinSdkUtils.Size(300, 250);
        }
        return new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED || this == REWARDED_INTERSTITIAL;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f13989a + '\'' + '}';
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i10, Context context) {
        if (this == BANNER || this == LEADER) {
            return ve.a(i10, this, context);
        }
        return getSize();
    }
}
