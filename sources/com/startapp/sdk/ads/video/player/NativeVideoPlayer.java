package com.startapp.sdk.ads.video.player;

import android.media.MediaPlayer;
import android.os.Build;
import android.widget.VideoView;
import com.startapp.a5;
import com.startapp.b6;
import com.startapp.ec;
import com.startapp.fc;
import com.startapp.i3;
import com.startapp.ma;
import com.startapp.na;
import com.startapp.oa;
import com.startapp.pa;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.i;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import org.json.JSONObject;

/* compiled from: Sta */
public class NativeVideoPlayer extends a implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: g  reason: collision with root package name */
    public MediaPlayer f16686g;

    /* renamed from: h  reason: collision with root package name */
    public final VideoView f16687h;

    /* compiled from: Sta */
    public enum MediaErrorExtra {
        MEDIA_ERROR_IO,
        MEDIA_ERROR_MALFORMED,
        MEDIA_ERROR_UNSUPPORTED,
        MEDIA_ERROR_TIMED_OUT
    }

    /* compiled from: Sta */
    public enum MediaErrorType {
        MEDIA_ERROR_UNKNOWN,
        MEDIA_ERROR_SERVER_DIED
    }

    /* compiled from: Sta */
    public class a implements MediaPlayer.OnBufferingUpdateListener {
        public a() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            VideoPlayerInterface.a aVar = NativeVideoPlayer.this.f16709f;
            if (aVar != null) {
                ((oa) aVar).a(i10);
            }
        }
    }

    public NativeVideoPlayer(VideoView videoView) {
        this.f16687h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public void a(String str) {
        this.f16704a = str;
        if (str != null) {
            try {
                this.f16687h.setVideoPath(str);
            } catch (Throwable th) {
                i3.a(th);
                onError(this.f16686g, 1, 0);
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoPlayerInterface.b bVar = this.f16707d;
        if (bVar != null) {
            ((i) bVar).a();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        MediaErrorType mediaErrorType;
        VideoPlayerInterface.VideoPlayerErrorType videoPlayerErrorType;
        MediaErrorExtra mediaErrorExtra;
        if (this.f16706c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        VideoPlayerInterface.c cVar = this.f16706c;
        if (i10 == 100) {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_SERVER_DIED;
        } else {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_UNKNOWN;
        }
        if (mediaErrorType == MediaErrorType.MEDIA_ERROR_SERVER_DIED) {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.SERVER_DIED;
        } else {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.UNKNOWN;
        }
        if (i11 == -1010) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED;
        } else if (i11 == -1007) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_MALFORMED;
        } else if (i11 != -110) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_IO;
        } else {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_TIMED_OUT;
        }
        String str = mediaErrorExtra.toString();
        VideoPlayerInterface.f fVar = new VideoPlayerInterface.f(videoPlayerErrorType, str, currentPosition);
        pa paVar = (pa) cVar;
        VideoMode videoMode = paVar.f16266a;
        if (videoMode.K != null) {
            if (!videoMode.X || videoMode.f16618a0 > videoMode.f16619b0 || currentPosition <= 0 || !str.equals("MEDIA_ERROR_IO")) {
                paVar.f16266a.a(fVar);
            } else {
                VideoMode videoMode2 = paVar.f16266a;
                videoMode2.f16618a0++;
                videoMode2.L();
                VideoMode videoMode3 = paVar.f16266a;
                ((NativeVideoPlayer) videoMode3.K).a(videoMode3.A().c());
                ((NativeVideoPlayer) paVar.f16266a.K).a(fVar.f16703c);
            }
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        a5 a5Var;
        this.f16686g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        VideoPlayerInterface.d dVar = this.f16705b;
        if (dVar != null) {
            na naVar = (na) dVar;
            VideoMode videoMode = naVar.f16186a;
            int i10 = videoMode.f16622e0;
            if (i10 > 0) {
                VideoPlayerInterface videoPlayerInterface = videoMode.K;
                if (videoPlayerInterface != null) {
                    ((NativeVideoPlayer) videoPlayerInterface).a(i10);
                }
                VideoMode videoMode2 = naVar.f16186a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                b6 b6Var = videoMode2.G;
                if (!(b6Var == null || (a5Var = b6Var.f15656c) == null)) {
                    fc.a(a5Var.f15606a);
                    ec.f15801a.a(a5Var.f15606a.f15795e.c(), "resume", (JSONObject) null);
                }
                videoMode2.a(videoMode2.A().i().n(), new VideoPausedTrackingParams(videoMode2.f16010p, videoMode2.b(videoMode2.f16622e0), videoMode2.D, videoMode2.T, pauseOrigin, videoMode2.f16624g0), videoMode2.f16622e0, "resumed");
                videoMode2.T++;
            } else if (videoMode.E()) {
                naVar.f16186a.M();
            }
        }
        if (com.startapp.sdk.adsbase.a.c(this.f16704a) && (mediaPlayer2 = this.f16686g) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new a());
        } else if (!com.startapp.sdk.adsbase.a.c(this.f16704a)) {
            d.b.f16664a.f16662b = this.f16709f;
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        VideoPlayerInterface.e eVar = this.f16708e;
        if (eVar != null) {
            ((ma) eVar).f16144a.M();
        }
    }

    public void a(int i10) {
        try {
            MediaPlayer mediaPlayer = this.f16686g;
            if (mediaPlayer == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                mediaPlayer.seekTo((long) i10, 3);
            } else {
                mediaPlayer.seekTo(i10);
            }
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    public boolean a() {
        return this.f16686g != null;
    }
}
