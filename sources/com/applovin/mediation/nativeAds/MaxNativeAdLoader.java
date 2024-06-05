package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

public class MaxNativeAdLoader {

    /* renamed from: a  reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f14026a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f14026a.logApiCall("a()");
        this.f14026a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f14026a.logApiCall("b()");
        this.f14026a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f14026a.logApiCall("destroy()");
        this.f14026a.destroy();
    }

    public String getAdUnitId() {
        return this.f14026a.getAdUnitId();
    }

    public String getPlacement() {
        this.f14026a.logApiCall("getPlacement()");
        return this.f14026a.getPlacement();
    }

    public void loadAd() {
        loadAd((MaxNativeAdView) null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f14026a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f14026a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f14026a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f14026a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f14026a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f14026a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f14026a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f14026a.setRevenueListener(maxAdRevenueListener);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f14026a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f14026a.loadAd(maxNativeAdView);
    }

    public void destroy(MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f14026a;
        maxNativeAdLoaderImpl.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f14026a.destroy(maxAd);
    }
}
