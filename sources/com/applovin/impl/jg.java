package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.t;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

public class jg extends ig {
    public jg(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
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
            if (this.f8535a.getOpenMeasurementVerificationScriptResources().size() > 0) {
                return AdSessionContext.createNativeAdSessionContext(this.f8536b.Y().b(), this.f8536b.Y().a(), this.f8535a.getOpenMeasurementVerificationScriptResources(), this.f8535a.getOpenMeasurementContentUrl(), this.f8535a.getOpenMeasurementCustomReferenceData());
            }
            return AdSessionContext.createHtmlAdSessionContext(this.f8536b.Y().b(), webView, this.f8535a.getOpenMeasurementContentUrl(), this.f8535a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (t.a()) {
                this.f8537c.a(this.f8538d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
