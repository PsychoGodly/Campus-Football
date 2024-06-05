package com.unity3d.services.core.extensions;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: StringExtensions.kt */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        if (str == null || str.length() == 0) {
            return "[Unity Ads] Internal error";
        }
        return UnityAdsConstants.Messages.MSG_UNITY_BASE + str;
    }
}
