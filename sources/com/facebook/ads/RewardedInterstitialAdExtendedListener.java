package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface RewardedInterstitialAdExtendedListener extends RewardedInterstitialAdListener {
    void onRewardedInterstitialActivityDestroyed();
}
