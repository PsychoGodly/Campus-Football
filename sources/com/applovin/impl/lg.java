package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.t;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

public class lg extends ig {
    public lg(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    /* access modifiers changed from: protected */
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (t.a()) {
                this.f8537c.a(this.f8538d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f8536b.Y().b(), this.f8536b.Y().a(), this.f8535a.getOpenMeasurementVerificationScriptResources(), this.f8535a.getOpenMeasurementContentUrl(), this.f8535a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (t.a()) {
                this.f8537c.a(this.f8538d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
