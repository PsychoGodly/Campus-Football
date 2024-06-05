package com.applovin.impl.adview;

import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAppOpenAd {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinInterstitialAdDialog f6372a;

    public AppLovinAppOpenAd(AppLovinSdk appLovinSdk) {
        this.f6372a = AppLovinInterstitialAd.create(appLovinSdk, k.k());
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6372a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f6372a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6372a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(AppLovinAd appLovinAd) {
        this.f6372a.showAndRender(appLovinAd);
    }

    public String toString() {
        return "AppLovinAppOpenAd{}";
    }
}
