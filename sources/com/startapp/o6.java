package com.startapp;

import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* compiled from: Sta */
public class o6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16225a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f16226b;

    public o6(d dVar, int i10) {
        this.f16226b = dVar;
        this.f16225a = i10;
    }

    public void run() {
        VideoPlayerInterface.a aVar = this.f16226b.f16662b;
        if (aVar != null) {
            ((oa) aVar).a(this.f16225a);
        }
    }
}
