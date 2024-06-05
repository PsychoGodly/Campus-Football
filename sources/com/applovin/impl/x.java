package com.applovin.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.y;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.List;

public abstract class x extends ne implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, o0.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public k f13192a;

    /* renamed from: b  reason: collision with root package name */
    private z f13193b;

    /* renamed from: c  reason: collision with root package name */
    private kr f13194c;

    /* renamed from: d  reason: collision with root package name */
    private y f13195d;

    /* renamed from: f  reason: collision with root package name */
    private MaxAdView f13196f;

    /* renamed from: g  reason: collision with root package name */
    private MaxInterstitialAd f13197g;

    /* renamed from: h  reason: collision with root package name */
    private MaxAppOpenAd f13198h;

    /* renamed from: i  reason: collision with root package name */
    private MaxRewardedInterstitialAd f13199i;

    /* renamed from: j  reason: collision with root package name */
    private MaxRewardedAd f13200j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public MaxNativeAdView f13201k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public MaxNativeAdLoader f13202l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public MaxAd f13203m;

    /* renamed from: n  reason: collision with root package name */
    private d0 f13204n;

    /* renamed from: o  reason: collision with root package name */
    private List f13205o;

    /* renamed from: p  reason: collision with root package name */
    private ListView f13206p;

    /* renamed from: q  reason: collision with root package name */
    private View f13207q;

    /* renamed from: r  reason: collision with root package name */
    private AdControlButton f13208r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f13209s;

    /* renamed from: t  reason: collision with root package name */
    private o0 f13210t;

    class a extends MaxNativeAdListener {
        a() {
        }

        public void onNativeAdClicked(MaxAd maxAd) {
            x.this.onAdClicked(maxAd);
        }

        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            x.this.onAdLoadFailed(str, maxError);
        }

        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (x.this.f13203m != null) {
                x.this.f13202l.destroy(x.this.f13203m);
            }
            MaxAd unused = x.this.f13203m = maxAd;
            if (maxNativeAdView != null) {
                MaxNativeAdView unused2 = x.this.f13201k = maxNativeAdView;
            } else {
                x xVar = x.this;
                k unused3 = x.this.f13192a;
                MaxNativeAdView unused4 = xVar.f13201k = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, k.k());
                x.this.f13202l.render(x.this.f13201k, maxAd);
            }
            x.this.onAdLoaded(maxAd);
        }
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f13192a;
    }

    public void initialize(z zVar, a0 a0Var, kr krVar, k kVar) {
        List a10;
        this.f13192a = kVar;
        this.f13193b = zVar;
        this.f13194c = krVar;
        this.f13205o = kVar.n0().b();
        y yVar = new y(zVar, a0Var, krVar, this);
        this.f13195d = yVar;
        yVar.a((zb.a) new k70(this, kVar, zVar, a0Var));
        b();
        if (!zVar.f().f()) {
            return;
        }
        if ((krVar == null || krVar.b().d().A()) && (a10 = kVar.P().a(zVar.c())) != null && !a10.isEmpty()) {
            this.f13210t = new o0(a10, zVar.a(), (o0.a) this);
        }
    }

    public void onAdClicked(MaxAd maxAd) {
        zp.a("onAdClicked", maxAd, (Context) this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        zp.a("onAdCollapsed", maxAd, (Context) this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f13208r.setControlState(AdControlButton.b.LOAD);
        this.f13209s.setText(MaxReward.DEFAULT_LABEL);
        zp.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), (Context) this);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        zp.a("onAdDisplayed", maxAd, (Context) this);
    }

    public void onAdExpanded(MaxAd maxAd) {
        zp.a("onAdExpanded", maxAd, (Context) this);
    }

    public void onAdHidden(MaxAd maxAd) {
        zp.a("onAdHidden", maxAd, (Context) this);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f13196f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f13197g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f13198h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f13199i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f13200j.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f13202l.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.f13209s;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f13208r.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a((ViewGroup) this.f13196f, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f13193b.a()) {
            a((ViewGroup) this.f13201k, MaxAdFormat.MREC.getSize());
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f13196f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f13197g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f13198h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f13199i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f13200j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f13202l.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        zp.a("onAdRevenuePaid", maxAd, (Context) this);
    }

    public void onClick(AdControlButton adControlButton) {
        if (this.f13192a.n0().c()) {
            zp.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", (Context) this);
        } else if (this.f13195d.j() != this.f13193b.f()) {
            zp.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", (Context) this);
        } else {
            MaxAdFormat a10 = this.f13193b.a();
            AdControlButton.b bVar = AdControlButton.b.LOAD;
            if (bVar == adControlButton.getControlState()) {
                adControlButton.setControlState(AdControlButton.b.LOADING);
                o0 o0Var = this.f13210t;
                if (o0Var != null) {
                    o0Var.a();
                } else {
                    a(a10);
                }
            } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                if (!a10.isAdViewAd() && a10 != MaxAdFormat.NATIVE) {
                    adControlButton.setControlState(bVar);
                }
                b(a10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f13195d.k());
        this.f13206p = (ListView) findViewById(R.id.listView);
        this.f13207q = findViewById(R.id.ad_presenter_view);
        this.f13208r = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f13209s = (TextView) findViewById(R.id.status_textview);
        this.f13206p.setAdapter(this.f13195d);
        this.f13209s.setText(a());
        this.f13209s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f13208r.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer((float) 10, 0.0f, (float) -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f13207q.setBackground(layerDrawable);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        if (this.f13194c != null) {
            this.f13192a.n0().a(this.f13205o);
        }
        MaxAdView maxAdView = this.f13196f;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f13197g;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f13198h;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f13199i;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f13200j;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f13202l;
        if (maxNativeAdLoader != null && (maxAd = this.f13203m) != null) {
            maxNativeAdLoader.destroy(maxAd);
        }
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        zp.a("onRewardedVideoCompleted", maxAd, (Context) this);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        zp.a("onRewardedVideoStarted", maxAd, (Context) this);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        zp.a("onUserRewarded", maxAd, (Context) this);
    }

    private void b() {
        String c10 = this.f13193b.c();
        if (this.f13193b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(c10, this.f13193b.a(), this.f13192a.v0(), this);
            this.f13196f = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f13196f.setExtraParameter("disable_auto_retries", "true");
            this.f13196f.setExtraParameter("disable_precache", "true");
            this.f13196f.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f13196f.stopAutoRefresh();
            this.f13196f.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f13193b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(c10, this.f13192a.v0(), this);
            this.f13197g = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f13197g.setListener(this);
        } else if (MaxAdFormat.APP_OPEN == this.f13193b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(c10, this.f13192a.v0());
            this.f13198h = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f13198h.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f13193b.a()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(c10, this.f13192a.v0(), this);
            this.f13199i = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f13199i.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f13193b.a()) {
            MaxRewardedAd instance = MaxRewardedAd.getInstance(c10, this.f13192a.v0(), this);
            this.f13200j = instance;
            instance.setExtraParameter("disable_auto_retries", "true");
            this.f13200j.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f13193b.a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(c10, this.f13192a.v0(), this);
            this.f13202l = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f13202l.setNativeAdListener(new a());
            this.f13202l.setRevenueListener(this);
        }
    }

    private String a() {
        if (this.f13192a.n0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        return this.f13195d.j() != this.f13193b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(k kVar, z zVar, a0 a0Var, hb hbVar, yb ybVar) {
        if (ybVar instanceof y.b) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new j70(ybVar, zVar, a0Var, kVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f13204n = null;
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f13194c != null) {
            this.f13192a.n0().a(this.f13194c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f13196f.setPlacement("[Mediation Debugger Live Ad]");
            this.f13196f.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f13193b.a()) {
            this.f13197g.loadAd();
        } else if (MaxAdFormat.APP_OPEN == this.f13193b.a()) {
            this.f13198h.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f13193b.a()) {
            this.f13199i.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f13193b.a()) {
            this.f13200j.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f13193b.a()) {
            this.f13202l.setPlacement("[Mediation Debugger Live Ad]");
            this.f13202l.loadAd();
        } else {
            zp.a("Live ads currently unavailable for ad format", (Context) this);
        }
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f13208r.setControlState(AdControlButton.b.LOAD);
        this.f13209s.setText(MaxReward.DEFAULT_LABEL);
        if (204 == maxError.getCode()) {
            zp.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", (Context) this);
            return;
        }
        zp.a(MaxReward.DEFAULT_LABEL, "Failed to load with error code: " + maxError.getCode(), (Context) this);
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f13204n == null) {
            d0 d0Var = new d0(viewGroup, size, this);
            this.f13204n = d0Var;
            d0Var.setOnDismissListener(new i70(this));
            this.f13204n.show();
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a((ViewGroup) this.f13196f, maxAdFormat.getSize());
        } else if (MaxAdFormat.INTERSTITIAL == this.f13193b.a()) {
            this.f13197g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.APP_OPEN == this.f13193b.a()) {
            this.f13198h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f13193b.a()) {
            this.f13199i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f13193b.a()) {
            this.f13200j.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f13193b.a()) {
            a((ViewGroup) this.f13201k, MaxAdFormat.MREC.getSize());
        }
    }
}
