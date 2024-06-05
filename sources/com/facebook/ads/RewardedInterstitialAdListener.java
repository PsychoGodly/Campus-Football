package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface RewardedInterstitialAdListener extends AdListener {
    void onRewardedInterstitialClosed();

    void onRewardedInterstitialCompleted();
}
