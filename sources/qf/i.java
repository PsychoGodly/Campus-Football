package qf;

import android.media.MediaPlayer;
import android.os.Build;
import kotlin.jvm.internal.m;
import pf.a;
import rf.b;

/* compiled from: MediaPlayerPlayer.kt */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private final o f37744a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayer f37745b;

    public i(o oVar) {
        m.e(oVar, "wrappedPlayer");
        this.f37744a = oVar;
        this.f37745b = n(oVar);
    }

    private final MediaPlayer n(o oVar) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new g(oVar));
        mediaPlayer.setOnCompletionListener(new e(oVar));
        mediaPlayer.setOnSeekCompleteListener(new h(oVar));
        mediaPlayer.setOnErrorListener(new f(oVar));
        mediaPlayer.setOnBufferingUpdateListener(new d(oVar));
        oVar.h().i(mediaPlayer);
        return mediaPlayer;
    }

    /* access modifiers changed from: private */
    public static final void o(o oVar, MediaPlayer mediaPlayer) {
        m.e(oVar, "$wrappedPlayer");
        oVar.A();
    }

    /* access modifiers changed from: private */
    public static final void p(o oVar, MediaPlayer mediaPlayer) {
        m.e(oVar, "$wrappedPlayer");
        oVar.y();
    }

    /* access modifiers changed from: private */
    public static final void q(o oVar, MediaPlayer mediaPlayer) {
        m.e(oVar, "$wrappedPlayer");
        oVar.B();
    }

    /* access modifiers changed from: private */
    public static final boolean r(o oVar, MediaPlayer mediaPlayer, int i10, int i11) {
        m.e(oVar, "$wrappedPlayer");
        return oVar.z(i10, i11);
    }

    /* access modifiers changed from: private */
    public static final void s(o oVar, MediaPlayer mediaPlayer, int i10) {
        m.e(oVar, "$wrappedPlayer");
        oVar.x(i10);
    }

    public void a() {
        this.f37745b.prepareAsync();
    }

    public void b(boolean z10) {
        this.f37745b.setLooping(z10);
    }

    public boolean c() {
        return this.f37745b.isPlaying();
    }

    public void d(float f10, float f11) {
        this.f37745b.setVolume(f10, f11);
    }

    public void e(a aVar) {
        m.e(aVar, "context");
        aVar.i(this.f37745b);
        if (aVar.f()) {
            this.f37745b.setWakeMode(this.f37744a.f(), 1);
        }
    }

    public void f(b bVar) {
        m.e(bVar, "source");
        reset();
        bVar.a(this.f37745b);
    }

    public boolean g() {
        Integer duration = getDuration();
        return duration == null || duration.intValue() == 0;
    }

    public Integer getCurrentPosition() {
        return Integer.valueOf(this.f37745b.getCurrentPosition());
    }

    public Integer getDuration() {
        Integer valueOf = Integer.valueOf(this.f37745b.getDuration());
        if (!(valueOf.intValue() == -1)) {
            return valueOf;
        }
        return null;
    }

    public void h(float f10) {
        if (Build.VERSION.SDK_INT >= 23) {
            MediaPlayer mediaPlayer = this.f37745b;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
            return;
        }
        if (f10 == 1.0f) {
            this.f37745b.start();
            return;
        }
        throw new IllegalStateException("Changing the playback rate is only available for Android M/23+ or using LOW_LATENCY mode.".toString());
    }

    public void pause() {
        this.f37745b.pause();
    }

    public void release() {
        this.f37745b.reset();
        this.f37745b.release();
    }

    public void reset() {
        this.f37745b.reset();
    }

    public void seekTo(int i10) {
        this.f37745b.seekTo(i10);
    }

    public void start() {
        h(this.f37744a.o());
    }

    public void stop() {
        this.f37745b.stop();
    }
}
