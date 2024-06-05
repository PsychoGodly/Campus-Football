package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
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
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.g;
import com.applovin.impl.adview.l;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.sr;
import com.applovin.impl.t4;
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
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class t9 extends n9 implements AppLovinCommunicatorSubscriber {
    private final u9 L = new u9(this.f9925a, this.f9928d, this.f9926b);
    /* access modifiers changed from: private */
    public MediaPlayer M;
    protected final AppLovinVideoView N;
    protected final o O;
    protected final g P;
    protected f3 Q;
    protected final ImageView R;
    protected l S;
    protected final ProgressBar T;
    protected ProgressBar U;
    protected ImageView V = null;
    /* access modifiers changed from: private */
    public final e W;
    private final d X;
    private final Handler Y;
    private final Handler Z;

    /* renamed from: a0  reason: collision with root package name */
    protected final t4 f12288a0;

    /* renamed from: b0  reason: collision with root package name */
    protected final t4 f12289b0;

    /* renamed from: c0  reason: collision with root package name */
    private final boolean f12290c0;

    /* renamed from: d0  reason: collision with root package name */
    protected boolean f12291d0;

    /* renamed from: e0  reason: collision with root package name */
    protected long f12292e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f12293f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f12294g0;

    /* renamed from: h0  reason: collision with root package name */
    protected boolean f12295h0;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12296i0;

    /* renamed from: j0  reason: collision with root package name */
    private final AtomicBoolean f12297j0;

    /* renamed from: k0  reason: collision with root package name */
    private final AtomicBoolean f12298k0;

    /* renamed from: l0  reason: collision with root package name */
    private long f12299l0;

    /* renamed from: m0  reason: collision with root package name */
    private long f12300m0;

    class a implements t4.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12301a;

        a(int i10) {
            this.f12301a = i10;
        }

        public void a() {
            t9 t9Var = t9.this;
            if (t9Var.Q != null) {
                long seconds = ((long) this.f12301a) - TimeUnit.MILLISECONDS.toSeconds((long) t9Var.N.getCurrentPosition());
                if (seconds <= 0) {
                    t9.this.f9945v = true;
                } else if (t9.this.T()) {
                    t9.this.Q.setProgress((int) seconds);
                }
            }
        }

        public boolean b() {
            return t9.this.T();
        }
    }

    class b implements t4.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f12303a;

        b(Integer num) {
            this.f12303a = num;
        }

        public void a() {
            t9 t9Var = t9.this;
            if (t9Var.f12295h0) {
                t9Var.T.setVisibility(8);
                return;
            }
            t9.this.T.setProgress((int) ((((float) t9Var.N.getCurrentPosition()) / ((float) t9.this.f12292e0)) * ((float) this.f12303a.intValue())));
        }

        public boolean b() {
            return !t9.this.f12295h0;
        }
    }

    class c implements t4.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f12305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f12306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Long f12307c;

        c(long j10, Integer num, Long l10) {
            this.f12305a = j10;
            this.f12306b = num;
            this.f12307c = l10;
        }

        public void a() {
            t9.this.U.setProgress((int) ((((float) t9.this.f9941r) / ((float) this.f12305a)) * ((float) this.f12306b.intValue())));
            t9.this.f9941r += this.f12307c.longValue();
        }

        public boolean b() {
            return t9.this.f9941r < this.f12305a;
        }
    }

    private class d implements sr.a {
        private d() {
        }

        public void a(l lVar) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            t9.this.f();
        }

        public void b(l lVar) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        public void c(l lVar) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            t9.this.I = true;
        }

        public void d(l lVar) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            t9.this.Y();
        }

        /* synthetic */ d(t9 t9Var, a aVar) {
            this();
        }

        public void a(l lVar, Bundle bundle) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        public void b(Uri uri, l lVar) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, t9.this.f9932i.getController().i(), t9.this.f9926b);
        }

        public void a(Uri uri, l lVar) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, t9.this.f9932i.getController(), t9.this.f9926b);
        }
    }

    private class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        public void onClick(View view, MotionEvent motionEvent) {
            t9.this.a(motionEvent, (Bundle) null);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t9.this.f9927c.a("AppLovinFullscreenActivity", "Video completed");
            }
            boolean unused = t9.this.f12296i0 = true;
            t9 t9Var = t9.this;
            if (!t9Var.f9943t) {
                t9Var.X();
            } else if (t9Var.l()) {
                t9.this.V();
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            t9 t9Var = t9.this;
            t9Var.d("Video view error (" + i10 + "," + i11 + ")");
            t9.this.N.start();
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t tVar2 = t9.this.f9927c;
                tVar2.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i10 + ", " + i11 + ")");
            }
            if (i10 == 701) {
                t9.this.W();
                return false;
            } else if (i10 == 3) {
                t9.this.f12288a0.b();
                t9 t9Var = t9.this;
                if (t9Var.P != null) {
                    t9Var.S();
                }
                t9.this.G();
                if (!t9.this.F.b()) {
                    return false;
                }
                t9.this.z();
                return false;
            } else if (i10 != 702) {
                return false;
            } else {
                t9.this.G();
                return false;
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = t9.this.M = mediaPlayer;
            mediaPlayer.setOnInfoListener(t9.this.W);
            mediaPlayer.setOnErrorListener(t9.this.W);
            float f10 = t9.this.f12291d0 ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            t9.this.f9944u = (int) TimeUnit.MILLISECONDS.toSeconds((long) mediaPlayer.getDuration());
            t9.this.c((long) mediaPlayer.getDuration());
            t9.this.R();
            t tVar = t9.this.f9927c;
            if (t.a()) {
                t tVar2 = t9.this.f9927c;
                tVar2.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + t9.this.M);
            }
        }

        /* synthetic */ e(t9 t9Var, a aVar) {
            this();
        }
    }

    private class f implements View.OnClickListener {
        private f() {
        }

        public void onClick(View view) {
            t9 t9Var = t9.this;
            if (view == t9Var.P) {
                t9Var.Y();
            } else if (view == t9Var.R) {
                t9Var.Z();
            } else if (t.a()) {
                t tVar = t9.this.f9927c;
                tVar.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(t9 t9Var, a aVar) {
            this();
        }
    }

    public t9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        e eVar = new e(this, (a) null);
        this.W = eVar;
        d dVar = new d(this, (a) null);
        this.X = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Y = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.Z = handler2;
        t4 t4Var = new t4(handler, this.f9926b);
        this.f12288a0 = t4Var;
        this.f12289b0 = new t4(handler2, this.f9926b);
        boolean G0 = this.f9925a.G0();
        this.f12290c0 = G0;
        this.f12291d0 = zp.e(this.f9926b);
        this.f12294g0 = -1;
        this.f12297j0 = new AtomicBoolean();
        this.f12298k0 = new AtomicBoolean();
        this.f12299l0 = -2;
        this.f12300m0 = 0;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.f10361n1, kVar)) {
                a(!G0);
            }
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.N = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(eVar);
            appLovinVideoView.setOnCompletionListener(eVar);
            appLovinVideoView.setOnErrorListener(eVar);
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.A0, activity, eVar));
            bVar.e().putString("video_view_address", ar.a((View) appLovinVideoView));
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
            if (a(this.f12291d0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.f12291d0);
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
                return;
            }
            this.T = null;
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
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
            o oVar2 = this.O;
            Objects.requireNonNull(oVar2);
            a((Runnable) new e50(oVar2), 2000);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f12299l0 = -1;
        this.f12300m0 = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M() {
        a(250);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.f9940q = SystemClock.elapsedRealtime();
    }

    private void P() {
        l lVar;
        rq i02 = this.f9925a.i0();
        if (i02 != null && i02.j() && !this.f12295h0 && (lVar = this.S) != null) {
            AppLovinSdkUtils.runOnUiThread(new f50(this, lVar.getVisibility() == 4, i02.h()));
        }
    }

    /* access modifiers changed from: private */
    public void Q() {
        if (this.f12295h0) {
            if (t.a()) {
                this.f9927c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f9926b.f0().isApplicationPaused()) {
            if (t.a()) {
                this.f9927c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.f12294g0 >= 0) {
            if (t.a()) {
                t tVar = this.f9927c;
                tVar.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f12294g0 + "ms for MediaPlayer: " + this.M);
            }
            this.N.seekTo(this.f12294g0);
            this.N.start();
            this.f12288a0.b();
            this.f12294g0 = -1;
            a((Runnable) new j50(this), 250);
        } else if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    /* access modifiers changed from: private */
    public void S() {
        if (this.f12298k0.compareAndSet(false, true)) {
            a(this.P, this.f9925a.k0(), new n50(this));
        }
    }

    /* access modifiers changed from: private */
    public void V() {
        this.L.a(this.f9935l);
        this.f9940q = SystemClock.elapsedRealtime();
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
        long currentPosition = (long) this.N.getCurrentPosition();
        if (this.f12296i0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.f12292e0)) * 100.0f);
        }
        return this.f12293f0;
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
        AppLovinSdkUtils.runOnUiThread(new g50(this));
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        if (this.f9925a.W0()) {
            return this.I;
        }
        return I();
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return E() >= this.f9925a.m0();
    }

    /* access modifiers changed from: protected */
    public void R() {
        long j10;
        long millis;
        long j11 = 0;
        if (this.f9925a.U() >= 0 || this.f9925a.V() >= 0) {
            if (this.f9925a.U() >= 0) {
                j10 = this.f9925a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f9925a;
                long j12 = this.f12292e0;
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
    public boolean T() {
        return !this.f9945v && !this.f12295h0 && this.N.isPlaying();
    }

    /* access modifiers changed from: protected */
    public boolean U() {
        return l() && !H();
    }

    /* access modifiers changed from: protected */
    public void W() {
        AppLovinSdkUtils.runOnUiThread(new h50(this));
    }

    public void X() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f9925a.c1());
        long T2 = this.f9925a.T();
        if (T2 > 0) {
            this.f9941r = 0;
            Long l10 = (Long) this.f9926b.a(oj.L2);
            Integer num = (Integer) this.f9926b.a(oj.O2);
            ProgressBar progressBar = new ProgressBar(this.f9928d, (AttributeSet) null, 16842872);
            this.U = progressBar;
            a(progressBar, this.f9925a.S(), num.intValue());
            this.f12289b0.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), (t4.b) new c(T2, num, l10));
            this.f12289b0.b();
        }
        this.L.a(this.f9934k, this.f9933j, this.f9932i, this.U);
        a("javascript:al_onPoststitialShow(" + this.f9948y + "," + this.f9949z + ");", (long) this.f9925a.D());
        if (this.f9934k != null) {
            if (this.f9925a.p() >= 0) {
                a(this.f9934k, this.f9925a.p(), new i50(this));
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
        this.f12295h0 = true;
    }

    public void Y() {
        this.f12299l0 = SystemClock.elapsedRealtime() - this.f12300m0;
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.f12299l0 + "ms");
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
        MediaPlayer mediaPlayer = this.M;
        if (mediaPlayer != null) {
            try {
                float f10 = this.f12291d0 ? 1.0f : 0.0f;
                mediaPlayer.setVolume(f10, f10);
                boolean z10 = !this.f12291d0;
                this.f12291d0 = z10;
                e(z10);
                a(this.f12291d0, 0);
            } catch (Throwable unused) {
            }
        }
    }

    public void f() {
        this.f12288a0.a();
        this.f12289b0.a();
        this.Y.removeCallbacksAndMessages((Object) null);
        this.Z.removeCallbacksAndMessages((Object) null);
        q();
        super.f();
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    public void i() {
        super.i();
        V();
    }

    public void j() {
        super.j();
        this.L.a((View) this.S);
        this.L.a((View) this.P);
        if (!l() || this.f12295h0) {
            V();
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f9925a.getAdIdNumber() && this.f12290c0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i10 < 200 || i10 >= 300) && !this.f12296i0 && !this.N.isPlaying()) {
                    d("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.a(E(), this.f12290c0, H(), this.f12299l0);
    }

    public void v() {
        if (t.a()) {
            this.f9927c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f9926b.a(oj.f10326i6)).booleanValue()) {
                ur.b(this.S);
                this.S = null;
            }
            if (this.f12290c0) {
                AppLovinCommunicator.getInstance(this.f9928d).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.N;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.N.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.M;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            t.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.v();
    }

    public void z() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f12294g0 = this.N.getCurrentPosition();
        this.N.pause();
        this.f12288a0.c();
        if (t.a()) {
            t tVar = this.f9927c;
            tVar.a("AppLovinFullscreenActivity", "Paused video at position " + this.f12294g0 + "ms");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10, long j10) {
        if (z10) {
            ar.a((View) this.S, j10, (Runnable) null);
        } else {
            ar.b(this.S, j10, (Runnable) null);
        }
    }

    private void e(boolean z10) {
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

    public void c(boolean z10) {
        super.c(z10);
        if (z10) {
            a(0);
            if (this.f12295h0) {
                this.f12289b0.b();
            }
        } else if (this.f12295h0) {
            this.f12289b0.c();
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
        if (this.f12297j0.compareAndSet(false, true)) {
            if (zp.a(oj.f10329j1, this.f9926b)) {
                this.f9926b.D().d(this.f9925a, k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.f9926b.B().a(this.f9925a instanceof bq ? "handleVastVideoError" : "handleVideoError", str, this.f9925a);
            f();
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
        P();
    }

    public void b() {
        if (t.a()) {
            this.f9927c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        F();
    }

    private void f(boolean z10) {
        this.f12293f0 = E();
        if (z10) {
            this.N.pause();
        } else {
            this.N.stopPlayback();
        }
    }

    /* access modifiers changed from: protected */
    public void c(long j10) {
        this.f12292e0 = j10;
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
            a((Runnable) new o50(this, str), j10);
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
        String str;
        this.L.a(this.R, this.P, this.S, this.O, this.T, this.Q, this.N, this.f9932i, this.f9933j, this.V, viewGroup);
        if (x3.i() && (str = this.f9926b.g0().getExtraParameters().get("audio_focus_request")) != null) {
            this.N.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (!zp.a(oj.f10361n1, this.f9926b)) {
            b(!this.f12290c0);
        }
        this.N.setVideoURI(this.f9925a.s0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f9925a.Z0()) {
            this.F.b(this.f9925a, (Runnable) new l50(this));
        }
        com.applovin.impl.adview.k kVar = this.f9933j;
        if (kVar != null) {
            kVar.b();
        }
        this.N.start();
        if (this.f12290c0) {
            W();
        }
        this.f9932i.renderAd(this.f9925a);
        if (this.P != null) {
            this.f9926b.l0().a(new kn(this.f9926b, "scheduleSkipButton", new m50(this)), sm.b.TIMEOUT, this.f9925a.l0(), true);
        }
        super.d(this.f12291d0);
    }

    public void a(long j10) {
        a((Runnable) new k50(this), j10);
    }
}
