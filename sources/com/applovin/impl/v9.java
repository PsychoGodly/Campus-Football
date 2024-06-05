package com.applovin.impl;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.g;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class v9 extends n9 implements g0 {
    private final w9 L = new w9(this.f9925a, this.f9928d, this.f9926b);
    /* access modifiers changed from: private */
    public final g M;
    /* access modifiers changed from: private */
    public final ImageView N;
    private final o O;
    private final boolean P;
    private double Q;
    private double R;
    private final AtomicBoolean S;
    private final AtomicBoolean T;
    private boolean U;
    private long V;
    private long W;

    private class b implements View.OnClickListener {
        private b() {
        }

        public void onClick(View view) {
            if (view == v9.this.M) {
                v9.this.O();
            } else if (view == v9.this.N) {
                v9.this.P();
            } else {
                t tVar = v9.this.f9927c;
                if (t.a()) {
                    t tVar2 = v9.this.f9927c;
                    tVar2.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                }
            }
        }
    }

    public v9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        boolean G0 = this.f9925a.G0();
        this.P = G0;
        this.S = new AtomicBoolean();
        this.T = new AtomicBoolean();
        this.U = zp.e(this.f9926b);
        this.V = -2;
        this.W = 0;
        if (zp.a(oj.f10361n1, kVar)) {
            a(false);
        }
        b bVar2 = new b();
        if (bVar.k0() >= 0) {
            g gVar = new g(bVar.b0(), activity);
            this.M = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(bVar2);
        } else {
            this.M = null;
        }
        if (a(this.U, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.N = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(bVar2);
            e(this.U);
        } else {
            this.N = null;
        }
        if (G0) {
            o oVar = new o(activity, ((Integer) kVar.a(oj.F2)).intValue(), 16842874);
            this.O = oVar;
            oVar.setColor(Color.parseColor("#75FFFFFF"));
            oVar.setBackgroundColor(Color.parseColor("#00000000"));
            oVar.setVisibility(8);
            return;
        }
        this.O = null;
    }

    private void E() {
        this.f9948y++;
        if (this.f9925a.B()) {
            if (t.a()) {
                this.f9927c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            f();
            return;
        }
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Skipping video...");
        }
        N();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.V = -1;
        this.W = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        g gVar = this.f9934k;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f9933j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9933j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f9925a.getAdEventTracker().b((View) this.f9932i, (List) arrayList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f9940q = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: private */
    public void K() {
        if (this.T.compareAndSet(false, true)) {
            a(this.M, this.f9925a.k0(), new j60(this));
        }
    }

    private void M() {
        this.L.a(this.f9935l);
        this.f9940q = SystemClock.elapsedRealtime();
        this.Q = 100.0d;
    }

    public void A() {
        a((ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        if (this.f9925a.W0()) {
            return this.I;
        }
        return this.Q >= ((double) this.f9925a.m0());
    }

    /* access modifiers changed from: protected */
    public void J() {
        long j10;
        long millis;
        long j11 = 0;
        if (this.f9925a.U() >= 0 || this.f9925a.V() >= 0) {
            if (this.f9925a.U() >= 0) {
                j10 = this.f9925a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f9925a;
                double d10 = this.R;
                if (d10 > 0.0d) {
                    j11 = TimeUnit.SECONDS.toMillis((long) d10);
                }
                if (aVar.T0()) {
                    int g12 = (int) ((com.applovin.impl.sdk.ad.a) this.f9925a).g1();
                    if (g12 > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) g12);
                    } else {
                        int p10 = (int) aVar.p();
                        if (p10 > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) p10);
                        }
                    }
                    j11 += millis;
                }
                j10 = (long) (((double) j11) * (((double) this.f9925a.V()) / 100.0d));
            }
            b(j10);
        }
    }

    /* access modifiers changed from: protected */
    public boolean L() {
        return l() && !F();
    }

    public void N() {
        if (this.S.compareAndSet(false, true)) {
            if (t.a()) {
                this.f9927c.a("AppLovinFullscreenActivity", "Showing postitial...");
            }
            c("javascript:al_showPostitial();");
            g gVar = this.M;
            if (gVar != null) {
                gVar.setVisibility(8);
            }
            ImageView imageView = this.N;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            o oVar = this.O;
            if (oVar != null) {
                oVar.b();
            }
            if (this.f9934k != null) {
                if (this.f9925a.p() >= 0) {
                    a(this.f9934k, this.f9925a.p(), new l60(this));
                } else {
                    this.f9934k.setVisibility(0);
                }
            }
            this.f9932i.getController().D();
            t();
        }
    }

    public void O() {
        this.V = SystemClock.elapsedRealtime() - this.W;
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.V + "ms");
        }
        if (L()) {
            r();
            if (t.a()) {
                this.f9927c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.F.e();
            return;
        }
        E();
    }

    /* access modifiers changed from: protected */
    public void P() {
        this.U = !this.U;
        c("javascript:al_setVideoMuted(" + this.U + ");");
        e(this.U);
        a(this.U, 0);
    }

    public void a(long j10) {
    }

    public void c() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    public void d() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
    }

    public void e() {
        N();
    }

    public void f() {
        q();
        super.f();
    }

    public void i() {
        super.i();
        M();
    }

    public void j() {
        super.j();
        M();
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.a((int) this.Q, this.P, F(), this.V);
    }

    public void z() {
    }

    private static boolean a(boolean z10, k kVar) {
        if (!((Boolean) kVar.a(oj.f10418u2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(oj.f10426v2)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) kVar.a(oj.f10442x2)).booleanValue();
    }

    private void e(boolean z10) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f9928d.getDrawable(z10 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.N.setScaleType(ImageView.ScaleType.FIT_XY);
                this.N.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.N, z10 ? this.f9925a.L() : this.f9925a.e0(), this.f9926b);
    }

    public void b(double d10) {
        c("javascript:al_setVideoMuted(" + this.U + ");");
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
        if (this.M != null) {
            K();
        }
        this.f9932i.getController().C();
        this.R = d10;
        J();
        if (this.f9925a.Z0()) {
            this.F.b(this.f9925a, (Runnable) null);
        }
    }

    public void a(ViewGroup viewGroup) {
        this.L.a(this.N, this.M, this.f9934k, this.O, this.f9933j, this.f9932i, viewGroup);
        this.f9932i.getController().a((g0) this);
        if (!zp.a(oj.f10361n1, this.f9926b)) {
            b(false);
        }
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
        com.applovin.impl.adview.k kVar = this.f9933j;
        if (kVar != null) {
            kVar.b();
        }
        this.f9932i.renderAd(this.f9925a);
        if (this.M != null) {
            this.f9926b.l0().a(new kn(this.f9926b, "scheduleSkipButton", new i60(this)), sm.b.TIMEOUT, this.f9925a.l0(), true);
        }
        this.f9926b.l0().a((xl) new kn(this.f9926b, "updateMainViewOM", new k60(this)), sm.b.OTHER, 500);
        super.d(this.U);
    }

    public void b() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        E();
    }

    public void a(double d10) {
        this.Q = d10;
    }

    public void a() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }
}
