package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

public interface MaxRewardedInterstitialAdapterListener extends MaxAdapterListener {
    void onRewardedInterstitialAdClicked();

    void onRewardedInterstitialAdClicked(Bundle bundle);

    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    void onRewardedInterstitialAdDisplayed();

    void onRewardedInterstitialAdDisplayed(Bundle bundle);

    void onRewardedInterstitialAdHidden();

    void onRewardedInterstitialAdHidden(Bundle bundle);

    void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    void onRewardedInterstitialAdLoaded();

    void onRewardedInterstitialAdLoaded(Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdVideoCompleted();

    @Deprecated
    void onRewardedInterstitialAdVideoStarted();

    void onUserRewarded(MaxReward maxReward);

    void onUserRewarded(MaxReward maxReward, Bundle bundle);
}
