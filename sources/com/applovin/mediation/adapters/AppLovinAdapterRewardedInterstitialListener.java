package com.applovin.mediation.adapters;

import android.os.Bundle;
import com.applovin.impl.lb;
import com.applovin.impl.mb;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.b;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.Map;

public class AppLovinAdapterRewardedInterstitialListener implements mb, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener, AppLovinAdClickListener, lb {
    private boolean hasGrantedReward;
    private final MaxRewardedInterstitialAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterRewardedInterstitialListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxRewardedInterstitialAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad clicked");
        this.listener.onRewardedInterstitialAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad shown");
        Bundle bundle = new Bundle(1);
        if (appLovinAd instanceof b) {
            bundle.putBundle("applovin_ad_view_info", ((b) appLovinAd).e());
        }
        this.listener.onRewardedInterstitialAdDisplayed(bundle);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        if (this.hasGrantedReward || this.parentAdapter.shouldAlwaysRewardUser()) {
            MaxReward reward = this.parentAdapter.getReward();
            AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
            appLovinMediationAdapter.log("Rewarded interstitial rewarded user with reward: " + reward);
            this.listener.onUserRewarded(reward);
        }
        this.parentAdapter.log("Rewarded interstitial ad hidden");
        this.listener.onRewardedInterstitialAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad loaded");
        this.parentAdapter.loadedRewardedInterstitialAd = appLovinAd;
        this.listener.onRewardedInterstitialAdLoaded();
    }

    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, MaxReward.DEFAULT_LABEL));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded interstitial ad failed to load with error: " + appLovinError);
        this.listener.onRewardedInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    public void onAdDisplayFailed(String str) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded interstitial ad failed to display with error: " + str);
        this.listener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
    }

    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("User is over quota: " + map);
    }

    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Reward rejected: " + map);
    }

    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        this.parentAdapter.log("Reward verified");
    }

    public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Reward validation request failed with code: " + i10);
    }

    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad video started");
    }

    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded interstitial ad video ended at " + d10 + "% and is fully watched: " + z10);
        this.hasGrantedReward = z10;
    }
}
