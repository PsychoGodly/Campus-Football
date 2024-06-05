package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;

public interface AppLovinNativeAdLoadListener {
    void onNativeAdLoadFailed(AppLovinError appLovinError);

    void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd);
}
