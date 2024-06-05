package com.applovin.mediation.adapters;

import android.os.Bundle;
import com.applovin.impl.lb;
import com.applovin.impl.mb;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.b;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.Map;

public class AppLovinAdapterRewardedListener implements mb, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener, AppLovinAdClickListener, lb {
    private boolean hasGrantedReward;
    private final MaxRewardedAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterRewardedListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxRewardedAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad clicked");
        this.listener.onRewardedAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad shown");
        Bundle bundle = new Bundle(1);
        if (appLovinAd instanceof b) {
            bundle.putBundle("applovin_ad_view_info", ((b) appLovinAd).e());
        }
        this.listener.onRewardedAdDisplayed(bundle);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        if (this.hasGrantedReward || this.parentAdapter.shouldAlwaysRewardUser()) {
            MaxReward reward = this.parentAdapter.getReward();
            AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
            appLovinMediationAdapter.log("Rewarded user with reward: " + reward);
            this.listener.onUserRewarded(reward);
        }
        this.parentAdapter.log("Rewarded ad hidden");
        this.listener.onRewardedAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad loaded");
        this.parentAdapter.loadedRewardedAd = appLovinAd;
        this.listener.onRewardedAdLoaded();
    }

    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, MaxReward.DEFAULT_LABEL));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded ad failed to load with error code: " + appLovinError);
        this.listener.onRewardedAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    public void onAdDisplayFailed(String str) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded ad failed to display with error: " + str);
        this.listener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
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
        this.parentAdapter.log("Rewarded ad video started");
    }

    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log("Rewarded ad video ended at " + d10 + "% and is fully watched: " + z10);
        this.hasGrantedReward = z10;
    }
}
