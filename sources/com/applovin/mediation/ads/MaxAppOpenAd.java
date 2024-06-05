package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdk;

public class MaxAppOpenAd {

    /* renamed from: a  reason: collision with root package name */
    private final MaxFullscreenAdImpl f13999a;

    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f13999a.logApiCall("destroy()");
        this.f13999a.destroy();
    }

    public String getAdUnitId() {
        return this.f13999a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f13999a.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f13999a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f13999a.logApiCall("loadAd()");
        this.f13999a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f13999a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f13999a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f13999a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f13999a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f13999a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f13999a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f13999a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd((String) null);
    }

    public String toString() {
        return MaxReward.DEFAULT_LABEL + this.f13999a;
    }

    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, k.k());
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f13999a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, (MaxFullscreenAdImpl.b) null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }

    public void showAd(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f13999a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        zp.b(str2, "MaxAppOpenAd");
        this.f13999a.showAd(str, str2, (Activity) null);
    }
}
