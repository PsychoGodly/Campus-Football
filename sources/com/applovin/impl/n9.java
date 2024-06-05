package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.gb;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class n9 implements gb.a, AppLovinBroadcastManager.Receiver, zp.b, a.b {
    protected int A = f.f11593i;
    protected boolean B;
    protected AppLovinAdClickListener C;
    protected AppLovinAdDisplayListener D;
    protected AppLovinAdVideoPlaybackListener E;
    protected final gb F;
    protected ho G;
    protected ho H;
    protected boolean I;
    private final g J;
    private boolean K = false;

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f9925a;

    /* renamed from: b  reason: collision with root package name */
    protected final k f9926b;

    /* renamed from: c  reason: collision with root package name */
    protected final t f9927c;

    /* renamed from: d  reason: collision with root package name */
    protected Activity f9928d;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f9929f = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    private final p f9930g;

    /* renamed from: h  reason: collision with root package name */
    private final f.a f9931h;

    /* renamed from: i  reason: collision with root package name */
    protected AppLovinAdView f9932i;

    /* renamed from: j  reason: collision with root package name */
    protected com.applovin.impl.adview.k f9933j;

    /* renamed from: k  reason: collision with root package name */
    protected final com.applovin.impl.adview.g f9934k;

    /* renamed from: l  reason: collision with root package name */
    protected final com.applovin.impl.adview.g f9935l;

    /* renamed from: m  reason: collision with root package name */
    protected final long f9936m = SystemClock.elapsedRealtime();

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f9937n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f9938o = new AtomicBoolean();

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f9939p = new AtomicBoolean();

    /* renamed from: q  reason: collision with root package name */
    protected long f9940q = -1;

    /* renamed from: r  reason: collision with root package name */
    protected long f9941r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9942s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f9943t;

    /* renamed from: u  reason: collision with root package name */
    protected int f9944u;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f9945v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public int f9946w = 0;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f9947x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    protected int f9948y = 0;

    /* renamed from: z  reason: collision with root package name */
    protected int f9949z = 0;

    class a implements AppLovinAdDisplayListener {
        a() {
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            t tVar = n9.this.f9927c;
            if (t.a()) {
                n9.this.f9927c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        public void adHidden(AppLovinAd appLovinAd) {
            t tVar = n9.this.f9927c;
            if (t.a()) {
                n9.this.f9927c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            n9.this.f();
        }
    }

    class b implements f.a {
        b() {
        }

        public void a(int i10) {
            n9 n9Var = n9.this;
            if (n9Var.A != f.f11593i) {
                n9Var.B = true;
            }
            com.applovin.impl.adview.b g10 = n9Var.f9932i.getController().g();
            if (g10 == null) {
                t tVar = n9.this.f9927c;
                if (t.a()) {
                    n9.this.f9927c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (f.a(i10) && !f.a(n9.this.A)) {
                g10.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                g10.a("javascript:al_muteSwitchOff();");
            }
            n9.this.A = i10;
        }
    }

    class c extends p {
        c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.getClass().getName().equals(zp.l(activity.getApplicationContext()))) {
                n9.this.h();
            }
        }
    }

    public interface d {
        void a(n9 n9Var);

        void a(String str, Throwable th);
    }

    private class e implements AppLovinAdClickListener, View.OnClickListener {
        private e() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            n9.this.f9940q = SystemClock.elapsedRealtime();
        }

        public void adClicked(AppLovinAd appLovinAd) {
            t tVar = n9.this.f9927c;
            if (t.a()) {
                n9.this.f9927c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            bc.a(n9.this.C, appLovinAd);
            n9.this.f9949z++;
        }

        public void onClick(View view) {
            n9 n9Var = n9.this;
            if (view != n9Var.f9934k || !((Boolean) n9Var.f9926b.a(oj.f10386q2)).booleanValue()) {
                t tVar = n9.this.f9927c;
                if (t.a()) {
                    t tVar2 = n9.this.f9927c;
                    tVar2.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            n9.c(n9.this);
            if (n9.this.f9925a.R0()) {
                n9 n9Var2 = n9.this;
                n9Var2.c("javascript:al_onCloseButtonTapped(" + n9.this.f9946w + "," + n9.this.f9948y + "," + n9.this.f9949z + ");");
            }
            List K = n9.this.f9925a.K();
            t tVar3 = n9.this.f9927c;
            if (t.a()) {
                t tVar4 = n9.this.f9927c;
                tVar4.a("AppLovinFullscreenActivity", "Handling close button tap " + n9.this.f9946w + " with multi close delay: " + K);
            }
            if (K == null || K.size() <= n9.this.f9946w) {
                n9.this.f();
                return;
            }
            n9.this.f9947x.add(Long.valueOf(SystemClock.elapsedRealtime() - n9.this.f9940q));
            List I = n9.this.f9925a.I();
            if (I != null && I.size() > n9.this.f9946w) {
                n9 n9Var3 = n9.this;
                n9Var3.f9934k.a((e.a) I.get(n9Var3.f9946w));
            }
            t tVar5 = n9.this.f9927c;
            if (t.a()) {
                t tVar6 = n9.this.f9927c;
                tVar6.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + K.get(n9.this.f9946w));
            }
            n9.this.f9934k.setVisibility(8);
            n9 n9Var4 = n9.this;
            n9Var4.a(n9Var4.f9934k, (long) ((Integer) K.get(n9Var4.f9946w)).intValue(), new sz(this));
        }

        /* synthetic */ e(n9 n9Var, a aVar) {
            this();
        }
    }

    n9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f9925a = bVar;
        this.f9926b = kVar;
        this.f9927c = kVar.L();
        this.f9928d = activity;
        this.C = appLovinAdClickListener;
        this.D = appLovinAdDisplayListener;
        this.E = appLovinAdVideoPlaybackListener;
        gb gbVar = new gb(activity, kVar);
        this.F = gbVar;
        gbVar.a(this);
        this.J = new g(kVar);
        e eVar = new e(this, (a) null);
        if (((Boolean) kVar.a(oj.J2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(oj.P2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        l9 l9Var = new l9(kVar.v0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f9932i = l9Var;
        l9Var.setAdClickListener(eVar);
        this.f9932i.setAdDisplayListener(new a());
        bVar.e().putString("ad_view_address", ar.a((View) this.f9932i));
        this.f9932i.getController().a((a.b) this);
        ca caVar = new ca(map, kVar);
        if (caVar.c()) {
            this.f9933j = new com.applovin.impl.adview.k(caVar, activity);
        }
        kVar.i().trackImpression(bVar);
        List K2 = bVar.K();
        if (bVar.p() >= 0 || K2 != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.n(), activity);
            this.f9934k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        } else {
            this.f9934k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f9935l = gVar2;
        gVar2.setOnClickListener(new kz(this));
        if (bVar.S0()) {
            this.f9931h = new b();
        } else {
            this.f9931h = null;
        }
        this.f9930g = new c();
    }

    private void C() {
        if (this.f9931h != null) {
            this.f9926b.m().a(this.f9931h);
        }
        if (this.f9930g != null) {
            this.f9926b.e().a(this.f9930g);
        }
    }

    private void D() {
        AppLovinSdkUtils.runOnUiThread(new pz(this));
    }

    static /* synthetic */ int c(n9 n9Var) {
        int i10 = n9Var.f9946w;
        n9Var.f9946w = i10 + 1;
        return i10;
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f9925a.d() >= 0) {
            this.f9939p.set(true);
        } else if (!this.f9938o.get()) {
            D();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n() {
        if (!this.f9925a.D0().getAndSet(true)) {
            this.f9926b.l0().a((xl) new fn(this.f9925a, this.f9926b), sm.b.OTHER);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o() {
        t.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
        try {
            f();
        } catch (Throwable unused) {
        }
    }

    public abstract void A();

    public boolean B() {
        return this.f9939p.get();
    }

    public abstract void a(long j10);

    public abstract void a(ViewGroup viewGroup);

    public void f() {
        this.f9942s = true;
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.b bVar = this.f9925a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f9929f.removeCallbacksAndMessages((Object) null);
        com.applovin.impl.sdk.ad.b bVar2 = this.f9925a;
        a("javascript:al_onPoststitialDismiss();", bVar2 != null ? (long) bVar2.C() : 0);
        p();
        this.J.b();
        if (this.f9931h != null) {
            this.f9926b.m().b(this.f9931h);
        }
        if (this.f9930g != null) {
            this.f9926b.e().b(this.f9930g);
        }
        if (m()) {
            this.f9928d.finish();
            return;
        }
        this.f9926b.L();
        if (t.a()) {
            this.f9926b.L().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        v();
    }

    /* access modifiers changed from: protected */
    public int g() {
        int r10 = this.f9925a.r();
        return (r10 <= 0 && ((Boolean) this.f9926b.a(oj.G2)).booleanValue()) ? this.f9944u + 1 : r10;
    }

    public void i() {
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void j() {
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f9943t = true;
    }

    public boolean k() {
        return this.f9942s;
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return AppLovinAdType.INCENTIVIZED == this.f9925a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f9925a.getType();
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        return this.f9928d instanceof AppLovinFullscreenActivity;
    }

    public void onCachedResourcesChecked(boolean z10) {
        if (!z10) {
            if (((Boolean) this.f9926b.a(oj.P5)).booleanValue()) {
                if (t.a()) {
                    this.f9927c.b("AppLovinFullscreenActivity", "Dismissing ad due to unavailable resources");
                }
                ob.a(this.f9925a, this.D, "Unavailable ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
                f();
                return;
            }
            if (t.a()) {
                this.f9927c.b("AppLovinFullscreenActivity", "Streaming ad due to unavailable ad resources");
            }
            this.f9925a.J0();
        }
    }

    public void onReceive(Intent intent, Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.f9943t) {
            j();
        } else if ("com.applovin.al_onPoststitialShow_evaluation_error".equals(intent.getAction())) {
            i();
        }
    }

    /* access modifiers changed from: protected */
    public void p() {
        if (!B() && this.f9938o.compareAndSet(false, true)) {
            bc.b(this.D, (AppLovinAd) this.f9925a);
            this.f9926b.E().b((Object) this.f9925a);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void q();

    /* access modifiers changed from: protected */
    public void r() {
        ho hoVar = this.G;
        if (hoVar != null) {
            hoVar.d();
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        ho hoVar = this.G;
        if (hoVar != null) {
            hoVar.e();
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        com.applovin.impl.adview.b g10;
        if (this.f9932i != null && this.f9925a.x0() && (g10 = this.f9932i.getController().g()) != null) {
            this.J.a((View) g10, (g.c) new lz(this));
        }
    }

    public void u() {
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.K) {
            f();
        }
        if (this.f9925a.R0()) {
            c("javascript:onBackPressed();");
        }
    }

    public void v() {
        AppLovinAdView appLovinAdView = this.f9932i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f9932i.destroy();
            this.f9932i = null;
            if ((parent instanceof ViewGroup) && m()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        q();
        p();
        this.C = null;
        this.D = null;
        this.E = null;
        this.f9928d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void w() {
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "onPause()");
        }
        b("javascript:al_onAppPaused();");
        if (this.F.b()) {
            this.F.a();
        }
        r();
    }

    public void x() {
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "onResume()");
        }
        b("javascript:al_onAppResumed();");
        s();
        if (this.F.b()) {
            this.F.a();
        }
    }

    public void y() {
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void z();

    /* access modifiers changed from: protected */
    public void a(boolean z10) {
        zp.a(z10, this.f9925a, this.f9926b, k.k(), (zp.b) this);
    }

    /* access modifiers changed from: protected */
    public void b(boolean z10) {
        List a10 = zp.a(z10, this.f9925a, this.f9926b, (Context) this.f9928d);
        if (a10.isEmpty()) {
            return;
        }
        if (((Boolean) this.f9926b.a(oj.P5)).booleanValue()) {
            if (t.a()) {
                t tVar = this.f9927c;
                tVar.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + a10);
            }
            ob.a(this.f9925a, this.D, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            f();
            return;
        }
        if (t.a()) {
            t tVar2 = this.f9927c;
            tVar2.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + a10);
        }
        this.f9925a.J0();
    }

    /* access modifiers changed from: protected */
    public void d(boolean z10) {
        a(z10, ((Long) this.f9926b.a(oj.H2)).longValue());
        bc.a(this.D, (AppLovinAd) this.f9925a);
        this.f9926b.E().a((Object) this.f9925a);
        if (this.f9925a.hasVideoUrl() || l()) {
            bc.a(this.E, (AppLovinAd) this.f9925a);
        }
        new vg(this.f9928d).a(this.f9925a);
        this.f9925a.setHasShown(true);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.applovin.impl.n9] */
    /* JADX WARNING: type inference failed for: r1v27, types: [com.applovin.impl.o9] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.applovin.impl.t9] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.applovin.impl.t9] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.applovin.impl.s9] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.applovin.impl.v9] */
    /* JADX WARNING: type inference failed for: r1v32, types: [com.applovin.impl.r9] */
    /* JADX WARNING: type inference failed for: r1v33, types: [com.applovin.impl.r9] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.applovin.impl.q9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.applovin.impl.sdk.ad.b r16, com.applovin.sdk.AppLovinAdClickListener r17, com.applovin.sdk.AppLovinAdDisplayListener r18, com.applovin.sdk.AppLovinAdVideoPlaybackListener r19, java.util.Map r20, com.applovin.impl.sdk.k r21, android.app.Activity r22, com.applovin.impl.n9.d r23) {
        /*
            r9 = r21
            r10 = r23
            boolean r0 = r16.b1()
            r11 = r16
            boolean r1 = r11 instanceof com.applovin.impl.bq
            java.lang.String r12 = "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter."
            java.lang.String r13 = "AppLovinFullscreenActivity"
            java.lang.String r14 = " and throwable: "
            if (r1 == 0) goto L_0x00a7
            java.lang.String r15 = "Failed to create FullscreenVastVideoAdPresenter with sdk: "
            if (r0 == 0) goto L_0x0073
            com.applovin.impl.q9 r0 = new com.applovin.impl.q9     // Catch:{ all -> 0x002e }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x002e }
            goto L_0x0191
        L_0x002e:
            r0 = move-exception
            r21.L()
            boolean r1 = com.applovin.impl.sdk.t.a()
            if (r1 == 0) goto L_0x003f
            com.applovin.impl.sdk.t r1 = r21.L()
            r1.d(r13, r12, r0)
        L_0x003f:
            com.applovin.impl.r9 r0 = new com.applovin.impl.r9     // Catch:{ all -> 0x0055 }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x0191
        L_0x0055:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r9)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.a(r1, r0)
            return
        L_0x0073:
            com.applovin.impl.r9 r0 = new com.applovin.impl.r9     // Catch:{ all -> 0x0089 }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0089 }
            goto L_0x0191
        L_0x0089:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r9)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.a(r1, r0)
            return
        L_0x00a7:
            boolean r1 = r16.hasVideoUrl()
            if (r1 == 0) goto L_0x017d
            boolean r1 = r16.I0()
            if (r1 == 0) goto L_0x00e9
            com.applovin.impl.v9 r0 = new com.applovin.impl.v9     // Catch:{ all -> 0x00c9 }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c9 }
            goto L_0x0191
        L_0x00c9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenWebVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r9)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.a(r1, r0)
            return
        L_0x00e9:
            if (r0 == 0) goto L_0x0148
            com.applovin.impl.s9 r0 = new com.applovin.impl.s9     // Catch:{ all -> 0x0101 }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0101 }
            goto L_0x0191
        L_0x0101:
            r0 = move-exception
            r21.L()
            boolean r1 = com.applovin.impl.sdk.t.a()
            if (r1 == 0) goto L_0x0112
            com.applovin.impl.sdk.t r1 = r21.L()
            r1.d(r13, r12, r0)
        L_0x0112:
            com.applovin.impl.t9 r0 = new com.applovin.impl.t9     // Catch:{ all -> 0x0128 }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0128 }
            goto L_0x0191
        L_0x0128:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: "
            r1.append(r2)
            r1.append(r9)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.a(r1, r0)
            return
        L_0x0148:
            com.applovin.impl.t9 r0 = new com.applovin.impl.t9     // Catch:{ all -> 0x015d }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x015d }
            goto L_0x0191
        L_0x015d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r9)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.a(r1, r0)
            return
        L_0x017d:
            com.applovin.impl.o9 r0 = new com.applovin.impl.o9     // Catch:{ all -> 0x0198 }
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r20
            r5 = r21
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0198 }
        L_0x0191:
            r0.C()
            r10.a(r0)
            return
        L_0x0198:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenGraphicAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r9)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.n9.a(com.applovin.impl.sdk.ad.b, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, java.util.Map, com.applovin.impl.sdk.k, android.app.Activity, com.applovin.impl.n9$d):void");
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        a(str, 0);
    }

    public void c(boolean z10) {
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
        ho hoVar = this.H;
        if (hoVar == null) {
            return;
        }
        if (z10) {
            hoVar.e();
        } else {
            hoVar.d();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        f();
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        if (this.f9925a.B0()) {
            a(str, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void b(long j10) {
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.G = ho.a(j10, this.f9926b, new qz(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        com.applovin.impl.adview.b g10;
        AppLovinAdView appLovinAdView = this.f9932i;
        if (appLovinAdView != null && (g10 = appLovinAdView.getController().g()) != null) {
            g10.a(str);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j10) {
        if (j10 >= 0 && StringUtils.isValidString(str)) {
            a((Runnable) new rz(this, str), j10);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i10, boolean z10, boolean z11, long j10) {
        int i11 = i10;
        if (this.f9937n.compareAndSet(false, true)) {
            if (this.f9925a.hasVideoUrl() || l()) {
                bc.a(this.E, (AppLovinAd) this.f9925a, (double) i11, z11);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9936m;
            this.f9926b.i().trackVideoEnd(this.f9925a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i10, z10);
            long j11 = -1;
            if (this.f9940q != -1) {
                j11 = SystemClock.elapsedRealtime() - this.f9940q;
            }
            this.f9926b.i().trackFullScreenAdClosed(this.f9925a, j11, this.f9947x, j10, this.B, this.A);
            if (t.a()) {
                t tVar = this.f9927c;
                tVar.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i11 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j10 + "ms, closeTimeMillis: " + j11 + "ms");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10, long j10) {
        if (this.f9925a.K0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f9927c != null && t.a()) {
            t tVar = this.f9927c;
            tVar.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f9929f);
    }

    /* access modifiers changed from: protected */
    public void a(com.applovin.impl.adview.g gVar, long j10, Runnable runnable) {
        if (j10 < ((Long) this.f9926b.a(oj.f10378p2)).longValue()) {
            oz ozVar = new oz(gVar, runnable);
            if (((Boolean) this.f9926b.a(oj.Q2)).booleanValue()) {
                this.H = ho.a(TimeUnit.SECONDS.toMillis(j10), this.f9926b, ozVar);
            } else {
                this.f9926b.l0().a(new kn(this.f9926b, "fadeInCloseButton", ozVar), sm.b.OTHER, TimeUnit.SECONDS.toMillis(j10), true);
            }
        }
    }

    public void a(Configuration configuration) {
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(com.applovin.impl.adview.a aVar) {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.I = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        com.applovin.impl.adview.g gVar;
        if (zp.a(oj.f10337k1, this.f9926b)) {
            this.f9926b.D().c(this.f9925a, k.k());
        }
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("ad_size", this.f9925a.getSize().getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(this.f9925a.getAdIdNumber()), hashMap);
        CollectionUtils.putStringIfValid("dsp_name", this.f9925a.getDspName(), hashMap);
        CollectionUtils.putStringIfValid("clcode", this.f9925a.getClCode(), hashMap);
        this.f9926b.B().a(o.b.BLACK_VIEW, (Map) hashMap);
        if (((Boolean) this.f9926b.a(oj.f10294e6)).booleanValue()) {
            f();
            return;
        }
        this.K = ((Boolean) this.f9926b.a(oj.f10302f6)).booleanValue();
        if (((Boolean) this.f9926b.a(oj.f10310g6)).booleanValue() && (gVar = this.f9934k) != null) {
            gVar.setVisibility(0);
        }
    }
}
