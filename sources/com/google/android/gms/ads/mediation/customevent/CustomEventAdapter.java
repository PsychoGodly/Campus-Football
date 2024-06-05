package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.zzbza;
import java.util.Objects;
import n4.a;
import n4.h;
import v4.e;
import v4.k;
import v4.p;
import v4.r;
import v4.u;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e  reason: collision with root package name */
    static final a f14933e = new a(0, "Could not instantiate custom event adapter", MobileAds.ERROR_DOMAIN);

    /* renamed from: a  reason: collision with root package name */
    private View f14934a;

    /* renamed from: b  reason: collision with root package name */
    CustomEventBanner f14935b;

    /* renamed from: c  reason: collision with root package name */
    CustomEventInterstitial f14936c;

    /* renamed from: d  reason: collision with root package name */
    CustomEventNative f14937d;

    private static Object a(Class cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            String message = th.getMessage();
            zzbza.zzj("Could not instantiate custom event adapter: " + str + ". " + message);
            return null;
        }
    }

    public View getBannerView() {
        return this.f14934a;
    }

    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f14935b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f14936c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f14937d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public void onPause() {
        CustomEventBanner customEventBanner = this.f14935b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f14936c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f14937d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public void onResume() {
        CustomEventBanner customEventBanner = this.f14935b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f14936c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f14937d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public void requestBannerAd(Context context, k kVar, Bundle bundle, h hVar, e eVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f14935b = customEventBanner;
        if (customEventBanner == null) {
            kVar.onAdFailedToLoad(this, f14933e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventBanner customEventBanner2 = this.f14935b;
        Objects.requireNonNull(customEventBanner2);
        Context context2 = context;
        customEventBanner2.requestBannerAd(context2, new a(this, kVar), bundle.getString("parameter"), hVar, eVar, bundle3);
    }

    public void requestInterstitialAd(Context context, p pVar, Bundle bundle, e eVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f14936c = customEventInterstitial;
        if (customEventInterstitial == null) {
            pVar.onAdFailedToLoad((MediationInterstitialAdapter) this, f14933e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventInterstitial customEventInterstitial2 = this.f14936c;
        Objects.requireNonNull(customEventInterstitial2);
        Context context2 = context;
        customEventInterstitial2.requestInterstitialAd(context2, new b(this, this, pVar), bundle.getString("parameter"), eVar, bundle3);
    }

    public void requestNativeAd(Context context, r rVar, Bundle bundle, u uVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.f14937d = customEventNative;
        if (customEventNative == null) {
            rVar.onAdFailedToLoad(this, f14933e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventNative customEventNative2 = this.f14937d;
        Objects.requireNonNull(customEventNative2);
        Context context2 = context;
        customEventNative2.requestNativeAd(context2, new c(this, rVar), bundle.getString("parameter"), uVar, bundle3);
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f14936c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
