package com.startapp.sdk.adsbase.adrules;

import com.applovin.mediation.MaxReward;
import java.io.Serializable;

/* compiled from: Sta */
public class AdRulesResult implements Serializable {
    private static final long serialVersionUID = 1;
    private String reason;
    private boolean shouldDisplayAd;

    public AdRulesResult(boolean z10, String str) {
        this.shouldDisplayAd = z10;
        this.reason = str;
    }

    public String a() {
        String str = this.reason;
        return str != null ? str.split(" ")[0] : MaxReward.DEFAULT_LABEL;
    }

    public boolean b() {
        return this.shouldDisplayAd;
    }
}
