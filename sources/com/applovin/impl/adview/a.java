package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.i;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.aa;
import com.applovin.impl.adview.k;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.ca;
import com.applovin.impl.e0;
import com.applovin.impl.g0;
import com.applovin.impl.ig;
import com.applovin.impl.kg;
import com.applovin.impl.kn;
import com.applovin.impl.lb;
import com.applovin.impl.lc;
import com.applovin.impl.oj;
import com.applovin.impl.qb;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.impl.ur;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class a implements AppLovinCommunicatorSubscriber {
    private static final AtomicReference G = new AtomicReference();
    private volatile boolean A = false;
    private volatile AppLovinAdLoadListener B;
    private volatile AppLovinAdDisplayListener C;
    /* access modifiers changed from: private */
    public volatile AppLovinAdViewEventListener D;
    private volatile AppLovinAdClickListener E;
    private volatile g0 F = null;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f6387a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f6388b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public k f6389c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdServiceImpl f6390d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public t f6391f;

    /* renamed from: g  reason: collision with root package name */
    private AppLovinCommunicator f6392g;

    /* renamed from: h  reason: collision with root package name */
    private b f6393h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Map f6394i = Collections.synchronizedMap(new HashMap());

    /* renamed from: j  reason: collision with root package name */
    private AppLovinAdSize f6395j;

    /* renamed from: k  reason: collision with root package name */
    private String f6396k;

    /* renamed from: l  reason: collision with root package name */
    private i f6397l;

    /* renamed from: m  reason: collision with root package name */
    private c f6398m;

    /* renamed from: n  reason: collision with root package name */
    private e f6399n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public b f6400o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public k f6401p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f6402q;

    /* renamed from: r  reason: collision with root package name */
    private Runnable f6403r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public volatile com.applovin.impl.sdk.ad.b f6404s = null;

    /* renamed from: t  reason: collision with root package name */
    private volatile AppLovinAd f6405t = null;

    /* renamed from: u  reason: collision with root package name */
    private f f6406u = null;

    /* renamed from: v  reason: collision with root package name */
    private f f6407v = null;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicReference f6408w = new AtomicReference();

    /* renamed from: x  reason: collision with root package name */
    private final AtomicBoolean f6409x = new AtomicBoolean();

    /* renamed from: y  reason: collision with root package name */
    private volatile boolean f6410y = false;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public volatile boolean f6411z = false;

    public interface b {
        void a(a aVar);
    }

    private class c implements Runnable {
        private c() {
        }

        public void run() {
            if (a.this.f6400o != null) {
                a.this.f6400o.setVisibility(8);
            }
        }
    }

    private class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a  reason: collision with other inner class name */
        class C0115a implements k.a {
            C0115a() {
            }

            public void a() {
                a.this.f6400o.addView(a.this.f6401p, new ViewGroup.LayoutParams(-1, -1));
            }

            public void onFailure() {
                t unused = a.this.f6391f;
                if (t.a()) {
                    a.this.f6391f.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        public void run() {
            if (a.this.f6404s == null) {
                return;
            }
            if (a.this.f6400o != null) {
                a.this.w();
                t unused = a.this.f6391f;
                if (t.a()) {
                    t h10 = a.this.f6391f;
                    h10.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f6404s.getAdIdNumber() + "...");
                }
                a.b(a.this.f6400o, a.this.f6404s.getSize());
                if (a.this.f6401p != null) {
                    ar.c(a.this.f6401p);
                    k unused2 = a.this.f6401p = null;
                }
                ca caVar = new ca(a.this.f6394i, a.this.f6389c);
                if (caVar.c()) {
                    k unused3 = a.this.f6401p = new k(caVar, a.this.f6387a);
                    a.this.f6401p.a(new C0115a());
                }
                a.this.f6400o.setAdHtmlLoaded(false);
                a.this.f6400o.a(a.this.f6404s);
                if (a.this.f6404s.getSize() != AppLovinAdSize.INTERSTITIAL && !a.this.f6411z) {
                    a.this.f6404s.setHasShown(true);
                    return;
                }
                return;
            }
            t.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f6404s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
            bc.a(a.this.D, (AppLovinAd) a.this.f6404s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
        }
    }

    static class e implements AppLovinAdLoadListener {

        /* renamed from: a  reason: collision with root package name */
        private final a f6415a;

        e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            } else if (kVar != null) {
                this.f6415a = aVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        private a a() {
            return this.f6415a;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            a a10 = a();
            if (a10 != null) {
                a10.b(appLovinAd);
            } else {
                t.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        public void failedToReceiveAd(int i10) {
            a a10 = a();
            if (a10 != null) {
                a10.b(i10);
            }
        }
    }

    private void F() {
        b bVar;
        if (this.f6391f != null && t.a() && t.a()) {
            this.f6391f.a("AppLovinAdView", "Destroying...");
        }
        if (!((Boolean) this.f6389c.a(oj.G1)).booleanValue() || (bVar = this.f6400o) == null) {
            ur.b(this.f6400o);
        } else {
            ur.a(bVar);
            f().a(this.f6400o, u.f6498a);
        }
        this.f6400o = null;
        this.f6397l = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.D = null;
        this.f6411z = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b o() {
        return new b(this.f6389c, this.f6387a.getApplicationContext());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f6400o.loadDataWithBaseURL(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, "<html></html>", "text/html", (String) null, MaxReward.DEFAULT_LABEL);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q() {
        b bVar;
        d();
        if (this.f6388b != null && (bVar = this.f6400o) != null && bVar.getParent() == null) {
            this.f6388b.addView(this.f6400o);
            b(this.f6400o, this.f6404s.getSize());
            if (this.f6404s.isOpenMeasurementEnabled()) {
                this.f6404s.getAdEventTracker().a((View) this.f6400o);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (!(this.f6400o == null || this.f6406u == null)) {
            a();
        }
        F();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (this.f6406u != null) {
            if (t.a()) {
                t tVar = this.f6391f;
                tVar.a("AppLovinAdView", "Detaching expanded ad: " + this.f6406u.b());
            }
            this.f6407v = this.f6406u;
            this.f6406u = null;
            a(this.f6395j);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t() {
        com.applovin.impl.sdk.ad.a aVar;
        f fVar = this.f6407v;
        if (fVar != null || this.f6406u != null) {
            if (fVar != null) {
                aVar = fVar.b();
                this.f6407v.dismiss();
                this.f6407v = null;
            } else {
                aVar = this.f6406u.b();
                this.f6406u.dismiss();
                this.f6406u = null;
            }
            bc.a(this.D, (AppLovinAd) aVar, (AppLovinAdView) this.f6388b);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u() {
        g().loadUrl("chrome://crash");
    }

    /* access modifiers changed from: private */
    public void w() {
        com.applovin.impl.sdk.ad.b bVar = this.f6404s;
        lc lcVar = new lc();
        lcVar.a().a(bVar).a(k());
        if (!zp.a(bVar.getSize())) {
            lcVar.a().a("Fullscreen Ad Properties").b(bVar);
        }
        lcVar.a(this.f6389c);
        lcVar.a();
        if (t.a()) {
            this.f6391f.a("AppLovinAdView", lcVar.toString());
        }
    }

    public void A() {
        if (e0.a((View) this.f6400o)) {
            this.f6389c.F().c(aa.f6356r);
        }
    }

    public void B() {
        if (this.f6410y) {
            bc.b(this.C, (AppLovinAd) this.f6404s);
            if (this.f6404s != null && this.f6404s.isOpenMeasurementEnabled() && zp.a(this.f6404s.getSize())) {
                this.f6404s.getAdEventTracker().f();
            }
            if (this.f6400o != null && this.f6406u != null) {
                if (t.a()) {
                    this.f6391f.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (t.a()) {
                this.f6391f.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
        }
    }

    public void C() {
        this.A = true;
    }

    public void D() {
        this.A = false;
    }

    public void E() {
        if (this.f6410y && !this.f6411z) {
            this.f6411z = true;
        }
    }

    public void G() {
        if (this.f6410y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f6408w.getAndSet((Object) null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f6411z = false;
        }
    }

    public void a(g0 g0Var) {
        this.F = g0Var;
    }

    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    public g0 h() {
        return this.F;
    }

    public AppLovinAdView k() {
        return (AppLovinAdView) this.f6388b;
    }

    public com.applovin.impl.sdk.k l() {
        return this.f6389c;
    }

    public AppLovinAdSize m() {
        return this.f6395j;
    }

    public String n() {
        return this.f6396k;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a((Runnable) new y(this));
        }
    }

    public void v() {
        if (this.f6389c == null || this.f6399n == null || this.f6387a == null || !this.f6410y) {
            t.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f6390d.loadNextAd(this.f6396k, this.f6395j, this.f6399n);
        }
    }

    public void x() {
        if ((this.f6387a instanceof r6) && this.f6404s != null && this.f6404s.R() == b.C0137b.DISMISS) {
            ((r6) this.f6387a).dismiss();
        }
    }

    public void y() {
        if (this.f6406u == null && this.f6407v == null) {
            if (t.a()) {
                t tVar = this.f6391f;
                tVar.a("AppLovinAdView", "Ad: " + this.f6404s + " closed.");
            }
            a(this.f6403r);
            bc.b(this.C, (AppLovinAd) this.f6404s);
            this.f6404s = null;
            return;
        }
        a();
    }

    public void z() {
        if (t.a()) {
            this.f6391f.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f6393h;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    /* access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int i10;
        if (view != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            String label = appLovinAdSize.getLabel();
            AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
            int i11 = -1;
            if (label.equals(appLovinAdSize2.getLabel())) {
                i10 = -1;
            } else if (appLovinAdSize.getWidth() == -1) {
                i10 = displayMetrics.widthPixels;
            } else {
                i10 = (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getWidth(), displayMetrics);
            }
            if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
                if (appLovinAdSize.getHeight() == -1) {
                    i11 = displayMetrics.heightPixels;
                } else {
                    i11 = (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getHeight(), displayMetrics);
                }
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = i10;
            layoutParams.height = i11;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    private void c() {
        a((Runnable) new z(this));
    }

    private void d() {
        a((Runnable) new x(this));
    }

    public static qb f() {
        AtomicReference atomicReference = G;
        Object obj = atomicReference.get();
        if (obj == null) {
            synchronized (atomicReference) {
                obj = atomicReference.get();
                if (obj == null) {
                    obj = new qb.d();
                    atomicReference.set(obj);
                }
            }
        }
        if (obj == atomicReference) {
            obj = null;
        }
        return (qb) obj;
    }

    public AppLovinAdViewEventListener e() {
        return this.D;
    }

    public b g() {
        return this.f6400o;
    }

    public com.applovin.impl.sdk.ad.b i() {
        return this.f6404s;
    }

    public i j() {
        return this.f6397l;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.B = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.C = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.D = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.E = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (appLovinAdSize != null) {
            this.f6389c = kVar;
            this.f6390d = kVar.i();
            this.f6391f = kVar.L();
            this.f6392g = AppLovinCommunicator.getInstance(context);
            this.f6395j = appLovinAdSize;
            this.f6396k = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f6387a = context;
            this.f6388b = appLovinAdView;
            this.f6398m = new c(this, kVar);
            this.f6403r = new c();
            this.f6402q = new d();
            this.f6399n = new e(this, kVar);
            a(appLovinAdSize);
        } else {
            throw new IllegalArgumentException("No ad size specified");
        }
    }

    public void b() {
        a((Runnable) new a0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f6404s.getAdEventTracker().c(webView);
        k kVar = this.f6401p;
        if (kVar == null || !kVar.a()) {
            this.f6404s.getAdEventTracker().a((View) webView);
        } else {
            ig adEventTracker = this.f6404s.getAdEventTracker();
            k kVar2 = this.f6401p;
            adEventTracker.b((View) webView, Collections.singletonList(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        }
        this.f6404s.getAdEventTracker().h();
        this.f6404s.getAdEventTracker().g();
    }

    /* access modifiers changed from: protected */
    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            if (((Boolean) this.f6389c.a(oj.G1)).booleanValue()) {
                this.f6400o = (b) f().a(new t(this));
            } else {
                this.f6400o = new b(this.f6389c, this.f6387a);
            }
            this.f6400o.a(this.f6398m);
            this.f6400o.setBackgroundColor(0);
            this.f6400o.setWillNotCacheDrawing(false);
            this.f6388b.setBackgroundColor(0);
            this.f6388b.addView(this.f6400o);
            b(this.f6400o, appLovinAdSize);
            if (!this.f6410y) {
                a(this.f6403r);
            }
            a((Runnable) new w(this));
            this.f6410y = true;
        } catch (Throwable th) {
            t.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f6389c.B().a("AppLovinAdView", "initAdWebView", th);
            this.f6409x.set(true);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.f6406u == null && (this.f6404s instanceof com.applovin.impl.sdk.ad.a) && this.f6400o != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f6404s;
            Context context = this.f6387a;
            Activity a10 = context instanceof Activity ? (Activity) context : ar.a((View) this.f6400o, this.f6389c);
            if (a10 == null || a10.isFinishing()) {
                t.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
                Uri j10 = aVar.j();
                if (j10 != null) {
                    this.f6390d.trackAndLaunchClick(aVar, k(), this, j10, motionEvent, this.A, (Bundle) null);
                }
                this.f6400o.a("javascript:al_onFailedExpand();");
                return;
            }
            ViewGroup viewGroup = this.f6388b;
            if (viewGroup != null) {
                viewGroup.removeView(this.f6400o);
            }
            f fVar = new f(aVar, this.f6400o, a10, this.f6389c);
            this.f6406u = fVar;
            fVar.setOnDismissListener(new o(this));
            this.f6406u.show();
            bc.c(this.D, (AppLovinAd) this.f6404s, (AppLovinAdView) this.f6388b);
            if (this.f6404s.isOpenMeasurementEnabled()) {
                this.f6404s.getAdEventTracker().a((View) this.f6406u.c());
            }
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (context == null) {
            t.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
        } else {
            if (appLovinAdSize == null && (appLovinAdSize = e0.a(attributeSet)) == null) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            }
            AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
            if (appLovinSdk == null) {
                appLovinSdk = AppLovinSdk.getInstance(context);
            }
            if (appLovinSdk != null) {
                a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
                if (e0.b(attributeSet)) {
                    v();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f6411z) {
                c(appLovinAd);
            } else {
                this.f6408w.set(appLovinAd);
                if (t.a()) {
                    this.f6391f.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a((Runnable) new s(this, appLovinAd));
            return;
        }
        if (t.a()) {
            this.f6391f.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f6394i.put(str, obj);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            zp.b(appLovinAd, this.f6389c);
            if (this.f6410y) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) zp.a(appLovinAd, this.f6389c);
                if (bVar == null) {
                    t.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    bc.a(this.C, "Unable to retrieve the loaded ad");
                } else if (bVar == this.f6404s) {
                    t.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (!((Boolean) this.f6389c.a(oj.Y1)).booleanValue()) {
                        return;
                    }
                    if (this.C instanceof lb) {
                        bc.a(this.C, "Attempting to show ad again");
                        return;
                    }
                    throw new IllegalStateException("Attempting to show ad again");
                } else {
                    if (t.a()) {
                        t tVar = this.f6391f;
                        tVar.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                    }
                    bc.b(this.C, (AppLovinAd) this.f6404s);
                    if (this.f6404s != null && this.f6404s.isOpenMeasurementEnabled()) {
                        this.f6404s.getAdEventTracker().f();
                    }
                    this.f6408w.set((Object) null);
                    this.f6405t = null;
                    this.f6404s = bVar;
                    if (this.f6404s.A0()) {
                        this.f6397l = this.f6389c.w().a(this);
                        this.f6389c.w().b(this.f6404s.A(), this.f6397l);
                    }
                    if (!this.f6411z && zp.a(this.f6395j)) {
                        this.f6389c.i().trackImpression(bVar);
                    }
                    if (this.f6406u != null) {
                        c();
                    }
                    a(this.f6402q);
                }
            } else {
                t.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            }
        } else {
            throw new IllegalArgumentException("No ad specified");
        }
    }

    /* access modifiers changed from: private */
    public void b(int i10) {
        if (!this.f6411z) {
            a(this.f6403r);
        }
        a((Runnable) new p(this, i10));
    }

    public void a(WebView webView, String str) {
        if (this.f6404s != null) {
            a((Runnable) new v(webView));
            if (!((Boolean) this.f6389c.a(oj.f10358m6)).booleanValue() || (str != null && str.startsWith(this.f6404s.h()))) {
                try {
                    if (this.f6404s != this.f6405t) {
                        this.f6405t = this.f6404s;
                        this.f6400o.setAdHtmlLoaded(true);
                        if (this.C != null) {
                            this.f6389c.v().d((Object) this.f6404s);
                            bc.a(this.C, (AppLovinAd) this.f6404s);
                            this.f6400o.a("javascript:al_onAdViewRendered();");
                        }
                        if ((this.f6404s instanceof com.applovin.impl.sdk.ad.a) && this.f6404s.isOpenMeasurementEnabled()) {
                            this.f6389c.l0().a((xl) new kn(this.f6389c, "StartOMSDK", new r(this, webView)), sm.b.OTHER, 500);
                        }
                    }
                } catch (Throwable th) {
                    t.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                    com.applovin.impl.sdk.k kVar = this.f6389c;
                    if (kVar != null) {
                        kVar.B().a("AppLovinAdView", "onAdHtmlLoaded", th);
                    }
                }
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        a((Runnable) new q(this, motionEvent));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a((Runnable) new b0(this));
    }

    /* access modifiers changed from: package-private */
    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (appLovinAdView != null) {
            this.f6390d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent, this.A, bundle);
        } else if (t.a()) {
            this.f6391f.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        bc.a(this.E, (AppLovinAd) bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f6409x.compareAndSet(true, false)) {
            a(this.f6395j);
        }
        try {
            if (this.B != null) {
                this.B.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            t.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.k kVar = this.f6389c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoaded", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.B != null) {
                this.B.failedToReceiveAd(i10);
            }
        } catch (Throwable th) {
            t.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.k kVar = this.f6389c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoadFailed", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f6393h = bVar;
    }
}
