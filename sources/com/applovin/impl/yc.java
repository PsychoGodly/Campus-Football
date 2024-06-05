package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity;
import com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity;

public class yc {

    /* renamed from: a  reason: collision with root package name */
    private final k f13595a;

    private static class a extends p {

        /* renamed from: a  reason: collision with root package name */
        private final de f13596a;

        /* renamed from: b  reason: collision with root package name */
        private final k f13597b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdapterListener f13598c;

        public a(de deVar, k kVar, MaxAdapterListener maxAdapterListener) {
            this.f13596a = deVar;
            this.f13597b = kVar;
            this.f13598c = maxAdapterListener;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                ((MaxHybridMRecAdActivity) activity).a(this.f13596a.G(), this.f13596a.x(), this.f13597b, this.f13598c);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f13596a.v().get()) {
                this.f13597b.e().b(this);
            }
        }
    }

    private static class b extends p {

        /* renamed from: a  reason: collision with root package name */
        private final de f13599a;

        /* renamed from: b  reason: collision with root package name */
        private final k f13600b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdapterListener f13601c;

        public b(de deVar, k kVar, MaxAdapterListener maxAdapterListener) {
            this.f13599a = deVar;
            this.f13600b = kVar;
            this.f13601c = maxAdapterListener;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                ((MaxHybridNativeAdActivity) activity).a(this.f13599a.G(), this.f13599a.getNativeAd(), this.f13600b, this.f13601c);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f13599a.v().get()) {
                this.f13600b.e().b(this);
            }
        }
    }

    public yc(k kVar) {
        this.f13595a = kVar;
    }

    public void a(de deVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        zp.b();
        if (activity == null) {
            activity = this.f13595a.e().b();
        }
        if (deVar.getNativeAd() != null) {
            this.f13595a.L();
            if (t.a()) {
                this.f13595a.L().a("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f13595a.e().a(new b(deVar, this.f13595a, maxAdapterListener));
            activity.startActivity(new Intent(activity, MaxHybridNativeAdActivity.class));
        } else if (deVar.x() != null) {
            this.f13595a.L();
            if (t.a()) {
                this.f13595a.L().a("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f13595a.e().a(new a(deVar, this.f13595a, maxAdapterListener));
            activity.startActivity(new Intent(activity, MaxHybridMRecAdActivity.class));
        } else if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
    }
}
