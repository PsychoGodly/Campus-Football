package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.ke;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sm;
import com.applovin.impl.wj;
import com.applovin.impl.xl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Handler f9662a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f9663b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final t f9664c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9665d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ke f9666e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final String f9667f;

    /* renamed from: g  reason: collision with root package name */
    private MaxAdapter f9668g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f9669h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public be f9670i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public View f9671j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public MaxNativeAd f9672k;

    /* renamed from: l  reason: collision with root package name */
    private MaxNativeAdView f9673l;

    /* renamed from: m  reason: collision with root package name */
    private ViewGroup f9674m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final c f9675n = new c(this, (a) null);

    /* renamed from: o  reason: collision with root package name */
    private MaxAdapterResponseParameters f9676o;

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f9677p = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f9678q = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final AtomicBoolean f9679r = new AtomicBoolean(false);

    /* renamed from: s  reason: collision with root package name */
    private final boolean f9680s;

    class a implements MaxSignalCollectionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f9681a;

        a(e eVar) {
            this.f9681a = eVar;
        }

        public void onSignalCollected(String str) {
            g.this.a(str, this.f9681a);
        }

        public void onSignalCollectionFailed(String str) {
            g.this.a((MaxError) new MaxErrorImpl(str), this.f9681a);
        }
    }

    public interface b {
        void a(MaxError maxError);

        void onSignalCollected(String str);
    }

    private class c implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public MediationServiceImpl.b f9683a;

        private c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(de deVar, MaxReward maxReward, Bundle bundle) {
            this.f9683a.a((MaxAd) deVar, maxReward, bundle);
        }

        private void b(String str, Bundle bundle) {
            if (g.this.f9670i.v().compareAndSet(false, true)) {
                a(str, (MaxAdListener) this.f9683a, (Runnable) new k0(this, bundle));
            }
        }

        private void c(String str, Bundle bundle) {
            if (g.this.f9670i.v().get()) {
                t unused = g.this.f9664c;
                if (t.a()) {
                    t d10 = g.this.f9664c;
                    d10.b("MediationAdapterWrapper", g.this.f9667f + ": blocking ad loaded callback for " + g.this.f9670i + " since onAdHidden() has been called");
                }
                g.this.f9663b.o().a(g.this.f9670i, str);
                return;
            }
            g.this.f9679r.set(true);
            a(str, (MaxAdListener) this.f9683a, (Runnable) new y0(this, bundle));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f9683a.a((MaxAd) g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e() {
            this.f9683a.onRewardedVideoStarted(g.this.f9670i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f9683a.a((MaxAd) g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f9683a.a((MaxAd) g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f9683a.c(g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f9683a.e(g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (g.this.f9678q.compareAndSet(false, true)) {
                this.f9683a.f(g.this.f9670i, bundle);
            }
        }

        public void onAdViewAdClicked() {
            onAdViewAdClicked((Bundle) null);
        }

        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed((Bundle) null);
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, (Bundle) null);
        }

        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed((Bundle) null);
        }

        public void onAdViewAdExpanded() {
            onAdViewAdExpanded((Bundle) null);
        }

        public void onAdViewAdHidden() {
            onAdViewAdHidden((Bundle) null);
        }

        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, (Bundle) null);
        }

        public void onAppOpenAdClicked() {
            onAppOpenAdClicked((Bundle) null);
        }

        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, (Bundle) null);
        }

        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed((Bundle) null);
        }

        public void onAppOpenAdHidden() {
            onAppOpenAdHidden((Bundle) null);
        }

        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded((Bundle) null);
        }

        public void onInterstitialAdClicked() {
            onInterstitialAdClicked((Bundle) null);
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, (Bundle) null);
        }

        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed((Bundle) null);
        }

        public void onInterstitialAdHidden() {
            onInterstitialAdHidden((Bundle) null);
        }

        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded((Bundle) null);
        }

        public void onNativeAdClicked() {
            onNativeAdClicked((Bundle) null);
        }

        public void onNativeAdDisplayed(Bundle bundle) {
            if (!g.this.f9670i.X()) {
                t unused = g.this.f9664c;
                if (t.a()) {
                    t d10 = g.this.f9664c;
                    d10.d("MediationAdapterWrapper", g.this.f9667f + ": native ad displayed with extra info: " + bundle);
                }
                a("onNativeAdDisplayed", bundle);
            }
        }

        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": native ad loaded with extra info: " + bundle);
            }
            MaxNativeAd unused2 = g.this.f9672k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        public void onRewardedAdClicked() {
            onRewardedAdClicked((Bundle) null);
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, (Bundle) null);
        }

        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed((Bundle) null);
        }

        public void onRewardedAdHidden() {
            onRewardedAdHidden((Bundle) null);
        }

        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdLoaded() {
            onRewardedAdLoaded((Bundle) null);
        }

        public void onRewardedAdVideoCompleted() {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", (MaxAdListener) this.f9683a, (Runnable) new t0(this));
        }

        public void onRewardedAdVideoStarted() {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", (MaxAdListener) this.f9683a, (Runnable) new s0(this));
        }

        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked((Bundle) null);
        }

        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedInterstitialAdDisplayFailed(maxAdapterError, (Bundle) null);
        }

        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed((Bundle) null);
        }

        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden((Bundle) null);
        }

        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded((Bundle) null);
        }

        public void onRewardedInterstitialAdVideoCompleted() {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", (MaxAdListener) this.f9683a, (Runnable) new r0(this));
        }

        public void onRewardedInterstitialAdVideoStarted() {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", (MaxAdListener) this.f9683a, (Runnable) new u0(this));
        }

        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, (Bundle) null);
        }

        /* synthetic */ c(g gVar, a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d() {
            this.f9683a.onRewardedVideoCompleted(g.this.f9670i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f9683a.a((MaxAd) g.this.f9670i, bundle);
        }

        public void onAdViewAdClicked(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", (MaxAdListener) this.f9683a, (Runnable) new v0(this, bundle));
        }

        public void onAdViewAdCollapsed(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", (MaxAdListener) this.f9683a, (Runnable) new h0(this));
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", (MaxError) maxAdapterError, bundle);
        }

        public void onAdViewAdDisplayed(Bundle bundle) {
            if (!g.this.f9670i.X()) {
                t unused = g.this.f9664c;
                if (t.a()) {
                    t d10 = g.this.f9664c;
                    d10.d("MediationAdapterWrapper", g.this.f9667f + ": adview ad displayed with extra info: " + bundle);
                }
                a("onAdViewAdDisplayed", bundle);
            }
        }

        public void onAdViewAdExpanded(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", (MaxAdListener) this.f9683a, (Runnable) new z0(this, bundle));
        }

        public void onAdViewAdHidden(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        public void onAdViewAdLoaded(View view, Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": adview ad loaded with extra info: " + bundle);
            }
            View unused2 = g.this.f9671j = view;
            c("onAdViewAdLoaded", bundle);
        }

        public void onAppOpenAdClicked(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", (MaxAdListener) this.f9683a, (Runnable) new m0(this, bundle));
        }

        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", (MaxError) maxAdapterError, bundle);
        }

        public void onAppOpenAdDisplayed(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        public void onAppOpenAdHidden(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        public void onAppOpenAdLoaded(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        public void onInterstitialAdClicked(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", (MaxAdListener) this.f9683a, (Runnable) new l0(this, bundle));
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", (MaxError) maxAdapterError, bundle);
        }

        public void onInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        public void onInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        public void onInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        public void onNativeAdClicked(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": native ad clicked");
            }
            a("onNativeAdClicked", (MaxAdListener) this.f9683a, (Runnable) new i0(this, bundle));
        }

        public void onRewardedAdClicked(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", (MaxAdListener) this.f9683a, (Runnable) new x0(this, bundle));
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", (MaxError) maxAdapterError, bundle);
        }

        public void onRewardedAdDisplayed(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        public void onRewardedAdHidden(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        public void onRewardedAdLoaded(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        public void onRewardedInterstitialAdClicked(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdClicked", (MaxAdListener) this.f9683a, (Runnable) new j0(this, bundle));
        }

        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.k("MediationAdapterWrapper", g.this.f9667f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", (MaxError) maxAdapterError, bundle);
        }

        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdDisplayed", bundle);
        }

        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            b("onRewardedInterstitialAdHidden", bundle);
        }

        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.f9664c;
            if (t.a()) {
                t d10 = g.this.f9664c;
                d10.d("MediationAdapterWrapper", g.this.f9667f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            c("onRewardedInterstitialAdLoaded", bundle);
        }

        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (g.this.f9670i instanceof de) {
                de deVar = (de) g.this.f9670i;
                if (deVar.m0().compareAndSet(false, true)) {
                    t unused = g.this.f9664c;
                    if (t.a()) {
                        t d10 = g.this.f9664c;
                        d10.d("MediationAdapterWrapper", g.this.f9667f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", (MaxAdListener) this.f9683a, (Runnable) new n0(this, deVar, maxReward, bundle));
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            this.f9683a.onRewardedVideoCompleted(g.this.f9670i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f9683a.d(g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f9683a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f9683a.onRewardedVideoStarted(g.this.f9670i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f9683a.a((MaxAd) g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public void a(String str, MaxError maxError) {
            if (g.this.f9670i.v().get()) {
                t unused = g.this.f9664c;
                if (t.a()) {
                    t d10 = g.this.f9664c;
                    d10.b("MediationAdapterWrapper", g.this.f9667f + ": blocking ad load failed callback for " + g.this.f9670i + " since onAdHidden() has been called");
                }
                g.this.f9663b.o().a(g.this.f9670i, str);
                return;
            }
            a(str, (MaxAdListener) this.f9683a, (Runnable) new o0(this, maxError));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (g.this.f9678q.compareAndSet(false, true)) {
                this.f9683a.onAdLoadFailed(g.this.f9669h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (g.this.f9670i.v().get()) {
                t unused = g.this.f9664c;
                if (t.a()) {
                    t d10 = g.this.f9664c;
                    d10.b("MediationAdapterWrapper", g.this.f9667f + ": blocking ad displayed callback for " + g.this.f9670i + " since onAdHidden() has been called");
                }
                g.this.f9663b.o().a(g.this.f9670i, str);
            } else if (g.this.f9670i.t().compareAndSet(false, true)) {
                a(str, (MaxAdListener) this.f9683a, (Runnable) new w0(this, bundle));
            }
        }

        /* access modifiers changed from: private */
        public void a(String str, MaxError maxError, Bundle bundle) {
            if (g.this.f9670i.v().get()) {
                t unused = g.this.f9664c;
                if (t.a()) {
                    t d10 = g.this.f9664c;
                    d10.b("MediationAdapterWrapper", g.this.f9667f + ": blocking ad display failed callback for " + g.this.f9670i + " since onAdHidden() has been called");
                }
                g.this.f9663b.o().a(g.this.f9670i, str);
                return;
            }
            a(str, (MaxAdListener) this.f9683a, (Runnable) new p0(this, maxError, bundle));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f9683a.a((MaxAd) g.this.f9670i, maxError, bundle);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f9683a.a((MaxAd) g.this.f9670i, bundle);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f9683a.onAdCollapsed(g.this.f9670i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            g.this.f9662a.post(new q0(this, runnable, maxAdListener, str));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                t.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, th);
                g.this.f9663b.B().a("MediationAdapterWrapper", str, th, (Map) CollectionUtils.hashMap("adapter_class", g.this.f9666e.b()));
            }
        }
    }

    private static class d implements MaxAdapter.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        private final k f9685a;

        /* renamed from: b  reason: collision with root package name */
        private final ke f9686b;

        /* renamed from: c  reason: collision with root package name */
        private final long f9687c;

        /* renamed from: d  reason: collision with root package name */
        private final Runnable f9688d;

        public d(k kVar, ke keVar, long j10, Runnable runnable) {
            this.f9685a = kVar;
            this.f9686b = keVar;
            this.f9687c = j10;
            this.f9688d = runnable;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f9685a.N().a(this.f9686b, SystemClock.elapsedRealtime() - this.f9687c, initializationStatus, str);
            Runnable runnable = this.f9688d;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new a1(this, initializationStatus, str), this.f9686b.h());
        }
    }

    private static class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final wj f9689a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final b f9690b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final AtomicBoolean f9691c = new AtomicBoolean();

        e(wj wjVar, b bVar) {
            this.f9689a = wjVar;
            this.f9690b = bVar;
        }
    }

    private class f extends xl {

        /* renamed from: h  reason: collision with root package name */
        private final WeakReference f9692h;

        /* synthetic */ f(g gVar, a aVar) {
            this();
        }

        private void b(be beVar) {
            if (beVar != null) {
                this.f13421a.U().a(beVar);
            }
        }

        public void run() {
            if (g.this.f9678q.get()) {
                return;
            }
            if (g.this.f9670i.Y()) {
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str = this.f13422b;
                    tVar.a(str, g.this.f9667f + " is timing out, considering JS Tag ad loaded: " + g.this.f9670i);
                }
                b(g.this.f9670i);
                return;
            }
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str2 = this.f13422b;
                tVar2.b(str2, g.this.f9667f + " is timing out " + g.this.f9670i + "...");
            }
            b(g.this.f9670i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            c cVar = (c) this.f9692h.get();
            if (cVar != null) {
                cVar.a(this.f13422b, (MaxError) maxErrorImpl);
            }
        }

        private f() {
            super("TaskTimeoutMediatedAd", g.this.f9663b);
            this.f9692h = new WeakReference(g.this.f9675n);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$g  reason: collision with other inner class name */
    private class C0129g extends xl {

        /* renamed from: h  reason: collision with root package name */
        private final e f9694h;

        /* synthetic */ C0129g(g gVar, e eVar, a aVar) {
            this(eVar);
        }

        public void run() {
            if (!this.f9694h.f9691c.get()) {
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str = this.f13422b;
                    tVar.b(str, g.this.f9667f + " is timing out " + this.f9694h.f9689a + "...");
                }
                g gVar = g.this;
                gVar.a((MaxError) new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + g.this.f9667f + ") timed out"), this.f9694h);
            }
        }

        private C0129g(e eVar) {
            super("TaskTimeoutSignalCollection", g.this.f9663b);
            this.f9694h = eVar;
        }
    }

    g(ke keVar, MaxAdapter maxAdapter, boolean z10, k kVar) {
        if (keVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        } else if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        } else if (kVar != null) {
            this.f9665d = keVar.c();
            this.f9668g = maxAdapter;
            this.f9663b = kVar;
            this.f9664c = kVar.L();
            this.f9666e = keVar;
            this.f9667f = maxAdapter.getClass().getSimpleName();
            this.f9680s = z10;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        this.f9668g.onDestroy();
        this.f9668g = null;
        this.f9671j = null;
        this.f9672k = null;
        this.f9673l = null;
        this.f9674m = null;
    }

    /* access modifiers changed from: package-private */
    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, wj wjVar, Activity activity, b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (!this.f9677p.get()) {
            t.h("MediationAdapterWrapper", "Mediation adapter '" + this.f9667f + "' is disabled. Signal collection ads with this adapter is disabled.");
            bVar.a(new MaxErrorImpl("The adapter (" + this.f9667f + ") is disabled"));
        } else {
            e eVar = new e(wjVar, bVar);
            MaxAdapter maxAdapter = this.f9668g;
            if (maxAdapter instanceof MaxSignalProvider) {
                b("collect_signal", (Runnable) new g0(this, wjVar, eVar, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity));
                return;
            }
            a((MaxError) new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f9667f + ") does not support signal collection"), eVar);
        }
    }

    public void c(be beVar, Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.X()) {
                runnable = new e0(this, beVar, activity);
            } else if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new z(this, activity);
            } else if (beVar.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new b0(this, activity);
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new y(this, activity);
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new a0(this, activity);
            } else {
                throw new IllegalStateException("Failed to show " + beVar + ": " + beVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, beVar);
        }
    }

    public boolean k() {
        return this.f9677p.get();
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f9667f + "'" + '}';
    }

    private boolean b(be beVar, Activity activity) {
        if (beVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (beVar.z() == null) {
            t.h("MediationAdapterWrapper", "Adapter has been garbage collected");
            this.f9675n.a("ad_show", (MaxError) new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
            return false;
        } else if (beVar.z() != this) {
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        } else if (activity == null && MaxAdFormat.APP_OPEN != beVar.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        } else if (!this.f9677p.get()) {
            String str = "Mediation adapter '" + this.f9667f + "' is disabled. Showing ads with this adapter is disabled.";
            t.h("MediationAdapterWrapper", str);
            this.f9675n.a("ad_show", (MaxError) new MaxErrorImpl(-1, str), (Bundle) null);
            return false;
        } else if (j()) {
            return true;
        } else {
            throw new IllegalStateException("Mediation adapter '" + this.f9667f + "' does not have an ad loaded. Please load an ad first");
        }
    }

    public View d() {
        return this.f9671j;
    }

    public MaxNativeAd e() {
        return this.f9672k;
    }

    public MaxNativeAdView f() {
        return this.f9673l;
    }

    public String g() {
        return this.f9665d;
    }

    public ViewGroup h() {
        return this.f9674m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f9668g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f9665d, th);
            this.f9663b.B().a("MediationAdapterWrapper", "sdk_version", th, (Map) CollectionUtils.hashMap("adapter_class", this.f9666e.b()));
            a("sdk_version");
            this.f9663b.O().a(this.f9666e.b(), "sdk_version", this.f9670i);
            return null;
        }
    }

    public boolean j() {
        return this.f9678q.get() && this.f9679r.get();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f9668g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f9668g).loadNativeAd(maxAdapterResponseParameters, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Activity activity) {
        ((MaxInterstitialAdapter) this.f9668g).showInterstitialAd(this.f9676o, activity, this.f9675n);
    }

    private void a(Runnable runnable, be beVar) {
        a("show_ad", beVar.getFormat(), (Runnable) new v(this, runnable));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wj wjVar, e eVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity) {
        a((ke) wjVar, eVar);
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(eVar));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f9665d + " due to: " + th);
            t.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            a((MaxError) maxErrorImpl, eVar);
            this.f9663b.B().a("MediationAdapterWrapper", "collect_signal", th, (Map) CollectionUtils.hashMap("adapter_class", this.f9666e.b()));
            a("collect_signal");
            this.f9663b.O().a(this.f9666e.b(), "collect_signal", this.f9670i);
        }
        if (!eVar.f9691c.get() && wjVar.m() == 0) {
            if (t.a()) {
                t tVar = this.f9664c;
                tVar.a("MediationAdapterWrapper", "Failing signal collection " + wjVar + " since it has 0 timeout");
            }
            a((MaxError) new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f9667f + ") has 0 timeout"), eVar);
        }
    }

    public MediationServiceImpl.b c() {
        return this.f9675n.f9683a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f9668g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f9668g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f9668g).showRewardedInterstitialAd(this.f9676o, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxRewardedAdapter) this.f9668g).showRewardedAd(this.f9676o, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, i iVar, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f9668g).showRewardedAd(this.f9676o, viewGroup, iVar, activity, this.f9675n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f9668g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f9665d, th);
            this.f9663b.B().a("MediationAdapterWrapper", "adapter_version", th, (Map) CollectionUtils.hashMap("adapter_class", this.f9666e.b()));
            a("adapter_version");
            this.f9663b.O().a(this.f9666e.b(), "adapter_version", this.f9670i);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(be beVar, Runnable runnable) {
        a(this.f9666e, beVar);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f9665d + " due to: " + th;
            t.h("MediationAdapterWrapper", str);
            this.f9675n.a("load_ad", (MaxError) new MaxErrorImpl(-1, str));
            this.f9663b.B().a("MediationAdapterWrapper", "load_ad", th, (Map) CollectionUtils.hashMap("adapter_class", this.f9666e.b()));
            a("load_ad");
            this.f9663b.O().a(this.f9666e.b(), "load_ad", this.f9670i);
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(be beVar, Activity activity) {
        this.f9663b.G().a((de) beVar, activity, this.f9675n);
    }

    public void a(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, be beVar, Activity activity, MediationServiceImpl.b bVar) {
        Runnable runnable;
        if (beVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (!this.f9677p.get()) {
            String str2 = "Mediation adapter '" + this.f9667f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            t.h("MediationAdapterWrapper", str2);
            bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
        } else {
            this.f9676o = maxAdapterResponseParameters;
            this.f9675n.a(bVar);
            MaxAdFormat H = beVar.X() ? beVar.H() : beVar.getFormat();
            if (H == MaxAdFormat.INTERSTITIAL) {
                runnable = new t(this, maxAdapterResponseParameters, activity);
            } else if (H == MaxAdFormat.APP_OPEN) {
                runnable = new q(this, maxAdapterResponseParameters, activity);
            } else if (H == MaxAdFormat.REWARDED) {
                runnable = new r(this, maxAdapterResponseParameters, activity);
            } else if (H == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new p(this, maxAdapterResponseParameters, activity);
            } else if (H == MaxAdFormat.NATIVE) {
                runnable = new s(this, maxAdapterResponseParameters, activity);
            } else if (H.isAdViewAd()) {
                runnable = new u(this, maxAdapterResponseParameters, H, activity);
            } else {
                throw new IllegalStateException("Failed to load " + beVar + ": " + beVar.getFormat() + " (" + beVar.H() + ") is not a supported ad format");
            }
            a("load_ad", H, (Runnable) new f0(this, beVar, runnable));
        }
    }

    private void a(ke keVar, be beVar) {
        a((xl) new f(this, (a) null), keVar, beVar);
    }

    private void a(ke keVar, e eVar) {
        a((xl) new C0129g(this, eVar, (a) null), keVar, (be) null);
    }

    private void a(xl xlVar, ke keVar, be beVar) {
        long m10 = keVar.m();
        if (m10 > 0) {
            if (t.a()) {
                t tVar = this.f9664c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting timeout ");
                sb2.append(m10);
                sb2.append("ms for ");
                if (beVar != null) {
                    keVar = beVar;
                }
                sb2.append(keVar);
                tVar.a("MediationAdapterWrapper", sb2.toString());
            }
            this.f9663b.l0().a(xlVar, sm.b.TIMEOUT, m10);
        } else if (t.a()) {
            t tVar2 = this.f9664c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Non-positive timeout set for ");
            if (beVar != null) {
                keVar = beVar;
            }
            sb3.append(keVar);
            sb3.append(", not scheduling a timeout");
            tVar2.a("MediationAdapterWrapper", sb3.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, be beVar) {
        this.f9669h = str;
        this.f9670i = beVar;
    }

    public void a(be beVar, ViewGroup viewGroup, i iVar, Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new c0(this, viewGroup, iVar, activity);
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new d0(this, viewGroup, iVar, activity);
            } else {
                throw new IllegalStateException("Failed to show " + beVar + ": " + beVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, beVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
        b(MobileAdsBridgeBase.initializeMethodName, (Runnable) new w(this, runnable, maxAdapterInitializationParameters, activity));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (t.a()) {
            t tVar = this.f9664c;
            tVar.a("MediationAdapterWrapper", "Initializing " + this.f9667f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f9666e.r());
        }
        this.f9668g.initialize(maxAdapterInitializationParameters, activity, new d(this.f9663b, this.f9666e, elapsedRealtime, runnable));
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f9673l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f9674m = viewGroup;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f9668g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f9668g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxAppOpenAdapter) this.f9668g).showAppOpenAd(this.f9676o, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, i iVar, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f9668g).showInterstitialAd(this.f9676o, viewGroup, iVar, activity, this.f9675n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f9665d + " due to: " + th;
            t.h("MediationAdapterWrapper", str);
            this.f9675n.a("show_ad", (MaxError) new MaxErrorImpl(-1, str), (Bundle) null);
            this.f9663b.B().a("MediationAdapterWrapper", "show_ad", th, (Map) CollectionUtils.hashMap("adapter_class", this.f9666e.b()));
            a("show_ad");
            this.f9663b.O().a(this.f9666e.b(), "show_ad", this.f9670i);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f9680s) {
            b("destroy", (Runnable) new o(this));
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, e eVar) {
        if (eVar.f9691c.compareAndSet(false, true) && eVar.f9690b != null) {
            eVar.f9690b.onSignalCollected(str);
        }
    }

    /* access modifiers changed from: private */
    public void a(MaxError maxError, e eVar) {
        if (eVar.f9691c.compareAndSet(false, true) && eVar.f9690b != null) {
            eVar.f9690b.a(maxError);
        }
    }

    private void a(String str) {
        if (t.a()) {
            t tVar = this.f9664c;
            tVar.d("MediationAdapterWrapper", "Marking " + this.f9667f + " as disabled due to: " + str);
        }
        this.f9677p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        x xVar = new x(this, str, runnable);
        if (a(str, maxAdFormat)) {
            this.f9662a.post(xVar);
        } else if (((Boolean) this.f9663b.a(oj.f10258a0)).booleanValue()) {
            this.f9663b.l0().a((xl) new kn(this.f9663b, true, str + ":" + this.f9666e.c(), xVar), this.f9666e);
        } else {
            xVar.run();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (t.a()) {
                t tVar = this.f9664c;
                tVar.a("MediationAdapterWrapper", this.f9667f + ": running " + str + "...");
            }
            runnable.run();
            if (t.a()) {
                t tVar2 = this.f9664c;
                tVar2.a("MediationAdapterWrapper", this.f9667f + ": finished " + str + MaxReward.DEFAULT_LABEL);
            }
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.f9665d, th);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fail_");
            sb2.append(str);
            a(sb2.toString());
            if (!str.equals("destroy")) {
                this.f9663b.O().a(this.f9666e.b(), str, this.f9670i);
                HashMap<String, String> hashMap = CollectionUtils.hashMap("is_wrapper", "true");
                CollectionUtils.putStringIfValid("adapter_class", this.f9666e.b(), hashMap);
                this.f9663b.B().a("MediationAdapterWrapper", str, th, (Map) hashMap);
            }
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean shouldShowAdsOnUiThread;
        MaxAdapter maxAdapter = this.f9668g;
        if (maxAdapter == null) {
            return this.f9666e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean shouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (shouldInitializeOnUiThread != null) {
                return shouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean shouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (shouldCollectSignalsOnUiThread != null) {
                return shouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            Boolean shouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (shouldLoadAdsOnUiThread != null) {
                return shouldLoadAdsOnUiThread.booleanValue();
            }
        } else if (!(!"show_ad".equals(str) || maxAdFormat == null || (shouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat)) == null)) {
            return shouldShowAdsOnUiThread.booleanValue();
        }
        return this.f9666e.r();
    }
}
