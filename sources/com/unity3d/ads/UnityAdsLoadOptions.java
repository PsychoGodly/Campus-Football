package com.unity3d.ads;

import com.unity3d.ads.core.domain.LegacyLoadUseCase;

public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = LegacyLoadUseCase.KEY_AD_MARKUP;

    public void setAdMarkup(String str) {
        set(this.AD_MARKUP, str);
    }
}
