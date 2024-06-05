package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.proguard.annotations.DoNotStripAny;

@DoNotStripAny
@Keep
public interface RewardedInterstitialAdApi extends FullScreenAd {
    /* bridge */ /* synthetic */ Ad.LoadConfigBuilder buildLoadAdConfig();

    RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig();

    /* bridge */ /* synthetic */ FullScreenAd.ShowConfigBuilder buildShowAdConfig();

    RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig();

    void destroy();

    String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig);

    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    boolean show();

    boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig);
}
