package com.applovin.mediation.adapters;

import android.os.Bundle;
import com.applovin.impl.lb;
import com.applovin.impl.mb;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.b;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

public class AppLovinAdapterInterstitialListener implements mb, AppLovinAdClickListener, lb {
    private final MaxInterstitialAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterInterstitialListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxInterstitialAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad clicked");
        this.listener.onInterstitialAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad shown");
        Bundle bundle = new Bundle(1);
        if (appLovinAd instanceof b) {
            bundle.putBundle("applovin_ad_view_info", ((b) appLovinAd).e());
        }
        this.listener.onInterstitialAdDisplayed(bundle);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad hidden");
        this.listener.onInterstitialAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad loaded");
        this.parentAdapter.loadedInterstitialAd = appLovinAd;
        this.listener.onInterstitialAdLoaded();
    }

    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, MaxReward.DEFAULT_LABEL));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Interstitial ad failed to load with error: " + appLovinError);
        this.listener.onInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    public void onAdDisplayFailed(String str) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Interstitial ad failed to display with error: " + str);
        this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
    }
}
