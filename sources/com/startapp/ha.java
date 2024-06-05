package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* compiled from: Sta */
public class ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoListener f15905a;

    public ha(VideoListener videoListener, Context context) {
        this.f15905a = videoListener;
    }

    public void run() {
        try {
            this.f15905a.onVideoCompleted();
        } catch (Throwable th) {
            j9.a((Object) this.f15905a, th);
        }
    }
}
