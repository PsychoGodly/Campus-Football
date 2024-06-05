package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* compiled from: Sta */
public class oa implements VideoPlayerInterface.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f16232a;

    public oa(VideoMode videoMode) {
        this.f16232a = videoMode;
    }

    public void a(int i10) {
        VideoMode videoMode;
        VideoPlayerInterface videoPlayerInterface;
        VideoPlayerInterface videoPlayerInterface2 = this.f16232a.K;
        int duration = videoPlayerInterface2 != null ? ((NativeVideoPlayer) videoPlayerInterface2).f16687h.getDuration() : 0;
        VideoMode videoMode2 = this.f16232a;
        if (videoMode2.X && duration > 0 && videoMode2.F()) {
            VideoMode videoMode3 = this.f16232a;
            videoMode3.W = i10;
            int currentPosition = (((NativeVideoPlayer) videoMode3.K).f16687h.getCurrentPosition() * 100) / duration;
            if (this.f16232a.G()) {
                VideoMode videoMode4 = this.f16232a;
                if (videoMode4.Y || !videoMode4.E()) {
                    int i11 = this.f16232a.W;
                    if (i11 == 100 || i11 - currentPosition > AdsCommonMetaData.f16770h.G().h()) {
                        VideoMode videoMode5 = this.f16232a;
                        VideoPlayerInterface videoPlayerInterface3 = videoMode5.K;
                        if (videoPlayerInterface3 != null) {
                            ((NativeVideoPlayer) videoPlayerInterface3).f16687h.start();
                            videoMode5.f15723w.setBackgroundColor(33554431);
                        }
                        videoMode5.N();
                        return;
                    }
                    return;
                }
                this.f16232a.M();
                return;
            }
            int i12 = this.f16232a.W;
            if (i12 < 100 && i12 - currentPosition <= AdsCommonMetaData.f16770h.G().i() && (videoPlayerInterface = videoMode.K) != null) {
                ((NativeVideoPlayer) videoPlayerInterface).f16687h.pause();
                (videoMode = this.f16232a).L();
            }
        }
    }
}
