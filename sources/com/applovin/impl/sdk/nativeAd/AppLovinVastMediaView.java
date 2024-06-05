package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.ar;
import com.applovin.impl.bq;
import com.applovin.impl.go;
import com.applovin.impl.gq;
import com.applovin.impl.hq;
import com.applovin.impl.kh;
import com.applovin.impl.lq;
import com.applovin.impl.mh;
import com.applovin.impl.mq;
import com.applovin.impl.nh;
import com.applovin.impl.nq;
import com.applovin.impl.od;
import com.applovin.impl.oj;
import com.applovin.impl.p;
import com.applovin.impl.pq;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.r;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t4;
import com.applovin.impl.u5;
import com.applovin.impl.uo;
import com.applovin.impl.up;
import com.applovin.impl.uz;
import com.applovin.impl.wd;
import com.applovin.impl.x3;
import com.applovin.impl.yh;
import com.applovin.impl.yp;
import com.applovin.impl.zj;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber, zp.b {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled = new AtomicBoolean();
    /* access modifiers changed from: private */
    public final AtomicBoolean automaticResumeHandled = new AtomicBoolean();
    private final Handler countdownHandler;
    /* access modifiers changed from: private */
    public final t4 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled = new AtomicBoolean();
    /* access modifiers changed from: private */
    public boolean isVideoMuted = true;
    /* access modifiers changed from: private */
    public boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private long lastVideoPositionFromPauseMillis = -1;
    /* access modifiers changed from: private */
    public final p lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled = new AtomicBoolean();
    /* access modifiers changed from: private */
    public final zj mediaPlayer;
    /* access modifiers changed from: private */
    public ImageView muteButtonImageView;
    /* access modifiers changed from: private */
    public ImageView playPauseButtonImageView;
    /* access modifiers changed from: private */
    public FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    /* access modifiers changed from: private */
    public final bq vastAd;
    /* access modifiers changed from: private */
    public long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified = new AtomicBoolean();
    /* access modifiers changed from: private */
    public final Set<lq> videoProgressTrackers;
    /* access modifiers changed from: private */
    public final com.applovin.exoplayer2.ui.e videoView;
    /* access modifiers changed from: private */
    public boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    /* access modifiers changed from: private */
    public Activity viewActivity;

    class a extends p {
        a() {
        }

        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        public void onActivityResumed(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity) && !AppLovinVastMediaView.this.isVideoPausedByUser) {
                AppLovinVastMediaView.this.maybeHandleResume();
            }
        }
    }

    class b implements t4.b {
        b() {
        }

        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.mediaPlayer.getDuration() - AppLovinVastMediaView.this.mediaPlayer.getCurrentPosition()));
            int access$900 = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
            while (it.hasNext()) {
                lq lqVar = (lq) it.next();
                if (lqVar.a(seconds, access$900)) {
                    hashSet.add(lqVar);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(lqVar);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers((Set<lq>) hashSet);
            if (access$900 >= 25 && access$900 < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().x();
            } else if (access$900 >= 50 && access$900 < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().y();
            } else if (access$900 >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().C();
            }
        }

        public boolean b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    private class c implements View.OnClickListener {
        private c() {
        }

        public void onClick(View view) {
            Uri b10;
            hq k12 = AppLovinVastMediaView.this.vastAd.k1();
            if (k12 != null && (b10 = k12.b()) != null) {
                t tVar = AppLovinVastMediaView.this.logger;
                if (t.a()) {
                    t tVar2 = AppLovinVastMediaView.this.logger;
                    tVar2.a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + b10);
                }
                AppLovinVastMediaView.this.maybeFireTrackers(bq.d.INDUSTRY_ICON_CLICK);
                up.a(b10, view.getContext(), AppLovinVastMediaView.this.sdk);
            }
        }

        /* synthetic */ c(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    private class d implements AppLovinTouchToClickListener.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinNativeAdImpl f11846a;

        public d(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f11846a = appLovinNativeAdImpl;
        }

        public void onClick(View view, MotionEvent motionEvent) {
            Uri j02;
            AppLovinVastMediaView.this.maybeFireTrackers(bq.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().v();
            if (AppLovinVastMediaView.this.vastAd.F0() && (j02 = AppLovinVastMediaView.this.vastAd.j0()) != null) {
                t tVar = AppLovinVastMediaView.this.logger;
                if (t.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.i().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.a(motionEvent, false));
                this.f11846a.handleNativeAdClick(j02, (Uri) null, motionEvent, (!((Boolean) AppLovinVastMediaView.this.sdk.a(oj.N)).booleanValue() || AppLovinVastMediaView.this.viewActivity == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.this.viewActivity);
            }
        }
    }

    private class e implements nh.c, d.e {
        private e() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            AppLovinVastMediaView.this.mediaPlayer.a(0);
        }

        public /* synthetic */ void a(int i10) {
            uz.a(this, i10);
        }

        public /* synthetic */ void a(go goVar, int i10) {
            uz.b(this, goVar, i10);
        }

        public void a(kh khVar) {
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            appLovinVastMediaView.handleMediaError("Video view error (" + zp.a(khVar, AppLovinVastMediaView.this.sdk) + ")");
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
            t tVar = AppLovinVastMediaView.this.logger;
            if (t.a()) {
                t tVar2 = AppLovinVastMediaView.this.logger;
                tVar2.a(AppLovinVastMediaView.TAG, "Player state changed to state " + i10 + " and will play when ready: " + AppLovinVastMediaView.this.mediaPlayer.l());
            }
            if (i10 == 3) {
                AppLovinVastMediaView.this.mediaPlayer.a(AppLovinVastMediaView.this.isVideoMuted ^ true ? 1.0f : 0.0f);
                AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                long unused = appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.getDuration();
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), zp.e(AppLovinVastMediaView.this.sdk));
                t tVar3 = AppLovinVastMediaView.this.logger;
                if (t.a()) {
                    t tVar4 = AppLovinVastMediaView.this.logger;
                    tVar4.a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
                }
                AppLovinVastMediaView.this.countdownManager.b();
            } else if (i10 == 4) {
                t tVar5 = AppLovinVastMediaView.this.logger;
                if (t.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Video completed");
                }
                boolean unused2 = AppLovinVastMediaView.this.videoWasCompleted = true;
                AppLovinVastMediaView.this.finishVideo();
                if (AppLovinVastMediaView.this.replayIconContainer != null) {
                    ar.a((View) AppLovinVastMediaView.this.replayIconContainer, (long) AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, (Runnable) new g(this));
                } else {
                    AppLovinVastMediaView.this.showMediaImageView();
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
                AppLovinVastMediaView.this.videoView.c();
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

        /* synthetic */ e(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    private class f implements View.OnClickListener {
        private f() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            boolean unused = AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.e().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }

        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.mediaPlayer.isPlaying()) {
                    boolean unused = AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                }
                boolean unused2 = AppLovinVastMediaView.this.isVideoPausedByUser = false;
                AppLovinVastMediaView.this.maybeHandleResume();
            } else if (view == AppLovinVastMediaView.this.muteButtonImageView) {
                boolean access$1400 = AppLovinVastMediaView.this.isVideoMuted;
                boolean z10 = !access$1400;
                boolean unused3 = AppLovinVastMediaView.this.isVideoMuted = z10;
                AppLovinVastMediaView.this.mediaPlayer.a(access$1400 ? 1.0f : 0.0f);
                boolean unused4 = AppLovinVastMediaView.this.populateMuteImage(z10);
            } else if (view == AppLovinVastMediaView.this.replayIconContainer) {
                ar.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new h(this));
            }
        }

        /* synthetic */ f(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        super(appLovinNativeAdImpl, kVar, context);
        int i10;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new t4(handler, this.sdk);
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new a();
        bq vastAd2 = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd2;
        boolean G0 = vastAd2.G0();
        this.isVideoStream = G0;
        if (zp.a(oj.f10361n1, kVar)) {
            checkCachedAdResourcesAsync(!G0);
        }
        if (G0) {
            AppLovinCommunicator.getInstance(context).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
        }
        if (vastAd2.q1()) {
            this.industryIconImageView = hq.a(vastAd2.k1().d(), context, kVar);
            int dpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.W4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) kVar.a(oj.Y4)).intValue()));
            this.industryIconImageView.setOnClickListener(new c(this, (a) null));
            addView(this.industryIconImageView);
        }
        if (((Boolean) kVar.a(oj.f10286d5)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) kVar.a(oj.f10278c5)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            f fVar = new f(this, (a) null);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int dpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f10263a5)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2, dpToPx2));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                i10 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.Z4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            } else {
                i10 = 0;
            }
            int dpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f10270b5)).intValue());
            this.videoWidgetLinearLayout.setPadding(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
            int i11 = dpToPx3 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2 + i10 + i11, Math.max(dpToPx2, i10) + i11, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) kVar.a(oj.f10293e5)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new f(this, (a) null));
            ImageView imageView2 = new ImageView(getContext());
            int dpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f10301f5)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(dpToPx4, dpToPx4, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        zj a10 = new zj.b(getContext()).a();
        this.mediaPlayer = a10;
        e eVar = new e(this, (a) null);
        a10.a((nh.c) eVar);
        a10.a(0);
        com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(getContext());
        this.videoView = eVar2;
        eVar2.c();
        eVar2.setControllerVisibilityListener(eVar);
        eVar2.setPlayer(a10);
        eVar2.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.B0, getContext(), new d(appLovinNativeAdImpl)));
        addView(eVar2);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(eVar2);
        hashSet.addAll(vastAd2.a(bq.d.VIDEO, mq.f9827a));
    }

    private void checkCachedAdResourcesAsync(boolean z10) {
        zp.a(z10, (com.applovin.impl.sdk.ad.b) this.vastAd, this.sdk, k.k(), (zp.b) this);
    }

    private void checkCachedAdResourcesImmediately(boolean z10) {
        if (!zp.a(z10, (com.applovin.impl.sdk.ad.b) this.vastAd, this.sdk, getContext()).isEmpty()) {
            handleUnavailableCachedResources();
        }
    }

    /* access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(bq.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.i().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* access modifiers changed from: private */
    public int getVideoPercentViewed() {
        long currentPosition = this.mediaPlayer.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.videoDurationMillis)) * 100.0f);
        }
        return this.savedVideoPercentViewed;
    }

    /* access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (t.a()) {
            this.logger.b(TAG, str);
        }
        maybeFireTrackers(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (t.a()) {
            this.logger.b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() >= this.vastAd.m0() && !this.videoProgressTrackers.isEmpty()) {
            if (t.a()) {
                t tVar = this.logger;
                tVar.k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
            }
            maybeFireTrackers(this.videoProgressTrackers);
        }
    }

    /* access modifiers changed from: private */
    public void maybeFireTrackers(bq.d dVar) {
        maybeFireTrackers(dVar, gq.UNSPECIFIED);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.q1()) {
                maybeFireTrackers(bq.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(bq.d.IMPRESSION);
            maybeFireTrackers(bq.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().g();
            this.vastAd.setHasShown(true);
            this.sdk.i().trackImpression(this.vastAd);
            this.viewActivity = r.a(ar.b((View) this));
            this.sdk.e().a(this.lifecycleCallbacksAdapter);
            this.mediaPlayer.a(true);
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1), (t4.b) new b());
        }
    }

    /* access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(bq.d.VIDEO, "pause");
            this.vastAd.getAdEventTracker().z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(bq.d.VIDEO, "resume");
            this.vastAd.getAdEventTracker().A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (t.a()) {
                    t tVar = this.logger;
                    tVar.a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.mediaPlayer.a(true);
                this.countdownManager.b();
                this.lastVideoPositionFromPauseMillis = -1;
            } else if (t.a()) {
                t tVar2 = this.logger;
                tVar2.a(TAG, "Invalid last video position, isVideoPlaying=" + this.mediaPlayer.isPlaying());
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    private void pauseVideo() {
        if (t.a()) {
            this.logger.a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.mediaPlayer.getCurrentPosition();
        this.mediaPlayer.a(false);
        this.countdownManager.c();
        if (t.a()) {
            t tVar = this.logger;
            tVar.a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    /* access modifiers changed from: private */
    public boolean populateMuteImage(boolean z10) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z10 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return true;
            }
        }
        Uri L = z10 ? this.vastAd.L() : this.vastAd.e0();
        if (L == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, L, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z10) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView != null) {
            imageView.setImageResource(z10 ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
        }
    }

    private void prepareMediaPlayer() {
        if (!zp.a(oj.f10361n1, this.sdk)) {
            checkCachedAdResourcesImmediately(!this.isVideoStream);
        }
        yh a10 = new yh.b(new u5(getContext(), yp.a(getContext(), "com.applovin.sdk"))).a(od.a(this.vastAd.s0()));
        this.mediaPlayer.a(this.isVideoMuted ^ true ? 1.0f : 0.0f);
        this.mediaPlayer.a((wd) a10);
        this.mediaPlayer.b();
        this.mediaPlayer.a(false);
    }

    /* access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() != null) {
            this.imageView.setVisibility(0);
            this.videoView.setVisibility(8);
            LinearLayout linearLayout = this.videoWidgetLinearLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ImageView imageView = this.industryIconImageView;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener((View.OnClickListener) null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener((View.OnClickListener) null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener((View.OnClickListener) null);
        }
        this.videoView.setOnTouchListener((View.OnTouchListener) null);
        this.viewActivity = null;
        this.mediaPlayer.V();
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages((Object) null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
        }
        super.destroy();
    }

    public String getCommunicatorId() {
        return TAG;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeHandleOnAttachedToWindow();
        if (!this.isVideoPausedByUser) {
            maybeHandleResume();
        }
    }

    public void onCachedResourcesChecked(boolean z10) {
        if (!z10) {
            handleUnavailableCachedResources();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        maybeHandlePause();
        super.onDetachedFromWindow();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i10 < 200 || i10 >= 300) && !this.videoWasCompleted && !this.mediaPlayer.isPlaying()) {
                    handleMediaError("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
                }
            }
        }
    }

    private void maybeFireTrackers(bq.d dVar, gq gqVar) {
        maybeFireTrackers(dVar, MaxReward.DEFAULT_LABEL, gqVar);
    }

    private void maybeFireTrackers(bq.d dVar, String str) {
        maybeFireTrackers(dVar, str, gq.UNSPECIFIED);
    }

    private void maybeFireTrackers(bq.d dVar, String str, gq gqVar) {
        maybeFireTrackers((Set<lq>) this.vastAd.a(dVar, str), gqVar);
    }

    private void maybeFireTrackers(Set<lq> set, gq gqVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.mediaPlayer.getCurrentPosition());
            pq p12 = this.vastAd.p1();
            Uri c10 = p12 != null ? p12.c() : null;
            if (t.a()) {
                t tVar = this.logger;
                tVar.a(TAG, "Firing " + set.size() + " tracker(s): " + set);
            }
            nq.a((Set) set, seconds, c10, gqVar, this.sdk);
        }
    }

    /* access modifiers changed from: private */
    public void maybeFireTrackers(Set<lq> set) {
        maybeFireTrackers(set, gq.UNSPECIFIED);
    }
}
