package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.proguard.annotations.DoNotStripAny;

@DoNotStripAny
@Keep
public interface RewardedVideoAdApi extends FullScreenAd {
    /* bridge */ /* synthetic */ Ad.LoadConfigBuilder buildLoadAdConfig();

    RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig();

    /* bridge */ /* synthetic */ FullScreenAd.ShowConfigBuilder buildShowAdConfig();

    RewardedVideoAd.RewardedVideoAdShowConfigBuilder buildShowAdConfig();

    void destroy();

    String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig);

    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    boolean show();

    boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig);
}
