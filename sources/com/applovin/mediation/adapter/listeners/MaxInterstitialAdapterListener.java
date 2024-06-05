package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.adapter.MaxAdapterError;

public interface MaxInterstitialAdapterListener extends MaxAdapterListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClicked(Bundle bundle);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    void onInterstitialAdDisplayed();

    void onInterstitialAdDisplayed(Bundle bundle);

    void onInterstitialAdHidden();

    void onInterstitialAdHidden(Bundle bundle);

    void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdLoaded();

    void onInterstitialAdLoaded(Bundle bundle);
}
