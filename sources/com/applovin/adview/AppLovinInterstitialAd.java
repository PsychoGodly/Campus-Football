package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.ob;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            return new ob(appLovinSdk, context);
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
