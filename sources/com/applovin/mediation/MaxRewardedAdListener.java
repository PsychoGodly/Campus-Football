package com.applovin.mediation;

public interface MaxRewardedAdListener extends MaxAdListener {
    @Deprecated
    void onRewardedVideoCompleted(MaxAd maxAd);

    @Deprecated
    void onRewardedVideoStarted(MaxAd maxAd);

    void onUserRewarded(MaxAd maxAd, MaxReward maxReward);
}
