package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public class AbstractAdListener implements InterstitialAdExtendedListener, RewardedVideoAdExtendedListener, RewardedInterstitialAdExtendedListener {
    public void onAdClicked(Ad ad2) {
    }

    public void onAdLoaded(Ad ad2) {
    }

    public void onError(Ad ad2, AdError adError) {
    }

    public void onInterstitialActivityDestroyed() {
    }

    public void onInterstitialDismissed(Ad ad2) {
    }

    public void onInterstitialDisplayed(Ad ad2) {
    }

    public void onLoggingImpression(Ad ad2) {
    }

    public void onRewardedAdCompleted() {
    }

    public void onRewardedAdServerFailed() {
    }

    public void onRewardedAdServerSucceeded() {
    }

    public void onRewardedInterstitialActivityDestroyed() {
    }

    public void onRewardedInterstitialClosed() {
    }

    public void onRewardedInterstitialCompleted() {
    }

    public void onRewardedVideoActivityDestroyed() {
    }

    public void onRewardedVideoClosed() {
    }

    public void onRewardedVideoCompleted() {
    }
}
