package com.unity3d.ads;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.m;

/* compiled from: UnityAds.kt */
public final class UnityAds$load$1 implements IUnityAdsLoadListener {
    UnityAds$load$1() {
    }

    public void onUnityAdsAdLoaded(String str) {
        m.e(str, "placementId");
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        m.e(str, "placementId");
        m.e(unityAdsLoadError, "error");
        m.e(str2, "message");
    }
}
