package com.applovin.mediation;

import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;

public interface MaxAd {
    String getAdReviewCreativeId();

    String getAdUnitId();

    String getAdValue(String str);

    String getAdValue(String str, String str2);

    String getCreativeId();

    String getDspId();

    String getDspName();

    MaxAdFormat getFormat();

    MaxNativeAd getNativeAd();

    String getNetworkName();

    String getNetworkPlacement();

    String getPlacement();

    long getRequestLatencyMillis();

    double getRevenue();

    String getRevenuePrecision();

    AppLovinSdkUtils.Size getSize();

    MaxAdWaterfallInfo getWaterfall();
}
