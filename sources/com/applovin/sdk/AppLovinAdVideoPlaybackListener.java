package com.applovin.sdk;

public interface AppLovinAdVideoPlaybackListener {
    void videoPlaybackBegan(AppLovinAd appLovinAd);

    void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10);
}
