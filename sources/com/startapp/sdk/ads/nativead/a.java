package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.s0;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* compiled from: Sta */
public class a extends s0 {

    /* renamed from: i  reason: collision with root package name */
    public NativeAdPreferences f16558i;

    public a(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, NativeAdPreferences nativeAdPreferences) {
        super(context, ad2, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE);
        this.f16558i = nativeAdPreferences;
    }

    public void a(Ad ad2) {
    }

    public GetAdRequest d() {
        GetAdRequest d10 = super.d();
        if (d10 == null) {
            return null;
        }
        d10.f17038s0 = this.f16558i.getAdsNumber();
        if (this.f16558i.getImageSize() != null) {
            d10.L = this.f16558i.getImageSize().getWidth();
            d10.M = this.f16558i.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.f16558i.getPrimaryImageSize();
            int i10 = 2;
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            d10.N0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.f16558i.getSecondaryImageSize();
            if (secondaryImageSize != -1) {
                i10 = secondaryImageSize;
            }
            d10.O0 = Integer.toString(i10);
        }
        if (this.f16558i.isContentAd()) {
            d10.P0 = this.f16558i.isContentAd();
        }
        return d10;
    }
}
