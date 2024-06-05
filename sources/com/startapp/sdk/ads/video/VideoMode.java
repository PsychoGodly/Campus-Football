package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.facebook.ads.AdSDKNotificationListener;
import com.startapp.a0;
import com.startapp.a5;
import com.startapp.b6;
import com.startapp.d4;
import com.startapp.eb;
import com.startapp.ec;
import com.startapp.f9;
import com.startapp.fa;
import com.startapp.fc;
import com.startapp.ga;
import com.startapp.h0;
import com.startapp.i3;
import com.startapp.ia;
import com.startapp.j3;
import com.startapp.j4;
import com.startapp.j9;
import com.startapp.ja;
import com.startapp.ka;
import com.startapp.kc;
import com.startapp.l;
import com.startapp.la;
import com.startapp.ma;
import com.startapp.na;
import com.startapp.oa;
import com.startapp.p0;
import com.startapp.pa;
import com.startapp.qb;
import com.startapp.s9;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.w4;
import com.startapp.z;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class VideoMode extends d4 {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f16617q0 = 0;
    public VideoPlayerInterface K;
    public VideoView L;
    public RelativeLayout M;
    public RelativeLayout N;
    public ProgressBar O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T = 1;
    public boolean U;
    public boolean V;
    public int W = 0;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f16618a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public int f16619b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16620c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16621d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f16622e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f16623f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f16624g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public final Handler f16625h0 = new Handler();

    /* renamed from: i0  reason: collision with root package name */
    public final Map<Integer, Boolean> f16626i0 = new HashMap();

    /* renamed from: j0  reason: collision with root package name */
    public final Map<Integer, Boolean> f16627j0 = new HashMap();

    /* renamed from: k0  reason: collision with root package name */
    public final Map<Integer, List<FractionTrackingLink>> f16628k0 = new HashMap();

    /* renamed from: l0  reason: collision with root package name */
    public final Map<Integer, List<AbsoluteTrackingLink>> f16629l0 = new HashMap();

    /* renamed from: m0  reason: collision with root package name */
    public final Handler f16630m0 = new Handler();

    /* renamed from: n0  reason: collision with root package name */
    public final Runnable f16631n0 = new b();

    /* renamed from: o0  reason: collision with root package name */
    public boolean f16632o0;

    /* renamed from: p0  reason: collision with root package name */
    public final BroadcastReceiver f16633p0 = new c();

    /* compiled from: Sta */
    public enum HtmlMode {
        POST_ROLL
    }

    /* compiled from: Sta */
    public enum VideoFinishedReason {
        COMPLETE,
        CLICKED,
        SKIPPED
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: com.startapp.sdk.ads.video.VideoMode$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0168a implements Runnable {
            public C0168a() {
            }

            public void run() {
                try {
                    VideoMode videoMode = VideoMode.this;
                    int i10 = VideoMode.f16617q0;
                    videoMode.N();
                    VideoMode videoMode2 = VideoMode.this;
                    videoMode2.a(new VideoPlayerInterface.f(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", videoMode2.x()));
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
        }

        public a() {
        }

        public void run() {
            try {
                ProgressBar progressBar = VideoMode.this.O;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                VideoMode.this.f16625h0.postDelayed(new C0168a(), AdsCommonMetaData.f16770h.G().c());
            } catch (Throwable th) {
                VideoMode.this.N();
                i3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            VideoMode videoMode = VideoMode.this;
            if (videoMode.Q && videoMode.F()) {
                VideoMode videoMode2 = VideoMode.this;
                if (videoMode2.R) {
                    int x10 = videoMode2.x();
                    VideoMode videoMode3 = VideoMode.this;
                    int y10 = videoMode3.y();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long seconds = timeUnit.toSeconds((long) x10);
                    if (seconds > videoMode3.f16623f0) {
                        videoMode3.f16623f0 = seconds;
                        j9.a(videoMode3.f15723w, true, "videoApi.setVideoCurrentPosition", Long.valueOf(seconds));
                        if (x10 != y10 || videoMode3.f16621d0) {
                            y10 -= x10;
                        }
                        j9.a(videoMode3.f15723w, true, "videoApi.setVideoRemainingTimer", Long.valueOf(timeUnit.toSeconds((long) y10)));
                        if (videoMode3.I()) {
                            j9.a(videoMode3.f15723w, true, "videoApi.setSkipTimer", Long.valueOf(videoMode3.c(x10)));
                        }
                    }
                    VideoMode.this.e(x10);
                }
            }
            VideoMode.this.f16630m0.postDelayed(this, 200);
        }
    }

    /* compiled from: Sta */
    public class c extends BroadcastReceiver {
        public c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!VideoMode.this.f16633p0.isInitialStickyBroadcast()) {
                VideoMode videoMode = VideoMode.this;
                boolean unused = videoMode.P = !videoMode.P;
                VideoMode.this.J();
                VideoMode videoMode2 = VideoMode.this;
                videoMode2.a(videoMode2.P);
            }
        }
    }

    /* compiled from: Sta */
    public class d extends d4.h {
        public d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            VideoMode.this.j();
            VideoMode.this.v();
        }
    }

    public VideoAdDetails A() {
        return ((VideoEnabledAd) this.f16006l).x();
    }

    public final void B() {
        if (!this.f16002h.equals("back")) {
            return;
        }
        if (AdsCommonMetaData.f16770h.G().a().equals(VideoConfig.BackMode.BOTH)) {
            this.U = true;
            this.V = true;
        } else if (AdsCommonMetaData.f16770h.G().a().equals(VideoConfig.BackMode.SKIP)) {
            this.U = true;
            this.V = false;
        } else if (AdsCommonMetaData.f16770h.G().a().equals(VideoConfig.BackMode.CLOSE)) {
            this.U = false;
            this.V = true;
        } else if (AdsCommonMetaData.f16770h.G().a().equals(VideoConfig.BackMode.DISABLED)) {
            this.U = false;
            this.V = false;
        } else {
            this.U = false;
            this.V = false;
        }
    }

    public final void C() {
        String e10 = A().e();
        if (e10 != null) {
            this.f15723w.setWebViewClient(new d());
            j9.a(this.f15723w, e10);
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.K != null);
        j9.a(this.f15723w, true, "videoApi.setReplayEnabled", objArr);
        j9.a(this.f15723w, true, "videoApi.setMode", HtmlMode.POST_ROLL + "_" + A().f());
        j9.a(this.f15723w, true, "videoApi.setCloseable", Boolean.TRUE);
    }

    public final void D() {
        FractionTrackingLink[] c10 = A().i().c();
        if (c10 != null) {
            for (FractionTrackingLink fractionTrackingLink : c10) {
                List list = this.f16628k0.get(Integer.valueOf(fractionTrackingLink.e()));
                if (list == null) {
                    list = new ArrayList();
                    this.f16628k0.put(Integer.valueOf(fractionTrackingLink.e()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a10 = A().i().a();
        if (a10 != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a10) {
                List list2 = this.f16629l0.get(Integer.valueOf(absoluteTrackingLink.e()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f16629l0.put(Integer.valueOf(absoluteTrackingLink.e()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    public boolean E() {
        if (!this.X) {
            if (!F() || !this.Q) {
                return false;
            }
            return true;
        } else if (this.W < AdsCommonMetaData.f16770h.G().i() || !F() || !this.Q) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean F() {
        VideoPlayerInterface videoPlayerInterface = this.K;
        return videoPlayerInterface != null && ((NativeVideoPlayer) videoPlayerInterface).a();
    }

    public final boolean G() {
        ProgressBar progressBar = this.O;
        return progressBar != null && progressBar.isShown();
    }

    public final boolean H() {
        VideoPlayerInterface videoPlayerInterface;
        boolean n10 = A().n();
        Long h10 = A().h();
        if (h10 == null || (videoPlayerInterface = this.K) == null || !((NativeVideoPlayer) videoPlayerInterface).a()) {
            return n10;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return n10 && timeUnit.toSeconds((long) ((NativeVideoPlayer) this.K).f16687h.getDuration()) > timeUnit.toSeconds(h10.longValue());
    }

    public final boolean I() {
        return this.D > 0 || H() || this.U;
    }

    public void J() {
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface != null) {
            try {
                boolean z10 = this.P;
                MediaPlayer mediaPlayer = ((NativeVideoPlayer) videoPlayerInterface).f16686g;
                if (mediaPlayer != null) {
                    if (z10) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                i3.a(th);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.P ? "OFF" : "ON";
        j9.a(this.f15723w, true, "videoApi.setSound", objArr);
    }

    public void K() {
        if (this.K != null) {
            boolean p10 = AdsCommonMetaData.f16770h.G().p();
            String c10 = A().c();
            if (c10 != null) {
                VideoPlayerInterface videoPlayerInterface = this.K;
                if (videoPlayerInterface != null) {
                    ((NativeVideoPlayer) videoPlayerInterface).a(c10);
                }
                if (p10 && c10.endsWith(".temp")) {
                    this.X = true;
                    this.Z = true;
                    this.W = AdsCommonMetaData.f16770h.G().i();
                }
            } else if (p10) {
                String j10 = A().j();
                d dVar = d.b.f16664a;
                if (j10 != null && j10.equals(dVar.f16663c)) {
                    dVar.f16661a = false;
                }
                VideoPlayerInterface videoPlayerInterface2 = this.K;
                if (videoPlayerInterface2 != null) {
                    ((NativeVideoPlayer) videoPlayerInterface2).a(j10);
                }
                this.X = true;
                L();
            } else {
                a(VideoFinishedReason.SKIPPED);
            }
            if (this.f16624g0 == null) {
                this.f16624g0 = this.X ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            }
        }
    }

    public final void L() {
        if (!G()) {
            this.f16625h0.postDelayed(new a(), AdsCommonMetaData.f16770h.G().g());
        }
    }

    public final void M() {
        VideoView videoView;
        b6 b6Var;
        this.Y = true;
        if (this.f16621d0) {
            VideoPlayerInterface videoPlayerInterface = this.K;
            if (videoPlayerInterface != null) {
                ((NativeVideoPlayer) videoPlayerInterface).f16687h.pause();
                return;
            }
            return;
        }
        if (x() == 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j9.a(this.f15723w, true, "videoApi.setVideoDuration", Long.valueOf(timeUnit.toSeconds((long) y())));
            j9.a(this.f15723w, true, "videoApi.setVideoRemainingTimer", 0);
            j9.a(this.f15723w, true, "videoApi.setSkipTimer", Long.valueOf(timeUnit.toSeconds(z())));
            j9.a(this.f15723w, true, "videoApi.setVideoCurrentPosition", Long.valueOf(timeUnit.toSeconds((long) x())));
        }
        if (this.K != null) {
            if (x() == 0) {
                a((View) null);
            }
            VideoPlayerInterface videoPlayerInterface2 = this.K;
            if (videoPlayerInterface2 != null) {
                ((NativeVideoPlayer) videoPlayerInterface2).f16687h.start();
                this.f15723w.setBackgroundColor(33554431);
            }
            int y10 = y();
            if (y10 > 0 && (b6Var = this.G) != null) {
                float f10 = (float) y10;
                float f11 = this.P ? 0.0f : 1.0f;
                a5 a5Var = b6Var.f15656c;
                if (a5Var != null) {
                    if (f10 > 0.0f) {
                        a5Var.a(f11);
                        fc.a(a5Var.f15606a);
                        JSONObject jSONObject = new JSONObject();
                        qb.a(jSONObject, "duration", Float.valueOf(f10));
                        qb.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
                        qb.a(jSONObject, "deviceVolume", Float.valueOf(kc.a().f16070a));
                        ec.f15801a.a(a5Var.f15606a.f15795e.c(), "start", jSONObject);
                    } else {
                        throw new IllegalArgumentException("Invalid Media duration");
                    }
                }
            }
            N();
            if (this.Y && (videoView = this.L) != null) {
                b((View) videoView);
            }
        }
        this.f15997c.f16860b.setVisibility(4);
        J();
    }

    public final void N() {
        ProgressBar progressBar;
        this.f16625h0.removeCallbacksAndMessages((Object) null);
        if (G() && (progressBar = this.O) != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void O() {
        if (G()) {
            N();
        }
        a(VideoFinishedReason.SKIPPED);
        a(A().i().p(), new VideoTrackingParams(this.f16010p, b(this.f16622e0), this.D, this.f16624g0), this.f16622e0, "skipped");
    }

    public final int d(int i10) {
        return (y() * i10) / 100;
    }

    public void e() {
        a5 a5Var;
        if (!this.f16621d0 && !this.f15996b.isFinishing() && !this.V && !this.U) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            VideoPlayerInterface videoPlayerInterface = this.K;
            if (videoPlayerInterface != null) {
                ((NativeVideoPlayer) videoPlayerInterface).f16687h.pause();
                b6 b6Var = this.G;
                if (!(b6Var == null || (a5Var = b6Var.f15656c) == null)) {
                    fc.a(a5Var.f15606a);
                    ec.f15801a.a(a5Var.f15606a.f15795e.c(), "pause", (JSONObject) null);
                }
            }
            a(A().i().j(), new VideoPausedTrackingParams(this.f16010p, b(this.f16622e0), this.D, this.T, pauseOrigin, this.f16624g0), this.f16622e0, "paused");
        }
        VideoPlayerInterface videoPlayerInterface2 = this.K;
        if (videoPlayerInterface2 != null) {
            NativeVideoPlayer nativeVideoPlayer = (NativeVideoPlayer) videoPlayerInterface2;
            MediaPlayer mediaPlayer = nativeVideoPlayer.f16686g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener) null);
                nativeVideoPlayer.f16686g = null;
            }
            d.b.f16664a.f16662b = null;
            this.K = null;
        }
        N();
        if (this.f16632o0) {
            this.f15996b.unregisterReceiver(this.f16633p0);
            this.f16632o0 = false;
        }
        this.f16630m0.removeCallbacksAndMessages((Object) null);
        super.e();
    }

    public void f() {
        super.f();
        if (!this.f15996b.isFinishing()) {
            this.f15996b.registerReceiver(this.f16633p0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            this.f16632o0 = true;
            if (this.L == null) {
                Context a10 = h0.a(this.f15996b);
                if (a10 == null) {
                    a10 = this.f15996b;
                }
                this.N = (RelativeLayout) this.f15996b.findViewById(1475346432);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                VideoView videoView = new VideoView(a10);
                this.L = videoView;
                videoView.setId(100);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                ProgressBar progressBar = new ProgressBar(a10, (AttributeSet) null, 16843399);
                this.O = progressBar;
                progressBar.setVisibility(4);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(14);
                layoutParams3.addRule(15);
                RelativeLayout relativeLayout = new RelativeLayout(a10);
                this.M = relativeLayout;
                relativeLayout.setId(1475346436);
                this.f15996b.setContentView(this.M);
                this.M.addView(this.L, layoutParams2);
                this.M.addView(this.N, layoutParams);
                this.M.addView(this.O, layoutParams3);
                if (AdsConstants.f16777g.booleanValue()) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(12);
                    layoutParams4.addRule(14);
                    RelativeLayout relativeLayout2 = this.M;
                    TextView textView = new TextView(a10);
                    textView.setBackgroundColor(-16777216);
                    int i10 = a0.f15596a;
                    if (Build.VERSION.SDK_INT >= 11) {
                        textView.setAlpha(0.5f);
                    }
                    textView.setTextColor(-7829368);
                    textView.setSingleLine(false);
                    textView.setText("url=" + A().j());
                    relativeLayout2.addView(textView, layoutParams4);
                }
                this.f15997c.f16860b.setVisibility(4);
            }
            if (this.K == null) {
                this.K = new NativeVideoPlayer(this.L);
            }
            this.R = false;
            RelativeLayout relativeLayout3 = this.M;
            if (relativeLayout3 != null) {
                relativeLayout3.setBackgroundColor(-16777216);
            }
            K();
            if (this.f16621d0) {
                this.f15997c.f16860b.setVisibility(0);
                this.L.setVisibility(4);
            }
            VideoPlayerInterface videoPlayerInterface = this.K;
            com.startapp.sdk.ads.video.player.a aVar = (com.startapp.sdk.ads.video.player.a) videoPlayerInterface;
            aVar.f16708e = new ma(this);
            aVar.f16705b = new na(this);
            aVar.f16707d = new i(this);
            oa oaVar = new oa(this);
            aVar.f16706c = new pa(this);
            videoPlayerInterface.getClass();
            VideoPlayerInterface videoPlayerInterface2 = this.K;
            ((com.startapp.sdk.ads.video.player.a) videoPlayerInterface2).f16709f = oaVar;
            videoPlayerInterface2.getClass();
            VideoView videoView2 = this.L;
            ia iaVar = new ia(this);
            int i11 = a0.f15596a;
            if (Build.VERSION.SDK_INT >= 11) {
                videoView2.addOnLayoutChangeListener(new z(iaVar));
            }
            this.f16630m0.post(this.f16631n0);
        }
    }

    public void h() {
        if (!this.S) {
            w4.a((Context) this.f15996b).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
        }
    }

    public void i() {
        if (this.S) {
            return;
        }
        if (this.f16621d0 || this.L == null) {
            a(A().i().l(), new VideoTrackingParams(this.f16010p, b(this.f16622e0), this.D, this.f16624g0), this.f16622e0, "postrollClosed");
            super.i();
            return;
        }
        VideoPlayerInterface videoPlayerInterface = this.K;
        int currentPosition = videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f16687h.getCurrentPosition() : 0;
        a(A().i().i(), new VideoTrackingParams(this.f16010p, b(currentPosition), this.D, this.f16624g0), currentPosition, "closed");
    }

    public long k() {
        return TimeUnit.MILLISECONDS.toSeconds((long) x());
    }

    public j4 l() {
        Activity activity = this.f15996b;
        Runnable runnable = this.H;
        return new ga(activity, runnable, runnable, new la(this), new ka(this), new ja(this), new TrackingParams(this.f16010p), a(0));
    }

    public long m() {
        Long l10 = this.f16011q;
        if (l10 != null) {
            return TimeUnit.SECONDS.toMillis(l10.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f17070k.t());
    }

    public TrackingParams n() {
        return new VideoTrackingParams(this.f16010p, 0, this.D, this.f16624g0);
    }

    public void onClick(View view) {
        this.H.run();
    }

    public boolean p() {
        return this.f16006l.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    public void q() {
    }

    public void r() {
        this.Q = true;
        if (this.f16621d0) {
            b((View) this.f15723w);
            C();
            return;
        }
        j9.a(this.f15723w, true, "videoApi.setClickableVideo", Boolean.valueOf(A().l()));
        j9.a(this.f15723w, true, "videoApi.setMode", "PLAYER");
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(A().m() || this.V);
        j9.a(this.f15723w, true, "videoApi.setCloseable", objArr);
        j9.a(this.f15723w, true, "videoApi.setSkippable", Boolean.valueOf(I()));
        if (E()) {
            M();
        }
    }

    public void s() {
        int k10 = AdsCommonMetaData.f16770h.G().k();
        a(A().i().o(), new VideoTrackingParams(this.f16010p, k10, this.D, this.f16624g0), d(k10), "rewarded");
    }

    public final void w() {
        Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
        intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
        w4.a((Context) this.f15996b).a(intent);
        this.S = true;
    }

    public final int x() {
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface == null) {
            return this.f16622e0;
        }
        int currentPosition = ((NativeVideoPlayer) videoPlayerInterface).f16687h.getCurrentPosition();
        if (currentPosition > this.f16622e0) {
            this.f16622e0 = currentPosition;
        }
        return this.f16622e0;
    }

    public final int y() {
        VideoPlayerInterface videoPlayerInterface = this.K;
        if (videoPlayerInterface != null) {
            return ((NativeVideoPlayer) videoPlayerInterface).f16687h.getDuration();
        }
        return -1;
    }

    public final long z() {
        long g10 = A().g();
        VideoPlayerInterface videoPlayerInterface = this.K;
        return (videoPlayerInterface == null || !((NativeVideoPlayer) videoPlayerInterface).a()) ? g10 : Math.min(g10, (long) ((NativeVideoPlayer) this.K).f16687h.getDuration());
    }

    public void a(Bundle bundle) {
        boolean z10;
        super.a(bundle);
        try {
            this.f16619b0 = 100 / AdsCommonMetaData.f16770h.G().h();
            B();
            D();
            if (!A().o()) {
                if (!AdsCommonMetaData.f16770h.G().l().equals("muted")) {
                    z10 = false;
                    this.P = z10;
                }
            }
            z10 = true;
            this.P = z10;
        } catch (Throwable th) {
            i3.a(th);
            w();
            b();
        }
    }

    public void b(WebView webView) {
        this.B = false;
        webView.setOnTouchListener(new d4.e());
        a0.a(webView, (Paint) null);
    }

    public final long c(int i10) {
        if (this.U || this.D > 0) {
            return 0;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(z()) - timeUnit.toSeconds((long) i10);
        if (seconds <= 0) {
            return 0;
        }
        return seconds;
    }

    public final void b(View view) {
        j9.a(this.f15723w, true, "videoApi.setVideoFrame", Integer.valueOf(f9.b(this.f15996b, view.getLeft())), Integer.valueOf(f9.b(this.f15996b, view.getTop())), Integer.valueOf(f9.b(this.f15996b, view.getWidth())), Integer.valueOf(f9.b(this.f15996b, view.getHeight())));
    }

    public boolean c() {
        if (this.f16621d0) {
            i();
            return false;
        } else if (this.K == null) {
            return false;
        } else {
            long c10 = c(x());
            if (I() && c10 == 0) {
                O();
                return true;
            } else if (!A().m() && !this.V) {
                return true;
            } else {
                i();
                return false;
            }
        }
    }

    public void a(VideoFinishedReason videoFinishedReason) {
        a5 a5Var;
        b6 b6Var;
        a5 a5Var2;
        VideoFinishedReason videoFinishedReason2 = VideoFinishedReason.SKIPPED;
        if (!(videoFinishedReason != videoFinishedReason2 || (b6Var = this.G) == null || (a5Var2 = b6Var.f15656c) == null)) {
            fc.a(a5Var2.f15606a);
            ec.f15801a.a(a5Var2.f15606a.f15795e.c(), "skipped", (JSONObject) null);
        }
        VideoFinishedReason videoFinishedReason3 = VideoFinishedReason.COMPLETE;
        if (videoFinishedReason == videoFinishedReason3) {
            int y10 = y();
            this.f16622e0 = y10;
            e(y10);
            t();
            b6 b6Var2 = this.G;
            if (!(b6Var2 == null || (a5Var = b6Var2.f15656c) == null)) {
                fc.a(a5Var.f15606a);
                ec.f15801a.a(a5Var.f15606a.f15795e.c(), "complete", (JSONObject) null);
            }
        } else {
            VideoPlayerInterface videoPlayerInterface = this.K;
            if (videoPlayerInterface != null) {
                ((NativeVideoPlayer) videoPlayerInterface).f16687h.pause();
            }
        }
        if (videoFinishedReason == videoFinishedReason3 || videoFinishedReason == videoFinishedReason2) {
            if (A().k()) {
                C();
                this.f15997c.f16860b.setVisibility(0);
            } else {
                b();
            }
            this.f16621d0 = true;
            if (A().k()) {
                a(A().i().m(), new VideoTrackingParams(this.f16010p, b(this.f16622e0), this.D, this.f16624g0), this.f16622e0, "postrollImression");
            }
        }
    }

    public void b() {
        super.b();
        if (this.Z) {
            String c10 = A().c();
            if (c10 != null && c10.endsWith(".temp")) {
                new File(c10).delete();
            }
        }
    }

    public final int b(int i10) {
        if (y() > 0) {
            return (i10 * 100) / y();
        }
        return 0;
    }

    public final void e(int i10) {
        List list;
        a5 a5Var;
        if (!this.f16620c0 && this.D <= 0 && i10 != 0) {
            this.f16620c0 = true;
            this.A.c();
            a(A().i().d(), new VideoTrackingParams(this.f16010p, 0, this.D, this.f16624g0), 0, AdSDKNotificationListener.IMPRESSION_EVENT);
            a(A().i().b(), new VideoTrackingParams(this.f16010p, 0, this.D, this.f16624g0), 0, "creativeView");
            b6 b6Var = this.G;
            if (b6Var != null) {
                b6Var.b();
            }
        }
        for (Integer intValue : this.f16628k0.keySet()) {
            int intValue2 = intValue.intValue();
            if (i10 > 0 && i10 >= d(intValue2) && this.f16626i0.get(Integer.valueOf(intValue2)) == null) {
                if (this.f16628k0.containsKey(Integer.valueOf(intValue2))) {
                    List list2 = this.f16628k0.get(Integer.valueOf(intValue2));
                    if (list2 != null) {
                        a((VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]), new VideoProgressTrackingParams(this.f16010p, intValue2, this.D, this.f16624g0), (y() * intValue2) / 100, "fraction");
                    }
                    b6 b6Var2 = this.G;
                    if (b6Var2 != null) {
                        if (intValue2 == 25) {
                            a5 a5Var2 = b6Var2.f15656c;
                            if (a5Var2 != null) {
                                fc.a(a5Var2.f15606a);
                                ec.f15801a.a(a5Var2.f15606a.f15795e.c(), "firstQuartile", (JSONObject) null);
                            }
                        } else if (intValue2 == 50) {
                            a5 a5Var3 = b6Var2.f15656c;
                            if (a5Var3 != null) {
                                fc.a(a5Var3.f15606a);
                                ec.f15801a.a(a5Var3.f15606a.f15795e.c(), "midpoint", (JSONObject) null);
                            }
                        } else if (intValue2 == 75 && (a5Var = b6Var2.f15656c) != null) {
                            fc.a(a5Var.f15606a);
                            ec.f15801a.a(a5Var.f15606a.f15795e.c(), "thirdQuartile", (JSONObject) null);
                        }
                    }
                }
                this.f16626i0.put(Integer.valueOf(intValue2), Boolean.TRUE);
            }
        }
        for (Integer intValue3 : this.f16629l0.keySet()) {
            int intValue4 = intValue3.intValue();
            if (i10 > 0 && i10 >= intValue4 && this.f16627j0.get(Integer.valueOf(intValue4)) == null) {
                if (this.f16629l0.containsKey(Integer.valueOf(intValue4)) && (list = this.f16629l0.get(Integer.valueOf(intValue4))) != null) {
                    a((VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]), new VideoProgressTrackingParams(this.f16010p, intValue4, this.D, this.f16624g0), intValue4, "absolute");
                }
                this.f16627j0.put(Integer.valueOf(intValue4), Boolean.TRUE);
            }
        }
        if (i10 >= d(AdsCommonMetaData.f16770h.G().k())) {
            t();
        }
        if (this.X && i10 >= d(AdsCommonMetaData.f16770h.G().k())) {
            t();
        }
    }

    public void a(View view) {
        VideoAdDetails A;
        List<VerificationDetails> a10;
        s9 s9Var;
        if (MetaData.f17070k.V() && (A = A()) != null && (a10 = A.a()) != null) {
            b6 b6Var = new b6(this.f15723w.getContext(), a10, true);
            this.G = b6Var;
            if (b6Var.c()) {
                try {
                    AdInformationView adInformationView = this.f15997c.f16860b;
                    if (adInformationView != null) {
                        this.G.a(adInformationView, s9.c.OTHER, (String) null);
                    }
                    if (view != null) {
                        this.G.a(view, s9.c.CLOSE_AD, (String) null);
                    }
                    this.G.a(this.f15723w, s9.c.VIDEO_CONTROLS, (String) null);
                    this.G.a(this.N, s9.c.OTHER, (String) null);
                } catch (RuntimeException unused) {
                }
                this.G.a(this.L);
                this.G.e();
                b6 b6Var2 = this.G;
                boolean I = I();
                long z10 = H() ? z() : 0;
                if (b6Var2.f15655b != null && b6Var2.f15658e.compareAndSet(false, true)) {
                    if (I) {
                        s9Var = new s9(true, Float.valueOf((float) z10), true, t9.b.STANDALONE);
                    } else {
                        s9Var = new s9(false, (Float) null, true, t9.b.STANDALONE);
                    }
                    l lVar = b6Var2.f15655b;
                    lVar.getClass();
                    fc.a(lVar.f16075a);
                    fc.c(lVar.f16075a);
                    eb ebVar = lVar.f16075a;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("skippable", s9Var.f16395a);
                        if (s9Var.f16395a) {
                            jSONObject.put("skipOffset", s9Var.f16396b);
                        }
                        jSONObject.put("autoPlay", s9Var.f16397c);
                        jSONObject.put("position", s9Var.f16398d);
                    } catch (JSONException e10) {
                        Log.e("OMIDLIB", "VastProperties: JSON error", e10);
                    }
                    if (!ebVar.f15800j) {
                        ec.f15801a.a(ebVar.f15795e.c(), "publishLoadedEvent", jSONObject);
                        ebVar.f15800j = true;
                        return;
                    }
                    throw new IllegalStateException("Loaded event can only be sent once");
                }
            }
        }
    }

    public void a(VideoPlayerInterface.f fVar) {
        VASTErrorCodes vASTErrorCodes;
        i3 i3Var = new i3(j3.f15952e);
        StringBuilder a10 = p0.a("Video player error: ");
        a10.append(fVar.f16701a);
        i3Var.f15914d = a10.toString();
        i3Var.f15915e = fVar.f16702b;
        i3Var.f15917g = a();
        i3Var.a();
        int ordinal = fVar.f16701a.ordinal();
        boolean z10 = true;
        if (ordinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (ordinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (ordinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        fa faVar = new fa(A().i().e(), new VideoTrackingParams(this.f16010p, b(this.f16622e0), this.D, this.f16624g0), A().j(), this.f16622e0);
        faVar.f15827f = vASTErrorCodes;
        faVar.f15826e = "error";
        VideoUtil.a((Context) this.f15996b, faVar.a());
        if (x() == 0) {
            com.startapp.sdk.adsbase.a.a((Context) this.f15996b, this.f16003i, this.f16010p, this.D, "VIDEO_ERROR", (JSONObject) null);
            if (!this.X) {
                VideoUtil.b(this.f15996b);
            } else if (!fVar.f16701a.equals(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                VideoUtil.b(this.f15996b);
            }
        }
        if (this.f16006l.getType() != Ad.AdType.REWARDED_VIDEO) {
            z10 = false;
        }
        if ((!z10 || this.C) && A().k()) {
            a(VideoFinishedReason.SKIPPED);
            return;
        }
        w();
        b();
    }

    public boolean a(String str, boolean z10) {
        String str2;
        ActionTrackingLink[] actionTrackingLinkArr;
        if (this.f16621d0) {
            str2 = A().d();
        } else {
            str2 = A().b();
        }
        if (!TextUtils.isEmpty(str2)) {
            z10 = true;
            str = str2;
        }
        if (!this.f16621d0) {
            a(VideoFinishedReason.CLICKED);
        }
        boolean z11 = this.f16621d0;
        if (z11) {
            actionTrackingLinkArr = A().i().k();
        } else {
            actionTrackingLinkArr = A().i().h();
        }
        a(actionTrackingLinkArr, new VideoClickedTrackingParams(this.f16010p, b(this.f16622e0), this.D, z11, this.f16624g0), this.f16622e0, "clicked");
        b6 b6Var = this.G;
        if (b6Var != null) {
            t9.a aVar = t9.a.CLICK;
            a5 a5Var = b6Var.f15656c;
            if (a5Var != null) {
                fc.a(a5Var.f15606a);
                JSONObject jSONObject = new JSONObject();
                qb.a(jSONObject, "interactionType", aVar);
                ec.f15801a.a(a5Var.f15606a.f15795e.c(), "adUserInteraction", jSONObject);
            }
        }
        return super.a(str, z10);
    }

    public void a(boolean z10) {
        ActionTrackingLink[] actionTrackingLinkArr;
        if (this.K != null) {
            if (z10) {
                actionTrackingLinkArr = A().i().f();
            } else {
                actionTrackingLinkArr = A().i().g();
            }
            a(actionTrackingLinkArr, new VideoTrackingParams(this.f16010p, b(((NativeVideoPlayer) this.K).f16687h.getCurrentPosition()), this.D, this.f16624g0), ((NativeVideoPlayer) this.K).f16687h.getCurrentPosition(), "sound");
            b6 b6Var = this.G;
            if (b6Var != null) {
                float f10 = z10 ? 0.0f : 1.0f;
                a5 a5Var = b6Var.f15656c;
                if (a5Var != null) {
                    a5Var.a(f10);
                    fc.a(a5Var.f15606a);
                    JSONObject jSONObject = new JSONObject();
                    qb.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
                    qb.a(jSONObject, "deviceVolume", Float.valueOf(kc.a().f16070a));
                    ec.f15801a.a(a5Var.f15606a.f15795e.c(), "volumeChange", jSONObject);
                }
            }
        }
    }

    public final void a(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, int i10, String str) {
        fa faVar = new fa(videoTrackingLinkArr, videoTrackingParams, A().j(), i10);
        faVar.f15826e = str;
        VideoUtil.a((Context) this.f15996b, faVar.a());
    }
}
