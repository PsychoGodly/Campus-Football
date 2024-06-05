package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.m;

/* compiled from: Listeners.kt */
public interface Listeners {

    /* compiled from: Listeners.kt */
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String str) {
            m.e(str, "placementId");
        }

        public static void onComplete(Listeners listeners, String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            m.e(str, "placementId");
            m.e(unityAdsShowCompletionState, "state");
        }

        public static void onError(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            m.e(str, "placementId");
            m.e(unityAdsShowError, "error");
            m.e(str2, "message");
        }

        public static void onLeftApplication(Listeners listeners, String str) {
            m.e(str, "placementId");
        }

        public static void onStart(Listeners listeners, String str) {
            m.e(str, "placementId");
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
