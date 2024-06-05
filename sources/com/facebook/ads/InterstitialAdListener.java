package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(Ad ad2);

    void onInterstitialDisplayed(Ad ad2);
}
