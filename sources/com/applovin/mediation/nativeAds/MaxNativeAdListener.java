package com.applovin.mediation.nativeAds;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

public abstract class MaxNativeAdListener {
    public void onNativeAdClicked(MaxAd maxAd) {
    }

    public void onNativeAdExpired(MaxAd maxAd) {
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
    }

    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
    }
}
