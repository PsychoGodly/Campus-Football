package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public enum AdExperienceType {
    AD_EXPERIENCE_TYPE_REWARDED("ad_experience_config_rewarded"),
    AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL("ad_experience_config_rewarded_interstitial"),
    AD_EXPERIENCE_TYPE_INTERSTITIAL("ad_experience_config_interstitial");
    
    private String adExperienceType;

    private AdExperienceType(String str) {
        this.adExperienceType = str;
    }

    public String getAdExperienceType() {
        return this.adExperienceType;
    }
}
