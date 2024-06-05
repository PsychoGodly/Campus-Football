package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.fe;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.ne;
import com.applovin.impl.o0;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class a extends ne implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, o0.a {
    private Map A;

    /* renamed from: a  reason: collision with root package name */
    private fe f9607a;

    /* renamed from: b  reason: collision with root package name */
    private k f9608b;

    /* renamed from: c  reason: collision with root package name */
    private MaxAdView f9609c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdView f9610d;

    /* renamed from: f  reason: collision with root package name */
    private MaxInterstitialAd f9611f;

    /* renamed from: g  reason: collision with root package name */
    private MaxAppOpenAd f9612g;

    /* renamed from: h  reason: collision with root package name */
    private MaxRewardedInterstitialAd f9613h;

    /* renamed from: i  reason: collision with root package name */
    private MaxRewardedAd f9614i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public MaxAd f9615j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public MaxNativeAdLoader f9616k;

    /* renamed from: l  reason: collision with root package name */
    private List f9617l;

    /* renamed from: m  reason: collision with root package name */
    private String f9618m;

    /* renamed from: n  reason: collision with root package name */
    private AdControlButton f9619n;

    /* renamed from: o  reason: collision with root package name */
    private AdControlButton f9620o;

    /* renamed from: p  reason: collision with root package name */
    private AdControlButton f9621p;

    /* renamed from: q  reason: collision with root package name */
    private AdControlButton f9622q;

    /* renamed from: r  reason: collision with root package name */
    private AdControlButton f9623r;

    /* renamed from: s  reason: collision with root package name */
    private AdControlButton f9624s;

    /* renamed from: t  reason: collision with root package name */
    private AdControlButton f9625t;

    /* renamed from: u  reason: collision with root package name */
    private Button f9626u;

    /* renamed from: v  reason: collision with root package name */
    private Button f9627v;

    /* renamed from: w  reason: collision with root package name */
    private FrameLayout f9628w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public FrameLayout f9629x;

    /* renamed from: y  reason: collision with root package name */
    private Switch f9630y;

    /* renamed from: z  reason: collision with root package name */
    private Switch f9631z;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a  reason: collision with other inner class name */
    class C0128a extends MaxNativeAdListener {
        C0128a() {
        }

        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f9615j != null) {
                a.this.f9616k.destroy(a.this.f9615j);
            }
            MaxAd unused = a.this.f9615j = maxAd;
            a.this.f9629x.removeAllViews();
            a.this.f9629x.addView(maxNativeAdView);
            a.this.onAdLoaded(maxAd);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f9610d.removeAllViews();
        this.f9620o.setControlState(AdControlButton.b.LOAD);
    }

    private void e() {
        List r10 = this.f9607a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (r10.contains(maxAdFormat)) {
            String str = "test_mode_rewarded_" + this.f9607a.m();
            this.f9618m = str;
            MaxRewardedAd instance = MaxRewardedAd.getInstance(str, this.f9608b.v0(), this);
            this.f9614i = instance;
            instance.setExtraParameter("disable_auto_retries", "true");
            this.f9614i.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.f9624s = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9624s.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f9608b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.f9607a.w() == null || !this.f9607a.w().containsKey(maxAdFormat)) {
            return this.f9607a.m();
        }
        return (String) this.f9607a.w().get(maxAdFormat);
    }

    public void initialize(fe feVar) {
        this.f9607a = feVar;
        this.f9608b = feVar.o();
    }

    public void onAdClicked(MaxAd maxAd) {
        zp.a("onAdClicked", maxAd, (Context) this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        zp.a("onAdCollapsed", maxAd, (Context) this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
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

    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a10 = a(str);
        a10.setControlState(AdControlButton.b.LOAD);
        zp.a(maxError, a10.getFormat().getLabel(), (Context) this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton a10 = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a10.setControlState(AdControlButton.b.LOAD);
        } else {
            a10.setControlState(AdControlButton.b.SHOW);
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9609c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f9610d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9611f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9612g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9613h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9614i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9616k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        zp.a("onAdRevenuePaid", maxAd, (Context) this);
    }

    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map map = this.A;
            if (map == null || map.get(format) == null) {
                a(format);
            } else {
                ((o0) this.A.get(format)).a();
            }
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(format);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9607a == null) {
            t.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f9607a.g() + " Test Ads");
        this.f9617l = this.f9608b.n0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f9626u = (Button) findViewById(R.id.show_mrec_button);
        this.f9627v = (Button) findViewById(R.id.show_native_button);
        if (!this.f9607a.G() || !this.f9607a.r().contains(MaxAdFormat.MREC)) {
            this.f9626u.setVisibility(8);
            this.f9627v.setVisibility(8);
        } else {
            this.f9629x.setVisibility(8);
            this.f9626u.setBackgroundColor(-1);
            this.f9627v.setBackgroundColor(-3355444);
            this.f9626u.setOnClickListener(new c(this));
            this.f9627v.setOnClickListener(new d(this));
        }
        this.f9630y = (Switch) findViewById(R.id.native_banner_switch);
        this.f9631z = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f9607a.H()) {
            this.f9630y.setOnClickListener(new b(this));
            this.f9631z.setOnClickListener(new e(this));
        } else {
            this.f9630y.setVisibility(8);
            this.f9631z.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f9607a.e()) && this.f9607a.d() != null && this.f9607a.d().size() > 0) {
            AdRegistration.getInstance(this.f9607a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f9607a.d().size());
            for (MaxAdFormat maxAdFormat : this.f9607a.d().keySet()) {
                hashMap.put(maxAdFormat, new o0((p0) this.f9607a.d().get(maxAdFormat), maxAdFormat, (o0.a) this));
            }
            this.A = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            t.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f9608b.n0().a(this.f9617l);
        MaxAdView maxAdView = this.f9609c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f9610d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f9611f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f9614i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f9616k;
        if (maxNativeAdLoader != null && (maxAd = this.f9615j) != null) {
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

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f9629x.setVisibility(0);
        this.f9628w.setVisibility(8);
        this.f9627v.setBackgroundColor(-1);
        this.f9626u.setBackgroundColor(-3355444);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f9609c.removeAllViews();
        this.f9619n.setControlState(AdControlButton.b.LOAD);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f9628w.setVisibility(0);
        this.f9629x.setVisibility(8);
        this.f9626u.setBackgroundColor(-1);
        this.f9627v.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f9629x = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f9607a.G()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f9608b.v0(), this);
            this.f9616k = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f9616k.setNativeAdListener(new C0128a());
            this.f9616k.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f9625t = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9625t.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f9629x.setVisibility(8);
    }

    private void c() {
        this.f9628w = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List r10 = this.f9607a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r10.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f9608b.v0(), this);
            this.f9610d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f9610d.setExtraParameter("disable_precache", "true");
            this.f9610d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f9610d.stopAutoRefresh();
            this.f9610d.setListener(this);
            this.f9628w.addView(this.f9610d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f9620o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9620o.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f9628w.setVisibility(8);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9609c.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f9610d.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9611f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9612g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9613h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9614i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9616k.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b() {
        List r10 = this.f9607a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r10.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f9608b.v0(), this);
            this.f9611f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f9611f.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f9621p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9621p.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        String str;
        MaxAdFormat maxAdFormat;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f9607a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f9608b.v0(), this);
            this.f9609c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f9609c.setExtraParameter("disable_auto_retries", "true");
            this.f9609c.setExtraParameter("disable_precache", "true");
            this.f9609c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f9609c.stopAutoRefresh();
            this.f9609c.setListener(this);
            frameLayout.addView(this.f9609c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f9619n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9619n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9611f.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9612g.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9613h.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9614i.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = true;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f9630y.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 != maxAdFormat || !this.f9631z.isChecked()) {
            z10 = false;
        }
        if (z11 || z10) {
            this.f9608b.n0().a(this.f9607a.v());
        } else {
            this.f9608b.n0().a(getTestModeNetwork(maxAdFormat));
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9609c.loadAd();
        } else if (maxAdFormat3 == maxAdFormat) {
            this.f9610d.loadAd();
            this.f9626u.callOnClick();
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9611f.loadAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9612g.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9613h.loadAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9614i.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9616k.loadAd();
            this.f9627v.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f9619n;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f9620o;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f9621p;
        }
        if (str.equals("test_mode_app_open")) {
            return this.f9622q;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f9623r;
        }
        if (str.equals(this.f9618m)) {
            return this.f9624s;
        }
        if (str.equals("test_mode_native")) {
            return this.f9625t;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }
}
