package com.applovin.mediation.hybridAds;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.kn;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sm;
import com.applovin.impl.wc;
import com.applovin.impl.xc;
import com.applovin.impl.xl;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;

public class MaxHybridNativeAdActivity extends wc {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public MaxNativeAdView f14009f;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f14010a;

        a(MaxNativeAd maxNativeAd) {
            this.f14010a = maxNativeAd;
        }

        public void run() {
            if (!this.f14010a.prepareForInteraction(MaxHybridNativeAdActivity.this.f14009f.getClickableViews(), MaxHybridNativeAdActivity.this.f14009f)) {
                this.f14010a.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f14009f);
            }
        }
    }

    public void a(xc xcVar, MaxNativeAd maxNativeAd, k kVar, MaxAdapterListener maxAdapterListener) {
        super.a(xcVar, kVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(R.layout.max_hybrid_native_ad_view).setTitleTextViewId(R.id.applovin_native_title_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), (Context) this);
        this.f14009f = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        a aVar = new a(maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(aVar);
        } else {
            kVar.l0().a((xl) new kn(kVar, "MaxHybridNativeAdPrepareForInteraction", aVar), sm.b.MEDIATION);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f14009f, "MaxHybridNativeAdActivity");
    }
}
