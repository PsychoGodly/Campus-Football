package com.startapp.sdk.ads.video;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* compiled from: Sta */
public class i implements VideoPlayerInterface.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f16678a;

    public i(VideoMode videoMode) {
        this.f16678a = videoMode;
    }

    public void a() {
        VideoMode videoMode = this.f16678a;
        if (!videoMode.f16621d0) {
            videoMode.a(VideoMode.VideoFinishedReason.COMPLETE);
        }
        VideoPlayerInterface videoPlayerInterface = this.f16678a.K;
        if (videoPlayerInterface != null) {
            ((NativeVideoPlayer) videoPlayerInterface).f16687h.stopPlayback();
        }
    }
}
