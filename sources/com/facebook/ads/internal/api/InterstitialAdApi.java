package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.InterstitialAd;
import com.facebook.proguard.annotations.DoNotStripAny;

@DoNotStripAny
@Keep
public interface InterstitialAdApi extends FullScreenAd {
    /* bridge */ /* synthetic */ Ad.LoadConfigBuilder buildLoadAdConfig();

    InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig();

    /* bridge */ /* synthetic */ FullScreenAd.ShowConfigBuilder buildShowAdConfig();

    InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig();

    boolean isAdLoaded();

    void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig);

    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    boolean show();

    boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig);
}
