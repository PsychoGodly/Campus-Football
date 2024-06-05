package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface RewardedVideoAdListener extends AdListener {
    void onRewardedVideoClosed();

    void onRewardedVideoCompleted();
}
