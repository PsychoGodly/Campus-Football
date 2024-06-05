package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
class CachedAd$3 extends Ad {
    public final /* synthetic */ h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedAd$3(h hVar, Context context, AdPreferences.Placement placement) {
        super(context, placement);
        this.this$0 = hVar;
    }

    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    public String getAdId() {
        return null;
    }

    public String getBidToken() {
        return null;
    }

    public String getErrorMessage() {
        return "explicit call: nofill [204]";
    }
}
