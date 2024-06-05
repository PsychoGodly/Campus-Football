package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class ja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f15987a;

    public ja(VideoMode videoMode) {
        this.f15987a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f15987a;
        if (videoMode.K != null) {
            boolean unused = videoMode.P = !videoMode.P;
            this.f15987a.J();
            VideoMode videoMode2 = this.f15987a;
            videoMode2.a(videoMode2.P);
        }
    }
}
