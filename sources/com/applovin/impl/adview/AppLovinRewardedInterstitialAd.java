package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinRewardedInterstitialAd {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinIncentivizedInterstitial f6373a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinAdDisplayListener f6374b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdClickListener f6375c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdVideoPlaybackListener f6376d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f6373a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6375c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f6374b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6376d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f6373a.show(appLovinAd, context, appLovinAdRewardListener, this.f6376d, this.f6374b, this.f6375c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
