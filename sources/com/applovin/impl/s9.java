package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.g;
import com.applovin.impl.adview.l;
import com.applovin.impl.nh;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.sr;
import com.applovin.impl.t4;
import com.applovin.impl.yh;
import com.applovin.impl.zj;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class s9 extends n9 implements AppLovinCommunicatorSubscriber {
    private final u9 L = new u9(this.f9925a, this.f9928d, this.f9926b);
    protected final com.applovin.exoplayer2.ui.e M;
    protected final zj N;
    protected final o O;
    protected final g P;
    protected f3 Q;
    protected final ImageView R;
    protected l S;
    protected final ProgressBar T;
    protected ProgressBar U;
    private final d V;
    private final Handler W;
    private final Handler X;
    protected final t4 Y;
    protected final t4 Z;

    /* renamed from: a0  reason: collision with root package name */
    private final boolean f11315a0;

    /* renamed from: b0  reason: collision with root package name */
    protected boolean f11316b0;

    /* renamed from: c0  reason: collision with root package name */
    protected long f11317c0;

    /* renamed from: d0  reason: collision with root package name */
    protected int f11318d0;

    /* renamed from: e0  reason: collision with root package name */
    protected boolean f11319e0;

    /* renamed from: f0  reason: collision with root package name */
    protected boolean f11320f0;

    /* renamed from: g0  reason: collision with root package name */
    private long f11321g0;

    /* renamed from: h0  reason: collision with root package name */
    private final AtomicBoolean f11322h0;

    /* renamed from: i0  reason: collision with root package name */
    private final AtomicBoolean f11323i0;

    /* renamed from: j0  reason: collision with root package name */
    private long f11324j0;

    /* renamed from: k0  reason: collision with root package name */
    private long f11325k0;

    class a implements t4.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11326a;

        a(int i10) {
            this.f11326a = i10;
        }

        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.Q != null) {
                long seconds = ((long) this.f11326a) - TimeUnit.MILLISECONDS.toSeconds(s9Var.M.getPlayer().getCurrentPosition());
                if (seconds <= 0) {
                    s9.this.f9945v = true;
                } else if (s9.this.T()) {
                    s9.this.Q.setProgress((int) seconds);
                }
            }
        }

        public boolean b() {
            return s9.this.T();
        }
    }

    class b implements t4.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f11328a;

        b(Integer num) {
            this.f11328a = num;
        }

        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.f11319e0) {
                s9Var.T.setVisibility(8);
                return;
            }
            s9.this.T.setProgress((int) ((((float) s9Var.N.getCurrentPosition()) / ((float) s9.this.f11317c0)) * ((float) this.f11328a.intValue())));
        }

        public boolean b() {
            return !s9.this.f11319e0;
        }
    }

    class c implements t4.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f11331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Long f11332c;

        c(long j10, Integer num, Long l10) {
            this.f11330a = j10;
            this.f11331b = num;
            this.f11332c = l10;
        }

        public void a() {
            s9.this.U.setProgress((int) ((((float) s9.this.f9941r) / ((float) this.f11330a)) * ((float) this.f11331b.intValue())));
            s9.this.f9941r += this.f11332c.longValue();
        }

        public boolean b() {
            return s9.this.f9941r < this.f11330a;
        }
    }

    private class d implements sr.a {
        private d() {
        }

        public void a(l lVar) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                s9.this.f9927c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            s9.this.f();
        }

        public void b(l lVar) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                s9.this.f9927c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        public void c(l lVar) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                s9.this.f9927c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            s9.this.I = true;
        }

        public void d(l lVar) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                s9.this.f9927c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            s9.this.Y();
        }

        /* synthetic */ d(s9 s9Var, a aVar) {
            this();
        }

        public void a(l lVar, Bundle bundle) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                s9.this.f9927c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        public void b(Uri uri, l lVar) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                s9.this.f9927c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, s9.this.f9932i.getController().i(), s9.this.f9926b);
        }

        public void a(Uri uri, l lVar) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                s9.this.f9927c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, s9.this.f9932i.getController(), s9.this.f9926b);
        }
    }

    private class e implements nh.c, d.e, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        public /* synthetic */ void a(int i10) {
            uz.a(this, i10);
        }

        public /* synthetic */ void a(go goVar, int i10) {
            uz.b(this, goVar, i10);
        }

        public void a(kh khVar) {
            s9 s9Var = s9.this;
            s9Var.d("Video view error (" + zp.a(khVar, s9.this.f9926b) + ")");
            s9.this.f();
        }

        public /* synthetic */ void a(mh mhVar) {
            uz.d(this, mhVar);
        }

        public /* synthetic */ void a(nh.b bVar) {
            uz.e(this, bVar);
        }

        public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i10) {
            uz.f(this, fVar, fVar2, i10);
        }

        public /* synthetic */ void a(nh nhVar, nh.d dVar) {
            uz.g(this, nhVar, dVar);
        }

        public /* synthetic */ void a(od odVar, int i10) {
            uz.h(this, odVar, i10);
        }

        public /* synthetic */ void a(qd qdVar) {
            uz.i(this, qdVar);
        }

        public /* synthetic */ void a(qo qoVar, uo uoVar) {
            uz.j(this, qoVar, uoVar);
        }

        public /* synthetic */ void a(boolean z10, int i10) {
            uz.k(this, z10, i10);
        }

        public /* synthetic */ void b() {
            uz.l(this);
        }

        public void b(int i10) {
            t tVar = s9.this.f9927c;
            if (t.a()) {
                t tVar2 = s9.this.f9927c;
                tVar2.a("AppLovinFullscreenActivity", "Player state changed to state " + i10 + " and will play when ready: " + s9.this.N.l());
            }
            if (i10 == 2) {
                s9.this.W();
            } else if (i10 == 3) {
                s9 s9Var = s9.this;
                s9Var.N.a(s9Var.f11316b0 ^ true ? 1.0f : 0.0f);
                s9 s9Var2 = s9.this;
                s9Var2.f9944u = (int) TimeUnit.MILLISECONDS.toSeconds(s9Var2.N.getDuration());
                s9 s9Var3 = s9.this;
                s9Var3.c(s9Var3.N.getDuration());
                s9.this.Q();
                t tVar3 = s9.this.f9927c;
                if (t.a()) {
                    t tVar4 = s9.this.f9927c;
                    tVar4.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + s9.this.N);
                }
                s9.this.Y.b();
                s9 s9Var4 = s9.this;
                if (s9Var4.P != null) {
                    s9Var4.R();
                }
                s9.this.G();
                if (s9.this.F.b()) {
                    s9.this.z();
                }
            } else if (i10 == 4) {
                t tVar5 = s9.this.f9927c;
                if (t.a()) {
                    s9.this.f9927c.a("AppLovinFullscreenActivity", "Video completed");
                }
                s9 s9Var5 = s9.this;
                s9Var5.f11320f0 = true;
                if (!s9Var5.f9943t) {
                    s9Var5.X();
                } else if (s9Var5.l()) {
                    s9.this.V();
                }
            }
        }

        public /* synthetic */ void b(kh khVar) {
            uz.m(this, khVar);
        }

        public /* synthetic */ void b(boolean z10) {
            uz.n(this, z10);
        }

        public /* synthetic */ void b(boolean z10, int i10) {
            uz.o(this, z10, i10);
        }

        public /* synthetic */ void c(int i10) {
            uz.p(this, i10);
        }

        public /* synthetic */ void c(boolean z10) {
            uz.q(this, z10);
        }

        public void d(int i10) {
            if (i10 == 0) {
                s9.this.M.c();
            }
        }

        public /* synthetic */ void d(boolean z10) {
            uz.r(this, z10);
        }

        public /* synthetic */ void e(int i10) {
            uz.s(this, i10);
        }

        public /* synthetic */ void e(boolean z10) {
            uz.t(this, z10);
        }

        public void onClick(View view, MotionEvent motionEvent) {
            s9.this.a(motionEvent, (Bundle) null);
        }

        /* synthetic */ e(s9 s9Var, a aVar) {
            this();
        }
    }

    private class f implements View.OnClickListener {
        private f() {
        }

        public void onClick(View view) {
            s9 s9Var = s9.this;
            if (view == s9Var.P) {
                s9Var.Y();
            } else if (view == s9Var.R) {
                s9Var.a0();
            } else if (t.a()) {
                t tVar = s9.this.f9927c;
                tVar.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(s9 s9Var, a aVar) {
            this();
        }
    }

    public s9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        d dVar = new d(this, (a) null);
        this.V = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.W = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.X = handler2;
        t4 t4Var = new t4(handler, this.f9926b);
        this.Y = t4Var;
        this.Z = new t4(handler2, this.f9926b);
        boolean G0 = this.f9925a.G0();
        this.f11315a0 = G0;
        this.f11316b0 = zp.e(this.f9926b);
        this.f11321g0 = -1;
        this.f11322h0 = new AtomicBoolean();
        this.f11323i0 = new AtomicBoolean();
        this.f11324j0 = -2;
        this.f11325k0 = 0;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.f10361n1, kVar)) {
                a(!G0);
            }
            f fVar = new f(this, (a) null);
            if (bVar.k0() >= 0) {
                g gVar = new g(bVar.b0(), activity);
                this.P = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.P = null;
            }
            boolean z10 = true;
            if (a(this.f11316b0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.f11316b0);
            } else {
                this.R = null;
            }
            String g02 = bVar.g0();
            if (StringUtils.isValidString(g02)) {
                sr srVar = new sr(kVar);
                srVar.a(new WeakReference(dVar));
                l lVar = new l(bVar.f0(), bVar, srVar, activity);
                this.S = lVar;
                lVar.a(g02);
            } else {
                this.S = null;
            }
            if (G0) {
                o oVar = new o(activity, ((Integer) kVar.a(oj.F2)).intValue(), 16842874);
                this.O = oVar;
                oVar.setColor(Color.parseColor("#75FFFFFF"));
                oVar.setBackgroundColor(Color.parseColor("#00000000"));
                oVar.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.O = null;
            }
            int g10 = g();
            z10 = (!((Boolean) kVar.a(oj.f10362n2)).booleanValue() || g10 <= 0) ? false : z10;
            if (this.Q == null && z10) {
                this.Q = new f3(activity);
                int q10 = bVar.q();
                this.Q.setTextColor(q10);
                this.Q.setTextSize((float) ((Integer) kVar.a(oj.f10354m2)).intValue());
                this.Q.setFinishedStrokeColor(q10);
                this.Q.setFinishedStrokeWidth((float) ((Integer) kVar.a(oj.f10346l2)).intValue());
                this.Q.setMax(g10);
                this.Q.setProgress(g10);
                t4Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1), (t4.b) new a(g10));
            }
            if (bVar.r0()) {
                Integer num = (Integer) kVar.a(oj.D2);
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.T = progressBar;
                a(progressBar, bVar.q0(), num.intValue());
                t4Var.a("PROGRESS_BAR", ((Long) kVar.a(oj.C2)).longValue(), (t4.b) new b(num));
            } else {
                this.T = null;
            }
            zj a10 = new zj.b(activity).a();
            this.N = a10;
            e eVar = new e(this, (a) null);
            a10.a((nh.c) eVar);
            a10.a(0);
            com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(activity);
            this.M = eVar2;
            eVar2.c();
            eVar2.setControllerVisibilityListener(eVar);
            eVar2.setPlayer(a10);
            eVar2.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.A0, activity, eVar));
            bVar.e().putString("video_view_address", ar.a((View) eVar2));
            S();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K() {
        this.f11324j0 = -1;
        this.f11325k0 = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L() {
        a(250);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.f9940q = SystemClock.elapsedRealtime();
    }

    private void O() {
        l lVar;
        rq i02 = this.f9925a.i0();
        if (i02 != null && i02.j() && !this.f11319e0 && (lVar = this.S) != null) {
            AppLovinSdkUtils.runOnUiThread(new z40(this, lVar.getVisibility() == 4, i02.h()));
        }
    }

    /* access modifiers changed from: private */
    public void V() {
        this.L.a(this.f9935l);
        this.f9940q = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10, long j10) {
        if (z10) {
            ar.a((View) this.S, j10, (Runnable) null);
        } else {
            ar.b(this.S, j10, (Runnable) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        ur.a(this.S, str, "AppLovinFullscreenActivity", this.f9926b);
    }

    public void A() {
        a((ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    public int E() {
        zj zjVar = this.N;
        if (zjVar == null) {
            return 0;
        }
        long currentPosition = zjVar.getCurrentPosition();
        if (this.f11320f0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.f11317c0)) * 100.0f);
        }
        return this.f11318d0;
    }

    public void F() {
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
        X();
    }

    /* access modifiers changed from: protected */
    public void G() {
        AppLovinSdkUtils.runOnUiThread(new v40(this));
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        com.applovin.impl.sdk.ad.b bVar = this.f9925a;
        if (bVar == null) {
            return false;
        }
        if (bVar.W0()) {
            return this.I;
        }
        return I();
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return E() >= this.f9925a.m0();
    }

    /* access modifiers changed from: protected */
    public void P() {
        if (this.f11319e0) {
            if (t.a()) {
                this.f9927c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (!this.f9926b.f0().isApplicationPaused()) {
            long j10 = this.f11321g0;
            if (j10 >= 0) {
                if (t.a()) {
                    t tVar = this.f9927c;
                    tVar.a("AppLovinFullscreenActivity", "Resuming video at position " + j10 + "ms for MediaPlayer: " + this.N);
                }
                this.N.a(true);
                this.Y.b();
                this.f11321g0 = -1;
                if (!this.N.isPlaying()) {
                    W();
                }
            } else if (t.a()) {
                t tVar2 = this.f9927c;
                tVar2.a("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.N.isPlaying());
            }
        } else if (t.a()) {
            this.f9927c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
        }
    }

    /* access modifiers changed from: protected */
    public void Q() {
        long j10;
        long millis;
        long j11 = 0;
        if (this.f9925a.U() >= 0 || this.f9925a.V() >= 0) {
            if (this.f9925a.U() >= 0) {
                j10 = this.f9925a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f9925a;
                long j12 = this.f11317c0;
                if (j12 > 0) {
                    j11 = j12;
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
    public void R() {
        if (this.f11323i0.compareAndSet(false, true)) {
            a(this.P, this.f9925a.k0(), new x40(this));
        }
    }

    /* access modifiers changed from: protected */
    public void S() {
        if (!zp.a(oj.f10361n1, this.f9926b)) {
            b(!this.f11315a0);
        }
        Activity activity = this.f9928d;
        yh a10 = new yh.b(new u5(activity, yp.a((Context) activity, "com.applovin.sdk"))).a(od.a(this.f9925a.s0()));
        this.N.a(this.f11316b0 ^ true ? 1.0f : 0.0f);
        this.N.a((wd) a10);
        this.N.b();
        this.N.a(false);
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return !this.f9945v && !this.f11319e0 && this.M.getPlayer().isPlaying();
    }

    /* access modifiers changed from: protected */
    public boolean U() {
        return l() && !H();
    }

    /* access modifiers changed from: protected */
    public void W() {
        AppLovinSdkUtils.runOnUiThread(new t40(this));
    }

    public void X() {
        Z();
        long T2 = this.f9925a.T();
        if (T2 > 0) {
            this.f9941r = 0;
            Long l10 = (Long) this.f9926b.a(oj.L2);
            Integer num = (Integer) this.f9926b.a(oj.O2);
            ProgressBar progressBar = new ProgressBar(this.f9928d, (AttributeSet) null, 16842872);
            this.U = progressBar;
            a(progressBar, this.f9925a.S(), num.intValue());
            this.Z.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), (t4.b) new c(T2, num, l10));
            this.Z.b();
        }
        this.L.a(this.f9934k, this.f9933j, this.f9932i, this.U);
        a("javascript:al_onPoststitialShow(" + this.f9948y + "," + this.f9949z + ");", (long) this.f9925a.D());
        if (this.f9934k != null) {
            if (this.f9925a.p() >= 0) {
                a(this.f9934k, this.f9925a.p(), new u40(this));
            } else {
                this.f9934k.setVisibility(0);
            }
        }
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
        ProgressBar progressBar2 = this.U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f9925a.getAdEventTracker().b((View) this.f9932i, (List) arrayList);
        t();
        this.f11319e0 = true;
    }

    public void Y() {
        this.f11324j0 = SystemClock.elapsedRealtime() - this.f11325k0;
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.f11324j0 + "ms");
        }
        if (U()) {
            z();
            r();
            if (t.a()) {
                this.f9927c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.F.e();
            return;
        }
        F();
    }

    /* access modifiers changed from: protected */
    public void Z() {
        this.f11318d0 = E();
        this.N.a(false);
    }

    /* access modifiers changed from: protected */
    public void a0() {
        boolean z10 = this.f11316b0;
        this.f11316b0 = !z10;
        this.N.a(z10 ? 1.0f : 0.0f);
        e(this.f11316b0);
        a(this.f11316b0, 0);
    }

    public void c(boolean z10) {
        super.c(z10);
        if (z10) {
            a(0);
            if (this.f11319e0) {
                this.Z.b();
            }
        } else if (this.f11319e0) {
            this.Z.c();
        } else {
            z();
        }
    }

    /* access modifiers changed from: protected */
    public void d(String str) {
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f9925a);
        }
        if (this.f11322h0.compareAndSet(false, true)) {
            if (zp.a(oj.f10329j1, this.f9926b)) {
                this.f9926b.D().d(this.f9925a, k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.f9926b.B().a(this.f9925a instanceof bq ? "handleVastExoPlayerError" : "handleExoPlayerError", str, this.f9925a);
            f();
        }
    }

    public void f() {
        this.Y.a();
        this.Z.a();
        this.W.removeCallbacksAndMessages((Object) null);
        this.X.removeCallbacksAndMessages((Object) null);
        q();
        super.f();
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    public void i() {
        super.i();
        V();
    }

    public void j() {
        super.j();
        this.L.a((View) this.S);
        this.L.a((View) this.P);
        if (!l() || this.f11319e0) {
            V();
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f9925a.getAdIdNumber() && this.f11315a0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i10 < 200 || i10 >= 300) && !this.f11320f0 && !this.N.isPlaying()) {
                    d("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.a(E(), this.f11315a0, H(), this.f11324j0);
    }

    public void v() {
        if (((Boolean) this.f9926b.a(oj.f10326i6)).booleanValue()) {
            ur.b(this.S);
            this.S = null;
        }
        this.N.V();
        if (this.f11315a0) {
            AppLovinCommunicator.getInstance(this.f9928d).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
        }
        super.v();
    }

    public void z() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.N.isPlaying()) {
            this.f11321g0 = this.N.getCurrentPosition();
            this.N.a(false);
            this.Y.c();
            if (t.a()) {
                t tVar = this.f9927c;
                tVar.a("AppLovinFullscreenActivity", "Paused video at position " + this.f11321g0 + "ms");
            }
        } else if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Nothing to pause");
        }
    }

    /* access modifiers changed from: protected */
    public void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f9925a.F0()) {
            if (t.a()) {
                this.f9927c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri j02 = this.f9925a.j0();
            if (j02 != null) {
                if (!((Boolean) this.f9926b.a(oj.N)).booleanValue() || (context = this.f9928d) == null) {
                    AppLovinAdView appLovinAdView = this.f9932i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : k.k();
                }
                this.f9926b.i().trackAndLaunchVideoClick(this.f9925a, j02, motionEvent, bundle, this, context);
                bc.a(this.C, (AppLovinAd) this.f9925a);
                this.f9949z++;
                return;
            }
            return;
        }
        O();
    }

    /* access modifiers changed from: protected */
    public void e(boolean z10) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f9928d.getDrawable(z10 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.R.setScaleType(ImageView.ScaleType.FIT_XY);
                this.R.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.R, z10 ? this.f9925a.L() : this.f9925a.e0(), this.f9926b);
    }

    public void b() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        F();
    }

    /* access modifiers changed from: protected */
    public void c(long j10) {
        this.f11317c0 = j10;
    }

    public void c() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
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

    /* access modifiers changed from: protected */
    public void a(String str, long j10) {
        super.a(str, j10);
        if (this.S != null && j10 >= 0 && StringUtils.isValidString(str) && ((Boolean) this.f9926b.a(oj.R2)).booleanValue()) {
            a((Runnable) new y40(this, str), j10);
        }
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        if (x3.f()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i10));
        }
    }

    public void a(ViewGroup viewGroup) {
        this.L.a(this.R, this.P, this.S, this.O, this.T, this.Q, this.M, this.f9932i, this.f9933j, (ImageView) null, viewGroup);
        com.applovin.impl.adview.k kVar = this.f9933j;
        if (kVar != null) {
            kVar.b();
        }
        this.N.a(true);
        if (this.f9925a.Z0()) {
            this.F.b(this.f9925a, (Runnable) new w40(this));
        }
        if (this.f11315a0) {
            W();
        }
        this.f9932i.renderAd(this.f9925a);
        if (this.P != null) {
            this.f9926b.l0().a(new kn(this.f9926b, "scheduleSkipButton", new s40(this)), sm.b.TIMEOUT, this.f9925a.l0(), true);
        }
        super.d(this.f11316b0);
    }

    public void a(long j10) {
        a((Runnable) new r40(this), j10);
    }
}
