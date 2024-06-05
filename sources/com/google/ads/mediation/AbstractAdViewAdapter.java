package com.google.ads.mediation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbyt;
import java.util.Date;
import java.util.Set;
import n4.f;
import n4.g;
import n4.h;
import n4.j;
import u4.a;
import v4.e;
import v4.k;
import v4.p;
import v4.r;
import v4.u;
import v4.w;
import v4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, w, y {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private f adLoader;
    protected j mAdView;
    protected a mInterstitialAd;

    /* access modifiers changed from: package-private */
    public g buildAdRequest(Context context, e eVar, Bundle bundle, Bundle bundle2) {
        g.a aVar = new g.a();
        Date birthday = eVar.getBirthday();
        if (birthday != null) {
            aVar.j(birthday);
        }
        int gender = eVar.getGender();
        if (gender != 0) {
            aVar.k(gender);
        }
        Set<String> keywords = eVar.getKeywords();
        if (keywords != null) {
            for (String a10 : keywords) {
                aVar.a(a10);
            }
        }
        if (eVar.isTesting()) {
            x.b();
            aVar.i(zzbyt.zzz(context));
        }
        if (eVar.taggedForChildDirectedTreatment() != -1) {
            boolean z10 = true;
            if (eVar.taggedForChildDirectedTreatment() != 1) {
                z10 = false;
            }
            aVar.m(z10);
        }
        aVar.l(eVar.isDesignedForFamilies());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.c();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.mAdView;
    }

    /* access modifiers changed from: package-private */
    public a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public s2 getVideoController() {
        j jVar = this.mAdView;
        if (jVar != null) {
            return jVar.e().b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public f.a newAdLoader(Context context, String str) {
        return new f.a(context, str);
    }

    public void onDestroy() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z10) {
        a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z10);
        }
    }

    public void onPause() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void onResume() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void requestBannerAd(Context context, k kVar, Bundle bundle, h hVar, e eVar, Bundle bundle2) {
        j jVar = new j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new h(hVar.j(), hVar.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, kVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, p pVar, Bundle bundle, e eVar, Bundle bundle2) {
        a.load(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new c(this, pVar));
    }

    public void requestNativeAd(Context context, r rVar, Bundle bundle, u uVar, Bundle bundle2) {
        e eVar = new e(this, rVar);
        f.a e10 = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).e(eVar);
        e10.g(uVar.getNativeAdOptions());
        e10.f(uVar.getNativeAdRequestOptions());
        if (uVar.isUnifiedNativeAdRequested()) {
            e10.d(eVar);
        }
        if (uVar.zzb()) {
            for (String str : uVar.zza().keySet()) {
                e10.b(str, eVar, true != ((Boolean) uVar.zza().get(str)).booleanValue() ? null : eVar);
            }
        }
        f a10 = e10.a();
        this.adLoader = a10;
        a10.a(buildAdRequest(context, uVar, bundle2, bundle));
    }

    public void showInterstitial() {
        a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show((Activity) null);
        }
    }
}
