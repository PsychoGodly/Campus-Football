package com.startapp.sdk.ads.nativead;

/* compiled from: Sta */
public interface NativeAdDisplayListener {
    void adClicked(NativeAdInterface nativeAdInterface);

    void adDisplayed(NativeAdInterface nativeAdInterface);

    void adHidden(NativeAdInterface nativeAdInterface);

    void adNotDisplayed(NativeAdInterface nativeAdInterface);
}
