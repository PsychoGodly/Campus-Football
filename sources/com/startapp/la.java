package com.startapp;

import android.widget.VideoView;
import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class la implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f16122a;

    public la(VideoMode videoMode) {
        this.f16122a = videoMode;
    }

    public void run() {
        VideoView videoView;
        VideoMode videoMode = this.f16122a;
        if (videoMode.K != null && (videoView = videoMode.L) != null) {
            videoMode.D++;
            videoView.setVisibility(0);
            boolean unused = this.f16122a.f16621d0 = false;
            VideoMode videoMode2 = this.f16122a;
            videoMode2.getClass();
            j9.a(videoMode2.f15723w, true, "videoApi.setVideoCurrentPosition", 0);
            j9.a(videoMode2.f15723w, true, "videoApi.setSkipTimer", 0);
            this.f16122a.K();
        }
    }
}
