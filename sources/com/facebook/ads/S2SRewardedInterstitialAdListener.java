package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface S2SRewardedInterstitialAdListener extends RewardedInterstitialAdListener {
    void onRewardServerFailed();

    void onRewardServerSuccess();
}
