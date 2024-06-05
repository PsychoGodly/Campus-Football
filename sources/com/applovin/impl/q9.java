package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.adview.g;
import com.applovin.impl.adview.l;
import com.applovin.impl.bq;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.t4;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class q9 extends s9 {
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public final bq f10896l0;
    /* access modifiers changed from: private */

    /* renamed from: m0  reason: collision with root package name */
    public final Set f10897m0;

    class a implements t4.b {
        a() {
        }

        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(q9.this.f11317c0 - (q9.this.N.getDuration() - q9.this.N.getCurrentPosition()));
            int E = q9.this.E();
            HashSet hashSet = new HashSet();
            for (lq lqVar : new HashSet(q9.this.f10897m0)) {
                if (lqVar.a(seconds, E)) {
                    hashSet.add(lqVar);
                    q9.this.f10897m0.remove(lqVar);
                }
            }
            q9.this.a((Set) hashSet);
            if (E >= 25 && E < 50) {
                q9.this.f10896l0.getAdEventTracker().x();
            } else if (E >= 50 && E < 75) {
                q9.this.f10896l0.getAdEventTracker().y();
            } else if (E >= 75) {
                q9.this.f10896l0.getAdEventTracker().C();
            }
        }

        public boolean b() {
            return !q9.this.f11319e0;
        }
    }

    public q9(b bVar, Activity activity, Map map, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f10897m0 = hashSet;
        bq bqVar = (bq) bVar;
        this.f10896l0 = bqVar;
        bq.d dVar = bq.d.VIDEO;
        hashSet.addAll(bqVar.a(dVar, mq.f9827a));
        a(bq.d.IMPRESSION);
        a(dVar, "creativeView");
        bqVar.getAdEventTracker().g();
    }

    private void b0() {
        if (I() && !this.f10897m0.isEmpty()) {
            if (t.a()) {
                t tVar = this.f9927c;
                tVar.k("AppLovinFullscreenActivity", "Firing " + this.f10897m0.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.f10897m0);
        }
    }

    public void A() {
        a((ViewGroup) null);
    }

    public void F() {
        a(bq.d.VIDEO, "skip");
        this.f10896l0.getAdEventTracker().B();
        super.F();
    }

    /* access modifiers changed from: protected */
    public void G() {
        super.G();
        bq bqVar = this.f10896l0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().i();
        }
    }

    /* access modifiers changed from: protected */
    public void Q() {
        long j10;
        int p10;
        long j11 = 0;
        if (this.f10896l0.U() >= 0 || this.f10896l0.V() >= 0) {
            if (this.f10896l0.U() >= 0) {
                j10 = this.f10896l0.U();
            } else {
                bq bqVar = this.f10896l0;
                oq o12 = bqVar.o1();
                if (o12 == null || o12.c() <= 0) {
                    long j12 = this.f11317c0;
                    if (j12 > 0) {
                        j11 = j12;
                    }
                } else {
                    j11 = TimeUnit.SECONDS.toMillis((long) o12.c());
                }
                if (bqVar.T0() && (p10 = (int) bqVar.p()) > 0) {
                    j11 += TimeUnit.SECONDS.toMillis((long) p10);
                }
                j10 = (long) (((double) j11) * (((double) this.f10896l0.V()) / 100.0d));
            }
            b(j10);
        }
    }

    /* access modifiers changed from: protected */
    public void W() {
        super.W();
        bq bqVar = this.f10896l0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().j();
        }
    }

    public void X() {
        b0();
        if (!nq.a(this.f10896l0)) {
            if (t.a()) {
                this.f9927c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            f();
        } else if (!this.f11319e0) {
            a(bq.d.COMPANION, "creativeView");
            this.f10896l0.getAdEventTracker().w();
            super.X();
        }
    }

    public void a0() {
        super.a0();
        a(bq.d.VIDEO, this.f11316b0 ? "mute" : "unmute");
        this.f10896l0.getAdEventTracker().b(this.f11316b0);
    }

    /* access modifiers changed from: protected */
    public void c(long j10) {
        super.c(j10);
        this.f10896l0.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(j10), zp.e(this.f9926b));
    }

    public void d(String str) {
        a(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.f10896l0.getAdEventTracker().b(str);
        super.d(str);
    }

    public void f() {
        if (this.f10896l0 != null) {
            a(bq.d.VIDEO, "close");
            a(bq.d.COMPANION, "close");
        }
        super.f();
    }

    public void w() {
        super.w();
        a(this.f11319e0 ? bq.d.COMPANION : bq.d.VIDEO, "pause");
        this.f10896l0.getAdEventTracker().z();
    }

    public void x() {
        super.x();
        a(this.f11319e0 ? bq.d.COMPANION : bq.d.VIDEO, "resume");
        this.f10896l0.getAdEventTracker().A();
    }

    public void z() {
        this.Y.c();
        super.z();
    }

    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(bq.d.VIDEO_CLICK);
        this.f10896l0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    private void a(bq.d dVar) {
        a(dVar, gq.UNSPECIFIED);
    }

    private void a(bq.d dVar, gq gqVar) {
        a(dVar, MaxReward.DEFAULT_LABEL, gqVar);
    }

    private void a(bq.d dVar, String str) {
        a(dVar, str, gq.UNSPECIFIED);
    }

    private void a(bq.d dVar, String str, gq gqVar) {
        a(this.f10896l0.a(dVar, str), gqVar);
    }

    /* access modifiers changed from: private */
    public void a(Set set) {
        a(set, gq.UNSPECIFIED);
    }

    private void a(Set set, gq gqVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.N.getCurrentPosition());
            pq p12 = this.f10896l0.p1();
            Uri c10 = p12 != null ? p12.c() : null;
            if (t.a()) {
                t tVar = this.f9927c;
                tVar.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
            }
            nq.a(set, seconds, c10, gqVar, this.f9926b);
        }
    }

    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.Y.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (t4.b) new a());
        ArrayList arrayList = new ArrayList();
        o oVar = this.O;
        if (oVar != null) {
            arrayList.add(new kg(oVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        g gVar = this.P;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        f3 f3Var = this.Q;
        if (f3Var != null) {
            arrayList.add(new kg(f3Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.T;
        if (progressBar != null) {
            arrayList.add(new kg(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            arrayList.add(new kg(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        l lVar = this.S;
        if (lVar != null) {
            arrayList.add(new kg(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f9933j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9933j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f10896l0.getAdEventTracker().b((View) this.M, (List) arrayList);
    }
}
