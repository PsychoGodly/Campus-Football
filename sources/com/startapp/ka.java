package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class ka implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f16068a;

    public ka(VideoMode videoMode) {
        this.f16068a = videoMode;
    }

    public void run() {
        VideoMode videoMode = this.f16068a;
        if (videoMode.K != null) {
            videoMode.O();
        }
    }
}
