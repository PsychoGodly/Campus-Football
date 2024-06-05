package com.applovin.impl;

import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collections;

public class gf implements MaxAd {

    /* renamed from: a  reason: collision with root package name */
    private final String f8016a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxAdFormat f8017b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8018c;

    public gf(String str, MaxAdFormat maxAdFormat, String str2) {
        this.f8016a = str;
        this.f8017b = maxAdFormat;
        this.f8018c = str2;
    }

    public String getAdReviewCreativeId() {
        return null;
    }

    public String getAdUnitId() {
        return this.f8016a;
    }

    public String getAdValue(String str) {
        return null;
    }

    public String getAdValue(String str, String str2) {
        return null;
    }

    public String getCreativeId() {
        return null;
    }

    public String getDspId() {
        return null;
    }

    public String getDspName() {
        return null;
    }

    public MaxAdFormat getFormat() {
        return this.f8017b;
    }

    public MaxNativeAd getNativeAd() {
        return null;
    }

    public String getNetworkName() {
        return MaxReward.DEFAULT_LABEL;
    }

    public String getNetworkPlacement() {
        return null;
    }

    public String getPlacement() {
        return this.f8018c;
    }

    public long getRequestLatencyMillis() {
        return 0;
    }

    public double getRevenue() {
        return 0.0d;
    }

    public String getRevenuePrecision() {
        return "undefined";
    }

    public AppLovinSdkUtils.Size getSize() {
        return getFormat().getSize();
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return new MaxAdWaterfallInfoImpl((be) null, MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL, 0, new ArrayList(), Collections.EMPTY_LIST, MaxReward.DEFAULT_LABEL);
    }

    public String toString() {
        return "MaxAd{adUnitId=" + this.f8016a + ", format=" + this.f8017b + "}";
    }
}
