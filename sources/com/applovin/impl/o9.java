package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.g;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class o9 extends n9 {
    private final p9 L = new p9(this.f9925a, this.f9928d, this.f9926b);
    private w1 M;
    private long N;
    private final AtomicBoolean O = new AtomicBoolean();

    public o9(b bVar, Activity activity, Map map, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        if (zp.a(oj.f10361n1, kVar)) {
            a(false);
        }
    }

    private long E() {
        b bVar = this.f9925a;
        if (!(bVar instanceof a)) {
            return 0;
        }
        float g12 = ((a) bVar).g1();
        if (g12 <= 0.0f) {
            g12 = (float) this.f9925a.p();
        }
        return (long) (((double) zp.c(g12)) * (((double) this.f9925a.E()) / 100.0d));
    }

    private int F() {
        w1 w1Var;
        int i10 = 100;
        if (l()) {
            if (!G() && (w1Var = this.M) != null) {
                i10 = (int) Math.min(100.0d, (((double) (this.N - w1Var.b())) / ((double) this.N)) * 100.0d);
            }
            if (t.a()) {
                t tVar = this.f9927c;
                tVar.a("AppLovinFullscreenActivity", "Ad engaged at " + i10 + "%");
            }
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.O.set(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f9940q = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J() {
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

    private void L() {
        this.L.a(this.f9935l);
        this.f9940q = SystemClock.elapsedRealtime();
        this.O.set(true);
    }

    public void A() {
        a((ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    public boolean G() {
        if (this.f9925a.W0()) {
            return this.I;
        }
        if (l()) {
            return this.O.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void K() {
        long j10;
        long j11 = 0;
        if (this.f9925a.U() >= 0 || this.f9925a.V() >= 0) {
            if (this.f9925a.U() >= 0) {
                j10 = this.f9925a.U();
            } else {
                if (this.f9925a.T0()) {
                    int g12 = (int) ((a) this.f9925a).g1();
                    if (g12 > 0) {
                        j11 = TimeUnit.SECONDS.toMillis((long) g12);
                    } else {
                        int p10 = (int) this.f9925a.p();
                        if (p10 > 0) {
                            j11 = TimeUnit.SECONDS.toMillis((long) p10);
                        }
                    }
                }
                j10 = (long) (((double) j11) * (((double) this.f9925a.V()) / 100.0d));
            }
            b(j10);
        }
    }

    public void a(long j10) {
    }

    public void a(ViewGroup viewGroup) {
        this.L.a(this.f9934k, this.f9933j, this.f9932i, viewGroup);
        if (!zp.a(oj.f10361n1, this.f9926b)) {
            b(false);
        }
        com.applovin.impl.adview.k kVar = this.f9933j;
        if (kVar != null) {
            kVar.b();
        }
        this.f9932i.renderAd(this.f9925a);
        a("javascript:al_onPoststitialShow();", (long) this.f9925a.D());
        if (l()) {
            long E = E();
            this.N = E;
            if (E > 0) {
                if (t.a()) {
                    t tVar = this.f9927c;
                    tVar.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.N + "ms...");
                }
                this.M = w1.a(this.N, this.f9926b, new xz(this));
            }
        }
        if (this.f9934k != null) {
            if (this.f9925a.p() >= 0) {
                a(this.f9934k, this.f9925a.p(), new zz(this));
            } else {
                this.f9934k.setVisibility(0);
            }
        }
        K();
        this.f9926b.l0().a((xl) new kn(this.f9926b, "updateMainViewOM", new yz(this)), sm.b.OTHER, TimeUnit.SECONDS.toMillis(1));
        t();
        super.d(zp.e(this.f9926b));
    }

    public void b() {
    }

    public void c() {
    }

    public void f() {
        q();
        w1 w1Var = this.M;
        if (w1Var != null) {
            w1Var.a();
            this.M = null;
        }
        super.f();
    }

    public void i() {
        super.i();
        L();
    }

    public void j() {
        super.j();
        L();
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.a(F(), false, G(), -2);
    }

    public void z() {
    }
}
